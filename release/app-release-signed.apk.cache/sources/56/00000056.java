package android.support.p001v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.AbstractC0009c;
import android.arch.lifecycle.C0014f;
import android.arch.lifecycle.C0026n;
import android.arch.lifecycle.InterfaceC0013e;
import android.arch.lifecycle.InterfaceC0027o;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p015n.C0450d;
import p015n.C0462k;
import p016o.C0475e;

/* renamed from: android.support.v4.app.g */
/* loaded from: classes.dex */
public class ComponentCallbacksC0073g implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0013e, InterfaceC0027o {

    /* renamed from: T */
    private static final C0462k<String, Class<?>> f386T = new C0462k<>();

    /* renamed from: U */
    static final Object f387U = new Object();

    /* renamed from: A */
    boolean f388A;

    /* renamed from: B */
    boolean f389B;

    /* renamed from: C */
    boolean f390C;

    /* renamed from: D */
    boolean f391D;

    /* renamed from: E */
    boolean f392E;

    /* renamed from: G */
    boolean f394G;

    /* renamed from: H */
    ViewGroup f395H;

    /* renamed from: I */
    View f396I;

    /* renamed from: J */
    View f397J;

    /* renamed from: K */
    boolean f398K;

    /* renamed from: M */
    C0076c f400M;

    /* renamed from: N */
    boolean f401N;

    /* renamed from: O */
    boolean f402O;

    /* renamed from: P */
    float f403P;

    /* renamed from: Q */
    LayoutInflater f404Q;

    /* renamed from: R */
    boolean f405R;

    /* renamed from: c */
    Bundle f408c;

    /* renamed from: d */
    SparseArray<Parcelable> f409d;

    /* renamed from: f */
    String f411f;

    /* renamed from: g */
    Bundle f412g;

    /* renamed from: h */
    ComponentCallbacksC0073g f413h;

    /* renamed from: j */
    int f415j;

    /* renamed from: k */
    boolean f416k;

    /* renamed from: l */
    boolean f417l;

    /* renamed from: m */
    boolean f418m;

    /* renamed from: n */
    boolean f419n;

    /* renamed from: o */
    boolean f420o;

    /* renamed from: p */
    boolean f421p;

    /* renamed from: q */
    int f422q;

    /* renamed from: r */
    LayoutInflater$Factory2C0089m f423r;

    /* renamed from: s */
    AbstractC0085k f424s;

    /* renamed from: t */
    LayoutInflater$Factory2C0089m f425t;

    /* renamed from: u */
    C0104n f426u;

    /* renamed from: v */
    C0026n f427v;

    /* renamed from: w */
    ComponentCallbacksC0073g f428w;

    /* renamed from: x */
    int f429x;

    /* renamed from: y */
    int f430y;

    /* renamed from: z */
    String f431z;

    /* renamed from: b */
    int f407b = 0;

    /* renamed from: e */
    int f410e = -1;

    /* renamed from: i */
    int f414i = -1;

    /* renamed from: F */
    boolean f393F = true;

    /* renamed from: L */
    boolean f399L = true;

    /* renamed from: S */
    C0014f f406S = new C0014f(this);

    /* renamed from: android.support.v4.app.g$a */
    /* loaded from: classes.dex */
    class RunnableC0074a implements Runnable {
        RunnableC0074a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC0073g.this.m2138d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.g$b */
    /* loaded from: classes.dex */
    public class C0075b extends AbstractC0083i {
        C0075b() {
        }

        @Override // android.support.p001v4.app.AbstractC0083i
        /* renamed from: a */
        public ComponentCallbacksC0073g mo2073a(Context context, String str, Bundle bundle) {
            return ComponentCallbacksC0073g.this.f424s.mo2073a(context, str, bundle);
        }

