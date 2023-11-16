package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.C0196g;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.support.p002v7.widget.C0272i0;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
/* loaded from: classes.dex */
public class ActionMenuView extends C0272i0 implements C0192e.InterfaceC0194b, InterfaceC0203k {

    /* renamed from: A */
    private int f1080A;

    /* renamed from: B */
    InterfaceC0219e f1081B;

    /* renamed from: q */
    private C0192e f1082q;

    /* renamed from: r */
    private Context f1083r;

    /* renamed from: s */
    private int f1084s;

    /* renamed from: t */
    private boolean f1085t;

    /* renamed from: u */
    private C0248d f1086u;

    /* renamed from: v */
    private InterfaceC0201j.InterfaceC0202a f1087v;

    /* renamed from: w */
    C0192e.InterfaceC0193a f1088w;

    /* renamed from: x */
    private boolean f1089x;

    /* renamed from: y */
    private int f1090y;

    /* renamed from: z */
    private int f1091z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0215a {
        /* renamed from: a */
        boolean mo1327a();

        /* renamed from: b */
        boolean mo1326b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0216b implements InterfaceC0201j.InterfaceC0202a {
        C0216b() {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: a */
        public void mo184a(C0192e c0192e, boolean z) {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
        /* renamed from: b */
        public boolean mo183b(C0192e c0192e) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0217c extends C0272i0.C0273a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1092c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f1093d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f1094e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f1095f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f1096g;

        /* renamed from: h */
        boolean f1097h;

        public C0217c(int i, int i2) {
            super(i, i2);
            this.f1092c = false;
        }

        public C0217c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0217c(C0217c c0217c) {
            super(c0217c);
            this.f1092c = c0217c.f1092c;
        }

        public C0217c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0218d implements C0192e.InterfaceC0193a {
        C0218d() {
        }

        @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
        /* renamed from: a */
        public void mo75a(C0192e c0192e) {
            C0192e.InterfaceC0193a interfaceC0193a = ActionMenuView.this.f1088w;
            if (interfaceC0193a != null) {
                interfaceC0193a.mo75a(c0192e);
            }
        }

        @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
        /* renamed from: b */
        public boolean mo74b(C0192e c0192e, MenuItem menuItem) {
            InterfaceC0219e interfaceC0219e = ActionMenuView.this.f1081B;
            return interfaceC0219e != null && interfaceC0219e.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0219e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1091z = (int) (56.0f * f);
        this.f1080A = (int) (f * 4.0f);
        this.f1083r = context;
        this.f1084s = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m1504J(View view, int i, int i2, int i3, int i4) {
        C0217c c0217c = (C0217c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m1683e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        c0217c.f1095f = (c0217c.f1092c || !z2) ? false : false;
        c0217c.f1093d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int, boolean] */
    /* renamed from: K */
    private void m1503K(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1091z;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.f1080A;
                    i6 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r14 = 0;
                }
                C0217c c0217c = (C0217c) childAt.getLayoutParams();
                c0217c.f1097h = r14;
                c0217c.f1094e = r14;
                c0217c.f1093d = r14;
                c0217c.f1095f = r14;
                ((ViewGroup.MarginLayoutParams) c0217c).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) c0217c).rightMargin = r14;
                c0217c.f1096g = z5 && ((ActionMenuItemView) childAt).m1683e();
                int m1504J = m1504J(childAt, i11, c0217c.f1092c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, m1504J);
                if (c0217c.f1095f) {
                    i16++;
                }
                if (c0217c.f1092c) {
                    z4 = true;
                }
                i9 -= m1504J;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (m1504J == 1) {
                    j |= 1 << i13;
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i9 > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = Integer.MAX_VALUE;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C0217c c0217c2 = (C0217c) getChildAt(i22).getLayoutParams();
                int i24 = i12;
                if (c0217c2.f1095f) {
                    int i25 = c0217c2.f1093d;
                    if (i25 < i23) {
                        j2 = 1 << i22;
                        i23 = i25;
                        i21 = 1;
                    } else if (i25 == i23) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                i12 = i24;
                z7 = z8;
            }
            z = z7;
            i5 = i12;
            j |= j2;
            if (i21 > i9) {
                i3 = mode;
                i4 = i7;
                break;
            }
            int i26 = i23 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                C0217c c0217c3 = (C0217c) childAt2.getLayoutParams();
                int i28 = i7;
                int i29 = mode;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (c0217c3.f1093d == i26) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0217c3.f1096g && i9 == 1) {
                        int i30 = this.f1080A;
                        z3 = z6;
                        childAt2.setPadding(i30 + i11, 0, i30, 0);
                    } else {
                        z3 = z6;
                    }
                    c0217c3.f1093d++;
                    c0217c3.f1097h = true;
                    i9--;
                }
                i27++;
                mode = i29;
                i7 = i28;
                z6 = z3;
            }
            i12 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i7;
        z = z7;
        i5 = i12;
        boolean z9 = !z4 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C0217c) getChildAt(0).getLayoutParams()).f1096g) {
                    bitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j & (1 << i31)) != 0 && !((C0217c) getChildAt(i31).getLayoutParams()).f1096g) {
                    bitCount -= 0.5f;
                }
            }
            int i32 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
            z2 = z;
            for (int i33 = 0; i33 < childCount; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0217c c0217c4 = (C0217c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0217c4.f1094e = i32;
                        c0217c4.f1097h = true;
                        if (i33 == 0 && !c0217c4.f1096g) {
                            ((ViewGroup.MarginLayoutParams) c0217c4).leftMargin = (-i32) / 2;
                        }
                    } else if (c0217c4.f1092c) {
                        c0217c4.f1094e = i32;
                        c0217c4.f1097h = true;
                        ((ViewGroup.MarginLayoutParams) c0217c4).rightMargin = (-i32) / 2;
                    } else {
                        if (i33 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0217c4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c0217c4).rightMargin = i32 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                C0217c c0217c5 = (C0217c) childAt4.getLayoutParams();
                if (c0217c5.f1097h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0217c5.f1093d * i11) + c0217c5.f1094e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i20);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0
    /* renamed from: A */
    public C0217c mo1282k() {
        C0217c c0217c = new C0217c(-2, -2);
        c0217c.f1343b = 16;
        return c0217c;
    }

    @Override // android.support.p002v7.widget.C0272i0
    /* renamed from: B */
    public C0217c mo1281l(AttributeSet attributeSet) {
        return new C0217c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0
    /* renamed from: C */
    public C0217c mo1280m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C0217c c0217c = layoutParams instanceof C0217c ? new C0217c((C0217c) layoutParams) : new C0217c(layoutParams);
            if (c0217c.f1343b <= 0) {
                c0217c.f1343b = 16;
            }
            return c0217c;
        }
        return mo1282k();
    }

    /* renamed from: D */
    public C0217c m1510D() {
        C0217c mo1282k = mo1282k();
        mo1282k.f1092c = true;
        return mo1282k;
    }

    /* renamed from: E */
    protected boolean m1509E(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0215a)) {
            z = false | ((InterfaceC0215a) childAt).mo1326b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0215a)) ? z : z | ((InterfaceC0215a) childAt2).mo1327a();
    }

    /* renamed from: F */
    public boolean m1508F() {
        C0248d c0248d = this.f1086u;
        return c0248d != null && c0248d.m1357A();
    }

    /* renamed from: G */
    public boolean m1507G() {
        C0248d c0248d = this.f1086u;
        return c0248d != null && c0248d.m1355C();
    }

    /* renamed from: H */
    public boolean m1506H() {
        C0248d c0248d = this.f1086u;
        return c0248d != null && c0248d.m1354D();
    }

    /* renamed from: I */
    public boolean m1505I() {
        return this.f1085t;
    }

    /* renamed from: L */
    public C0192e m1502L() {
        return this.f1082q;
    }

    /* renamed from: M */
    public void m1501M(InterfaceC0201j.InterfaceC0202a interfaceC0202a, C0192e.InterfaceC0193a interfaceC0193a) {
        this.f1087v = interfaceC0202a;
        this.f1088w = interfaceC0193a;
    }

    /* renamed from: N */
    public boolean m1500N() {
        C0248d c0248d = this.f1086u;
        return c0248d != null && c0248d.m1348J();
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k
    /* renamed from: b */
    public void mo1499b(C0192e c0192e) {
        this.f1082q = c0192e;
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0194b
    /* renamed from: c */
    public boolean mo1498c(C0196g c0196g) {
        return this.f1082q.m1644L(c0196g, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0217c);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1082q == null) {
            Context context = getContext();
            C0192e c0192e = new C0192e(context);
            this.f1082q = c0192e;
            c0192e.mo1540R(new C0218d());
            C0248d c0248d = new C0248d(context);
            this.f1086u = c0248d;
            c0248d.m1349I(true);
            C0248d c0248d2 = this.f1086u;
            InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f1087v;
            if (interfaceC0202a == null) {
                interfaceC0202a = new C0216b();
            }
            c0248d2.mo1554j(interfaceC0202a);
            this.f1082q.m1626c(this.f1086u, this.f1083r);
            this.f1086u.m1351G(this);
        }
        return this.f1082q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1086u.m1329z();
    }

    public int getPopupTheme() {
        return this.f1084s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0248d c0248d = this.f1086u;
        if (c0248d != null) {
            c0248d.mo1343i(false);
            if (this.f1086u.m1354D()) {
                this.f1086u.m1357A();
                this.f1086u.m1348J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1497z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1089x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m1369b = C0244b1.m1369b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0217c c0217c = (C0217c) childAt.getLayoutParams();
                if (c0217c.f1092c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1509E(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1369b) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0217c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0217c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0217c).rightMargin;
                    m1509E(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m1369b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0217c c0217c2 = (C0217c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0217c2.f1092c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) c0217c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0217c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0217c c0217c3 = (C0217c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0217c3.f1092c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0217c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0217c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0, android.view.View
    public void onMeasure(int i, int i2) {
        C0192e c0192e;
        boolean z = this.f1089x;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1089x = z2;
        if (z != z2) {
            this.f1090y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1089x && (c0192e = this.f1082q) != null && size != this.f1090y) {
            this.f1090y = size;
            c0192e.m1645K(true);
        }
        int childCount = getChildCount();
        if (this.f1089x && childCount > 0) {
            m1503K(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0217c c0217c = (C0217c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0217c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0217c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1086u.m1352F(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0219e interfaceC0219e) {
        this.f1081B = interfaceC0219e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1086u.m1350H(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1085t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1084s != i) {
            this.f1084s = i;
            if (i == 0) {
                this.f1083r = getContext();
            } else {
                this.f1083r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0248d c0248d) {
        this.f1086u = c0248d;
        c0248d.m1351G(this);
    }

    /* renamed from: z */
    public void m1497z() {
        C0248d c0248d = this.f1086u;
        if (c0248d != null) {
            c0248d.m1331x();
        }
    }
}