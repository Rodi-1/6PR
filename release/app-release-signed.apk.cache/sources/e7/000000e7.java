package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.j;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, o.k {
    static final int[] C = {s.a.actionBarSize, 16842841};
    private final Runnable A;
    private final o.l B;

    /* renamed from: b  reason: collision with root package name */
    private int f835b;

    /* renamed from: c  reason: collision with root package name */
    private int f836c;

    /* renamed from: d  reason: collision with root package name */
    private ContentFrameLayout f837d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f838e;

    /* renamed from: f  reason: collision with root package name */
    private d0 f839f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f840g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f841h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f842i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f843j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f844k;

    /* renamed from: l  reason: collision with root package name */
    boolean f845l;

    /* renamed from: m  reason: collision with root package name */
    private int f846m;

    /* renamed from: n  reason: collision with root package name */
    private int f847n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f848o;

    /* renamed from: p  reason: collision with root package name */
    private final Rect f849p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f850q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f851r;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f852s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f853t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f854u;

    /* renamed from: v  reason: collision with root package name */
    private d f855v;

    /* renamed from: w  reason: collision with root package name */
    private OverScroller f856w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.f845l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.f845l = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f838e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f838e.animate().translationY(-ActionBarOverlayLayout.this.f838e.getHeight()).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b(boolean z);

        void c(int i2);

        void d();

        void e();

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f836c = 0;
        this.f848o = new Rect();
        this.f849p = new Rect();
        this.f850q = new Rect();
        this.f851r = new Rect();
        this.f852s = new Rect();
        this.f853t = new Rect();
        this.f854u = new Rect();
        this.y = new a();
        this.z = new b();
        this.A = new c();
        u(context);
        this.B = new o.l(this);
    }

    private boolean A(float f2, float f3) {
        this.f856w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f856w.getFinalY() > this.f838e.getHeight();
    }

    private void o() {
        t();
        this.A.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r3 = (android.support.v7.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private d0 s(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void u(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f835b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f840g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f841h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f856w = new OverScroller(context);
    }

    private void w() {
        t();
        postDelayed(this.A, 600L);
    }

    private void x() {
        t();
        postDelayed(this.z, 600L);
    }

    private void z() {
        t();
        this.z.run();
    }

    @Override // android.support.v7.widget.c0
    public boolean a() {
        y();
        return this.f839f.a();
    }

    @Override // android.support.v7.widget.c0
    public boolean b() {
        y();
        return this.f839f.b();
    }

    @Override // android.support.v7.widget.c0
    public void c() {
        y();
        this.f839f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.support.v7.widget.c0
    public boolean d() {
        y();
        return this.f839f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f840g == null || this.f841h) {
            return;
        }
        int bottom = this.f838e.getVisibility() == 0 ? (int) (this.f838e.getBottom() + this.f838e.getTranslationY() + 0.5f) : 0;
        this.f840g.setBounds(0, bottom, getWidth(), this.f840g.getIntrinsicHeight() + bottom);
        this.f840g.draw(canvas);
    }

    @Override // android.support.v7.widget.c0
    public boolean e() {
        y();
        return this.f839f.e();
    }

    @Override // android.support.v7.widget.c0
    public void f(Menu menu, j.a aVar) {
        y();
        this.f839f.f(menu, aVar);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        y();
        o.o.g(this);
        boolean p2 = p(this.f838e, rect, true, true, false, true);
        this.f851r.set(rect);
        b1.a(this, this.f851r, this.f848o);
        if (!this.f852s.equals(this.f851r)) {
            this.f852s.set(this.f851r);
            p2 = true;
        }
        if (!this.f849p.equals(this.f848o)) {
            this.f849p.set(this.f848o);
            p2 = true;
        }
        if (p2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.support.v7.widget.c0
    public boolean g() {
        y();
        return this.f839f.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f838e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        y();
        return this.f839f.getTitle();
    }

    @Override // android.support.v7.widget.c0
    public void h(int i2) {
        y();
        if (i2 == 2) {
            this.f839f.m();
        } else if (i2 == 5) {
            this.f839f.r();
        } else if (i2 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // android.support.v7.widget.c0
    public void j() {
        y();
        this.f839f.h();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u(getContext());
        o.o.p(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        y();
        measureChildWithMargins(this.f838e, i2, 0, i3, 0);
        e eVar = (e) this.f838e.getLayoutParams();
        int max = Math.max(0, this.f838e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f838e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f838e.getMeasuredState());
        boolean z = (o.o.g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f835b;
            if (this.f843j && this.f838e.getTabContainer() != null) {
                measuredHeight += this.f835b;
            }
        } else {
            measuredHeight = this.f838e.getVisibility() != 8 ? this.f838e.getMeasuredHeight() : 0;
        }
        this.f850q.set(this.f848o);
        this.f853t.set(this.f851r);
        Rect rect = (this.f842i || z) ? this.f853t : this.f850q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        p(this.f837d, this.f850q, true, true, true, true);
        if (!this.f854u.equals(this.f853t)) {
            this.f854u.set(this.f853t);
            this.f837d.a(this.f853t);
        }
        measureChildWithMargins(this.f837d, i2, 0, i3, 0);
        e eVar2 = (e) this.f837d.getLayoutParams();
        int max3 = Math.max(max, this.f837d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f837d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f837d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (this.f844k && z) {
            if (A(f2, f3)) {
                o();
            } else {
                z();
            }
            this.f845l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f846m + i3;
        this.f846m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.b(view, view2, i2);
        this.f846m = getActionBarHideOffset();
        t();
        d dVar = this.f855v;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f838e.getVisibility() != 0) {
            return false;
        }
        return this.f844k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onStopNestedScroll(View view) {
        if (this.f844k && !this.f845l) {
            if (this.f846m <= this.f838e.getHeight()) {
                x();
            } else {
                w();
            }
        }
        d dVar = this.f855v;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        y();
        int i3 = this.f847n ^ i2;
        this.f847n = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.f855v;
        if (dVar != null) {
            dVar.b(!z2);
            if (z || !z2) {
                this.f855v.e();
            } else {
                this.f855v.d();
            }
        }
        if ((i3 & 256) == 0 || this.f855v == null) {
            return;
        }
        o.o.p(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f836c = i2;
        d dVar = this.f855v;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        t();
        this.f838e.setTranslationY(-Math.max(0, Math.min(i2, this.f838e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f855v = dVar;
        if (getWindowToken() != null) {
            this.f855v.c(this.f836c);
            int i2 = this.f847n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                o.o.p(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f843j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f844k) {
            this.f844k = z;
            if (z) {
                return;
            }
            t();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        y();
        this.f839f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        y();
        this.f839f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        y();
        this.f839f.o(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f842i = z;
        this.f841h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.support.v7.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        y();
        this.f839f.setWindowCallback(callback);
    }

    @Override // android.support.v7.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        y();
        this.f839f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean v() {
        return this.f842i;
    }

    void y() {
        if (this.f837d == null) {
            this.f837d = (ContentFrameLayout) findViewById(s.f.action_bar_activity_content);
            this.f838e = (ActionBarContainer) findViewById(s.f.action_bar_container);
            this.f839f = s(findViewById(s.f.action_bar));
        }
    }
}