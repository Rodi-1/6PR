package p019r;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import p019r.AbstractC0532e;
import p023v.AbstractC0585b;
import p023v.C0590f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.g */
/* loaded from: classes.dex */
public class C0537g extends LayoutInflater$Factory2C0543i {

    /* renamed from: V */
    private int f2277V;

    /* renamed from: W */
    private boolean f2278W;

    /* renamed from: X */
    private boolean f2279X;

    /* renamed from: Y */
    private C0539b f2280Y;

    /* renamed from: r.g$a */
    /* loaded from: classes.dex */
    class C0538a extends AbstractC0532e.C0534b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0538a(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode m254a(ActionMode.Callback callback) {
            C0590f.C0591a c0591a = new C0590f.C0591a(C0537g.this.f2259d, callback);
            AbstractC0585b m201s0 = C0537g.this.m201s0(c0591a);
            if (m201s0 != null) {
                return c0591a.m55e(m201s0);
            }
            return null;
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0537g.this.m255y0() ? m254a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.g$b */
    /* loaded from: classes.dex */
    public final class C0539b {

        /* renamed from: a */
        private C0562n f2282a;

        /* renamed from: b */
        private boolean f2283b;

        /* renamed from: c */
        private BroadcastReceiver f2284c;

        /* renamed from: d */
        private IntentFilter f2285d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r.g$b$a */
        /* loaded from: classes.dex */
        public class C0540a extends BroadcastReceiver {
            C0540a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C0539b.this.m252b();
            }
        }

        C0539b(C0562n c0562n) {
            this.f2282a = c0562n;
            this.f2283b = c0562n.m145d();
        }

        /* renamed from: a */
        final void m253a() {
            BroadcastReceiver broadcastReceiver = this.f2284c;
            if (broadcastReceiver != null) {
                C0537g.this.f2259d.unregisterReceiver(broadcastReceiver);
                this.f2284c = null;
            }
        }

        /* renamed from: b */
        final void m252b() {
            boolean m145d = this.f2282a.m145d();
            if (m145d != this.f2283b) {
                this.f2283b = m145d;
                C0537g.this.mo260d();
            }
        }

        /* renamed from: c */
        final int m251c() {
            boolean m145d = this.f2282a.m145d();
            this.f2283b = m145d;
            return m145d ? 2 : 1;
        }

        /* renamed from: d */
        final void m250d() {
            m253a();
            if (this.f2284c == null) {
                this.f2284c = new C0540a();
            }
            if (this.f2285d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f2285d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f2285d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f2285d.addAction("android.intent.action.TIME_TICK");
            }
            C0537g.this.f2259d.registerReceiver(this.f2284c, this.f2285d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0537g(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        super(context, window, interfaceC0530c);
        this.f2277V = -100;
        this.f2279X = true;
    }

    /* renamed from: A0 */
    private boolean m262A0() {
        if (this.f2278W) {
            Context context = this.f2259d;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f2259d;
                    return (packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B0 */
    private boolean m261B0(int i) {
        Resources resources = this.f2259d.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 != i3) {
            if (m262A0()) {
                ((Activity) this.f2259d).recreate();
                return true;
            }
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, displayMetrics);
            if (Build.VERSION.SDK_INT < 26) {
                C0560l.m155a(resources);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    private void m257w0() {
        if (this.f2280Y == null) {
            this.f2280Y = new C0539b(C0562n.m148a(this.f2259d));
        }
    }

    /* renamed from: x0 */
    private int m256x0() {
        int i = this.f2277V;
        return i != -100 ? i : AbstractC0531d.m273i();
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: M */
    Window.Callback mo249M(Window.Callback callback) {
        return new C0538a(callback);
    }

    @Override // p019r.LayoutInflater$Factory2C0543i
    /* renamed from: O */
    View mo240O(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    @Override // p019r.AbstractC0532e, p019r.AbstractC0531d
    /* renamed from: d */
    public boolean mo260d() {
        int m256x0 = m256x0();
        int mo248z0 = mo248z0(m256x0);
        boolean m261B0 = mo248z0 != -1 ? m261B0(mo248z0) : false;
        if (m256x0 == 0) {
            m257w0();
            this.f2280Y.m250d();
        }
        this.f2278W = true;
        return m261B0;
    }

    @Override // p019r.LayoutInflater$Factory2C0543i, p019r.AbstractC0531d
    /* renamed from: p */
    public void mo208p(Bundle bundle) {
        super.mo208p(bundle);
        if (bundle == null || this.f2277V != -100) {
            return;
        }
        this.f2277V = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // p019r.LayoutInflater$Factory2C0543i, p019r.AbstractC0532e, p019r.AbstractC0531d
    /* renamed from: q */
    public void mo206q() {
        super.mo206q();
        C0539b c0539b = this.f2280Y;
        if (c0539b != null) {
            c0539b.m253a();
        }
    }

    @Override // p019r.AbstractC0532e, p019r.AbstractC0531d
    /* renamed from: t */
    public void mo259t(Bundle bundle) {
        super.mo259t(bundle);
        int i = this.f2277V;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // p019r.AbstractC0532e, p019r.AbstractC0531d
    /* renamed from: u */
    public void mo258u() {
        super.mo258u();
        mo260d();
    }

    @Override // p019r.LayoutInflater$Factory2C0543i, p019r.AbstractC0531d
    /* renamed from: v */
    public void mo198v() {
        super.mo198v();
        C0539b c0539b = this.f2280Y;
        if (c0539b != null) {
            c0539b.m253a();
        }
    }

    /* renamed from: y0 */
    public boolean m255y0() {
        return this.f2279X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public int mo248z0(int i) {
        if (i != -100) {
            if (i != 0) {
                return i;
            }
            m257w0();
            return this.f2280Y.m251c();
        }
        return -1;
    }
}