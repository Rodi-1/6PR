package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.c;
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

/* loaded from: classes.dex */
public class g implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.e, android.arch.lifecycle.o {
    private static final n.k<String, Class<?>> T = new n.k<>();
    static final Object U = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    c M;
    boolean N;
    boolean O;
    float P;
    LayoutInflater Q;
    boolean R;

    /* renamed from: c  reason: collision with root package name */
    Bundle f281c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f282d;

    /* renamed from: f  reason: collision with root package name */
    String f284f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f285g;

    /* renamed from: h  reason: collision with root package name */
    g f286h;

    /* renamed from: j  reason: collision with root package name */
    int f288j;

    /* renamed from: k  reason: collision with root package name */
    boolean f289k;

    /* renamed from: l  reason: collision with root package name */
    boolean f290l;

    /* renamed from: m  reason: collision with root package name */
    boolean f291m;

    /* renamed from: n  reason: collision with root package name */
    boolean f292n;

    /* renamed from: o  reason: collision with root package name */
    boolean f293o;

    /* renamed from: p  reason: collision with root package name */
    boolean f294p;

    /* renamed from: q  reason: collision with root package name */
    int f295q;

    /* renamed from: r  reason: collision with root package name */
    m f296r;

    /* renamed from: s  reason: collision with root package name */
    k f297s;

    /* renamed from: t  reason: collision with root package name */
    m f298t;

    /* renamed from: u  reason: collision with root package name */
    n f299u;

    /* renamed from: v  reason: collision with root package name */
    android.arch.lifecycle.n f300v;

    /* renamed from: w  reason: collision with root package name */
    g f301w;
    int x;
    int y;
    String z;

    /* renamed from: b  reason: collision with root package name */
    int f280b = 0;

    /* renamed from: e  reason: collision with root package name */
    int f283e = -1;

