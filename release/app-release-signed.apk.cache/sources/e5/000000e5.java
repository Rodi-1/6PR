package android.support.p002v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p016o.C0490o;
import p016o.C0511s;
import p020s.C0569a;
import p020s.C0574f;
import p020s.C0575g;
import p020s.C0578j;
import p023v.AbstractC0585b;

/* renamed from: android.support.v7.widget.ActionBarContextView */
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0238a {

    /* renamed from: j */
    private CharSequence f1036j;

    /* renamed from: k */
    private CharSequence f1037k;

    /* renamed from: l */
    private View f1038l;

    /* renamed from: m */
    private View f1039m;

    /* renamed from: n */
    private LinearLayout f1040n;

    /* renamed from: o */
    private TextView f1041o;

    /* renamed from: p */
    private TextView f1042p;

    /* renamed from: q */
    private int f1043q;

    /* renamed from: r */
    private int f1044r;

    /* renamed from: s */
    private boolean f1045s;

    /* renamed from: t */
    private int f1046t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0209a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC0585b f1047b;

        View$OnClickListenerC0209a(AbstractC0585b abstractC0585b) {
            this.f1047b = abstractC0585b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1047b.mo73c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0316v0 m1108t = C0316v0.m1108t(context, attributeSet, C0578j.f2618x, i, 0);
        C0490o.m394r(this, m1108t.m1122f(C0578j.f2622y));
        this.f1043q = m1108t.m1115m(C0578j.f2429C, 0);
        this.f1044r = m1108t.m1115m(C0578j.f2425B, 0);
        this.f1229f = m1108t.m1116l(C0578j.f2421A, 0);
        this.f1046t = m1108t.m1115m(C0578j.f2626z, C0575g.abc_action_mode_close_item_material);
        m1108t.m1107u();
    }

    /* renamed from: i */
    private void m1530i() {
        if (this.f1040n == null) {
            LayoutInflater.from(getContext()).inflate(C0575g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1040n = linearLayout;
            this.f1041o = (TextView) linearLayout.findViewById(C0574f.action_bar_title);
            this.f1042p = (TextView) this.f1040n.findViewById(C0574f.action_bar_subtitle);
            if (this.f1043q != 0) {
                this.f1041o.setTextAppearance(getContext(), this.f1043q);
            }
            if (this.f1044r != 0) {
                this.f1042p.setTextAppearance(getContext(), this.f1044r);
            }
        }
        this.f1041o.setText(this.f1036j);
        this.f1042p.setText(this.f1037k);
        boolean z = !TextUtils.isEmpty(this.f1036j);
        boolean z2 = !TextUtils.isEmpty(this.f1037k);
        int i = 0;
        this.f1042p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1040n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1040n.getParent() == null) {
            addView(this.f1040n);
        }
    }

    @Override // android.support.p002v7.widget.AbstractC0238a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0511s mo1400f(int i, long j) {
        return super.mo1400f(i, j);
    }

    /* renamed from: g */
    public void m1532g() {
        if (this.f1038l == null) {
            m1528k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.support.p002v7.widget.AbstractC0238a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.p002v7.widget.AbstractC0238a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1037k;
    }

    public CharSequence getTitle() {
        return this.f1036j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1531h(p023v.AbstractC0585b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1038l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1046t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1038l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f1038l
            goto L15
        L22:
            android.view.View r0 = r3.f1038l
            int r1 = p020s.C0574f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ActionBarContextView$a r1 = new android.support.v7.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo71e()
            android.support.v7.view.menu.e r4 = (android.support.p002v7.view.menu.C0192e) r4
            android.support.v7.widget.d r0 = r3.f1228e
            if (r0 == 0) goto L3f
            r0.m1331x()
        L3f:
            android.support.v7.widget.d r0 = new android.support.v7.widget.d
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1228e = r0
            r1 = 1
            r0.m1349I(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.d r1 = r3.f1228e
            android.content.Context r2 = r3.f1226c
            r4.m1626c(r1, r2)
            android.support.v7.widget.d r4 = r3.f1228e
            android.support.v7.view.menu.k r4 = r4.mo1339o(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p002v7.widget.ActionMenuView) r4
            r3.f1227d = r4
            r1 = 0
            p016o.C0490o.m394r(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f1227d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.ActionBarContextView.m1531h(v.b):void");
    }

    /* renamed from: j */
    public boolean m1529j() {
        return this.f1045s;
    }

    /* renamed from: k */
    public void m1528k() {
        removeAllViews();
        this.f1039m = null;
        this.f1227d = null;
    }

    /* renamed from: l */
    public boolean m1527l() {
        C0248d c0248d = this.f1228e;
        if (c0248d != null) {
            return c0248d.m1348J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248d c0248d = this.f1228e;
        if (c0248d != null) {
            c0248d.m1357A();
            this.f1228e.m1356B();
        }
    }

    @Override // android.support.p002v7.widget.AbstractC0238a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1036j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m1369b = C0244b1.m1369b(this);
        int paddingRight = m1369b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1038l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1038l.getLayoutParams();
            int i5 = m1369b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m1369b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m1402d = AbstractC0238a.m1402d(paddingRight, i5, m1369b);
            paddingRight = AbstractC0238a.m1402d(m1402d + m1401e(this.f1038l, m1402d, paddingTop, paddingTop2, m1369b), i6, m1369b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1040n;
        if (linearLayout != null && this.f1039m == null && linearLayout.getVisibility() != 8) {
            i7 += m1401e(this.f1040n, i7, paddingTop, paddingTop2, m1369b);
        }
        int i8 = i7;
        View view2 = this.f1039m;
        if (view2 != null) {
            m1401e(view2, i8, paddingTop, paddingTop2, m1369b);
        }
        int paddingLeft = m1369b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1227d;
        if (actionMenuView != null) {
            m1401e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m1369b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f1229f;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f1038l;
            if (view != null) {
                int m1403c = m1403c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1038l.getLayoutParams();
                paddingLeft = m1403c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1227d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m1403c(this.f1227d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1040n;
            if (linearLayout != null && this.f1039m == null) {
                if (this.f1045s) {
                    this.f1040n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1040n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1040n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m1403c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1039m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.f1039m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.f1229f > 0) {
                setMeasuredDimension(size, i3);
                return;
            }
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
        }
    }

    @Override // android.support.p002v7.widget.AbstractC0238a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.p002v7.widget.AbstractC0238a
    public void setContentHeight(int i) {
        this.f1229f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1039m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1039m = view;
        if (view != null && (linearLayout = this.f1040n) != null) {
            removeView(linearLayout);
            this.f1040n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1037k = charSequence;
        m1530i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1036j = charSequence;
        m1530i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1045s) {
            requestLayout();
        }
        this.f1045s = z;
    }

    @Override // android.support.p002v7.widget.AbstractC0238a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}