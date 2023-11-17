package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class i0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private boolean f1039b;

    /* renamed from: c  reason: collision with root package name */
    private int f1040c;

    /* renamed from: d  reason: collision with root package name */
    private int f1041d;

    /* renamed from: e  reason: collision with root package name */
    private int f1042e;

    /* renamed from: f  reason: collision with root package name */
    private int f1043f;

    /* renamed from: g  reason: collision with root package name */
    private int f1044g;

    /* renamed from: h  reason: collision with root package name */
    private float f1045h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1046i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1047j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f1048k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1049l;

    /* renamed from: m  reason: collision with root package name */
    private int f1050m;

    /* renamed from: n  reason: collision with root package name */
    private int f1051n;

    /* renamed from: o  reason: collision with root package name */
    private int f1052o;

    /* renamed from: p  reason: collision with root package name */
    private int f1053p;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f1054a;

        /* renamed from: b  reason: collision with root package name */
        public int f1055b;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1055b = -1;
            this.f1054a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1055b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.Y0);
            this.f1054a = obtainStyledAttributes.getFloat(s.j.a1, 0.0f);
            this.f1055b = obtainStyledAttributes.getInt(s.j.Z0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1055b = -1;
        }
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1039b = true;
        this.f1040c = -1;
        this.f1041d = 0;
        this.f1043f = 8388659;
        v0 t2 = v0.t(context, attributeSet, s.j.O0, i2, 0);
        int j2 = t2.j(s.j.Q0, -1);
        if (j2 >= 0) {
            setOrientation(j2);
        }
        int j3 = t2.j(s.j.P0, -1);
        if (j3 >= 0) {
            setGravity(j3);
        }
        boolean a2 = t2.a(s.j.R0, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f1045h = t2.h(s.j.T0, -1.0f);
        this.f1040c = t2.j(s.j.S0, -1);
        this.f1046i = t2.a(s.j.W0, false);
        setDividerDrawable(t2.f(s.j.U0));
        this.f1052o = t2.j(s.j.X0, 0);
        this.f1053p = t2.e(s.j.V0, 0);
        t2.u();
    }

    private void i(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q2 = q(i4);
            if (q2.getVisibility() != 8) {
                a aVar = (a) q2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = q2.getMeasuredWidth();
                    measureChildWithMargins(q2, i3, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void j(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q2 = q(i4);
            if (q2.getVisibility() != 8) {
                a aVar = (a) q2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = q2.getMeasuredHeight();
                    measureChildWithMargins(q2, makeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void y(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = b1.b(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View q2 = q(i3);
            if (q2 != null && q2.getVisibility() != 8 && r(i3)) {
                a aVar = (a) q2.getLayoutParams();
                h(canvas, b2 ? q2.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (q2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1050m);
            }
        }
        if (r(virtualChildCount)) {
            View q3 = q(virtualChildCount - 1);
            if (q3 != null) {
                a aVar2 = (a) q3.getLayoutParams();
                if (b2) {
                    left = q3.getLeft();
                    i2 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i2) - this.f1050m;
                } else {
                    right = q3.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b2) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i2 = getPaddingRight();
                right = (left - i2) - this.f1050m;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View q2 = q(i2);
            if (q2 != null && q2.getVisibility() != 8 && r(i2)) {
                g(canvas, (q2.getTop() - ((ViewGroup.MarginLayoutParams) ((a) q2.getLayoutParams())).topMargin) - this.f1051n);
            }
        }
        if (r(virtualChildCount)) {
            View q3 = q(virtualChildCount - 1);
            g(canvas, q3 == null ? (getHeight() - getPaddingBottom()) - this.f1051n : q3.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) q3.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i2) {
        this.f1049l.setBounds(getPaddingLeft() + this.f1053p, i2, (getWidth() - getPaddingRight()) - this.f1053p, this.f1051n + i2);
        this.f1049l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1040c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1040c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1040c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i4 = this.f1041d;
            if (this.f1042e == 1 && (i2 = this.f1043f & s.j.q0) != 48) {
                if (i2 == 16) {
                    i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1044g) / 2;
                } else if (i2 == 80) {
                    i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1044g;
                }
            }
            return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1040c;
    }

    public Drawable getDividerDrawable() {
        return this.f1049l;
    }

    public int getDividerPadding() {
        return this.f1053p;
    }

    public int getDividerWidth() {
        return this.f1050m;
    }

    public int getGravity() {
        return this.f1043f;
    }

    public int getOrientation() {
        return this.f1042e;
    }

    public int getShowDividers() {
        return this.f1052o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1045h;
    }

    void h(Canvas canvas, int i2) {
        this.f1049l.setBounds(i2, getPaddingTop() + this.f1053p, this.f1050m + i2, (getHeight() - getPaddingBottom()) - this.f1053p);
        this.f1049l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1042e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int n(View view, int i2) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1049l == null) {
            return;
        }
        if (this.f1042e == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(i0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(i0.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f1042e == 1) {
            t(i2, i3, i4, i5);
        } else {
            s(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f1042e == 1) {
            x(i2, i3);
        } else {
            v(i2, i3);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i2) {
        return getChildAt(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(int i2) {
        if (i2 == 0) {
            return (this.f1052o & 1) != 0;
        } else if (i2 == getChildCount()) {
            return (this.f1052o & 4) != 0;
        } else if ((this.f1052o & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.i0.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1039b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1040c = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1049l) {
            return;
        }
        this.f1049l = drawable;
        if (drawable != null) {
            this.f1050m = drawable.getIntrinsicWidth();
            this.f1051n = drawable.getIntrinsicHeight();
        } else {
            this.f1050m = 0;
            this.f1051n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1053p = i2;
    }

    public void setGravity(int i2) {
        if (this.f1043f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & s.j.q0) == 0) {
                i2 |= 48;
            }
            this.f1043f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1043f;
        if ((8388615 & i4) != i3) {
            this.f1043f = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1046i = z;
    }

    public void setOrientation(int i2) {
        if (this.f1042e != i2) {
            this.f1042e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1052o) {
            requestLayout();
        }
        this.f1052o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & s.j.q0;
        int i4 = this.f1043f;
        if ((i4 & s.j.q0) != i3) {
            this.f1043f = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1045h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(int r18, int r19, int r20, int r21) {
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
            int r0 = r6.f1043f
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
            int r1 = r6.f1044g
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1044g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.q(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.w(r12)
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
            android.support.v7.widget.i0$a r5 = (android.support.v7.widget.i0.a) r5
            int r1 = r5.f1055b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = o.o.d(r17)
            int r1 = o.d.a(r1, r2)
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
            boolean r1 = r6.r(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1051n
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.i0.t(int, int, int, int):void");
    }

    void u(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.i0.v(int, int):void");
    }

    int w(int i2) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.i0.x(int, int):void");
    }
}