    /* renamed from: i  reason: collision with root package name */
    int f287i = -1;
    boolean F = true;
    boolean L = true;
    android.arch.lifecycle.f S = new android.arch.lifecycle.f(this);

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i {
        b() {
        }

        @Override // android.support.v4.app.i
        public g a(Context context, String str, Bundle bundle) {
            return g.this.f297s.a(context, str, bundle);
        }

        @Override // android.support.v4.app.i
        public View b(int i2) {
            View view = g.this.I;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.v4.app.i
        public boolean c() {
            return g.this.I != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        View f304a;

        /* renamed from: b  reason: collision with root package name */
        Animator f305b;

        /* renamed from: c  reason: collision with root package name */
        int f306c;

        /* renamed from: d  reason: collision with root package name */
        int f307d;

        /* renamed from: e  reason: collision with root package name */
        int f308e;

        /* renamed from: f  reason: collision with root package name */
        int f309f;

        /* renamed from: g  reason: collision with root package name */
        private Object f310g = null;

        /* renamed from: h  reason: collision with root package name */
        private Object f311h;

        /* renamed from: i  reason: collision with root package name */
        private Object f312i;

        /* renamed from: j  reason: collision with root package name */
        private Object f313j;

        /* renamed from: k  reason: collision with root package name */
        private Object f314k;

        /* renamed from: l  reason: collision with root package name */
        private Object f315l;

        /* renamed from: m  reason: collision with root package name */
        private Boolean f316m;

        /* renamed from: n  reason: collision with root package name */
        private Boolean f317n;

        /* renamed from: o  reason: collision with root package name */
        boolean f318o;

        /* renamed from: p  reason: collision with root package name */
        e f319p;

        /* renamed from: q  reason: collision with root package name */
        boolean f320q;

        c() {
            Object obj = g.U;
            this.f311h = obj;
            this.f312i = null;
            this.f313j = obj;
            this.f314k = null;
            this.f315l = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    public static g F(Context context, String str, Bundle bundle) {
        try {
            n.k<String, Class<?>> kVar = T;
            Class<?> cls = kVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                kVar.put(str, cls);
            }
            g gVar = (g) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(gVar.getClass().getClassLoader());
                gVar.V0(bundle);
            }
            return gVar;
        } catch (ClassNotFoundException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L(Context context, String str) {
        try {
            n.k<String, Class<?>> kVar = T;
            Class<?> cls = kVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                kVar.put(str, cls);
            }
            return g.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        c cVar = this.M;
        e eVar = null;
        if (cVar != null) {
            cVar.f318o = false;
            e eVar2 = cVar.f319p;
            cVar.f319p = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.a();
        }
    }

    private c f() {
        if (this.M == null) {
            this.M = new c();
        }
        return this.M;
    }

    public Object A() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f314k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A0() {
        this.S.g(c.a.ON_DESTROY);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.x();
        }
        this.f280b = 0;
        this.G = false;
        this.R = false;
        Y();
        if (this.G) {
            this.f298t = null;
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public Object B() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f315l == U ? A() : this.M.f315l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B0() {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.y();
        }
        this.f280b = 1;
        this.G = false;
        a0();
        if (this.G) {
            u.b(this).c();
            this.f294p = false;
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C() {
        c cVar = this.M;
        if (cVar == null) {
            return 0;
        }
        return cVar.f306c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0() {
        this.G = false;
        b0();
        this.Q = null;
        if (!this.G) {
            throw new y("Fragment " + this + " did not call through to super.onDetach()");
        }
        m mVar = this.f298t;
        if (mVar != null) {
            if (this.D) {
                mVar.x();
                this.f298t = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    public View D() {
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater D0(Bundle bundle) {
        LayoutInflater c0 = c0(bundle);
        this.Q = c0;
        return c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        this.f283e = -1;
        this.f284f = null;
        this.f289k = false;
        this.f290l = false;
        this.f291m = false;
        this.f292n = false;
        this.f293o = false;
        this.f295q = 0;
        this.f296r = null;
        this.f298t = null;
        this.f297s = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
        this.D = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0() {
        onLowMemory();
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0(boolean z) {
        g0(z);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.A(z);
        }
    }

    void G() {
        if (this.f297s == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        m mVar = new m();
        this.f298t = mVar;
        mVar.k(this.f297s, new b(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && h0(menuItem)) {
            return true;
        }
        m mVar = this.f298t;
        return mVar != null && mVar.P(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        c cVar = this.M;
        if (cVar == null) {
            return false;
        }
        return cVar.f320q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(Menu menu) {
        if (this.A) {
            return;
        }
        if (this.E && this.F) {
            i0(menu);
        }
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.Q(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I() {
        return this.f295q > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0() {
        this.S.g(c.a.ON_PAUSE);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.R();
        }
        this.f280b = 4;
        this.G = false;
        j0();
        if (this.G) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J() {
        c cVar = this.M;
        if (cVar == null) {
            return false;
        }
        return cVar.f318o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(boolean z) {
        k0(z);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.S(z);
        }
    }

    public final boolean K() {
        m mVar = this.f296r;
        if (mVar == null) {
            return false;
        }
        return mVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K0(Menu menu) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            l0(menu);
            z = true;
        }
        m mVar = this.f298t;
        return mVar != null ? z | mVar.T(menu) : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0() {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.U();
        }
        this.f280b = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0() {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
            this.f298t.d0();
        }
        this.f280b = 5;
        this.G = false;
        n0();
        if (!this.G) {
            throw new y("Fragment " + this + " did not call through to super.onResume()");
        }
        m mVar2 = this.f298t;
        if (mVar2 != null) {
            mVar2.V();
            this.f298t.d0();
        }
        this.S.g(c.a.ON_RESUME);
    }

    public void N(Bundle bundle) {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(Bundle bundle) {
        Parcelable S0;
        o0(bundle);
        m mVar = this.f298t;
        if (mVar == null || (S0 = mVar.S0()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", S0);
    }

    public void O(int i2, int i3, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0() {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
            this.f298t.d0();
        }
        this.f280b = 4;
        this.G = false;
        p0();
        if (this.G) {
            m mVar2 = this.f298t;
            if (mVar2 != null) {
                mVar2.W();
            }
            this.S.g(c.a.ON_START);
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onStart()");
    }

    @Deprecated
    public void P(Activity activity) {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0() {
        this.S.g(c.a.ON_STOP);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.Y();
        }
        this.f280b = 3;
        this.G = false;
        q0();
        if (this.G) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Q(Context context) {
        this.G = true;
        k kVar = this.f297s;
        Activity d2 = kVar == null ? null : kVar.d();
        if (d2 != null) {
            this.G = false;
            P(d2);
        }
    }

    public final Context Q0() {
        Context n2 = n();
        if (n2 != null) {
            return n2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void R(g gVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f298t == null) {
            G();
        }
        this.f298t.P0(parcelable, this.f299u);
        this.f299u = null;
        this.f298t.v();
    }

    public boolean S(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f282d;
        if (sparseArray != null) {
            this.J.restoreHierarchyState(sparseArray);
            this.f282d = null;
        }
        this.G = false;
        s0(bundle);
        if (this.G) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void T(Bundle bundle) {
        this.G = true;
        R0(bundle);
        m mVar = this.f298t;
        if (mVar == null || mVar.t0(1)) {
            return;
        }
        this.f298t.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T0(View view) {
        f().f304a = view;
    }

    public Animation U(int i2, boolean z, int i3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(Animator animator) {
        f().f305b = animator;
    }

    public Animator V(int i2, boolean z, int i3) {
        return null;
    }

    public void V0(Bundle bundle) {
        if (this.f283e >= 0 && K()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f285g = bundle;
    }

    public void W(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(boolean z) {
        f().f320q = z;
    }

    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X0(int i2, g gVar) {
        StringBuilder sb;
        String str;
        this.f283e = i2;
        if (gVar != null) {
            sb = new StringBuilder();
            sb.append(gVar.f284f);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f283e);
        this.f284f = sb.toString();
    }

    public void Y() {
        this.G = true;
        android.arch.lifecycle.n nVar = this.f300v;
        if (nVar == null || this.f297s.f341e.f359s) {
            return;
        }
        nVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y0(int i2) {
        if (this.M == null && i2 == 0) {
            return;
        }
        f().f307d = i2;
    }

    public void Z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(int i2, int i3) {
        if (this.M == null && i2 == 0 && i3 == 0) {
            return;
        }
        f();
        c cVar = this.M;
        cVar.f308e = i2;
        cVar.f309f = i3;
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return this.S;
    }

    public void a0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(e eVar) {
        f();
        c cVar = this.M;
        e eVar2 = cVar.f319p;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (cVar.f318o) {
            cVar.f319p = eVar;
        }
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.arch.lifecycle.o
    public android.arch.lifecycle.n b() {
        if (n() != null) {
            if (this.f300v == null) {
                this.f300v = new android.arch.lifecycle.n();
            }
            return this.f300v;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void b0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(int i2) {
        f().f306c = i2;
    }

    public LayoutInflater c0(Bundle bundle) {
        return t(bundle);
    }

    public void c1() {
        m mVar = this.f296r;
        if (mVar == null || mVar.f354n == null) {
            f().f318o = false;
        } else if (Looper.myLooper() != this.f296r.f354n.g().getLooper()) {
            this.f296r.f354n.g().postAtFrontOfQueue(new a());
        } else {
            d();
        }
    }

    public void d0(boolean z) {
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f280b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f283e);
        printWriter.print(" mWho=");
        printWriter.print(this.f284f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f295q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f289k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f290l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f291m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f292n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mRetaining=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.f296r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f296r);
        }
        if (this.f297s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f297s);
        }
        if (this.f301w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f301w);
        }
        if (this.f285g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f285g);
        }
        if (this.f281c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f281c);
        }
        if (this.f282d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f282d);
        }
        if (this.f286h != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f286h);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f288j);
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(u());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.I);
        }
        if (k() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(k());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(C());
        }
        u.b(this).a(str, fileDescriptor, printWriter, strArr);
        if (this.f298t != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f298t + ":");
            m mVar = this.f298t;
            mVar.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    @Deprecated
    public void e0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        k kVar = this.f297s;
        Activity d2 = kVar == null ? null : kVar.d();
        if (d2 != null) {
            this.G = false;
            e0(d2, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g g(String str) {
        if (str.equals(this.f284f)) {
            return this;
        }
        m mVar = this.f298t;
        if (mVar != null) {
            return mVar.j0(str);
        }
        return null;
    }

    public void g0(boolean z) {
    }

    public final h h() {
        k kVar = this.f297s;
        if (kVar == null) {
            return null;
        }
        return (h) kVar.d();
    }

    public boolean h0(MenuItem menuItem) {
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        c cVar = this.M;
        if (cVar == null || cVar.f317n == null) {
            return true;
        }
        return this.M.f317n.booleanValue();
    }

    public void i0(Menu menu) {
    }

    public boolean j() {
        c cVar = this.M;
        if (cVar == null || cVar.f316m == null) {
            return true;
        }
        return this.M.f316m.booleanValue();
    }

    public void j0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View k() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f304a;
    }

    public void k0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator l() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f305b;
    }

    public void l0(Menu menu) {
    }

    public final l m() {
        if (this.f298t == null) {
            G();
            int i2 = this.f280b;
            if (i2 >= 5) {
                this.f298t.V();
            } else if (i2 >= 4) {
                this.f298t.W();
            } else if (i2 >= 2) {
                this.f298t.s();
            } else if (i2 >= 1) {
                this.f298t.v();
            }
        }
        return this.f298t;
    }

    public void m0(int i2, String[] strArr, int[] iArr) {
    }

    public Context n() {
        k kVar = this.f297s;
        if (kVar == null) {
            return null;
        }
        return kVar.e();
    }

    public void n0() {
        this.G = true;
    }

    public Object o() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f310g;
    }

    public void o0(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        h().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x p() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        Objects.requireNonNull(cVar);
        return null;
    }

    public void p0() {
        this.G = true;
    }

    public Object q() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f312i;
    }

    public void q0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x r() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        Objects.requireNonNull(cVar);
        return null;
    }

    public void r0(View view, Bundle bundle) {
    }

    public final l s() {
        return this.f296r;
    }

    public void s0(Bundle bundle) {
        this.G = true;
    }

    @Deprecated
    public LayoutInflater t(Bundle bundle) {
        k kVar = this.f297s;
        if (kVar != null) {
            LayoutInflater j2 = kVar.j();
            m();
            o.e.b(j2, this.f298t.q0());
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l t0() {
        return this.f298t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        n.d.a(this, sb);
        if (this.f283e >= 0) {
            sb.append(" #");
            sb.append(this.f283e);
        }
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" ");
            sb.append(this.z);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        c cVar = this.M;
        if (cVar == null) {
            return 0;
        }
        return cVar.f307d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u0(Bundle bundle) {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
        }
        this.f280b = 2;
        this.G = false;
        N(bundle);
        if (this.G) {
            m mVar2 = this.f298t;
            if (mVar2 != null) {
                mVar2.s();
                return;
            }
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v() {
        c cVar = this.M;
        if (cVar == null) {
            return 0;
        }
        return cVar.f308e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v0(Configuration configuration) {
        onConfigurationChanged(configuration);
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.t(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int w() {
        c cVar = this.M;
        if (cVar == null) {
            return 0;
        }
        return cVar.f309f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (S(menuItem)) {
            return true;
        }
        m mVar = this.f298t;
        return mVar != null && mVar.u(menuItem);
    }

    public Object x() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f313j == U ? q() : this.M.f313j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x0(Bundle bundle) {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
        }
        this.f280b = 1;
        this.G = false;
        T(bundle);
        this.R = true;
        if (this.G) {
            this.S.g(c.a.ON_CREATE);
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final Resources y() {
        return Q0().getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            W(menu, menuInflater);
            z = true;
        }
        m mVar = this.f298t;
        return mVar != null ? z | mVar.w(menu, menuInflater) : z;
    }

    public Object z() {
        c cVar = this.M;
        if (cVar == null) {
            return null;
        }
        return cVar.f311h == U ? o() : this.M.f311h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m mVar = this.f298t;
        if (mVar != null) {
            mVar.G0();
        }
        this.f294p = true;
        return X(layoutInflater, viewGroup, bundle);
    }
}