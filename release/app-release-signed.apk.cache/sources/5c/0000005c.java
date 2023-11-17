package android.support.v4.app;

import android.arch.lifecycle.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class h extends f implements android.arch.lifecycle.o {

    /* renamed from: h  reason: collision with root package name */
    private android.arch.lifecycle.n f323h;

    /* renamed from: i  reason: collision with root package name */
    boolean f324i;

    /* renamed from: j  reason: collision with root package name */
    boolean f325j;

    /* renamed from: m  reason: collision with root package name */
    boolean f328m;

    /* renamed from: n  reason: collision with root package name */
    int f329n;

    /* renamed from: o  reason: collision with root package name */
    n.l<String> f330o;

    /* renamed from: f  reason: collision with root package name */
    final Handler f321f = new a();

    /* renamed from: g  reason: collision with root package name */
    final j f322g = j.b(new b());

    /* renamed from: k  reason: collision with root package name */
    boolean f326k = true;

    /* renamed from: l  reason: collision with root package name */
    boolean f327l = true;

    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                h hVar = h.this;
                if (hVar.f326k) {
                    hVar.i(false);
                }
            } else if (i2 != 2) {
                super.handleMessage(message);
            } else {
                h.this.p();
                h.this.f322g.t();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends k<h> {
        public b() {
            super(h.this);
        }

        @Override // android.support.v4.app.i
        public View b(int i2) {
            return h.this.findViewById(i2);
        }

        @Override // android.support.v4.app.i
        public boolean c() {
            Window window = h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.v4.app.k
        public void h(g gVar) {
            h.this.m(gVar);
        }

        @Override // android.support.v4.app.k
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.k
        public LayoutInflater j() {
            return h.this.getLayoutInflater().cloneInContext(h.this);
        }

        @Override // android.support.v4.app.k
        public int k() {
            Window window = h.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.k
        public boolean l() {
            return h.this.getWindow() != null;
        }

        @Override // android.support.v4.app.k
        public boolean m(g gVar) {
            return !h.this.isFinishing();
        }

        @Override // android.support.v4.app.k
        public void n() {
            h.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        Object f333a;

        /* renamed from: b  reason: collision with root package name */
        android.arch.lifecycle.n f334b;

        /* renamed from: c  reason: collision with root package name */
        n f335c;

        c() {
        }
    }

    private void k() {
        do {
        } while (l(j(), c.b.CREATED));
    }

    private static boolean l(l lVar, c.b bVar) {
        boolean z = false;
        for (g gVar : lVar.b()) {
            if (gVar != null) {
                if (gVar.a().a().a(c.b.STARTED)) {
                    gVar.S.i(bVar);
                    z = true;
                }
                l t0 = gVar.t0();
                if (t0 != null) {
                    z |= l(t0, bVar);
                }
            }
        }
        return z;
    }

    @Override // android.support.v4.app.z, android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return super.a();
    }

    @Override // android.arch.lifecycle.o
    public android.arch.lifecycle.n b() {
        if (getApplication() != null) {
            if (this.f323h == null) {
                this.f323h = new android.arch.lifecycle.n();
            }
            return this.f323h;
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
        printWriter.print(this.f324i);
        printWriter.print(" mResumed=");
        printWriter.print(this.f325j);
        printWriter.print(" mStopped=");
        printWriter.print(this.f326k);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f327l);
        u.b(this).a(str2, fileDescriptor, printWriter, strArr);
        this.f322g.v().a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.support.v4.app.e
    final View h(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f322g.x(view, str, context, attributeSet);
    }

    void i(boolean z) {
        if (this.f327l) {
            return;
        }
        this.f327l = true;
        this.f328m = z;
        this.f321f.removeMessages(1);
        o();
    }

    public l j() {
        return this.f322g.v();
    }

    public void m(g gVar) {
    }

    protected boolean n(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    void o() {
        this.f322g.p();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f322g.w();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            a.InterfaceC0004a e2 = android.support.v4.app.a.e();
            if (e2 == null || !e2.a(this, i2, i3, intent)) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            return;
        }
        int i5 = i4 - 1;
        String f2 = this.f330o.f(i5);
        this.f330o.j(i5);
        if (f2 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        g u2 = this.f322g.u(f2);
        if (u2 != null) {
            u2.O(i2 & 65535, i3, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        l v2 = this.f322g.v();
        boolean c2 = v2.c();
        if (!c2 || Build.VERSION.SDK_INT > 25) {
            if (c2 || !v2.d()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f322g.w();
        this.f322g.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.z, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f322g.a(null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            this.f323h = cVar.f334b;
        }
        if (bundle != null) {
            this.f322g.y(bundle.getParcelable("android:support:fragments"), cVar != null ? cVar.f335c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f329n = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f330o = new n.l<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f330o.i(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f330o == null) {
            this.f330o = new n.l<>();
            this.f329n = 0;
        }
        this.f322g.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f322g.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.support.v4.app.e, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.e, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i(false);
        android.arch.lifecycle.n nVar = this.f323h;
        if (nVar != null && !this.f328m) {
            nVar.a();
        }
        this.f322g.h();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f322g.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            if (i2 != 6) {
                return false;
            }
            return this.f322g.e(menuItem);
        }
        return this.f322g.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f322g.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f322g.w();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f322g.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f325j = false;
        if (this.f321f.hasMessages(2)) {
            this.f321f.removeMessages(2);
            p();
        }
        this.f322g.m();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f322g.n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f321f.removeMessages(2);
        p();
        this.f322g.t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return (i2 != 0 || menu == null) ? super.onPreparePanel(i2, view, menu) : n(view, menu) | this.f322g.o(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f322g.w();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f2 = this.f330o.f(i4);
            this.f330o.j(i4);
            if (f2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            g u2 = this.f322g.u(f2);
            if (u2 != null) {
                u2.m0(i2 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f321f.sendEmptyMessage(2);
        this.f325j = true;
        this.f322g.t();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.f326k) {
            i(true);
        }
        Object q2 = q();
        n z = this.f322g.z();
        if (z == null && this.f323h == null && q2 == null) {
            return null;
        }
        c cVar = new c();
        cVar.f333a = q2;
        cVar.f334b = this.f323h;
        cVar.f335c = z;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k();
        Parcelable A = this.f322g.A();
        if (A != null) {
            bundle.putParcelable("android:support:fragments", A);
        }
        if (this.f330o.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f329n);
            int[] iArr = new int[this.f330o.k()];
            String[] strArr = new String[this.f330o.k()];
            for (int i2 = 0; i2 < this.f330o.k(); i2++) {
                iArr[i2] = this.f330o.h(i2);
                strArr[i2] = this.f330o.l(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f326k = false;
        this.f327l = false;
        this.f321f.removeMessages(1);
        if (!this.f324i) {
            this.f324i = true;
            this.f322g.c();
        }
        this.f322g.w();
        this.f322g.t();
        this.f322g.r();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f322g.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f326k = true;
        k();
        this.f321f.sendEmptyMessage(1);
        this.f322g.s();
    }

    protected void p() {
        this.f322g.q();
    }

    public Object q() {
        return null;
    }

    @Deprecated
    public void r() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        if (!this.f279e && i2 != -1) {
            e.g(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.support.v4.app.e, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}