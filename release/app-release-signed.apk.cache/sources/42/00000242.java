package r;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.v;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.a1;
import android.support.v7.widget.b1;
import android.support.v7.widget.c0;
import android.support.v7.widget.g0;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import o.s;
import o.u;
import o.w;
import org.xmlpull.v1.XmlPullParser;
import v.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends r.e implements e.a, LayoutInflater.Factory2 {
    private static final boolean U;
    PopupWindow A;
    Runnable B;
    s C;
    private boolean D;
    private ViewGroup E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    private boolean J;
    private j[] K;
    private j L;
    private boolean M;
    boolean N;
    int O;
    private final Runnable P;
    private boolean Q;
    private Rect R;
    private Rect S;
    private r.k T;

    /* renamed from: v  reason: collision with root package name */
    private c0 f1767v;

    /* renamed from: w  reason: collision with root package name */
    private g f1768w;
    private k x;
    v.b y;
    ActionBarContextView z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if ((iVar.O & 1) != 0) {
                iVar.W(0);
            }
            i iVar2 = i.this;
            if ((iVar2.O & 4096) != 0) {
                iVar2.W(108);
            }
            i iVar3 = i.this;
            iVar3.N = false;
            iVar3.O = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o.m {
        b() {
        }

        @Override // o.m
        public w a(View view, w wVar) {
            int d2 = wVar.d();
            int v0 = i.this.v0(d2);
            if (d2 != v0) {
                wVar = wVar.e(wVar.b(), v0, wVar.c(), wVar.a());
            }
            return o.o.l(view, wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements g0.a {
        c() {
        }

        @Override // android.support.v7.widget.g0.a
        public void a(Rect rect) {
            rect.top = i.this.v0(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements ContentFrameLayout.a {
        d() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            i.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* loaded from: classes.dex */
        class a extends u {
            a() {
            }

            @Override // o.t
            public void a(View view) {
                i.this.z.setAlpha(1.0f);
                i.this.C.f(null);
                i.this.C = null;
            }

            @Override // o.u, o.t
            public void b(View view) {
                i.this.z.setVisibility(0);
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            iVar.A.showAtLocation(iVar.z, 55, 0, 0);
            i.this.X();
            if (!i.this.q0()) {
                i.this.z.setAlpha(1.0f);
                i.this.z.setVisibility(0);
                return;
            }
            i.this.z.setAlpha(0.0f);
            i iVar2 = i.this;
            iVar2.C = o.o.a(iVar2.z).a(1.0f);
            i.this.C.f(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends u {
        f() {
        }

        @Override // o.t
        public void a(View view) {
            i.this.z.setAlpha(1.0f);
            i.this.C.f(null);
            i.this.C = null;
        }

        @Override // o.u, o.t
        public void b(View view) {
            i.this.z.setVisibility(0);
            i.this.z.sendAccessibilityEvent(32);
            if (i.this.z.getParent() instanceof View) {
                o.o.p((View) i.this.z.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class g implements j.a {
        g() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            i.this.Q(eVar);
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            Window.Callback E = i.this.E();
            if (E != null) {
                E.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f1777a;

        /* loaded from: classes.dex */
        class a extends u {
            a() {
            }

            @Override // o.t
            public void a(View view) {
                i.this.z.setVisibility(8);
                i iVar = i.this;
                PopupWindow popupWindow = iVar.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (iVar.z.getParent() instanceof View) {
                    o.o.p((View) i.this.z.getParent());
                }
                i.this.z.removeAllViews();
                i.this.C.f(null);
                i.this.C = null;
            }
        }

        public h(b.a aVar) {
            this.f1777a = aVar;
        }

        @Override // v.b.a
        public boolean a(v.b bVar, Menu menu) {
            return this.f1777a.a(bVar, menu);
        }

        @Override // v.b.a
        public void b(v.b bVar) {
            this.f1777a.b(bVar);
            i iVar = i.this;
            if (iVar.A != null) {
                iVar.f1742e.getDecorView().removeCallbacks(i.this.B);
            }
            i iVar2 = i.this;
            if (iVar2.z != null) {
                iVar2.X();
                i iVar3 = i.this;
                iVar3.C = o.o.a(iVar3.z).a(0.0f);
                i.this.C.f(new a());
            }
            i iVar4 = i.this;
            r.c cVar = iVar4.f1745h;
            if (cVar != null) {
                cVar.c(iVar4.y);
            }
            i.this.y = null;
        }

        @Override // v.b.a
        public boolean c(v.b bVar, Menu menu) {
            return this.f1777a.c(bVar, menu);
        }

        @Override // v.b.a
        public boolean d(v.b bVar, MenuItem menuItem) {
            return this.f1777a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0024i extends ContentFrameLayout {
        public C0024i(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return i.this.B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                i.this.R(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(t.b.d(getContext(), i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        int f1781a;

        /* renamed from: b  reason: collision with root package name */
        int f1782b;

        /* renamed from: c  reason: collision with root package name */
        int f1783c;

        /* renamed from: d  reason: collision with root package name */
        int f1784d;

        /* renamed from: e  reason: collision with root package name */
        int f1785e;

        /* renamed from: f  reason: collision with root package name */
        int f1786f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f1787g;

        /* renamed from: h  reason: collision with root package name */
        View f1788h;

        /* renamed from: i  reason: collision with root package name */
        View f1789i;

        /* renamed from: j  reason: collision with root package name */
        android.support.v7.view.menu.e f1790j;

        /* renamed from: k  reason: collision with root package name */
        android.support.v7.view.menu.c f1791k;

        /* renamed from: l  reason: collision with root package name */
        Context f1792l;

        /* renamed from: m  reason: collision with root package name */
        boolean f1793m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1794n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1795o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1796p;

        /* renamed from: q  reason: collision with root package name */
        boolean f1797q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f1798r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f1799s;

        j(int i2) {
            this.f1781a = i2;
        }

        android.support.v7.view.menu.k a(j.a aVar) {
            if (this.f1790j == null) {
                return null;
            }
            if (this.f1791k == null) {
                android.support.v7.view.menu.c cVar = new android.support.v7.view.menu.c(this.f1792l, s.g.abc_list_menu_item_layout);
                this.f1791k = cVar;
                cVar.j(aVar);
                this.f1790j.b(this.f1791k);
            }
            return this.f1791k.d(this.f1787g);
        }

        public boolean b() {
            if (this.f1788h == null) {
                return false;
            }
            return this.f1789i != null || this.f1791k.c().getCount() > 0;
        }

        void c(android.support.v7.view.menu.e eVar) {
            android.support.v7.view.menu.c cVar;
            android.support.v7.view.menu.e eVar2 = this.f1790j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f1791k);
            }
            this.f1790j = eVar;
            if (eVar == null || (cVar = this.f1791k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(s.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(s.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = s.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            v.d dVar = new v.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1792l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(s.j.k0);
            this.f1782b = obtainStyledAttributes.getResourceId(s.j.n0, 0);
            this.f1786f = obtainStyledAttributes.getResourceId(s.j.m0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class k implements j.a {
        k() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            android.support.v7.view.menu.e D = eVar.D();
            boolean z2 = D != eVar;
            i iVar = i.this;
            if (z2) {
                eVar = D;
            }
            j Z = iVar.Z(eVar);
            if (Z != null) {
                if (!z2) {
                    i.this.S(Z, z);
                    return;
                }
                i.this.P(Z.f1781a, Z, D);
                i.this.S(Z, true);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            Window.Callback E;
            if (eVar == null) {
                i iVar = i.this;
                if (!iVar.f1748k || (E = iVar.E()) == null || i.this.G()) {
                    return true;
                }
                E.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        U = Build.VERSION.SDK_INT < 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, Window window, r.c cVar) {
        super(context, window, cVar);
        this.C = null;
        this.P = new a();
    }

    private void N() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.E.findViewById(16908290);
        View decorView = this.f1742e.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1741d.obtainStyledAttributes(s.j.k0);
        obtainStyledAttributes.getValue(s.j.w0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(s.j.x0, contentFrameLayout.getMinWidthMinor());
        int i2 = s.j.u0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = s.j.v0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = s.j.s0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = s.j.t0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private ViewGroup T() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1741d.obtainStyledAttributes(s.j.k0);
        int i2 = s.j.p0;
        if (!obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(s.j.y0, false)) {
            w(1);
        } else if (obtainStyledAttributes.getBoolean(i2, false)) {
            w(108);
        }
        if (obtainStyledAttributes.getBoolean(s.j.q0, false)) {
            w(109);
        }
        if (obtainStyledAttributes.getBoolean(s.j.r0, false)) {
            w(10);
        }
        this.f1751n = obtainStyledAttributes.getBoolean(s.j.l0, false);
        obtainStyledAttributes.recycle();
        this.f1742e.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1741d);
        if (this.f1752o) {
            viewGroup = (ViewGroup) from.inflate(this.f1750m ? s.g.abc_screen_simple_overlay_action_mode : s.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                o.o.v(viewGroup, new b());
            } else {
                ((g0) viewGroup).setOnFitSystemWindowsListener(new c());
            }
        } else if (this.f1751n) {
            viewGroup = (ViewGroup) from.inflate(s.g.abc_dialog_title_material, (ViewGroup) null);
            this.f1749l = false;
            this.f1748k = false;
        } else if (this.f1748k) {
            TypedValue typedValue = new TypedValue();
            this.f1741d.getTheme().resolveAttribute(s.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new v.d(this.f1741d, typedValue.resourceId) : this.f1741d).inflate(s.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(s.f.decor_content_parent);
            this.f1767v = c0Var;
            c0Var.setWindowCallback(E());
            if (this.f1749l) {
                this.f1767v.h(109);
            }
            if (this.H) {
                this.f1767v.h(2);
            }
            if (this.I) {
                this.f1767v.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1748k + ", windowActionBarOverlay: " + this.f1749l + ", android:windowIsFloating: " + this.f1751n + ", windowActionModeOverlay: " + this.f1750m + ", windowNoTitle: " + this.f1752o + " }");
        }
        if (this.f1767v == null) {
            this.F = (TextView) viewGroup.findViewById(s.f.title);
        }
        b1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(s.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1742e.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1742e.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new d());
        return viewGroup;
    }

    private void Y() {
        if (this.D) {
            return;
        }
        this.E = T();
        CharSequence D = D();
        if (!TextUtils.isEmpty(D)) {
            K(D);
        }
        N();
        k0(this.E);
        this.D = true;
        j a0 = a0(0, false);
        if (G()) {
            return;
        }
        if (a0 == null || a0.f1790j == null) {
            e0(108);
        }
    }

    private boolean b0(j jVar) {
        View view = jVar.f1789i;
        if (view != null) {
            jVar.f1788h = view;
            return true;
        } else if (jVar.f1790j == null) {
            return false;
        } else {
            if (this.x == null) {
                this.x = new k();
            }
            View view2 = (View) jVar.a(this.x);
            jVar.f1788h = view2;
            return view2 != null;
        }
    }

    private boolean c0(j jVar) {
        jVar.d(C());
        jVar.f1787g = new C0024i(jVar.f1792l);
        jVar.f1783c = 81;
        return true;
    }

    private boolean d0(j jVar) {
        Context context = this.f1741d;
        int i2 = jVar.f1781a;
        if ((i2 == 0 || i2 == 108) && this.f1767v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(s.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(s.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(s.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                v.d dVar = new v.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        android.support.v7.view.menu.e eVar = new android.support.v7.view.menu.e(context);
        eVar.R(this);
        jVar.c(eVar);
        return true;
    }

    private void e0(int i2) {
        this.O = (1 << i2) | this.O;
        if (this.N) {
            return;
        }
        o.o.n(this.f1742e.getDecorView(), this.P);
        this.N = true;
    }

    private boolean h0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            j a0 = a0(i2, true);
            if (a0.f1795o) {
                return false;
            }
            return n0(a0, keyEvent);
        }
        return false;
    }

    private boolean j0(int i2, KeyEvent keyEvent) {
        boolean z;
        c0 c0Var;
        if (this.y != null) {
            return false;
        }
        boolean z2 = true;
        j a0 = a0(i2, true);
        if (i2 != 0 || (c0Var = this.f1767v) == null || !c0Var.e() || ViewConfiguration.get(this.f1741d).hasPermanentMenuKey()) {
            boolean z3 = a0.f1795o;
            if (z3 || a0.f1794n) {
                S(a0, true);
                z2 = z3;
            } else {
                if (a0.f1793m) {
                    if (a0.f1798r) {
                        a0.f1793m = false;
                        z = n0(a0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        l0(a0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f1767v.d()) {
            z2 = this.f1767v.g();
        } else {
            if (!G() && n0(a0, keyEvent)) {
                z2 = this.f1767v.a();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f1741d.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    private void l0(j jVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (jVar.f1795o || G()) {
            return;
        }
        if (jVar.f1781a == 0) {
            if ((this.f1741d.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback E = E();
        if (E != null && !E.onMenuOpened(jVar.f1781a, jVar.f1790j)) {
            S(jVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1741d.getSystemService("window");
        if (windowManager != null && n0(jVar, keyEvent)) {
            ViewGroup viewGroup = jVar.f1787g;
            if (viewGroup == null || jVar.f1797q) {
                if (viewGroup == null) {
                    if (!c0(jVar) || jVar.f1787g == null) {
                        return;
                    }
                } else if (jVar.f1797q && viewGroup.getChildCount() > 0) {
                    jVar.f1787g.removeAllViews();
                }
                if (!b0(jVar) || !jVar.b()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = jVar.f1788h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                jVar.f1787g.setBackgroundResource(jVar.f1782b);
                ViewParent parent = jVar.f1788h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(jVar.f1788h);
                }
                jVar.f1787g.addView(jVar.f1788h, layoutParams2);
                if (!jVar.f1788h.hasFocus()) {
                    jVar.f1788h.requestFocus();
                }
            } else {
                View view = jVar.f1789i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    jVar.f1794n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, jVar.f1784d, jVar.f1785e, 1002, 8519680, -3);
                    layoutParams3.gravity = jVar.f1783c;
                    layoutParams3.windowAnimations = jVar.f1786f;
                    windowManager.addView(jVar.f1787g, layoutParams3);
                    jVar.f1795o = true;
                }
            }
            i2 = -2;
            jVar.f1794n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, jVar.f1784d, jVar.f1785e, 1002, 8519680, -3);
            layoutParams32.gravity = jVar.f1783c;
            layoutParams32.windowAnimations = jVar.f1786f;
            windowManager.addView(jVar.f1787g, layoutParams32);
            jVar.f1795o = true;
        }
    }

    private boolean m0(j jVar, int i2, KeyEvent keyEvent, int i3) {
        android.support.v7.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f1793m || n0(jVar, keyEvent)) && (eVar = jVar.f1790j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.f1767v == null) {
            S(jVar, true);
        }
        return z;
    }

    private boolean n0(j jVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (G()) {
            return false;
        }
        if (jVar.f1793m) {
            return true;
        }
        j jVar2 = this.L;
        if (jVar2 != null && jVar2 != jVar) {
            S(jVar2, false);
        }
        Window.Callback E = E();
        if (E != null) {
            jVar.f1789i = E.onCreatePanelView(jVar.f1781a);
        }
        int i2 = jVar.f1781a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.f1767v) != null) {
            c0Var3.c();
        }
        if (jVar.f1789i == null) {
            if (z) {
                L();
            }
            android.support.v7.view.menu.e eVar = jVar.f1790j;
            if (eVar == null || jVar.f1798r) {
                if (eVar == null && (!d0(jVar) || jVar.f1790j == null)) {
                    return false;
                }
                if (z && this.f1767v != null) {
                    if (this.f1768w == null) {
                        this.f1768w = new g();
                    }
                    this.f1767v.f(jVar.f1790j, this.f1768w);
                }
                jVar.f1790j.d0();
                if (!E.onCreatePanelMenu(jVar.f1781a, jVar.f1790j)) {
                    jVar.c(null);
                    if (z && (c0Var = this.f1767v) != null) {
                        c0Var.f(null, this.f1768w);
                    }
                    return false;
                }
                jVar.f1798r = false;
            }
            jVar.f1790j.d0();
            Bundle bundle = jVar.f1799s;
            if (bundle != null) {
                jVar.f1790j.P(bundle);
                jVar.f1799s = null;
            }
            if (!E.onPreparePanel(0, jVar.f1789i, jVar.f1790j)) {
                if (z && (c0Var2 = this.f1767v) != null) {
                    c0Var2.f(null, this.f1768w);
                }
                jVar.f1790j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f1796p = z2;
            jVar.f1790j.setQwertyMode(z2);
            jVar.f1790j.c0();
        }
        jVar.f1793m = true;
        jVar.f1794n = false;
        this.L = jVar;
        return true;
    }

    private void o0(android.support.v7.view.menu.e eVar, boolean z) {
        c0 c0Var = this.f1767v;
        if (c0Var == null || !c0Var.e() || (ViewConfiguration.get(this.f1741d).hasPermanentMenuKey() && !this.f1767v.b())) {
            j a0 = a0(0, true);
            a0.f1797q = true;
            S(a0, false);
            l0(a0, null);
            return;
        }
        Window.Callback E = E();
        if (this.f1767v.d() && z) {
            this.f1767v.g();
            if (G()) {
                return;
            }
            E.onPanelClosed(108, a0(0, true).f1790j);
        } else if (E == null || G()) {
        } else {
            if (this.N && (this.O & 1) != 0) {
                this.f1742e.getDecorView().removeCallbacks(this.P);
                this.P.run();
            }
            j a02 = a0(0, true);
            android.support.v7.view.menu.e eVar2 = a02.f1790j;
            if (eVar2 == null || a02.f1798r || !E.onPreparePanel(0, a02.f1789i, eVar2)) {
                return;
            }
            E.onMenuOpened(108, a02.f1790j);
            this.f1767v.a();
        }
    }

    private int p0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i2;
        }
    }

    private boolean r0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1742e.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || o.o.j((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void u0() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // r.e
    boolean B(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.f1743f.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? g0(keyCode, keyEvent) : i0(keyCode, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // r.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F() {
        /*
            r3 = this;
            r3.Y()
            boolean r0 = r3.f1748k
            if (r0 == 0) goto L37
            r.a r0 = r3.f1746i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            android.view.Window$Callback r0 = r3.f1743f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            r.o r0 = new r.o
            android.view.Window$Callback r1 = r3.f1743f
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f1749l
            r0.<init>(r1, r2)
        L1d:
            r3.f1746i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            r.o r0 = new r.o
            android.view.Window$Callback r1 = r3.f1743f
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            r.a r0 = r3.f1746i
            if (r0 == 0) goto L37
            boolean r1 = r3.Q
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.F():void");
    }

    @Override // r.e
    boolean H(int i2, KeyEvent keyEvent) {
        r.a k2 = k();
        if (k2 == null || !k2.o(i2, keyEvent)) {
            j jVar = this.L;
            if (jVar != null && m0(jVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                j jVar2 = this.L;
                if (jVar2 != null) {
                    jVar2.f1794n = true;
                }
                return true;
            }
            if (this.L == null) {
                j a0 = a0(0, true);
                n0(a0, keyEvent);
                boolean m0 = m0(a0, keyEvent.getKeyCode(), keyEvent, 1);
                a0.f1793m = false;
                if (m0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // r.e
    boolean I(int i2, Menu menu) {
        if (i2 == 108) {
            r.a k2 = k();
            if (k2 != null) {
                k2.i(true);
            }
            return true;
        }
        return false;
    }

    @Override // r.e
    void J(int i2, Menu menu) {
        if (i2 == 108) {
            r.a k2 = k();
            if (k2 != null) {
                k2.i(false);
            }
        } else if (i2 == 0) {
            j a0 = a0(i2, true);
            if (a0.f1795o) {
                S(a0, false);
            }
        }
    }

    @Override // r.e
    void K(CharSequence charSequence) {
        c0 c0Var = this.f1767v;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (L() != null) {
            L().t(charSequence);
        } else {
            TextView textView = this.F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    View O(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    void P(int i2, j jVar, Menu menu) {
        if (menu == null) {
            if (jVar == null && i2 >= 0) {
                j[] jVarArr = this.K;
                if (i2 < jVarArr.length) {
                    jVar = jVarArr[i2];
                }
            }
            if (jVar != null) {
                menu = jVar.f1790j;
            }
        }
        if ((jVar == null || jVar.f1795o) && !G()) {
            this.f1743f.onPanelClosed(i2, menu);
        }
    }

    void Q(android.support.v7.view.menu.e eVar) {
        if (this.J) {
            return;
        }
        this.J = true;
        this.f1767v.j();
        Window.Callback E = E();
        if (E != null && !G()) {
            E.onPanelClosed(108, eVar);
        }
        this.J = false;
    }

    void R(int i2) {
        S(a0(i2, true), true);
    }

    void S(j jVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && jVar.f1781a == 0 && (c0Var = this.f1767v) != null && c0Var.d()) {
            Q(jVar.f1790j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1741d.getSystemService("window");
        if (windowManager != null && jVar.f1795o && (viewGroup = jVar.f1787g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                P(jVar.f1781a, jVar, null);
            }
        }
        jVar.f1793m = false;
        jVar.f1794n = false;
        jVar.f1795o = false;
        jVar.f1788h = null;
        jVar.f1797q = true;
        if (this.L == jVar) {
            this.L = null;
        }
    }

    public View U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        r.k kVar;
        boolean z2 = false;
        if (this.T == null) {
            String string = this.f1741d.obtainStyledAttributes(s.j.k0).getString(s.j.o0);
            if (string == null || r.k.class.getName().equals(string)) {
                kVar = new r.k();
            } else {
                try {
                    this.T = (r.k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    kVar = new r.k();
                }
            }
            this.T = kVar;
        }
        boolean z3 = U;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = r0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.T.p(view, str, context, attributeSet, z, z3, true, a1.a());
    }

    void V() {
        android.support.v7.view.menu.e eVar;
        c0 c0Var = this.f1767v;
        if (c0Var != null) {
            c0Var.j();
        }
        if (this.A != null) {
            this.f1742e.getDecorView().removeCallbacks(this.B);
            if (this.A.isShowing()) {
                try {
                    this.A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.A = null;
        }
        X();
        j a0 = a0(0, false);
        if (a0 == null || (eVar = a0.f1790j) == null) {
            return;
        }
        eVar.close();
    }

    void W(int i2) {
        j a0;
        j a02 = a0(i2, true);
        if (a02.f1790j != null) {
            Bundle bundle = new Bundle();
            a02.f1790j.Q(bundle);
            if (bundle.size() > 0) {
                a02.f1799s = bundle;
            }
            a02.f1790j.d0();
            a02.f1790j.clear();
        }
        a02.f1798r = true;
        a02.f1797q = true;
        if ((i2 != 108 && i2 != 0) || this.f1767v == null || (a0 = a0(0, false)) == null) {
            return;
        }
        a0.f1793m = false;
        n0(a0, null);
    }

    void X() {
        s sVar = this.C;
        if (sVar != null) {
            sVar.b();
        }
    }

    j Z(Menu menu) {
        j[] jVarArr = this.K;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.f1790j == menu) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(android.support.v7.view.menu.e eVar) {
        o0(eVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j a0(int i2, boolean z) {
        j[] jVarArr = this.K;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[i2 + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.K = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar == null) {
            j jVar2 = new j(i2);
            jVarArr[i2] = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        j Z;
        Window.Callback E = E();
        if (E == null || G() || (Z = Z(eVar.D())) == null) {
            return false;
        }
        return E.onMenuItemSelected(Z.f1781a, menuItem);
    }

    @Override // r.d
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.f1743f.onContentChanged();
    }

    boolean f0() {
        v.b bVar = this.y;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        r.a k2 = k();
        return k2 != null && k2.h();
    }

    boolean g0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.M = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            h0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // r.d
    public <T extends View> T h(int i2) {
        Y();
        return (T) this.f1742e.findViewById(i2);
    }

    boolean i0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.M;
            this.M = false;
            j a0 = a0(0, false);
            if (a0 != null && a0.f1795o) {
                if (!z) {
                    S(a0, true);
                }
                return true;
            } else if (f0()) {
                return true;
            }
        } else if (i2 == 82) {
            j0(0, keyEvent);
            return true;
        }
        return false;
    }

    void k0(ViewGroup viewGroup) {
    }

    @Override // r.d
    public void l() {
        LayoutInflater from = LayoutInflater.from(this.f1741d);
        if (from.getFactory() == null) {
            o.e.b(from, this);
        } else if (from.getFactory2() instanceof i) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // r.d
    public void m() {
        r.a k2 = k();
        if (k2 == null || !k2.l()) {
            e0(0);
        }
    }

    @Override // r.d
    public void o(Configuration configuration) {
        r.a k2;
        if (this.f1748k && this.D && (k2 = k()) != null) {
            k2.m(configuration);
        }
        android.support.v7.widget.k.n().y(this.f1741d);
        d();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View O = O(view, str, context, attributeSet);
        return O != null ? O : U(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // r.d
    public void p(Bundle bundle) {
        Window.Callback callback = this.f1743f;
        if (!(callback instanceof Activity) || v.c((Activity) callback) == null) {
            return;
        }
        r.a L = L();
        if (L == null) {
            this.Q = true;
        } else {
            L.r(true);
        }
    }

    @Override // r.e, r.d
    public void q() {
        if (this.N) {
            this.f1742e.getDecorView().removeCallbacks(this.P);
        }
        super.q();
        r.a aVar = this.f1746i;
        if (aVar != null) {
            aVar.n();
        }
    }

    final boolean q0() {
        ViewGroup viewGroup;
        return this.D && (viewGroup = this.E) != null && o.o.k(viewGroup);
    }

    @Override // r.d
    public void r(Bundle bundle) {
        Y();
    }

    @Override // r.d
    public void s() {
        r.a k2 = k();
        if (k2 != null) {
            k2.s(true);
        }
    }

    public v.b s0(b.a aVar) {
        r.c cVar;
        if (aVar != null) {
            v.b bVar = this.y;
            if (bVar != null) {
                bVar.c();
            }
            h hVar = new h(aVar);
            r.a k2 = k();
            if (k2 != null) {
                v.b u2 = k2.u(hVar);
                this.y = u2;
                if (u2 != null && (cVar = this.f1745h) != null) {
                    cVar.d(u2);
                }
            }
            if (this.y == null) {
                this.y = t0(hVar);
            }
            return this.y;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    v.b t0(v.b.a r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.t0(v.b$a):v.b");
    }

    @Override // r.d
    public void v() {
        r.a k2 = k();
        if (k2 != null) {
            k2.s(false);
        }
    }

    int v0(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            if (this.z.isShown()) {
                if (this.R == null) {
                    this.R = new Rect();
                    this.S = new Rect();
                }
                Rect rect = this.R;
                Rect rect2 = this.S;
                rect.set(0, i2, 0, 0);
                b1.a(this.E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.G;
                    if (view == null) {
                        View view2 = new View(this.f1741d);
                        this.G = view2;
                        view2.setBackgroundColor(this.f1741d.getResources().getColor(s.c.abc_input_method_navigation_guard));
                        this.E.addView(this.G, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.G.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                r3 = this.G != null;
                if (!this.f1750m && r3) {
                    i2 = 0;
                }
                boolean z3 = r3;
                r3 = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r3 = false;
            }
            if (r3) {
                this.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.G;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    @Override // r.d
    public boolean w(int i2) {
        int p0 = p0(i2);
        if (this.f1752o && p0 == 108) {
            return false;
        }
        if (this.f1748k && p0 == 1) {
            this.f1748k = false;
        }
        if (p0 == 1) {
            u0();
            this.f1752o = true;
            return true;
        } else if (p0 == 2) {
            u0();
            this.H = true;
            return true;
        } else if (p0 == 5) {
            u0();
            this.I = true;
            return true;
        } else if (p0 == 10) {
            u0();
            this.f1750m = true;
            return true;
        } else if (p0 == 108) {
            u0();
            this.f1748k = true;
            return true;
        } else if (p0 != 109) {
            return this.f1742e.requestFeature(p0);
        } else {
            u0();
            this.f1749l = true;
            return true;
        }
    }

    @Override // r.d
    public void x(int i2) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1741d).inflate(i2, viewGroup);
        this.f1743f.onContentChanged();
    }

    @Override // r.d
    public void y(View view) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1743f.onContentChanged();
    }

    @Override // r.d
    public void z(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1743f.onContentChanged();
    }
}