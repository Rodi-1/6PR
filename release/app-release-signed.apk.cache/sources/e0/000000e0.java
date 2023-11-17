package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.j;
import android.support.v7.widget.l0;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import o.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c  reason: collision with root package name */
    private final Context f790c;

    /* renamed from: d  reason: collision with root package name */
    private final e f791d;

    /* renamed from: e  reason: collision with root package name */
    private final d f792e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f793f;

    /* renamed from: g  reason: collision with root package name */
    private final int f794g;

    /* renamed from: h  reason: collision with root package name */
    private final int f795h;

    /* renamed from: i  reason: collision with root package name */
    private final int f796i;

    /* renamed from: j  reason: collision with root package name */
    final l0 f797j;

    /* renamed from: m  reason: collision with root package name */
    private PopupWindow.OnDismissListener f800m;

    /* renamed from: n  reason: collision with root package name */
    private View f801n;

    /* renamed from: o  reason: collision with root package name */
    View f802o;

    /* renamed from: p  reason: collision with root package name */
    private j.a f803p;

    /* renamed from: q  reason: collision with root package name */
    private ViewTreeObserver f804q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f805r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f806s;

    /* renamed from: t  reason: collision with root package name */
    private int f807t;

    /* renamed from: v  reason: collision with root package name */
    private boolean f809v;

    /* renamed from: k  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f798k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f799l = new b();

    /* renamed from: u  reason: collision with root package name */
    private int f808u = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.c() || l.this.f797j.p()) {
                return;
            }
            View view = l.this.f802o;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f797j.f();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (l.this.f804q != null) {
                if (!l.this.f804q.isAlive()) {
                    l.this.f804q = view.getViewTreeObserver();
                }
                l.this.f804q.removeGlobalOnLayoutListener(l.this.f798k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i2, int i3, boolean z) {
        this.f790c = context;
        this.f791d = eVar;
        this.f793f = z;
        this.f792e = new d(eVar, LayoutInflater.from(context), z);
        this.f795h = i2;
        this.f796i = i3;
        Resources resources = context.getResources();
        this.f794g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(s.d.abc_config_prefDialogWidth));
        this.f801n = view;
        this.f797j = new l0(context, null, i2, i3);
        eVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f805r || (view = this.f801n) == null) {
            return false;
        }
        this.f802o = view;
        this.f797j.B(this);
        this.f797j.C(this);
        this.f797j.A(true);
        View view2 = this.f802o;
        boolean z = this.f804q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f804q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f798k);
        }
        view2.addOnAttachStateChangeListener(this.f799l);
        this.f797j.s(view2);
        this.f797j.w(this.f808u);
        if (!this.f806s) {
            this.f807t = h.o(this.f792e, null, this.f790c, this.f794g);
            this.f806s = true;
        }
        this.f797j.v(this.f807t);
        this.f797j.z(2);
        this.f797j.x(n());
        this.f797j.f();
        ListView d2 = this.f797j.d();
        d2.setOnKeyListener(this);
        if (this.f809v && this.f791d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f790c).inflate(s.g.abc_popup_menu_header_item_layout, (ViewGroup) d2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f791d.x());
            }
            frameLayout.setEnabled(false);
            d2.addHeaderView(frameLayout, null, false);
        }
        this.f797j.r(this.f792e);
        this.f797j.f();
        return true;
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z) {
        if (eVar != this.f791d) {
            return;
        }
        dismiss();
        j.a aVar = this.f803p;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f790c, mVar, this.f802o, this.f793f, this.f795h, this.f796i);
            iVar.j(this.f803p);
            iVar.g(h.x(mVar));
            iVar.i(this.f800m);
            this.f800m = null;
            this.f791d.e(false);
            int k2 = this.f797j.k();
            int m2 = this.f797j.m();
            if ((Gravity.getAbsoluteGravity(this.f808u, o.d(this.f801n)) & 7) == 5) {
                k2 += this.f801n.getWidth();
            }
            if (iVar.n(k2, m2)) {
                j.a aVar = this.f803p;
                if (aVar != null) {
                    aVar.b(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // w.h
    public boolean c() {
        return !this.f805r && this.f797j.c();
    }

    @Override // w.h
    public ListView d() {
        return this.f797j.d();
    }

    @Override // w.h
    public void dismiss() {
        if (c()) {
            this.f797j.dismiss();
        }
    }

    @Override // w.h
    public void f() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void i(boolean z) {
        this.f806s = false;
        d dVar = this.f792e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public void j(j.a aVar) {
        this.f803p = aVar;
    }

    @Override // android.support.v7.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f805r = true;
        this.f791d.close();
        ViewTreeObserver viewTreeObserver = this.f804q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f804q = this.f802o.getViewTreeObserver();
            }
            this.f804q.removeGlobalOnLayoutListener(this.f798k);
            this.f804q = null;
        }
        this.f802o.removeOnAttachStateChangeListener(this.f799l);
        PopupWindow.OnDismissListener onDismissListener = this.f800m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.h
    public void p(View view) {
        this.f801n = view;
    }

    @Override // android.support.v7.view.menu.h
    public void r(boolean z) {
        this.f792e.d(z);
    }

    @Override // android.support.v7.view.menu.h
    public void s(int i2) {
        this.f808u = i2;
    }

    @Override // android.support.v7.view.menu.h
    public void t(int i2) {
        this.f797j.y(i2);
    }

    @Override // android.support.v7.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f800m = onDismissListener;
    }

    @Override // android.support.v7.view.menu.h
    public void v(boolean z) {
        this.f809v = z;
    }

    @Override // android.support.v7.view.menu.h
    public void w(int i2) {
        this.f797j.H(i2);
    }
}