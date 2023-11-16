package p019r;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.app.C0126v;
import android.support.p002v7.view.menu.C0189c;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.C0241a1;
import android.support.p002v7.widget.C0244b1;
import android.support.p002v7.widget.C0283k;
import android.support.p002v7.widget.ContentFrameLayout;
import android.support.p002v7.widget.InterfaceC0246c0;
import android.support.p002v7.widget.InterfaceC0265g0;
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
import org.xmlpull.v1.XmlPullParser;
import p016o.C0475e;
import p016o.C0490o;
import p016o.C0511s;
import p016o.C0515u;
import p016o.C0517w;
import p016o.InterfaceC0488m;
import p020s.C0569a;
import p020s.C0571c;
import p020s.C0574f;
import p020s.C0575g;
import p020s.C0577i;
import p020s.C0578j;
import p021t.C0580b;
import p023v.AbstractC0585b;
import p023v.C0588d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.i */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0543i extends AbstractC0532e implements C0192e.InterfaceC0193a, LayoutInflater.Factory2 {

    /* renamed from: U */
    private static final boolean f2290U;

    /* renamed from: A */
    PopupWindow f2291A;

    /* renamed from: B */
    Runnable f2292B;

    /* renamed from: C */
    C0511s f2293C;

    /* renamed from: D */
    private boolean f2294D;

    /* renamed from: E */
    private ViewGroup f2295E;

    /* renamed from: F */
    private TextView f2296F;

    /* renamed from: G */
    private View f2297G;

    /* renamed from: H */
    private boolean f2298H;

    /* renamed from: I */
    private boolean f2299I;

    /* renamed from: J */
    private boolean f2300J;

    /* renamed from: K */
    private C0555j[] f2301K;

    /* renamed from: L */
    private C0555j f2302L;

    /* renamed from: M */
    private boolean f2303M;

    /* renamed from: N */
    boolean f2304N;

    /* renamed from: O */
    int f2305O;

    /* renamed from: P */
    private final Runnable f2306P;

    /* renamed from: Q */
    private boolean f2307Q;

    /* renamed from: R */
    private Rect f2308R;

    /* renamed from: S */
    private Rect f2309S;

    /* renamed from: T */
    private C0558k f2310T;

    /* renamed from: v */
    private InterfaceC0246c0 f2311v;

    /* renamed from: w */
    private C0551g f2312w;

    /* renamed from: x */
    private C0556k f2313x;

    /* renamed from: y */
    AbstractC0585b f2314y;

    /* renamed from: z */
    ActionBarContextView f2315z;

    /* renamed from: r.i$a */
    /* loaded from: classes.dex */
    class RunnableC0544a implements Runnable {
        RunnableC0544a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
            if ((layoutInflater$Factory2C0543i.f2305O & 1) != 0) {
                layoutInflater$Factory2C0543i.m232W(0);
            }
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i2 = LayoutInflater$Factory2C0543i.this;
            if ((layoutInflater$Factory2C0543i2.f2305O & 4096) != 0) {
                layoutInflater$Factory2C0543i2.m232W(108);
            }
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i3 = LayoutInflater$Factory2C0543i.this;
            layoutInflater$Factory2C0543i3.f2304N = false;
            layoutInflater$Factory2C0543i3.f2305O = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$b */
    /* loaded from: classes.dex */
    public class C0545b implements InterfaceC0488m {
        C0545b() {
        }

        @Override // p016o.InterfaceC0488m
        /* renamed from: a */
        public C0517w mo192a(View view, C0517w c0517w) {
            int m329d = c0517w.m329d();
            int m197v0 = LayoutInflater$Factory2C0543i.this.m197v0(m329d);
            if (m329d != m197v0) {
                c0517w = c0517w.m328e(c0517w.m331b(), m197v0, c0517w.m330c(), c0517w.m332a());
            }
            return C0490o.m400l(view, c0517w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$c */
    /* loaded from: classes.dex */
    public class C0546c implements InterfaceC0265g0.InterfaceC0266a {
        C0546c() {
        }

        @Override // android.support.p002v7.widget.InterfaceC0265g0.InterfaceC0266a
        /* renamed from: a */
        public void mo191a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0543i.this.m197v0(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$d */
    /* loaded from: classes.dex */
    public class C0547d implements ContentFrameLayout.InterfaceC0220a {
        C0547d() {
        }

        @Override // android.support.p002v7.widget.ContentFrameLayout.InterfaceC0220a
        /* renamed from: a */
        public void mo190a() {
        }

        @Override // android.support.p002v7.widget.ContentFrameLayout.InterfaceC0220a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0543i.this.m233V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$e */
    /* loaded from: classes.dex */
    public class RunnableC0548e implements Runnable {

        /* renamed from: r.i$e$a */
        /* loaded from: classes.dex */
        class C0549a extends C0515u {
            C0549a() {
            }

            @Override // p016o.InterfaceC0514t
            /* renamed from: a */
            public void mo33a(View view) {
                LayoutInflater$Factory2C0543i.this.f2315z.setAlpha(1.0f);
                LayoutInflater$Factory2C0543i.this.f2293C.m339f(null);
                LayoutInflater$Factory2C0543i.this.f2293C = null;
            }

            @Override // p016o.C0515u, p016o.InterfaceC0514t
            /* renamed from: b */
            public void mo32b(View view) {
                LayoutInflater$Factory2C0543i.this.f2315z.setVisibility(0);
            }
        }

        RunnableC0548e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
            layoutInflater$Factory2C0543i.f2291A.showAtLocation(layoutInflater$Factory2C0543i.f2315z, 55, 0, 0);
            LayoutInflater$Factory2C0543i.this.m231X();
            if (!LayoutInflater$Factory2C0543i.this.m205q0()) {
                LayoutInflater$Factory2C0543i.this.f2315z.setAlpha(1.0f);
                LayoutInflater$Factory2C0543i.this.f2315z.setVisibility(0);
                return;
            }
            LayoutInflater$Factory2C0543i.this.f2315z.setAlpha(0.0f);
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i2 = LayoutInflater$Factory2C0543i.this;
            layoutInflater$Factory2C0543i2.f2293C = C0490o.m411a(layoutInflater$Factory2C0543i2.f2315z).m344a(1.0f);
            LayoutInflater$Factory2C0543i.this.f2293C.m339f(new C0549a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$f */
    /* loaded from: classes.dex */
    public class C0550f extends C0515u {
        C0550f() {
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            LayoutInflater$Factory2C0543i.this.f2315z.setAlpha(1.0f);
            LayoutInflater$Factory2C0543i.this.f2293C.m339f(null);
            LayoutInflater$Factory2C0543i.this.f2293C = null;
        }

        @Override // p016o.C0515u, p016o.InterfaceC0514t
        /* renamed from: b */
        public void mo32b(View view) {
            LayoutInflater$Factory2C0543i.this.f2315z.setVisibility(0);
            LayoutInflater$Factory2C0543i.this.f2315z.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0543i.this.f2315z.getParent() instanceof View) {
                C0490o.m396p((View) LayoutInflater$Factory2C0543i.this.f2315z.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.i$g */
    /* loaded from: classes.dex */
    public final class C0551g implements InterfaceC0201j.InterfaceC0202a {
        C0551g() {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: a */
        public void mo184a(C0192e c0192e, boolean z) {
            LayoutInflater$Factory2C0543i.this.m238Q(c0192e);
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: b */
        public boolean mo183b(C0192e c0192e) {
            Window.Callback m268E = LayoutInflater$Factory2C0543i.this.m268E();
            if (m268E != null) {
                m268E.onMenuOpened(108, c0192e);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.i$h */
    /* loaded from: classes.dex */
    public class C0552h implements AbstractC0585b.InterfaceC0586a {

        /* renamed from: a */
        private AbstractC0585b.InterfaceC0586a f2324a;

        /* renamed from: r.i$h$a */
        /* loaded from: classes.dex */
        class C0553a extends C0515u {
            C0553a() {
            }

            @Override // p016o.InterfaceC0514t
            /* renamed from: a */
            public void mo33a(View view) {
                LayoutInflater$Factory2C0543i.this.f2315z.setVisibility(8);
                LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0543i.f2291A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0543i.f2315z.getParent() instanceof View) {
                    C0490o.m396p((View) LayoutInflater$Factory2C0543i.this.f2315z.getParent());
                }
                LayoutInflater$Factory2C0543i.this.f2315z.removeAllViews();
                LayoutInflater$Factory2C0543i.this.f2293C.m339f(null);
                LayoutInflater$Factory2C0543i.this.f2293C = null;
            }
        }

        public C0552h(AbstractC0585b.InterfaceC0586a interfaceC0586a) {
            this.f2324a = interfaceC0586a;
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: a */
        public boolean mo59a(AbstractC0585b abstractC0585b, Menu menu) {
            return this.f2324a.mo59a(abstractC0585b, menu);
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: b */
        public void mo58b(AbstractC0585b abstractC0585b) {
            this.f2324a.mo58b(abstractC0585b);
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
            if (layoutInflater$Factory2C0543i.f2291A != null) {
                layoutInflater$Factory2C0543i.f2260e.getDecorView().removeCallbacks(LayoutInflater$Factory2C0543i.this.f2292B);
            }
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i2 = LayoutInflater$Factory2C0543i.this;
            if (layoutInflater$Factory2C0543i2.f2315z != null) {
                layoutInflater$Factory2C0543i2.m231X();
                LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i3 = LayoutInflater$Factory2C0543i.this;
                layoutInflater$Factory2C0543i3.f2293C = C0490o.m411a(layoutInflater$Factory2C0543i3.f2315z).m344a(0.0f);
                LayoutInflater$Factory2C0543i.this.f2293C.m339f(new C0553a());
            }
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i4 = LayoutInflater$Factory2C0543i.this;
            InterfaceC0530c interfaceC0530c = layoutInflater$Factory2C0543i4.f2263h;
            if (interfaceC0530c != null) {
                interfaceC0530c.mo180c(layoutInflater$Factory2C0543i4.f2314y);
            }
            LayoutInflater$Factory2C0543i.this.f2314y = null;
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: c */
        public boolean mo57c(AbstractC0585b abstractC0585b, Menu menu) {
            return this.f2324a.mo57c(abstractC0585b, menu);
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: d */
        public boolean mo56d(AbstractC0585b abstractC0585b, MenuItem menuItem) {
            return this.f2324a.mo56d(abstractC0585b, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.i$i */
    /* loaded from: classes.dex */
    public class C0554i extends ContentFrameLayout {
        public C0554i(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m189c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0543i.this.mo247B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m189c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0543i.this.m237R(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0580b.m98d(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r.i$j */
    /* loaded from: classes.dex */
    public static final class C0555j {

        /* renamed from: a */
        int f2328a;

        /* renamed from: b */
        int f2329b;

        /* renamed from: c */
        int f2330c;

        /* renamed from: d */
        int f2331d;

        /* renamed from: e */
        int f2332e;

        /* renamed from: f */
        int f2333f;

        /* renamed from: g */
        ViewGroup f2334g;

        /* renamed from: h */
        View f2335h;

        /* renamed from: i */
        View f2336i;

        /* renamed from: j */
        C0192e f2337j;

        /* renamed from: k */
        C0189c f2338k;

        /* renamed from: l */
        Context f2339l;

        /* renamed from: m */
        boolean f2340m;

        /* renamed from: n */
        boolean f2341n;

        /* renamed from: o */
        boolean f2342o;

        /* renamed from: p */
        public boolean f2343p;

        /* renamed from: q */
        boolean f2344q = false;

        /* renamed from: r */
        boolean f2345r;

        /* renamed from: s */
        Bundle f2346s;

        C0555j(int i) {
            this.f2328a = i;
        }

        /* renamed from: a */
        InterfaceC0203k m188a(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
            if (this.f2337j == null) {
                return null;
            }
            if (this.f2338k == null) {
                C0189c c0189c = new C0189c(this.f2339l, C0575g.abc_list_menu_item_layout);
                this.f2338k = c0189c;
                c0189c.mo1554j(interfaceC0202a);
                this.f2337j.m1628b(this.f2338k);
            }
            return this.f2338k.m1658d(this.f2334g);
        }

        /* renamed from: b */
        public boolean m187b() {
            if (this.f2335h == null) {
                return false;
            }
            return this.f2336i != null || this.f2338k.m1659c().getCount() > 0;
        }

        /* renamed from: c */
        void m186c(C0192e c0192e) {
            C0189c c0189c;
            C0192e c0192e2 = this.f2337j;
            if (c0192e == c0192e2) {
                return;
            }
            if (c0192e2 != null) {
                c0192e2.m1641O(this.f2338k);
            }
            this.f2337j = c0192e;
            if (c0192e == null || (c0189c = this.f2338k) == null) {
                return;
            }
            c0192e.m1628b(c0189c);
        }

        /* renamed from: d */
        void m185d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0569a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0569a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0577i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0588d c0588d = new C0588d(context, 0);
            c0588d.getTheme().setTo(newTheme);
            this.f2339l = c0588d;
            TypedArray obtainStyledAttributes = c0588d.obtainStyledAttributes(C0578j.f2567k0);
            this.f2329b = obtainStyledAttributes.getResourceId(C0578j.f2579n0, 0);
            this.f2333f = obtainStyledAttributes.getResourceId(C0578j.f2575m0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.i$k */
    /* loaded from: classes.dex */
    public final class C0556k implements InterfaceC0201j.InterfaceC0202a {
        C0556k() {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: a */
        public void mo184a(C0192e c0192e, boolean z) {
            C0192e mo1544D = c0192e.mo1544D();
            boolean z2 = mo1544D != c0192e;
            LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
            if (z2) {
                c0192e = mo1544D;
            }
            C0555j m229Z = layoutInflater$Factory2C0543i.m229Z(c0192e);
            if (m229Z != null) {
                if (!z2) {
                    LayoutInflater$Factory2C0543i.this.m236S(m229Z, z);
                    return;
                }
                LayoutInflater$Factory2C0543i.this.m239P(m229Z.f2328a, m229Z, mo1544D);
                LayoutInflater$Factory2C0543i.this.m236S(m229Z, true);
            }
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: b */
        public boolean mo183b(C0192e c0192e) {
            Window.Callback m268E;
            if (c0192e == null) {
                LayoutInflater$Factory2C0543i layoutInflater$Factory2C0543i = LayoutInflater$Factory2C0543i.this;
                if (!layoutInflater$Factory2C0543i.f2266k || (m268E = layoutInflater$Factory2C0543i.m268E()) == null || LayoutInflater$Factory2C0543i.this.m267G()) {
                    return true;
                }
                m268E.onMenuOpened(108, c0192e);
                return true;
            }
            return true;
        }
    }

    static {
        f2290U = Build.VERSION.SDK_INT < 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0543i(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        super(context, window, interfaceC0530c);
        this.f2293C = null;
        this.f2306P = new RunnableC0544a();
    }

    /* renamed from: N */
    private void m241N() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2295E.findViewById(16908290);
        View decorView = this.f2260e.getDecorView();
        contentFrameLayout.m1489b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2259d.obtainStyledAttributes(C0578j.f2567k0);
        obtainStyledAttributes.getValue(C0578j.f2615w0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0578j.f2619x0, contentFrameLayout.getMinWidthMinor());
        int i = C0578j.f2607u0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C0578j.f2611v0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C0578j.f2599s0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C0578j.f2603t0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: T */
    private ViewGroup m235T() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f2259d.obtainStyledAttributes(C0578j.f2567k0);
        int i = C0578j.f2587p0;
        if (!obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0578j.f2623y0, false)) {
            mo196w(1);
        } else if (obtainStyledAttributes.getBoolean(i, false)) {
            mo196w(108);
        }
        if (obtainStyledAttributes.getBoolean(C0578j.f2591q0, false)) {
            mo196w(109);
        }
        if (obtainStyledAttributes.getBoolean(C0578j.f2595r0, false)) {
            mo196w(10);
        }
        this.f2269n = obtainStyledAttributes.getBoolean(C0578j.f2571l0, false);
        obtainStyledAttributes.recycle();
        this.f2260e.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f2259d);
        if (this.f2270o) {
            viewGroup = (ViewGroup) from.inflate(this.f2268m ? C0575g.abc_screen_simple_overlay_action_mode : C0575g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0490o.m390v(viewGroup, new C0545b());
            } else {
                ((InterfaceC0265g0) viewGroup).setOnFitSystemWindowsListener(new C0546c());
            }
        } else if (this.f2269n) {
            viewGroup = (ViewGroup) from.inflate(C0575g.abc_dialog_title_material, (ViewGroup) null);
            this.f2267l = false;
            this.f2266k = false;
        } else if (this.f2266k) {
            TypedValue typedValue = new TypedValue();
            this.f2259d.getTheme().resolveAttribute(C0569a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0588d(this.f2259d, typedValue.resourceId) : this.f2259d).inflate(C0575g.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0246c0 interfaceC0246c0 = (InterfaceC0246c0) viewGroup.findViewById(C0574f.decor_content_parent);
            this.f2311v = interfaceC0246c0;
            interfaceC0246c0.setWindowCallback(m268E());
            if (this.f2267l) {
                this.f2311v.mo1360h(109);
            }
            if (this.f2298H) {
                this.f2311v.mo1360h(2);
            }
            if (this.f2299I) {
                this.f2311v.mo1360h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2266k + ", windowActionBarOverlay: " + this.f2267l + ", android:windowIsFloating: " + this.f2269n + ", windowActionModeOverlay: " + this.f2268m + ", windowNoTitle: " + this.f2270o + " }");
        }
        if (this.f2311v == null) {
            this.f2296F = (TextView) viewGroup.findViewById(C0574f.title);
        }
        C0244b1.m1368c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0574f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2260e.findViewById(16908290);
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
        this.f2260e.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0547d());
        return viewGroup;
    }

    /* renamed from: Y */
    private void m230Y() {
        if (this.f2294D) {
            return;
        }
        this.f2295E = m235T();
        CharSequence m269D = m269D();
        if (!TextUtils.isEmpty(m269D)) {
            mo242K(m269D);
        }
        m241N();
        m216k0(this.f2295E);
        this.f2294D = true;
        C0555j m228a0 = m228a0(0, false);
        if (m267G()) {
            return;
        }
        if (m228a0 == null || m228a0.f2337j == null) {
            m223e0(108);
        }
    }

    /* renamed from: b0 */
    private boolean m227b0(C0555j c0555j) {
        View view = c0555j.f2336i;
        if (view != null) {
            c0555j.f2335h = view;
            return true;
        } else if (c0555j.f2337j == null) {
            return false;
        } else {
            if (this.f2313x == null) {
                this.f2313x = new C0556k();
            }
            View view2 = (View) c0555j.m188a(this.f2313x);
            c0555j.f2335h = view2;
            return view2 != null;
        }
    }

    /* renamed from: c0 */
    private boolean m225c0(C0555j c0555j) {
        c0555j.m185d(m270C());
        c0555j.f2334g = new C0554i(c0555j.f2339l);
        c0555j.f2330c = 81;
        return true;
    }

    /* renamed from: d0 */
    private boolean m224d0(C0555j c0555j) {
        Context context = this.f2259d;
        int i = c0555j.f2328a;
        if ((i == 0 || i == 108) && this.f2311v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0569a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0569a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0569a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0588d c0588d = new C0588d(context, 0);
                c0588d.getTheme().setTo(theme2);
                context = c0588d;
            }
        }
        C0192e c0192e = new C0192e(context);
        c0192e.mo1540R(this);
        c0555j.m186c(c0192e);
        return true;
    }

    /* renamed from: e0 */
    private void m223e0(int i) {
        this.f2305O = (1 << i) | this.f2305O;
        if (this.f2304N) {
            return;
        }
        C0490o.m398n(this.f2260e.getDecorView(), this.f2306P);
        this.f2304N = true;
    }

    /* renamed from: h0 */
    private boolean m219h0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0555j m228a0 = m228a0(i, true);
            if (m228a0.f2342o) {
                return false;
            }
            return m211n0(m228a0, keyEvent);
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m217j0(int i, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0246c0 interfaceC0246c0;
        if (this.f2314y != null) {
            return false;
        }
        boolean z2 = true;
        C0555j m228a0 = m228a0(i, true);
        if (i != 0 || (interfaceC0246c0 = this.f2311v) == null || !interfaceC0246c0.mo1363e() || ViewConfiguration.get(this.f2259d).hasPermanentMenuKey()) {
            boolean z3 = m228a0.f2342o;
            if (z3 || m228a0.f2341n) {
                m236S(m228a0, true);
                z2 = z3;
            } else {
                if (m228a0.f2340m) {
                    if (m228a0.f2345r) {
                        m228a0.f2340m = false;
                        z = m211n0(m228a0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m214l0(m228a0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f2311v.mo1364d()) {
            z2 = this.f2311v.mo1361g();
        } else {
            if (!m267G() && m211n0(m228a0, keyEvent)) {
                z2 = this.f2311v.mo1367a();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f2259d.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: l0 */
    private void m214l0(C0555j c0555j, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0555j.f2342o || m267G()) {
            return;
        }
        if (c0555j.f2328a == 0) {
            if ((this.f2259d.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m268E = m268E();
        if (m268E != null && !m268E.onMenuOpened(c0555j.f2328a, c0555j.f2337j)) {
            m236S(c0555j, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2259d.getSystemService("window");
        if (windowManager != null && m211n0(c0555j, keyEvent)) {
            ViewGroup viewGroup = c0555j.f2334g;
            if (viewGroup == null || c0555j.f2344q) {
                if (viewGroup == null) {
                    if (!m225c0(c0555j) || c0555j.f2334g == null) {
                        return;
                    }
                } else if (c0555j.f2344q && viewGroup.getChildCount() > 0) {
                    c0555j.f2334g.removeAllViews();
                }
                if (!m227b0(c0555j) || !c0555j.m187b()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = c0555j.f2335h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0555j.f2334g.setBackgroundResource(c0555j.f2329b);
                ViewParent parent = c0555j.f2335h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(c0555j.f2335h);
                }
                c0555j.f2334g.addView(c0555j.f2335h, layoutParams2);
                if (!c0555j.f2335h.hasFocus()) {
                    c0555j.f2335h.requestFocus();
                }
            } else {
                View view = c0555j.f2336i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    c0555j.f2341n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, c0555j.f2331d, c0555j.f2332e, 1002, 8519680, -3);
                    layoutParams3.gravity = c0555j.f2330c;
                    layoutParams3.windowAnimations = c0555j.f2333f;
                    windowManager.addView(c0555j.f2334g, layoutParams3);
                    c0555j.f2342o = true;
                }
            }
            i = -2;
            c0555j.f2341n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, c0555j.f2331d, c0555j.f2332e, 1002, 8519680, -3);
            layoutParams32.gravity = c0555j.f2330c;
            layoutParams32.windowAnimations = c0555j.f2333f;
            windowManager.addView(c0555j.f2334g, layoutParams32);
            c0555j.f2342o = true;
        }
    }

    /* renamed from: m0 */
    private boolean m212m0(C0555j c0555j, int i, KeyEvent keyEvent, int i2) {
        C0192e c0192e;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0555j.f2340m || m211n0(c0555j, keyEvent)) && (c0192e = c0555j.f2337j) != null) {
            z = c0192e.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2311v == null) {
            m236S(c0555j, true);
        }
        return z;
    }

    /* renamed from: n0 */
    private boolean m211n0(C0555j c0555j, KeyEvent keyEvent) {
        InterfaceC0246c0 interfaceC0246c0;
        InterfaceC0246c0 interfaceC0246c02;
        InterfaceC0246c0 interfaceC0246c03;
        if (m267G()) {
            return false;
        }
        if (c0555j.f2340m) {
            return true;
        }
        C0555j c0555j2 = this.f2302L;
        if (c0555j2 != null && c0555j2 != c0555j) {
            m236S(c0555j2, false);
        }
        Window.Callback m268E = m268E();
        if (m268E != null) {
            c0555j.f2336i = m268E.onCreatePanelView(c0555j.f2328a);
        }
        int i = c0555j.f2328a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0246c03 = this.f2311v) != null) {
            interfaceC0246c03.mo1365c();
        }
        if (c0555j.f2336i == null) {
            if (z) {
                m266L();
            }
            C0192e c0192e = c0555j.f2337j;
            if (c0192e == null || c0555j.f2345r) {
                if (c0192e == null && (!m224d0(c0555j) || c0555j.f2337j == null)) {
                    return false;
                }
                if (z && this.f2311v != null) {
                    if (this.f2312w == null) {
                        this.f2312w = new C0551g();
                    }
                    this.f2311v.mo1362f(c0555j.f2337j, this.f2312w);
                }
                c0555j.f2337j.m1623d0();
                if (!m268E.onCreatePanelMenu(c0555j.f2328a, c0555j.f2337j)) {
                    c0555j.m186c(null);
                    if (z && (interfaceC0246c0 = this.f2311v) != null) {
                        interfaceC0246c0.mo1362f(null, this.f2312w);
                    }
                    return false;
                }
                c0555j.f2345r = false;
            }
            c0555j.f2337j.m1623d0();
            Bundle bundle = c0555j.f2346s;
            if (bundle != null) {
                c0555j.f2337j.m1640P(bundle);
                c0555j.f2346s = null;
            }
            if (!m268E.onPreparePanel(0, c0555j.f2336i, c0555j.f2337j)) {
                if (z && (interfaceC0246c02 = this.f2311v) != null) {
                    interfaceC0246c02.mo1362f(null, this.f2312w);
                }
                c0555j.f2337j.m1625c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0555j.f2343p = z2;
            c0555j.f2337j.setQwertyMode(z2);
            c0555j.f2337j.m1625c0();
        }
        c0555j.f2340m = true;
        c0555j.f2341n = false;
        this.f2302L = c0555j;
        return true;
    }

    /* renamed from: o0 */
    private void m209o0(C0192e c0192e, boolean z) {
        InterfaceC0246c0 interfaceC0246c0 = this.f2311v;
        if (interfaceC0246c0 == null || !interfaceC0246c0.mo1363e() || (ViewConfiguration.get(this.f2259d).hasPermanentMenuKey() && !this.f2311v.mo1366b())) {
            C0555j m228a0 = m228a0(0, true);
            m228a0.f2344q = true;
            m236S(m228a0, false);
            m214l0(m228a0, null);
            return;
        }
        Window.Callback m268E = m268E();
        if (this.f2311v.mo1364d() && z) {
            this.f2311v.mo1361g();
            if (m267G()) {
                return;
            }
            m268E.onPanelClosed(108, m228a0(0, true).f2337j);
        } else if (m268E == null || m267G()) {
        } else {
            if (this.f2304N && (this.f2305O & 1) != 0) {
                this.f2260e.getDecorView().removeCallbacks(this.f2306P);
                this.f2306P.run();
            }
            C0555j m228a02 = m228a0(0, true);
            C0192e c0192e2 = m228a02.f2337j;
            if (c0192e2 == null || m228a02.f2345r || !m268E.onPreparePanel(0, m228a02.f2336i, c0192e2)) {
                return;
            }
            m268E.onMenuOpened(108, m228a02.f2337j);
            this.f2311v.mo1367a();
        }
    }

    /* renamed from: p0 */
    private int m207p0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* renamed from: r0 */
    private boolean m203r0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2260e.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0490o.m402j((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: u0 */
    private void m199u0() {
        if (this.f2294D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: B */
    boolean mo247B(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.f2261f.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m221g0(keyCode, keyEvent) : m218i0(keyCode, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // p019r.AbstractC0532e
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo246F() {
        /*
            r3 = this;
            r3.m230Y()
            boolean r0 = r3.f2266k
            if (r0 == 0) goto L37
            r.a r0 = r3.f2264i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            android.view.Window$Callback r0 = r3.f2261f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            r.o r0 = new r.o
            android.view.Window$Callback r1 = r3.f2261f
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f2267l
            r0.<init>(r1, r2)
        L1d:
            r3.f2264i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            r.o r0 = new r.o
            android.view.Window$Callback r1 = r3.f2261f
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            r.a r0 = r3.f2264i
            if (r0 == 0) goto L37
            boolean r1 = r3.f2307Q
            r0.mo117r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p019r.LayoutInflater$Factory2C0543i.mo246F():void");
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: H */
    boolean mo245H(int i, KeyEvent keyEvent) {
        AbstractC0525a mo264k = mo264k();
        if (mo264k == null || !mo264k.mo118o(i, keyEvent)) {
            C0555j c0555j = this.f2302L;
            if (c0555j != null && m212m0(c0555j, keyEvent.getKeyCode(), keyEvent, 1)) {
                C0555j c0555j2 = this.f2302L;
                if (c0555j2 != null) {
                    c0555j2.f2341n = true;
                }
                return true;
            }
            if (this.f2302L == null) {
                C0555j m228a0 = m228a0(0, true);
                m211n0(m228a0, keyEvent);
                boolean m212m0 = m212m0(m228a0, keyEvent.getKeyCode(), keyEvent, 1);
                m228a0.f2340m = false;
                if (m212m0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: I */
    boolean mo244I(int i, Menu menu) {
        if (i == 108) {
            AbstractC0525a mo264k = mo264k();
            if (mo264k != null) {
                mo264k.mo122i(true);
            }
            return true;
        }
        return false;
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: J */
    void mo243J(int i, Menu menu) {
        if (i == 108) {
            AbstractC0525a mo264k = mo264k();
            if (mo264k != null) {
                mo264k.mo122i(false);
            }
        } else if (i == 0) {
            C0555j m228a0 = m228a0(i, true);
            if (m228a0.f2342o) {
                m236S(m228a0, false);
            }
        }
    }

    @Override // p019r.AbstractC0532e
    /* renamed from: K */
    void mo242K(CharSequence charSequence) {
        InterfaceC0246c0 interfaceC0246c0 = this.f2311v;
        if (interfaceC0246c0 != null) {
            interfaceC0246c0.setWindowTitle(charSequence);
        } else if (m266L() != null) {
            m266L().mo115t(charSequence);
        } else {
            TextView textView = this.f2296F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: O */
    View mo240O(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    /* renamed from: P */
    void m239P(int i, C0555j c0555j, Menu menu) {
        if (menu == null) {
            if (c0555j == null && i >= 0) {
                C0555j[] c0555jArr = this.f2301K;
                if (i < c0555jArr.length) {
                    c0555j = c0555jArr[i];
                }
            }
            if (c0555j != null) {
                menu = c0555j.f2337j;
            }
        }
        if ((c0555j == null || c0555j.f2342o) && !m267G()) {
            this.f2261f.onPanelClosed(i, menu);
        }
    }

    /* renamed from: Q */
    void m238Q(C0192e c0192e) {
        if (this.f2300J) {
            return;
        }
        this.f2300J = true;
        this.f2311v.mo1359j();
        Window.Callback m268E = m268E();
        if (m268E != null && !m267G()) {
            m268E.onPanelClosed(108, c0192e);
        }
        this.f2300J = false;
    }

    /* renamed from: R */
    void m237R(int i) {
        m236S(m228a0(i, true), true);
    }

    /* renamed from: S */
    void m236S(C0555j c0555j, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0246c0 interfaceC0246c0;
        if (z && c0555j.f2328a == 0 && (interfaceC0246c0 = this.f2311v) != null && interfaceC0246c0.mo1364d()) {
            m238Q(c0555j.f2337j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2259d.getSystemService("window");
        if (windowManager != null && c0555j.f2342o && (viewGroup = c0555j.f2334g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m239P(c0555j.f2328a, c0555j, null);
            }
        }
        c0555j.f2340m = false;
        c0555j.f2341n = false;
        c0555j.f2342o = false;
        c0555j.f2335h = null;
        c0555j.f2344q = true;
        if (this.f2302L == c0555j) {
            this.f2302L = null;
        }
    }

    /* renamed from: U */
    public View m234U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0558k c0558k;
        boolean z2 = false;
        if (this.f2310T == null) {
            String string = this.f2259d.obtainStyledAttributes(C0578j.f2567k0).getString(C0578j.f2583o0);
            if (string == null || C0558k.class.getName().equals(string)) {
                c0558k = new C0558k();
            } else {
                try {
                    this.f2310T = (C0558k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    c0558k = new C0558k();
                }
            }
            this.f2310T = c0558k;
        }
        boolean z3 = f2290U;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m203r0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f2310T.m161p(view, str, context, attributeSet, z, z3, true, C0241a1.m1398a());
    }

    /* renamed from: V */
    void m233V() {
        C0192e c0192e;
        InterfaceC0246c0 interfaceC0246c0 = this.f2311v;
        if (interfaceC0246c0 != null) {
            interfaceC0246c0.mo1359j();
        }
        if (this.f2291A != null) {
            this.f2260e.getDecorView().removeCallbacks(this.f2292B);
            if (this.f2291A.isShowing()) {
                try {
                    this.f2291A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2291A = null;
        }
        m231X();
        C0555j m228a0 = m228a0(0, false);
        if (m228a0 == null || (c0192e = m228a0.f2337j) == null) {
            return;
        }
        c0192e.close();
    }

    /* renamed from: W */
    void m232W(int i) {
        C0555j m228a0;
        C0555j m228a02 = m228a0(i, true);
        if (m228a02.f2337j != null) {
            Bundle bundle = new Bundle();
            m228a02.f2337j.m1639Q(bundle);
            if (bundle.size() > 0) {
                m228a02.f2346s = bundle;
            }
            m228a02.f2337j.m1623d0();
            m228a02.f2337j.clear();
        }
        m228a02.f2345r = true;
        m228a02.f2344q = true;
        if ((i != 108 && i != 0) || this.f2311v == null || (m228a0 = m228a0(0, false)) == null) {
            return;
        }
        m228a0.f2340m = false;
        m211n0(m228a0, null);
    }

    /* renamed from: X */
    void m231X() {
        C0511s c0511s = this.f2293C;
        if (c0511s != null) {
            c0511s.m343b();
        }
    }

    /* renamed from: Z */
    C0555j m229Z(Menu menu) {
        C0555j[] c0555jArr = this.f2301K;
        int length = c0555jArr != null ? c0555jArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0555j c0555j = c0555jArr[i];
            if (c0555j != null && c0555j.f2337j == menu) {
                return c0555j;
            }
        }
        return null;
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
    /* renamed from: a */
    public void mo75a(C0192e c0192e) {
        m209o0(c0192e, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public C0555j m228a0(int i, boolean z) {
        C0555j[] c0555jArr = this.f2301K;
        if (c0555jArr == null || c0555jArr.length <= i) {
            C0555j[] c0555jArr2 = new C0555j[i + 1];
            if (c0555jArr != null) {
                System.arraycopy(c0555jArr, 0, c0555jArr2, 0, c0555jArr.length);
            }
            this.f2301K = c0555jArr2;
            c0555jArr = c0555jArr2;
        }
        C0555j c0555j = c0555jArr[i];
        if (c0555j == null) {
            C0555j c0555j2 = new C0555j(i);
            c0555jArr[i] = c0555j2;
            return c0555j2;
        }
        return c0555j;
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
    /* renamed from: b */
    public boolean mo74b(C0192e c0192e, MenuItem menuItem) {
        C0555j m229Z;
        Window.Callback m268E = m268E();
        if (m268E == null || m267G() || (m229Z = m229Z(c0192e.mo1544D())) == null) {
            return false;
        }
        return m268E.onMenuItemSelected(m229Z.f2328a, menuItem);
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: c */
    public void mo226c(View view, ViewGroup.LayoutParams layoutParams) {
        m230Y();
        ((ViewGroup) this.f2295E.findViewById(16908290)).addView(view, layoutParams);
        this.f2261f.onContentChanged();
    }

    /* renamed from: f0 */
    boolean m222f0() {
        AbstractC0585b abstractC0585b = this.f2314y;
        if (abstractC0585b != null) {
            abstractC0585b.mo73c();
            return true;
        }
        AbstractC0525a mo264k = mo264k();
        return mo264k != null && mo264k.mo123h();
    }

    /* renamed from: g0 */
    boolean m221g0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f2303M = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m219h0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: h */
    public <T extends View> T mo220h(int i) {
        m230Y();
        return (T) this.f2260e.findViewById(i);
    }

    /* renamed from: i0 */
    boolean m218i0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2303M;
            this.f2303M = false;
            C0555j m228a0 = m228a0(0, false);
            if (m228a0 != null && m228a0.f2342o) {
                if (!z) {
                    m236S(m228a0, true);
                }
                return true;
            } else if (m222f0()) {
                return true;
            }
        } else if (i == 82) {
            m217j0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    void m216k0(ViewGroup viewGroup) {
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: l */
    public void mo215l() {
        LayoutInflater from = LayoutInflater.from(this.f2259d);
        if (from.getFactory() == null) {
            C0475e.m454b(from, this);
        } else if (from.getFactory2() instanceof LayoutInflater$Factory2C0543i) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: m */
    public void mo213m() {
        AbstractC0525a mo264k = mo264k();
        if (mo264k == null || !mo264k.m297l()) {
            m223e0(0);
        }
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: o */
    public void mo210o(Configuration configuration) {
        AbstractC0525a mo264k;
        if (this.f2266k && this.f2294D && (mo264k = mo264k()) != null) {
            mo264k.mo119m(configuration);
        }
        C0283k.m1214n().m1203y(this.f2259d);
        mo260d();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View mo240O = mo240O(view, str, context, attributeSet);
        return mo240O != null ? mo240O : m234U(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: p */
    public void mo208p(Bundle bundle) {
        Window.Callback callback = this.f2261f;
        if (!(callback instanceof Activity) || C0126v.m1825c((Activity) callback) == null) {
            return;
        }
        AbstractC0525a m266L = m266L();
        if (m266L == null) {
            this.f2307Q = true;
        } else {
            m266L.mo117r(true);
        }
    }

    @Override // p019r.AbstractC0532e, p019r.AbstractC0531d
    /* renamed from: q */
    public void mo206q() {
        if (this.f2304N) {
            this.f2260e.getDecorView().removeCallbacks(this.f2306P);
        }
        super.mo206q();
        AbstractC0525a abstractC0525a = this.f2264i;
        if (abstractC0525a != null) {
            abstractC0525a.m296n();
        }
    }

    /* renamed from: q0 */
    final boolean m205q0() {
        ViewGroup viewGroup;
        return this.f2294D && (viewGroup = this.f2295E) != null && C0490o.m401k(viewGroup);
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: r */
    public void mo204r(Bundle bundle) {
        m230Y();
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: s */
    public void mo202s() {
        AbstractC0525a mo264k = mo264k();
        if (mo264k != null) {
            mo264k.mo116s(true);
        }
    }

    /* renamed from: s0 */
    public AbstractC0585b m201s0(AbstractC0585b.InterfaceC0586a interfaceC0586a) {
        InterfaceC0530c interfaceC0530c;
        if (interfaceC0586a != null) {
            AbstractC0585b abstractC0585b = this.f2314y;
            if (abstractC0585b != null) {
                abstractC0585b.mo73c();
            }
            C0552h c0552h = new C0552h(interfaceC0586a);
            AbstractC0525a mo264k = mo264k();
            if (mo264k != null) {
                AbstractC0585b mo114u = mo264k.mo114u(c0552h);
                this.f2314y = mo114u;
                if (mo114u != null && (interfaceC0530c = this.f2263h) != null) {
                    interfaceC0530c.mo179d(mo114u);
                }
            }
            if (this.f2314y == null) {
                this.f2314y = m200t0(c0552h);
            }
            return this.f2314y;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p023v.AbstractC0585b m200t0(p023v.AbstractC0585b.InterfaceC0586a r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p019r.LayoutInflater$Factory2C0543i.m200t0(v.b$a):v.b");
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: v */
    public void mo198v() {
        AbstractC0525a mo264k = mo264k();
        if (mo264k != null) {
            mo264k.mo116s(false);
        }
    }

    /* renamed from: v0 */
    int m197v0(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f2315z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2315z.getLayoutParams();
            if (this.f2315z.isShown()) {
                if (this.f2308R == null) {
                    this.f2308R = new Rect();
                    this.f2309S = new Rect();
                }
                Rect rect = this.f2308R;
                Rect rect2 = this.f2309S;
                rect.set(0, i, 0, 0);
                C0244b1.m1370a(this.f2295E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f2297G;
                    if (view == null) {
                        View view2 = new View(this.f2259d);
                        this.f2297G = view2;
                        view2.setBackgroundColor(this.f2259d.getResources().getColor(C0571c.abc_input_method_navigation_guard));
                        this.f2295E.addView(this.f2297G, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2297G.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                r3 = this.f2297G != null;
                if (!this.f2268m && r3) {
                    i = 0;
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
                this.f2315z.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f2297G;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: w */
    public boolean mo196w(int i) {
        int m207p0 = m207p0(i);
        if (this.f2270o && m207p0 == 108) {
            return false;
        }
        if (this.f2266k && m207p0 == 1) {
            this.f2266k = false;
        }
        if (m207p0 == 1) {
            m199u0();
            this.f2270o = true;
            return true;
        } else if (m207p0 == 2) {
            m199u0();
            this.f2298H = true;
            return true;
        } else if (m207p0 == 5) {
            m199u0();
            this.f2299I = true;
            return true;
        } else if (m207p0 == 10) {
            m199u0();
            this.f2268m = true;
            return true;
        } else if (m207p0 == 108) {
            m199u0();
            this.f2266k = true;
            return true;
        } else if (m207p0 != 109) {
            return this.f2260e.requestFeature(m207p0);
        } else {
            m199u0();
            this.f2267l = true;
            return true;
        }
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: x */
    public void mo195x(int i) {
        m230Y();
        ViewGroup viewGroup = (ViewGroup) this.f2295E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2259d).inflate(i, viewGroup);
        this.f2261f.onContentChanged();
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: y */
    public void mo194y(View view) {
        m230Y();
        ViewGroup viewGroup = (ViewGroup) this.f2295E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2261f.onContentChanged();
    }

    @Override // p019r.AbstractC0531d
    /* renamed from: z */
    public void mo193z(View view, ViewGroup.LayoutParams layoutParams) {
        m230Y();
        ViewGroup viewGroup = (ViewGroup) this.f2295E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2261f.onContentChanged();
    }
}