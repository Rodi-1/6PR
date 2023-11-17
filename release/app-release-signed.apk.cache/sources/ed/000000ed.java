package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.j;
import android.support.v7.widget.i0;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class ActionMenuView extends i0 implements e.b, android.support.v7.view.menu.k {
    private int A;
    e B;

    /* renamed from: q  reason: collision with root package name */
    private android.support.v7.view.menu.e f860q;

    /* renamed from: r  reason: collision with root package name */
    private Context f861r;

    /* renamed from: s  reason: collision with root package name */
    private int f862s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f863t;

    /* renamed from: u  reason: collision with root package name */
    private android.support.v7.widget.d f864u;

    /* renamed from: v  reason: collision with root package name */
    private j.a f865v;

    /* renamed from: w  reason: collision with root package name */
    e.a f866w;
    private boolean x;
    private int y;
    private int z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f867c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f868d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f869e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f870f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f871g;

        /* renamed from: h  reason: collision with root package name */
        boolean f872h;

        public c(int i2, int i3) {
            super(i2, i3);
            this.f867c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(c cVar) {
            super(cVar);
            this.f867c = cVar.f867c;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements e.a {
        d() {
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f866w;
            if (aVar != null) {
                aVar.a(eVar);
            }
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.B;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.f861r = context;
        this.f862s = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.e();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        cVar.f870f = (cVar.f867c || !z2) ? false : false;
        cVar.f868d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void K(int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.z;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j2 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z5) {
                    int i20 = this.A;
                    i7 = i19;
                    r14 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f872h = r14;
                cVar.f869e = r14;
                cVar.f868d = r14;
                cVar.f870f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f871g = z5 && ((ActionMenuItemView) childAt).e();
                int J = J(childAt, i12, cVar.f867c ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, J);
                if (cVar.f870f) {
                    i17++;
                }
                if (cVar.f867c) {
                    z4 = true;
                }
                i10 -= J;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (J == 1) {
                    j2 |= 1 << i14;
                    i13 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i21 = size2;
        boolean z6 = z4 && i15 == 2;
        boolean z7 = false;
        while (i17 > 0 && i10 > 0) {
            int i22 = 0;
            int i23 = 0;
            int i24 = Integer.MAX_VALUE;
            long j3 = 0;
            while (i23 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(i23).getLayoutParams();
                int i25 = i13;
                if (cVar2.f870f) {
                    int i26 = cVar2.f868d;
                    if (i26 < i24) {
                        j3 = 1 << i23;
                        i24 = i26;
                        i22 = 1;
                    } else if (i26 == i24) {
                        i22++;
                        j3 |= 1 << i23;
                    }
                }
                i23++;
                i13 = i25;
                z7 = z8;
            }
            z = z7;
            i6 = i13;
            j2 |= j3;
            if (i22 > i10) {
                i4 = mode;
                i5 = i8;
                break;
            }
            int i27 = i24 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i29 = i8;
                int i30 = mode;
                long j4 = 1 << i28;
                if ((j3 & j4) == 0) {
                    if (cVar3.f868d == i27) {
                        j2 |= j4;
                    }
                    z3 = z6;
                } else {
                    if (z6 && cVar3.f871g && i10 == 1) {
                        int i31 = this.A;
                        z3 = z6;
                        childAt2.setPadding(i31 + i12, 0, i31, 0);
                    } else {
                        z3 = z6;
                    }
                    cVar3.f868d++;
                    cVar3.f872h = true;
                    i10--;
                }
                i28++;
                mode = i30;
                i8 = i29;
                z6 = z3;
            }
            i13 = i6;
            z7 = true;
        }
        i4 = mode;
        i5 = i8;
        z = z7;
        i6 = i13;
        boolean z9 = !z4 && i15 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i15 - 1 && !z9 && i16 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z9) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f871g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j2 & (1 << i32)) != 0 && !((c) getChildAt(i32).getLayoutParams()).f871g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j2 & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f869e = i33;
                        cVar4.f872h = true;
                        if (i34 == 0 && !cVar4.f871g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f867c) {
                        cVar4.f869e = i33;
                        cVar4.f872h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f872h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f868d * i12) + cVar5.f869e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, i4 != 1073741824 ? i6 : i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0
    /* renamed from: A */
    public c k() {
        c cVar = new c(-2, -2);
        cVar.f1055b = 16;
        return cVar;
    }

    @Override // android.support.v7.widget.i0
    /* renamed from: B */
    public c l(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0
    /* renamed from: C */
    public c m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.f1055b <= 0) {
                cVar.f1055b = 16;
            }
            return cVar;
        }
        return k();
    }

    public c D() {
        c k2 = k();
        k2.f867c = true;
        return k2;
    }

    protected boolean E(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).a();
    }

    public boolean F() {
        android.support.v7.widget.d dVar = this.f864u;
        return dVar != null && dVar.A();
    }

    public boolean G() {
        android.support.v7.widget.d dVar = this.f864u;
        return dVar != null && dVar.C();
    }

    public boolean H() {
        android.support.v7.widget.d dVar = this.f864u;
        return dVar != null && dVar.D();
    }

    public boolean I() {
        return this.f863t;
    }

    public android.support.v7.view.menu.e L() {
        return this.f860q;
    }

    public void M(j.a aVar, e.a aVar2) {
        this.f865v = aVar;
        this.f866w = aVar2;
    }

    public boolean N() {
        android.support.v7.widget.d dVar = this.f864u;
        return dVar != null && dVar.J();
    }

    @Override // android.support.v7.view.menu.k
    public void b(android.support.v7.view.menu.e eVar) {
        this.f860q = eVar;
    }

    @Override // android.support.v7.view.menu.e.b
    public boolean c(android.support.v7.view.menu.g gVar) {
        return this.f860q.L(gVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f860q == null) {
            Context context = getContext();
            android.support.v7.view.menu.e eVar = new android.support.v7.view.menu.e(context);
            this.f860q = eVar;
            eVar.R(new d());
            android.support.v7.widget.d dVar = new android.support.v7.widget.d(context);
            this.f864u = dVar;
            dVar.I(true);
            android.support.v7.widget.d dVar2 = this.f864u;
            j.a aVar = this.f865v;
            if (aVar == null) {
                aVar = new b();
            }
            dVar2.j(aVar);
            this.f860q.c(this.f864u, this.f861r);
            this.f864u.G(this);
        }
        return this.f860q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f864u.z();
    }

    public int getPopupTheme() {
        return this.f862s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.widget.d dVar = this.f864u;
        if (dVar != null) {
            dVar.i(false);
            if (this.f864u.D()) {
                this.f864u.A();
                this.f864u.J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.x) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = b1.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f867c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    E(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f867c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f867c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0, android.view.View
    public void onMeasure(int i2, int i3) {
        android.support.v7.view.menu.e eVar;
        boolean z = this.x;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.x = z2;
        if (z != z2) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.x && (eVar = this.f860q) != null && size != this.y) {
            this.y = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.x && childCount > 0) {
            K(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f864u.F(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f864u.H(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f863t = z;
    }

    public void setPopupTheme(int i2) {
        if (this.f862s != i2) {
            this.f862s = i2;
            if (i2 == 0) {
                this.f861r = getContext();
            } else {
                this.f861r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(android.support.v7.widget.d dVar) {
        this.f864u = dVar;
        dVar.G(this);
    }

    public void z() {
        android.support.v7.widget.d dVar = this.f864u;
        if (dVar != null) {
            dVar.x();
        }
    }
}