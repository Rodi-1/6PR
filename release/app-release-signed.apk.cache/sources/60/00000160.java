package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import p016o.C0490o;
import p016o.C0511s;
import p016o.C0515u;
import p020s.C0569a;
import p020s.C0573e;
import p020s.C0574f;
import p020s.C0576h;
import p020s.C0578j;
import p021t.C0580b;
import p024w.C0598a;

/* renamed from: android.support.v7.widget.w0 */
/* loaded from: classes.dex */
public class C0318w0 implements InterfaceC0256d0 {

    /* renamed from: a */
    Toolbar f1514a;

    /* renamed from: b */
    private int f1515b;

    /* renamed from: c */
    private View f1516c;

    /* renamed from: d */
    private View f1517d;

    /* renamed from: e */
    private Drawable f1518e;

    /* renamed from: f */
    private Drawable f1519f;

    /* renamed from: g */
    private Drawable f1520g;

    /* renamed from: h */
    private boolean f1521h;

    /* renamed from: i */
    CharSequence f1522i;

    /* renamed from: j */
    private CharSequence f1523j;

    /* renamed from: k */
    private CharSequence f1524k;

    /* renamed from: l */
    Window.Callback f1525l;

    /* renamed from: m */
    boolean f1526m;

    /* renamed from: n */
    private C0248d f1527n;

    /* renamed from: o */
    private int f1528o;

    /* renamed from: p */
    private int f1529p;

    /* renamed from: q */
    private Drawable f1530q;

    /* renamed from: android.support.v7.widget.w0$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0319a implements View.OnClickListener {

        /* renamed from: b */
        final C0598a f1531b;

        View$OnClickListenerC0319a() {
            this.f1531b = new C0598a(C0318w0.this.f1514a.getContext(), 0, 16908332, 0, 0, C0318w0.this.f1522i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0318w0 c0318w0 = C0318w0.this;
            Window.Callback callback = c0318w0.f1525l;
            if (callback == null || !c0318w0.f1526m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1531b);
        }
    }

    /* renamed from: android.support.v7.widget.w0$b */
    /* loaded from: classes.dex */
    class C0320b extends C0515u {

        /* renamed from: a */
        private boolean f1533a = false;

        /* renamed from: b */
        final /* synthetic */ int f1534b;

        C0320b(int i) {
            this.f1534b = i;
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            if (this.f1533a) {
                return;
            }
            C0318w0.this.f1514a.setVisibility(this.f1534b);
        }

        @Override // p016o.C0515u, p016o.InterfaceC0514t
        /* renamed from: b */
        public void mo32b(View view) {
            C0318w0.this.f1514a.setVisibility(0);
        }

        @Override // p016o.C0515u, p016o.InterfaceC0514t
        /* renamed from: c */
        public void mo333c(View view) {
            this.f1533a = true;
        }
    }

