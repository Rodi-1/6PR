package android.support.v7.widget;

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

/* loaded from: classes.dex */
public class x extends Spinner implements o.n {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1228j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final f f1229b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1230c;

    /* renamed from: d  reason: collision with root package name */
    private h0 f1231d;

    /* renamed from: e  reason: collision with root package name */
    private SpinnerAdapter f1232e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1233f;

    /* renamed from: g  reason: collision with root package name */
    private c f1234g;

    /* renamed from: h  reason: collision with root package name */
    private int f1235h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f1236i;

    /* loaded from: classes.dex */
    class a extends h0 {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f1237k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, c cVar) {
            super(view);
            this.f1237k = cVar;
        }

        @Override // android.support.v7.widget.h0
        public w.h b() {
            return this.f1237k;
        }

        @Override // android.support.v7.widget.h0
        public boolean c() {
            if (x.this.f1234g.c()) {
                return true;
            }
            x.this.f1234g.f();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private SpinnerAdapter f1239b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f1240c;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1239b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1240c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof r0) {
                    r0 r0Var = (r0) spinnerAdapter;
                    if (r0Var.getDropDownViewTheme() == null) {
                        r0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1240c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1240c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1239b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends j0 {
        private CharSequence L;
        ListAdapter M;
        private final Rect N;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ x f1241b;

            a(x xVar) {
                this.f1241b = xVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                x.this.setSelection(i2);
                if (x.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    x.this.performItemClick(view, i2, cVar.M.getItemId(i2));
                }
                c.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.M(x.this)) {
                    c.this.dismiss();
                    return;
                }
                c.this.K();
                c.super.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.x$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0011c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1244b;

            C0011c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1244b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1244b);
                }
            }
        }

        public c(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.N = new Rect();
            s(x.this);
            A(true);
            F(0);
            C(new a(x.this));
        }

        void K() {
            int i2;
            Drawable j2 = j();
            int i3 = 0;
            if (j2 != null) {
                j2.getPadding(x.this.f1236i);
                i3 = b1.b(x.this) ? x.this.f1236i.right : -x.this.f1236i.left;
            } else {
                Rect rect = x.this.f1236i;
                x.this.f1236i.right = 0;
                rect.left = 0;
            }
            int paddingLeft = x.this.getPaddingLeft();
            int paddingRight = x.this.getPaddingRight();
            int width = x.this.getWidth();
            if (x.this.f1235h == -2) {
                int d2 = x.this.d((SpinnerAdapter) this.M, j());
                int i4 = (x.this.getContext().getResources().getDisplayMetrics().widthPixels - x.this.f1236i.left) - x.this.f1236i.right;
                if (d2 > i4) {
                    d2 = i4;
                }
                i2 = Math.max(d2, (width - paddingLeft) - paddingRight);
            } else {
                i2 = x.this.f1235h == -1 ? (width - paddingLeft) - paddingRight : x.this.f1235h;
            }
            v(i2);
            y(b1.b(x.this) ? i3 + ((width - paddingRight) - n()) : i3 + paddingLeft);
        }

        public CharSequence L() {
            return this.L;
        }

        boolean M(View view) {
            return o.o.j(view) && view.getGlobalVisibleRect(this.N);
        }

        public void N(CharSequence charSequence) {
            this.L = charSequence;
        }

        @Override // android.support.v7.widget.j0, w.h
        public void f() {
            ViewTreeObserver viewTreeObserver;
            boolean c2 = c();
            K();
            z(2);
            super.f();
            d().setChoiceMode(1);
            G(x.this.getSelectedItemPosition());
            if (c2 || (viewTreeObserver = x.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            B(new C0011c(bVar));
        }

        @Override // android.support.v7.widget.j0
        public void r(ListAdapter listAdapter) {
            super.r(listAdapter);
            this.M = listAdapter;
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.spinnerStyle);
    }

    public x(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public x(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
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
    public x(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f1236i = r0
            int[] r0 = s.j.W1
            r1 = 0
            android.support.v7.widget.v0 r0 = android.support.v7.widget.v0.t(r8, r9, r0, r10, r1)
            android.support.v7.widget.f r2 = new android.support.v7.widget.f
            r2.<init>(r7)
            r7.f1229b = r2
            r2 = 0
            if (r12 == 0) goto L23
            v.d r3 = new v.d
            r3.<init>(r8, r12)
        L20:
            r7.f1230c = r3
            goto L3c
        L23:
            int r12 = s.j.b2
            int r12 = r0.m(r12, r1)
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
            r7.f1230c = r12
        L3c:
            android.content.Context r12 = r7.f1230c
            r3 = 1
            if (r12 == 0) goto La8
            r12 = -1
            if (r11 != r12) goto L70
            int[] r12 = android.support.v7.widget.x.f1228j     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
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
            android.content.Context r12 = r7.f1230c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f1230c
            int[] r4 = s.j.W1
            android.support.v7.widget.v0 r12 = android.support.v7.widget.v0.t(r12, r9, r4, r10, r1)
            int r1 = s.j.a2
            r4 = -2
            int r1 = r12.l(r1, r4)
            r7.f1235h = r1
            int r1 = s.j.Y1
            android.graphics.drawable.Drawable r1 = r12.f(r1)
            r11.u(r1)
            int r1 = s.j.Z1
            java.lang.String r1 = r0.n(r1)
            r11.N(r1)
            r12.u()
            r7.f1234g = r11
            android.support.v7.widget.x$a r12 = new android.support.v7.widget.x$a
            r12.<init>(r7, r11)
            r7.f1231d = r12
        La8:
            int r11 = s.j.X1
            java.lang.CharSequence[] r11 = r0.p(r11)
            if (r11 == 0) goto Lc0
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = s.g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc0:
            r0.u()
            r7.f1233f = r3
            android.widget.SpinnerAdapter r8 = r7.f1232e
            if (r8 == 0) goto Lce
            r7.setAdapter(r8)
            r7.f1232e = r2
        Lce:
            android.support.v7.widget.f r8 = r7.f1229b
            r8.e(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int d(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1236i);
            Rect rect = this.f1236i;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1229b;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        c cVar = this.f1234g;
        return cVar != null ? cVar.k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        c cVar = this.f1234g;
        return cVar != null ? cVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1234g != null ? this.f1235h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        c cVar = this.f1234g;
        return cVar != null ? cVar.j() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1234g != null) {
            return this.f1230c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        c cVar = this.f1234g;
        return cVar != null ? cVar.L() : super.getPrompt();
    }

    @Override // o.n
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1229b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // o.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1229b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1234g;
        if (cVar == null || !cVar.c()) {
            return;
        }
        this.f1234g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1234g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f1231d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        c cVar = this.f1234g;
        if (cVar != null) {
            if (cVar.c()) {
                return true;
            }
            this.f1234g.f();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1233f) {
            this.f1232e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1234g != null) {
            Context context = this.f1230c;
            if (context == null) {
                context = getContext();
            }
            this.f1234g.r(new b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1229b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.f1229b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        c cVar = this.f1234g;
        if (cVar != null) {
            cVar.y(i2);
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        c cVar = this.f1234g;
        if (cVar != null) {
            cVar.H(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f1234g != null) {
            this.f1235h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        c cVar = this.f1234g;
        if (cVar != null) {
            cVar.u(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(t.b.d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        c cVar = this.f1234g;
        if (cVar != null) {
            cVar.N(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1229b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1229b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }
}