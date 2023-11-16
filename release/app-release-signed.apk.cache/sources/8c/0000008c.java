package android.support.p001v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.w */
/* loaded from: classes.dex */
class ViewTreeObserver$OnPreDrawListenerC0127w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f618b;

    /* renamed from: c */
    private ViewTreeObserver f619c;

    /* renamed from: d */
    private final Runnable f620d;

    private ViewTreeObserver$OnPreDrawListenerC0127w(View view, Runnable runnable) {
        this.f618b = view;
        this.f619c = view.getViewTreeObserver();
        this.f620d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC0127w m1821a(View view, Runnable runnable) {
        ViewTreeObserver$OnPreDrawListenerC0127w viewTreeObserver$OnPreDrawListenerC0127w = new ViewTreeObserver$OnPreDrawListenerC0127w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0127w);
        view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0127w);
        return viewTreeObserver$OnPreDrawListenerC0127w;
    }

    /* renamed from: b */
    public void m1820b() {
        (this.f619c.isAlive() ? this.f619c : this.f618b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f618b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m1820b();
        this.f620d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f619c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1820b();
    }
}