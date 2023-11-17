package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 implements w.h {
    private static Method I;
    private static Method J;
    private static Method K;
    private final e A;
    private final c B;
    private Runnable C;
    final Handler D;
    private final Rect E;
    private Rect F;
    private boolean G;
    PopupWindow H;

    /* renamed from: b  reason: collision with root package name */
    private Context f1062b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f1063c;

    /* renamed from: d  reason: collision with root package name */
    f0 f1064d;

    /* renamed from: e  reason: collision with root package name */
    private int f1065e;

    /* renamed from: f  reason: collision with root package name */
    private int f1066f;

    /* renamed from: g  reason: collision with root package name */
    private int f1067g;

    /* renamed from: h  reason: collision with root package name */
    private int f1068h;

    /* renamed from: i  reason: collision with root package name */
    private int f1069i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1070j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1071k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1072l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1073m;

    /* renamed from: n  reason: collision with root package name */
    private int f1074n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1075o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1076p;

    /* renamed from: q  reason: collision with root package name */
    int f1077q;

    /* renamed from: r  reason: collision with root package name */
    private View f1078r;

    /* renamed from: s  reason: collision with root package name */
    private int f1079s;

    /* renamed from: t  reason: collision with root package name */
    private DataSetObserver f1080t;

    /* renamed from: u  reason: collision with root package name */
    private View f1081u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f1082v;

    /* renamed from: w  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1083w;
    private AdapterView.OnItemSelectedListener x;
    final g y;
    private final f z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View i2 = j0.this.i();
            if (i2 == null || i2.getWindowToken() == null) {
                return;
            }
            j0.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            f0 f0Var;
            if (i2 == -1 || (f0Var = j0.this.f1064d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.c()) {
                j0.this.f();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || j0.this.o() || j0.this.H.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.D.removeCallbacks(j0Var.y);
            j0.this.y.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.H) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.H.getWidth() && y >= 0 && y < j0.this.H.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.D.postDelayed(j0Var.y, 250L);
                return false;
            } else if (action == 1) {
                j0 j0Var2 = j0.this;
                j0Var2.D.removeCallbacks(j0Var2.y);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f1064d;
            if (f0Var == null || !o.o.j(f0Var) || j0.this.f1064d.getCount() <= j0.this.f1064d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f1064d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.f1077q) {
                j0Var.H.setInputMethodMode(2);
                j0.this.f();
            }
        }
    }

    static {
        try {
            I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1065e = -2;
        this.f1066f = -2;
        this.f1069i = 1002;
        this.f1071k = true;
        this.f1074n = 0;
        this.f1075o = false;
        this.f1076p = false;
        this.f1077q = Integer.MAX_VALUE;
        this.f1079s = 0;
        this.y = new g();
        this.z = new f();
        this.A = new e();
        this.B = new c();
        this.E = new Rect();
        this.f1062b = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.b1, i2, i3);
        this.f1067g = obtainStyledAttributes.getDimensionPixelOffset(s.j.c1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(s.j.d1, 0);
        this.f1068h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1070j = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i2, i3);
        this.H = rVar;
        rVar.setInputMethodMode(1);
    }

    private void E(boolean z) {
        Method method = I;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.j0.e():int");
    }

    private int l(View view, int i2, boolean z) {
        Method method = J;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.H, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.H.getMaxAvailableHeight(view, i2);
    }

    private void q() {
        View view = this.f1078r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1078r);
            }
        }
    }

    public void A(boolean z) {
        this.G = z;
        this.H.setFocusable(z);
    }

    public void B(PopupWindow.OnDismissListener onDismissListener) {
        this.H.setOnDismissListener(onDismissListener);
    }

    public void C(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1083w = onItemClickListener;
    }

    public void D(boolean z) {
        this.f1073m = true;
        this.f1072l = z;
    }

    public void F(int i2) {
        this.f1079s = i2;
    }

    public void G(int i2) {
        f0 f0Var = this.f1064d;
        if (!c() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i2);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i2, true);
        }
    }

    public void H(int i2) {
        this.f1068h = i2;
        this.f1070j = true;
    }

    public void I(int i2) {
        this.f1066f = i2;
    }

    @Override // w.h
    public boolean c() {
        return this.H.isShowing();
    }

    @Override // w.h
    public ListView d() {
        return this.f1064d;
    }

    @Override // w.h
    public void dismiss() {
        this.H.dismiss();
        q();
        this.H.setContentView(null);
        this.f1064d = null;
        this.D.removeCallbacks(this.y);
    }

    @Override // w.h
    public void f() {
        int e2 = e();
        boolean o2 = o();
        android.support.v4.widget.j.b(this.H, this.f1069i);
        boolean z = true;
        if (this.H.isShowing()) {
            if (o.o.j(i())) {
                int i2 = this.f1066f;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = i().getWidth();
                }
                int i3 = this.f1065e;
                if (i3 == -1) {
                    if (!o2) {
                        e2 = -1;
                    }
                    if (o2) {
                        this.H.setWidth(this.f1066f == -1 ? -1 : 0);
                        this.H.setHeight(0);
                    } else {
                        this.H.setWidth(this.f1066f == -1 ? -1 : 0);
                        this.H.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    e2 = i3;
                }
                this.H.setOutsideTouchable((this.f1076p || this.f1075o) ? false : false);
                this.H.update(i(), this.f1067g, this.f1068h, i2 < 0 ? -1 : i2, e2 < 0 ? -1 : e2);
                return;
            }
            return;
        }
        int i4 = this.f1066f;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = i().getWidth();
        }
        int i5 = this.f1065e;
        if (i5 == -1) {
            e2 = -1;
        } else if (i5 != -2) {
            e2 = i5;
        }
        this.H.setWidth(i4);
        this.H.setHeight(e2);
        E(true);
        this.H.setOutsideTouchable((this.f1076p || this.f1075o) ? false : true);
        this.H.setTouchInterceptor(this.z);
        if (this.f1073m) {
            android.support.v4.widget.j.a(this.H, this.f1072l);
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.H, this.F);
            } catch (Exception e3) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
            }
        }
        android.support.v4.widget.j.c(this.H, i(), this.f1067g, this.f1068h, this.f1074n);
        this.f1064d.setSelection(-1);
        if (!this.G || this.f1064d.isInTouchMode()) {
            g();
        }
        if (this.G) {
            return;
        }
        this.D.post(this.B);
    }

    public void g() {
        f0 f0Var = this.f1064d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 h(Context context, boolean z) {
        return new f0(context, z);
    }

    public View i() {
        return this.f1081u;
    }

    public Drawable j() {
        return this.H.getBackground();
    }

    public int k() {
        return this.f1067g;
    }

    public int m() {
        if (this.f1070j) {
            return this.f1068h;
        }
        return 0;
    }

    public int n() {
        return this.f1066f;
    }

    public boolean o() {
        return this.H.getInputMethodMode() == 2;
    }

    public boolean p() {
        return this.G;
    }

    public void r(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1080t;
        if (dataSetObserver == null) {
            this.f1080t = new d();
        } else {
            ListAdapter listAdapter2 = this.f1063c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1063c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1080t);
        }
        f0 f0Var = this.f1064d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1063c);
        }
    }

    public void s(View view) {
        this.f1081u = view;
    }

    public void t(int i2) {
        this.H.setAnimationStyle(i2);
    }

    public void u(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public void v(int i2) {
        Drawable background = this.H.getBackground();
        if (background == null) {
            I(i2);
            return;
        }
        background.getPadding(this.E);
        Rect rect = this.E;
        this.f1066f = rect.left + rect.right + i2;
    }

    public void w(int i2) {
        this.f1074n = i2;
    }

    public void x(Rect rect) {
        this.F = rect;
    }

    public void y(int i2) {
        this.f1067g = i2;
    }

    public void z(int i2) {
        this.H.setInputMethodMode(i2);
    }
}