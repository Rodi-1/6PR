package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p001v4.widget.C0157j;
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
import p016o.C0490o;
import p020s.C0578j;
import p024w.InterfaceC0610h;

/* renamed from: android.support.v7.widget.j0 */
/* loaded from: classes.dex */
public class C0275j0 implements InterfaceC0610h {

    /* renamed from: I */
    private static Method f1350I;

    /* renamed from: J */
    private static Method f1351J;

    /* renamed from: K */
    private static Method f1352K;

    /* renamed from: A */
    private final C0280e f1353A;

    /* renamed from: B */
    private final RunnableC0278c f1354B;

    /* renamed from: C */
    private Runnable f1355C;

    /* renamed from: D */
    final Handler f1356D;

    /* renamed from: E */
    private final Rect f1357E;

    /* renamed from: F */
    private Rect f1358F;

    /* renamed from: G */
    private boolean f1359G;

    /* renamed from: H */
    PopupWindow f1360H;

    /* renamed from: b */
    private Context f1361b;

    /* renamed from: c */
    private ListAdapter f1362c;

    /* renamed from: d */
    C0260f0 f1363d;

    /* renamed from: e */
    private int f1364e;

    /* renamed from: f */
    private int f1365f;

    /* renamed from: g */
    private int f1366g;

    /* renamed from: h */
    private int f1367h;

    /* renamed from: i */
    private int f1368i;

    /* renamed from: j */
    private boolean f1369j;

    /* renamed from: k */
    private boolean f1370k;

    /* renamed from: l */
    private boolean f1371l;

    /* renamed from: m */
    private boolean f1372m;

    /* renamed from: n */
    private int f1373n;

    /* renamed from: o */
    private boolean f1374o;

    /* renamed from: p */
    private boolean f1375p;

    /* renamed from: q */
    int f1376q;

    /* renamed from: r */
    private View f1377r;

    /* renamed from: s */
    private int f1378s;

    /* renamed from: t */
    private DataSetObserver f1379t;

    /* renamed from: u */
    private View f1380u;

    /* renamed from: v */
    private Drawable f1381v;

    /* renamed from: w */
    private AdapterView.OnItemClickListener f1382w;

    /* renamed from: x */
    private AdapterView.OnItemSelectedListener f1383x;

    /* renamed from: y */
    final RunnableC0282g f1384y;

    /* renamed from: z */
    private final View$OnTouchListenerC0281f f1385z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.j0$a */
    /* loaded from: classes.dex */
    public class RunnableC0276a implements Runnable {
        RunnableC0276a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m1248i = C0275j0.this.m1248i();
            if (m1248i == null || m1248i.getWindowToken() == null) {
                return;
            }
            C0275j0.this.mo1f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.j0$b */
    /* loaded from: classes.dex */
    public class C0277b implements AdapterView.OnItemSelectedListener {
        C0277b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0260f0 c0260f0;
            if (i == -1 || (c0260f0 = C0275j0.this.f1363d) == null) {
                return;
            }
            c0260f0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j0$c */
    /* loaded from: classes.dex */
    public class RunnableC0278c implements Runnable {
        RunnableC0278c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0275j0.this.m1249g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j0$d */
    /* loaded from: classes.dex */
    public class C0279d extends DataSetObserver {
        C0279d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0275j0.this.mo3c()) {
                C0275j0.this.mo1f();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0275j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j0$e */
    /* loaded from: classes.dex */
    public class C0280e implements AbsListView.OnScrollListener {
        C0280e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0275j0.this.m1242o() || C0275j0.this.f1360H.getContentView() == null) {
                return;
            }
            C0275j0 c0275j0 = C0275j0.this;
            c0275j0.f1356D.removeCallbacks(c0275j0.f1384y);
            C0275j0.this.f1384y.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j0$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0281f implements View.OnTouchListener {
        View$OnTouchListenerC0281f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0275j0.this.f1360H) != null && popupWindow.isShowing() && x >= 0 && x < C0275j0.this.f1360H.getWidth() && y >= 0 && y < C0275j0.this.f1360H.getHeight()) {
                C0275j0 c0275j0 = C0275j0.this;
                c0275j0.f1356D.postDelayed(c0275j0.f1384y, 250L);
                return false;
            } else if (action == 1) {
                C0275j0 c0275j02 = C0275j0.this;
                c0275j02.f1356D.removeCallbacks(c0275j02.f1384y);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j0$g */
    /* loaded from: classes.dex */
    public class RunnableC0282g implements Runnable {
        RunnableC0282g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0260f0 c0260f0 = C0275j0.this.f1363d;
            if (c0260f0 == null || !C0490o.m402j(c0260f0) || C0275j0.this.f1363d.getCount() <= C0275j0.this.f1363d.getChildCount()) {
                return;
            }
            int childCount = C0275j0.this.f1363d.getChildCount();
            C0275j0 c0275j0 = C0275j0.this;
            if (childCount <= c0275j0.f1376q) {
                c0275j0.f1360H.setInputMethodMode(2);
                C0275j0.this.mo1f();
            }
        }
    }

