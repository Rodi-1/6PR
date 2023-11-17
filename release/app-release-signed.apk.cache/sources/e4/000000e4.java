package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private boolean f812b;

    /* renamed from: c  reason: collision with root package name */
    private View f813c;

    /* renamed from: d  reason: collision with root package name */
    private View f814d;

    /* renamed from: e  reason: collision with root package name */
    private View f815e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f816f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f817g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f818h;

    /* renamed from: i  reason: collision with root package name */
    boolean f819i;

    /* renamed from: j  reason: collision with root package name */
    boolean f820j;

    /* renamed from: k  reason: collision with root package name */
    private int f821k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.o.r(this, Build.VERSION.SDK_INT >= 21 ? new c(this) : new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.f1864a);
        this.f816f = obtainStyledAttributes.getDrawable(s.j.f1865b);
        this.f817g = obtainStyledAttributes.getDrawable(s.j.f1867d);
        this.f821k = obtainStyledAttributes.getDimensionPixelSize(s.j.f1873j, -1);
        boolean z = true;
        if (getId() == s.f.split_action_bar) {
            this.f819i = true;
            this.f818h = obtainStyledAttributes.getDrawable(s.j.f1866c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f819i ? this.f816f != null || this.f817g != null : this.f818h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f816f;
        if (drawable != null && drawable.isStateful()) {
            this.f816f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f817g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f817g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f818h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f818h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f813c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f816f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f817g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f818h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f814d = findViewById(s.f.action_bar);
        this.f815e = findViewById(s.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f812b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f813c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f819i) {
            Drawable drawable3 = this.f818h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f816f != null) {
                if (this.f814d.getVisibility() == 0) {
                    drawable2 = this.f816f;
                    left = this.f814d.getLeft();
                    top = this.f814d.getTop();
                    right = this.f814d.getRight();
                    view = this.f814d;
                } else {
                    View view3 = this.f815e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f816f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f816f;
                        left = this.f815e.getLeft();
                        top = this.f815e.getTop();
                        right = this.f815e.getRight();
                        view = this.f815e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f820j = z4;
            if (!z4 || (drawable = this.f817g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f814d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f821k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f814d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f813c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f814d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f814d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f815e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f815e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f813c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f816f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f816f);
        }
        this.f816f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f814d;
            if (view != null) {
                this.f816f.setBounds(view.getLeft(), this.f814d.getTop(), this.f814d.getRight(), this.f814d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f819i ? this.f816f != null || this.f817g != null : this.f818h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f818h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f818h);
        }
        this.f818h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f819i && (drawable2 = this.f818h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f819i ? !(this.f816f != null || this.f817g != null) : this.f818h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f817g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f817g);
        }
        this.f817g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f820j && (drawable2 = this.f817g) != null) {
                drawable2.setBounds(this.f813c.getLeft(), this.f813c.getTop(), this.f813c.getRight(), this.f813c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f819i ? this.f816f != null || this.f817g != null : this.f818h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(o0 o0Var) {
        View view = this.f813c;
        if (view != null) {
            removeView(view);
        }
        this.f813c = o0Var;
        if (o0Var != null) {
            addView(o0Var);
            ViewGroup.LayoutParams layoutParams = o0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            o0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f812b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f816f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f817g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f818h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f816f && !this.f819i) || (drawable == this.f817g && this.f820j) || ((drawable == this.f818h && this.f819i) || super.verifyDrawable(drawable));
    }
}