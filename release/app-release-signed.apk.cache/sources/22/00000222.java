package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f1713a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f1714b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f1715c = null;

    /* renamed from: d  reason: collision with root package name */
    int f1716d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f1717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1718b;

        a(t tVar, View view) {
            this.f1717a = tVar;
            this.f1718b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1717a.c(this.f1718b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1717a.a(this.f1718b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1717a.b(this.f1718b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f1720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1721b;

        b(v vVar, View view) {
            this.f1720a = vVar;
            this.f1721b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1720a.a(this.f1721b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(View view) {
        this.f1713a = new WeakReference<>(view);
    }

    private void g(View view, t tVar) {
        if (tVar != null) {
            view.animate().setListener(new a(tVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public s a(float f2) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f1713a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public s d(long j2) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public s e(Interpolator interpolator) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public s f(t tVar) {
        View view = this.f1713a.get();
        if (view != null) {
            g(view, tVar);
        }
        return this;
    }

    public s h(long j2) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public s i(v vVar) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().setUpdateListener(vVar != null ? new b(vVar, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public s k(float f2) {
        View view = this.f1713a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}