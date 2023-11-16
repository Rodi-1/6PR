package android.support.p001v4.widget;

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
import p016o.C0467b;
import p016o.C0484i;
import p016o.C0487l;
import p016o.C0490o;
import p016o.InterfaceC0483h;
import p016o.InterfaceC0486k;
import p017p.C0518a;
import p017p.C0520c;

/* renamed from: android.support.v4.widget.NestedScrollView */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0486k, InterfaceC0483h {

    /* renamed from: B */
    private static final C0131a f623B = new C0131a();

    /* renamed from: C */
    private static final int[] f624C = {16843130};

    /* renamed from: A */
    private InterfaceC0132b f625A;

    /* renamed from: b */
    private long f626b;

    /* renamed from: c */
    private final Rect f627c;

    /* renamed from: d */
    private OverScroller f628d;

    /* renamed from: e */
    private EdgeEffect f629e;

    /* renamed from: f */
    private EdgeEffect f630f;

    /* renamed from: g */
    private int f631g;

    /* renamed from: h */
    private boolean f632h;

    /* renamed from: i */
    private boolean f633i;

    /* renamed from: j */
    private View f634j;

    /* renamed from: k */
    private boolean f635k;

    /* renamed from: l */
    private VelocityTracker f636l;

    /* renamed from: m */
    private boolean f637m;

    /* renamed from: n */
    private boolean f638n;

    /* renamed from: o */
    private int f639o;

    /* renamed from: p */
    private int f640p;

    /* renamed from: q */
    private int f641q;

    /* renamed from: r */
    private int f642r;

    /* renamed from: s */
    private final int[] f643s;

    /* renamed from: t */
    private final int[] f644t;

    /* renamed from: u */
    private int f645u;

    /* renamed from: v */
    private int f646v;

    /* renamed from: w */
    private C0133c f647w;

    /* renamed from: x */
    private final C0487l f648x;

    /* renamed from: y */
    private final C0484i f649y;

    /* renamed from: z */
    private float f650z;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0131a extends C0467b {
        C0131a() {
        }

        @Override // p016o.C0467b
        /* renamed from: d */
        public void mo468d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo468d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0520c.m300a(accessibilityEvent, nestedScrollView.getScrollX());
            C0520c.m299b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p016o.C0467b
        /* renamed from: e */
        public void mo467e(View view, C0518a c0518a) {
            int scrollRange;
            super.mo467e(view, c0518a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0518a.m305u(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0518a.m304v(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0518a.m325a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0518a.m325a(4096);
            }
        }

        @Override // p016o.C0467b
        /* renamed from: h */
        public boolean mo464h(View view, int i, Bundle bundle) {
            if (super.mo464h(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i == 4096) {
                    int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.m1809J(0, min);
                        return true;
                    }
                    return false;
                } else if (i != 8192) {
                    return false;
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.m1809J(0, max);
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0132b {
        /* renamed from: a */
        void mo1695a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public static class C0133c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0133c> CREATOR = new C0134a();

        /* renamed from: b */
        public int f651b;

        /* renamed from: android.support.v4.widget.NestedScrollView$c$a */
        /* loaded from: classes.dex */
        static class C0134a implements Parcelable.Creator<C0133c> {
            C0134a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0133c createFromParcel(Parcel parcel) {
                return new C0133c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0133c[] newArray(int i) {
                return new C0133c[i];
            }
        }

        C0133c(Parcel parcel) {
            super(parcel);
            this.f651b = parcel.readInt();
        }

        C0133c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f651b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f651b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f627c = new Rect();
        this.f632h = true;
        this.f633i = false;
        this.f634j = null;
        this.f635k = false;
        this.f638n = true;
        this.f642r = -1;
        this.f643s = new int[2];
        this.f644t = new int[2];
        m1789w();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f624C, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f648x = new C0487l(this);
        this.f649y = new C0484i(this);
        setNestedScrollingEnabled(true);
        C0490o.m395q(this, f623B);
    }

    /* renamed from: A */
    private boolean m1818A(View view, int i, int i2) {
        view.getDrawingRect(this.f627c);
        offsetDescendantRectToMyCoords(view, this.f627c);
        return this.f627c.bottom + i >= getScrollY() && this.f627c.top - i <= getScrollY() + i2;
    }

    /* renamed from: B */
    private void m1817B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f642r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f631g = (int) motionEvent.getY(i);
            this.f642r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f636l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: E */
    private void m1814E() {
        VelocityTracker velocityTracker = this.f636l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f636l = null;
        }
    }

    /* renamed from: F */
    private boolean m1813F(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m1796p = m1796p(z2, i2, i3);
        if (m1796p == null) {
            m1796p = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1800g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m1796p != findFocus()) {
            m1796p.requestFocus(i);
        }
        return z;
    }

    /* renamed from: G */
    private void m1812G(View view) {
        view.getDrawingRect(this.f627c);
        offsetDescendantRectToMyCoords(view, this.f627c);
        int m1803d = m1803d(this.f627c);
        if (m1803d != 0) {
            scrollBy(0, m1803d);
        }
    }

    /* renamed from: H */
    private boolean m1811H(Rect rect, boolean z) {
        int m1803d = m1803d(rect);
        boolean z2 = m1803d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m1803d);
            } else {
                m1810I(0, m1803d);
            }
        }
        return z2;
    }

    /* renamed from: b */
    private boolean m1805b() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    /* renamed from: c */
    private static int m1804c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: g */
    private void m1800g(int i) {
        if (i != 0) {
            if (this.f638n) {
                m1810I(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f650z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f650z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f650z;
    }

    /* renamed from: h */
    private void m1799h() {
        this.f635k = false;
        m1814E();
        m1807L(0);
        EdgeEffect edgeEffect = this.f629e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f630f.onRelease();
        }
    }

    /* renamed from: j */
    private void m1798j() {
        if (getOverScrollMode() == 2) {
            this.f629e = null;
            this.f630f = null;
        } else if (this.f629e == null) {
            Context context = getContext();
            this.f629e = new EdgeEffect(context);
            this.f630f = new EdgeEffect(context);
        }
    }

    /* renamed from: p */
    private View m1796p(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
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

    /* renamed from: r */
    private void m1794r(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        m1795q(i);
    }

    /* renamed from: u */
    private boolean m1791u(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    /* renamed from: v */
    private void m1790v() {
        VelocityTracker velocityTracker = this.f636l;
        if (velocityTracker == null) {
            this.f636l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: w */
    private void m1789w() {
        this.f628d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f639o = viewConfiguration.getScaledTouchSlop();
        this.f640p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f641q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: x */
    private void m1788x() {
        if (this.f636l == null) {
            this.f636l = VelocityTracker.obtain();
        }
    }

    /* renamed from: y */
    private boolean m1787y(View view) {
        return !m1818A(view, 0, getHeight());
    }

    /* renamed from: z */
    private static boolean m1786z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m1786z((View) parent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m1816C(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
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
            boolean r7 = r12.m1792t(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f628d
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.NestedScrollView.m1816C(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: D */
    public boolean m1815D(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f627c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f627c.top + height > childAt.getBottom()) {
                    this.f627c.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f627c.top = getScrollY() - height;
            Rect rect = this.f627c;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.f627c;
        int i2 = rect2.top;
        int i3 = height + i2;
        rect2.bottom = i3;
        return m1813F(i, i2, i3);
    }

    /* renamed from: I */
    public final void m1810I(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f626b > 250) {
            int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.f628d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
            C0490o.m399m(this);
        } else {
            if (!this.f628d.isFinished()) {
                this.f628d.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f626b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: J */
    public final void m1809J(int i, int i2) {
        m1810I(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: K */
    public boolean m1808K(int i, int i2) {
        return this.f649y.m424n(i, i2);
    }

    /* renamed from: L */
    public void m1807L(int i) {
        this.f649y.m422p(i);
    }

    /* renamed from: a */
    public boolean m1806a(int i) {
        int bottom;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1818A(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1800g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f627c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f627c);
            m1800g(m1803d(this.f627c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m1787y(findFocus)) {
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
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
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
        if (!this.f628d.computeScrollOffset()) {
            if (m1792t(1)) {
                m1807L(1);
            }
            this.f646v = 0;
            return;
        }
        this.f628d.getCurrX();
        int currY = this.f628d.getCurrY();
        int i = currY - this.f646v;
        if (m1802e(0, i, this.f644t, null, 1)) {
            i -= this.f644t[1];
        }
        int i2 = i;
        if (i2 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            m1816C(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!m1801f(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    m1798j();
                    if (currY <= 0 && scrollY > 0) {
                        edgeEffect = this.f629e;
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        edgeEffect = this.f630f;
                    }
                    edgeEffect.onAbsorb((int) this.f628d.getCurrVelocity());
                }
            }
        }
        this.f646v = currY;
        C0490o.m399m(this);
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

    /* renamed from: d */
    protected int m1803d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        int i2 = rect.bottom;
        if (i2 > i && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || i2 >= i) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1797o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f649y.m437a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f649y.m436b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f649y.m435c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f649y.m433e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f629e != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f629e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f629e.setSize(width, height);
                if (this.f629e.draw(canvas)) {
                    C0490o.m399m(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f630f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f630f.setSize(width2, height2);
            if (this.f630f.draw(canvas)) {
                C0490o.m399m(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean m1802e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f649y.m434d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: f */
    public boolean m1801f(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f649y.m432f(i, i2, i3, i4, iArr, i5);
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
        return this.f648x.m416a();
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
        return this.f649y.m430h();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f649y.m428j();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o */
    public boolean m1797o(KeyEvent keyEvent) {
        this.f627c.setEmpty();
        if (!m1805b()) {
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
                return !keyEvent.isAltPressed() ? m1806a(33) : m1793s(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? m1806a(130) : m1793s(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                m1815D(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f633i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f635k) {
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
        if (action == 2 && this.f635k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f642r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f631g) > this.f639o && (2 & getNestedScrollAxes()) == 0) {
                                this.f635k = true;
                                this.f631g = y;
                                m1788x();
                                this.f636l.addMovement(motionEvent);
                                this.f645u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1817B(motionEvent);
                    }
                }
            }
            this.f635k = false;
            this.f642r = -1;
            m1814E();
            if (this.f628d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0490o.m399m(this);
            }
            m1807L(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (m1791u((int) motionEvent.getX(), y2)) {
                this.f631g = y2;
                this.f642r = motionEvent.getPointerId(0);
                m1790v();
                this.f636l.addMovement(motionEvent);
                this.f628d.computeScrollOffset();
                this.f635k = !this.f628d.isFinished();
                m1808K(2, 0);
            } else {
                this.f635k = false;
                m1814E();
            }
        }
        return this.f635k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f632h = false;
        View view = this.f634j;
        if (view != null && m1786z(view, this)) {
            m1812G(this.f634j);
        }
        this.f634j = null;
        if (!this.f633i) {
            if (this.f647w != null) {
                scrollTo(getScrollX(), this.f647w.f651b);
                this.f647w = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f633i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f637m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1794r((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f648x.m415b(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || m1787y(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0133c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0133c c0133c = (C0133c) parcelable;
        super.onRestoreInstanceState(c0133c.getSuperState());
        this.f647w = c0133c;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0133c c0133c = new C0133c(super.onSaveInstanceState());
        c0133c.f651b = getScrollY();
        return c0133c;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0132b interfaceC0132b = this.f625A;
        if (interfaceC0132b != null) {
            interfaceC0132b.mo1695a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1818A(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f627c);
        offsetDescendantRectToMyCoords(findFocus, this.f627c);
        m1800g(m1803d(this.f627c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p016o.InterfaceC0486k
    public void onStopNestedScroll(View view) {
        this.f648x.m413d(view);
        stopNestedScroll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r23.f628d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        p016o.C0490o.m399m(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0216, code lost:
        if (r23.f628d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public void m1795q(int i) {
        if (getChildCount() > 0) {
            m1808K(2, 1);
            this.f628d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f646v = getScrollY();
            C0490o.m399m(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f632h) {
            this.f634j = view2;
        } else {
            m1812G(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1811H(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1814E();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f632h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public boolean m1793s(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f627c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f627c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.f627c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f627c;
        return m1813F(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int m1804c = m1804c(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int m1804c2 = m1804c(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (m1804c == getScrollX() && m1804c2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1804c, m1804c2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f637m) {
            this.f637m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f649y.m427k(z);
    }

    public void setOnScrollChangeListener(InterfaceC0132b interfaceC0132b) {
        this.f625A = interfaceC0132b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f638n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f649y.m425m(i);
    }

    @Override // android.view.View, p016o.InterfaceC0483h
    public void stopNestedScroll() {
        this.f649y.m423o();
    }

    /* renamed from: t */
    public boolean m1792t(int i) {
        return this.f649y.m429i(i);
    }
}