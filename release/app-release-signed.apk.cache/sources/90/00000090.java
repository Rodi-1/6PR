package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import o.o;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o.k, o.h {
    private static final a B = new a();
    private static final int[] C = {16843130};
    private b A;

    /* renamed from: b  reason: collision with root package name */
    private long f479b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f480c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f481d;

    /* renamed from: e  reason: collision with root package name */
    private EdgeEffect f482e;

    /* renamed from: f  reason: collision with root package name */
    private EdgeEffect f483f;

    /* renamed from: g  reason: collision with root package name */
    private int f484g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f485h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f486i;

    /* renamed from: j  reason: collision with root package name */
    private View f487j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f488k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f489l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f490m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f491n;

    /* renamed from: o  reason: collision with root package name */
    private int f492o;

    /* renamed from: p  reason: collision with root package name */
    private int f493p;

    /* renamed from: q  reason: collision with root package name */
    private int f494q;

    /* renamed from: r  reason: collision with root package name */
    private int f495r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f496s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f497t;

    /* renamed from: u  reason: collision with root package name */
    private int f498u;

    /* renamed from: v  reason: collision with root package name */
    private int f499v;

    /* renamed from: w  reason: collision with root package name */
    private c f500w;
    private final o.l x;
    private final o.i y;
    private float z;

    /* loaded from: classes.dex */
    static class a extends o.b {
        a() {
        }

        @Override // o.b
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            p.c.a(accessibilityEvent, nestedScrollView.getScrollX());
            p.c.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // o.b
        public void e(View view, p.a aVar) {
            int scrollRange;
            super.e(view, aVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            aVar.u(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            aVar.v(true);
            if (nestedScrollView.getScrollY() > 0) {
                aVar.a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                aVar.a(4096);
            }
        }

        @Override // o.b
        public boolean h(View view, int i2, Bundle bundle) {
            if (super.h(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i2 == 4096) {
                    int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.J(0, min);
                        return true;
                    }
                    return false;
                } else if (i2 != 8192) {
                    return false;
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.J(0, max);
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f501b;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f501b = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f501b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f501b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f480c = new Rect();
        this.f485h = true;
        this.f486i = false;
        this.f487j = null;
        this.f488k = false;
        this.f491n = true;
        this.f495r = -1;
        this.f496s = new int[2];
        this.f497t = new int[2];
        w();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new o.l(this);
        this.y = new o.i(this);
        setNestedScrollingEnabled(true);
        o.q(this, B);
    }

    private boolean A(View view, int i2, int i3) {
        view.getDrawingRect(this.f480c);
        offsetDescendantRectToMyCoords(view, this.f480c);
        return this.f480c.bottom + i2 >= getScrollY() && this.f480c.top - i2 <= getScrollY() + i3;
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f495r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f484g = (int) motionEvent.getY(i2);
            this.f495r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f489l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void E() {
        VelocityTracker velocityTracker = this.f489l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f489l = null;
        }
    }

    private boolean F(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z = false;
        boolean z2 = i2 == 33;
        View p2 = p(z2, i3, i4);
        if (p2 == null) {
            p2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            g(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        }
        if (p2 != findFocus()) {
            p2.requestFocus(i2);
        }
        return z;
    }

    private void G(View view) {
        view.getDrawingRect(this.f480c);
        offsetDescendantRectToMyCoords(view, this.f480c);
        int d2 = d(this.f480c);
        if (d2 != 0) {
            scrollBy(0, d2);
        }
    }

    private boolean H(Rect rect, boolean z) {
        int d2 = d(rect);
        boolean z2 = d2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, d2);
            } else {
                I(0, d2);
            }
        }
        return z2;
    }

    private boolean b() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    private static int c(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private void g(int i2) {
        if (i2 != 0) {
            if (this.f491n) {
                I(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    private void h() {
        this.f488k = false;
        E();
        L(0);
        EdgeEffect edgeEffect = this.f482e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f483f.onRelease();
        }
    }

    private void j() {
        if (getOverScrollMode() == 2) {
            this.f482e = null;
            this.f483f = null;
        } else if (this.f482e == null) {
            Context context = getContext();
            this.f482e = new EdgeEffect(context);
            this.f483f = new EdgeEffect(context);
        }
    }

    private View p(boolean z, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z3 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private void r(int i2) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i2 > 0) && (scrollY < getScrollRange() || i2 < 0);
        float f2 = i2;
        if (dispatchNestedPreFling(0.0f, f2)) {
            return;
        }
        dispatchNestedFling(0.0f, f2, z);
        q(i2);
    }

    private boolean u(int i2, int i3) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
        }
        return false;
    }

    private void v() {
        VelocityTracker velocityTracker = this.f489l;
        if (velocityTracker == null) {
            this.f489l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void w() {
        this.f481d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f492o = viewConfiguration.getScaledTouchSlop();
        this.f493p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f494q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void x() {
        if (this.f489l == null) {
            this.f489l = VelocityTracker.obtain();
        }
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean C(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.t(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f481d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.C(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean D(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        if (z) {
            this.f480c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f480c.top + height > childAt.getBottom()) {
                    this.f480c.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f480c.top = getScrollY() - height;
            Rect rect = this.f480c;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.f480c;
        int i3 = rect2.top;
        int i4 = height + i3;
        rect2.bottom = i4;
        return F(i2, i3, i4);
    }

    public final void I(int i2, int i3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f479b > 250) {
            int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.f481d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, max)) - scrollY);
            o.m(this);
        } else {
            if (!this.f481d.isFinished()) {
                this.f481d.abortAnimation();
            }
            scrollBy(i2, i3);
        }
        this.f479b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void J(int i2, int i3) {
        I(i2 - getScrollX(), i3 - getScrollY());
    }

    public boolean K(int i2, int i3) {
        return this.y.n(i2, i3);
    }

    public void L(int i2) {
        this.y.p(i2);
    }

    public boolean a(int i2) {
        int bottom;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f480c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f480c);
            g(d(this.f480c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && y(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f481d.computeScrollOffset()) {
            if (t(1)) {
                L(1);
            }
            this.f499v = 0;
            return;
        }
        this.f481d.getCurrX();
        int currY = this.f481d.getCurrY();
        int i2 = currY - this.f499v;
        if (e(0, i2, this.f497t, null, 1)) {
            i2 -= this.f497t[1];
        }
        int i3 = i2;
        if (i3 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            C(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!f(0, scrollY2, 0, i3 - scrollY2, null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    j();
                    if (currY <= 0 && scrollY > 0) {
                        edgeEffect = this.f482e;
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        edgeEffect = this.f483f;
                    }
                    edgeEffect.onAbsorb((int) this.f481d.getCurrVelocity());
                }
            }
        }
        this.f499v = currY;
        o.m(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    protected int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.y.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.y.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.y.c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.y.e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f482e != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f482e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f482e.setSize(width, height);
                if (this.f482e.draw(canvas)) {
                    o.m(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f483f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (i4 >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f483f.setSize(width2, height2);
            if (this.f483f.draw(canvas)) {
                o.m(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public boolean e(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.y.d(i2, i3, iArr, iArr2, i4);
    }

    public boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return this.y.f(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.y.h();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.y.j();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean o(KeyEvent keyEvent) {
        this.f480c.setEmpty();
        if (!b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? a(33) : s(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? a(130) : s(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                D(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f486i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f488k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f488k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f495r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f484g) > this.f492o && (2 & getNestedScrollAxes()) == 0) {
                                this.f488k = true;
                                this.f484g = y;
                                x();
                                this.f489l.addMovement(motionEvent);
                                this.f498u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        B(motionEvent);
                    }
                }
            }
            this.f488k = false;
            this.f495r = -1;
            E();
            if (this.f481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                o.m(this);
            }
            L(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (u((int) motionEvent.getX(), y2)) {
                this.f484g = y2;
                this.f495r = motionEvent.getPointerId(0);
                v();
                this.f489l.addMovement(motionEvent);
                this.f481d.computeScrollOffset();
                this.f488k = !this.f481d.isFinished();
                K(2, 0);
            } else {
                this.f488k = false;
                E();
            }
        }
        return this.f488k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f485h = false;
        View view = this.f487j;
        if (view != null && z(view, this)) {
            G(this.f487j);
        }
        this.f487j = null;
        if (!this.f486i) {
            if (this.f500w != null) {
                scrollTo(getScrollX(), this.f500w.f501b);
                this.f500w = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i5 - i3) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f486i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f490m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        r((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        dispatchNestedPreScroll(i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.x.b(view, view2, i2);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i2) : focusFinder.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || y(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f500w = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f501b = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !A(findFocus, 0, i5)) {
            return;
        }
        findFocus.getDrawingRect(this.f480c);
        offsetDescendantRectToMyCoords(findFocus, this.f480c);
        g(d(this.f480c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.k
    public void onStopNestedScroll(View view) {
        this.x.d(view);
        stopNestedScroll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r23.f481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        o.o.m(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0216, code lost:
        if (r23.f481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void q(int i2) {
        if (getChildCount() > 0) {
            K(2, 1);
            this.f481d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f499v = getScrollY();
            o.m(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f485h) {
            this.f487j = view2;
        } else {
            G(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return H(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            E();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f485h = true;
        super.requestLayout();
    }

    public boolean s(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f480c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f480c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.f480c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f480c;
        return F(i2, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int c2 = c(i2, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int c3 = c(i3, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (c2 == getScrollX() && c3 == getScrollY()) {
                return;
            }
            super.scrollTo(c2, c3);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f490m) {
            this.f490m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.y.k(z);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f491n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.y.m(i2);
    }

    @Override // android.view.View, o.h
    public void stopNestedScroll() {
        this.y.o();
    }

    public boolean t(int i2) {
        return this.y.i(i2);
    }
}