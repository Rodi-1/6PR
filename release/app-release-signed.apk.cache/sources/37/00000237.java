package r;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.v0;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e extends d {

    /* renamed from: s  reason: collision with root package name */
    private static boolean f1738s;

    /* renamed from: t  reason: collision with root package name */
    private static final boolean f1739t;

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f1740u;

    /* renamed from: d  reason: collision with root package name */
    final Context f1741d;

    /* renamed from: e  reason: collision with root package name */
    final Window f1742e;

    /* renamed from: f  reason: collision with root package name */
    final Window.Callback f1743f;

    /* renamed from: g  reason: collision with root package name */
    final Window.Callback f1744g;

    /* renamed from: h  reason: collision with root package name */
    final c f1745h;

    /* renamed from: i  reason: collision with root package name */
    r.a f1746i;

    /* renamed from: j  reason: collision with root package name */
    MenuInflater f1747j;

    /* renamed from: k  reason: collision with root package name */
    boolean f1748k;

    /* renamed from: l  reason: collision with root package name */
    boolean f1749l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1750m;

    /* renamed from: n  reason: collision with root package name */
    boolean f1751n;

    /* renamed from: o  reason: collision with root package name */
    boolean f1752o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1753p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1754q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1755r;

    /* loaded from: classes.dex */
    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1756a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1756a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f1756a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f1756a.uncaughtException(thread, notFoundException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends v.i {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Window.Callback callback) {
            super(callback);
        }

        @Override // v.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // v.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.H(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // v.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof android.support.v7.view.menu.e)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // v.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            e.this.I(i2, menu);
            return true;
        }

        @Override // v.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            e.this.J(i2, menu);
        }

        @Override // v.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            android.support.v7.view.menu.e eVar = menu instanceof android.support.v7.view.menu.e ? (android.support.v7.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        f1739t = z;
        if (z && !f1738s) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
            f1738s = true;
        }
        f1740u = new int[]{16842836};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, Window window, c cVar) {
        this.f1741d = context;
        this.f1742e = window;
        this.f1745h = cVar;
        Window.Callback callback = window.getCallback();
        this.f1743f = callback;
        if (callback instanceof b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback M = M(callback);
        this.f1744g = M;
        window.setCallback(M);
        v0 s2 = v0.s(context, null, f1740u);
        Drawable g2 = s2.g(0);
        if (g2 != null) {
            window.setBackgroundDrawable(g2);
        }
        s2.u();
    }

    @Override // r.d
    public final void A(CharSequence charSequence) {
        this.f1753p = charSequence;
        K(charSequence);
    }

    abstract boolean B(KeyEvent keyEvent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context C() {
        r.a k2 = k();
        Context k3 = k2 != null ? k2.k() : null;
        return k3 == null ? this.f1741d : k3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence D() {
        Window.Callback callback = this.f1743f;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f1753p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback E() {
        return this.f1742e.getCallback();
    }

    abstract void F();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        return this.f1755r;
    }

    abstract boolean H(int i2, KeyEvent keyEvent);

    abstract boolean I(int i2, Menu menu);

    abstract void J(int i2, Menu menu);

    abstract void K(CharSequence charSequence);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r.a L() {
        return this.f1746i;
    }

    abstract Window.Callback M(Window.Callback callback);

    @Override // r.d
    public abstract boolean d();

    @Override // r.d
    public MenuInflater j() {
        if (this.f1747j == null) {
            F();
            r.a aVar = this.f1746i;
            this.f1747j = new v.g(aVar != null ? aVar.k() : this.f1741d);
        }
        return this.f1747j;
    }

    @Override // r.d
    public r.a k() {
        F();
        return this.f1746i;
    }

    @Override // r.d
    public void q() {
        this.f1755r = true;
    }

    @Override // r.d
    public void t(Bundle bundle) {
    }

    @Override // r.d
    public void u() {
        this.f1754q = true;
    }
}