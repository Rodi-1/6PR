package p019r;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.widget.C0316v0;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;
import p023v.C0592g;
import p023v.Window$CallbackC0597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.e */
/* loaded from: classes.dex */
public abstract class AbstractC0532e extends AbstractC0531d {

    /* renamed from: s */
    private static boolean f2256s;

    /* renamed from: t */
    private static final boolean f2257t;

    /* renamed from: u */
    private static final int[] f2258u;

    /* renamed from: d */
    final Context f2259d;

    /* renamed from: e */
    final Window f2260e;

    /* renamed from: f */
    final Window.Callback f2261f;

    /* renamed from: g */
    final Window.Callback f2262g;

    /* renamed from: h */
    final InterfaceC0530c f2263h;

    /* renamed from: i */
    AbstractC0525a f2264i;

    /* renamed from: j */
    MenuInflater f2265j;

    /* renamed from: k */
    boolean f2266k;

    /* renamed from: l */
    boolean f2267l;

    /* renamed from: m */
    boolean f2268m;

    /* renamed from: n */
    boolean f2269n;

    /* renamed from: o */
    boolean f2270o;

    /* renamed from: p */
    private CharSequence f2271p;

    /* renamed from: q */
    private boolean f2272q;

    /* renamed from: r */
    private boolean f2273r;

    /* renamed from: r.e$a */
    /* loaded from: classes.dex */
    static class C0533a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f2274a;

        C0533a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2274a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m263a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m263a(th)) {
                this.f2274a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f2274a.uncaughtException(thread, notFoundException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.e$b */
    /* loaded from: classes.dex */
    public class C0534b extends Window$CallbackC0597i {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0534b(Window.Callback callback) {
            super(callback);
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AbstractC0532e.this.mo247B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AbstractC0532e.this.mo245H(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0192e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AbstractC0532e.this.mo244I(i, menu);
            return true;
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AbstractC0532e.this.mo243J(i, menu);
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0192e c0192e = menu instanceof C0192e ? (C0192e) menu : null;
            if (i == 0 && c0192e == null) {
                return false;
            }
            if (c0192e != null) {
                c0192e.m1629a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0192e != null) {
                c0192e.m1629a0(false);
            }
            return onPreparePanel;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        f2257t = z;
        if (z && !f2256s) {
            Thread.setDefaultUncaughtExceptionHandler(new C0533a(Thread.getDefaultUncaughtExceptionHandler()));
            f2256s = true;
        }
        f2258u = new int[]{16842836};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0532e(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        this.f2259d = context;
        this.f2260e = window;
        this.f2263h = interfaceC0530c;
        Window.Callback callback = window.getCallback();
        this.f2261f = callback;
        if (callback instanceof C0534b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback mo249M = mo249M(callback);
        this.f2262g = mo249M;
        window.setCallback(mo249M);
        C0316v0 m1109s = C0316v0.m1109s(context, null, f2258u);
        Drawable m1121g = m1109s.m1121g(0);
        if (m1121g != null) {
            window.setBackgroundDrawable(m1121g);
        }
        m1109s.m1107u();
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: A */
    public final void mo271A(CharSequence charSequence) {
        this.f2271p = charSequence;
        mo242K(charSequence);
    }

    /* renamed from: B */
    abstract boolean mo247B(KeyEvent keyEvent);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final Context m270C() {
        AbstractC0525a mo264k = mo264k();
        Context mo120k = mo264k != null ? mo264k.mo120k() : null;
        return mo120k == null ? this.f2259d : mo120k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final CharSequence m269D() {
        Window.Callback callback = this.f2261f;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f2271p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final Window.Callback m268E() {
        return this.f2260e.getCallback();
    }

    /* renamed from: F */
    abstract void mo246F();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m267G() {
        return this.f2273r;
    }

    /* renamed from: H */
    abstract boolean mo245H(int i, KeyEvent keyEvent);

    /* renamed from: I */
    abstract boolean mo244I(int i, Menu menu);

    /* renamed from: J */
    abstract void mo243J(int i, Menu menu);

    /* renamed from: K */
    abstract void mo242K(CharSequence charSequence);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final AbstractC0525a m266L() {
        return this.f2264i;
    }

    /* renamed from: M */
    abstract Window.Callback mo249M(Window.Callback callback);

    @Override // p019r.AbstractC0531d
    /* renamed from: d */
    public abstract boolean mo260d();

    @Override // p019r.AbstractC0531d
    /* renamed from: j */
    public MenuInflater mo265j() {
        if (this.f2265j == null) {
            mo246F();
            AbstractC0525a abstractC0525a = this.f2264i;
            this.f2265j = new C0592g(abstractC0525a != null ? abstractC0525a.mo120k() : this.f2259d);
        }
        return this.f2265j;
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: k */
    public AbstractC0525a mo264k() {
        mo246F();
        return this.f2264i;
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: q */
    public void mo206q() {
        this.f2273r = true;
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: t */
    public void mo259t(Bundle bundle) {
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: u */
    public void mo258u() {
        this.f2272q = true;
    }
}