        @Override // android.support.p001v4.app.AbstractC0083i
        /* renamed from: b */
        public View mo2072b(int i) {
            View view = ComponentCallbacksC0073g.this.f396I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.p001v4.app.AbstractC0083i
        /* renamed from: c */
        public boolean mo2071c() {
            return ComponentCallbacksC0073g.this.f396I != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.g$c */
    /* loaded from: classes.dex */
    public static class C0076c {

        /* renamed from: a */
        View f434a;

        /* renamed from: b */
        Animator f435b;

        /* renamed from: c */
        int f436c;

        /* renamed from: d */
        int f437d;

        /* renamed from: e */
        int f438e;

        /* renamed from: f */
        int f439f;

        /* renamed from: g */
        private Object f440g = null;

        /* renamed from: h */
        private Object f441h;

        /* renamed from: i */
        private Object f442i;

        /* renamed from: j */
        private Object f443j;

        /* renamed from: k */
        private Object f444k;

        /* renamed from: l */
        private Object f445l;

        /* renamed from: m */
        private Boolean f446m;

        /* renamed from: n */
        private Boolean f447n;

        /* renamed from: o */
        boolean f448o;

        /* renamed from: p */
        InterfaceC0078e f449p;

        /* renamed from: q */
        boolean f450q;

        C0076c() {
            Object obj = ComponentCallbacksC0073g.f387U;
            this.f441h = obj;
            this.f442i = null;
            this.f443j = obj;
            this.f444k = null;
            this.f445l = obj;
        }
    }

    /* renamed from: android.support.v4.app.g$d */
    /* loaded from: classes.dex */
    public static class C0077d extends RuntimeException {
        public C0077d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.g$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0078e {
        /* renamed from: a */
        void mo1906a();

        /* renamed from: b */
        void mo1905b();
    }

    /* renamed from: F */
    public static ComponentCallbacksC0073g m2187F(Context context, String str, Bundle bundle) {
        try {
            C0462k<String, Class<?>> c0462k = f386T;
            Class<?> cls = c0462k.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                c0462k.put(str, cls);
            }
            ComponentCallbacksC0073g componentCallbacksC0073g = (ComponentCallbacksC0073g) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC0073g.getClass().getClassLoader());
                componentCallbacksC0073g.m2154V0(bundle);
            }
            return componentCallbacksC0073g;
        } catch (ClassNotFoundException e) {
            throw new C0077d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0077d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0077d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0077d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0077d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static boolean m2175L(Context context, String str) {
        try {
            C0462k<String, Class<?>> c0462k = f386T;
            Class<?> cls = c0462k.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                c0462k.put(str, cls);
            }
            return ComponentCallbacksC0073g.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m2138d() {
        C0076c c0076c = this.f400M;
        InterfaceC0078e interfaceC0078e = null;
        if (c0076c != null) {
            c0076c.f448o = false;
            InterfaceC0078e interfaceC0078e2 = c0076c.f449p;
            c0076c.f449p = null;
            interfaceC0078e = interfaceC0078e2;
        }
        if (interfaceC0078e != null) {
            interfaceC0078e.mo1906a();
        }
    }

    /* renamed from: f */
    private C0076c m2134f() {
        if (this.f400M == null) {
            this.f400M = new C0076c();
        }
        return this.f400M;
    }

    /* renamed from: A */
    public Object m2197A() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f444k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void m2196A0() {
        this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_DESTROY);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1913x();
        }
        this.f407b = 0;
        this.f394G = false;
        this.f405R = false;
        m2149Y();
        if (this.f394G) {
            this.f425t = null;
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: B */
    public Object m2195B() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f445l == f387U ? m2197A() : this.f400M.f445l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void m2194B0() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1911y();
        }
        this.f407b = 1;
        this.f394G = false;
        m2145a0();
        if (this.f394G) {
            AbstractC0125u.m1829b(this).mo1828c();
            this.f421p = false;
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public int m2193C() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return 0;
        }
        return c0076c.f436c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void m2192C0() {
        this.f394G = false;
        m2143b0();
        this.f404Q = null;
        if (!this.f394G) {
            throw new C0129y("Fragment " + this + " did not call through to super.onDetach()");
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            if (this.f391D) {
                layoutInflater$Factory2C0089m.m1913x();
                this.f425t = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    /* renamed from: D */
    public View m2191D() {
        return this.f396I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public LayoutInflater m2190D0(Bundle bundle) {
        LayoutInflater m2140c0 = m2140c0(bundle);
        this.f404Q = m2140c0;
        return m2140c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m2189E() {
        this.f410e = -1;
        this.f411f = null;
        this.f416k = false;
        this.f417l = false;
        this.f418m = false;
        this.f419n = false;
        this.f420o = false;
        this.f422q = 0;
        this.f423r = null;
        this.f425t = null;
        this.f424s = null;
        this.f429x = 0;
        this.f430y = 0;
        this.f431z = null;
        this.f388A = false;
        this.f389B = false;
        this.f391D = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m2188E0() {
        onLowMemory();
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1909z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m2186F0(boolean z) {
        m2131g0(z);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2017A(z);
        }
    }

    /* renamed from: G */
    void m2185G() {
        if (this.f424s == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = new LayoutInflater$Factory2C0089m();
        this.f425t = layoutInflater$Factory2C0089m;
        layoutInflater$Factory2C0089m.m1939k(this.f424s, new C0075b(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean m2184G0(MenuItem menuItem) {
        if (this.f388A) {
            return false;
        }
        if (this.f392E && this.f393F && m2129h0(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        return layoutInflater$Factory2C0089m != null && layoutInflater$Factory2C0089m.m1987P(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m2183H() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return false;
        }
        return c0076c.f450q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void m2182H0(Menu menu) {
        if (this.f388A) {
            return;
        }
        if (this.f392E && this.f393F) {
            m2127i0(menu);
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1985Q(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean m2181I() {
        return this.f422q > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void m2180I0() {
        this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_PAUSE);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1983R();
        }
        this.f407b = 4;
        this.f394G = false;
        m2125j0();
        if (this.f394G) {
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m2179J() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return false;
        }
        return c0076c.f448o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void m2178J0(boolean z) {
        m2123k0(z);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1981S(z);
        }
    }

    /* renamed from: K */
    public final boolean m2177K() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f423r;
        if (layoutInflater$Factory2C0089m == null) {
            return false;
        }
        return layoutInflater$Factory2C0089m.mo1959c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m2176K0(Menu menu) {
        boolean z = false;
        if (this.f388A) {
            return false;
        }
        if (this.f392E && this.f393F) {
            m2121l0(menu);
            z = true;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        return layoutInflater$Factory2C0089m != null ? z | layoutInflater$Factory2C0089m.m1979T(menu) : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void m2174L0() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1977U();
        }
        this.f407b = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m2173M() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void m2172M0() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
            this.f425t.m1955d0();
        }
        this.f407b = 5;
        this.f394G = false;
        m2117n0();
        if (!this.f394G) {
            throw new C0129y("Fragment " + this + " did not call through to super.onResume()");
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m2 = this.f425t;
        if (layoutInflater$Factory2C0089m2 != null) {
            layoutInflater$Factory2C0089m2.m1975V();
            this.f425t.m1955d0();
        }
        this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_RESUME);
    }

    /* renamed from: N */
    public void m2171N(Bundle bundle) {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m2170N0(Bundle bundle) {
        Parcelable m1980S0;
        m2115o0(bundle);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m == null || (m1980S0 = layoutInflater$Factory2C0089m.m1980S0()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", m1980S0);
    }

    /* renamed from: O */
    public void m2169O(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m2168O0() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
            this.f425t.m1955d0();
        }
        this.f407b = 4;
        this.f394G = false;
        m2113p0();
        if (this.f394G) {
            LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m2 = this.f425t;
            if (layoutInflater$Factory2C0089m2 != null) {
                layoutInflater$Factory2C0089m2.m1973W();
            }
            this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_START);
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onStart()");
    }

    @Deprecated
    /* renamed from: P */
    public void m2167P(Activity activity) {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m2166P0() {
        this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_STOP);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1969Y();
        }
        this.f407b = 3;
        this.f394G = false;
        m2111q0();
        if (this.f394G) {
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: Q */
    public void m2165Q(Context context) {
        this.f394G = true;
        AbstractC0085k abstractC0085k = this.f424s;
        Activity m2043d = abstractC0085k == null ? null : abstractC0085k.m2043d();
        if (m2043d != null) {
            this.f394G = false;
            m2167P(m2043d);
        }
    }

    /* renamed from: Q0 */
    public final Context m2164Q0() {
        Context m2118n = m2118n();
        if (m2118n != null) {
            return m2118n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: R */
    public void m2163R(ComponentCallbacksC0073g componentCallbacksC0073g) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void m2162R0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f425t == null) {
            m2185G();
        }
        this.f425t.m1986P0(parcelable, this.f426u);
        this.f426u = null;
        this.f425t.m1917v();
    }

    /* renamed from: S */
    public boolean m2161S(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final void m2160S0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f409d;
        if (sparseArray != null) {
            this.f397J.restoreHierarchyState(sparseArray);
            this.f409d = null;
        }
        this.f394G = false;
        m2107s0(bundle);
        if (this.f394G) {
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    /* renamed from: T */
    public void m2159T(Bundle bundle) {
        this.f394G = true;
        m2162R0(bundle);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m == null || layoutInflater$Factory2C0089m.m1920t0(1)) {
            return;
        }
        this.f425t.m1917v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m2158T0(View view) {
        m2134f().f434a = view;
    }

    /* renamed from: U */
    public Animation m2157U(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m2156U0(Animator animator) {
        m2134f().f435b = animator;
    }

    /* renamed from: V */
    public Animator m2155V(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: V0 */
    public void m2154V0(Bundle bundle) {
        if (this.f410e >= 0 && m2177K()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f412g = bundle;
    }

    /* renamed from: W */
    public void m2153W(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void m2152W0(boolean z) {
        m2134f().f450q = z;
    }

    /* renamed from: X */
    public View m2151X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public final void m2150X0(int i, ComponentCallbacksC0073g componentCallbacksC0073g) {
        StringBuilder sb;
        String str;
        this.f410e = i;
        if (componentCallbacksC0073g != null) {
            sb = new StringBuilder();
            sb.append(componentCallbacksC0073g.f411f);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f410e);
        this.f411f = sb.toString();
    }

    /* renamed from: Y */
    public void m2149Y() {
        this.f394G = true;
        C0026n c0026n = this.f427v;
        if (c0026n == null || this.f424s.f471e.f500s) {
            return;
        }
        c0026n.m2352a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void m2148Y0(int i) {
        if (this.f400M == null && i == 0) {
            return;
        }
        m2134f().f437d = i;
    }

    /* renamed from: Z */
    public void m2147Z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void m2146Z0(int i, int i2) {
        if (this.f400M == null && i == 0 && i2 == 0) {
            return;
        }
        m2134f();
        C0076c c0076c = this.f400M;
        c0076c.f438e = i;
        c0076c.f439f = i2;
    }

    @Override // android.arch.lifecycle.InterfaceC0013e
    /* renamed from: a */
    public AbstractC0009c mo1819a() {
        return this.f406S;
    }

    /* renamed from: a0 */
    public void m2145a0() {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void m2144a1(InterfaceC0078e interfaceC0078e) {
        m2134f();
        C0076c c0076c = this.f400M;
        InterfaceC0078e interfaceC0078e2 = c0076c.f449p;
        if (interfaceC0078e == interfaceC0078e2) {
            return;
        }
        if (interfaceC0078e != null && interfaceC0078e2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0076c.f448o) {
            c0076c.f449p = interfaceC0078e;
        }
        if (interfaceC0078e != null) {
            interfaceC0078e.mo1905b();
        }
    }

    @Override // android.arch.lifecycle.InterfaceC0027o
    /* renamed from: b */
    public C0026n mo2084b() {
        if (m2118n() != null) {
            if (this.f427v == null) {
                this.f427v = new C0026n();
            }
            return this.f427v;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: b0 */
    public void m2143b0() {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void m2142b1(int i) {
        m2134f().f436c = i;
    }

    /* renamed from: c0 */
    public LayoutInflater m2140c0(Bundle bundle) {
        return m2106t(bundle);
    }

    /* renamed from: c1 */
    public void m2139c1() {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f423r;
        if (layoutInflater$Factory2C0089m == null || layoutInflater$Factory2C0089m.f495n == null) {
            m2134f().f448o = false;
        } else if (Looper.myLooper() != this.f423r.f495n.m2040g().getLooper()) {
            this.f423r.f495n.m2040g().postAtFrontOfQueue(new RunnableC0074a());
        } else {
            m2138d();
        }
    }

    /* renamed from: d0 */
    public void m2137d0(boolean z) {
    }

    /* renamed from: e */
    public void m2136e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f429x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f430y));
        printWriter.print(" mTag=");
        printWriter.println(this.f431z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f407b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f410e);
        printWriter.print(" mWho=");
        printWriter.print(this.f411f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f422q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f416k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f417l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f418m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f419n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f388A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f389B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f393F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f392E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f390C);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f391D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f399L);
        if (this.f423r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f423r);
        }
        if (this.f424s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f424s);
        }
        if (this.f428w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f428w);
        }
        if (this.f412g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f412g);
        }
        if (this.f408c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f408c);
        }
        if (this.f409d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f409d);
        }
        if (this.f413h != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f413h);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f415j);
        }
        if (m2104u() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m2104u());
        }
        if (this.f395H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f395H);
        }
        if (this.f396I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f396I);
        }
        if (this.f397J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f396I);
        }
        if (m2124k() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m2124k());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m2193C());
        }
        AbstractC0125u.m1829b(this).mo1830a(str, fileDescriptor, printWriter, strArr);
        if (this.f425t != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f425t + ":");
            LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
            layoutInflater$Factory2C0089m.mo1965a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    @Deprecated
    /* renamed from: e0 */
    public void m2135e0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f394G = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public void m2133f0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f394G = true;
        AbstractC0085k abstractC0085k = this.f424s;
        Activity m2043d = abstractC0085k == null ? null : abstractC0085k.m2043d();
        if (m2043d != null) {
            this.f394G = false;
            m2135e0(m2043d, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public ComponentCallbacksC0073g m2132g(String str) {
        if (str.equals(this.f411f)) {
            return this;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            return layoutInflater$Factory2C0089m.m1940j0(str);
        }
        return null;
    }

    /* renamed from: g0 */
    public void m2131g0(boolean z) {
    }

    /* renamed from: h */
    public final ActivityC0079h m2130h() {
        AbstractC0085k abstractC0085k = this.f424s;
        if (abstractC0085k == null) {
            return null;
        }
        return (ActivityC0079h) abstractC0085k.m2043d();
    }

    /* renamed from: h0 */
    public boolean m2129h0(MenuItem menuItem) {
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public boolean m2128i() {
        C0076c c0076c = this.f400M;
        if (c0076c == null || c0076c.f447n == null) {
            return true;
        }
        return this.f400M.f447n.booleanValue();
    }

    /* renamed from: i0 */
    public void m2127i0(Menu menu) {
    }

    /* renamed from: j */
    public boolean m2126j() {
        C0076c c0076c = this.f400M;
        if (c0076c == null || c0076c.f446m == null) {
            return true;
        }
        return this.f400M.f446m.booleanValue();
    }

    /* renamed from: j0 */
    public void m2125j0() {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public View m2124k() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f434a;
    }

    /* renamed from: k0 */
    public void m2123k0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Animator m2122l() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f435b;
    }

    /* renamed from: l0 */
    public void m2121l0(Menu menu) {
    }

    /* renamed from: m */
    public final AbstractC0086l m2120m() {
        if (this.f425t == null) {
            m2185G();
            int i = this.f407b;
            if (i >= 5) {
                this.f425t.m1975V();
            } else if (i >= 4) {
                this.f425t.m1973W();
            } else if (i >= 2) {
                this.f425t.m1923s();
            } else if (i >= 1) {
                this.f425t.m1917v();
            }
        }
        return this.f425t;
    }

    /* renamed from: m0 */
    public void m2119m0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: n */
    public Context m2118n() {
        AbstractC0085k abstractC0085k = this.f424s;
        if (abstractC0085k == null) {
            return null;
        }
        return abstractC0085k.m2042e();
    }

    /* renamed from: n0 */
    public void m2117n0() {
        this.f394G = true;
    }

    /* renamed from: o */
    public Object m2116o() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f440g;
    }

    /* renamed from: o0 */
    public void m2115o0(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f394G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m2130h().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public AbstractC0128x m2114p() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        Objects.requireNonNull(c0076c);
        return null;
    }

    /* renamed from: p0 */
    public void m2113p0() {
        this.f394G = true;
    }

    /* renamed from: q */
    public Object m2112q() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f442i;
    }

    /* renamed from: q0 */
    public void m2111q0() {
        this.f394G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public AbstractC0128x m2110r() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        Objects.requireNonNull(c0076c);
        return null;
    }

    /* renamed from: r0 */
    public void m2109r0(View view, Bundle bundle) {
    }

    /* renamed from: s */
    public final AbstractC0086l m2108s() {
        return this.f423r;
    }

    /* renamed from: s0 */
    public void m2107s0(Bundle bundle) {
        this.f394G = true;
    }

    @Deprecated
    /* renamed from: t */
    public LayoutInflater m2106t(Bundle bundle) {
        AbstractC0085k abstractC0085k = this.f424s;
        if (abstractC0085k != null) {
            LayoutInflater mo2037j = abstractC0085k.mo2037j();
            m2120m();
            C0475e.m454b(mo2037j, this.f425t.m1926q0());
            return mo2037j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public AbstractC0086l m2105t0() {
        return this.f425t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0450d.m540a(this, sb);
        if (this.f410e >= 0) {
            sb.append(" #");
            sb.append(this.f410e);
        }
        if (this.f429x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f429x));
        }
        if (this.f431z != null) {
            sb.append(" ");
            sb.append(this.f431z);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public int m2104u() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return 0;
        }
        return c0076c.f437d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void m2103u0(Bundle bundle) {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
        }
        this.f407b = 2;
        this.f394G = false;
        m2171N(bundle);
        if (this.f394G) {
            LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m2 = this.f425t;
            if (layoutInflater$Factory2C0089m2 != null) {
                layoutInflater$Factory2C0089m2.m1923s();
                return;
            }
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m2102v() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return 0;
        }
        return c0076c.f438e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void m2101v0(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m1921t(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public int m2100w() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return 0;
        }
        return c0076c.f439f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public boolean m2099w0(MenuItem menuItem) {
        if (this.f388A) {
            return false;
        }
        if (m2161S(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        return layoutInflater$Factory2C0089m != null && layoutInflater$Factory2C0089m.m1919u(menuItem);
    }

    /* renamed from: x */
    public Object m2098x() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f443j == f387U ? m2112q() : this.f400M.f443j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void m2097x0(Bundle bundle) {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
        }
        this.f407b = 1;
        this.f394G = false;
        m2159T(bundle);
        this.f405R = true;
        if (this.f394G) {
            this.f406S.m2373g(AbstractC0009c.EnumC0010a.ON_CREATE);
            return;
        }
        throw new C0129y("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: y */
    public final Resources m2096y() {
        return m2164Q0().getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public boolean m2095y0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f388A) {
            return false;
        }
        if (this.f392E && this.f393F) {
            m2153W(menu, menuInflater);
            z = true;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        return layoutInflater$Factory2C0089m != null ? z | layoutInflater$Factory2C0089m.m1915w(menu, menuInflater) : z;
    }

    /* renamed from: z */
    public Object m2094z() {
        C0076c c0076c = this.f400M;
        if (c0076c == null) {
            return null;
        }
        return c0076c.f441h == f387U ? m2116o() : this.f400M.f441h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public View m2093z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f425t;
        if (layoutInflater$Factory2C0089m != null) {
            layoutInflater$Factory2C0089m.m2004G0();
        }
        this.f421p = true;
        return m2151X(layoutInflater, viewGroup, bundle);
    }
}