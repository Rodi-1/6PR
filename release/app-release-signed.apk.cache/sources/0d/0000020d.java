package p016o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.o */
/* loaded from: classes.dex */
public class C0490o {

    /* renamed from: a */
    static final C0501j f2221a;

    /* renamed from: o.o$a */
    /* loaded from: classes.dex */
    static class C0491a extends C0501j {
        C0491a() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: h */
        public boolean mo379h(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: o.o$b */
    /* loaded from: classes.dex */
    static class C0492b extends C0491a {
        C0492b() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: e */
        public int mo382e(View view) {
            return view.getMinimumHeight();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: i */
        public boolean mo378i(View view) {
            return view.hasOverlappingRendering();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: m */
        public void mo374m(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: n */
        public void mo373n(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: o */
        public void mo372o(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: p */
        public void mo371p(View view) {
            view.requestFitSystemWindows();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: r */
        public void mo369r(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    /* renamed from: o.o$c */
    /* loaded from: classes.dex */
    static class C0493c extends C0492b {
        C0493c() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: d */
        public int mo383d(View view) {
            return view.getLayoutDirection();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: g */
        public int mo380g(View view) {
            return view.getWindowSystemUiVisibility();
        }
    }

    /* renamed from: o.o$d */
    /* loaded from: classes.dex */
    static class C0494d extends C0493c {
        C0494d() {
        }
    }

    /* renamed from: o.o$e */
    /* loaded from: classes.dex */
    static class C0495e extends C0494d {
        C0495e() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: j */
        public boolean mo377j(View view) {
            return view.isAttachedToWindow();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: k */
        public boolean mo376k(View view) {
            return view.isLaidOut();
        }
    }

    /* renamed from: o.o$f */
    /* loaded from: classes.dex */
    static class C0496f extends C0495e {

        /* renamed from: o.o$f$a */
        /* loaded from: classes.dex */
        class View$OnApplyWindowInsetsListenerC0497a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0488m f2222a;

            View$OnApplyWindowInsetsListenerC0497a(InterfaceC0488m interfaceC0488m) {
                this.f2222a = interfaceC0488m;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return (WindowInsets) C0517w.m327f(this.f2222a.mo192a(view, C0517w.m326g(windowInsets)));
            }
        }

        C0496f() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: b */
        public ColorStateList mo385b(View view) {
            return view.getBackgroundTintList();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: c */
        public PorterDuff.Mode mo384c(View view) {
            return view.getBackgroundTintMode();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: f */
        public String mo381f(View view) {
            return view.getTransitionName();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: l */
        public C0517w mo375l(View view, C0517w c0517w) {
            WindowInsets windowInsets = (WindowInsets) C0517w.m327f(c0517w);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return C0517w.m326g(windowInsets);
        }

        @Override // p016o.C0490o.C0492b, p016o.C0490o.C0501j
        /* renamed from: p */
        public void mo371p(View view) {
            view.requestApplyInsets();
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: s */
        public void mo368s(View view, ColorStateList colorStateList) {
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

        @Override // p016o.C0490o.C0501j
        /* renamed from: t */
        public void mo367t(View view, PorterDuff.Mode mode) {
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

        @Override // p016o.C0490o.C0501j
        /* renamed from: u */
        public void mo366u(View view, float f) {
            view.setElevation(f);
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: v */
        public void mo365v(View view, InterfaceC0488m interfaceC0488m) {
            if (interfaceC0488m == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0497a(interfaceC0488m));
            }
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: x */
        public void mo363x(View view, String str) {
            view.setTransitionName(str);
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: y */
        public void mo362y(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: o.o$g */
    /* loaded from: classes.dex */
    static class C0498g extends C0496f {
        C0498g() {
        }

        @Override // p016o.C0490o.C0501j
        /* renamed from: w */
        public void mo364w(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: o.o$h */
    /* loaded from: classes.dex */
    static class C0499h extends C0498g {
        C0499h() {
        }
    }

    /* renamed from: o.o$i */
    /* loaded from: classes.dex */
    static class C0500i extends C0499h {
        C0500i() {
        }
    }

    /* renamed from: o.o$j */
    /* loaded from: classes.dex */
    static class C0501j {

        /* renamed from: b */
        private static WeakHashMap<View, String> f2224b;

        /* renamed from: c */
        private static final AtomicInteger f2225c = new AtomicInteger(1);

        /* renamed from: d */
        static boolean f2226d = false;

        /* renamed from: a */
        WeakHashMap<View, C0511s> f2227a = null;

        C0501j() {
        }

        /* renamed from: a */
        public C0511s m386a(View view) {
            if (this.f2227a == null) {
                this.f2227a = new WeakHashMap<>();
            }
            C0511s c0511s = this.f2227a.get(view);
            if (c0511s == null) {
                C0511s c0511s2 = new C0511s(view);
                this.f2227a.put(view, c0511s2);
                return c0511s2;
            }
            return c0511s;
        }

        /* renamed from: b */
        public ColorStateList mo385b(View view) {
            if (view instanceof InterfaceC0489n) {
                return ((InterfaceC0489n) view).getSupportBackgroundTintList();
            }
            return null;
        }

        /* renamed from: c */
        public PorterDuff.Mode mo384c(View view) {
            if (view instanceof InterfaceC0489n) {
                return ((InterfaceC0489n) view).getSupportBackgroundTintMode();
            }
            return null;
        }

        /* renamed from: d */
        public int mo383d(View view) {
            throw null;
        }

        /* renamed from: e */
        public int mo382e(View view) {
            throw null;
        }

        /* renamed from: f */
        public String mo381f(View view) {
            WeakHashMap<View, String> weakHashMap = f2224b;
            if (weakHashMap == null) {
                return null;
            }
            return weakHashMap.get(view);
        }

        /* renamed from: g */
        public int mo380g(View view) {
            throw null;
        }

        /* renamed from: h */
        public boolean mo379h(View view) {
            throw null;
        }

        /* renamed from: i */
        public boolean mo378i(View view) {
            throw null;
        }

        /* renamed from: j */
        public boolean mo377j(View view) {
            throw null;
        }

        /* renamed from: k */
        public boolean mo376k(View view) {
            throw null;
        }

        /* renamed from: l */
        public C0517w mo375l(View view, C0517w c0517w) {
            return c0517w;
        }

        /* renamed from: m */
        public void mo374m(View view) {
            throw null;
        }

        /* renamed from: n */
        public void mo373n(View view, Runnable runnable) {
            throw null;
        }

        /* renamed from: o */
        public void mo372o(View view, Runnable runnable, long j) {
            throw null;
        }

        /* renamed from: p */
        public void mo371p(View view) {
            throw null;
        }

        /* renamed from: q */
        public void m370q(View view, C0467b c0467b) {
            view.setAccessibilityDelegate(c0467b == null ? null : c0467b.m469c());
        }

        /* renamed from: r */
        public void mo369r(View view, Drawable drawable) {
            throw null;
        }

        /* renamed from: s */
        public void mo368s(View view, ColorStateList colorStateList) {
            if (view instanceof InterfaceC0489n) {
                ((InterfaceC0489n) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: t */
        public void mo367t(View view, PorterDuff.Mode mode) {
            if (view instanceof InterfaceC0489n) {
                ((InterfaceC0489n) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: u */
        public void mo366u(View view, float f) {
        }

        /* renamed from: v */
        public void mo365v(View view, InterfaceC0488m interfaceC0488m) {
        }

        /* renamed from: w */
        public void mo364w(View view, int i, int i2) {
        }

        /* renamed from: x */
        public void mo363x(View view, String str) {
            if (f2224b == null) {
                f2224b = new WeakHashMap<>();
            }
            f2224b.put(view, str);
        }

        /* renamed from: y */
        public void mo362y(View view) {
            if (view instanceof InterfaceC0483h) {
                ((InterfaceC0483h) view).stopNestedScroll();
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2221a = i >= 26 ? new C0500i() : i >= 24 ? new C0499h() : i >= 23 ? new C0498g() : i >= 21 ? new C0496f() : new C0495e();
    }

    /* renamed from: a */
    public static C0511s m411a(View view) {
        return f2221a.m386a(view);
    }

    /* renamed from: b */
    public static ColorStateList m410b(View view) {
        return f2221a.mo385b(view);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m409c(View view) {
        return f2221a.mo384c(view);
    }

    /* renamed from: d */
    public static int m408d(View view) {
        return f2221a.mo383d(view);
    }

    /* renamed from: e */
    public static int m407e(View view) {
        return f2221a.mo382e(view);
    }

    /* renamed from: f */
    public static String m406f(View view) {
        return f2221a.mo381f(view);
    }

    /* renamed from: g */
    public static int m405g(View view) {
        return f2221a.mo380g(view);
    }

    /* renamed from: h */
    public static boolean m404h(View view) {
        return f2221a.mo379h(view);
    }

    /* renamed from: i */
    public static boolean m403i(View view) {
        return f2221a.mo378i(view);
    }

    /* renamed from: j */
    public static boolean m402j(View view) {
        return f2221a.mo377j(view);
    }

    /* renamed from: k */
    public static boolean m401k(View view) {
        return f2221a.mo376k(view);
    }

    /* renamed from: l */
    public static C0517w m400l(View view, C0517w c0517w) {
        return f2221a.mo375l(view, c0517w);
    }

    /* renamed from: m */
    public static void m399m(View view) {
        f2221a.mo374m(view);
    }

    /* renamed from: n */
    public static void m398n(View view, Runnable runnable) {
        f2221a.mo373n(view, runnable);
    }

    /* renamed from: o */
    public static void m397o(View view, Runnable runnable, long j) {
        f2221a.mo372o(view, runnable, j);
    }

    /* renamed from: p */
    public static void m396p(View view) {
        f2221a.mo371p(view);
    }

    /* renamed from: q */
    public static void m395q(View view, C0467b c0467b) {
        f2221a.m370q(view, c0467b);
    }

    /* renamed from: r */
    public static void m394r(View view, Drawable drawable) {
        f2221a.mo369r(view, drawable);
    }

    /* renamed from: s */
    public static void m393s(View view, ColorStateList colorStateList) {
        f2221a.mo368s(view, colorStateList);
    }

    /* renamed from: t */
    public static void m392t(View view, PorterDuff.Mode mode) {
        f2221a.mo367t(view, mode);
    }

    /* renamed from: u */
    public static void m391u(View view, float f) {
        f2221a.mo366u(view, f);
    }

    /* renamed from: v */
    public static void m390v(View view, InterfaceC0488m interfaceC0488m) {
        f2221a.mo365v(view, interfaceC0488m);
    }

    /* renamed from: w */
    public static void m389w(View view, int i, int i2) {
        f2221a.mo364w(view, i, i2);
    }

    /* renamed from: x */
    public static void m388x(View view, String str) {
        f2221a.mo363x(view, str);
    }

    /* renamed from: y */
    public static void m387y(View view) {
        f2221a.mo362y(view);
    }
}