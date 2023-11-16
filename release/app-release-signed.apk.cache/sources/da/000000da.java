package android.support.p002v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p016o.C0474d;
import p016o.C0490o;
import p020s.C0572d;

/* renamed from: android.support.v7.view.menu.i */
/* loaded from: classes.dex */
public class C0199i {

    /* renamed from: a */
    private final Context f989a;

    /* renamed from: b */
    private final C0192e f990b;

    /* renamed from: c */
    private final boolean f991c;

    /* renamed from: d */
    private final int f992d;

    /* renamed from: e */
    private final int f993e;

    /* renamed from: f */
    private View f994f;

    /* renamed from: g */
    private int f995g;

    /* renamed from: h */
    private boolean f996h;

    /* renamed from: i */
    private InterfaceC0201j.InterfaceC0202a f997i;

    /* renamed from: j */
    private AbstractC0198h f998j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f999k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1000l;

    /* renamed from: android.support.v7.view.menu.i$a */
    /* loaded from: classes.dex */
    class C0200a implements PopupWindow.OnDismissListener {
        C0200a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0199i.this.mo1325e();
        }
    }

    public C0199i(Context context, C0192e c0192e, View view, boolean z, int i) {
        this(context, c0192e, view, z, i, 0);
    }

    public C0199i(Context context, C0192e c0192e, View view, boolean z, int i, int i2) {
        this.f995g = 8388611;
        this.f1000l = new C0200a();
        this.f989a = context;
        this.f990b = c0192e;
        this.f994f = view;
        this.f991c = z;
        this.f992d = i;
        this.f993e = i2;
    }

    /* renamed from: a */
    private AbstractC0198h m1572a() {
        Display defaultDisplay = ((WindowManager) this.f989a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC0198h view$OnKeyListenerC0183b = Math.min(point.x, point.y) >= this.f989a.getResources().getDimensionPixelSize(C0572d.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0183b(this.f989a, this.f994f, this.f992d, this.f993e, this.f991c) : new View$OnKeyListenerC0205l(this.f989a, this.f990b, this.f994f, this.f992d, this.f993e, this.f991c);
        view$OnKeyListenerC0183b.mo1553l(this.f990b);
        view$OnKeyListenerC0183b.mo1548u(this.f1000l);
        view$OnKeyListenerC0183b.mo1552p(this.f994f);
        view$OnKeyListenerC0183b.mo1554j(this.f997i);
        view$OnKeyListenerC0183b.mo1551r(this.f996h);
        view$OnKeyListenerC0183b.mo1550s(this.f995g);
        return view$OnKeyListenerC0183b;
    }

    /* renamed from: l */
    private void m1562l(int i, int i2, boolean z, boolean z2) {
        AbstractC0198h m1570c = m1570c();
        m1570c.mo1547v(z2);
        if (z) {
            if ((C0474d.m456a(this.f995g, C0490o.m408d(this.f994f)) & 7) == 5) {
                i -= this.f994f.getWidth();
            }
            m1570c.mo1549t(i);
            m1570c.mo1546w(i2);
            int i3 = (int) ((this.f989a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1570c.m1575q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m1570c.mo1f();
    }

    /* renamed from: b */
    public void m1571b() {
        if (m1569d()) {
            this.f998j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0198h m1570c() {
        if (this.f998j == null) {
            this.f998j = m1572a();
        }
        return this.f998j;
    }

    /* renamed from: d */
    public boolean m1569d() {
        AbstractC0198h abstractC0198h = this.f998j;
        return abstractC0198h != null && abstractC0198h.mo3c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1325e() {
        this.f998j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f999k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m1568f(View view) {
        this.f994f = view;
    }

    /* renamed from: g */
    public void m1567g(boolean z) {
        this.f996h = z;
        AbstractC0198h abstractC0198h = this.f998j;
        if (abstractC0198h != null) {
            abstractC0198h.mo1551r(z);
        }
    }

    /* renamed from: h */
    public void m1566h(int i) {
        this.f995g = i;
    }

    /* renamed from: i */
    public void m1565i(PopupWindow.OnDismissListener onDismissListener) {
        this.f999k = onDismissListener;
    }

    /* renamed from: j */
    public void m1564j(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        this.f997i = interfaceC0202a;
        AbstractC0198h abstractC0198h = this.f998j;
        if (abstractC0198h != null) {
            abstractC0198h.mo1554j(interfaceC0202a);
        }
    }

    /* renamed from: k */
    public void m1563k() {
        if (!m1561m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m1561m() {
        if (m1569d()) {
            return true;
        }
        if (this.f994f == null) {
            return false;
        }
        m1562l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m1560n(int i, int i2) {
        if (m1569d()) {
            return true;
        }
        if (this.f994f == null) {
            return false;
        }
        m1562l(i, i2, true, true);
        return true;
    }
}