    static {
        try {
            f1350I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f1351J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f1352K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0275j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0275j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1364e = -2;
        this.f1365f = -2;
        this.f1368i = 1002;
        this.f1370k = true;
        this.f1373n = 0;
        this.f1374o = false;
        this.f1375p = false;
        this.f1376q = Integer.MAX_VALUE;
        this.f1378s = 0;
        this.f1384y = new RunnableC0282g();
        this.f1385z = new View$OnTouchListenerC0281f();
        this.f1353A = new C0280e();
        this.f1354B = new RunnableC0278c();
        this.f1357E = new Rect();
        this.f1361b = context;
        this.f1356D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2532b1, i, i2);
        this.f1366g = obtainStyledAttributes.getDimensionPixelOffset(C0578j.f2536c1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0578j.f2540d1, 0);
        this.f1367h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1369j = true;
        }
        obtainStyledAttributes.recycle();
        C0307r c0307r = new C0307r(context, attributeSet, i, i2);
        this.f1360H = c0307r;
        c0307r.setInputMethodMode(1);
    }

    /* renamed from: E */
    private void m1255E(boolean z) {
        Method method = f1350I;
        if (method != null) {
            try {
                method.invoke(this.f1360H, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m1250e() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0275j0.m1250e():int");
    }

    /* renamed from: l */
    private int m1245l(View view, int i, boolean z) {
        Method method = f1351J;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1360H, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1360H.getMaxAvailableHeight(view, i);
    }

    /* renamed from: q */
    private void m1240q() {
        View view = this.f1377r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1377r);
            }
        }
    }

    /* renamed from: A */
    public void m1259A(boolean z) {
        this.f1359G = z;
        this.f1360H.setFocusable(z);
    }

    /* renamed from: B */
    public void m1258B(PopupWindow.OnDismissListener onDismissListener) {
        this.f1360H.setOnDismissListener(onDismissListener);
    }

    /* renamed from: C */
    public void m1257C(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1382w = onItemClickListener;
    }

    /* renamed from: D */
    public void m1256D(boolean z) {
        this.f1372m = true;
        this.f1371l = z;
    }

    /* renamed from: F */
    public void m1254F(int i) {
        this.f1378s = i;
    }

    /* renamed from: G */
    public void m1253G(int i) {
        C0260f0 c0260f0 = this.f1363d;
        if (!mo3c() || c0260f0 == null) {
            return;
        }
        c0260f0.setListSelectionHidden(false);
        c0260f0.setSelection(i);
        if (c0260f0.getChoiceMode() != 0) {
            c0260f0.setItemChecked(i, true);
        }
    }

    /* renamed from: H */
    public void m1252H(int i) {
        this.f1367h = i;
        this.f1369j = true;
    }

