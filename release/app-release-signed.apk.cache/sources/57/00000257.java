package p019r;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.widget.ActionBarContainer;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.ActionBarOverlayLayout;
import android.support.p002v7.widget.C0297o0;
import android.support.p002v7.widget.InterfaceC0256d0;
import android.support.p002v7.widget.Toolbar;
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
import p016o.C0490o;
import p016o.C0511s;
import p016o.C0515u;
import p016o.InterfaceC0514t;
import p016o.InterfaceC0516v;
import p019r.AbstractC0525a;
import p020s.C0569a;
import p020s.C0574f;
import p020s.C0578j;
import p023v.AbstractC0585b;
import p023v.C0584a;
import p023v.C0592g;
import p023v.C0595h;

/* renamed from: r.o */
/* loaded from: classes.dex */
public class C0564o extends AbstractC0525a implements ActionBarOverlayLayout.InterfaceC0213d {

    /* renamed from: F */
    private static final Interpolator f2380F = new AccelerateInterpolator();

    /* renamed from: G */
    private static final Interpolator f2381G = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f2382A;

    /* renamed from: B */
    boolean f2383B;

    /* renamed from: a */
    Context f2387a;

    /* renamed from: b */
    private Context f2388b;

    /* renamed from: c */
    private Activity f2389c;

    /* renamed from: d */
    private Dialog f2390d;

    /* renamed from: e */
    ActionBarOverlayLayout f2391e;

    /* renamed from: f */
    ActionBarContainer f2392f;

    /* renamed from: g */
    InterfaceC0256d0 f2393g;

    /* renamed from: h */
    ActionBarContextView f2394h;

    /* renamed from: i */
    View f2395i;

    /* renamed from: j */
    C0297o0 f2396j;

    /* renamed from: m */
    private boolean f2399m;

    /* renamed from: n */
    C0568d f2400n;

    /* renamed from: o */
    AbstractC0585b f2401o;

    /* renamed from: p */
    AbstractC0585b.InterfaceC0586a f2402p;

    /* renamed from: q */
    private boolean f2403q;

    /* renamed from: s */
    private boolean f2405s;

    /* renamed from: v */
    boolean f2408v;

    /* renamed from: w */
    boolean f2409w;

    /* renamed from: x */
    private boolean f2410x;

    /* renamed from: z */
    C0595h f2412z;

    /* renamed from: k */
    private ArrayList<Object> f2397k = new ArrayList<>();

    /* renamed from: l */
    private int f2398l = -1;

    /* renamed from: r */
    private ArrayList<AbstractC0525a.InterfaceC0527b> f2404r = new ArrayList<>();

    /* renamed from: t */
    private int f2406t = 0;

    /* renamed from: u */
    boolean f2407u = true;

    /* renamed from: y */
    private boolean f2411y = true;

    /* renamed from: C */
    final InterfaceC0514t f2384C = new C0565a();

    /* renamed from: D */
    final InterfaceC0514t f2385D = new C0566b();

    /* renamed from: E */
    final InterfaceC0516v f2386E = new C0567c();

