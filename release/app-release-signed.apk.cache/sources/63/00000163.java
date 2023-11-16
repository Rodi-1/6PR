package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p016o.C0490o;
import p016o.InterfaceC0489n;
import p020s.C0569a;
import p021t.C0580b;
import p024w.InterfaceC0610h;

/* renamed from: android.support.v7.widget.x */
/* loaded from: classes.dex */
public class C0321x extends Spinner implements InterfaceC0489n {

    /* renamed from: j */
    private static final int[] f1536j = {16843505};

    /* renamed from: b */
    private final C0259f f1537b;

    /* renamed from: c */
    private final Context f1538c;

    /* renamed from: d */
    private AbstractView$OnTouchListenerC0268h0 f1539d;

    /* renamed from: e */
    private SpinnerAdapter f1540e;

    /* renamed from: f */
    private final boolean f1541f;

    /* renamed from: g */
    private C0324c f1542g;

    /* renamed from: h */
    private int f1543h;

    /* renamed from: i */
    private final Rect f1544i;

    /* renamed from: android.support.v7.widget.x$a */
    /* loaded from: classes.dex */
    class C0322a extends AbstractView$OnTouchListenerC0268h0 {

        /* renamed from: k */
        final /* synthetic */ C0324c f1545k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0322a(View view, C0324c c0324c) {
            super(view);
            this.f1545k = c0324c;
        }

        @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
        /* renamed from: b */
        public InterfaceC0610h mo1061b() {
            return this.f1545k;
        }

        @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
        /* renamed from: c */
        public boolean mo1060c() {
            if (C0321x.this.f1542g.mo3c()) {
                return true;
            }
            C0321x.this.f1542g.mo1f();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.x$b */
    /* loaded from: classes.dex */
    public static class C0323b implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        private SpinnerAdapter f1547b;

        /* renamed from: c */
        private ListAdapter f1548c;

        public C0323b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1547b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1548c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof InterfaceC0308r0) {
                    InterfaceC0308r0 interfaceC0308r0 = (InterfaceC0308r0) spinnerAdapter;
                    if (interfaceC0308r0.getDropDownViewTheme() == null) {
                        interfaceC0308r0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1548c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1548c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1547b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.x$c */
    /* loaded from: classes.dex */
    public class C0324c extends C0275j0 {

        /* renamed from: L */
        private CharSequence f1549L;

        /* renamed from: M */
        ListAdapter f1550M;

        /* renamed from: N */
        private final Rect f1551N;

        /* renamed from: android.support.v7.widget.x$c$a */
        /* loaded from: classes.dex */
        class C0325a implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ C0321x f1553b;

            C0325a(C0321x c0321x) {
                this.f1553b = c0321x;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0321x.this.setSelection(i);
                if (C0321x.this.getOnItemClickListener() != null) {
                    C0324c c0324c = C0324c.this;
                    C0321x.this.performItemClick(view, i, c0324c.f1550M.getItemId(i));
                }
                C0324c.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.x$c$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0326b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0326b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0324c c0324c = C0324c.this;
                if (!c0324c.m1056M(C0321x.this)) {
                    C0324c.this.dismiss();
                    return;
                }
                C0324c.this.m1058K();
                C0324c.super.mo1f();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.x$c$c */
        /* loaded from: classes.dex */
        public class C0327c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1556b;

            C0327c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1556b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0321x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1556b);
                }
            }
        }

        public C0324c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1551N = new Rect();
            m1239s(C0321x.this);
            m1259A(true);
            m1254F(0);
            m1257C(new C0325a(C0321x.this));
        }

