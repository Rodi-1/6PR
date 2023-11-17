package android.support.v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class y0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    private static y0 f1257k;

    /* renamed from: l  reason: collision with root package name */
    private static y0 f1258l;

    /* renamed from: b  reason: collision with root package name */
    private final View f1259b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f1260c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1261d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1262e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f1263f = new b();

    /* renamed from: g  reason: collision with root package name */
    private int f1264g;

    /* renamed from: h  reason: collision with root package name */
    private int f1265h;

    /* renamed from: i  reason: collision with root package name */
    private z0 f1266i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1267j;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.i(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.e();
        }
    }

    private y0(View view, CharSequence charSequence) {
        this.f1259b = view;
        this.f1260c = charSequence;
        this.f1261d = o.p.a(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void c() {
        this.f1259b.removeCallbacks(this.f1262e);
    }

    private void d() {
        this.f1264g = Integer.MAX_VALUE;
        this.f1265h = Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (f1258l == this) {
            f1258l = null;
            z0 z0Var = this.f1266i;
            if (z0Var != null) {
                z0Var.c();
                this.f1266i = null;
                d();
                this.f1259b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1257k == this) {
            g(null);
        }
        this.f1259b.removeCallbacks(this.f1263f);
    }

    private void f() {
        this.f1259b.postDelayed(this.f1262e, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(y0 y0Var) {
        y0 y0Var2 = f1257k;
        if (y0Var2 != null) {
            y0Var2.c();
        }
        f1257k = y0Var;
        if (y0Var != null) {
            y0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        y0 y0Var = f1257k;
        if (y0Var != null && y0Var.f1259b == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new y0(view, charSequence);
            return;
        }
        y0 y0Var2 = f1258l;
        if (y0Var2 != null && y0Var2.f1259b == view) {
            y0Var2.e();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        long longPressTimeout;
        if (o.o.j(this.f1259b)) {
            g(null);
            y0 y0Var = f1258l;
            if (y0Var != null) {
                y0Var.e();
            }
            f1258l = this;
            this.f1267j = z;
            z0 z0Var = new z0(this.f1259b.getContext());
            this.f1266i = z0Var;
            z0Var.e(this.f1259b, this.f1264g, this.f1265h, this.f1267j, this.f1260c);
            this.f1259b.addOnAttachStateChangeListener(this);
            if (this.f1267j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((o.o.g(this.f1259b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1259b.removeCallbacks(this.f1263f);
            this.f1259b.postDelayed(this.f1263f, longPressTimeout);
        }
    }

    private boolean j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1264g) > this.f1261d || Math.abs(y - this.f1265h) > this.f1261d) {
            this.f1264g = x;
            this.f1265h = y;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1266i == null || !this.f1267j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1259b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    d();
                    e();
                }
            } else if (this.f1259b.isEnabled() && this.f1266i == null && j(motionEvent)) {
                g(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1264g = view.getWidth() / 2;
        this.f1265h = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        e();
    }
}