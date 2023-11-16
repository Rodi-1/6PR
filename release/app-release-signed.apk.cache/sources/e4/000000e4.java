package android.support.p002v7.widget;

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
import p016o.C0490o;
import p020s.C0574f;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.ActionBarContainer */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    private boolean f1026b;

    /* renamed from: c */
    private View f1027c;

    /* renamed from: d */
    private View f1028d;

    /* renamed from: e */
    private View f1029e;

    /* renamed from: f */
    Drawable f1030f;

    /* renamed from: g */
    Drawable f1031g;

    /* renamed from: h */
    Drawable f1032h;

    /* renamed from: i */
    boolean f1033i;

    /* renamed from: j */
    boolean f1034j;

    /* renamed from: k */
    private int f1035k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0490o.m394r(this, Build.VERSION.SDK_INT >= 21 ? new C0245c(this) : new C0242b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2525a);
        this.f1030f = obtainStyledAttributes.getDrawable(C0578j.f2530b);
        this.f1031g = obtainStyledAttributes.getDrawable(C0578j.f2538d);
        this.f1035k = obtainStyledAttributes.getDimensionPixelSize(C0578j.f2562j, -1);
        boolean z = true;
        if (getId() == C0574f.split_action_bar) {
            this.f1033i = true;
            this.f1032h = obtainStyledAttributes.getDrawable(C0578j.f2534c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1033i ? this.f1030f != null || this.f1031g != null : this.f1032h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1534a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1533b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1030f;
        if (drawable != null && drawable.isStateful()) {
            this.f1030f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1031g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1031g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1032h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1032h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1027c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1030f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1031g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1032h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1028d = findViewById(C0574f.action_bar);
        this.f1029e = findViewById(C0574f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1026b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1027c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1033i) {
            Drawable drawable3 = this.f1032h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1030f != null) {
                if (this.f1028d.getVisibility() == 0) {
                    drawable2 = this.f1030f;
                    left = this.f1028d.getLeft();
                    top = this.f1028d.getTop();
                    right = this.f1028d.getRight();
                    view = this.f1028d;
                } else {
                    View view3 = this.f1029e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1030f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f1030f;
                        left = this.f1029e.getLeft();
                        top = this.f1029e.getTop();
                        right = this.f1029e.getRight();
                        view = this.f1029e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1034j = z4;
            if (!z4 || (drawable = this.f1031g) == null) {
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
            android.view.View r0 = r3.f1028d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f1035k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1028d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1027c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1028d
            boolean r0 = r3.m1533b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1028d
        L42:
            int r0 = r3.m1534a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1029e
            boolean r0 = r3.m1533b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1029e
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
            android.view.View r1 = r3.f1027c
            int r1 = r3.m1534a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1030f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1030f);
        }
        this.f1030f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1028d;
            if (view != null) {
                this.f1030f.setBounds(view.getLeft(), this.f1028d.getTop(), this.f1028d.getRight(), this.f1028d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1033i ? this.f1030f != null || this.f1031g != null : this.f1032h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1032h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1032h);
        }
        this.f1032h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1033i && (drawable2 = this.f1032h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1033i ? !(this.f1030f != null || this.f1031g != null) : this.f1032h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1031g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1031g);
        }
        this.f1031g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1034j && (drawable2 = this.f1031g) != null) {
                drawable2.setBounds(this.f1027c.getLeft(), this.f1027c.getTop(), this.f1027c.getRight(), this.f1027c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1033i ? this.f1030f != null || this.f1031g != null : this.f1032h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0297o0 c0297o0) {
        View view = this.f1027c;
        if (view != null) {
            removeView(view);
        }
        this.f1027c = c0297o0;
        if (c0297o0 != null) {
            addView(c0297o0);
            ViewGroup.LayoutParams layoutParams = c0297o0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0297o0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1026b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1030f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1031g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1032h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1030f && !this.f1033i) || (drawable == this.f1031g && this.f1034j) || ((drawable == this.f1032h && this.f1033i) || super.verifyDrawable(drawable));
    }
}