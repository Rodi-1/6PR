package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.j;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* loaded from: classes.dex */
public class w0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1206a;

    /* renamed from: b  reason: collision with root package name */
    private int f1207b;

    /* renamed from: c  reason: collision with root package name */
    private View f1208c;

    /* renamed from: d  reason: collision with root package name */
    private View f1209d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1210e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1211f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1212g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1213h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1214i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1215j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1216k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1217l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1218m;

    /* renamed from: n  reason: collision with root package name */
    private d f1219n;

    /* renamed from: o  reason: collision with root package name */
    private int f1220o;

    /* renamed from: p  reason: collision with root package name */
    private int f1221p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1222q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final w.a f1223b;

        a() {
            this.f1223b = new w.a(w0.this.f1206a.getContext(), 0, 16908332, 0, 0, w0.this.f1214i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w0 w0Var = w0.this;
            Window.Callback callback = w0Var.f1217l;
            if (callback == null || !w0Var.f1218m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1223b);
        }
    }

    /* loaded from: classes.dex */
    class b extends o.u {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1225a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1226b;

        b(int i2) {
            this.f1226b = i2;
        }

        @Override // o.t
        public void a(View view) {
            if (this.f1225a) {
                return;
            }
            w0.this.f1206a.setVisibility(this.f1226b);
        }

        @Override // o.u, o.t
        public void b(View view) {
            w0.this.f1206a.setVisibility(0);
        }

        @Override // o.u, o.t
        public void c(View view) {
            this.f1225a = true;
        }
    }

    public w0(Toolbar toolbar, boolean z) {
        this(toolbar, z, s.h.abc_action_bar_up_description, s.e.abc_ic_ab_back_material);
    }

    public w0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.f1220o = 0;
        this.f1221p = 0;
        this.f1206a = toolbar;
        this.f1214i = toolbar.getTitle();
        this.f1215j = toolbar.getSubtitle();
        this.f1213h = this.f1214i != null;
        this.f1212g = toolbar.getNavigationIcon();
        v0 t2 = v0.t(toolbar.getContext(), null, s.j.f1864a, s.a.actionBarStyle, 0);
        this.f1222q = t2.f(s.j.f1875l);
        if (z) {
            CharSequence o2 = t2.o(s.j.f1881r);
            if (!TextUtils.isEmpty(o2)) {
                E(o2);
            }
            CharSequence o3 = t2.o(s.j.f1879p);
            if (!TextUtils.isEmpty(o3)) {
                D(o3);
            }
            Drawable f2 = t2.f(s.j.f1877n);
            if (f2 != null) {
                z(f2);
            }
            Drawable f3 = t2.f(s.j.f1876m);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.f1212g == null && (drawable = this.f1222q) != null) {
                C(drawable);
            }
            u(t2.j(s.j.f1871h, 0));
            int m2 = t2.m(s.j.f1870g, 0);
            if (m2 != 0) {
                x(LayoutInflater.from(this.f1206a.getContext()).inflate(m2, (ViewGroup) this.f1206a, false));
                u(this.f1207b | 16);
            }
            int l2 = t2.l(s.j.f1873j, 0);
            if (l2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1206a.getLayoutParams();
                layoutParams.height = l2;
                this.f1206a.setLayoutParams(layoutParams);
            }
            int d2 = t2.d(s.j.f1869f, -1);
            int d3 = t2.d(s.j.f1868e, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.f1206a.G(Math.max(d2, 0), Math.max(d3, 0));
            }
            int m3 = t2.m(s.j.f1882s, 0);
            if (m3 != 0) {
                Toolbar toolbar2 = this.f1206a;
                toolbar2.J(toolbar2.getContext(), m3);
            }
            int m4 = t2.m(s.j.f1880q, 0);
            if (m4 != 0) {
                Toolbar toolbar3 = this.f1206a;
                toolbar3.I(toolbar3.getContext(), m4);
            }
            int m5 = t2.m(s.j.f1878o, 0);
            if (m5 != 0) {
                this.f1206a.setPopupTheme(m5);
            }
        } else {
            this.f1207b = w();
        }
        t2.u();
        y(i2);
        this.f1216k = this.f1206a.getNavigationContentDescription();
        this.f1206a.setNavigationOnClickListener(new a());
    }

    private void F(CharSequence charSequence) {
        this.f1214i = charSequence;
        if ((this.f1207b & 8) != 0) {
            this.f1206a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1207b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1216k)) {
                this.f1206a.setNavigationContentDescription(this.f1221p);
            } else {
                this.f1206a.setNavigationContentDescription(this.f1216k);
            }
        }
    }

    private void H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1207b & 4) != 0) {
            toolbar = this.f1206a;
            drawable = this.f1212g;
            if (drawable == null) {
                drawable = this.f1222q;
            }
        } else {
            toolbar = this.f1206a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.f1207b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1211f) == null) {
            drawable = this.f1210e;
        }
        this.f1206a.setLogo(drawable);
    }

    private int w() {
        if (this.f1206a.getNavigationIcon() != null) {
            this.f1222q = this.f1206a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(int i2) {
        B(i2 == 0 ? null : t().getString(i2));
    }

    public void B(CharSequence charSequence) {
        this.f1216k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f1212g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f1215j = charSequence;
        if ((this.f1207b & 8) != 0) {
            this.f1206a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f1213h = true;
        F(charSequence);
    }

    @Override // android.support.v7.widget.d0
    public boolean a() {
        return this.f1206a.M();
    }

    @Override // android.support.v7.widget.d0
    public boolean b() {
        return this.f1206a.y();
    }

    @Override // android.support.v7.widget.d0
    public void c() {
        this.f1218m = true;
    }

    @Override // android.support.v7.widget.d0
    public void collapseActionView() {
        this.f1206a.e();
    }

    @Override // android.support.v7.widget.d0
    public boolean d() {
        return this.f1206a.z();
    }

    @Override // android.support.v7.widget.d0
    public boolean e() {
        return this.f1206a.d();
    }

    @Override // android.support.v7.widget.d0
    public void f(Menu menu, j.a aVar) {
        if (this.f1219n == null) {
            d dVar = new d(this.f1206a.getContext());
            this.f1219n = dVar;
            dVar.p(s.f.action_menu_presenter);
        }
        this.f1219n.j(aVar);
        this.f1206a.H((android.support.v7.view.menu.e) menu, this.f1219n);
    }

    @Override // android.support.v7.widget.d0
    public boolean g() {
        return this.f1206a.w();
    }

    @Override // android.support.v7.widget.d0
    public CharSequence getTitle() {
        return this.f1206a.getTitle();
    }

    @Override // android.support.v7.widget.d0
    public void h() {
        this.f1206a.f();
    }

    @Override // android.support.v7.widget.d0
    public void i(o0 o0Var) {
        View view = this.f1208c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1206a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1208c);
            }
        }
        this.f1208c = o0Var;
        if (o0Var == null || this.f1220o != 2) {
            return;
        }
        this.f1206a.addView(o0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1208c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f1732a = 8388691;
        o0Var.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.d0
    public o.s j(int i2, long j2) {
        return o.o.a(this.f1206a).a(i2 == 0 ? 1.0f : 0.0f).d(j2).f(new b(i2));
    }

    @Override // android.support.v7.widget.d0
    public int k() {
        return this.f1207b;
    }

    @Override // android.support.v7.widget.d0
    public void l(int i2) {
        this.f1206a.setVisibility(i2);
    }

    @Override // android.support.v7.widget.d0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.d0
    public boolean n() {
        return this.f1206a.v();
    }

    @Override // android.support.v7.widget.d0
    public void o(int i2) {
        z(i2 != 0 ? t.b.d(t(), i2) : null);
    }

    @Override // android.support.v7.widget.d0
    public ViewGroup p() {
        return this.f1206a;
    }

    @Override // android.support.v7.widget.d0
    public void q(boolean z) {
    }

    @Override // android.support.v7.widget.d0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.d0
    public void s(boolean z) {
        this.f1206a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.d0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? t.b.d(t(), i2) : null);
    }

    @Override // android.support.v7.widget.d0
    public void setIcon(Drawable drawable) {
        this.f1210e = drawable;
        I();
    }

    @Override // android.support.v7.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1217l = callback;
    }

    @Override // android.support.v7.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1213h) {
            return;
        }
        F(charSequence);
    }

    @Override // android.support.v7.widget.d0
    public Context t() {
        return this.f1206a.getContext();
    }

    @Override // android.support.v7.widget.d0
    public void u(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f1207b ^ i2;
        this.f1207b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1206a.setTitle(this.f1214i);
                    toolbar = this.f1206a;
                    charSequence = this.f1215j;
                } else {
                    charSequence = null;
                    this.f1206a.setTitle((CharSequence) null);
                    toolbar = this.f1206a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f1209d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f1206a.addView(view);
            } else {
                this.f1206a.removeView(view);
            }
        }
    }

    @Override // android.support.v7.widget.d0
    public int v() {
        return this.f1220o;
    }

    public void x(View view) {
        View view2 = this.f1209d;
        if (view2 != null && (this.f1207b & 16) != 0) {
            this.f1206a.removeView(view2);
        }
        this.f1209d = view;
        if (view == null || (this.f1207b & 16) == 0) {
            return;
        }
        this.f1206a.addView(view);
    }

    public void y(int i2) {
        if (i2 == this.f1221p) {
            return;
        }
        this.f1221p = i2;
        if (TextUtils.isEmpty(this.f1206a.getNavigationContentDescription())) {
            A(this.f1221p);
        }
    }

    public void z(Drawable drawable) {
        this.f1211f = drawable;
        I();
    }
}