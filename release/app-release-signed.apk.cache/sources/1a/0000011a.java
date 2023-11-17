package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import o.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends android.support.v7.view.menu.a implements c.a {
    e A;
    a B;
    c C;
    private b D;
    final f E;
    int F;

    /* renamed from: l  reason: collision with root package name */
    C0010d f974l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f975m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f976n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f977o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f978p;

    /* renamed from: q  reason: collision with root package name */
    private int f979q;

    /* renamed from: r  reason: collision with root package name */
    private int f980r;

    /* renamed from: s  reason: collision with root package name */
    private int f981s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f982t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f983u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f984v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f985w;
    private int x;
    private final SparseBooleanArray y;
    private View z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends android.support.v7.view.menu.i {
        public a(Context context, android.support.v7.view.menu.m mVar, View view) {
            super(context, mVar, view, false, s.a.actionOverflowMenuStyle);
            if (!((android.support.v7.view.menu.g) mVar.getItem()).k()) {
                View view2 = d.this.f974l;
                f(view2 == null ? (View) ((android.support.v7.view.menu.a) d.this).f675j : view2);
            }
            j(d.this.E);
        }

        @Override // android.support.v7.view.menu.i
        protected void e() {
            d dVar = d.this;
            dVar.B = null;
            dVar.F = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public w.h a() {
            a aVar = d.this.B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f988b;

        public c(e eVar) {
            this.f988b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((android.support.v7.view.menu.a) d.this).f669d != null) {
                ((android.support.v7.view.menu.a) d.this).f669d.d();
            }
            View view = (View) ((android.support.v7.view.menu.a) d.this).f675j;
            if (view != null && view.getWindowToken() != null && this.f988b.m()) {
                d.this.A = this.f988b;
            }
            d.this.C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0010d extends p implements ActionMenuView.a {

        /* renamed from: d  reason: collision with root package name */
        private final float[] f990d;

        /* renamed from: android.support.v7.widget.d$d$a */
        /* loaded from: classes.dex */
        class a extends h0 {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ d f992k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, d dVar) {
                super(view);
                this.f992k = dVar;
            }

            @Override // android.support.v7.widget.h0
            public w.h b() {
                e eVar = d.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // android.support.v7.widget.h0
            public boolean c() {
                d.this.J();
                return true;
            }

            @Override // android.support.v7.widget.h0
            public boolean d() {
                d dVar = d.this;
                if (dVar.C != null) {
                    return false;
                }
                dVar.A();
                return true;
            }
        }

        public C0010d(Context context) {
            super(context, null, s.a.actionOverflowButtonStyle);
            this.f990d = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            x0.a(this, getContentDescription());
            setOnTouchListener(new a(this, d.this));
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            d.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                j.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends android.support.v7.view.menu.i {
        public e(Context context, android.support.v7.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, s.a.actionOverflowMenuStyle);
            h(8388613);
            j(d.this.E);
        }

        @Override // android.support.v7.view.menu.i
        protected void e() {
            if (((android.support.v7.view.menu.a) d.this).f669d != null) {
                ((android.support.v7.view.menu.a) d.this).f669d.close();
            }
            d.this.A = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            if (eVar instanceof android.support.v7.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m2 = d.this.m();
            if (m2 != null) {
                m2.a(eVar, z);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            d.this.F = ((android.support.v7.view.menu.m) eVar).getItem().getItemId();
            j.a m2 = d.this.m();
            if (m2 != null) {
                return m2.b(eVar);
            }
            return false;
        }
    }

    public d(Context context) {
        super(context, s.g.abc_action_menu_layout, s.g.abc_action_menu_item_layout);
        this.y = new SparseBooleanArray();
        this.E = new f();
    }

    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f675j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        android.support.v7.view.menu.k kVar;
        c cVar = this.C;
        if (cVar != null && (kVar = this.f675j) != null) {
            ((View) kVar).removeCallbacks(cVar);
            this.C = null;
            return true;
        }
        e eVar = this.A;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean B() {
        a aVar = this.B;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        return this.C != null || D();
    }

    public boolean D() {
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.f982t) {
            this.f981s = v.a.b(this.f668c).d();
        }
        android.support.v7.view.menu.e eVar = this.f669d;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void F(boolean z) {
        this.f985w = z;
    }

    public void G(ActionMenuView actionMenuView) {
        this.f675j = actionMenuView;
        actionMenuView.b(this.f669d);
    }

    public void H(Drawable drawable) {
        C0010d c0010d = this.f974l;
        if (c0010d != null) {
            c0010d.setImageDrawable(drawable);
            return;
        }
        this.f976n = true;
        this.f975m = drawable;
    }

    public void I(boolean z) {
        this.f977o = z;
        this.f978p = true;
    }

    public boolean J() {
        android.support.v7.view.menu.e eVar;
        if (!this.f977o || D() || (eVar = this.f669d) == null || this.f675j == null || this.C != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f668c, this.f669d, this.f974l, true));
        this.C = cVar;
        ((View) this.f675j).post(cVar);
        super.b(null);
        return true;
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void a(android.support.v7.view.menu.e eVar, boolean z) {
        x();
        super.a(eVar, z);
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public boolean b(android.support.v7.view.menu.m mVar) {
        boolean z = false;
        if (mVar.hasVisibleItems()) {
            android.support.v7.view.menu.m mVar2 = mVar;
            while (mVar2.e0() != this.f669d) {
                mVar2 = (android.support.v7.view.menu.m) mVar2.e0();
            }
            View y = y(mVar2.getItem());
            if (y == null) {
                return false;
            }
            this.F = mVar.getItem().getItemId();
            int size = mVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            a aVar = new a(this.f668c, mVar, y);
            this.B = aVar;
            aVar.g(z);
            this.B.k();
            super.b(mVar);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.a
    public void d(android.support.v7.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f675j);
        if (this.D == null) {
            this.D = new b();
        }
        actionMenuItemView.setPopupCallback(this.D);
    }

    @Override // android.support.v7.view.menu.j
    public boolean g() {
        ArrayList<android.support.v7.view.menu.g> arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        d dVar = this;
        android.support.v7.view.menu.e eVar = dVar.f669d;
        int i6 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = dVar.f981s;
        int i8 = dVar.f980r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dVar.f675j;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            android.support.v7.view.menu.g gVar = arrayList.get(i11);
            if (gVar.requiresActionButton()) {
                i9++;
            } else if (gVar.m()) {
                i10++;
            } else {
                z = true;
            }
            if (dVar.f985w && gVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (dVar.f977o && (z || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = dVar.y;
        sparseBooleanArray.clear();
        if (dVar.f983u) {
            int i13 = dVar.x;
            i4 = i8 / i13;
            i3 = i13 + ((i8 % i13) / i4);
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            android.support.v7.view.menu.g gVar2 = arrayList.get(i14);
            if (gVar2.requiresActionButton()) {
                View n2 = dVar.n(gVar2, dVar.z, viewGroup);
                if (dVar.z == null) {
                    dVar.z = n2;
                }
                if (dVar.f983u) {
                    i4 -= ActionMenuView.J(n2, i3, i4, makeMeasureSpec, i6);
                } else {
                    n2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n2.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.s(true);
                i5 = i2;
            } else if (gVar2.m()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i8 > 0 && (!dVar.f983u || i4 > 0);
                boolean z4 = z3;
                if (z3) {
                    View n3 = dVar.n(gVar2, dVar.z, viewGroup);
                    i5 = i2;
                    if (dVar.z == null) {
                        dVar.z = n3;
                    }
                    if (dVar.f983u) {
                        int J = ActionMenuView.J(n3, i3, i4, makeMeasureSpec, 0);
                        i4 -= J;
                        if (J == 0) {
                            z4 = false;
                        }
                    } else {
                        n3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = n3.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z3 = z4 & (!dVar.f983u ? i8 + i15 <= 0 : i8 < 0);
                } else {
                    i5 = i2;
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        android.support.v7.view.menu.g gVar3 = arrayList.get(i16);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.k()) {
                                i12++;
                            }
                            gVar3.s(false);
                        }
                    }
                }
                if (z3) {
                    i12--;
                }
                gVar2.s(z3);
            } else {
                i5 = i2;
                gVar2.s(false);
                i14++;
                dVar = this;
                i2 = i5;
                i6 = 0;
            }
            i14++;
            dVar = this;
            i2 = i5;
            i6 = 0;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void i(boolean z) {
        super.i(z);
        ((View) this.f675j).requestLayout();
        android.support.v7.view.menu.e eVar = this.f669d;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<android.support.v7.view.menu.g> s2 = eVar.s();
            int size = s2.size();
            for (int i2 = 0; i2 < size; i2++) {
                o.c b2 = s2.get(i2).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        android.support.v7.view.menu.e eVar2 = this.f669d;
        ArrayList<android.support.v7.view.menu.g> z3 = eVar2 != null ? eVar2.z() : null;
        if (this.f977o && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0010d c0010d = this.f974l;
        if (z2) {
            if (c0010d == null) {
                this.f974l = new C0010d(this.f667b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f974l.getParent();
            if (viewGroup != this.f675j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f974l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f675j;
                actionMenuView.addView(this.f974l, actionMenuView.D());
            }
        } else if (c0010d != null) {
            ViewParent parent = c0010d.getParent();
            android.support.v7.view.menu.k kVar = this.f675j;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.f974l);
            }
        }
        ((ActionMenuView) this.f675j).setOverflowReserved(this.f977o);
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void k(Context context, android.support.v7.view.menu.e eVar) {
        super.k(context, eVar);
        Resources resources = context.getResources();
        v.a b2 = v.a.b(context);
        if (!this.f978p) {
            this.f977o = b2.h();
        }
        if (!this.f984v) {
            this.f979q = b2.c();
        }
        if (!this.f982t) {
            this.f981s = b2.d();
        }
        int i2 = this.f979q;
        if (this.f977o) {
            if (this.f974l == null) {
                C0010d c0010d = new C0010d(this.f667b);
                this.f974l = c0010d;
                if (this.f976n) {
                    c0010d.setImageDrawable(this.f975m);
                    this.f975m = null;
                    this.f976n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f974l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f974l.getMeasuredWidth();
        } else {
            this.f974l = null;
        }
        this.f980r = i2;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.z = null;
    }

    @Override // android.support.v7.view.menu.a
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f974l) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // android.support.v7.view.menu.a
    public View n(android.support.v7.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.i()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.a
    public android.support.v7.view.menu.k o(ViewGroup viewGroup) {
        android.support.v7.view.menu.k kVar = this.f675j;
        android.support.v7.view.menu.k o2 = super.o(viewGroup);
        if (kVar != o2) {
            ((ActionMenuView) o2).setPresenter(this);
        }
        return o2;
    }

    @Override // android.support.v7.view.menu.a
    public boolean q(int i2, android.support.v7.view.menu.g gVar) {
        return gVar.k();
    }

    public boolean x() {
        return A() | B();
    }

    public Drawable z() {
        C0010d c0010d = this.f974l;
        if (c0010d != null) {
            return c0010d.getDrawable();
        }
        if (this.f976n) {
            return this.f975m;
        }
        return null;
    }
}