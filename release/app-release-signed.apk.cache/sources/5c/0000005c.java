package android.support.p001v4.app;

import android.arch.lifecycle.AbstractC0009c;
import android.arch.lifecycle.C0026n;
import android.arch.lifecycle.InterfaceC0027o;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p001v4.app.C0060a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p015n.C0463l;

/* renamed from: android.support.v4.app.h */
/* loaded from: classes.dex */
public class ActivityC0079h extends AbstractActivityC0072f implements InterfaceC0027o {

    /* renamed from: h */
    private C0026n f453h;

    /* renamed from: i */
    boolean f454i;

    /* renamed from: j */
    boolean f455j;

    /* renamed from: m */
    boolean f458m;

    /* renamed from: n */
    int f459n;

    /* renamed from: o */
    C0463l<String> f460o;

    /* renamed from: f */
    final Handler f451f = new HandlerC0080a();

    /* renamed from: g */
    final C0084j f452g = C0084j.m2068b(new C0081b());

    /* renamed from: k */
    boolean f456k = true;

    /* renamed from: l */
    boolean f457l = true;

    /* renamed from: android.support.v4.app.h$a */
    /* loaded from: classes.dex */
    class HandlerC0080a extends Handler {
        HandlerC0080a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ActivityC0079h activityC0079h = ActivityC0079h.this;
                if (activityC0079h.f456k) {
                    activityC0079h.m2082i(false);
                }
            } else if (i != 2) {
                super.handleMessage(message);
            } else {
                ActivityC0079h.this.m2075p();
                ActivityC0079h.this.f452g.m2050t();
            }
        }
    }

    /* renamed from: android.support.v4.app.h$b */
    /* loaded from: classes.dex */
    class C0081b extends AbstractC0085k<ActivityC0079h> {
        public C0081b() {
            super(ActivityC0079h.this);
        }

        @Override // android.support.p001v4.app.AbstractC0083i
        /* renamed from: b */
        public View mo2072b(int i) {
            return ActivityC0079h.this.findViewById(i);
        }

        @Override // android.support.p001v4.app.AbstractC0083i
        /* renamed from: c */
        public boolean mo2071c() {
            Window window = ActivityC0079h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: h */
        public void mo2039h(ComponentCallbacksC0073g componentCallbacksC0073g) {
            ActivityC0079h.this.m2078m(componentCallbacksC0073g);
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: i */
        public void mo2038i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0079h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: j */
        public LayoutInflater mo2037j() {
            return ActivityC0079h.this.getLayoutInflater().cloneInContext(ActivityC0079h.this);
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: k */
        public int mo2036k() {
            Window window = ActivityC0079h.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: l */
        public boolean mo2035l() {
            return ActivityC0079h.this.getWindow() != null;
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: m */
        public boolean mo2034m(ComponentCallbacksC0073g componentCallbacksC0073g) {
            return !ActivityC0079h.this.isFinishing();
        }

        @Override // android.support.p001v4.app.AbstractC0085k
        /* renamed from: n */
        public void mo2033n() {
            ActivityC0079h.this.mo285r();
        }
    }

    /* renamed from: android.support.v4.app.h$c */
    /* loaded from: classes.dex */
    static final class C0082c {

        /* renamed from: a */
        Object f463a;

        /* renamed from: b */
        C0026n f464b;

        /* renamed from: c */
        C0104n f465c;

        C0082c() {
        }
    }

    /* renamed from: k */
    private void m2080k() {
        do {
        } while (m2079l(m2081j(), AbstractC0009c.EnumC0011b.CREATED));
    }

    /* renamed from: l */
    private static boolean m2079l(AbstractC0086l abstractC0086l, AbstractC0009c.EnumC0011b enumC0011b) {
        boolean z = false;
        for (ComponentCallbacksC0073g componentCallbacksC0073g : abstractC0086l.mo1962b()) {
            if (componentCallbacksC0073g != null) {
                if (componentCallbacksC0073g.mo1819a().mo2379a().m2380a(AbstractC0009c.EnumC0011b.STARTED)) {
                    componentCallbacksC0073g.f406S.m2371i(enumC0011b);
                    z = true;
                }
                AbstractC0086l m2105t0 = componentCallbacksC0073g.m2105t0();
                if (m2105t0 != null) {
                    z |= m2079l(m2105t0, enumC0011b);
                }
            }
        }
        return z;
    }

    @Override // android.support.p001v4.app.ActivityC0130z, android.arch.lifecycle.InterfaceC0013e
    /* renamed from: a */
    public AbstractC0009c mo1819a() {
        return super.mo1819a();
    }

    @Override // android.arch.lifecycle.InterfaceC0027o
    /* renamed from: b */
    public C0026n mo2084b() {
        if (getApplication() != null) {
            if (this.f453h == null) {
                this.f453h = new C0026n();
            }
            return this.f453h;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f454i);
        printWriter.print(" mResumed=");
        printWriter.print(this.f455j);
        printWriter.print(" mStopped=");
        printWriter.print(this.f456k);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f457l);
        AbstractC0125u.m1829b(this).mo1830a(str2, fileDescriptor, printWriter, strArr);
        this.f452g.m2048v().mo1965a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0071e
    /* renamed from: h */
    final View mo2083h(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f452g.m2046x(view, str, context, attributeSet);
    }

    /* renamed from: i */
    void m2082i(boolean z) {
        if (this.f457l) {
            return;
        }
        this.f457l = true;
        this.f458m = z;
        this.f451f.removeMessages(1);
        m2076o();
    }

    /* renamed from: j */
    public AbstractC0086l m2081j() {
        return this.f452g.m2048v();
    }

    /* renamed from: m */
    public void m2078m(ComponentCallbacksC0073g componentCallbacksC0073g) {
    }

    /* renamed from: n */
    protected boolean m2077n(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: o */
    void m2076o() {
        this.f452g.m2054p();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f452g.m2047w();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0060a.InterfaceC0061a m2226e = C0060a.m2226e();
            if (m2226e == null || !m2226e.m2225a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String m482f = this.f460o.m482f(i4);
        this.f460o.m478j(i4);
        if (m482f == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        ComponentCallbacksC0073g m2049u = this.f452g.m2049u(m482f);
        if (m2049u != null) {
            m2049u.m2169O(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m482f);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0086l m2048v = this.f452g.m2048v();
        boolean mo1959c = m2048v.mo1959c();
        if (!mo1959c || Build.VERSION.SDK_INT > 25) {
            if (mo1959c || !m2048v.mo1956d()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f452g.m2047w();
        this.f452g.m2066d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f452g.m2069a(null);
        super.onCreate(bundle);
        C0082c c0082c = (C0082c) getLastNonConfigurationInstance();
        if (c0082c != null) {
            this.f453h = c0082c.f464b;
        }
        if (bundle != null) {
            this.f452g.m2045y(bundle.getParcelable("android:support:fragments"), c0082c != null ? c0082c.f465c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f459n = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f460o = new C0463l<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f460o.m479i(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f460o == null) {
            this.f460o = new C0463l<>();
            this.f459n = 0;
        }
        this.f452g.m2064f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f452g.m2063g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0071e, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0071e, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m2082i(false);
        C0026n c0026n = this.f453h;
        if (c0026n != null && !this.f458m) {
            c0026n.m2352a();
        }
        this.f452g.m2062h();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f452g.m2061i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.f452g.m2065e(menuItem);
        }
        return this.f452g.m2059k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f452g.m2060j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f452g.m2047w();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f452g.m2058l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f455j = false;
        if (this.f451f.hasMessages(2)) {
            this.f451f.removeMessages(2);
            m2075p();
        }
        this.f452g.m2057m();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f452g.m2056n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f451f.removeMessages(2);
        m2075p();
        this.f452g.m2050t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m2077n(view, menu) | this.f452g.m2055o(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f452g.m2047w();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m482f = this.f460o.m482f(i3);
            this.f460o.m478j(i3);
            if (m482f == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0073g m2049u = this.f452g.m2049u(m482f);
            if (m2049u != null) {
                m2049u.m2119m0(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m482f);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f451f.sendEmptyMessage(2);
        this.f455j = true;
        this.f452g.m2050t();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.f456k) {
            m2082i(true);
        }
        Object m2074q = m2074q();
        C0104n m2044z = this.f452g.m2044z();
        if (m2044z == null && this.f453h == null && m2074q == null) {
            return null;
        }
        C0082c c0082c = new C0082c();
        c0082c.f463a = m2074q;
        c0082c.f464b = this.f453h;
        c0082c.f465c = m2044z;
        return c0082c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2080k();
        Parcelable m2070A = this.f452g.m2070A();
        if (m2070A != null) {
            bundle.putParcelable("android:support:fragments", m2070A);
        }
        if (this.f460o.m477k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f459n);
            int[] iArr = new int[this.f460o.m477k()];
            String[] strArr = new String[this.f460o.m477k()];
            for (int i = 0; i < this.f460o.m477k(); i++) {
                iArr[i] = this.f460o.m480h(i);
                strArr[i] = this.f460o.m476l(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f456k = false;
        this.f457l = false;
        this.f451f.removeMessages(1);
        if (!this.f454i) {
            this.f454i = true;
            this.f452g.m2067c();
        }
        this.f452g.m2047w();
        this.f452g.m2050t();
        this.f452g.m2052r();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f452g.m2047w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f456k = true;
        m2080k();
        this.f451f.sendEmptyMessage(1);
        this.f452g.m2051s();
    }

    /* renamed from: p */
    protected void m2075p() {
        this.f452g.m2053q();
    }

    /* renamed from: q */
    public Object m2074q() {
        return null;
    }

    @Deprecated
    /* renamed from: r */
    public void mo285r() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f385e && i != -1) {
            AbstractActivityC0071e.m2198g(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0072f, android.app.Activity
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0071e, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.support.p001v4.app.AbstractActivityC0072f, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}