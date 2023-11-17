package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.view.menu.j;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import o.o;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f777a;

    /* renamed from: b  reason: collision with root package name */
    private final e f778b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f779c;

    /* renamed from: d  reason: collision with root package name */
    private final int f780d;

    /* renamed from: e  reason: collision with root package name */
    private final int f781e;

    /* renamed from: f  reason: collision with root package name */
    private View f782f;

    /* renamed from: g  reason: collision with root package name */
    private int f783g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f784h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f785i;

    /* renamed from: j  reason: collision with root package name */
    private h f786j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f787k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f788l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z, int i2) {
        this(context, eVar, view, z, i2, 0);
    }

    public i(Context context, e eVar, View view, boolean z, int i2, int i3) {
        this.f783g = 8388611;
        this.f788l = new a();
        this.f777a = context;
        this.f778b = eVar;
        this.f782f = view;
        this.f779c = z;
        this.f780d = i2;
        this.f781e = i3;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f777a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f777a.getResources().getDimensionPixelSize(s.d.abc_cascading_menus_min_smallest_width) ? new b(this.f777a, this.f782f, this.f780d, this.f781e, this.f779c) : new l(this.f777a, this.f778b, this.f782f, this.f780d, this.f781e, this.f779c);
        bVar.l(this.f778b);
        bVar.u(this.f788l);
        bVar.p(this.f782f);
        bVar.j(this.f785i);
        bVar.r(this.f784h);
        bVar.s(this.f783g);
        return bVar;
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        h c2 = c();
        c2.v(z2);
        if (z) {
            if ((o.d.a(this.f783g, o.d(this.f782f)) & 7) == 5) {
                i2 -= this.f782f.getWidth();
            }
            c2.t(i2);
            c2.w(i3);
            int i4 = (int) ((this.f777a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c2.f();
    }

    public void b() {
        if (d()) {
            this.f786j.dismiss();
        }
    }

    public h c() {
        if (this.f786j == null) {
            this.f786j = a();
        }
        return this.f786j;
    }

    public boolean d() {
        h hVar = this.f786j;
        return hVar != null && hVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f786j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f787k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f782f = view;
    }

    public void g(boolean z) {
        this.f784h = z;
        h hVar = this.f786j;
        if (hVar != null) {
            hVar.r(z);
        }
    }

    public void h(int i2) {
        this.f783g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f787k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f785i = aVar;
        h hVar = this.f786j;
        if (hVar != null) {
            hVar.j(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f782f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f782f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}