package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f1007b;

    /* renamed from: c  reason: collision with root package name */
    private int f1008c;

    /* renamed from: d  reason: collision with root package name */
    private int f1009d;

    /* renamed from: e  reason: collision with root package name */
    private int f1010e;

    /* renamed from: f  reason: collision with root package name */
    private int f1011f;

    /* renamed from: g  reason: collision with root package name */
    private int f1012g;

    /* renamed from: h  reason: collision with root package name */
    private Field f1013h;

    /* renamed from: i  reason: collision with root package name */
    private b f1014i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1015j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1016k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1017l;

    /* renamed from: m  reason: collision with root package name */
    private o.s f1018m;

    /* renamed from: n  reason: collision with root package name */
    private android.support.v4.widget.h f1019n;

    /* renamed from: o  reason: collision with root package name */
    private c f1020o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends u.a {

        /* renamed from: c  reason: collision with root package name */
        private boolean f1021c;

        b(Drawable drawable) {
            super(drawable);
            this.f1021c = true;
        }

        void c(boolean z) {
            this.f1021c = z;
        }

        @Override // u.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1021c) {
                super.draw(canvas);
            }
        }

        @Override // u.a, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1021c) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // u.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1021c) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // u.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1021c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // u.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1021c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private c() {
        }

        public void a() {
            f0.this.f1020o = null;
            f0.this.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.f1020o = null;
            f0.this.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(Context context, boolean z) {
        super(context, null, s.a.dropDownListViewStyle);
        this.f1007b = new Rect();
        this.f1008c = 0;
        this.f1009d = 0;
        this.f1010e = 0;
        this.f1011f = 0;
        this.f1016k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1013h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void b() {
        this.f1017l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1012g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        o.s sVar = this.f1018m;
        if (sVar != null) {
            sVar.b();
            this.f1018m = null;
        }
    }

    private void c(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void d(Canvas canvas) {
        Drawable selector;
        if (this.f1007b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1007b);
        selector.draw(canvas);
    }

    private void g(int i2, View view) {
        Rect rect = this.f1007b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1008c;
        rect.top -= this.f1009d;
        rect.right += this.f1010e;
        rect.bottom += this.f1011f;
        try {
            boolean z = this.f1013h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1013h.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void h(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i2 == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        g(i2, view);
        if (z) {
            Rect rect = this.f1007b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            j.a.j(selector, exactCenterX, exactCenterY);
        }
    }

    private void i(int i2, View view, float f2, float f3) {
        h(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        j.a.j(selector, f2, f3);
    }

    private void j(View view, int i2, float f2, float f3) {
        View childAt;
        this.f1017l = true;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f1012g;
        if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1012g = i2;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (i3 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean k() {
        return this.f1017l;
    }

    private void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        b bVar = this.f1014i;
        if (bVar != null) {
            bVar.c(z);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        d(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1020o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        l();
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i2, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || i7 == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
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
            r7.j(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.c(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.b()
        L4d:
            if (r3 == 0) goto L65
            android.support.v4.widget.h r9 = r7.f1019n
            if (r9 != 0) goto L5a
            android.support.v4.widget.h r9 = new android.support.v4.widget.h
            r9.<init>(r7)
            r7.f1019n = r9
        L5a:
            android.support.v4.widget.h r9 = r7.f1019n
            r9.m(r2)
            android.support.v4.widget.h r9 = r7.f1019n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            android.support.v4.widget.h r8 = r7.f1019n
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.f0.f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1016k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1016k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1016k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1016k && this.f1015j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1020o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1020o == null) {
            c cVar = new c();
            this.f1020o = cVar;
            cVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1012g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        c cVar = this.f1020o;
        if (cVar != null) {
            cVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1015j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        b bVar = drawable != null ? new b(drawable) : null;
        this.f1014i = bVar;
        super.setSelector(bVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1008c = rect.left;
        this.f1009d = rect.top;
        this.f1010e = rect.right;
        this.f1011f = rect.bottom;
    }
}