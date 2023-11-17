package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f474b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f475c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f476d;

    private w(View view, Runnable runnable) {
        this.f474b = view;
        this.f475c = view.getViewTreeObserver();
        this.f476d = runnable;
    }

    public static w a(View view, Runnable runnable) {
        w wVar = new w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(wVar);
        view.addOnAttachStateChangeListener(wVar);
        return wVar;
    }

    public void b() {
        (this.f475c.isAlive() ? this.f475c : this.f474b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f474b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f476d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f475c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}