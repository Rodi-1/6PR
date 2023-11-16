package android.support.p002v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p016o.C0490o;
import p016o.C0502p;

/* renamed from: android.support.v7.widget.y0 */
/* loaded from: classes.dex */
class View$OnLongClickListenerC0331y0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private static View$OnLongClickListenerC0331y0 f1569k;

    /* renamed from: l */
    private static View$OnLongClickListenerC0331y0 f1570l;

    /* renamed from: b */
    private final View f1571b;

    /* renamed from: c */
    private final CharSequence f1572c;

    /* renamed from: d */
    private final int f1573d;

    /* renamed from: e */
    private final Runnable f1574e = new RunnableC0332a();

    /* renamed from: f */
    private final Runnable f1575f = new RunnableC0333b();

    /* renamed from: g */
    private int f1576g;

    /* renamed from: h */
    private int f1577h;

    /* renamed from: i */
    private C0335z0 f1578i;

    /* renamed from: j */
    private boolean f1579j;

    /* renamed from: android.support.v7.widget.y0$a */
    /* loaded from: classes.dex */
    class RunnableC0332a implements Runnable {
        RunnableC0332a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0331y0.this.m1023i(false);
        }
    }

    /* renamed from: android.support.v7.widget.y0$b */
    /* loaded from: classes.dex */
    class RunnableC0333b implements Runnable {
        RunnableC0333b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0331y0.this.m1027e();
        }
    }

    private View$OnLongClickListenerC0331y0(View view, CharSequence charSequence) {
        this.f1571b = view;
        this.f1572c = charSequence;
        this.f1573d = C0502p.m361a(ViewConfiguration.get(view.getContext()));
        m1028d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: c */
    private void m1029c() {
        this.f1571b.removeCallbacks(this.f1574e);
    }

    /* renamed from: d */
    private void m1028d() {
        this.f1576g = Integer.MAX_VALUE;
        this.f1577h = Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m1027e() {
        if (f1570l == this) {
            f1570l = null;
            C0335z0 c0335z0 = this.f1578i;
            if (c0335z0 != null) {
                c0335z0.m1017c();
                this.f1578i = null;
                m1028d();
                this.f1571b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1569k == this) {
            m1025g(null);
        }
        this.f1571b.removeCallbacks(this.f1575f);
    }

    /* renamed from: f */
    private void m1026f() {
        this.f1571b.postDelayed(this.f1574e, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m1025g(View$OnLongClickListenerC0331y0 view$OnLongClickListenerC0331y0) {
        View$OnLongClickListenerC0331y0 view$OnLongClickListenerC0331y02 = f1569k;
        if (view$OnLongClickListenerC0331y02 != null) {
            view$OnLongClickListenerC0331y02.m1029c();
        }
        f1569k = view$OnLongClickListenerC0331y0;
        if (view$OnLongClickListenerC0331y0 != null) {
            view$OnLongClickListenerC0331y0.m1026f();
        }
    }

    /* renamed from: h */
    public static void m1024h(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0331y0 view$OnLongClickListenerC0331y0 = f1569k;
        if (view$OnLongClickListenerC0331y0 != null && view$OnLongClickListenerC0331y0.f1571b == view) {
            m1025g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new View$OnLongClickListenerC0331y0(view, charSequence);
            return;
        }
        View$OnLongClickListenerC0331y0 view$OnLongClickListenerC0331y02 = f1570l;
        if (view$OnLongClickListenerC0331y02 != null && view$OnLongClickListenerC0331y02.f1571b == view) {
            view$OnLongClickListenerC0331y02.m1027e();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m1023i(boolean z) {
        long longPressTimeout;
        if (C0490o.m402j(this.f1571b)) {
            m1025g(null);
            View$OnLongClickListenerC0331y0 view$OnLongClickListenerC0331y0 = f1570l;
            if (view$OnLongClickListenerC0331y0 != null) {
                view$OnLongClickListenerC0331y0.m1027e();
            }
            f1570l = this;
            this.f1579j = z;
            C0335z0 c0335z0 = new C0335z0(this.f1571b.getContext());
            this.f1578i = c0335z0;
            c0335z0.m1015e(this.f1571b, this.f1576g, this.f1577h, this.f1579j, this.f1572c);
            this.f1571b.addOnAttachStateChangeListener(this);
            if (this.f1579j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C0490o.m405g(this.f1571b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1571b.removeCallbacks(this.f1575f);
            this.f1571b.postDelayed(this.f1575f, longPressTimeout);
        }
    }

    /* renamed from: j */
    private boolean m1022j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1576g) > this.f1573d || Math.abs(y - this.f1577h) > this.f1573d) {
            this.f1576g = x;
            this.f1577h = y;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1578i == null || !this.f1579j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1571b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m1028d();
                    m1027e();
                }
            } else if (this.f1571b.isEnabled() && this.f1578i == null && m1022j(motionEvent)) {
                m1025g(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1576g = view.getWidth() / 2;
        this.f1577h = view.getHeight() / 2;
        m1023i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1027e();
    }
}