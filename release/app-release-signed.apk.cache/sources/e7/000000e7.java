package android.support.p002v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import p016o.C0487l;
import p016o.C0490o;
import p016o.InterfaceC0486k;
import p020s.C0569a;
import p020s.C0574f;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0246c0, InterfaceC0486k {

    /* renamed from: C */
    static final int[] f1049C = {C0569a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1050A;

    /* renamed from: B */
    private final C0487l f1051B;

    /* renamed from: b */
    private int f1052b;

    /* renamed from: c */
    private int f1053c;

    /* renamed from: d */
    private ContentFrameLayout f1054d;

    /* renamed from: e */
    ActionBarContainer f1055e;

    /* renamed from: f */
    private InterfaceC0256d0 f1056f;

    /* renamed from: g */
    private Drawable f1057g;

    /* renamed from: h */
    private boolean f1058h;

    /* renamed from: i */
    private boolean f1059i;

    /* renamed from: j */
    private boolean f1060j;

    /* renamed from: k */
    private boolean f1061k;

    /* renamed from: l */
    boolean f1062l;

    /* renamed from: m */
    private int f1063m;

    /* renamed from: n */
    private int f1064n;

    /* renamed from: o */
    private final Rect f1065o;

    /* renamed from: p */
    private final Rect f1066p;

    /* renamed from: q */
    private final Rect f1067q;

    /* renamed from: r */
    private final Rect f1068r;

    /* renamed from: s */
    private final Rect f1069s;

    /* renamed from: t */
    private final Rect f1070t;

    /* renamed from: u */
    private final Rect f1071u;

    /* renamed from: v */
    private InterfaceC0213d f1072v;

    /* renamed from: w */
    private OverScroller f1073w;

    /* renamed from: x */
    ViewPropertyAnimator f1074x;

    /* renamed from: y */
    final AnimatorListenerAdapter f1075y;

    /* renamed from: z */
    private final Runnable f1076z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0210a extends AnimatorListenerAdapter {
        C0210a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1074x = null;
            actionBarOverlayLayout.f1062l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1074x = null;
            actionBarOverlayLayout.f1062l = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0211b implements Runnable {
        RunnableC0211b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1520t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1074x = actionBarOverlayLayout.f1055e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1075y);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0212c implements Runnable {
        RunnableC0212c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1520t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1074x = actionBarOverlayLayout.f1055e.animate().translationY(-ActionBarOverlayLayout.this.f1055e.getHeight()).setListener(ActionBarOverlayLayout.this.f1075y);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0213d {
        /* renamed from: a */
        void mo129a();

        /* renamed from: b */
        void mo128b(boolean z);

        /* renamed from: c */
        void mo127c(int i);

        /* renamed from: d */
        void mo126d();

        /* renamed from: e */
        void mo125e();

        /* renamed from: f */
        void mo124f();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0214e extends ViewGroup.MarginLayoutParams {
        public C0214e(int i, int i2) {
            super(i, i2);
        }

        public C0214e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0214e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1053c = 0;
        this.f1065o = new Rect();
        this.f1066p = new Rect();
        this.f1067q = new Rect();
        this.f1068r = new Rect();
        this.f1069s = new Rect();
        this.f1070t = new Rect();
        this.f1071u = new Rect();
        this.f1075y = new C0210a();
        this.f1076z = new RunnableC0211b();
        this.f1050A = new RunnableC0212c();
        m1519u(context);
        this.f1051B = new C0487l(this);
    }

    /* renamed from: A */
    private boolean m1526A(float f, float f2) {
        this.f1073w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1073w.getFinalY() > this.f1055e.getHeight();
    }

    /* renamed from: o */
    private void m1525o() {
        m1520t();
        this.f1050A.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1524p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r3 = (android.support.p002v7.widget.ActionBarOverlayLayout.C0214e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.ActionBarOverlayLayout.m1524p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: s */
    private InterfaceC0256d0 m1521s(View view) {
        if (view instanceof InterfaceC0256d0) {
            return (InterfaceC0256d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: u */
    private void m1519u(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1049C);
        this.f1052b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1057g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1058h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1073w = new OverScroller(context);
    }

    /* renamed from: w */
    private void m1517w() {
        m1520t();
        postDelayed(this.f1050A, 600L);
    }

    /* renamed from: x */
    private void m1516x() {
        m1520t();
        postDelayed(this.f1076z, 600L);
    }

    /* renamed from: z */
    private void m1514z() {
        m1520t();
        this.f1076z.run();
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: a */
    public boolean mo1367a() {
        m1515y();
        return this.f1056f.mo1091a();
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: b */
    public boolean mo1366b() {
        m1515y();
        return this.f1056f.mo1090b();
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: c */
    public void mo1365c() {
        m1515y();
        this.f1056f.mo1089c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0214e;
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: d */
    public boolean mo1364d() {
        m1515y();
        return this.f1056f.mo1088d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1057g == null || this.f1058h) {
            return;
        }
        int bottom = this.f1055e.getVisibility() == 0 ? (int) (this.f1055e.getBottom() + this.f1055e.getTranslationY() + 0.5f) : 0;
        this.f1057g.setBounds(0, bottom, getWidth(), this.f1057g.getIntrinsicHeight() + bottom);
        this.f1057g.draw(canvas);
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: e */
    public boolean mo1363e() {
        m1515y();
        return this.f1056f.mo1087e();
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: f */
    public void mo1362f(Menu menu, InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        m1515y();
        this.f1056f.mo1086f(menu, interfaceC0202a);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m1515y();
        C0490o.m405g(this);
        boolean m1524p = m1524p(this.f1055e, rect, true, true, false, true);
        this.f1068r.set(rect);
        C0244b1.m1370a(this, this.f1068r, this.f1065o);
        if (!this.f1069s.equals(this.f1068r)) {
            this.f1069s.set(this.f1068r);
            m1524p = true;
        }
        if (!this.f1066p.equals(this.f1065o)) {
            this.f1066p.set(this.f1065o);
            m1524p = true;
        }
        if (m1524p) {
            requestLayout();
        }
        return true;
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: g */
    public boolean mo1361g() {
        m1515y();
        return this.f1056f.mo1085g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0214e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1055e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1051B.m416a();
    }

    public CharSequence getTitle() {
        m1515y();
        return this.f1056f.getTitle();
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: h */
    public void mo1360h(int i) {
        m1515y();
        if (i == 2) {
            this.f1056f.mo1079m();
        } else if (i == 5) {
            this.f1056f.mo1074r();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    /* renamed from: j */
    public void mo1359j() {
        m1515y();
        this.f1056f.mo1084h();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1519u(getContext());
        C0490o.m396p(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1520t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0214e c0214e = (C0214e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0214e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0214e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m1515y();
        measureChildWithMargins(this.f1055e, i, 0, i2, 0);
        C0214e c0214e = (C0214e) this.f1055e.getLayoutParams();
        int max = Math.max(0, this.f1055e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0214e).leftMargin + ((ViewGroup.MarginLayoutParams) c0214e).rightMargin);
        int max2 = Math.max(0, this.f1055e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0214e).topMargin + ((ViewGroup.MarginLayoutParams) c0214e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1055e.getMeasuredState());
        boolean z = (C0490o.m405g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1052b;
            if (this.f1060j && this.f1055e.getTabContainer() != null) {
                measuredHeight += this.f1052b;
            }
        } else {
            measuredHeight = this.f1055e.getVisibility() != 8 ? this.f1055e.getMeasuredHeight() : 0;
        }
        this.f1067q.set(this.f1065o);
        this.f1070t.set(this.f1068r);
        Rect rect = (this.f1059i || z) ? this.f1070t : this.f1067q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        m1524p(this.f1054d, this.f1067q, true, true, true, true);
        if (!this.f1071u.equals(this.f1070t)) {
            this.f1071u.set(this.f1070t);
            this.f1054d.m1490a(this.f1070t);
        }
        measureChildWithMargins(this.f1054d, i, 0, i2, 0);
        C0214e c0214e2 = (C0214e) this.f1054d.getLayoutParams();
        int max3 = Math.max(max, this.f1054d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0214e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0214e2).rightMargin);
        int max4 = Math.max(max2, this.f1054d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0214e2).topMargin + ((ViewGroup.MarginLayoutParams) c0214e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1054d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f1061k && z) {
            if (m1526A(f, f2)) {
                m1525o();
            } else {
                m1514z();
            }
            this.f1062l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1063m + i2;
        this.f1063m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1051B.m415b(view, view2, i);
        this.f1063m = getActionBarHideOffset();
        m1520t();
        InterfaceC0213d interfaceC0213d = this.f1072v;
        if (interfaceC0213d != null) {
            interfaceC0213d.mo129a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1055e.getVisibility() != 0) {
            return false;
        }
        return this.f1061k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onStopNestedScroll(View view) {
        if (this.f1061k && !this.f1062l) {
            if (this.f1063m <= this.f1055e.getHeight()) {
                m1516x();
            } else {
                m1517w();
            }
        }
        InterfaceC0213d interfaceC0213d = this.f1072v;
        if (interfaceC0213d != null) {
            interfaceC0213d.mo124f();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1515y();
        int i2 = this.f1064n ^ i;
        this.f1064n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0213d interfaceC0213d = this.f1072v;
        if (interfaceC0213d != null) {
            interfaceC0213d.mo128b(!z2);
            if (z || !z2) {
                this.f1072v.mo125e();
            } else {
                this.f1072v.mo126d();
            }
        }
        if ((i2 & 256) == 0 || this.f1072v == null) {
            return;
        }
        C0490o.m396p(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1053c = i;
        InterfaceC0213d interfaceC0213d = this.f1072v;
        if (interfaceC0213d != null) {
            interfaceC0213d.mo127c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q */
    public C0214e generateDefaultLayoutParams() {
        return new C0214e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public C0214e generateLayoutParams(AttributeSet attributeSet) {
        return new C0214e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        m1520t();
        this.f1055e.setTranslationY(-Math.max(0, Math.min(i, this.f1055e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0213d interfaceC0213d) {
        this.f1072v = interfaceC0213d;
        if (getWindowToken() != null) {
            this.f1072v.mo127c(this.f1053c);
            int i = this.f1064n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0490o.m396p(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1060j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1061k) {
            this.f1061k = z;
            if (z) {
                return;
            }
            m1520t();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1515y();
        this.f1056f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m1515y();
        this.f1056f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m1515y();
        this.f1056f.mo1077o(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1059i = z;
        this.f1058h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    public void setWindowCallback(Window.Callback callback) {
        m1515y();
        this.f1056f.setWindowCallback(callback);
    }

    @Override // android.support.p002v7.widget.InterfaceC0246c0
    public void setWindowTitle(CharSequence charSequence) {
        m1515y();
        this.f1056f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    void m1520t() {
        removeCallbacks(this.f1076z);
        removeCallbacks(this.f1050A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1074x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: v */
    public boolean m1518v() {
        return this.f1059i;
    }

    /* renamed from: y */
    void m1515y() {
        if (this.f1054d == null) {
            this.f1054d = (ContentFrameLayout) findViewById(C0574f.action_bar_activity_content);
            this.f1055e = (ActionBarContainer) findViewById(C0574f.action_bar_container);
            this.f1056f = m1521s(findViewById(C0574f.action_bar));
        }
    }
}