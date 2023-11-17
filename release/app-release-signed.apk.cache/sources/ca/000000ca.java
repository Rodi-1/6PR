package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.j;
import android.support.v7.widget.k0;
import android.support.v7.widget.l0;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import o.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f677c;

    /* renamed from: d  reason: collision with root package name */
    private final int f678d;

    /* renamed from: e  reason: collision with root package name */
    private final int f679e;

    /* renamed from: f  reason: collision with root package name */
    private final int f680f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f681g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f682h;

    /* renamed from: p  reason: collision with root package name */
    private View f690p;

    /* renamed from: q  reason: collision with root package name */
    View f691q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f693s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f694t;

    /* renamed from: u  reason: collision with root package name */
    private int f695u;

    /* renamed from: v  reason: collision with root package name */
    private int f696v;
    private boolean x;
    private j.a y;
    private ViewTreeObserver z;

    /* renamed from: i  reason: collision with root package name */
    private final List<e> f683i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final List<d> f684j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f685k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f686l = new View$OnAttachStateChangeListenerC0008b();

    /* renamed from: m  reason: collision with root package name */
    private final k0 f687m = new c();

    /* renamed from: n  reason: collision with root package name */
    private int f688n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f689o = 0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f697w = false;

    /* renamed from: r  reason: collision with root package name */
    private int f692r = G();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.c() || b.this.f684j.size() <= 0 || b.this.f684j.get(0).f705a.p()) {
                return;
            }
            View view = b.this.f691q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.f684j) {
                dVar.f705a.f();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0008b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0008b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (b.this.z != null) {
                if (!b.this.z.isAlive()) {
                    b.this.z = view.getViewTreeObserver();
                }
                b.this.z.removeGlobalOnLayoutListener(b.this.f685k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements k0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f701b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MenuItem f702c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e f703d;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f701b = dVar;
                this.f702c = menuItem;
                this.f703d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f701b;
                if (dVar != null) {
                    b.this.B = true;
                    dVar.f706b.e(false);
                    b.this.B = false;
                }
                if (this.f702c.isEnabled() && this.f702c.hasSubMenu()) {
                    this.f703d.L(this.f702c, 4);
                }
            }
        }

        c() {
        }

        @Override // android.support.v7.widget.k0
        public void a(e eVar, MenuItem menuItem) {
            b.this.f682h.removeCallbacksAndMessages(null);
            int size = b.this.f684j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f684j.get(i2).f706b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            b.this.f682h.postAtTime(new a(i3 < b.this.f684j.size() ? b.this.f684j.get(i3) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // android.support.v7.widget.k0
        public void b(e eVar, MenuItem menuItem) {
            b.this.f682h.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f705a;

        /* renamed from: b  reason: collision with root package name */
        public final e f706b;

        /* renamed from: c  reason: collision with root package name */
        public final int f707c;

        public d(l0 l0Var, e eVar, int i2) {
            this.f705a = l0Var;
            this.f706b = eVar;
            this.f707c = i2;
        }

        public ListView a() {
            return this.f705a.d();
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z) {
        this.f677c = context;
        this.f690p = view;
        this.f679e = i2;
        this.f680f = i3;
        this.f681g = z;
        Resources resources = context.getResources();
        this.f678d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(s.d.abc_config_prefDialogWidth));
        this.f682h = new Handler();
    }

    private l0 C() {
        l0 l0Var = new l0(this.f677c, null, this.f679e, this.f680f);
        l0Var.L(this.f687m);
        l0Var.C(this);
        l0Var.B(this);
        l0Var.s(this.f690p);
        l0Var.w(this.f689o);
        l0Var.A(true);
        l0Var.z(2);
        return l0Var;
    }

    private int D(e eVar) {
        int size = this.f684j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (eVar == this.f684j.get(i2).f706b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem E(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = eVar.getItem(i2);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View F(d dVar, e eVar) {
        android.support.v7.view.menu.d dVar2;
        int i2;
        int firstVisiblePosition;
        MenuItem E = E(dVar.f706b, eVar);
        if (E == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            dVar2 = (android.support.v7.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (android.support.v7.view.menu.d) adapter;
            i2 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (E == dVar2.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return o.d(this.f690p) == 1 ? 0 : 1;
    }

    private int H(int i2) {
        List<d> list = this.f684j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f691q.getWindowVisibleDisplayFrame(rect);
        return this.f692r == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void I(e eVar) {
        d dVar;
        View view;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f677c);
        android.support.v7.view.menu.d dVar2 = new android.support.v7.view.menu.d(eVar, from, this.f681g);
        if (!c() && this.f697w) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o2 = h.o(dVar2, null, this.f677c, this.f678d);
        l0 C = C();
        C.r(dVar2);
        C.v(o2);
        C.w(this.f689o);
        if (this.f684j.size() > 0) {
            List<d> list = this.f684j;
            dVar = list.get(list.size() - 1);
            view = F(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.M(false);
            C.J(null);
            int H = H(o2);
            boolean z = H == 1;
            this.f692r = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.s(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f690p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f689o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f690p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f689o & 5) == 5) {
                if (!z) {
                    o2 = view.getWidth();
                    i4 = i2 - o2;
                }
                i4 = i2 + o2;
            } else {
                if (z) {
                    o2 = view.getWidth();
                    i4 = i2 + o2;
                }
                i4 = i2 - o2;
            }
            C.y(i4);
            C.D(true);
            C.H(i3);
        } else {
            if (this.f693s) {
                C.y(this.f695u);
            }
            if (this.f694t) {
                C.H(this.f696v);
            }
            C.x(n());
        }
        this.f684j.add(new d(C, eVar, this.f692r));
        C.f();
        ListView d2 = C.d();
        d2.setOnKeyListener(this);
        if (dVar == null && this.x && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(s.g.abc_popup_menu_header_item_layout, (ViewGroup) d2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            d2.addHeaderView(frameLayout, null, false);
            C.f();
        }
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z) {
        int D = D(eVar);
        if (D < 0) {
            return;
        }
        int i2 = D + 1;
        if (i2 < this.f684j.size()) {
            this.f684j.get(i2).f706b.e(false);
        }
        d remove = this.f684j.remove(D);
        remove.f706b.O(this);
        if (this.B) {
            remove.f705a.K(null);
            remove.f705a.t(0);
        }
        remove.f705a.dismiss();
        int size = this.f684j.size();
        this.f692r = size > 0 ? this.f684j.get(size - 1).f707c : G();
        if (size != 0) {
            if (z) {
                this.f684j.get(0).f706b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.y;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.f685k);
            }
            this.z = null;
        }
        this.f691q.removeOnAttachStateChangeListener(this.f686l);
        this.A.onDismiss();
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        for (d dVar : this.f684j) {
            if (mVar == dVar.f706b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            l(mVar);
            j.a aVar = this.y;
            if (aVar != null) {
                aVar.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // w.h
    public boolean c() {
        return this.f684j.size() > 0 && this.f684j.get(0).f705a.c();
    }

    @Override // w.h
    public ListView d() {
        if (this.f684j.isEmpty()) {
            return null;
        }
        List<d> list = this.f684j;
        return list.get(list.size() - 1).a();
    }

    @Override // w.h
    public void dismiss() {
        int size = this.f684j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f684j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f705a.c()) {
                    dVar.f705a.dismiss();
                }
            }
        }
    }

    @Override // w.h
    public void f() {
        if (c()) {
            return;
        }
        for (e eVar : this.f683i) {
            I(eVar);
        }
        this.f683i.clear();
        View view = this.f690p;
        this.f691q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f685k);
            }
            this.f691q.addOnAttachStateChangeListener(this.f686l);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void i(boolean z) {
        for (d dVar : this.f684j) {
            h.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public void j(j.a aVar) {
        this.y = aVar;
    }

    @Override // android.support.v7.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f677c);
        if (c()) {
            I(eVar);
        } else {
            this.f683i.add(eVar);
        }
    }

    @Override // android.support.v7.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f684j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f684j.get(i2);
            if (!dVar.f705a.c()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f706b.e(false);
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
        if (this.f690p != view) {
            this.f690p = view;
            this.f689o = o.d.a(this.f688n, o.d(view));
        }
    }

    @Override // android.support.v7.view.menu.h
    public void r(boolean z) {
        this.f697w = z;
    }

    @Override // android.support.v7.view.menu.h
    public void s(int i2) {
        if (this.f688n != i2) {
            this.f688n = i2;
            this.f689o = o.d.a(i2, o.d(this.f690p));
        }
    }

    @Override // android.support.v7.view.menu.h
    public void t(int i2) {
        this.f693s = true;
        this.f695u = i2;
    }

    @Override // android.support.v7.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // android.support.v7.view.menu.h
    public void v(boolean z) {
        this.x = z;
    }

    @Override // android.support.v7.view.menu.h
    public void w(int i2) {
        this.f694t = true;
        this.f696v = i2;
    }
}