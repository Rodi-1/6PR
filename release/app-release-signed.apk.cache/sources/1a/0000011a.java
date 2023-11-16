package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.AbstractC0182a;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.C0196g;
import android.support.p002v7.view.menu.C0199i;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.support.p002v7.view.menu.SubMenuC0208m;
import android.support.p002v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p011j.C0413a;
import p016o.AbstractC0471c;
import p020s.C0569a;
import p020s.C0575g;
import p023v.C0584a;
import p024w.InterfaceC0610h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.d */
/* loaded from: classes.dex */
public class C0248d extends AbstractC0182a implements AbstractC0471c.InterfaceC0472a {

    /* renamed from: A */
    C0254e f1253A;

    /* renamed from: B */
    C0249a f1254B;

    /* renamed from: C */
    RunnableC0251c f1255C;

    /* renamed from: D */
    private C0250b f1256D;

    /* renamed from: E */
    final C0255f f1257E;

    /* renamed from: F */
    int f1258F;

    /* renamed from: l */
    C0252d f1259l;

    /* renamed from: m */
    private Drawable f1260m;

    /* renamed from: n */
    private boolean f1261n;

    /* renamed from: o */
    private boolean f1262o;

    /* renamed from: p */
    private boolean f1263p;

    /* renamed from: q */
    private int f1264q;

    /* renamed from: r */
    private int f1265r;

    /* renamed from: s */
    private int f1266s;

    /* renamed from: t */
    private boolean f1267t;

    /* renamed from: u */
    private boolean f1268u;

    /* renamed from: v */
    private boolean f1269v;

    /* renamed from: w */
    private boolean f1270w;

    /* renamed from: x */
    private int f1271x;

    /* renamed from: y */
    private final SparseBooleanArray f1272y;

    /* renamed from: z */
    private View f1273z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$a */
    /* loaded from: classes.dex */
    public class C0249a extends C0199i {
        public C0249a(Context context, SubMenuC0208m subMenuC0208m, View view) {
            super(context, subMenuC0208m, view, false, C0569a.actionOverflowMenuStyle);
            if (!((C0196g) subMenuC0208m.getItem()).m1594k()) {
                View view2 = C0248d.this.f1259l;
                m1568f(view2 == null ? (View) ((AbstractC0182a) C0248d.this).f866j : view2);
            }
            m1564j(C0248d.this.f1257E);
        }

