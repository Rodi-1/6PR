package r;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.view.menu.e;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.d0;
import android.support.v7.widget.o0;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.s;
import o.t;
import o.u;
import o.v;
import r.a;
import v.b;

/* loaded from: classes.dex */
public class o extends r.a implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;

    /* renamed from: a  reason: collision with root package name */
    Context f1833a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1834b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f1835c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f1836d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarOverlayLayout f1837e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContainer f1838f;

    /* renamed from: g  reason: collision with root package name */
    d0 f1839g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContextView f1840h;

    /* renamed from: i  reason: collision with root package name */
    View f1841i;

    /* renamed from: j  reason: collision with root package name */
    o0 f1842j;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1845m;

    /* renamed from: n  reason: collision with root package name */
    d f1846n;

    /* renamed from: o  reason: collision with root package name */
    v.b f1847o;

    /* renamed from: p  reason: collision with root package name */
    b.a f1848p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1849q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1851s;

    /* renamed from: v  reason: collision with root package name */
    boolean f1854v;

    /* renamed from: w  reason: collision with root package name */
    boolean f1855w;
    private boolean x;
    v.h z;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Object> f1843k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f1844l = -1;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<a.b> f1850r = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private int f1852t = 0;

    /* renamed from: u  reason: collision with root package name */
    boolean f1853u = true;
    private boolean y = true;
    final t C = new a();
    final t D = new b();
    final v E = new c();

    /* loaded from: classes.dex */
    class a extends u {
        a() {
        }

        @Override // o.t
        public void a(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.f1853u && (view2 = oVar.f1841i) != null) {
                view2.setTranslationY(0.0f);
                o.this.f1838f.setTranslationY(0.0f);
            }
            o.this.f1838f.setVisibility(8);
            o.this.f1838f.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.z = null;
            oVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f1837e;
            if (actionBarOverlayLayout != null) {
                o.o.p(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends u {
        b() {
        }

        @Override // o.t
        public void a(View view) {
            o oVar = o.this;
            oVar.z = null;
            oVar.f1838f.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements v {
        c() {
        }

        @Override // o.v
        public void a(View view) {
            ((View) o.this.f1838f.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends v.b implements e.a {

        /* renamed from: d  reason: collision with root package name */
        private final Context f1859d;

        /* renamed from: e  reason: collision with root package name */
        private final android.support.v7.view.menu.e f1860e;

        /* renamed from: f  reason: collision with root package name */
        private b.a f1861f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f1862g;

        public d(Context context, b.a aVar) {
            this.f1859d = context;
            this.f1861f = aVar;
            android.support.v7.view.menu.e S = new android.support.v7.view.menu.e(context).S(1);
            this.f1860e = S;
            S.R(this);
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            if (this.f1861f == null) {
                return;
            }
            k();
            o.this.f1840h.l();
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f1861f;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // v.b
        public void c() {
            o oVar = o.this;
            if (oVar.f1846n != this) {
                return;
            }
            if (o.w(oVar.f1854v, oVar.f1855w, false)) {
                this.f1861f.b(this);
            } else {
                o oVar2 = o.this;
                oVar2.f1847o = this;
                oVar2.f1848p = this.f1861f;
            }
            this.f1861f = null;
            o.this.v(false);
            o.this.f1840h.g();
            o.this.f1839g.p().sendAccessibilityEvent(32);
            o oVar3 = o.this;
            oVar3.f1837e.setHideOnContentScrollEnabled(oVar3.B);
            o.this.f1846n = null;
        }

        @Override // v.b
        public View d() {
            WeakReference<View> weakReference = this.f1862g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // v.b
        public Menu e() {
            return this.f1860e;
        }

        @Override // v.b
        public MenuInflater f() {
            return new v.g(this.f1859d);
        }

        @Override // v.b
        public CharSequence g() {
            return o.this.f1840h.getSubtitle();
        }

        @Override // v.b
        public CharSequence i() {
            return o.this.f1840h.getTitle();
        }

        @Override // v.b
        public void k() {
            if (o.this.f1846n != this) {
                return;
            }
            this.f1860e.d0();
            try {
                this.f1861f.c(this, this.f1860e);
            } finally {
                this.f1860e.c0();
            }
        }

        @Override // v.b
        public boolean l() {
            return o.this.f1840h.j();
        }

        @Override // v.b
        public void m(View view) {
            o.this.f1840h.setCustomView(view);
            this.f1862g = new WeakReference<>(view);
        }

        @Override // v.b
        public void n(int i2) {
            o(o.this.f1833a.getResources().getString(i2));
        }

        @Override // v.b
        public void o(CharSequence charSequence) {
            o.this.f1840h.setSubtitle(charSequence);
        }

        @Override // v.b
        public void q(int i2) {
            r(o.this.f1833a.getResources().getString(i2));
        }

        @Override // v.b
        public void r(CharSequence charSequence) {
            o.this.f1840h.setTitle(charSequence);
        }

        @Override // v.b
        public void s(boolean z) {
            super.s(z);
            o.this.f1840h.setTitleOptional(z);
        }

        public boolean t() {
            this.f1860e.d0();
            try {
                return this.f1861f.a(this, this.f1860e);
            } finally {
                this.f1860e.c0();
            }
        }
    }

    public o(Activity activity, boolean z) {
        this.f1835c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z) {
            return;
        }
        this.f1841i = decorView.findViewById(16908290);
    }

    public o(Dialog dialog) {
        this.f1836d = dialog;
        D(dialog.getWindow().getDecorView());
    }

    private d0 A(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    private void C() {
        if (this.x) {
            this.x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1837e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(s.f.decor_content_parent);
        this.f1837e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1839g = A(view.findViewById(s.f.action_bar));
        this.f1840h = (ActionBarContextView) view.findViewById(s.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(s.f.action_bar_container);
        this.f1838f = actionBarContainer;
        d0 d0Var = this.f1839g;
        if (d0Var == null || this.f1840h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1833a = d0Var.t();
        boolean z = (this.f1839g.k() & 4) != 0;
        if (z) {
            this.f1845m = true;
        }
        v.a b2 = v.a.b(this.f1833a);
        J(b2.a() || z);
        H(b2.g());
        TypedArray obtainStyledAttributes = this.f1833a.obtainStyledAttributes(null, s.j.f1864a, s.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(s.j.f1874k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(s.j.f1872i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z) {
        this.f1851s = z;
        if (z) {
            this.f1838f.setTabContainer(null);
            this.f1839g.i(this.f1842j);
        } else {
            this.f1839g.i(null);
            this.f1838f.setTabContainer(this.f1842j);
        }
        boolean z2 = true;
        boolean z3 = B() == 2;
        o0 o0Var = this.f1842j;
        if (o0Var != null) {
            if (z3) {
                o0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1837e;
                if (actionBarOverlayLayout != null) {
                    o.o.p(actionBarOverlayLayout);
                }
            } else {
                o0Var.setVisibility(8);
            }
        }
        this.f1839g.s(!this.f1851s && z3);
        this.f1837e.setHasNonEmbeddedTabs((this.f1851s || !z3) ? false : false);
    }

    private boolean K() {
        return o.o.k(this.f1838f);
    }

    private void L() {
        if (this.x) {
            return;
        }
        this.x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1837e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z) {
        if (w(this.f1854v, this.f1855w, this.x)) {
            if (this.y) {
                return;
            }
            this.y = true;
            z(z);
        } else if (this.y) {
            this.y = false;
            y(z);
        }
    }

    static boolean w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public int B() {
        return this.f1839g.v();
    }

    public void E(boolean z) {
        F(z ? 4 : 0, 4);
    }

    public void F(int i2, int i3) {
        int k2 = this.f1839g.k();
        if ((i3 & 4) != 0) {
            this.f1845m = true;
        }
        this.f1839g.u((i2 & i3) | ((i3 ^ (-1)) & k2));
    }

    public void G(float f2) {
        o.o.u(this.f1838f, f2);
    }

    public void I(boolean z) {
        if (z && !this.f1837e.v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z;
        this.f1837e.setHideOnContentScrollEnabled(z);
    }

    public void J(boolean z) {
        this.f1839g.q(z);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a() {
        v.h hVar = this.z;
        if (hVar != null) {
            hVar.a();
            this.z = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void b(boolean z) {
        this.f1853u = z;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void c(int i2) {
        this.f1852t = i2;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f1855w) {
            return;
        }
        this.f1855w = true;
        M(true);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f1855w) {
            this.f1855w = false;
            M(true);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // r.a
    public boolean h() {
        d0 d0Var = this.f1839g;
        if (d0Var == null || !d0Var.n()) {
            return false;
        }
        this.f1839g.collapseActionView();
        return true;
    }

    @Override // r.a
    public void i(boolean z) {
        if (z == this.f1849q) {
            return;
        }
        this.f1849q = z;
        int size = this.f1850r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1850r.get(i2).a(z);
        }
    }

    @Override // r.a
    public int j() {
        return this.f1839g.k();
    }

    @Override // r.a
    public Context k() {
        if (this.f1834b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1833a.getTheme().resolveAttribute(s.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1834b = new ContextThemeWrapper(this.f1833a, i2);
            } else {
                this.f1834b = this.f1833a;
            }
        }
        return this.f1834b;
    }

    @Override // r.a
    public void m(Configuration configuration) {
        H(v.a.b(this.f1833a).g());
    }

    @Override // r.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.f1846n;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        e2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    @Override // r.a
    public void r(boolean z) {
        if (this.f1845m) {
            return;
        }
        E(z);
    }

    @Override // r.a
    public void s(boolean z) {
        v.h hVar;
        this.A = z;
        if (z || (hVar = this.z) == null) {
            return;
        }
        hVar.a();
    }

    @Override // r.a
    public void t(CharSequence charSequence) {
        this.f1839g.setWindowTitle(charSequence);
    }

    @Override // r.a
    public v.b u(b.a aVar) {
        d dVar = this.f1846n;
        if (dVar != null) {
            dVar.c();
        }
        this.f1837e.setHideOnContentScrollEnabled(false);
        this.f1840h.k();
        d dVar2 = new d(this.f1840h.getContext(), aVar);
        if (dVar2.t()) {
            this.f1846n = dVar2;
            dVar2.k();
            this.f1840h.h(dVar2);
            v(true);
            this.f1840h.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void v(boolean z) {
        s j2;
        s f2;
        if (z) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z) {
                this.f1839g.l(4);
                this.f1840h.setVisibility(0);
                return;
            }
            this.f1839g.l(0);
            this.f1840h.setVisibility(8);
            return;
        }
        if (z) {
            f2 = this.f1839g.j(4, 100L);
            j2 = this.f1840h.f(0, 200L);
        } else {
            j2 = this.f1839g.j(0, 200L);
            f2 = this.f1840h.f(8, 100L);
        }
        v.h hVar = new v.h();
        hVar.d(f2, j2);
        hVar.h();
    }

    void x() {
        b.a aVar = this.f1848p;
        if (aVar != null) {
            aVar.b(this.f1847o);
            this.f1847o = null;
            this.f1848p = null;
        }
    }

    public void y(boolean z) {
        View view;
        int[] iArr;
        v.h hVar = this.z;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f1852t != 0 || (!this.A && !z)) {
            this.C.a(null);
            return;
        }
        this.f1838f.setAlpha(1.0f);
        this.f1838f.setTransitioning(true);
        v.h hVar2 = new v.h();
        float f2 = -this.f1838f.getHeight();
        if (z) {
            this.f1838f.getLocationInWindow(new int[]{0, 0});
            f2 -= iArr[1];
        }
        s k2 = o.o.a(this.f1838f).k(f2);
        k2.i(this.E);
        hVar2.c(k2);
        if (this.f1853u && (view = this.f1841i) != null) {
            hVar2.c(o.o.a(view).k(f2));
        }
        hVar2.f(F);
        hVar2.e(250L);
        hVar2.g(this.C);
        this.z = hVar2;
        hVar2.h();
    }

    public void z(boolean z) {
        View view;
        View view2;
        int[] iArr;
        v.h hVar = this.z;
        if (hVar != null) {
            hVar.a();
        }
        this.f1838f.setVisibility(0);
        if (this.f1852t == 0 && (this.A || z)) {
            this.f1838f.setTranslationY(0.0f);
            float f2 = -this.f1838f.getHeight();
            if (z) {
                this.f1838f.getLocationInWindow(new int[]{0, 0});
                f2 -= iArr[1];
            }
            this.f1838f.setTranslationY(f2);
            v.h hVar2 = new v.h();
            s k2 = o.o.a(this.f1838f).k(0.0f);
            k2.i(this.E);
            hVar2.c(k2);
            if (this.f1853u && (view2 = this.f1841i) != null) {
                view2.setTranslationY(f2);
                hVar2.c(o.o.a(this.f1841i).k(0.0f));
            }
            hVar2.f(G);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.z = hVar2;
            hVar2.h();
        } else {
            this.f1838f.setAlpha(1.0f);
            this.f1838f.setTranslationY(0.0f);
            if (this.f1853u && (view = this.f1841i) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1837e;
        if (actionBarOverlayLayout != null) {
            o.o.p(actionBarOverlayLayout);
        }
    }
}