    /* renamed from: r.o$a */
    /* loaded from: classes.dex */
    class C0565a extends C0515u {
        C0565a() {
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            View view2;
            C0564o c0564o = C0564o.this;
            if (c0564o.f2407u && (view2 = c0564o.f2395i) != null) {
                view2.setTranslationY(0.0f);
                C0564o.this.f2392f.setTranslationY(0.0f);
            }
            C0564o.this.f2392f.setVisibility(8);
            C0564o.this.f2392f.setTransitioning(false);
            C0564o c0564o2 = C0564o.this;
            c0564o2.f2412z = null;
            c0564o2.m111x();
            ActionBarOverlayLayout actionBarOverlayLayout = C0564o.this.f2391e;
            if (actionBarOverlayLayout != null) {
                C0490o.m396p(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: r.o$b */
    /* loaded from: classes.dex */
    class C0566b extends C0515u {
        C0566b() {
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            C0564o c0564o = C0564o.this;
            c0564o.f2412z = null;
            c0564o.f2392f.requestLayout();
        }
    }

    /* renamed from: r.o$c */
    /* loaded from: classes.dex */
    class C0567c implements InterfaceC0516v {
        C0567c() {
        }

        @Override // p016o.InterfaceC0516v
        /* renamed from: a */
        public void mo108a(View view) {
            ((View) C0564o.this.f2392f.getParent()).invalidate();
        }
    }

    /* renamed from: r.o$d */
    /* loaded from: classes.dex */
    public class C0568d extends AbstractC0585b implements C0192e.InterfaceC0193a {

        /* renamed from: d */
        private final Context f2416d;

        /* renamed from: e */
        private final C0192e f2417e;

        /* renamed from: f */
        private AbstractC0585b.InterfaceC0586a f2418f;

        /* renamed from: g */
        private WeakReference<View> f2419g;

        public C0568d(Context context, AbstractC0585b.InterfaceC0586a interfaceC0586a) {
            this.f2416d = context;
            this.f2418f = interfaceC0586a;
            C0192e m1638S = new C0192e(context).m1638S(1);
            this.f2417e = m1638S;
            m1638S.mo1540R(this);
        }

        @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
        /* renamed from: a */
        public void mo75a(C0192e c0192e) {
            if (this.f2418f == null) {
                return;
            }
            mo67k();
            C0564o.this.f2394h.m1527l();
        }

        @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
        /* renamed from: b */
        public boolean mo74b(C0192e c0192e, MenuItem menuItem) {
            AbstractC0585b.InterfaceC0586a interfaceC0586a = this.f2418f;
            if (interfaceC0586a != null) {
                return interfaceC0586a.mo56d(this, menuItem);
            }
            return false;
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: c */
        public void mo73c() {
            C0564o c0564o = C0564o.this;
            if (c0564o.f2400n != this) {
                return;
            }
            if (C0564o.m112w(c0564o.f2408v, c0564o.f2409w, false)) {
                this.f2418f.mo58b(this);
            } else {
                C0564o c0564o2 = C0564o.this;
                c0564o2.f2401o = this;
                c0564o2.f2402p = this.f2418f;
            }
            this.f2418f = null;
            C0564o.this.m113v(false);
            C0564o.this.f2394h.m1532g();
            C0564o.this.f2393g.mo1076p().sendAccessibilityEvent(32);
            C0564o c0564o3 = C0564o.this;
            c0564o3.f2391e.setHideOnContentScrollEnabled(c0564o3.f2383B);
            C0564o.this.f2400n = null;
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: d */
        public View mo72d() {
            WeakReference<View> weakReference = this.f2419g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: e */
        public Menu mo71e() {
            return this.f2417e;
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: f */
        public MenuInflater mo70f() {
            return new C0592g(this.f2416d);
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: g */
        public CharSequence mo69g() {
            return C0564o.this.f2394h.getSubtitle();
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: i */
        public CharSequence mo68i() {
            return C0564o.this.f2394h.getTitle();
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: k */
        public void mo67k() {
            if (C0564o.this.f2400n != this) {
                return;
            }
            this.f2417e.m1623d0();
            try {
                this.f2418f.mo57c(this, this.f2417e);
            } finally {
                this.f2417e.m1625c0();
            }
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: l */
        public boolean mo66l() {
            return C0564o.this.f2394h.m1529j();
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: m */
        public void mo65m(View view) {
            C0564o.this.f2394h.setCustomView(view);
            this.f2419g = new WeakReference<>(view);
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: n */
        public void mo64n(int i) {
            mo63o(C0564o.this.f2387a.getResources().getString(i));
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: o */
        public void mo63o(CharSequence charSequence) {
            C0564o.this.f2394h.setSubtitle(charSequence);
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: q */
        public void mo62q(int i) {
            mo61r(C0564o.this.f2387a.getResources().getString(i));
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: r */
        public void mo61r(CharSequence charSequence) {
            C0564o.this.f2394h.setTitle(charSequence);
        }

        @Override // p023v.AbstractC0585b
        /* renamed from: s */
        public void mo60s(boolean z) {
            super.mo60s(z);
            C0564o.this.f2394h.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m107t() {
            this.f2417e.m1623d0();
            try {
                return this.f2418f.mo59a(this, this.f2417e);
            } finally {
                this.f2417e.m1625c0();
            }
        }
    }

    public C0564o(Activity activity, boolean z) {
        this.f2389c = activity;
        View decorView = activity.getWindow().getDecorView();
        m139D(decorView);
        if (z) {
            return;
        }
        this.f2395i = decorView.findViewById(16908290);
    }

    public C0564o(Dialog dialog) {
        this.f2390d = dialog;
        m139D(dialog.getWindow().getDecorView());
    }

    /* renamed from: A */
    private InterfaceC0256d0 m142A(View view) {
        if (view instanceof InterfaceC0256d0) {
            return (InterfaceC0256d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: C */
    private void m140C() {
        if (this.f2410x) {
            this.f2410x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2391e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m130M(false);
        }
    }

    /* renamed from: D */
    private void m139D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0574f.decor_content_parent);
        this.f2391e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2393g = m142A(view.findViewById(C0574f.action_bar));
        this.f2394h = (ActionBarContextView) view.findViewById(C0574f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0574f.action_bar_container);
        this.f2392f = actionBarContainer;
        InterfaceC0256d0 interfaceC0256d0 = this.f2393g;
        if (interfaceC0256d0 == null || this.f2394h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2387a = interfaceC0256d0.mo1072t();
        boolean z = (this.f2393g.mo1081k() & 4) != 0;
        if (z) {
            this.f2399m = true;
        }
        C0584a m88b = C0584a.m88b(this.f2387a);
        m133J(m88b.m89a() || z);
        m135H(m88b.m83g());
        TypedArray obtainStyledAttributes = this.f2387a.obtainStyledAttributes(null, C0578j.f2525a, C0569a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0578j.f2566k, false)) {
            m134I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0578j.f2558i, 0);
        if (dimensionPixelSize != 0) {
            m136G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H */
    private void m135H(boolean z) {
        this.f2405s = z;
        if (z) {
            this.f2392f.setTabContainer(null);
            this.f2393g.mo1083i(this.f2396j);
        } else {
            this.f2393g.mo1083i(null);
            this.f2392f.setTabContainer(this.f2396j);
        }
        boolean z2 = true;
        boolean z3 = m141B() == 2;
        C0297o0 c0297o0 = this.f2396j;
        if (c0297o0 != null) {
            if (z3) {
                c0297o0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2391e;
                if (actionBarOverlayLayout != null) {
                    C0490o.m396p(actionBarOverlayLayout);
                }
            } else {
                c0297o0.setVisibility(8);
            }
        }
        this.f2393g.mo1073s(!this.f2405s && z3);
        this.f2391e.setHasNonEmbeddedTabs((this.f2405s || !z3) ? false : false);
    }

    /* renamed from: K */
    private boolean m132K() {
        return C0490o.m401k(this.f2392f);
    }

    /* renamed from: L */
    private void m131L() {
        if (this.f2410x) {
            return;
        }
        this.f2410x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2391e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m130M(false);
    }

    /* renamed from: M */
    private void m130M(boolean z) {
        if (m112w(this.f2408v, this.f2409w, this.f2410x)) {
            if (this.f2411y) {
                return;
            }
            this.f2411y = true;
            m109z(z);
        } else if (this.f2411y) {
            this.f2411y = false;
            m110y(z);
        }
    }

    /* renamed from: w */
    static boolean m112w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: B */
    public int m141B() {
        return this.f2393g.mo1070v();
    }

    /* renamed from: E */
    public void m138E(boolean z) {
        m137F(z ? 4 : 0, 4);
    }

    /* renamed from: F */
    public void m137F(int i, int i2) {
        int mo1081k = this.f2393g.mo1081k();
        if ((i2 & 4) != 0) {
            this.f2399m = true;
        }
        this.f2393g.mo1071u((i & i2) | ((i2 ^ (-1)) & mo1081k));
    }

    /* renamed from: G */
    public void m136G(float f) {
        C0490o.m391u(this.f2392f, f);
    }

    /* renamed from: I */
    public void m134I(boolean z) {
        if (z && !this.f2391e.m1518v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f2383B = z;
        this.f2391e.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: J */
    public void m133J(boolean z) {
        this.f2393g.mo1075q(z);
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: a */
    public void mo129a() {
        C0595h c0595h = this.f2412z;
        if (c0595h != null) {
            c0595h.m41a();
            this.f2412z = null;
        }
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: b */
    public void mo128b(boolean z) {
        this.f2407u = z;
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: c */
    public void mo127c(int i) {
        this.f2406t = i;
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: d */
    public void mo126d() {
        if (this.f2409w) {
            return;
        }
        this.f2409w = true;
        m130M(true);
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: e */
    public void mo125e() {
        if (this.f2409w) {
            this.f2409w = false;
            m130M(true);
        }
    }

    @Override // android.support.p002v7.widget.ActionBarOverlayLayout.InterfaceC0213d
    /* renamed from: f */
    public void mo124f() {
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: h */
    public boolean mo123h() {
        InterfaceC0256d0 interfaceC0256d0 = this.f2393g;
        if (interfaceC0256d0 == null || !interfaceC0256d0.mo1078n()) {
            return false;
        }
        this.f2393g.collapseActionView();
        return true;
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: i */
    public void mo122i(boolean z) {
        if (z == this.f2403q) {
            return;
        }
        this.f2403q = z;
        int size = this.f2404r.size();
        for (int i = 0; i < size; i++) {
            this.f2404r.get(i).m293a(z);
        }
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: j */
    public int mo121j() {
        return this.f2393g.mo1081k();
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: k */
    public Context mo120k() {
        if (this.f2388b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2387a.getTheme().resolveAttribute(C0569a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2388b = new ContextThemeWrapper(this.f2387a, i);
            } else {
                this.f2388b = this.f2387a;
            }
        }
        return this.f2388b;
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: m */
    public void mo119m(Configuration configuration) {
        m135H(C0584a.m88b(this.f2387a).m83g());
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: o */
    public boolean mo118o(int i, KeyEvent keyEvent) {
        Menu mo71e;
        C0568d c0568d = this.f2400n;
        if (c0568d == null || (mo71e = c0568d.mo71e()) == null) {
            return false;
        }
        mo71e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo71e.performShortcut(i, keyEvent, 0);
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: r */
    public void mo117r(boolean z) {
        if (this.f2399m) {
            return;
        }
        m138E(z);
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: s */
    public void mo116s(boolean z) {
        C0595h c0595h;
        this.f2382A = z;
        if (z || (c0595h = this.f2412z) == null) {
            return;
        }
        c0595h.m41a();
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: t */
    public void mo115t(CharSequence charSequence) {
        this.f2393g.setWindowTitle(charSequence);
    }

    @Override // p019r.AbstractC0525a
    /* renamed from: u */
    public AbstractC0585b mo114u(AbstractC0585b.InterfaceC0586a interfaceC0586a) {
        C0568d c0568d = this.f2400n;
        if (c0568d != null) {
            c0568d.mo73c();
        }
        this.f2391e.setHideOnContentScrollEnabled(false);
        this.f2394h.m1528k();
        C0568d c0568d2 = new C0568d(this.f2394h.getContext(), interfaceC0586a);
        if (c0568d2.m107t()) {
            this.f2400n = c0568d2;
            c0568d2.mo67k();
            this.f2394h.m1531h(c0568d2);
            m113v(true);
            this.f2394h.sendAccessibilityEvent(32);
            return c0568d2;
        }
        return null;
    }

    /* renamed from: v */
    public void m113v(boolean z) {
        C0511s mo1082j;
        C0511s mo1400f;
        if (z) {
            m131L();
        } else {
            m140C();
        }
        if (!m132K()) {
            if (z) {
                this.f2393g.mo1080l(4);
                this.f2394h.setVisibility(0);
                return;
            }
            this.f2393g.mo1080l(0);
            this.f2394h.setVisibility(8);
            return;
        }
        if (z) {
            mo1400f = this.f2393g.mo1082j(4, 100L);
            mo1082j = this.f2394h.mo1400f(0, 200L);
        } else {
            mo1082j = this.f2393g.mo1082j(0, 200L);
            mo1400f = this.f2394h.mo1400f(8, 100L);
        }
        C0595h c0595h = new C0595h();
        c0595h.m38d(mo1400f, mo1082j);
        c0595h.m34h();
    }

    /* renamed from: x */
    void m111x() {
        AbstractC0585b.InterfaceC0586a interfaceC0586a = this.f2402p;
        if (interfaceC0586a != null) {
            interfaceC0586a.mo58b(this.f2401o);
            this.f2401o = null;
            this.f2402p = null;
        }
    }

    /* renamed from: y */
    public void m110y(boolean z) {
        View view;
        int[] iArr;
        C0595h c0595h = this.f2412z;
        if (c0595h != null) {
            c0595h.m41a();
        }
        if (this.f2406t != 0 || (!this.f2382A && !z)) {
            this.f2384C.mo33a(null);
            return;
        }
        this.f2392f.setAlpha(1.0f);
        this.f2392f.setTransitioning(true);
        C0595h c0595h2 = new C0595h();
        float f = -this.f2392f.getHeight();
        if (z) {
            this.f2392f.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        C0511s m334k = C0490o.m411a(this.f2392f).m334k(f);
        m334k.m336i(this.f2386E);
        c0595h2.m39c(m334k);
        if (this.f2407u && (view = this.f2395i) != null) {
            c0595h2.m39c(C0490o.m411a(view).m334k(f));
        }
        c0595h2.m36f(f2380F);
        c0595h2.m37e(250L);
        c0595h2.m35g(this.f2384C);
        this.f2412z = c0595h2;
        c0595h2.m34h();
    }

    /* renamed from: z */
    public void m109z(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C0595h c0595h = this.f2412z;
        if (c0595h != null) {
            c0595h.m41a();
        }
        this.f2392f.setVisibility(0);
        if (this.f2406t == 0 && (this.f2382A || z)) {
            this.f2392f.setTranslationY(0.0f);
            float f = -this.f2392f.getHeight();
            if (z) {
                this.f2392f.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f2392f.setTranslationY(f);
            C0595h c0595h2 = new C0595h();
            C0511s m334k = C0490o.m411a(this.f2392f).m334k(0.0f);
            m334k.m336i(this.f2386E);
            c0595h2.m39c(m334k);
            if (this.f2407u && (view2 = this.f2395i) != null) {
                view2.setTranslationY(f);
                c0595h2.m39c(C0490o.m411a(this.f2395i).m334k(0.0f));
            }
            c0595h2.m36f(f2381G);
            c0595h2.m37e(250L);
            c0595h2.m35g(this.f2385D);
            this.f2412z = c0595h2;
            c0595h2.m34h();
        } else {
            this.f2392f.setAlpha(1.0f);
            this.f2392f.setTranslationY(0.0f);
            if (this.f2407u && (view = this.f2395i) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2385D.mo33a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2391e;
        if (actionBarOverlayLayout != null) {
            C0490o.m396p(actionBarOverlayLayout);
        }
    }
}