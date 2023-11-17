package android.support.v7.widget;

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

/* loaded from: classes.dex */
public class ActionBarContextView extends android.support.v7.widget.a {

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f822j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f823k;

    /* renamed from: l  reason: collision with root package name */
    private View f824l;

    /* renamed from: m  reason: collision with root package name */
    private View f825m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f826n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f827o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f828p;

    /* renamed from: q  reason: collision with root package name */
    private int f829q;

    /* renamed from: r  reason: collision with root package name */
    private int f830r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f831s;

    /* renamed from: t  reason: collision with root package name */
    private int f832t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v.b f833b;

        a(v.b bVar) {
            this.f833b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f833b.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        v0 t2 = v0.t(context, attributeSet, s.j.x, i2, 0);
        o.o.r(this, t2.f(s.j.y));
        this.f829q = t2.m(s.j.C, 0);
        this.f830r = t2.m(s.j.B, 0);
        this.f950f = t2.l(s.j.A, 0);
        this.f832t = t2.m(s.j.z, s.g.abc_action_mode_close_item_material);
        t2.u();
    }

    private void i() {
        if (this.f826n == null) {
            LayoutInflater.from(getContext()).inflate(s.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f826n = linearLayout;
            this.f827o = (TextView) linearLayout.findViewById(s.f.action_bar_title);
            this.f828p = (TextView) this.f826n.findViewById(s.f.action_bar_subtitle);
            if (this.f829q != 0) {
                this.f827o.setTextAppearance(getContext(), this.f829q);
            }
            if (this.f830r != 0) {
                this.f828p.setTextAppearance(getContext(), this.f830r);
            }
        }
        this.f827o.setText(this.f822j);
        this.f828p.setText(this.f823k);
        boolean z = !TextUtils.isEmpty(this.f822j);
        boolean z2 = !TextUtils.isEmpty(this.f823k);
        int i2 = 0;
        this.f828p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f826n;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f826n.getParent() == null) {
            addView(this.f826n);
        }
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ o.s f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.f824l == null) {
            k();
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

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f823k;
    }

    public CharSequence getTitle() {
        return this.f822j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(v.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f824l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f832t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f824l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f824l
            goto L15
        L22:
            android.view.View r0 = r3.f824l
            int r1 = s.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ActionBarContextView$a r1 = new android.support.v7.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            android.support.v7.view.menu.e r4 = (android.support.v7.view.menu.e) r4
            android.support.v7.widget.d r0 = r3.f949e
            if (r0 == 0) goto L3f
            r0.x()
        L3f:
            android.support.v7.widget.d r0 = new android.support.v7.widget.d
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f949e = r0
            r1 = 1
            r0.I(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.d r1 = r3.f949e
            android.content.Context r2 = r3.f947c
            r4.c(r1, r2)
            android.support.v7.widget.d r4 = r3.f949e
            android.support.v7.view.menu.k r4 = r4.o(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.v7.widget.ActionMenuView) r4
            r3.f948d = r4
            r1 = 0
            o.o.r(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f948d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContextView.h(v.b):void");
    }

    public boolean j() {
        return this.f831s;
    }

    public void k() {
        removeAllViews();
        this.f825m = null;
        this.f948d = null;
    }

    public boolean l() {
        d dVar = this.f949e;
        if (dVar != null) {
            return dVar.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f949e;
        if (dVar != null) {
            dVar.A();
            this.f949e.B();
        }
    }

    @Override // android.support.v7.widget.a, android.view.View
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
        accessibilityEvent.setContentDescription(this.f822j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b2 = b1.b(this);
        int paddingRight = b2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f824l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f824l.getLayoutParams();
            int i6 = b2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d2 = android.support.v7.widget.a.d(paddingRight, i6, b2);
            paddingRight = android.support.v7.widget.a.d(d2 + e(this.f824l, d2, paddingTop, paddingTop2, b2), i7, b2);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f826n;
        if (linearLayout != null && this.f825m == null && linearLayout.getVisibility() != 8) {
            i8 += e(this.f826n, i8, paddingTop, paddingTop2, b2);
        }
        int i9 = i8;
        View view2 = this.f825m;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b2);
        }
        int paddingLeft = b2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f948d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i2);
            int i4 = this.f950f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f824l;
            if (view != null) {
                int c2 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f824l.getLayoutParams();
                paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f948d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f948d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f826n;
            if (linearLayout != null && this.f825m == null) {
                if (this.f831s) {
                    this.f826n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f826n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f826n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f825m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f825m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
            }
            if (this.f950f > 0) {
                setMeasuredDimension(size, i4);
                return;
            }
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i10) {
                    i10 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i10);
        }
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int i2) {
        this.f950f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f825m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f825m = view;
        if (view != null && (linearLayout = this.f826n) != null) {
            removeView(linearLayout);
            this.f826n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f823k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f822j = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f831s) {
            requestLayout();
        }
        this.f831s = z;
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}