package p016o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: o.s */
/* loaded from: classes.dex */
public final class C0511s {

    /* renamed from: a */
    private WeakReference<View> f2231a;

    /* renamed from: b */
    Runnable f2232b = null;

    /* renamed from: c */
    Runnable f2233c = null;

    /* renamed from: d */
    int f2234d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.s$a */
    /* loaded from: classes.dex */
    public class C0512a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0514t f2235a;

        /* renamed from: b */
        final /* synthetic */ View f2236b;

        C0512a(InterfaceC0514t interfaceC0514t, View view) {
            this.f2235a = interfaceC0514t;
            this.f2236b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2235a.mo333c(this.f2236b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2235a.mo33a(this.f2236b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2235a.mo32b(this.f2236b);
        }
    }

    /* renamed from: o.s$b */
    /* loaded from: classes.dex */
    class C0513b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0516v f2238a;

        /* renamed from: b */
        final /* synthetic */ View f2239b;

        C0513b(InterfaceC0516v interfaceC0516v, View view) {
            this.f2238a = interfaceC0516v;
            this.f2239b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2238a.mo108a(this.f2239b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511s(View view) {
        this.f2231a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m338g(View view, InterfaceC0514t interfaceC0514t) {
        if (interfaceC0514t != null) {
            view.animate().setListener(new C0512a(interfaceC0514t, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0511s m344a(float f) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void m343b() {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m342c() {
        View view = this.f2231a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C0511s m341d(long j) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C0511s m340e(Interpolator interpolator) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C0511s m339f(InterfaceC0514t interfaceC0514t) {
        View view = this.f2231a.get();
        if (view != null) {
            m338g(view, interfaceC0514t);
        }
        return this;
    }

    /* renamed from: h */
    public C0511s m337h(long j) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C0511s m336i(InterfaceC0516v interfaceC0516v) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0516v != null ? new C0513b(interfaceC0516v, view) : null);
        }
        return this;
    }

    /* renamed from: j */
    public void m335j() {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C0511s m334k(float f) {
        View view = this.f2231a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}