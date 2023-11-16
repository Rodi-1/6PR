package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.widget.C0155h;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p011j.C0413a;
import p016o.C0511s;
import p020s.C0569a;
import p022u.C0583a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.f0 */
/* loaded from: classes.dex */
public class C0260f0 extends ListView {

    /* renamed from: b */
    private final Rect f1295b;

    /* renamed from: c */
    private int f1296c;

    /* renamed from: d */
    private int f1297d;

    /* renamed from: e */
    private int f1298e;

    /* renamed from: f */
    private int f1299f;

    /* renamed from: g */
    private int f1300g;

    /* renamed from: h */
    private Field f1301h;

    /* renamed from: i */
    private C0262b f1302i;

    /* renamed from: j */
    private boolean f1303j;

    /* renamed from: k */
    private boolean f1304k;

    /* renamed from: l */
    private boolean f1305l;

    /* renamed from: m */
    private C0511s f1306m;

    /* renamed from: n */
    private C0155h f1307n;

    /* renamed from: o */
    private RunnableC0263c f1308o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.f0$b */
    /* loaded from: classes.dex */
    public static class C0262b extends C0583a {

        /* renamed from: c */
        private boolean f1309c;

        C0262b(Drawable drawable) {
            super(drawable);
            this.f1309c = true;
        }

        /* renamed from: c */
        void m1299c(boolean z) {
            this.f1309c = z;
        }

        @Override // p022u.C0583a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1309c) {
                super.draw(canvas);
            }
        }

        @Override // p022u.C0583a, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1309c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p022u.C0583a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1309c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p022u.C0583a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1309c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p022u.C0583a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1309c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.f0$c */
    /* loaded from: classes.dex */
    public class RunnableC0263c implements Runnable {
        private RunnableC0263c() {
        }

        /* renamed from: a */
        public void m1298a() {
            C0260f0.this.f1308o = null;
            C0260f0.this.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1297b() {
            C0260f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0260f0.this.f1308o = null;
            C0260f0.this.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0260f0(Context context, boolean z) {
        super(context, null, C0569a.dropDownListViewStyle);
        this.f1295b = new Rect();
        this.f1296c = 0;
        this.f1297d = 0;
        this.f1298e = 0;
        this.f1299f = 0;
        this.f1304k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1301h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1308b() {
        this.f1305l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1300g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0511s c0511s = this.f1306m;
        if (c0511s != null) {
            c0511s.m343b();
            this.f1306m = null;
        }
    }

    /* renamed from: c */
    private void m1307c(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: d */
    private void m1306d(Canvas canvas) {
        Drawable selector;
        if (this.f1295b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1295b);
        selector.draw(canvas);
    }

    /* renamed from: g */
    private void m1305g(int i, View view) {
        Rect rect = this.f1295b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1296c;
        rect.top -= this.f1297d;
        rect.right += this.f1298e;
        rect.bottom += this.f1299f;
        try {
            boolean z = this.f1301h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1301h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m1304h(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m1305g(i, view);
        if (z) {
            Rect rect = this.f1295b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0413a.m624j(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: i */
    private void m1303i(int i, View view, float f, float f2) {
        m1304h(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0413a.m624j(selector, f, f2);
    }

    /* renamed from: j */
    private void m1302j(View view, int i, float f, float f2) {
        View childAt;
        this.f1305l = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1300g;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1300g = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1303i(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: k */
    private boolean m1301k() {
        return this.f1305l;
    }

    /* renamed from: l */
    private void m1300l() {
        Drawable selector = getSelector();
        if (selector != null && m1301k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0262b c0262b = this.f1302i;
        if (c0262b != null) {
            c0262b.m1299c(z);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1306d(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1308o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1300l();
    }

    /* renamed from: e */
    public int mo1190e(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1189f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1302j(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m1307c(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m1308b()
        L4d:
            if (r3 == 0) goto L65
            android.support.v4.widget.h r9 = r7.f1307n
            if (r9 != 0) goto L5a
            android.support.v4.widget.h r9 = new android.support.v4.widget.h
            r9.<init>(r7)
            r7.f1307n = r9
        L5a:
            android.support.v4.widget.h r9 = r7.f1307n
            r9.m1774m(r2)
            android.support.v4.widget.h r9 = r7.f1307n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            android.support.v4.widget.h r8 = r7.f1307n
            if (r8 == 0) goto L6c
            r8.m1774m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0260f0.mo1189f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1304k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1304k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1304k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1304k && this.f1303j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1308o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1308o == null) {
            RunnableC0263c runnableC0263c = new RunnableC0263c();
            this.f1308o = runnableC0263c;
            runnableC0263c.m1297b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1300l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1300g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0263c runnableC0263c = this.f1308o;
        if (runnableC0263c != null) {
            runnableC0263c.m1298a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1303j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0262b c0262b = drawable != null ? new C0262b(drawable) : null;
        this.f1302i = c0262b;
        super.setSelector(c0262b);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1296c = rect.left;
        this.f1297d = rect.top;
        this.f1298e = rect.right;
        this.f1299f = rect.bottom;
    }
}