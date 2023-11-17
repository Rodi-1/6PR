package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends android.support.v4.app.l implements LayoutInflater.Factory2 {
    static boolean F = false;
    static Field G;
    static final Interpolator H = new DecelerateInterpolator(2.5f);
    static final Interpolator I = new DecelerateInterpolator(1.5f);
    static final Interpolator J = new AccelerateInterpolator(2.5f);
    static final Interpolator K = new AccelerateInterpolator(1.5f);
    ArrayList<l> C;
    n D;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<k> f342b;

    /* renamed from: c  reason: collision with root package name */
    boolean f343c;

    /* renamed from: f  reason: collision with root package name */
    SparseArray<android.support.v4.app.g> f346f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<android.support.v4.app.c> f347g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<android.support.v4.app.g> f348h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<android.support.v4.app.c> f349i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList<Integer> f350j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<l.b> f351k;

    /* renamed from: n  reason: collision with root package name */
    android.support.v4.app.k f354n;

    /* renamed from: o  reason: collision with root package name */
    android.support.v4.app.i f355o;

    /* renamed from: p  reason: collision with root package name */
    android.support.v4.app.g f356p;

    /* renamed from: q  reason: collision with root package name */
    android.support.v4.app.g f357q;

    /* renamed from: r  reason: collision with root package name */
    boolean f358r;

    /* renamed from: s  reason: collision with root package name */
    boolean f359s;

    /* renamed from: t  reason: collision with root package name */
    boolean f360t;

    /* renamed from: u  reason: collision with root package name */
    boolean f361u;

    /* renamed from: v  reason: collision with root package name */
    String f362v;

    /* renamed from: w  reason: collision with root package name */
    boolean f363w;
    ArrayList<android.support.v4.app.c> x;
    ArrayList<Boolean> y;
    ArrayList<android.support.v4.app.g> z;

    /* renamed from: d  reason: collision with root package name */
    int f344d = 0;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<android.support.v4.app.g> f345e = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final CopyOnWriteArrayList<n.i<l.a, Boolean>> f352l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    int f353m = 0;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    Runnable E = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f365b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.g f366c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f366c.k() != null) {
                    b.this.f366c.T0(null);
                    b bVar = b.this;
                    m mVar = m.this;
                    android.support.v4.app.g gVar = bVar.f366c;
                    mVar.F0(gVar, gVar.C(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, android.support.v4.app.g gVar) {
            super(animationListener, null);
            this.f365b = viewGroup;
            this.f366c = gVar;
        }

        @Override // android.support.v4.app.m.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f365b.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.g f371c;

        c(ViewGroup viewGroup, View view, android.support.v4.app.g gVar) {
            this.f369a = viewGroup;
            this.f370b = view;
            this.f371c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f369a.endViewTransition(this.f370b);
            Animator l2 = this.f371c.l();
            this.f371c.U0(null);
            if (l2 == null || this.f369a.indexOfChild(this.f370b) >= 0) {
                return;
            }
            m mVar = m.this;
            android.support.v4.app.g gVar = this.f371c;
            mVar.F0(gVar, gVar.C(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.g f375c;

        d(ViewGroup viewGroup, View view, android.support.v4.app.g gVar) {
            this.f373a = viewGroup;
            this.f374b = view;
            this.f375c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f373a.endViewTransition(this.f374b);
            animator.removeListener(this);
            View view = this.f375c.I;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        View f377b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f377b.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener, null);
            this.f377b = view;
        }

        @Override // android.support.v4.app.m.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (o.o.j(this.f377b) || Build.VERSION.SDK_INT >= 24) {
                this.f377b.post(new a());
            } else {
                this.f377b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* loaded from: classes.dex */
    private static class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f379a;

        private f(Animation.AnimationListener animationListener) {
            this.f379a = animationListener;
        }

        /* synthetic */ f(Animation.AnimationListener animationListener, a aVar) {
            this(animationListener);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f379a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f379a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f379a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f380a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f381b;

        private g(Animator animator) {
            this.f380a = null;
            this.f381b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        /* synthetic */ g(Animator animator, a aVar) {
            this(animator);
        }

        private g(Animation animation) {
            this.f380a = animation;
            this.f381b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        /* synthetic */ g(Animation animation, a aVar) {
            this(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f382a;

        h(View view) {
            this.f382a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f382a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f382a.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f383b;

        /* renamed from: c  reason: collision with root package name */
        private final View f384c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f385d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f386e;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f383b = viewGroup;
            this.f384c = view;
            addAnimation(animation);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            if (this.f385d) {
                return !this.f386e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f385d = true;
                w.a(this.f383b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            if (this.f385d) {
                return !this.f386e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f385d = true;
                w.a(this.f383b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f383b.endViewTransition(this.f384c);
            this.f386e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f387a = {16842755, 16842960, 16842961};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l implements g.e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f388a;

        /* renamed from: b  reason: collision with root package name */
        private final android.support.v4.app.c f389b;

        /* renamed from: c  reason: collision with root package name */
        private int f390c;

        l(android.support.v4.app.c cVar, boolean z) {
            this.f388a = z;
            this.f389b = cVar;
        }

        @Override // android.support.v4.app.g.e
        public void a() {
            int i2 = this.f390c - 1;
            this.f390c = i2;
            if (i2 != 0) {
                return;
            }
            this.f389b.f239a.W0();
        }

        @Override // android.support.v4.app.g.e
        public void b() {
            this.f390c++;
        }

        public void e() {
            android.support.v4.app.c cVar = this.f389b;
            cVar.f239a.p(cVar, this.f388a, false, false);
        }

        public void f() {
            boolean z = this.f390c > 0;
            m mVar = this.f389b.f239a;
            int size = mVar.f345e.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.g gVar = mVar.f345e.get(i2);
                gVar.a1(null);
                if (z && gVar.J()) {
                    gVar.c1();
                }
            }
            android.support.v4.app.c cVar = this.f389b;
            cVar.f239a.p(cVar, this.f388a, !z, true);
        }

        public boolean g() {
            return this.f390c == 0;
        }
    }

    static boolean A0(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (A0(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean B0(g gVar) {
        Animation animation = gVar.f380a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) animation).getAnimations();
            for (int i2 = 0; i2 < animations.size(); i2++) {
                if (animations.get(i2) instanceof AlphaAnimation) {
                    return true;
                }
            }
            return false;
        }
        return A0(gVar.f381b);
    }

    private boolean I0(String str, int i2, int i3) {
        android.support.v4.app.l t0;
        d0();
        b0(true);
        android.support.v4.app.g gVar = this.f357q;
        if (gVar == null || i2 >= 0 || str != null || (t0 = gVar.t0()) == null || !t0.d()) {
            boolean J0 = J0(this.x, this.y, str, i2, i3);
            if (J0) {
                this.f343c = true;
                try {
                    N0(this.x, this.y);
                } finally {
                    o();
                }
            }
            Z();
            m();
            return J0;
        }
        return true;
    }

    private int K0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, n.b<android.support.v4.app.g> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (cVar.m() && !cVar.k(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                l lVar = new l(cVar, booleanValue);
                this.C.add(lVar);
                cVar.o(lVar);
                if (booleanValue) {
                    cVar.f();
                } else {
                    cVar.g(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, cVar);
                }
                g(bVar);
            }
        }
        return i4;
    }

    private void N0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        g0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f258t) {
                if (i3 != i2) {
                    f0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f258t) {
                        i3++;
                    }
                }
                f0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            f0(arrayList, arrayList2, i3, size);
        }
    }

    public static int R0(int i2) {
        if (i2 != 4097) {
            if (i2 != 4099) {
                return i2 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        synchronized (this) {
            ArrayList<l> arrayList = this.C;
            boolean z = false;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f342b;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f354n.g().removeCallbacks(this.E);
                this.f354n.g().post(this.E);
            }
        }
    }

    private void X(int i2) {
        try {
            this.f343c = true;
            D0(i2, false);
            this.f343c = false;
            d0();
        } catch (Throwable th) {
            this.f343c = false;
            throw th;
        }
    }

    private static void Y0(View view, g gVar) {
        if (view == null || gVar == null || !b1(view, gVar)) {
            return;
        }
        Animator animator = gVar.f381b;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener o0 = o0(gVar.f380a);
        view.setLayerType(2, null);
        gVar.f380a.setAnimationListener(new e(view, o0));
    }

    private void a0() {
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.k() != null) {
                    int C = valueAt.C();
                    View k2 = valueAt.k();
                    Animation animation = k2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        k2.clearAnimation();
                    }
                    valueAt.T0(null);
                    F0(valueAt, C, 0, 0, false);
                } else if (valueAt.l() != null) {
                    valueAt.l().end();
                }
            }
        }
    }

    private static void a1(n nVar) {
        if (nVar == null) {
            return;
        }
        List<android.support.v4.app.g> b2 = nVar.b();
        if (b2 != null) {
            for (android.support.v4.app.g gVar : b2) {
                gVar.D = true;
            }
        }
        List<n> a2 = nVar.a();
        if (a2 != null) {
            for (n nVar2 : a2) {
                a1(nVar2);
            }
        }
    }

    private void b0(boolean z) {
        if (this.f343c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f354n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f354n.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            n();
        }
        if (this.x == null) {
            this.x = new ArrayList<>();
            this.y = new ArrayList<>();
        }
        this.f343c = true;
        try {
            g0(null, null);
        } finally {
            this.f343c = false;
        }
    }

    static boolean b1(View view, g gVar) {
        return view != null && gVar != null && view.getLayerType() == 0 && o.o.i(view) && B0(gVar);
    }

    private static void e0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            android.support.v4.app.c cVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                cVar.c(-1);
                cVar.g(i2 == i3 + (-1));
            } else {
                cVar.c(1);
                cVar.f();
            }
            i2++;
        }
    }

    private void e1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new n.e("FragmentManager"));
        android.support.v4.app.k kVar = this.f354n;
        try {
            if (kVar != null) {
                kVar.i("  ", null, printWriter, new String[0]);
            } else {
                a("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
        }
        throw runtimeException;
    }

    private void f0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).f258t;
        ArrayList<android.support.v4.app.g> arrayList3 = this.z;
        if (arrayList3 == null) {
            this.z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.z.addAll(this.f345e);
        android.support.v4.app.g r0 = r0();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            android.support.v4.app.c cVar = arrayList.get(i7);
            r0 = !arrayList2.get(i7).booleanValue() ? cVar.h(this.z, r0) : cVar.p(this.z, r0);
            z2 = z2 || cVar.f247i;
        }
        this.z.clear();
        if (!z) {
            r.G(this, arrayList, arrayList2, i2, i3, false);
        }
        e0(arrayList, arrayList2, i2, i3);
        if (z) {
            n.b<android.support.v4.app.g> bVar = new n.b<>();
            g(bVar);
            int K0 = K0(arrayList, arrayList2, i2, i3, bVar);
            z0(bVar);
            i4 = K0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            r.G(this, arrayList, arrayList2, i2, i4, true);
            D0(this.f353m, true);
        }
        while (i6 < i3) {
            android.support.v4.app.c cVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = cVar2.f251m) >= 0) {
                m0(i5);
                cVar2.f251m = -1;
            }
            cVar2.n();
            i6++;
        }
        if (z2) {
            O0();
        }
    }

    public static int f1(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        } else if (i2 == 4099) {
            return z ? 5 : 6;
        } else if (i2 != 8194) {
            return -1;
        } else {
            return z ? 3 : 4;
        }
    }

    private void g(n.b<android.support.v4.app.g> bVar) {
        int i2 = this.f353m;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 4);
        int size = this.f345e.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.support.v4.app.g gVar = this.f345e.get(i3);
            if (gVar.f280b < min) {
                F0(gVar, min, gVar.u(), gVar.v(), false);
                if (gVar.I != null && !gVar.A && gVar.N) {
                    bVar.add(gVar);
                }
            }
        }
    }

    private void g0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<l> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = this.C.get(i2);
            if (arrayList == null || lVar.f388a || (indexOf2 = arrayList.indexOf(lVar.f389b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (lVar.g() || (arrayList != null && lVar.f389b.k(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || lVar.f388a || (indexOf = arrayList.indexOf(lVar.f389b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        lVar.f();
                    }
                }
                i2++;
            }
            lVar.e();
            i2++;
        }
    }

    private void j(android.support.v4.app.g gVar, g gVar2, int i2) {
        View view = gVar.I;
        ViewGroup viewGroup = gVar.H;
        viewGroup.startViewTransition(view);
        gVar.b1(i2);
        if (gVar2.f380a != null) {
            i iVar = new i(gVar2.f380a, viewGroup, view);
            gVar.T0(gVar.I);
            iVar.setAnimationListener(new b(o0(iVar), viewGroup, gVar));
            Y0(view, gVar2);
            gVar.I.startAnimation(iVar);
            return;
        }
        Animator animator = gVar2.f381b;
        gVar.U0(animator);
        animator.addListener(new c(viewGroup, view, gVar));
        animator.setTarget(gVar.I);
        Y0(gVar.I, gVar2);
        animator.start();
    }

    private android.support.v4.app.g k0(android.support.v4.app.g gVar) {
        ViewGroup viewGroup = gVar.H;
        View view = gVar.I;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f345e.indexOf(gVar) - 1; indexOf >= 0; indexOf--) {
                android.support.v4.app.g gVar2 = this.f345e.get(indexOf);
                if (gVar2.H == viewGroup && gVar2.I != null) {
                    return gVar2;
                }
            }
        }
        return null;
    }

    private void l0() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).f();
            }
        }
    }

    private void m() {
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f346f.valueAt(size) == null) {
                    SparseArray<android.support.v4.app.g> sparseArray2 = this.f346f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void n() {
        if (c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f362v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.f362v);
    }

    private boolean n0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f342b;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f342b.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.f342b.get(i2).a(arrayList, arrayList2);
                }
                this.f342b.clear();
                this.f354n.g().removeCallbacks(this.E);
                return z;
            }
            return false;
        }
    }

    private void o() {
        this.f343c = false;
        this.y.clear();
        this.x.clear();
    }

    private static Animation.AnimationListener o0(Animation animation) {
        String str;
        try {
            if (G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) G.get(animation);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(android.support.v4.app.c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.g(z3);
        } else {
            cVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            r.G(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            D0(this.f353m, true);
        }
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
                if (valueAt != null && valueAt.I != null && valueAt.N && cVar.j(valueAt.y)) {
                    float f2 = valueAt.P;
                    if (f2 > 0.0f) {
                        valueAt.I.setAlpha(f2);
                    }
                    if (z3) {
                        valueAt.P = 0.0f;
                    } else {
                        valueAt.P = -1.0f;
                        valueAt.N = false;
                    }
                }
            }
        }
    }

    static g w0(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation, (a) null);
    }

    static g y0(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet, (a) null);
    }

    private void z0(n.b<android.support.v4.app.g> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.g k2 = bVar.k(i2);
            if (!k2.f289k) {
                View D = k2.D();
                k2.P = D.getAlpha();
                D.setAlpha(0.0f);
            }
        }
    }

    public void A(boolean z) {
        for (int size = this.f345e.size() - 1; size >= 0; size--) {
            android.support.v4.app.g gVar = this.f345e.get(size);
            if (gVar != null) {
                gVar.F0(z);
            }
        }
    }

    void B(android.support.v4.app.g gVar, Bundle bundle, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).B(gVar, bundle, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.a(this, gVar, bundle);
            }
        }
    }

    void C(android.support.v4.app.g gVar, Context context, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).C(gVar, context, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.b(this, gVar, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(android.support.v4.app.g gVar) {
        if (gVar == null) {
            return;
        }
        int i2 = this.f353m;
        if (gVar.f290l) {
            i2 = gVar.I() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        F0(gVar, i2, gVar.v(), gVar.w(), false);
        if (gVar.I != null) {
            android.support.v4.app.g k0 = k0(gVar);
            if (k0 != null) {
                View view = k0.I;
                ViewGroup viewGroup = gVar.H;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(gVar.I);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(gVar.I, indexOfChild);
                }
            }
            if (gVar.N && gVar.H != null) {
                float f2 = gVar.P;
                if (f2 > 0.0f) {
                    gVar.I.setAlpha(f2);
                }
                gVar.P = 0.0f;
                gVar.N = false;
                g u0 = u0(gVar, gVar.v(), true, gVar.w());
                if (u0 != null) {
                    Y0(gVar.I, u0);
                    Animation animation = u0.f380a;
                    if (animation != null) {
                        gVar.I.startAnimation(animation);
                    } else {
                        u0.f381b.setTarget(gVar.I);
                        u0.f381b.start();
                    }
                }
            }
        }
        if (gVar.O) {
            q(gVar);
        }
    }

    void D(android.support.v4.app.g gVar, Bundle bundle, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).D(gVar, bundle, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.c(this, gVar, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(int i2, boolean z) {
        android.support.v4.app.k kVar;
        if (this.f354n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f353m) {
            this.f353m = i2;
            if (this.f346f != null) {
                int size = this.f345e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0(this.f345e.get(i3));
                }
                int size2 = this.f346f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    android.support.v4.app.g valueAt = this.f346f.valueAt(i4);
                    if (valueAt != null && ((valueAt.f290l || valueAt.B) && !valueAt.N)) {
                        C0(valueAt);
                    }
                }
                d1();
                if (this.f358r && (kVar = this.f354n) != null && this.f353m == 5) {
                    kVar.n();
                    this.f358r = false;
                }
            }
        }
    }

    void E(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).E(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.d(this, gVar);
            }
        }
    }

    void E0(android.support.v4.app.g gVar) {
        F0(gVar, this.f353m, 0, 0, false);
    }

    void F(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).F(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.e(this, gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
        if (r0 != 4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F0(android.support.v4.app.g r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.F0(android.support.v4.app.g, int, int, int, boolean):void");
    }

    void G(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).G(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.f(this, gVar);
            }
        }
    }

    public void G0() {
        this.D = null;
        this.f359s = false;
        this.f360t = false;
        int size = this.f345e.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null) {
                gVar.M();
            }
        }
    }

    void H(android.support.v4.app.g gVar, Context context, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).H(gVar, context, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.g(this, gVar, context);
            }
        }
    }

    public void H0(android.support.v4.app.g gVar) {
        if (gVar.K) {
            if (this.f343c) {
                this.f363w = true;
                return;
            }
            gVar.K = false;
            F0(gVar, this.f353m, 0, 0, false);
        }
    }

    void I(android.support.v4.app.g gVar, Bundle bundle, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).I(gVar, bundle, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.h(this, gVar, bundle);
            }
        }
    }

    void J(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).J(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.i(this, gVar);
            }
        }
    }

    boolean J0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<android.support.v4.app.c> arrayList3 = this.f347g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f347g.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    android.support.v4.app.c cVar = this.f347g.get(size2);
                    if ((str != null && str.equals(cVar.i())) || (i2 >= 0 && i2 == cVar.f251m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        android.support.v4.app.c cVar2 = this.f347g.get(size2);
                        if (str == null || !str.equals(cVar2.i())) {
                            if (i2 < 0 || i2 != cVar2.f251m) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f347g.size() - 1) {
                return false;
            }
            for (int size3 = this.f347g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f347g.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void K(android.support.v4.app.g gVar, Bundle bundle, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).K(gVar, bundle, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.j(this, gVar, bundle);
            }
        }
    }

    void L(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).L(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.k(this, gVar);
            }
        }
    }

    public void L0(Bundle bundle, String str, android.support.v4.app.g gVar) {
        if (gVar.f283e < 0) {
            e1(new IllegalStateException("Fragment " + gVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, gVar.f283e);
    }

    void M(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).M(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.l(this, gVar);
            }
        }
    }

    public void M0(android.support.v4.app.g gVar) {
        if (F) {
            Log.v("FragmentManager", "remove: " + gVar + " nesting=" + gVar.f295q);
        }
        boolean z = !gVar.I();
        if (!gVar.B || z) {
            synchronized (this.f345e) {
                this.f345e.remove(gVar);
            }
            if (gVar.E && gVar.F) {
                this.f358r = true;
            }
            gVar.f289k = false;
            gVar.f290l = true;
        }
    }

    void N(android.support.v4.app.g gVar, View view, Bundle bundle, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).N(gVar, view, bundle, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.m(this, gVar, view, bundle);
            }
        }
    }

    void O(android.support.v4.app.g gVar, boolean z) {
        android.support.v4.app.g gVar2 = this.f356p;
        if (gVar2 != null) {
            android.support.v4.app.l s2 = gVar2.s();
            if (s2 instanceof m) {
                ((m) s2).O(gVar, true);
            }
        }
        Iterator<n.i<l.a, Boolean>> it = this.f352l.iterator();
        while (it.hasNext()) {
            n.i<l.a, Boolean> next = it.next();
            if (!z || next.f1669b.booleanValue()) {
                next.f1668a.n(this, gVar);
            }
        }
    }

    void O0() {
        if (this.f351k != null) {
            for (int i2 = 0; i2 < this.f351k.size(); i2++) {
                this.f351k.get(i2).a();
            }
        }
    }

    public boolean P(MenuItem menuItem) {
        if (this.f353m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null && gVar.G0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(Parcelable parcelable, n nVar) {
        List<n> list;
        List<android.arch.lifecycle.n> list2;
        p[] pVarArr;
        if (parcelable == null) {
            return;
        }
        o oVar = (o) parcelable;
        if (oVar.f394b == null) {
            return;
        }
        if (nVar != null) {
            List<android.support.v4.app.g> b2 = nVar.b();
            list = nVar.a();
            list2 = nVar.c();
            int size = b2 != null ? b2.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.g gVar = b2.get(i2);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + gVar);
                }
                int i3 = 0;
                while (true) {
                    pVarArr = oVar.f394b;
                    if (i3 >= pVarArr.length || pVarArr[i3].f400c == gVar.f283e) {
                        break;
                    }
                    i3++;
                }
                if (i3 == pVarArr.length) {
                    e1(new IllegalStateException("Could not find active fragment with index " + gVar.f283e));
                }
                p pVar = oVar.f394b[i3];
                pVar.f410m = gVar;
                gVar.f282d = null;
                gVar.f295q = 0;
                gVar.f292n = false;
                gVar.f289k = false;
                gVar.f286h = null;
                Bundle bundle = pVar.f409l;
                if (bundle != null) {
                    bundle.setClassLoader(this.f354n.e().getClassLoader());
                    gVar.f282d = pVar.f409l.getSparseParcelableArray("android:view_state");
                    gVar.f281c = pVar.f409l;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f346f = new SparseArray<>(oVar.f394b.length);
        int i4 = 0;
        while (true) {
            p[] pVarArr2 = oVar.f394b;
            if (i4 >= pVarArr2.length) {
                break;
            }
            p pVar2 = pVarArr2[i4];
            if (pVar2 != null) {
                android.support.v4.app.g a2 = pVar2.a(this.f354n, this.f355o, this.f356p, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + a2);
                }
                this.f346f.put(a2.f283e, a2);
                pVar2.f410m = null;
            }
            i4++;
        }
        if (nVar != null) {
            List<android.support.v4.app.g> b3 = nVar.b();
            int size2 = b3 != null ? b3.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                android.support.v4.app.g gVar2 = b3.get(i5);
                int i6 = gVar2.f287i;
                if (i6 >= 0) {
                    android.support.v4.app.g gVar3 = this.f346f.get(i6);
                    gVar2.f286h = gVar3;
                    if (gVar3 == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + gVar2 + " target no longer exists: " + gVar2.f287i);
                    }
                }
            }
        }
        this.f345e.clear();
        if (oVar.f395c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = oVar.f395c;
                if (i7 >= iArr.length) {
                    break;
                }
                android.support.v4.app.g gVar4 = this.f346f.get(iArr[i7]);
                if (gVar4 == null) {
                    e1(new IllegalStateException("No instantiated fragment for index #" + oVar.f395c[i7]));
                }
                gVar4.f289k = true;
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + gVar4);
                }
                if (this.f345e.contains(gVar4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f345e) {
                    this.f345e.add(gVar4);
                }
                i7++;
            }
        }
        if (oVar.f396d != null) {
            this.f347g = new ArrayList<>(oVar.f396d.length);
            int i8 = 0;
            while (true) {
                android.support.v4.app.d[] dVarArr = oVar.f396d;
                if (i8 >= dVarArr.length) {
                    break;
                }
                android.support.v4.app.c a3 = dVarArr[i8].a(this);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + a3.f251m + "): " + a3);
                    PrintWriter printWriter = new PrintWriter(new n.e("FragmentManager"));
                    a3.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f347g.add(a3);
                int i9 = a3.f251m;
                if (i9 >= 0) {
                    X0(i9, a3);
                }
                i8++;
            }
        } else {
            this.f347g = null;
        }
        int i10 = oVar.f397e;
        if (i10 >= 0) {
            this.f357q = this.f346f.get(i10);
        }
        this.f344d = oVar.f398f;
    }

    public void Q(Menu menu) {
        if (this.f353m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null) {
                gVar.H0(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n Q0() {
        a1(this.D);
        return this.D;
    }

    public void R() {
        X(4);
    }

    public void S(boolean z) {
        for (int size = this.f345e.size() - 1; size >= 0; size--) {
            android.support.v4.app.g gVar = this.f345e.get(size);
            if (gVar != null) {
                gVar.J0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable S0() {
        int[] iArr;
        int size;
        l0();
        a0();
        d0();
        this.f359s = true;
        android.support.v4.app.d[] dVarArr = null;
        this.D = null;
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f346f.size();
        p[] pVarArr = new p[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.f283e < 0) {
                    e1(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f283e));
                }
                p pVar = new p(valueAt);
                pVarArr[i2] = pVar;
                if (valueAt.f280b <= 0 || pVar.f409l != null) {
                    pVar.f409l = valueAt.f281c;
                } else {
                    pVar.f409l = T0(valueAt);
                    android.support.v4.app.g gVar = valueAt.f286h;
                    if (gVar != null) {
                        if (gVar.f283e < 0) {
                            e1(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f286h));
                        }
                        if (pVar.f409l == null) {
                            pVar.f409l = new Bundle();
                        }
                        L0(pVar.f409l, "android:target_state", valueAt.f286h);
                        int i3 = valueAt.f288j;
                        if (i3 != 0) {
                            pVar.f409l.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (F) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + pVar.f409l);
                }
                z = true;
            }
        }
        if (!z) {
            if (F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f345e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.f345e.get(i4).f283e;
                if (iArr[i4] < 0) {
                    e1(new IllegalStateException("Failure saving state: active " + this.f345e.get(i4) + " has cleared index: " + iArr[i4]));
                }
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f345e.get(i4));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<android.support.v4.app.c> arrayList = this.f347g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            dVarArr = new android.support.v4.app.d[size];
            for (int i5 = 0; i5 < size; i5++) {
                dVarArr[i5] = new android.support.v4.app.d(this.f347g.get(i5));
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f347g.get(i5));
                }
            }
        }
        o oVar = new o();
        oVar.f394b = pVarArr;
        oVar.f395c = iArr;
        oVar.f396d = dVarArr;
        android.support.v4.app.g gVar2 = this.f357q;
        if (gVar2 != null) {
            oVar.f397e = gVar2.f283e;
        }
        oVar.f398f = this.f344d;
        V0();
        return oVar;
    }

    public boolean T(Menu menu) {
        if (this.f353m < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null && gVar.K0(menu)) {
                z = true;
            }
        }
        return z;
    }

    Bundle T0(android.support.v4.app.g gVar) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        gVar.N0(this.A);
        K(gVar, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (gVar.I != null) {
            U0(gVar);
        }
        if (gVar.f282d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", gVar.f282d);
        }
        if (!gVar.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", gVar.L);
        }
        return bundle;
    }

    public void U() {
        X(2);
    }

    void U0(android.support.v4.app.g gVar) {
        if (gVar.J == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.B;
        if (sparseArray == null) {
            this.B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        gVar.J.saveHierarchyState(this.B);
        if (this.B.size() > 0) {
            gVar.f282d = this.B;
            this.B = null;
        }
    }

    public void V() {
        this.f359s = false;
        this.f360t = false;
        X(5);
    }

    void V0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        n nVar;
        if (this.f346f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f346f.size(); i2++) {
                android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.C) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        android.support.v4.app.g gVar = valueAt.f286h;
                        valueAt.f287i = gVar != null ? gVar.f283e : -1;
                        if (F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    m mVar = valueAt.f298t;
                    if (mVar != null) {
                        mVar.V0();
                        nVar = valueAt.f298t.D;
                    } else {
                        nVar = valueAt.f299u;
                    }
                    if (arrayList2 == null && nVar != null) {
                        arrayList2 = new ArrayList(this.f346f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(nVar);
                    }
                    if (arrayList3 == null && valueAt.f300v != null) {
                        arrayList3 = new ArrayList(this.f346f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f300v);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.D = null;
        } else {
            this.D = new n(arrayList, arrayList2, arrayList3);
        }
    }

    public void W() {
        this.f359s = false;
        this.f360t = false;
        X(4);
    }

    public void X0(int i2, android.support.v4.app.c cVar) {
        synchronized (this) {
            if (this.f349i == null) {
                this.f349i = new ArrayList<>();
            }
            int size = this.f349i.size();
            if (i2 < size) {
                if (F) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + cVar);
                }
                this.f349i.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.f349i.add(null);
                    if (this.f350j == null) {
                        this.f350j = new ArrayList<>();
                    }
                    if (F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f350j.add(Integer.valueOf(size));
                    size++;
                }
                if (F) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + cVar);
                }
                this.f349i.add(cVar);
            }
        }
    }

    public void Y() {
        this.f360t = true;
        X(3);
    }

    void Z() {
        if (this.f363w) {
            this.f363w = false;
            d1();
        }
    }

    public void Z0(android.support.v4.app.g gVar) {
        if (gVar == null || (this.f346f.get(gVar.f283e) == gVar && (gVar.f297s == null || gVar.s() == this))) {
            this.f357q = gVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + gVar + " is not an active fragment of FragmentManager " + this);
    }

    @Override // android.support.v4.app.l
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.e(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f345e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f345e.get(i3).toString());
            }
        }
        ArrayList<android.support.v4.app.g> arrayList = this.f348h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.f348h.get(i4).toString());
            }
        }
        ArrayList<android.support.v4.app.c> arrayList2 = this.f347g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                android.support.v4.app.c cVar = this.f347g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.d(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            ArrayList<android.support.v4.app.c> arrayList3 = this.f349i;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println((android.support.v4.app.c) this.f349i.get(i6));
                }
            }
            ArrayList<Integer> arrayList4 = this.f350j;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f350j.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f342b;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println((k) this.f342b.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f354n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f355o);
        if (this.f356p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f356p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f353m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f359s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f360t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f361u);
        if (this.f358r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f358r);
        }
        if (this.f362v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f362v);
        }
    }

    @Override // android.support.v4.app.l
    public List<android.support.v4.app.g> b() {
        List<android.support.v4.app.g> list;
        if (this.f345e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f345e) {
            list = (List) this.f345e.clone();
        }
        return list;
    }

    @Override // android.support.v4.app.l
    public boolean c() {
        return this.f359s || this.f360t;
    }

    void c0(android.support.v4.app.g gVar) {
        if (!gVar.f291m || gVar.f294p) {
            return;
        }
        View z0 = gVar.z0(gVar.D0(gVar.f281c), null, gVar.f281c);
        gVar.I = z0;
        if (z0 == null) {
            gVar.J = null;
            return;
        }
        gVar.J = z0;
        z0.setSaveFromParentEnabled(false);
        if (gVar.A) {
            gVar.I.setVisibility(8);
        }
        gVar.r0(gVar.I, gVar.f281c);
        N(gVar, gVar.I, gVar.f281c, false);
    }

    public void c1(android.support.v4.app.g gVar) {
        if (F) {
            Log.v("FragmentManager", "show: " + gVar);
        }
        if (gVar.A) {
            gVar.A = false;
            gVar.O = !gVar.O;
        }
    }

    @Override // android.support.v4.app.l
    public boolean d() {
        n();
        return I0(null, -1, 0);
    }

    public boolean d0() {
        b0(true);
        boolean z = false;
        while (n0(this.x, this.y)) {
            this.f343c = true;
            try {
                N0(this.x, this.y);
                o();
                z = true;
            } catch (Throwable th) {
                o();
                throw th;
            }
        }
        Z();
        m();
        return z;
    }

    void d1() {
        if (this.f346f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f346f.size(); i2++) {
            android.support.v4.app.g valueAt = this.f346f.valueAt(i2);
            if (valueAt != null) {
                H0(valueAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(android.support.v4.app.c cVar) {
        if (this.f347g == null) {
            this.f347g = new ArrayList<>();
        }
        this.f347g.add(cVar);
    }

    public android.support.v4.app.g h0(int i2) {
        for (int size = this.f345e.size() - 1; size >= 0; size--) {
            android.support.v4.app.g gVar = this.f345e.get(size);
            if (gVar != null && gVar.x == i2) {
                return gVar;
            }
        }
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray != null) {
            for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                android.support.v4.app.g valueAt = this.f346f.valueAt(size2);
                if (valueAt != null && valueAt.x == i2) {
                    return valueAt;
                }
            }
            return null;
        }
        return null;
    }

    public void i(android.support.v4.app.g gVar, boolean z) {
        if (F) {
            Log.v("FragmentManager", "add: " + gVar);
        }
        v0(gVar);
        if (gVar.B) {
            return;
        }
        if (this.f345e.contains(gVar)) {
            throw new IllegalStateException("Fragment already added: " + gVar);
        }
        synchronized (this.f345e) {
            this.f345e.add(gVar);
        }
        gVar.f289k = true;
        gVar.f290l = false;
        if (gVar.I == null) {
            gVar.O = false;
        }
        if (gVar.E && gVar.F) {
            this.f358r = true;
        }
        if (z) {
            E0(gVar);
        }
    }

    public android.support.v4.app.g i0(String str) {
        if (str != null) {
            for (int size = this.f345e.size() - 1; size >= 0; size--) {
                android.support.v4.app.g gVar = this.f345e.get(size);
                if (gVar != null && str.equals(gVar.z)) {
                    return gVar;
                }
            }
        }
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.g valueAt = this.f346f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.z)) {
                return valueAt;
            }
        }
        return null;
    }

    public android.support.v4.app.g j0(String str) {
        android.support.v4.app.g g2;
        SparseArray<android.support.v4.app.g> sparseArray = this.f346f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            android.support.v4.app.g valueAt = this.f346f.valueAt(size);
            if (valueAt != null && (g2 = valueAt.g(str)) != null) {
                return g2;
            }
        }
        return null;
    }

    public void k(android.support.v4.app.k kVar, android.support.v4.app.i iVar, android.support.v4.app.g gVar) {
        if (this.f354n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f354n = kVar;
        this.f355o = iVar;
        this.f356p = gVar;
    }

    public void l(android.support.v4.app.g gVar) {
        if (F) {
            Log.v("FragmentManager", "attach: " + gVar);
        }
        if (gVar.B) {
            gVar.B = false;
            if (gVar.f289k) {
                return;
            }
            if (this.f345e.contains(gVar)) {
                throw new IllegalStateException("Fragment already added: " + gVar);
            }
            if (F) {
                Log.v("FragmentManager", "add from attach: " + gVar);
            }
            synchronized (this.f345e) {
                this.f345e.add(gVar);
            }
            gVar.f289k = true;
            if (gVar.E && gVar.F) {
                this.f358r = true;
            }
        }
    }

    public void m0(int i2) {
        synchronized (this) {
            this.f349i.set(i2, null);
            if (this.f350j == null) {
                this.f350j = new ArrayList<>();
            }
            if (F) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.f350j.add(Integer.valueOf(i2));
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f387a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            String str2 = attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (android.support.v4.app.g.L(this.f354n.e(), str2)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
                }
                android.support.v4.app.g h0 = resourceId != -1 ? h0(resourceId) : null;
                if (h0 == null && string != null) {
                    h0 = i0(string);
                }
                if (h0 == null && id != -1) {
                    h0 = h0(id);
                }
                if (F) {
                    Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + h0);
                }
                if (h0 == null) {
                    h0 = this.f355o.a(context, str2, null);
                    h0.f291m = true;
                    h0.x = resourceId != 0 ? resourceId : id;
                    h0.y = id;
                    h0.z = string;
                    h0.f292n = true;
                    h0.f296r = this;
                    android.support.v4.app.k kVar = this.f354n;
                    h0.f297s = kVar;
                    h0.f0(kVar.e(), attributeSet, h0.f281c);
                    i(h0, true);
                } else if (h0.f292n) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
                } else {
                    h0.f292n = true;
                    android.support.v4.app.k kVar2 = this.f354n;
                    h0.f297s = kVar2;
                    if (!h0.D) {
                        h0.f0(kVar2.e(), attributeSet, h0.f281c);
                    }
                }
                android.support.v4.app.g gVar = h0;
                if (this.f353m >= 1 || !gVar.f291m) {
                    E0(gVar);
                } else {
                    F0(gVar, 1, 0, 0, false);
                }
                View view2 = gVar.I;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (gVar.I.getTag() == null) {
                        gVar.I.setTag(string);
                    }
                    return gVar.I;
                }
                throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
            }
            return null;
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public android.support.v4.app.g p0(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        android.support.v4.app.g gVar = this.f346f.get(i2);
        if (gVar == null) {
            e1(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        }
        return gVar;
    }

    void q(android.support.v4.app.g gVar) {
        Animator animator;
        if (gVar.I != null) {
            g u0 = u0(gVar, gVar.v(), !gVar.A, gVar.w());
            if (u0 == null || (animator = u0.f381b) == null) {
                if (u0 != null) {
                    Y0(gVar.I, u0);
                    gVar.I.startAnimation(u0.f380a);
                    u0.f380a.start();
                }
                gVar.I.setVisibility((!gVar.A || gVar.H()) ? 0 : 8);
                if (gVar.H()) {
                    gVar.W0(false);
                }
            } else {
                animator.setTarget(gVar.I);
                if (!gVar.A) {
                    gVar.I.setVisibility(0);
                } else if (gVar.H()) {
                    gVar.W0(false);
                } else {
                    ViewGroup viewGroup = gVar.H;
                    View view = gVar.I;
                    viewGroup.startViewTransition(view);
                    u0.f381b.addListener(new d(viewGroup, view, gVar));
                }
                Y0(gVar.I, u0);
                u0.f381b.start();
            }
        }
        if (gVar.f289k && gVar.E && gVar.F) {
            this.f358r = true;
        }
        gVar.O = false;
        gVar.d0(gVar.A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 q0() {
        return this;
    }

    public void r(android.support.v4.app.g gVar) {
        if (F) {
            Log.v("FragmentManager", "detach: " + gVar);
        }
        if (gVar.B) {
            return;
        }
        gVar.B = true;
        if (gVar.f289k) {
            if (F) {
                Log.v("FragmentManager", "remove from detach: " + gVar);
            }
            synchronized (this.f345e) {
                this.f345e.remove(gVar);
            }
            if (gVar.E && gVar.F) {
                this.f358r = true;
            }
            gVar.f289k = false;
        }
    }

    public android.support.v4.app.g r0() {
        return this.f357q;
    }

    public void s() {
        this.f359s = false;
        this.f360t = false;
        X(2);
    }

    public void s0(android.support.v4.app.g gVar) {
        if (F) {
            Log.v("FragmentManager", "hide: " + gVar);
        }
        if (gVar.A) {
            return;
        }
        gVar.A = true;
        gVar.O = true ^ gVar.O;
    }

    public void t(Configuration configuration) {
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null) {
                gVar.v0(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t0(int i2) {
        return this.f353m >= i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f356p;
        if (obj == null) {
            obj = this.f354n;
        }
        n.d.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public boolean u(MenuItem menuItem) {
        if (this.f353m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null && gVar.w0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    g u0(android.support.v4.app.g gVar, int i2, boolean z, int i3) {
        int f1;
        int u2 = gVar.u();
        Animation U = gVar.U(i2, z, u2);
        if (U != null) {
            return new g(U, (a) null);
        }
        Animator V = gVar.V(i2, z, u2);
        if (V != null) {
            return new g(V, (a) null);
        }
        if (u2 != 0) {
            boolean equals = "anim".equals(this.f354n.e().getResources().getResourceTypeName(u2));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f354n.e(), u2);
                    if (loadAnimation != null) {
                        return new g(loadAnimation, (a) null);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f354n.e(), u2);
                    if (loadAnimator != null) {
                        return new g(loadAnimator, (a) null);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f354n.e(), u2);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2, (a) null);
                    }
                }
            }
        }
        if (i2 != 0 && (f1 = f1(i2, z)) >= 0) {
            switch (f1) {
                case 1:
                    return y0(this.f354n.e(), 1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    return y0(this.f354n.e(), 1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    return y0(this.f354n.e(), 0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    return y0(this.f354n.e(), 1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    return w0(this.f354n.e(), 0.0f, 1.0f);
                case 6:
                    return w0(this.f354n.e(), 1.0f, 0.0f);
                default:
                    if (i3 == 0 && this.f354n.l()) {
                        this.f354n.k();
                    }
                    return null;
            }
        }
        return null;
    }

    public void v() {
        this.f359s = false;
        this.f360t = false;
        X(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v0(android.support.v4.app.g gVar) {
        if (gVar.f283e >= 0) {
            return;
        }
        int i2 = this.f344d;
        this.f344d = i2 + 1;
        gVar.X0(i2, this.f356p);
        if (this.f346f == null) {
            this.f346f = new SparseArray<>();
        }
        this.f346f.put(gVar.f283e, gVar);
        if (F) {
            Log.v("FragmentManager", "Allocated fragment index " + gVar);
        }
    }

    public boolean w(Menu menu, MenuInflater menuInflater) {
        if (this.f353m < 1) {
            return false;
        }
        ArrayList<android.support.v4.app.g> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null && gVar.y0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(gVar);
                z = true;
            }
        }
        if (this.f348h != null) {
            for (int i3 = 0; i3 < this.f348h.size(); i3++) {
                android.support.v4.app.g gVar2 = this.f348h.get(i3);
                if (arrayList == null || !arrayList.contains(gVar2)) {
                    gVar2.Z();
                }
            }
        }
        this.f348h = arrayList;
        return z;
    }

    public void x() {
        this.f361u = true;
        d0();
        X(0);
        this.f354n = null;
        this.f355o = null;
        this.f356p = null;
    }

    void x0(android.support.v4.app.g gVar) {
        if (gVar.f283e < 0) {
            return;
        }
        if (F) {
            Log.v("FragmentManager", "Freeing fragment index " + gVar);
        }
        this.f346f.put(gVar.f283e, null);
        gVar.E();
    }

    public void y() {
        X(1);
    }

    public void z() {
        for (int i2 = 0; i2 < this.f345e.size(); i2++) {
            android.support.v4.app.g gVar = this.f345e.get(i2);
            if (gVar != null) {
                gVar.E0();
            }
        }
    }
}