    /* renamed from: I */
    public void m1251I(int i) {
        this.f1365f = i;
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: c */
    public boolean mo3c() {
        return this.f1360H.isShowing();
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: d */
    public ListView mo2d() {
        return this.f1363d;
    }

    @Override // p024w.InterfaceC0610h
    public void dismiss() {
        this.f1360H.dismiss();
        m1240q();
        this.f1360H.setContentView(null);
        this.f1363d = null;
        this.f1356D.removeCallbacks(this.f1384y);
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: f */
    public void mo1f() {
        int m1250e = m1250e();
        boolean m1242o = m1242o();
        C0157j.m1727b(this.f1360H, this.f1368i);
        boolean z = true;
        if (this.f1360H.isShowing()) {
            if (C0490o.m402j(m1248i())) {
                int i = this.f1365f;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m1248i().getWidth();
                }
                int i2 = this.f1364e;
                if (i2 == -1) {
                    if (!m1242o) {
                        m1250e = -1;
                    }
                    if (m1242o) {
                        this.f1360H.setWidth(this.f1365f == -1 ? -1 : 0);
                        this.f1360H.setHeight(0);
                    } else {
                        this.f1360H.setWidth(this.f1365f == -1 ? -1 : 0);
                        this.f1360H.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m1250e = i2;
                }
                this.f1360H.setOutsideTouchable((this.f1375p || this.f1374o) ? false : false);
                this.f1360H.update(m1248i(), this.f1366g, this.f1367h, i < 0 ? -1 : i, m1250e < 0 ? -1 : m1250e);
                return;
            }
            return;
        }
        int i3 = this.f1365f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m1248i().getWidth();
        }
        int i4 = this.f1364e;
        if (i4 == -1) {
            m1250e = -1;
        } else if (i4 != -2) {
            m1250e = i4;
        }
        this.f1360H.setWidth(i3);
        this.f1360H.setHeight(m1250e);
        m1255E(true);
        this.f1360H.setOutsideTouchable((this.f1375p || this.f1374o) ? false : true);
        this.f1360H.setTouchInterceptor(this.f1385z);
        if (this.f1372m) {
            C0157j.m1728a(this.f1360H, this.f1371l);
        }
        Method method = f1352K;
        if (method != null) {
            try {
                method.invoke(this.f1360H, this.f1358F);
            } catch (Exception e) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
            }
        }
        C0157j.m1726c(this.f1360H, m1248i(), this.f1366g, this.f1367h, this.f1373n);
        this.f1363d.setSelection(-1);
        if (!this.f1359G || this.f1363d.isInTouchMode()) {
            m1249g();
        }
        if (this.f1359G) {
            return;
        }
        this.f1356D.post(this.f1354B);
    }

    /* renamed from: g */
    public void m1249g() {
        C0260f0 c0260f0 = this.f1363d;
        if (c0260f0 != null) {
            c0260f0.setListSelectionHidden(true);
            c0260f0.requestLayout();
        }
    }

    /* renamed from: h */
    C0260f0 mo1191h(Context context, boolean z) {
        return new C0260f0(context, z);
    }

    /* renamed from: i */
    public View m1248i() {
        return this.f1380u;
    }

    /* renamed from: j */
    public Drawable m1247j() {
        return this.f1360H.getBackground();
    }

    /* renamed from: k */
    public int m1246k() {
        return this.f1366g;
    }

    /* renamed from: m */
    public int m1244m() {
        if (this.f1369j) {
            return this.f1367h;
        }
        return 0;
    }

    /* renamed from: n */
    public int m1243n() {
        return this.f1365f;
    }

    /* renamed from: o */
    public boolean m1242o() {
        return this.f1360H.getInputMethodMode() == 2;
    }

    /* renamed from: p */
    public boolean m1241p() {
        return this.f1359G;
    }

    /* renamed from: r */
    public void mo1054r(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1379t;
        if (dataSetObserver == null) {
            this.f1379t = new C0279d();
        } else {
            ListAdapter listAdapter2 = this.f1362c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1362c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1379t);
        }
        C0260f0 c0260f0 = this.f1363d;
        if (c0260f0 != null) {
            c0260f0.setAdapter(this.f1362c);
        }
    }

    /* renamed from: s */
    public void m1239s(View view) {
        this.f1380u = view;
    }

    /* renamed from: t */
    public void m1238t(int i) {
        this.f1360H.setAnimationStyle(i);
    }

    /* renamed from: u */
    public void m1237u(Drawable drawable) {
        this.f1360H.setBackgroundDrawable(drawable);
    }

    /* renamed from: v */
    public void m1236v(int i) {
        Drawable background = this.f1360H.getBackground();
        if (background == null) {
            m1251I(i);
            return;
        }
        background.getPadding(this.f1357E);
        Rect rect = this.f1357E;
        this.f1365f = rect.left + rect.right + i;
    }

    /* renamed from: w */
    public void m1235w(int i) {
        this.f1373n = i;
    }

    /* renamed from: x */
    public void m1234x(Rect rect) {
        this.f1358F = rect;
    }

    /* renamed from: y */
    public void m1233y(int i) {
        this.f1366g = i;
    }

    /* renamed from: z */
    public void m1232z(int i) {
        this.f1360H.setInputMethodMode(i);
    }
}