        /* renamed from: K */
        void m1058K() {
            int i;
            Drawable m1247j = m1247j();
            int i2 = 0;
            if (m1247j != null) {
                m1247j.getPadding(C0321x.this.f1544i);
                i2 = C0244b1.m1369b(C0321x.this) ? C0321x.this.f1544i.right : -C0321x.this.f1544i.left;
            } else {
                Rect rect = C0321x.this.f1544i;
                C0321x.this.f1544i.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0321x.this.getPaddingLeft();
            int paddingRight = C0321x.this.getPaddingRight();
            int width = C0321x.this.getWidth();
            if (C0321x.this.f1543h == -2) {
                int m1062d = C0321x.this.m1062d((SpinnerAdapter) this.f1550M, m1247j());
                int i3 = (C0321x.this.getContext().getResources().getDisplayMetrics().widthPixels - C0321x.this.f1544i.left) - C0321x.this.f1544i.right;
                if (m1062d > i3) {
                    m1062d = i3;
                }
                i = Math.max(m1062d, (width - paddingLeft) - paddingRight);
            } else {
                i = C0321x.this.f1543h == -1 ? (width - paddingLeft) - paddingRight : C0321x.this.f1543h;
            }
            m1236v(i);
            m1233y(C0244b1.m1369b(C0321x.this) ? i2 + ((width - paddingRight) - m1243n()) : i2 + paddingLeft);
        }

        /* renamed from: L */
        public CharSequence m1057L() {
            return this.f1549L;
        }

        /* renamed from: M */
        boolean m1056M(View view) {
            return C0490o.m402j(view) && view.getGlobalVisibleRect(this.f1551N);
        }

        /* renamed from: N */
        public void m1055N(CharSequence charSequence) {
            this.f1549L = charSequence;
        }

        @Override // android.support.p002v7.widget.C0275j0, p024w.InterfaceC0610h
        /* renamed from: f */
        public void mo1f() {
            ViewTreeObserver viewTreeObserver;
            boolean mo3c = mo3c();
            m1058K();
            m1232z(2);
            super.mo1f();
            mo2d().setChoiceMode(1);
            m1253G(C0321x.this.getSelectedItemPosition());
            if (mo3c || (viewTreeObserver = C0321x.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC0326b viewTreeObserver$OnGlobalLayoutListenerC0326b = new ViewTreeObserver$OnGlobalLayoutListenerC0326b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0326b);
            m1258B(new C0327c(viewTreeObserver$OnGlobalLayoutListenerC0326b));
        }

        @Override // android.support.p002v7.widget.C0275j0
        /* renamed from: r */
        public void mo1054r(ListAdapter listAdapter) {
            super.mo1054r(listAdapter);
            this.f1550M = listAdapter;
        }
    }

    public C0321x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.spinnerStyle);
    }

    public C0321x(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0321x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r12 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.support.v7.widget.x, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0321x(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f1544i = r0
            int[] r0 = p020s.C0578j.f2511W1
            r1 = 0
            android.support.v7.widget.v0 r0 = android.support.p002v7.widget.C0316v0.m1108t(r8, r9, r0, r10, r1)
            android.support.v7.widget.f r2 = new android.support.v7.widget.f
            r2.<init>(r7)
            r7.f1537b = r2
            r2 = 0
            if (r12 == 0) goto L23
            v.d r3 = new v.d
            r3.<init>(r8, r12)
        L20:
            r7.f1538c = r3
            goto L3c
        L23:
            int r12 = p020s.C0578j.f2533b2
            int r12 = r0.m1115m(r12, r1)
            if (r12 == 0) goto L31
            v.d r3 = new v.d
            r3.<init>(r8, r12)
            goto L20
        L31:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L39
            r12 = r8
            goto L3a
        L39:
            r12 = r2
        L3a:
            r7.f1538c = r12
        L3c:
            android.content.Context r12 = r7.f1538c
            r3 = 1
            if (r12 == 0) goto La8
            r12 = -1
            if (r11 != r12) goto L70
            int[] r12 = android.support.p002v7.widget.C0321x.f1536j     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            boolean r4 = r12.hasValue(r1)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L68
            if (r4 == 0) goto L54
            int r11 = r12.getInt(r1, r1)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L68
        L54:
            r12.recycle()
            goto L70
        L58:
            r4 = move-exception
            goto L5e
        L5a:
            r8 = move-exception
            goto L6a
        L5c:
            r4 = move-exception
            r12 = r2
        L5e:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: java.lang.Throwable -> L68
            if (r12 == 0) goto L70
            goto L54
        L68:
            r8 = move-exception
            r2 = r12
        L6a:
            if (r2 == 0) goto L6f
            r2.recycle()
        L6f:
            throw r8
        L70:
            if (r11 != r3) goto La8
            android.support.v7.widget.x$c r11 = new android.support.v7.widget.x$c
            android.content.Context r12 = r7.f1538c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f1538c
            int[] r4 = p020s.C0578j.f2511W1
            android.support.v7.widget.v0 r12 = android.support.p002v7.widget.C0316v0.m1108t(r12, r9, r4, r10, r1)
            int r1 = p020s.C0578j.f2528a2
            r4 = -2
            int r1 = r12.m1116l(r1, r4)
            r7.f1543h = r1
            int r1 = p020s.C0578j.f2519Y1
            android.graphics.drawable.Drawable r1 = r12.m1122f(r1)
            r11.m1237u(r1)
            int r1 = p020s.C0578j.f2523Z1
            java.lang.String r1 = r0.m1114n(r1)
            r11.m1055N(r1)
            r12.m1107u()
            r7.f1542g = r11
            android.support.v7.widget.x$a r12 = new android.support.v7.widget.x$a
            r12.<init>(r7, r11)
            r7.f1539d = r12
        La8:
            int r11 = p020s.C0578j.f2515X1
            java.lang.CharSequence[] r11 = r0.m1112p(r11)
            if (r11 == 0) goto Lc0
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p020s.C0575g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc0:
            r0.m1107u()
            r7.f1541f = r3
            android.widget.SpinnerAdapter r8 = r7.f1540e
            if (r8 == 0) goto Lce
            r7.setAdapter(r8)
            r7.f1540e = r2
        Lce:
            android.support.v7.widget.f r8 = r7.f1537b
            r8.m1316e(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0321x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: d */
    int m1062d(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1544i);
            Rect rect = this.f1544i;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            c0259f.m1319b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        C0324c c0324c = this.f1542g;
        return c0324c != null ? c0324c.m1246k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        C0324c c0324c = this.f1542g;
        return c0324c != null ? c0324c.m1244m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1542g != null ? this.f1543h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        C0324c c0324c = this.f1542g;
        return c0324c != null ? c0324c.m1247j() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1542g != null) {
            return this.f1538c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        C0324c c0324c = this.f1542g;
        return c0324c != null ? c0324c.m1057L() : super.getPrompt();
    }

    @Override // p016o.InterfaceC0489n
    public ColorStateList getSupportBackgroundTintList() {
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            return c0259f.m1318c();
        }
        return null;
    }

    @Override // p016o.InterfaceC0489n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            return c0259f.m1317d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0324c c0324c = this.f1542g;
        if (c0324c == null || !c0324c.mo3c()) {
            return;
        }
        this.f1542g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1542g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1062d(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0268h0 abstractView$OnTouchListenerC0268h0 = this.f1539d;
        if (abstractView$OnTouchListenerC0268h0 == null || !abstractView$OnTouchListenerC0268h0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        C0324c c0324c = this.f1542g;
        if (c0324c != null) {
            if (c0324c.mo3c()) {
                return true;
            }
            this.f1542g.mo1f();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1541f) {
            this.f1540e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1542g != null) {
            Context context = this.f1538c;
            if (context == null) {
                context = getContext();
            }
            this.f1542g.mo1054r(new C0323b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            c0259f.m1315f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            c0259f.m1314g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        C0324c c0324c = this.f1542g;
        if (c0324c != null) {
            c0324c.m1233y(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        C0324c c0324c = this.f1542g;
        if (c0324c != null) {
            c0324c.m1252H(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1542g != null) {
            this.f1543h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0324c c0324c = this.f1542g;
        if (c0324c != null) {
            c0324c.m1237u(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0580b.m98d(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        C0324c c0324c = this.f1542g;
        if (c0324c != null) {
            c0324c.m1055N(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            c0259f.m1312i(colorStateList);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0259f c0259f = this.f1537b;
        if (c0259f != null) {
            c0259f.m1311j(mode);
        }
    }
}