package android.support.p001v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0026n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p001v4.app.AbstractC0086l;
import android.support.p001v4.app.ComponentCallbacksC0073g;
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
import p015n.C0447b;
import p015n.C0450d;
import p015n.C0451e;
import p015n.C0460i;
import p016o.C0490o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.m */
/* loaded from: classes.dex */
public final class LayoutInflater$Factory2C0089m extends AbstractC0086l implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static boolean f472F = false;

    /* renamed from: G */
    static Field f473G;

    /* renamed from: H */
    static final Interpolator f474H = new DecelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f475I = new DecelerateInterpolator(1.5f);

    /* renamed from: J */
    static final Interpolator f476J = new AccelerateInterpolator(2.5f);

    /* renamed from: K */
    static final Interpolator f477K = new AccelerateInterpolator(1.5f);

    /* renamed from: C */
    ArrayList<C0103l> f480C;

    /* renamed from: D */
    C0104n f481D;

    /* renamed from: b */
    ArrayList<InterfaceC0102k> f483b;

    /* renamed from: c */
    boolean f484c;

    /* renamed from: f */
    SparseArray<ComponentCallbacksC0073g> f487f;

    /* renamed from: g */
    ArrayList<C0067c> f488g;

    /* renamed from: h */
    ArrayList<ComponentCallbacksC0073g> f489h;

    /* renamed from: i */
    ArrayList<C0067c> f490i;

    /* renamed from: j */
    ArrayList<Integer> f491j;

    /* renamed from: k */
    ArrayList<AbstractC0086l.InterfaceC0088b> f492k;

    /* renamed from: n */
    AbstractC0085k f495n;

    /* renamed from: o */
    AbstractC0083i f496o;

    /* renamed from: p */
    ComponentCallbacksC0073g f497p;

    /* renamed from: q */
    ComponentCallbacksC0073g f498q;

    /* renamed from: r */
    boolean f499r;

    /* renamed from: s */
    boolean f500s;

    /* renamed from: t */
    boolean f501t;

    /* renamed from: u */
    boolean f502u;

    /* renamed from: v */
    String f503v;

    /* renamed from: w */
    boolean f504w;

    /* renamed from: x */
    ArrayList<C0067c> f505x;

    /* renamed from: y */
    ArrayList<Boolean> f506y;

    /* renamed from: z */
    ArrayList<ComponentCallbacksC0073g> f507z;

    /* renamed from: d */
    int f485d = 0;

    /* renamed from: e */
    final ArrayList<ComponentCallbacksC0073g> f486e = new ArrayList<>();

    /* renamed from: l */
    private final CopyOnWriteArrayList<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> f493l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    int f494m = 0;

    /* renamed from: A */
    Bundle f478A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f479B = null;

    /* renamed from: E */
    Runnable f482E = new RunnableC0090a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$a */
    /* loaded from: classes.dex */
    public class RunnableC0090a implements Runnable {
        RunnableC0090a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0089m.this.m1955d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$b */
    /* loaded from: classes.dex */
    public class C0091b extends animationAnimation$AnimationListenerC0097f {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f509b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0073g f510c;

        /* renamed from: android.support.v4.app.m$b$a */
        /* loaded from: classes.dex */
        class RunnableC0092a implements Runnable {
            RunnableC0092a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0091b.this.f510c.m2124k() != null) {
                    C0091b.this.f510c.m2158T0(null);
                    C0091b c0091b = C0091b.this;
                    LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = LayoutInflater$Factory2C0089m.this;
                    ComponentCallbacksC0073g componentCallbacksC0073g = c0091b.f510c;
                    layoutInflater$Factory2C0089m.m2006F0(componentCallbacksC0073g, componentCallbacksC0073g.m2193C(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0091b(Animation.AnimationListener animationListener, ViewGroup viewGroup, ComponentCallbacksC0073g componentCallbacksC0073g) {
            super(animationListener, null);
            this.f509b = viewGroup;
            this.f510c = componentCallbacksC0073g;
        }

        @Override // android.support.p001v4.app.LayoutInflater$Factory2C0089m.animationAnimation$AnimationListenerC0097f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f509b.post(new RunnableC0092a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$c */
    /* loaded from: classes.dex */
    public class C0093c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f513a;

        /* renamed from: b */
        final /* synthetic */ View f514b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0073g f515c;

        C0093c(ViewGroup viewGroup, View view, ComponentCallbacksC0073g componentCallbacksC0073g) {
            this.f513a = viewGroup;
            this.f514b = view;
            this.f515c = componentCallbacksC0073g;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f513a.endViewTransition(this.f514b);
            Animator m2122l = this.f515c.m2122l();
            this.f515c.m2156U0(null);
            if (m2122l == null || this.f513a.indexOfChild(this.f514b) >= 0) {
                return;
            }
            LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = LayoutInflater$Factory2C0089m.this;
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f515c;
            layoutInflater$Factory2C0089m.m2006F0(componentCallbacksC0073g, componentCallbacksC0073g.m2193C(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$d */
    /* loaded from: classes.dex */
    public class C0094d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f517a;

        /* renamed from: b */
        final /* synthetic */ View f518b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0073g f519c;

        C0094d(ViewGroup viewGroup, View view, ComponentCallbacksC0073g componentCallbacksC0073g) {
            this.f517a = viewGroup;
            this.f518b = view;
            this.f519c = componentCallbacksC0073g;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f517a.endViewTransition(this.f518b);
            animator.removeListener(this);
            View view = this.f519c.f396I;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.app.m$e */
    /* loaded from: classes.dex */
    public static class C0095e extends animationAnimation$AnimationListenerC0097f {

        /* renamed from: b */
        View f521b;

        /* renamed from: android.support.v4.app.m$e$a */
        /* loaded from: classes.dex */
        class RunnableC0096a implements Runnable {
            RunnableC0096a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0095e.this.f521b.setLayerType(0, null);
            }
        }

        C0095e(View view, Animation.AnimationListener animationListener) {
            super(animationListener, null);
            this.f521b = view;
        }

        @Override // android.support.p001v4.app.LayoutInflater$Factory2C0089m.animationAnimation$AnimationListenerC0097f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C0490o.m402j(this.f521b) || Build.VERSION.SDK_INT >= 24) {
                this.f521b.post(new RunnableC0096a());
            } else {
                this.f521b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.m$f  reason: invalid class name */
    /* loaded from: classes.dex */
    private static class animationAnimation$AnimationListenerC0097f implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f523a;

        private animationAnimation$AnimationListenerC0097f(Animation.AnimationListener animationListener) {
            this.f523a = animationListener;
        }

        /* synthetic */ animationAnimation$AnimationListenerC0097f(Animation.AnimationListener animationListener, RunnableC0090a runnableC0090a) {
            this(animationListener);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f523a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f523a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f523a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.app.m$g */
    /* loaded from: classes.dex */
    public static class C0098g {

        /* renamed from: a */
        public final Animation f524a;

        /* renamed from: b */
        public final Animator f525b;

        private C0098g(Animator animator) {
            this.f524a = null;
            this.f525b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        /* synthetic */ C0098g(Animator animator, RunnableC0090a runnableC0090a) {
            this(animator);
        }

        private C0098g(Animation animation) {
            this.f524a = animation;
            this.f525b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        /* synthetic */ C0098g(Animation animation, RunnableC0090a runnableC0090a) {
            this(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.app.m$h */
    /* loaded from: classes.dex */
    public static class C0099h extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f526a;

        C0099h(View view) {
            this.f526a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f526a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f526a.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.app.m$i */
    /* loaded from: classes.dex */
    public static class RunnableC0100i extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f527b;

        /* renamed from: c */
        private final View f528c;

        /* renamed from: d */
        private boolean f529d;

        /* renamed from: e */
        private boolean f530e;

        RunnableC0100i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f527b = viewGroup;
            this.f528c = view;
            addAnimation(animation);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f529d) {
                return !this.f530e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f529d = true;
                ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(this.f527b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f529d) {
                return !this.f530e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f529d = true;
                ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(this.f527b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f527b.endViewTransition(this.f528c);
            this.f530e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$j */
    /* loaded from: classes.dex */
    public static class C0101j {

        /* renamed from: a */
        public static final int[] f531a = {16842755, 16842960, 16842961};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0102k {
        /* renamed from: a */
        boolean mo1907a(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.m$l */
    /* loaded from: classes.dex */
    public static class C0103l implements ComponentCallbacksC0073g.InterfaceC0078e {

        /* renamed from: a */
        private final boolean f532a;

        /* renamed from: b */
        private final C0067c f533b;

        /* renamed from: c */
        private int f534c;

        C0103l(C0067c c0067c, boolean z) {
            this.f532a = z;
            this.f533b = c0067c;
        }

        @Override // android.support.p001v4.app.ComponentCallbacksC0073g.InterfaceC0078e
        /* renamed from: a */
        public void mo1906a() {
            int i = this.f534c - 1;
            this.f534c = i;
            if (i != 0) {
                return;
            }
            this.f533b.f345a.m1972W0();
        }

        @Override // android.support.p001v4.app.ComponentCallbacksC0073g.InterfaceC0078e
        /* renamed from: b */
        public void mo1905b() {
            this.f534c++;
        }

        /* renamed from: e */
        public void m1902e() {
            C0067c c0067c = this.f533b;
            c0067c.f345a.m1929p(c0067c, this.f532a, false, false);
        }

        /* renamed from: f */
        public void m1901f() {
            boolean z = this.f534c > 0;
            LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f533b.f345a;
            int size = layoutInflater$Factory2C0089m.f486e.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0073g componentCallbacksC0073g = layoutInflater$Factory2C0089m.f486e.get(i);
                componentCallbacksC0073g.m2144a1(null);
                if (z && componentCallbacksC0073g.m2179J()) {
                    componentCallbacksC0073g.m2139c1();
                }
            }
            C0067c c0067c = this.f533b;
            c0067c.f345a.m1929p(c0067c, this.f532a, !z, true);
        }

        /* renamed from: g */
        public boolean m1900g() {
            return this.f534c == 0;
        }
    }

    /* renamed from: A0 */
    static boolean m2016A0(Animator animator) {
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
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m2016A0(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B0 */
    static boolean m2014B0(C0098g c0098g) {
        Animation animation = c0098g.f524a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) animation).getAnimations();
            for (int i = 0; i < animations.size(); i++) {
                if (animations.get(i) instanceof AlphaAnimation) {
                    return true;
                }
            }
            return false;
        }
        return m2016A0(c0098g.f525b);
    }

    /* renamed from: I0 */
    private boolean m2000I0(String str, int i, int i2) {
        AbstractC0086l m2105t0;
        m1955d0();
        m1961b0(true);
        ComponentCallbacksC0073g componentCallbacksC0073g = this.f498q;
        if (componentCallbacksC0073g == null || i >= 0 || str != null || (m2105t0 = componentCallbacksC0073g.m2105t0()) == null || !m2105t0.mo1956d()) {
            boolean m1998J0 = m1998J0(this.f505x, this.f506y, str, i, i2);
            if (m1998J0) {
                this.f484c = true;
                try {
                    m1990N0(this.f505x, this.f506y);
                } finally {
                    m1931o();
                }
            }
            m1967Z();
            m1935m();
            return m1998J0;
        }
        return true;
    }

    /* renamed from: K0 */
    private int m1996K0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0447b<ComponentCallbacksC0073g> c0447b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0067c c0067c = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c0067c.m2205m() && !c0067c.m2207k(arrayList, i4 + 1, i2)) {
                if (this.f480C == null) {
                    this.f480C = new ArrayList<>();
                }
                C0103l c0103l = new C0103l(c0067c, booleanValue);
                this.f480C.add(c0103l);
                c0067c.m2203o(c0103l);
                if (booleanValue) {
                    c0067c.m2212f();
                } else {
                    c0067c.m2211g(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0067c);
                }
                m1947g(c0447b);
            }
        }
        return i3;
    }

    /* renamed from: N0 */
    private void m1990N0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1946g0(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f364t) {
                if (i2 != i) {
                    m1949f0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f364t) {
                        i2++;
                    }
                }
                m1949f0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m1949f0(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: R0 */
    public static int m1982R0(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public void m1972W0() {
        synchronized (this) {
            ArrayList<C0103l> arrayList = this.f480C;
            boolean z = false;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<InterfaceC0102k> arrayList2 = this.f483b;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f495n.m2040g().removeCallbacks(this.f482E);
                this.f495n.m2040g().post(this.f482E);
            }
        }
    }

    /* renamed from: X */
    private void m1971X(int i) {
        try {
            this.f484c = true;
            m2010D0(i, false);
            this.f484c = false;
            m1955d0();
        } catch (Throwable th) {
            this.f484c = false;
            throw th;
        }
    }

    /* renamed from: Y0 */
    private static void m1968Y0(View view, C0098g c0098g) {
        if (view == null || c0098g == null || !m1960b1(view, c0098g)) {
            return;
        }
        Animator animator = c0098g.f525b;
        if (animator != null) {
            animator.addListener(new C0099h(view));
            return;
        }
        Animation.AnimationListener m1930o0 = m1930o0(c0098g.f524a);
        view.setLayerType(2, null);
        c0098g.f524a.setAnimationListener(new C0095e(view, m1930o0));
    }

    /* renamed from: a0 */
    private void m1964a0() {
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.m2124k() != null) {
                    int m2193C = valueAt.m2193C();
                    View m2124k = valueAt.m2124k();
                    Animation animation = m2124k.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m2124k.clearAnimation();
                    }
                    valueAt.m2158T0(null);
                    m2006F0(valueAt, m2193C, 0, 0, false);
                } else if (valueAt.m2122l() != null) {
                    valueAt.m2122l().end();
                }
            }
        }
    }

    /* renamed from: a1 */
    private static void m1963a1(C0104n c0104n) {
        if (c0104n == null) {
            return;
        }
        List<ComponentCallbacksC0073g> m1898b = c0104n.m1898b();
        if (m1898b != null) {
            for (ComponentCallbacksC0073g componentCallbacksC0073g : m1898b) {
                componentCallbacksC0073g.f391D = true;
            }
        }
        List<C0104n> m1899a = c0104n.m1899a();
        if (m1899a != null) {
            for (C0104n c0104n2 : m1899a) {
                m1963a1(c0104n2);
            }
        }
    }

    /* renamed from: b0 */
    private void m1961b0(boolean z) {
        if (this.f484c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f495n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f495n.m2040g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m1933n();
        }
        if (this.f505x == null) {
            this.f505x = new ArrayList<>();
            this.f506y = new ArrayList<>();
        }
        this.f484c = true;
        try {
            m1946g0(null, null);
        } finally {
            this.f484c = false;
        }
    }

    /* renamed from: b1 */
    static boolean m1960b1(View view, C0098g c0098g) {
        return view != null && c0098g != null && view.getLayerType() == 0 && C0490o.m403i(view) && m2014B0(c0098g);
    }

    /* renamed from: e0 */
    private static void m1952e0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0067c c0067c = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0067c.m2215c(-1);
                c0067c.m2211g(i == i2 + (-1));
            } else {
                c0067c.m2215c(1);
                c0067c.m2212f();
            }
            i++;
        }
    }

    /* renamed from: e1 */
    private void m1951e1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0451e("FragmentManager"));
        AbstractC0085k abstractC0085k = this.f495n;
        try {
            if (abstractC0085k != null) {
                abstractC0085k.mo2038i("  ", null, printWriter, new String[0]);
            } else {
                mo1965a("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e) {
            Log.e("FragmentManager", "Failed dumping state", e);
        }
        throw runtimeException;
    }

    /* renamed from: f0 */
    private void m1949f0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = arrayList.get(i5).f364t;
        ArrayList<ComponentCallbacksC0073g> arrayList3 = this.f507z;
        if (arrayList3 == null) {
            this.f507z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f507z.addAll(this.f486e);
        ComponentCallbacksC0073g m1924r0 = m1924r0();
        boolean z2 = false;
        for (int i6 = i5; i6 < i2; i6++) {
            C0067c c0067c = arrayList.get(i6);
            m1924r0 = !arrayList2.get(i6).booleanValue() ? c0067c.m2210h(this.f507z, m1924r0) : c0067c.m2202p(this.f507z, m1924r0);
            z2 = z2 || c0067c.f353i;
        }
        this.f507z.clear();
        if (!z) {
            C0110r.m1885G(this, arrayList, arrayList2, i, i2, false);
        }
        m1952e0(arrayList, arrayList2, i, i2);
        if (z) {
            C0447b<ComponentCallbacksC0073g> c0447b = new C0447b<>();
            m1947g(c0447b);
            int m1996K0 = m1996K0(arrayList, arrayList2, i, i2, c0447b);
            m1908z0(c0447b);
            i3 = m1996K0;
        } else {
            i3 = i2;
        }
        if (i3 != i5 && z) {
            C0110r.m1885G(this, arrayList, arrayList2, i, i3, true);
            m2010D0(this.f494m, true);
        }
        while (i5 < i2) {
            C0067c c0067c2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && (i4 = c0067c2.f357m) >= 0) {
                m1934m0(i4);
                c0067c2.f357m = -1;
            }
            c0067c2.m2204n();
            i5++;
        }
        if (z2) {
            m1988O0();
        }
    }

    /* renamed from: f1 */
    public static int m1948f1(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        } else if (i == 4099) {
            return z ? 5 : 6;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? 3 : 4;
        }
    }

    /* renamed from: g */
    private void m1947g(C0447b<ComponentCallbacksC0073g> c0447b) {
        int i = this.f494m;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 4);
        int size = this.f486e.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i2);
            if (componentCallbacksC0073g.f407b < min) {
                m2006F0(componentCallbacksC0073g, min, componentCallbacksC0073g.m2104u(), componentCallbacksC0073g.m2102v(), false);
                if (componentCallbacksC0073g.f396I != null && !componentCallbacksC0073g.f388A && componentCallbacksC0073g.f401N) {
                    c0447b.add(componentCallbacksC0073g);
                }
            }
        }
    }

    /* renamed from: g0 */
    private void m1946g0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0103l> arrayList3 = this.f480C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0103l c0103l = this.f480C.get(i);
            if (arrayList == null || c0103l.f532a || (indexOf2 = arrayList.indexOf(c0103l.f533b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (c0103l.m1900g() || (arrayList != null && c0103l.f533b.m2207k(arrayList, 0, arrayList.size()))) {
                    this.f480C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || c0103l.f532a || (indexOf = arrayList.indexOf(c0103l.f533b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        c0103l.m1901f();
                    }
                }
                i++;
            }
            c0103l.m1902e();
            i++;
        }
    }

    /* renamed from: j */
    private void m1941j(ComponentCallbacksC0073g componentCallbacksC0073g, C0098g c0098g, int i) {
        View view = componentCallbacksC0073g.f396I;
        ViewGroup viewGroup = componentCallbacksC0073g.f395H;
        viewGroup.startViewTransition(view);
        componentCallbacksC0073g.m2142b1(i);
        if (c0098g.f524a != null) {
            RunnableC0100i runnableC0100i = new RunnableC0100i(c0098g.f524a, viewGroup, view);
            componentCallbacksC0073g.m2158T0(componentCallbacksC0073g.f396I);
            runnableC0100i.setAnimationListener(new C0091b(m1930o0(runnableC0100i), viewGroup, componentCallbacksC0073g));
            m1968Y0(view, c0098g);
            componentCallbacksC0073g.f396I.startAnimation(runnableC0100i);
            return;
        }
        Animator animator = c0098g.f525b;
        componentCallbacksC0073g.m2156U0(animator);
        animator.addListener(new C0093c(viewGroup, view, componentCallbacksC0073g));
        animator.setTarget(componentCallbacksC0073g.f396I);
        m1968Y0(componentCallbacksC0073g.f396I, c0098g);
        animator.start();
    }

    /* renamed from: k0 */
    private ComponentCallbacksC0073g m1938k0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        ViewGroup viewGroup = componentCallbacksC0073g.f395H;
        View view = componentCallbacksC0073g.f396I;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f486e.indexOf(componentCallbacksC0073g) - 1; indexOf >= 0; indexOf--) {
                ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f486e.get(indexOf);
                if (componentCallbacksC0073g2.f395H == viewGroup && componentCallbacksC0073g2.f396I != null) {
                    return componentCallbacksC0073g2;
                }
            }
        }
        return null;
    }

    /* renamed from: l0 */
    private void m1936l0() {
        if (this.f480C != null) {
            while (!this.f480C.isEmpty()) {
                this.f480C.remove(0).m1901f();
            }
        }
    }

    /* renamed from: m */
    private void m1935m() {
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f487f.valueAt(size) == null) {
                    SparseArray<ComponentCallbacksC0073g> sparseArray2 = this.f487f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: n */
    private void m1933n() {
        if (mo1959c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f503v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.f503v);
    }

    /* renamed from: n0 */
    private boolean m1932n0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<InterfaceC0102k> arrayList3 = this.f483b;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f483b.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f483b.get(i).mo1907a(arrayList, arrayList2);
                }
                this.f483b.clear();
                this.f495n.m2040g().removeCallbacks(this.f482E);
                return z;
            }
            return false;
        }
    }

    /* renamed from: o */
    private void m1931o() {
        this.f484c = false;
        this.f506y.clear();
        this.f505x.clear();
    }

    /* renamed from: o0 */
    private static Animation.AnimationListener m1930o0(Animation animation) {
        String str;
        try {
            if (f473G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f473G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) f473G.get(animation);
        } catch (IllegalAccessException e) {
            e = e;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e2) {
            e = e2;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m1929p(C0067c c0067c, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0067c.m2211g(z3);
        } else {
            c0067c.m2212f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0067c);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0110r.m1885G(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m2010D0(this.f494m, true);
        }
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
                if (valueAt != null && valueAt.f396I != null && valueAt.f401N && c0067c.m2208j(valueAt.f430y)) {
                    float f = valueAt.f403P;
                    if (f > 0.0f) {
                        valueAt.f396I.setAlpha(f);
                    }
                    if (z3) {
                        valueAt.f403P = 0.0f;
                    } else {
                        valueAt.f403P = -1.0f;
                        valueAt.f401N = false;
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    static C0098g m1914w0(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f475I);
        alphaAnimation.setDuration(220L);
        return new C0098g(alphaAnimation, (RunnableC0090a) null);
    }

    /* renamed from: y0 */
    static C0098g m1910y0(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f474H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f475I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C0098g(animationSet, (RunnableC0090a) null);
    }

    /* renamed from: z0 */
    private void m1908z0(C0447b<ComponentCallbacksC0073g> c0447b) {
        int size = c0447b.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0073g m547k = c0447b.m547k(i);
            if (!m547k.f416k) {
                View m2191D = m547k.m2191D();
                m547k.f403P = m2191D.getAlpha();
                m2191D.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: A */
    public void m2017A(boolean z) {
        for (int size = this.f486e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(size);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2186F0(z);
            }
        }
    }

    /* renamed from: B */
    void m2015B(ComponentCallbacksC0073g componentCallbacksC0073g, Bundle bundle, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2015B(componentCallbacksC0073g, bundle, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2032a(this, componentCallbacksC0073g, bundle);
            }
        }
    }

    /* renamed from: C */
    void m2013C(ComponentCallbacksC0073g componentCallbacksC0073g, Context context, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2013C(componentCallbacksC0073g, context, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2031b(this, componentCallbacksC0073g, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void m2012C0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g == null) {
            return;
        }
        int i = this.f494m;
        if (componentCallbacksC0073g.f417l) {
            i = componentCallbacksC0073g.m2181I() ? Math.min(i, 1) : Math.min(i, 0);
        }
        m2006F0(componentCallbacksC0073g, i, componentCallbacksC0073g.m2102v(), componentCallbacksC0073g.m2100w(), false);
        if (componentCallbacksC0073g.f396I != null) {
            ComponentCallbacksC0073g m1938k0 = m1938k0(componentCallbacksC0073g);
            if (m1938k0 != null) {
                View view = m1938k0.f396I;
                ViewGroup viewGroup = componentCallbacksC0073g.f395H;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(componentCallbacksC0073g.f396I);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(componentCallbacksC0073g.f396I, indexOfChild);
                }
            }
            if (componentCallbacksC0073g.f401N && componentCallbacksC0073g.f395H != null) {
                float f = componentCallbacksC0073g.f403P;
                if (f > 0.0f) {
                    componentCallbacksC0073g.f396I.setAlpha(f);
                }
                componentCallbacksC0073g.f403P = 0.0f;
                componentCallbacksC0073g.f401N = false;
                C0098g m1918u0 = m1918u0(componentCallbacksC0073g, componentCallbacksC0073g.m2102v(), true, componentCallbacksC0073g.m2100w());
                if (m1918u0 != null) {
                    m1968Y0(componentCallbacksC0073g.f396I, m1918u0);
                    Animation animation = m1918u0.f524a;
                    if (animation != null) {
                        componentCallbacksC0073g.f396I.startAnimation(animation);
                    } else {
                        m1918u0.f525b.setTarget(componentCallbacksC0073g.f396I);
                        m1918u0.f525b.start();
                    }
                }
            }
        }
        if (componentCallbacksC0073g.f402O) {
            m1927q(componentCallbacksC0073g);
        }
    }

    /* renamed from: D */
    void m2011D(ComponentCallbacksC0073g componentCallbacksC0073g, Bundle bundle, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2011D(componentCallbacksC0073g, bundle, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2030c(this, componentCallbacksC0073g, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void m2010D0(int i, boolean z) {
        AbstractC0085k abstractC0085k;
        if (this.f495n == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f494m) {
            this.f494m = i;
            if (this.f487f != null) {
                int size = this.f486e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m2012C0(this.f486e.get(i2));
                }
                int size2 = this.f487f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i3);
                    if (valueAt != null && ((valueAt.f417l || valueAt.f389B) && !valueAt.f401N)) {
                        m2012C0(valueAt);
                    }
                }
                m1954d1();
                if (this.f499r && (abstractC0085k = this.f495n) != null && this.f494m == 5) {
                    abstractC0085k.mo2033n();
                    this.f499r = false;
                }
            }
        }
    }

    /* renamed from: E */
    void m2009E(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2009E(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2029d(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: E0 */
    void m2008E0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        m2006F0(componentCallbacksC0073g, this.f494m, 0, 0, false);
    }

    /* renamed from: F */
    void m2007F(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2007F(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2028e(this, componentCallbacksC0073g);
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
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2006F0(android.support.p001v4.app.ComponentCallbacksC0073g r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.LayoutInflater$Factory2C0089m.m2006F0(android.support.v4.app.g, int, int, int, boolean):void");
    }

    /* renamed from: G */
    void m2005G(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2005G(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2027f(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: G0 */
    public void m2004G0() {
        this.f481D = null;
        this.f500s = false;
        this.f501t = false;
        int size = this.f486e.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2173M();
            }
        }
    }

    /* renamed from: H */
    void m2003H(ComponentCallbacksC0073g componentCallbacksC0073g, Context context, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2003H(componentCallbacksC0073g, context, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2026g(this, componentCallbacksC0073g, context);
            }
        }
    }

    /* renamed from: H0 */
    public void m2002H0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g.f398K) {
            if (this.f484c) {
                this.f504w = true;
                return;
            }
            componentCallbacksC0073g.f398K = false;
            m2006F0(componentCallbacksC0073g, this.f494m, 0, 0, false);
        }
    }

    /* renamed from: I */
    void m2001I(ComponentCallbacksC0073g componentCallbacksC0073g, Bundle bundle, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m2001I(componentCallbacksC0073g, bundle, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2025h(this, componentCallbacksC0073g, bundle);
            }
        }
    }

    /* renamed from: J */
    void m1999J(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1999J(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2024i(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: J0 */
    boolean m1998J0(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0067c> arrayList3 = this.f488g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f488g.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0067c c0067c = this.f488g.get(size2);
                    if ((str != null && str.equals(c0067c.m2209i())) || (i >= 0 && i == c0067c.f357m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0067c c0067c2 = this.f488g.get(size2);
                        if (str == null || !str.equals(c0067c2.m2209i())) {
                            if (i < 0 || i != c0067c2.f357m) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f488g.size() - 1) {
                return false;
            }
            for (int size3 = this.f488g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f488g.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: K */
    void m1997K(ComponentCallbacksC0073g componentCallbacksC0073g, Bundle bundle, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1997K(componentCallbacksC0073g, bundle, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2023j(this, componentCallbacksC0073g, bundle);
            }
        }
    }

    /* renamed from: L */
    void m1995L(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1995L(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2022k(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: L0 */
    public void m1994L0(Bundle bundle, String str, ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g.f410e < 0) {
            m1951e1(new IllegalStateException("Fragment " + componentCallbacksC0073g + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, componentCallbacksC0073g.f410e);
    }

    /* renamed from: M */
    void m1993M(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1993M(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2021l(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: M0 */
    public void m1992M0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (f472F) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0073g + " nesting=" + componentCallbacksC0073g.f422q);
        }
        boolean z = !componentCallbacksC0073g.m2181I();
        if (!componentCallbacksC0073g.f389B || z) {
            synchronized (this.f486e) {
                this.f486e.remove(componentCallbacksC0073g);
            }
            if (componentCallbacksC0073g.f392E && componentCallbacksC0073g.f393F) {
                this.f499r = true;
            }
            componentCallbacksC0073g.f416k = false;
            componentCallbacksC0073g.f417l = true;
        }
    }

    /* renamed from: N */
    void m1991N(ComponentCallbacksC0073g componentCallbacksC0073g, View view, Bundle bundle, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1991N(componentCallbacksC0073g, view, bundle, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2020m(this, componentCallbacksC0073g, view, bundle);
            }
        }
    }

    /* renamed from: O */
    void m1989O(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f497p;
        if (componentCallbacksC0073g2 != null) {
            AbstractC0086l m2108s = componentCallbacksC0073g2.m2108s();
            if (m2108s instanceof LayoutInflater$Factory2C0089m) {
                ((LayoutInflater$Factory2C0089m) m2108s).m1989O(componentCallbacksC0073g, true);
            }
        }
        Iterator<C0460i<AbstractC0086l.AbstractC0087a, Boolean>> it = this.f493l.iterator();
        while (it.hasNext()) {
            C0460i<AbstractC0086l.AbstractC0087a, Boolean> next = it.next();
            if (!z || next.f2187b.booleanValue()) {
                next.f2186a.m2019n(this, componentCallbacksC0073g);
            }
        }
    }

    /* renamed from: O0 */
    void m1988O0() {
        if (this.f492k != null) {
            for (int i = 0; i < this.f492k.size(); i++) {
                this.f492k.get(i).m2018a();
            }
        }
    }

    /* renamed from: P */
    public boolean m1987P(MenuItem menuItem) {
        if (this.f494m < 1) {
            return false;
        }
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null && componentCallbacksC0073g.m2184G0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m1986P0(Parcelable parcelable, C0104n c0104n) {
        List<C0104n> list;
        List<C0026n> list2;
        C0107p[] c0107pArr;
        if (parcelable == null) {
            return;
        }
        C0105o c0105o = (C0105o) parcelable;
        if (c0105o.f538b == null) {
            return;
        }
        if (c0104n != null) {
            List<ComponentCallbacksC0073g> m1898b = c0104n.m1898b();
            list = c0104n.m1899a();
            list2 = c0104n.m1897c();
            int size = m1898b != null ? m1898b.size() : 0;
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0073g componentCallbacksC0073g = m1898b.get(i);
                if (f472F) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + componentCallbacksC0073g);
                }
                int i2 = 0;
                while (true) {
                    c0107pArr = c0105o.f538b;
                    if (i2 >= c0107pArr.length || c0107pArr[i2].f544c == componentCallbacksC0073g.f410e) {
                        break;
                    }
                    i2++;
                }
                if (i2 == c0107pArr.length) {
                    m1951e1(new IllegalStateException("Could not find active fragment with index " + componentCallbacksC0073g.f410e));
                }
                C0107p c0107p = c0105o.f538b[i2];
                c0107p.f554m = componentCallbacksC0073g;
                componentCallbacksC0073g.f409d = null;
                componentCallbacksC0073g.f422q = 0;
                componentCallbacksC0073g.f419n = false;
                componentCallbacksC0073g.f416k = false;
                componentCallbacksC0073g.f413h = null;
                Bundle bundle = c0107p.f553l;
                if (bundle != null) {
                    bundle.setClassLoader(this.f495n.m2042e().getClassLoader());
                    componentCallbacksC0073g.f409d = c0107p.f553l.getSparseParcelableArray("android:view_state");
                    componentCallbacksC0073g.f408c = c0107p.f553l;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f487f = new SparseArray<>(c0105o.f538b.length);
        int i3 = 0;
        while (true) {
            C0107p[] c0107pArr2 = c0105o.f538b;
            if (i3 >= c0107pArr2.length) {
                break;
            }
            C0107p c0107p2 = c0107pArr2[i3];
            if (c0107p2 != null) {
                ComponentCallbacksC0073g m1894a = c0107p2.m1894a(this.f495n, this.f496o, this.f497p, (list == null || i3 >= list.size()) ? null : list.get(i3), (list2 == null || i3 >= list2.size()) ? null : list2.get(i3));
                if (f472F) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + m1894a);
                }
                this.f487f.put(m1894a.f410e, m1894a);
                c0107p2.f554m = null;
            }
            i3++;
        }
        if (c0104n != null) {
            List<ComponentCallbacksC0073g> m1898b2 = c0104n.m1898b();
            int size2 = m1898b2 != null ? m1898b2.size() : 0;
            for (int i4 = 0; i4 < size2; i4++) {
                ComponentCallbacksC0073g componentCallbacksC0073g2 = m1898b2.get(i4);
                int i5 = componentCallbacksC0073g2.f414i;
                if (i5 >= 0) {
                    ComponentCallbacksC0073g componentCallbacksC0073g3 = this.f487f.get(i5);
                    componentCallbacksC0073g2.f413h = componentCallbacksC0073g3;
                    if (componentCallbacksC0073g3 == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + componentCallbacksC0073g2 + " target no longer exists: " + componentCallbacksC0073g2.f414i);
                    }
                }
            }
        }
        this.f486e.clear();
        if (c0105o.f539c != null) {
            int i6 = 0;
            while (true) {
                int[] iArr = c0105o.f539c;
                if (i6 >= iArr.length) {
                    break;
                }
                ComponentCallbacksC0073g componentCallbacksC0073g4 = this.f487f.get(iArr[i6]);
                if (componentCallbacksC0073g4 == null) {
                    m1951e1(new IllegalStateException("No instantiated fragment for index #" + c0105o.f539c[i6]));
                }
                componentCallbacksC0073g4.f416k = true;
                if (f472F) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + componentCallbacksC0073g4);
                }
                if (this.f486e.contains(componentCallbacksC0073g4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f486e) {
                    this.f486e.add(componentCallbacksC0073g4);
                }
                i6++;
            }
        }
        if (c0105o.f540d != null) {
            this.f488g = new ArrayList<>(c0105o.f540d.length);
            int i7 = 0;
            while (true) {
                C0069d[] c0069dArr = c0105o.f540d;
                if (i7 >= c0069dArr.length) {
                    break;
                }
                C0067c m2201a = c0069dArr[i7].m2201a(this);
                if (f472F) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + m2201a.f357m + "): " + m2201a);
                    PrintWriter printWriter = new PrintWriter(new C0451e("FragmentManager"));
                    m2201a.m2213e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f488g.add(m2201a);
                int i8 = m2201a.f357m;
                if (i8 >= 0) {
                    m1970X0(i8, m2201a);
                }
                i7++;
            }
        } else {
            this.f488g = null;
        }
        int i9 = c0105o.f541e;
        if (i9 >= 0) {
            this.f498q = this.f487f.get(i9);
        }
        this.f485d = c0105o.f542f;
    }

    /* renamed from: Q */
    public void m1985Q(Menu menu) {
        if (this.f494m < 1) {
            return;
        }
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2182H0(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public C0104n m1984Q0() {
        m1963a1(this.f481D);
        return this.f481D;
    }

    /* renamed from: R */
    public void m1983R() {
        m1971X(4);
    }

    /* renamed from: S */
    public void m1981S(boolean z) {
        for (int size = this.f486e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(size);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2178J0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public Parcelable m1980S0() {
        int[] iArr;
        int size;
        m1936l0();
        m1964a0();
        m1955d0();
        this.f500s = true;
        C0069d[] c0069dArr = null;
        this.f481D = null;
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f487f.size();
        C0107p[] c0107pArr = new C0107p[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f410e < 0) {
                    m1951e1(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f410e));
                }
                C0107p c0107p = new C0107p(valueAt);
                c0107pArr[i] = c0107p;
                if (valueAt.f407b <= 0 || c0107p.f553l != null) {
                    c0107p.f553l = valueAt.f408c;
                } else {
                    c0107p.f553l = m1978T0(valueAt);
                    ComponentCallbacksC0073g componentCallbacksC0073g = valueAt.f413h;
                    if (componentCallbacksC0073g != null) {
                        if (componentCallbacksC0073g.f410e < 0) {
                            m1951e1(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f413h));
                        }
                        if (c0107p.f553l == null) {
                            c0107p.f553l = new Bundle();
                        }
                        m1994L0(c0107p.f553l, "android:target_state", valueAt.f413h);
                        int i2 = valueAt.f415j;
                        if (i2 != 0) {
                            c0107p.f553l.putInt("android:target_req_state", i2);
                        }
                    }
                }
                if (f472F) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + c0107p.f553l);
                }
                z = true;
            }
        }
        if (!z) {
            if (f472F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f486e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = this.f486e.get(i3).f410e;
                if (iArr[i3] < 0) {
                    m1951e1(new IllegalStateException("Failure saving state: active " + this.f486e.get(i3) + " has cleared index: " + iArr[i3]));
                }
                if (f472F) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.f486e.get(i3));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0067c> arrayList = this.f488g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0069dArr = new C0069d[size];
            for (int i4 = 0; i4 < size; i4++) {
                c0069dArr[i4] = new C0069d(this.f488g.get(i4));
                if (f472F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f488g.get(i4));
                }
            }
        }
        C0105o c0105o = new C0105o();
        c0105o.f538b = c0107pArr;
        c0105o.f539c = iArr;
        c0105o.f540d = c0069dArr;
        ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f498q;
        if (componentCallbacksC0073g2 != null) {
            c0105o.f541e = componentCallbacksC0073g2.f410e;
        }
        c0105o.f542f = this.f485d;
        m1974V0();
        return c0105o;
    }

    /* renamed from: T */
    public boolean m1979T(Menu menu) {
        if (this.f494m < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null && componentCallbacksC0073g.m2176K0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: T0 */
    Bundle m1978T0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (this.f478A == null) {
            this.f478A = new Bundle();
        }
        componentCallbacksC0073g.m2170N0(this.f478A);
        m1997K(componentCallbacksC0073g, this.f478A, false);
        Bundle bundle = null;
        if (!this.f478A.isEmpty()) {
            Bundle bundle2 = this.f478A;
            this.f478A = null;
            bundle = bundle2;
        }
        if (componentCallbacksC0073g.f396I != null) {
            m1976U0(componentCallbacksC0073g);
        }
        if (componentCallbacksC0073g.f409d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC0073g.f409d);
        }
        if (!componentCallbacksC0073g.f399L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC0073g.f399L);
        }
        return bundle;
    }

    /* renamed from: U */
    public void m1977U() {
        m1971X(2);
    }

    /* renamed from: U0 */
    void m1976U0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g.f397J == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f479B;
        if (sparseArray == null) {
            this.f479B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        componentCallbacksC0073g.f397J.saveHierarchyState(this.f479B);
        if (this.f479B.size() > 0) {
            componentCallbacksC0073g.f409d = this.f479B;
            this.f479B = null;
        }
    }

    /* renamed from: V */
    public void m1975V() {
        this.f500s = false;
        this.f501t = false;
        m1971X(5);
    }

    /* renamed from: V0 */
    void m1974V0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0104n c0104n;
        if (this.f487f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i = 0; i < this.f487f.size(); i++) {
                ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f390C) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        ComponentCallbacksC0073g componentCallbacksC0073g = valueAt.f413h;
                        valueAt.f414i = componentCallbacksC0073g != null ? componentCallbacksC0073g.f410e : -1;
                        if (f472F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = valueAt.f425t;
                    if (layoutInflater$Factory2C0089m != null) {
                        layoutInflater$Factory2C0089m.m1974V0();
                        c0104n = valueAt.f425t.f481D;
                    } else {
                        c0104n = valueAt.f426u;
                    }
                    if (arrayList2 == null && c0104n != null) {
                        arrayList2 = new ArrayList(this.f487f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(c0104n);
                    }
                    if (arrayList3 == null && valueAt.f427v != null) {
                        arrayList3 = new ArrayList(this.f487f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f427v);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.f481D = null;
        } else {
            this.f481D = new C0104n(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: W */
    public void m1973W() {
        this.f500s = false;
        this.f501t = false;
        m1971X(4);
    }

    /* renamed from: X0 */
    public void m1970X0(int i, C0067c c0067c) {
        synchronized (this) {
            if (this.f490i == null) {
                this.f490i = new ArrayList<>();
            }
            int size = this.f490i.size();
            if (i < size) {
                if (f472F) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0067c);
                }
                this.f490i.set(i, c0067c);
            } else {
                while (size < i) {
                    this.f490i.add(null);
                    if (this.f491j == null) {
                        this.f491j = new ArrayList<>();
                    }
                    if (f472F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f491j.add(Integer.valueOf(size));
                    size++;
                }
                if (f472F) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0067c);
                }
                this.f490i.add(c0067c);
            }
        }
    }

    /* renamed from: Y */
    public void m1969Y() {
        this.f501t = true;
        m1971X(3);
    }

    /* renamed from: Z */
    void m1967Z() {
        if (this.f504w) {
            this.f504w = false;
            m1954d1();
        }
    }

    /* renamed from: Z0 */
    public void m1966Z0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g == null || (this.f487f.get(componentCallbacksC0073g.f410e) == componentCallbacksC0073g && (componentCallbacksC0073g.f424s == null || componentCallbacksC0073g.m2108s() == this))) {
            this.f498q = componentCallbacksC0073g;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0073g + " is not an active fragment of FragmentManager " + this);
    }

    @Override // android.support.p001v4.app.AbstractC0086l
    /* renamed from: a */
    public void mo1965a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.m2136e(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f486e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f486e.get(i2).toString());
            }
        }
        ArrayList<ComponentCallbacksC0073g> arrayList = this.f489h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f489h.get(i3).toString());
            }
        }
        ArrayList<C0067c> arrayList2 = this.f488g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0067c c0067c = this.f488g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0067c.toString());
                c0067c.m2214d(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            ArrayList<C0067c> arrayList3 = this.f490i;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((C0067c) this.f490i.get(i5));
                }
            }
            ArrayList<Integer> arrayList4 = this.f491j;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f491j.toArray()));
            }
        }
        ArrayList<InterfaceC0102k> arrayList5 = this.f483b;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((InterfaceC0102k) this.f483b.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f495n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f496o);
        if (this.f497p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f497p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f494m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f500s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f501t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f502u);
        if (this.f499r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f499r);
        }
        if (this.f503v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f503v);
        }
    }

    @Override // android.support.p001v4.app.AbstractC0086l
    /* renamed from: b */
    public List<ComponentCallbacksC0073g> mo1962b() {
        List<ComponentCallbacksC0073g> list;
        if (this.f486e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f486e) {
            list = (List) this.f486e.clone();
        }
        return list;
    }

    @Override // android.support.p001v4.app.AbstractC0086l
    /* renamed from: c */
    public boolean mo1959c() {
        return this.f500s || this.f501t;
    }

    /* renamed from: c0 */
    void m1958c0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (!componentCallbacksC0073g.f418m || componentCallbacksC0073g.f421p) {
            return;
        }
        View m2093z0 = componentCallbacksC0073g.m2093z0(componentCallbacksC0073g.m2190D0(componentCallbacksC0073g.f408c), null, componentCallbacksC0073g.f408c);
        componentCallbacksC0073g.f396I = m2093z0;
        if (m2093z0 == null) {
            componentCallbacksC0073g.f397J = null;
            return;
        }
        componentCallbacksC0073g.f397J = m2093z0;
        m2093z0.setSaveFromParentEnabled(false);
        if (componentCallbacksC0073g.f388A) {
            componentCallbacksC0073g.f396I.setVisibility(8);
        }
        componentCallbacksC0073g.m2109r0(componentCallbacksC0073g.f396I, componentCallbacksC0073g.f408c);
        m1991N(componentCallbacksC0073g, componentCallbacksC0073g.f396I, componentCallbacksC0073g.f408c, false);
    }

    /* renamed from: c1 */
    public void m1957c1(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (f472F) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0073g);
        }
        if (componentCallbacksC0073g.f388A) {
            componentCallbacksC0073g.f388A = false;
            componentCallbacksC0073g.f402O = !componentCallbacksC0073g.f402O;
        }
    }

    @Override // android.support.p001v4.app.AbstractC0086l
    /* renamed from: d */
    public boolean mo1956d() {
        m1933n();
        return m2000I0(null, -1, 0);
    }

    /* renamed from: d0 */
    public boolean m1955d0() {
        m1961b0(true);
        boolean z = false;
        while (m1932n0(this.f505x, this.f506y)) {
            this.f484c = true;
            try {
                m1990N0(this.f505x, this.f506y);
                m1931o();
                z = true;
            } catch (Throwable th) {
                m1931o();
                throw th;
            }
        }
        m1967Z();
        m1935m();
        return z;
    }

    /* renamed from: d1 */
    void m1954d1() {
        if (this.f487f == null) {
            return;
        }
        for (int i = 0; i < this.f487f.size(); i++) {
            ComponentCallbacksC0073g valueAt = this.f487f.valueAt(i);
            if (valueAt != null) {
                m2002H0(valueAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1945h(C0067c c0067c) {
        if (this.f488g == null) {
            this.f488g = new ArrayList<>();
        }
        this.f488g.add(c0067c);
    }

    /* renamed from: h0 */
    public ComponentCallbacksC0073g m1944h0(int i) {
        for (int size = this.f486e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(size);
            if (componentCallbacksC0073g != null && componentCallbacksC0073g.f429x == i) {
                return componentCallbacksC0073g;
            }
        }
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray != null) {
            for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                ComponentCallbacksC0073g valueAt = this.f487f.valueAt(size2);
                if (valueAt != null && valueAt.f429x == i) {
                    return valueAt;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public void m1943i(ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        if (f472F) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0073g);
        }
        m1916v0(componentCallbacksC0073g);
        if (componentCallbacksC0073g.f389B) {
            return;
        }
        if (this.f486e.contains(componentCallbacksC0073g)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0073g);
        }
        synchronized (this.f486e) {
            this.f486e.add(componentCallbacksC0073g);
        }
        componentCallbacksC0073g.f416k = true;
        componentCallbacksC0073g.f417l = false;
        if (componentCallbacksC0073g.f396I == null) {
            componentCallbacksC0073g.f402O = false;
        }
        if (componentCallbacksC0073g.f392E && componentCallbacksC0073g.f393F) {
            this.f499r = true;
        }
        if (z) {
            m2008E0(componentCallbacksC0073g);
        }
    }

    /* renamed from: i0 */
    public ComponentCallbacksC0073g m1942i0(String str) {
        if (str != null) {
            for (int size = this.f486e.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(size);
                if (componentCallbacksC0073g != null && str.equals(componentCallbacksC0073g.f431z)) {
                    return componentCallbacksC0073g;
                }
            }
        }
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0073g valueAt = this.f487f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f431z)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: j0 */
    public ComponentCallbacksC0073g m1940j0(String str) {
        ComponentCallbacksC0073g m2132g;
        SparseArray<ComponentCallbacksC0073g> sparseArray = this.f487f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0073g valueAt = this.f487f.valueAt(size);
            if (valueAt != null && (m2132g = valueAt.m2132g(str)) != null) {
                return m2132g;
            }
        }
        return null;
    }

    /* renamed from: k */
    public void m1939k(AbstractC0085k abstractC0085k, AbstractC0083i abstractC0083i, ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (this.f495n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f495n = abstractC0085k;
        this.f496o = abstractC0083i;
        this.f497p = componentCallbacksC0073g;
    }

    /* renamed from: l */
    public void m1937l(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (f472F) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0073g);
        }
        if (componentCallbacksC0073g.f389B) {
            componentCallbacksC0073g.f389B = false;
            if (componentCallbacksC0073g.f416k) {
                return;
            }
            if (this.f486e.contains(componentCallbacksC0073g)) {
                throw new IllegalStateException("Fragment already added: " + componentCallbacksC0073g);
            }
            if (f472F) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0073g);
            }
            synchronized (this.f486e) {
                this.f486e.add(componentCallbacksC0073g);
            }
            componentCallbacksC0073g.f416k = true;
            if (componentCallbacksC0073g.f392E && componentCallbacksC0073g.f393F) {
                this.f499r = true;
            }
        }
    }

    /* renamed from: m0 */
    public void m1934m0(int i) {
        synchronized (this) {
            this.f490i.set(i, null);
            if (this.f491j == null) {
                this.f491j = new ArrayList<>();
            }
            if (f472F) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f491j.add(Integer.valueOf(i));
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0101j.f531a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            String str2 = attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (ComponentCallbacksC0073g.m2175L(this.f495n.m2042e(), str2)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
                }
                ComponentCallbacksC0073g m1944h0 = resourceId != -1 ? m1944h0(resourceId) : null;
                if (m1944h0 == null && string != null) {
                    m1944h0 = m1942i0(string);
                }
                if (m1944h0 == null && id != -1) {
                    m1944h0 = m1944h0(id);
                }
                if (f472F) {
                    Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + m1944h0);
                }
                if (m1944h0 == null) {
                    m1944h0 = this.f496o.mo2073a(context, str2, null);
                    m1944h0.f418m = true;
                    m1944h0.f429x = resourceId != 0 ? resourceId : id;
                    m1944h0.f430y = id;
                    m1944h0.f431z = string;
                    m1944h0.f419n = true;
                    m1944h0.f423r = this;
                    AbstractC0085k abstractC0085k = this.f495n;
                    m1944h0.f424s = abstractC0085k;
                    m1944h0.m2133f0(abstractC0085k.m2042e(), attributeSet, m1944h0.f408c);
                    m1943i(m1944h0, true);
                } else if (m1944h0.f419n) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
                } else {
                    m1944h0.f419n = true;
                    AbstractC0085k abstractC0085k2 = this.f495n;
                    m1944h0.f424s = abstractC0085k2;
                    if (!m1944h0.f391D) {
                        m1944h0.m2133f0(abstractC0085k2.m2042e(), attributeSet, m1944h0.f408c);
                    }
                }
                ComponentCallbacksC0073g componentCallbacksC0073g = m1944h0;
                if (this.f494m >= 1 || !componentCallbacksC0073g.f418m) {
                    m2008E0(componentCallbacksC0073g);
                } else {
                    m2006F0(componentCallbacksC0073g, 1, 0, 0, false);
                }
                View view2 = componentCallbacksC0073g.f396I;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (componentCallbacksC0073g.f396I.getTag() == null) {
                        componentCallbacksC0073g.f396I.setTag(string);
                    }
                    return componentCallbacksC0073g.f396I;
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

    /* renamed from: p0 */
    public ComponentCallbacksC0073g m1928p0(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        ComponentCallbacksC0073g componentCallbacksC0073g = this.f487f.get(i);
        if (componentCallbacksC0073g == null) {
            m1951e1(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return componentCallbacksC0073g;
    }

    /* renamed from: q */
    void m1927q(ComponentCallbacksC0073g componentCallbacksC0073g) {
        Animator animator;
        if (componentCallbacksC0073g.f396I != null) {
            C0098g m1918u0 = m1918u0(componentCallbacksC0073g, componentCallbacksC0073g.m2102v(), !componentCallbacksC0073g.f388A, componentCallbacksC0073g.m2100w());
            if (m1918u0 == null || (animator = m1918u0.f525b) == null) {
                if (m1918u0 != null) {
                    m1968Y0(componentCallbacksC0073g.f396I, m1918u0);
                    componentCallbacksC0073g.f396I.startAnimation(m1918u0.f524a);
                    m1918u0.f524a.start();
                }
                componentCallbacksC0073g.f396I.setVisibility((!componentCallbacksC0073g.f388A || componentCallbacksC0073g.m2183H()) ? 0 : 8);
                if (componentCallbacksC0073g.m2183H()) {
                    componentCallbacksC0073g.m2152W0(false);
                }
            } else {
                animator.setTarget(componentCallbacksC0073g.f396I);
                if (!componentCallbacksC0073g.f388A) {
                    componentCallbacksC0073g.f396I.setVisibility(0);
                } else if (componentCallbacksC0073g.m2183H()) {
                    componentCallbacksC0073g.m2152W0(false);
                } else {
                    ViewGroup viewGroup = componentCallbacksC0073g.f395H;
                    View view = componentCallbacksC0073g.f396I;
                    viewGroup.startViewTransition(view);
                    m1918u0.f525b.addListener(new C0094d(viewGroup, view, componentCallbacksC0073g));
                }
                m1968Y0(componentCallbacksC0073g.f396I, m1918u0);
                m1918u0.f525b.start();
            }
        }
        if (componentCallbacksC0073g.f416k && componentCallbacksC0073g.f392E && componentCallbacksC0073g.f393F) {
            this.f499r = true;
        }
        componentCallbacksC0073g.f402O = false;
        componentCallbacksC0073g.m2137d0(componentCallbacksC0073g.f388A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public LayoutInflater.Factory2 m1926q0() {
        return this;
    }

    /* renamed from: r */
    public void m1925r(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (f472F) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0073g);
        }
        if (componentCallbacksC0073g.f389B) {
            return;
        }
        componentCallbacksC0073g.f389B = true;
        if (componentCallbacksC0073g.f416k) {
            if (f472F) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0073g);
            }
            synchronized (this.f486e) {
                this.f486e.remove(componentCallbacksC0073g);
            }
            if (componentCallbacksC0073g.f392E && componentCallbacksC0073g.f393F) {
                this.f499r = true;
            }
            componentCallbacksC0073g.f416k = false;
        }
    }

    /* renamed from: r0 */
    public ComponentCallbacksC0073g m1924r0() {
        return this.f498q;
    }

    /* renamed from: s */
    public void m1923s() {
        this.f500s = false;
        this.f501t = false;
        m1971X(2);
    }

    /* renamed from: s0 */
    public void m1922s0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (f472F) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0073g);
        }
        if (componentCallbacksC0073g.f388A) {
            return;
        }
        componentCallbacksC0073g.f388A = true;
        componentCallbacksC0073g.f402O = true ^ componentCallbacksC0073g.f402O;
    }

    /* renamed from: t */
    public void m1921t(Configuration configuration) {
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2101v0(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean m1920t0(int i) {
        return this.f494m >= i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f497p;
        if (obj == null) {
            obj = this.f495n;
        }
        C0450d.m540a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m1919u(MenuItem menuItem) {
        if (this.f494m < 1) {
            return false;
        }
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null && componentCallbacksC0073g.m2099w0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u0 */
    C0098g m1918u0(ComponentCallbacksC0073g componentCallbacksC0073g, int i, boolean z, int i2) {
        int m1948f1;
        int m2104u = componentCallbacksC0073g.m2104u();
        Animation m2157U = componentCallbacksC0073g.m2157U(i, z, m2104u);
        if (m2157U != null) {
            return new C0098g(m2157U, (RunnableC0090a) null);
        }
        Animator m2155V = componentCallbacksC0073g.m2155V(i, z, m2104u);
        if (m2155V != null) {
            return new C0098g(m2155V, (RunnableC0090a) null);
        }
        if (m2104u != 0) {
            boolean equals = "anim".equals(this.f495n.m2042e().getResources().getResourceTypeName(m2104u));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f495n.m2042e(), m2104u);
                    if (loadAnimation != null) {
                        return new C0098g(loadAnimation, (RunnableC0090a) null);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f495n.m2042e(), m2104u);
                    if (loadAnimator != null) {
                        return new C0098g(loadAnimator, (RunnableC0090a) null);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f495n.m2042e(), m2104u);
                    if (loadAnimation2 != null) {
                        return new C0098g(loadAnimation2, (RunnableC0090a) null);
                    }
                }
            }
        }
        if (i != 0 && (m1948f1 = m1948f1(i, z)) >= 0) {
            switch (m1948f1) {
                case 1:
                    return m1910y0(this.f495n.m2042e(), 1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    return m1910y0(this.f495n.m2042e(), 1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    return m1910y0(this.f495n.m2042e(), 0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    return m1910y0(this.f495n.m2042e(), 1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    return m1914w0(this.f495n.m2042e(), 0.0f, 1.0f);
                case 6:
                    return m1914w0(this.f495n.m2042e(), 1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.f495n.mo2035l()) {
                        this.f495n.mo2036k();
                    }
                    return null;
            }
        }
        return null;
    }

    /* renamed from: v */
    public void m1917v() {
        this.f500s = false;
        this.f501t = false;
        m1971X(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void m1916v0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g.f410e >= 0) {
            return;
        }
        int i = this.f485d;
        this.f485d = i + 1;
        componentCallbacksC0073g.m2150X0(i, this.f497p);
        if (this.f487f == null) {
            this.f487f = new SparseArray<>();
        }
        this.f487f.put(componentCallbacksC0073g.f410e, componentCallbacksC0073g);
        if (f472F) {
            Log.v("FragmentManager", "Allocated fragment index " + componentCallbacksC0073g);
        }
    }

    /* renamed from: w */
    public boolean m1915w(Menu menu, MenuInflater menuInflater) {
        if (this.f494m < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0073g> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null && componentCallbacksC0073g.m2095y0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0073g);
                z = true;
            }
        }
        if (this.f489h != null) {
            for (int i2 = 0; i2 < this.f489h.size(); i2++) {
                ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f489h.get(i2);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0073g2)) {
                    componentCallbacksC0073g2.m2147Z();
                }
            }
        }
        this.f489h = arrayList;
        return z;
    }

    /* renamed from: x */
    public void m1913x() {
        this.f502u = true;
        m1955d0();
        m1971X(0);
        this.f495n = null;
        this.f496o = null;
        this.f497p = null;
    }

    /* renamed from: x0 */
    void m1912x0(ComponentCallbacksC0073g componentCallbacksC0073g) {
        if (componentCallbacksC0073g.f410e < 0) {
            return;
        }
        if (f472F) {
            Log.v("FragmentManager", "Freeing fragment index " + componentCallbacksC0073g);
        }
        this.f487f.put(componentCallbacksC0073g.f410e, null);
        componentCallbacksC0073g.m2189E();
    }

    /* renamed from: y */
    public void m1911y() {
        m1971X(1);
    }

    /* renamed from: z */
    public void m1909z() {
        for (int i = 0; i < this.f486e.size(); i++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f486e.get(i);
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2188E0();
            }
        }
    }
}