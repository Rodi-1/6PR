package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.widget.C0290l0;
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
import p016o.C0490o;
import p020s.C0572d;
import p020s.C0575g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.l */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0205l extends AbstractC0198h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c */
    private final Context f1002c;

    /* renamed from: d */
    private final C0192e f1003d;

    /* renamed from: e */
    private final C0191d f1004e;

    /* renamed from: f */
    private final boolean f1005f;

    /* renamed from: g */
    private final int f1006g;

    /* renamed from: h */
    private final int f1007h;

    /* renamed from: i */
    private final int f1008i;

    /* renamed from: j */
    final C0290l0 f1009j;

    /* renamed from: m */
    private PopupWindow.OnDismissListener f1012m;

    /* renamed from: n */
    private View f1013n;

    /* renamed from: o */
    View f1014o;

    /* renamed from: p */
    private InterfaceC0201j.InterfaceC0202a f1015p;

    /* renamed from: q */
    private ViewTreeObserver f1016q;

    /* renamed from: r */
    private boolean f1017r;

    /* renamed from: s */
    private boolean f1018s;

    /* renamed from: t */
    private int f1019t;

    /* renamed from: v */
    private boolean f1021v;

    /* renamed from: k */
    private final ViewTreeObserver.OnGlobalLayoutListener f1010k = new ViewTreeObserver$OnGlobalLayoutListenerC0206a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1011l = new View$OnAttachStateChangeListenerC0207b();

    /* renamed from: u */
    private int f1020u = 0;

    /* renamed from: android.support.v7.view.menu.l$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0206a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0206a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0205l.this.mo3c() || View$OnKeyListenerC0205l.this.f1009j.m1241p()) {
                return;
            }
            View view = View$OnKeyListenerC0205l.this.f1014o;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0205l.this.dismiss();
            } else {
                View$OnKeyListenerC0205l.this.f1009j.mo1f();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0207b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0207b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (View$OnKeyListenerC0205l.this.f1016q != null) {
                if (!View$OnKeyListenerC0205l.this.f1016q.isAlive()) {
                    View$OnKeyListenerC0205l.this.f1016q = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0205l.this.f1016q.removeGlobalOnLayoutListener(View$OnKeyListenerC0205l.this.f1010k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0205l(Context context, C0192e c0192e, View view, int i, int i2, boolean z) {
        this.f1002c = context;
        this.f1003d = c0192e;
        this.f1005f = z;
        this.f1004e = new C0191d(c0192e, LayoutInflater.from(context), z);
        this.f1007h = i;
        this.f1008i = i2;
        Resources resources = context.getResources();
        this.f1006g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0572d.abc_config_prefDialogWidth));
        this.f1013n = view;
        this.f1009j = new C0290l0(context, null, i, i2);
        c0192e.m1626c(this, context);
    }

    /* renamed from: C */
    private boolean m1555C() {
        View view;
        if (mo3c()) {
            return true;
        }
        if (this.f1017r || (view = this.f1013n) == null) {
            return false;
        }
        this.f1014o = view;
        this.f1009j.m1258B(this);
        this.f1009j.m1257C(this);
        this.f1009j.m1259A(true);
        View view2 = this.f1014o;
        boolean z = this.f1016q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1016q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1010k);
        }
        view2.addOnAttachStateChangeListener(this.f1011l);
        this.f1009j.m1239s(view2);
        this.f1009j.m1235w(this.f1020u);
        if (!this.f1018s) {
            this.f1019t = AbstractC0198h.m1576o(this.f1004e, null, this.f1002c, this.f1006g);
            this.f1018s = true;
        }
        this.f1009j.m1236v(this.f1019t);
        this.f1009j.m1232z(2);
        this.f1009j.m1234x(m1577n());
        this.f1009j.mo1f();
        ListView mo2d = this.f1009j.mo2d();
        mo2d.setOnKeyListener(this);
        if (this.f1021v && this.f1003d.m1607x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1002c).inflate(C0575g.abc_popup_menu_header_item_layout, (ViewGroup) mo2d, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1003d.m1607x());
            }
            frameLayout.setEnabled(false);
            mo2d.addHeaderView(frameLayout, null, false);
        }
        this.f1009j.mo1054r(this.f1004e);
        this.f1009j.mo1f();
        return true;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: a */
    public void mo1347a(C0192e c0192e, boolean z) {
        if (c0192e != this.f1003d) {
            return;
        }
        dismiss();
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f1015p;
        if (interfaceC0202a != null) {
            interfaceC0202a.mo184a(c0192e, z);
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: b */
    public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
        if (subMenuC0208m.hasVisibleItems()) {
            C0199i c0199i = new C0199i(this.f1002c, subMenuC0208m, this.f1014o, this.f1005f, this.f1007h, this.f1008i);
            c0199i.m1564j(this.f1015p);
            c0199i.m1567g(AbstractC0198h.m1574x(subMenuC0208m));
            c0199i.m1565i(this.f1012m);
            this.f1012m = null;
            this.f1003d.m1622e(false);
            int m1246k = this.f1009j.m1246k();
            int m1244m = this.f1009j.m1244m();
            if ((Gravity.getAbsoluteGravity(this.f1020u, C0490o.m408d(this.f1013n)) & 7) == 5) {
                m1246k += this.f1013n.getWidth();
            }
            if (c0199i.m1560n(m1246k, m1244m)) {
                InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f1015p;
                if (interfaceC0202a != null) {
                    interfaceC0202a.mo183b(subMenuC0208m);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: c */
    public boolean mo3c() {
        return !this.f1017r && this.f1009j.mo3c();
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: d */
    public ListView mo2d() {
        return this.f1009j.mo2d();
    }

    @Override // p024w.InterfaceC0610h
    public void dismiss() {
        if (mo3c()) {
            this.f1009j.dismiss();
        }
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: f */
    public void mo1f() {
        if (!m1555C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: g */
    public boolean mo1344g() {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: i */
    public void mo1343i(boolean z) {
        this.f1018s = false;
        C0191d c0191d = this.f1004e;
        if (c0191d != null) {
            c0191d.notifyDataSetChanged();
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: j */
    public void mo1554j(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        this.f1015p = interfaceC0202a;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: l */
    public void mo1553l(C0192e c0192e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1017r = true;
        this.f1003d.close();
        ViewTreeObserver viewTreeObserver = this.f1016q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1016q = this.f1014o.getViewTreeObserver();
            }
            this.f1016q.removeGlobalOnLayoutListener(this.f1010k);
            this.f1016q = null;
        }
        this.f1014o.removeOnAttachStateChangeListener(this.f1011l);
        PopupWindow.OnDismissListener onDismissListener = this.f1012m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: p */
    public void mo1552p(View view) {
        this.f1013n = view;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: r */
    public void mo1551r(boolean z) {
        this.f1004e.m1652d(z);
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: s */
    public void mo1550s(int i) {
        this.f1020u = i;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: t */
    public void mo1549t(int i) {
        this.f1009j.m1233y(i);
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: u */
    public void mo1548u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1012m = onDismissListener;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: v */
    public void mo1547v(boolean z) {
        this.f1021v = z;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: w */
    public void mo1546w(int i) {
        this.f1009j.m1252H(i);
    }
}