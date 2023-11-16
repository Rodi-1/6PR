package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.i0 */
/* loaded from: classes.dex */
public class C0272i0 extends ViewGroup {

    /* renamed from: b */
    private boolean f1327b;

    /* renamed from: c */
    private int f1328c;

    /* renamed from: d */
    private int f1329d;

    /* renamed from: e */
    private int f1330e;

    /* renamed from: f */
    private int f1331f;

    /* renamed from: g */
    private int f1332g;

    /* renamed from: h */
    private float f1333h;

    /* renamed from: i */
    private boolean f1334i;

    /* renamed from: j */
    private int[] f1335j;

    /* renamed from: k */
    private int[] f1336k;

    /* renamed from: l */
    private Drawable f1337l;

    /* renamed from: m */
    private int f1338m;

    /* renamed from: n */
    private int f1339n;

    /* renamed from: o */
    private int f1340o;

    /* renamed from: p */
    private int f1341p;

    /* renamed from: android.support.v7.widget.i0$a */
    /* loaded from: classes.dex */
    public static class C0273a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1342a;

        /* renamed from: b */
        public int f1343b;

        public C0273a(int i, int i2) {
            super(i, i2);
            this.f1343b = -1;
            this.f1342a = 0.0f;
        }

        public C0273a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1343b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2518Y0);
            this.f1342a = obtainStyledAttributes.getFloat(C0578j.f2527a1, 0.0f);
            this.f1343b = obtainStyledAttributes.getInt(C0578j.f2522Z0, -1);
            obtainStyledAttributes.recycle();
        }

        public C0273a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1343b = -1;
        }
    }

    public C0272i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0272i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1327b = true;
        this.f1328c = -1;
        this.f1329d = 0;
        this.f1331f = 8388659;
        C0316v0 m1108t = C0316v0.m1108t(context, attributeSet, C0578j.f2478O0, i, 0);
        int m1118j = m1108t.m1118j(C0578j.f2486Q0, -1);
        if (m1118j >= 0) {
            setOrientation(m1118j);
        }
        int m1118j2 = m1108t.m1118j(C0578j.f2482P0, -1);
        if (m1118j2 >= 0) {
            setGravity(m1118j2);
        }
        boolean m1127a = m1108t.m1127a(C0578j.f2490R0, true);
        if (!m1127a) {
            setBaselineAligned(m1127a);
        }
        this.f1333h = m1108t.m1120h(C0578j.f2498T0, -1.0f);
        this.f1328c = m1108t.m1118j(C0578j.f2494S0, -1);
        this.f1334i = m1108t.m1127a(C0578j.f2510W0, false);
        setDividerDrawable(m1108t.m1122f(C0578j.f2502U0));
        this.f1340o = m1108t.m1118j(C0578j.f2514X0, 0);
        this.f1341p = m1108t.m1123e(C0578j.f2506V0, 0);
        m1108t.m1107u();
    }

    /* renamed from: i */
    private void m1284i(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m1276q = m1276q(i3);
            if (m1276q.getVisibility() != 8) {
                C0273a c0273a = (C0273a) m1276q.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0273a).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) c0273a).width;
                    ((ViewGroup.MarginLayoutParams) c0273a).width = m1276q.getMeasuredWidth();
                    measureChildWithMargins(m1276q, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) c0273a).width = i4;
                }
            }
        }
    }

    /* renamed from: j */
    private void m1283j(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m1276q = m1276q(i3);
            if (m1276q.getVisibility() != 8) {
                C0273a c0273a = (C0273a) m1276q.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0273a).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) c0273a).height;
                    ((ViewGroup.MarginLayoutParams) c0273a).height = m1276q.getMeasuredHeight();
                    measureChildWithMargins(m1276q, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) c0273a).height = i4;
                }
            }
        }
    }

    /* renamed from: y */
    private void m1268y(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0273a;
    }

    /* renamed from: e */
    void m1288e(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m1369b = C0244b1.m1369b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m1276q = m1276q(i2);
            if (m1276q != null && m1276q.getVisibility() != 8 && m1275r(i2)) {
                C0273a c0273a = (C0273a) m1276q.getLayoutParams();
                m1285h(canvas, m1369b ? m1276q.getRight() + ((ViewGroup.MarginLayoutParams) c0273a).rightMargin : (m1276q.getLeft() - ((ViewGroup.MarginLayoutParams) c0273a).leftMargin) - this.f1338m);
            }
        }
        if (m1275r(virtualChildCount)) {
            View m1276q2 = m1276q(virtualChildCount - 1);
            if (m1276q2 != null) {
                C0273a c0273a2 = (C0273a) m1276q2.getLayoutParams();
                if (m1369b) {
                    left = m1276q2.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) c0273a2).leftMargin;
                    right = (left - i) - this.f1338m;
                } else {
                    right = m1276q2.getRight() + ((ViewGroup.MarginLayoutParams) c0273a2).rightMargin;
                }
            } else if (m1369b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f1338m;
            }
            m1285h(canvas, right);
        }
    }

    /* renamed from: f */
    void m1287f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m1276q = m1276q(i);
            if (m1276q != null && m1276q.getVisibility() != 8 && m1275r(i)) {
                m1286g(canvas, (m1276q.getTop() - ((ViewGroup.MarginLayoutParams) ((C0273a) m1276q.getLayoutParams())).topMargin) - this.f1339n);
            }
        }
        if (m1275r(virtualChildCount)) {
            View m1276q2 = m1276q(virtualChildCount - 1);
            m1286g(canvas, m1276q2 == null ? (getHeight() - getPaddingBottom()) - this.f1339n : m1276q2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0273a) m1276q2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: g */
    void m1286g(Canvas canvas, int i) {
        this.f1337l.setBounds(getPaddingLeft() + this.f1341p, i, (getWidth() - getPaddingRight()) - this.f1341p, this.f1339n + i);
        this.f1337l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1328c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1328c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1328c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f1329d;
            if (this.f1330e == 1 && (i = this.f1331f & C0578j.f2591q0) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1332g) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1332g;
                }
            }
            return i3 + ((ViewGroup.MarginLayoutParams) ((C0273a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1328c;
    }

    public Drawable getDividerDrawable() {
        return this.f1337l;
    }

    public int getDividerPadding() {
        return this.f1341p;
    }

    public int getDividerWidth() {
        return this.f1338m;
    }

    public int getGravity() {
        return this.f1331f;
    }

    public int getOrientation() {
        return this.f1330e;
    }

    public int getShowDividers() {
        return this.f1340o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1333h;
    }

    /* renamed from: h */
    void m1285h(Canvas canvas, int i) {
        this.f1337l.setBounds(i, getPaddingTop() + this.f1341p, this.f1338m + i, (getHeight() - getPaddingBottom()) - this.f1341p);
        this.f1337l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k */
    public C0273a generateDefaultLayoutParams() {
        int i = this.f1330e;
        if (i == 0) {
            return new C0273a(-2, -2);
        }
        if (i == 1) {
            return new C0273a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C0273a generateLayoutParams(AttributeSet attributeSet) {
        return new C0273a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0273a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0273a(layoutParams);
    }

    /* renamed from: n */
    int m1279n(View view, int i) {
        return 0;
    }

    /* renamed from: o */
    int m1278o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1337l == null) {
            return;
        }
        if (this.f1330e == 1) {
            m1287f(canvas);
        } else {
            m1288e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0272i0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0272i0.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1330e == 1) {
            m1273t(i, i2, i3, i4);
        } else {
            m1274s(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1330e == 1) {
            m1269x(i, i2);
        } else {
            m1271v(i, i2);
        }
    }

    /* renamed from: p */
    int m1277p(View view) {
        return 0;
    }

    /* renamed from: q */
    View m1276q(int i) {
        return getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public boolean m1275r(int i) {
        if (i == 0) {
            return (this.f1340o & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f1340o & 4) != 0;
        } else if ((this.f1340o & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1274s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0272i0.m1274s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1327b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1328c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1337l) {
            return;
        }
        this.f1337l = drawable;
        if (drawable != null) {
            this.f1338m = drawable.getIntrinsicWidth();
            this.f1339n = drawable.getIntrinsicHeight();
        } else {
            this.f1338m = 0;
            this.f1339n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1341p = i;
    }

    public void setGravity(int i) {
        if (this.f1331f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & C0578j.f2591q0) == 0) {
                i |= 48;
            }
            this.f1331f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1331f;
        if ((8388615 & i3) != i2) {
            this.f1331f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1334i = z;
    }

    public void setOrientation(int i) {
        if (this.f1330e != i) {
            this.f1330e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1340o) {
            requestLayout();
        }
        this.f1340o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0578j.f2591q0;
        int i3 = this.f1331f;
        if ((i3 & C0578j.f2591q0) != i2) {
            this.f1331f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1333h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1273t(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1331f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1332g
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1332g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.m1276q(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m1270w(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            android.support.v7.widget.i0$a r5 = (android.support.p002v7.widget.C0272i0.C0273a) r5
            int r1 = r5.f1343b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p016o.C0490o.m408d(r17)
            int r1 = p016o.C0474d.m456a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.m1275r(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1339n
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m1278o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1268y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m1277p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m1279n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0272i0.m1273t(int, int, int, int):void");
    }

    /* renamed from: u */
    void m1272u(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
        if (r8 > 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ac, code lost:
        if (r8 < 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1271v(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0272i0.m1271v(int, int):void");
    }

    /* renamed from: w */
    int m1270w(int i) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
        if (r15 > 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d9, code lost:
        if (r15 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1269x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0272i0.m1269x(int, int):void");
    }
}