        @Override // android.support.p002v7.view.menu.C0199i
        /* renamed from: e */
        protected void mo1325e() {
            C0248d c0248d = C0248d.this;
            c0248d.f1254B = null;
            c0248d.f1258F = 0;
            super.mo1325e();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    /* loaded from: classes.dex */
    private class C0250b extends ActionMenuItemView.AbstractC0181b {
        C0250b() {
        }

        @Override // android.support.p002v7.view.menu.ActionMenuItemView.AbstractC0181b
        /* renamed from: a */
        public InterfaceC0610h mo1328a() {
            C0249a c0249a = C0248d.this.f1254B;
            if (c0249a != null) {
                return c0249a.m1570c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$c */
    /* loaded from: classes.dex */
    public class RunnableC0251c implements Runnable {

        /* renamed from: b */
        private C0254e f1276b;

        public RunnableC0251c(C0254e c0254e) {
            this.f1276b = c0254e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0182a) C0248d.this).f860d != null) {
                ((AbstractC0182a) C0248d.this).f860d.m1624d();
            }
            View view = (View) ((AbstractC0182a) C0248d.this).f866j;
            if (view != null && view.getWindowToken() != null && this.f1276b.m1561m()) {
                C0248d.this.f1253A = this.f1276b;
            }
            C0248d.this.f1255C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$d */
    /* loaded from: classes.dex */
    public class C0252d extends C0302p implements ActionMenuView.InterfaceC0215a {

        /* renamed from: d */
        private final float[] f1278d;

        /* renamed from: android.support.v7.widget.d$d$a */
        /* loaded from: classes.dex */
        class C0253a extends AbstractView$OnTouchListenerC0268h0 {

            /* renamed from: k */
            final /* synthetic */ C0248d f1280k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0253a(View view, C0248d c0248d) {
                super(view);
                this.f1280k = c0248d;
            }

            @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
            /* renamed from: b */
            public InterfaceC0610h mo1061b() {
                C0254e c0254e = C0248d.this.f1253A;
                if (c0254e == null) {
                    return null;
                }
                return c0254e.m1570c();
            }

            @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
            /* renamed from: c */
            public boolean mo1060c() {
                C0248d.this.m1348J();
                return true;
            }

            @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
            /* renamed from: d */
            public boolean mo1295d() {
                C0248d c0248d = C0248d.this;
                if (c0248d.f1255C != null) {
                    return false;
                }
                c0248d.m1357A();
                return true;
            }
        }

        public C0252d(Context context) {
            super(context, null, C0569a.actionOverflowButtonStyle);
            this.f1278d = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0328x0.m1053a(this, getContentDescription());
            setOnTouchListener(new C0253a(this, C0248d.this));
        }

        @Override // android.support.p002v7.widget.ActionMenuView.InterfaceC0215a
        /* renamed from: a */
        public boolean mo1327a() {
            return false;
        }

        @Override // android.support.p002v7.widget.ActionMenuView.InterfaceC0215a
        /* renamed from: b */
        public boolean mo1326b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0248d.this.m1348J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0413a.m623k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$e */
    /* loaded from: classes.dex */
    public class C0254e extends C0199i {
        public C0254e(Context context, C0192e c0192e, View view, boolean z) {
            super(context, c0192e, view, z, C0569a.actionOverflowMenuStyle);
            m1566h(8388613);
            m1564j(C0248d.this.f1257E);
        }

        @Override // android.support.p002v7.view.menu.C0199i
        /* renamed from: e */
        protected void mo1325e() {
            if (((AbstractC0182a) C0248d.this).f860d != null) {
                ((AbstractC0182a) C0248d.this).f860d.close();
            }
            C0248d.this.f1253A = null;
            super.mo1325e();
        }
    }

    /* renamed from: android.support.v7.widget.d$f */
    /* loaded from: classes.dex */
    private class C0255f implements InterfaceC0201j.InterfaceC0202a {
        C0255f() {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: a */
        public void mo184a(C0192e c0192e, boolean z) {
            if (c0192e instanceof SubMenuC0208m) {
                c0192e.mo1544D().m1622e(false);
            }
            InterfaceC0201j.InterfaceC0202a m1672m = C0248d.this.m1672m();
            if (m1672m != null) {
                m1672m.mo184a(c0192e, z);
            }
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: b */
        public boolean mo183b(C0192e c0192e) {
            if (c0192e == null) {
                return false;
            }
            C0248d.this.f1258F = ((SubMenuC0208m) c0192e).getItem().getItemId();
            InterfaceC0201j.InterfaceC0202a m1672m = C0248d.this.m1672m();
            if (m1672m != null) {
                return m1672m.mo183b(c0192e);
            }
            return false;
        }
    }

    public C0248d(Context context) {
        super(context, C0575g.abc_action_menu_layout, C0575g.abc_action_menu_item_layout);
        this.f1272y = new SparseBooleanArray();
        this.f1257E = new C0255f();
    }

    /* renamed from: y */
    private View m1330y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f866j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0203k.InterfaceC0204a) && ((InterfaceC0203k.InterfaceC0204a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public boolean m1357A() {
        InterfaceC0203k interfaceC0203k;
        RunnableC0251c runnableC0251c = this.f1255C;
        if (runnableC0251c != null && (interfaceC0203k = this.f866j) != null) {
            ((View) interfaceC0203k).removeCallbacks(runnableC0251c);
            this.f1255C = null;
            return true;
        }
        C0254e c0254e = this.f1253A;
        if (c0254e != null) {
            c0254e.m1571b();
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1356B() {
        C0249a c0249a = this.f1254B;
        if (c0249a != null) {
            c0249a.m1571b();
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m1355C() {
        return this.f1255C != null || m1354D();
    }

    /* renamed from: D */
    public boolean m1354D() {
        C0254e c0254e = this.f1253A;
        return c0254e != null && c0254e.m1569d();
    }

    /* renamed from: E */
    public void m1353E(Configuration configuration) {
        if (!this.f1267t) {
            this.f1266s = C0584a.m88b(this.f859c).m86d();
        }
        C0192e c0192e = this.f860d;
        if (c0192e != null) {
            c0192e.m1645K(true);
        }
    }

    /* renamed from: F */
    public void m1352F(boolean z) {
        this.f1270w = z;
    }

    /* renamed from: G */
    public void m1351G(ActionMenuView actionMenuView) {
        this.f866j = actionMenuView;
        actionMenuView.mo1499b(this.f860d);
    }

    /* renamed from: H */
    public void m1350H(Drawable drawable) {
        C0252d c0252d = this.f1259l;
        if (c0252d != null) {
            c0252d.setImageDrawable(drawable);
            return;
        }
        this.f1261n = true;
        this.f1260m = drawable;
    }

    /* renamed from: I */
    public void m1349I(boolean z) {
        this.f1262o = z;
        this.f1263p = true;
    }

    /* renamed from: J */
    public boolean m1348J() {
        C0192e c0192e;
        if (!this.f1262o || m1354D() || (c0192e = this.f860d) == null || this.f866j == null || this.f1255C != null || c0192e.m1605z().isEmpty()) {
            return false;
        }
        RunnableC0251c runnableC0251c = new RunnableC0251c(new C0254e(this.f859c, this.f860d, this.f1259l, true));
        this.f1255C = runnableC0251c;
        ((View) this.f866j).post(runnableC0251c);
        super.mo1346b(null);
        return true;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a, android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: a */
    public void mo1347a(C0192e c0192e, boolean z) {
        m1331x();
        super.mo1347a(c0192e, z);
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a, android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: b */
    public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
        boolean z = false;
        if (subMenuC0208m.hasVisibleItems()) {
            SubMenuC0208m subMenuC0208m2 = subMenuC0208m;
            while (subMenuC0208m2.m1539e0() != this.f860d) {
                subMenuC0208m2 = (SubMenuC0208m) subMenuC0208m2.m1539e0();
            }
            View m1330y = m1330y(subMenuC0208m2.getItem());
            if (m1330y == null) {
                return false;
            }
            this.f1258F = subMenuC0208m.getItem().getItemId();
            int size = subMenuC0208m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC0208m.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C0249a c0249a = new C0249a(this.f859c, subMenuC0208m, m1330y);
            this.f1254B = c0249a;
            c0249a.m1567g(z);
            this.f1254B.m1563k();
            super.mo1346b(subMenuC0208m);
            return true;
        }
        return false;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a
    /* renamed from: d */
    public void mo1345d(C0196g c0196g, InterfaceC0203k.InterfaceC0204a interfaceC0204a) {
        interfaceC0204a.mo1558d(c0196g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0204a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f866j);
        if (this.f1256D == null) {
            this.f1256D = new C0250b();
        }
        actionMenuItemView.setPopupCallback(this.f1256D);
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: g */
    public boolean mo1344g() {
        ArrayList<C0196g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        C0248d c0248d = this;
        C0192e c0192e = c0248d.f860d;
        int i5 = 0;
        if (c0192e != null) {
            arrayList = c0192e.m1648E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c0248d.f1266s;
        int i7 = c0248d.f1265r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0248d.f866j;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0196g c0196g = arrayList.get(i10);
            if (c0196g.requiresActionButton()) {
                i8++;
            } else if (c0196g.m1592m()) {
                i9++;
            } else {
                z = true;
            }
            if (c0248d.f1270w && c0196g.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (c0248d.f1262o && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = c0248d.f1272y;
        sparseBooleanArray.clear();
        if (c0248d.f1268u) {
            int i12 = c0248d.f1271x;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0196g c0196g2 = arrayList.get(i13);
            if (c0196g2.requiresActionButton()) {
                View mo1340n = c0248d.mo1340n(c0196g2, c0248d.f1273z, viewGroup);
                if (c0248d.f1273z == null) {
                    c0248d.f1273z = mo1340n;
                }
                if (c0248d.f1268u) {
                    i3 -= ActionMenuView.m1504J(mo1340n, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo1340n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo1340n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = c0196g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0196g2.m1586s(true);
                i4 = i;
            } else if (c0196g2.m1592m()) {
                int groupId2 = c0196g2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!c0248d.f1268u || i3 > 0);
                boolean z4 = z3;
                if (z3) {
                    View mo1340n2 = c0248d.mo1340n(c0196g2, c0248d.f1273z, viewGroup);
                    i4 = i;
                    if (c0248d.f1273z == null) {
                        c0248d.f1273z = mo1340n2;
                    }
                    if (c0248d.f1268u) {
                        int m1504J = ActionMenuView.m1504J(mo1340n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m1504J;
                        if (m1504J == 0) {
                            z4 = false;
                        }
                    } else {
                        mo1340n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = mo1340n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z4 & (!c0248d.f1268u ? i7 + i14 <= 0 : i7 < 0);
                } else {
                    i4 = i;
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0196g c0196g3 = arrayList.get(i15);
                        if (c0196g3.getGroupId() == groupId2) {
                            if (c0196g3.m1594k()) {
                                i11++;
                            }
                            c0196g3.m1586s(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                c0196g2.m1586s(z3);
            } else {
                i4 = i;
                c0196g2.m1586s(false);
                i13++;
                c0248d = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            c0248d = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a, android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: i */
    public void mo1343i(boolean z) {
        super.mo1343i(z);
        ((View) this.f866j).requestLayout();
        C0192e c0192e = this.f860d;
        boolean z2 = false;
        if (c0192e != null) {
            ArrayList<C0196g> m1611s = c0192e.m1611s();
            int size = m1611s.size();
            for (int i = 0; i < size; i++) {
                AbstractC0471c mo29b = m1611s.get(i).mo29b();
                if (mo29b != null) {
                    mo29b.m457i(this);
                }
            }
        }
        C0192e c0192e2 = this.f860d;
        ArrayList<C0196g> m1605z = c0192e2 != null ? c0192e2.m1605z() : null;
        if (this.f1262o && m1605z != null) {
            int size2 = m1605z.size();
            if (size2 == 1) {
                z2 = !m1605z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0252d c0252d = this.f1259l;
        if (z2) {
            if (c0252d == null) {
                this.f1259l = new C0252d(this.f858b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1259l.getParent();
            if (viewGroup != this.f866j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1259l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f866j;
                actionMenuView.addView(this.f1259l, actionMenuView.m1510D());
            }
        } else if (c0252d != null) {
            ViewParent parent = c0252d.getParent();
            InterfaceC0203k interfaceC0203k = this.f866j;
            if (parent == interfaceC0203k) {
                ((ViewGroup) interfaceC0203k).removeView(this.f1259l);
            }
        }
        ((ActionMenuView) this.f866j).setOverflowReserved(this.f1262o);
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a, android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: k */
    public void mo1342k(Context context, C0192e c0192e) {
        super.mo1342k(context, c0192e);
        Resources resources = context.getResources();
        C0584a m88b = C0584a.m88b(context);
        if (!this.f1263p) {
            this.f1262o = m88b.m82h();
        }
        if (!this.f1269v) {
            this.f1264q = m88b.m87c();
        }
        if (!this.f1267t) {
            this.f1266s = m88b.m86d();
        }
        int i = this.f1264q;
        if (this.f1262o) {
            if (this.f1259l == null) {
                C0252d c0252d = new C0252d(this.f858b);
                this.f1259l = c0252d;
                if (this.f1261n) {
                    c0252d.setImageDrawable(this.f1260m);
                    this.f1260m = null;
                    this.f1261n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1259l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1259l.getMeasuredWidth();
        } else {
            this.f1259l = null;
        }
        this.f1265r = i;
        this.f1271x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f1273z = null;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a
    /* renamed from: l */
    public boolean mo1341l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1259l) {
            return false;
        }
        return super.mo1341l(viewGroup, i);
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a
    /* renamed from: n */
    public View mo1340n(C0196g c0196g, View view, ViewGroup viewGroup) {
        View actionView = c0196g.getActionView();
        if (actionView == null || c0196g.m1596i()) {
            actionView = super.mo1340n(c0196g, view, viewGroup);
        }
        actionView.setVisibility(c0196g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1280m(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a
    /* renamed from: o */
    public InterfaceC0203k mo1339o(ViewGroup viewGroup) {
        InterfaceC0203k interfaceC0203k = this.f866j;
        InterfaceC0203k mo1339o = super.mo1339o(viewGroup);
        if (interfaceC0203k != mo1339o) {
            ((ActionMenuView) mo1339o).setPresenter(this);
        }
        return mo1339o;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0182a
    /* renamed from: q */
    public boolean mo1338q(int i, C0196g c0196g) {
        return c0196g.m1594k();
    }

    /* renamed from: x */
    public boolean m1331x() {
        return m1357A() | m1356B();
    }

    /* renamed from: z */
    public Drawable m1329z() {
        C0252d c0252d = this.f1259l;
        if (c0252d != null) {
            return c0252d.getDrawable();
        }
        if (this.f1261n) {
            return this.f1260m;
        }
        return null;
    }
}