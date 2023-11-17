package r;

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
import r.e;
import v.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends i {
    private int V;
    private boolean W;
    private boolean X;
    private b Y;

    /* loaded from: classes.dex */
    class a extends e.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f1741d, callback);
            v.b s0 = g.this.s0(aVar);
            if (s0 != null) {
                return aVar.e(s0);
            }
            return null;
        }

        @Override // v.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return g.this.y0() ? a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private n f1760a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1761b;

        /* renamed from: c  reason: collision with root package name */
        private BroadcastReceiver f1762c;

        /* renamed from: d  reason: collision with root package name */
        private IntentFilter f1763d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b.this.b();
            }
        }

        b(n nVar) {
            this.f1760a = nVar;
            this.f1761b = nVar.d();
        }

        final void a() {
            BroadcastReceiver broadcastReceiver = this.f1762c;
            if (broadcastReceiver != null) {
                g.this.f1741d.unregisterReceiver(broadcastReceiver);
                this.f1762c = null;
            }
        }

        final void b() {
            boolean d2 = this.f1760a.d();
            if (d2 != this.f1761b) {
                this.f1761b = d2;
                g.this.d();
            }
        }

        final int c() {
            boolean d2 = this.f1760a.d();
            this.f1761b = d2;
            return d2 ? 2 : 1;
        }

        final void d() {
            a();
            if (this.f1762c == null) {
                this.f1762c = new a();
            }
            if (this.f1763d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f1763d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f1763d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1763d.addAction("android.intent.action.TIME_TICK");
            }
            g.this.f1741d.registerReceiver(this.f1762c, this.f1763d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.V = -100;
        this.X = true;
    }

    private boolean A0() {
        if (this.W) {
            Context context = this.f1741d;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f1741d;
                    return (packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean B0(int i2) {
        Resources resources = this.f1741d.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        int i4 = i2 == 2 ? 32 : 16;
        if (i3 != i4) {
            if (A0()) {
                ((Activity) this.f1741d).recreate();
                return true;
            }
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, displayMetrics);
            if (Build.VERSION.SDK_INT < 26) {
                l.a(resources);
                return true;
            }
            return true;
        }
        return false;
    }

    private void w0() {
        if (this.Y == null) {
            this.Y = new b(n.a(this.f1741d));
        }
    }

    private int x0() {
        int i2 = this.V;
        return i2 != -100 ? i2 : d.i();
    }

    @Override // r.e
    Window.Callback M(Window.Callback callback) {
        return new a(callback);
    }

    @Override // r.i
    View O(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    @Override // r.e, r.d
    public boolean d() {
        int x0 = x0();
        int z0 = z0(x0);
        boolean B0 = z0 != -1 ? B0(z0) : false;
        if (x0 == 0) {
            w0();
            this.Y.d();
        }
        this.W = true;
        return B0;
    }

    @Override // r.i, r.d
    public void p(Bundle bundle) {
        super.p(bundle);
        if (bundle == null || this.V != -100) {
            return;
        }
        this.V = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // r.i, r.e, r.d
    public void q() {
        super.q();
        b bVar = this.Y;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // r.e, r.d
    public void t(Bundle bundle) {
        super.t(bundle);
        int i2 = this.V;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    @Override // r.e, r.d
    public void u() {
        super.u();
        d();
    }

    @Override // r.i, r.d
    public void v() {
        super.v();
        b bVar = this.Y;
        if (bVar != null) {
            bVar.a();
        }
    }

    public boolean y0() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z0(int i2) {
        if (i2 != -100) {
            if (i2 != 0) {
                return i2;
            }
            w0();
            return this.Y.c();
        }
        return -1;
    }
}