    public C0318w0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0576h.abc_action_bar_up_description, C0573e.abc_ic_ab_back_material);
    }

    public C0318w0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1528o = 0;
        this.f1529p = 0;
        this.f1514a = toolbar;
        this.f1522i = toolbar.getTitle();
        this.f1523j = toolbar.getSubtitle();
        this.f1521h = this.f1522i != null;
        this.f1520g = toolbar.getNavigationIcon();
        C0316v0 m1108t = C0316v0.m1108t(toolbar.getContext(), null, C0578j.f2525a, C0569a.actionBarStyle, 0);
        this.f1530q = m1108t.m1122f(C0578j.f2570l);
        if (z) {
            CharSequence m1113o = m1108t.m1113o(C0578j.f2594r);
            if (!TextUtils.isEmpty(m1113o)) {
                m1096E(m1113o);
            }
            CharSequence m1113o2 = m1108t.m1113o(C0578j.f2586p);
            if (!TextUtils.isEmpty(m1113o2)) {
                m1097D(m1113o2);
            }
            Drawable m1122f = m1108t.m1122f(C0578j.f2578n);
            if (m1122f != null) {
                m1066z(m1122f);
            }
            Drawable m1122f2 = m1108t.m1122f(C0578j.f2574m);
            if (m1122f2 != null) {
                setIcon(m1122f2);
            }
            if (this.f1520g == null && (drawable = this.f1530q) != null) {
                m1098C(drawable);
            }
            mo1071u(m1108t.m1118j(C0578j.f2554h, 0));
            int m1115m = m1108t.m1115m(C0578j.f2550g, 0);
            if (m1115m != 0) {
                m1068x(LayoutInflater.from(this.f1514a.getContext()).inflate(m1115m, (ViewGroup) this.f1514a, false));
                mo1071u(this.f1515b | 16);
            }
            int m1116l = m1108t.m1116l(C0578j.f2562j, 0);
            if (m1116l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1514a.getLayoutParams();
                layoutParams.height = m1116l;
                this.f1514a.setLayoutParams(layoutParams);
            }
            int m1124d = m1108t.m1124d(C0578j.f2546f, -1);
            int m1124d2 = m1108t.m1124d(C0578j.f2542e, -1);
            if (m1124d >= 0 || m1124d2 >= 0) {
                this.f1514a.m1446G(Math.max(m1124d, 0), Math.max(m1124d2, 0));
            }
            int m1115m2 = m1108t.m1115m(C0578j.f2598s, 0);
            if (m1115m2 != 0) {
                Toolbar toolbar2 = this.f1514a;
                toolbar2.m1443J(toolbar2.getContext(), m1115m2);
            }
            int m1115m3 = m1108t.m1115m(C0578j.f2590q, 0);
            if (m1115m3 != 0) {
                Toolbar toolbar3 = this.f1514a;
                toolbar3.m1444I(toolbar3.getContext(), m1115m3);
            }
            int m1115m4 = m1108t.m1115m(C0578j.f2582o, 0);
            if (m1115m4 != 0) {
                this.f1514a.setPopupTheme(m1115m4);
            }
        } else {
            this.f1515b = m1069w();
        }
        m1108t.m1107u();
        m1067y(i);
        this.f1524k = this.f1514a.getNavigationContentDescription();
        this.f1514a.setNavigationOnClickListener(new View$OnClickListenerC0319a());
    }

    /* renamed from: F */
    private void m1095F(CharSequence charSequence) {
        this.f1522i = charSequence;
        if ((this.f1515b & 8) != 0) {
            this.f1514a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m1094G() {
        if ((this.f1515b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1524k)) {
                this.f1514a.setNavigationContentDescription(this.f1529p);
            } else {
                this.f1514a.setNavigationContentDescription(this.f1524k);
            }
        }
    }

    /* renamed from: H */
    private void m1093H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1515b & 4) != 0) {
            toolbar = this.f1514a;
            drawable = this.f1520g;
            if (drawable == null) {
                drawable = this.f1530q;
            }
        } else {
            toolbar = this.f1514a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: I */
    private void m1092I() {
        Drawable drawable;
        int i = this.f1515b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1519f) == null) {
            drawable = this.f1518e;
        }
        this.f1514a.setLogo(drawable);
    }

    /* renamed from: w */
    private int m1069w() {
        if (this.f1514a.getNavigationIcon() != null) {
            this.f1530q = this.f1514a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m1100A(int i) {
        m1099B(i == 0 ? null : mo1072t().getString(i));
    }

    /* renamed from: B */
    public void m1099B(CharSequence charSequence) {
        this.f1524k = charSequence;
        m1094G();
    }

    /* renamed from: C */
    public void m1098C(Drawable drawable) {
        this.f1520g = drawable;
        m1093H();
    }

    /* renamed from: D */
    public void m1097D(CharSequence charSequence) {
        this.f1523j = charSequence;
        if ((this.f1515b & 8) != 0) {
            this.f1514a.setSubtitle(charSequence);
        }
    }

    /* renamed from: E */
    public void m1096E(CharSequence charSequence) {
        this.f1521h = true;
        m1095F(charSequence);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: a */
    public boolean mo1091a() {
        return this.f1514a.m1440M();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: b */
    public boolean mo1090b() {
        return this.f1514a.m1415y();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: c */
    public void mo1089c() {
        this.f1526m = true;
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public void collapseActionView() {
        this.f1514a.m1435e();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: d */
    public boolean mo1088d() {
        return this.f1514a.m1414z();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: e */
    public boolean mo1087e() {
        return this.f1514a.m1436d();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: f */
    public void mo1086f(Menu menu, InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        if (this.f1527n == null) {
            C0248d c0248d = new C0248d(this.f1514a.getContext());
            this.f1527n = c0248d;
            c0248d.m1671p(C0574f.action_menu_presenter);
        }
        this.f1527n.mo1554j(interfaceC0202a);
        this.f1514a.m1445H((C0192e) menu, this.f1527n);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: g */
    public boolean mo1085g() {
        return this.f1514a.m1417w();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public CharSequence getTitle() {
        return this.f1514a.getTitle();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: h */
    public void mo1084h() {
        this.f1514a.m1434f();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: i */
    public void mo1083i(C0297o0 c0297o0) {
        View view = this.f1516c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1514a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1516c);
            }
        }
        this.f1516c = c0297o0;
        if (c0297o0 == null || this.f1528o != 2) {
            return;
        }
        this.f1514a.addView(c0297o0, 0);
        Toolbar.C0233e c0233e = (Toolbar.C0233e) this.f1516c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0233e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0233e).height = -2;
        c0233e.f2250a = 8388691;
        c0297o0.setAllowCollapse(true);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: j */
    public C0511s mo1082j(int i, long j) {
        return C0490o.m411a(this.f1514a).m344a(i == 0 ? 1.0f : 0.0f).m341d(j).m339f(new C0320b(i));
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: k */
    public int mo1081k() {
        return this.f1515b;
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: l */
    public void mo1080l(int i) {
        this.f1514a.setVisibility(i);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: m */
    public void mo1079m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: n */
    public boolean mo1078n() {
        return this.f1514a.m1418v();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: o */
    public void mo1077o(int i) {
        m1066z(i != 0 ? C0580b.m98d(mo1072t(), i) : null);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: p */
    public ViewGroup mo1076p() {
        return this.f1514a;
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: q */
    public void mo1075q(boolean z) {
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: r */
    public void mo1074r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: s */
    public void mo1073s(boolean z) {
        this.f1514a.setCollapsible(z);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public void setIcon(int i) {
        setIcon(i != 0 ? C0580b.m98d(mo1072t(), i) : null);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public void setIcon(Drawable drawable) {
        this.f1518e = drawable;
        m1092I();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1525l = callback;
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1521h) {
            return;
        }
        m1095F(charSequence);
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: t */
    public Context mo1072t() {
        return this.f1514a.getContext();
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: u */
    public void mo1071u(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1515b ^ i;
        this.f1515b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1094G();
                }
                m1093H();
            }
            if ((i2 & 3) != 0) {
                m1092I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1514a.setTitle(this.f1522i);
                    toolbar = this.f1514a;
                    charSequence = this.f1523j;
                } else {
                    charSequence = null;
                    this.f1514a.setTitle((CharSequence) null);
                    toolbar = this.f1514a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1517d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1514a.addView(view);
            } else {
                this.f1514a.removeView(view);
            }
        }
    }

    @Override // android.support.p002v7.widget.InterfaceC0256d0
    /* renamed from: v */
    public int mo1070v() {
        return this.f1528o;
    }

    /* renamed from: x */
    public void m1068x(View view) {
        View view2 = this.f1517d;
        if (view2 != null && (this.f1515b & 16) != 0) {
            this.f1514a.removeView(view2);
        }
        this.f1517d = view;
        if (view == null || (this.f1515b & 16) == 0) {
            return;
        }
        this.f1514a.addView(view);
    }

    /* renamed from: y */
    public void m1067y(int i) {
        if (i == this.f1529p) {
            return;
        }
        this.f1529p = i;
        if (TextUtils.isEmpty(this.f1514a.getNavigationContentDescription())) {
            m1100A(this.f1529p);
        }
    }

    /* renamed from: z */
    public void m1066z(Drawable drawable) {
        this.f1519f = drawable;
        m1092I();
    }
}