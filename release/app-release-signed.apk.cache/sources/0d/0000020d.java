package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    static final j f1703a;

    /* loaded from: classes.dex */
    static class a extends j {
        a() {
        }

        @Override // o.o.j
        public boolean h(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // o.o.j
        public int e(View view) {
            return view.getMinimumHeight();
        }

        @Override // o.o.j
        public boolean i(View view) {
            return view.hasOverlappingRendering();
        }

        @Override // o.o.j
        public void m(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // o.o.j
        public void n(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override // o.o.j
        public void o(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        @Override // o.o.j
        public void p(View view) {
            view.requestFitSystemWindows();
        }

        @Override // o.o.j
        public void r(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // o.o.j
        public int d(View view) {
            return view.getLayoutDirection();
        }

        @Override // o.o.j
        public int g(View view) {
            return view.getWindowSystemUiVisibility();
        }
    }

    /* loaded from: classes.dex */
    static class d extends c {
        d() {
        }
    }

    /* loaded from: classes.dex */
    static class e extends d {
        e() {
        }

        @Override // o.o.j
        public boolean j(View view) {
            return view.isAttachedToWindow();
        }

        @Override // o.o.j
        public boolean k(View view) {
            return view.isLaidOut();
        }
    }

    /* loaded from: classes.dex */
    static class f extends e {

        /* loaded from: classes.dex */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f1704a;

            a(m mVar) {
                this.f1704a = mVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return (WindowInsets) w.f(this.f1704a.a(view, w.g(windowInsets)));
            }
        }

        f() {
        }

        @Override // o.o.j
        public ColorStateList b(View view) {
            return view.getBackgroundTintList();
        }

        @Override // o.o.j
        public PorterDuff.Mode c(View view) {
            return view.getBackgroundTintMode();
        }

        @Override // o.o.j
        public String f(View view) {
            return view.getTransitionName();
        }

        @Override // o.o.j
        public w l(View view, w wVar) {
            WindowInsets windowInsets = (WindowInsets) w.f(wVar);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return w.g(windowInsets);
        }

        @Override // o.o.b, o.o.j
        public void p(View view) {
            view.requestApplyInsets();
        }

        @Override // o.o.j
        public void s(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // o.o.j
        public void t(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // o.o.j
        public void u(View view, float f2) {
            view.setElevation(f2);
        }

        @Override // o.o.j
        public void v(View view, m mVar) {
            if (mVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(mVar));
            }
        }

        @Override // o.o.j
        public void x(View view, String str) {
            view.setTransitionName(str);
        }

        @Override // o.o.j
        public void y(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    static class g extends f {
        g() {
        }

        @Override // o.o.j
        public void w(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    /* loaded from: classes.dex */
    static class h extends g {
        h() {
        }
    }

    /* loaded from: classes.dex */
    static class i extends h {
        i() {
        }
    }

    /* loaded from: classes.dex */
    static class j {

        /* renamed from: b  reason: collision with root package name */
        private static WeakHashMap<View, String> f1706b;

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicInteger f1707c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        static boolean f1708d = false;

        /* renamed from: a  reason: collision with root package name */
        WeakHashMap<View, s> f1709a = null;

        j() {
        }

        public s a(View view) {
            if (this.f1709a == null) {
                this.f1709a = new WeakHashMap<>();
            }
            s sVar = this.f1709a.get(view);
            if (sVar == null) {
                s sVar2 = new s(view);
                this.f1709a.put(view, sVar2);
                return sVar2;
            }
            return sVar;
        }

        public ColorStateList b(View view) {
            if (view instanceof n) {
                return ((n) view).getSupportBackgroundTintList();
            }
            return null;
        }

        public PorterDuff.Mode c(View view) {
            if (view instanceof n) {
                return ((n) view).getSupportBackgroundTintMode();
            }
            return null;
        }

        public int d(View view) {
            throw null;
        }

        public int e(View view) {
            throw null;
        }

        public String f(View view) {
            WeakHashMap<View, String> weakHashMap = f1706b;
            if (weakHashMap == null) {
                return null;
            }
            return weakHashMap.get(view);
        }

        public int g(View view) {
            throw null;
        }

        public boolean h(View view) {
            throw null;
        }

        public boolean i(View view) {
            throw null;
        }

        public boolean j(View view) {
            throw null;
        }

        public boolean k(View view) {
            throw null;
        }

        public w l(View view, w wVar) {
            return wVar;
        }

        public void m(View view) {
            throw null;
        }

        public void n(View view, Runnable runnable) {
            throw null;
        }

        public void o(View view, Runnable runnable, long j2) {
            throw null;
        }

        public void p(View view) {
            throw null;
        }

        public void q(View view, o.b bVar) {
            view.setAccessibilityDelegate(bVar == null ? null : bVar.c());
        }

        public void r(View view, Drawable drawable) {
            throw null;
        }

        public void s(View view, ColorStateList colorStateList) {
            if (view instanceof n) {
                ((n) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void t(View view, PorterDuff.Mode mode) {
            if (view instanceof n) {
                ((n) view).setSupportBackgroundTintMode(mode);
            }
        }

        public void u(View view, float f2) {
        }

        public void v(View view, m mVar) {
        }

        public void w(View view, int i2, int i3) {
        }

        public void x(View view, String str) {
            if (f1706b == null) {
                f1706b = new WeakHashMap<>();
            }
            f1706b.put(view, str);
        }

        public void y(View view) {
            if (view instanceof o.h) {
                ((o.h) view).stopNestedScroll();
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1703a = i2 >= 26 ? new i() : i2 >= 24 ? new h() : i2 >= 23 ? new g() : i2 >= 21 ? new f() : new e();
    }

    public static s a(View view) {
        return f1703a.a(view);
    }

    public static ColorStateList b(View view) {
        return f1703a.b(view);
    }

    public static PorterDuff.Mode c(View view) {
        return f1703a.c(view);
    }

    public static int d(View view) {
        return f1703a.d(view);
    }

    public static int e(View view) {
        return f1703a.e(view);
    }

    public static String f(View view) {
        return f1703a.f(view);
    }

    public static int g(View view) {
        return f1703a.g(view);
    }

    public static boolean h(View view) {
        return f1703a.h(view);
    }

    public static boolean i(View view) {
        return f1703a.i(view);
    }

    public static boolean j(View view) {
        return f1703a.j(view);
    }

    public static boolean k(View view) {
        return f1703a.k(view);
    }

    public static w l(View view, w wVar) {
        return f1703a.l(view, wVar);
    }

    public static void m(View view) {
        f1703a.m(view);
    }

    public static void n(View view, Runnable runnable) {
        f1703a.n(view, runnable);
    }

    public static void o(View view, Runnable runnable, long j2) {
        f1703a.o(view, runnable, j2);
    }

    public static void p(View view) {
        f1703a.p(view);
    }

    public static void q(View view, o.b bVar) {
        f1703a.q(view, bVar);
    }

    public static void r(View view, Drawable drawable) {
        f1703a.r(view, drawable);
    }

    public static void s(View view, ColorStateList colorStateList) {
        f1703a.s(view, colorStateList);
    }

    public static void t(View view, PorterDuff.Mode mode) {
        f1703a.t(view, mode);
    }

    public static void u(View view, float f2) {
        f1703a.u(view, f2);
    }

    public static void v(View view, m mVar) {
        f1703a.v(view, mVar);
    }

    public static void w(View view, int i2, int i3) {
        f1703a.w(view, i2, i3);
    }

    public static void x(View view, String str) {
        f1703a.x(view, str);
    }

    public static void y(View view) {
        f1703a.y(view);
    }
}