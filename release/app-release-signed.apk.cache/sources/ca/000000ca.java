package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.widget.C0290l0;
import android.support.p002v7.widget.InterfaceC0288k0;
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
import p016o.C0474d;
import p016o.C0490o;
import p020s.C0572d;
import p020s.C0575g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0183b extends AbstractC0198h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    private PopupWindow.OnDismissListener f868A;

    /* renamed from: B */
    boolean f869B;

    /* renamed from: c */
    private final Context f870c;

    /* renamed from: d */
    private final int f871d;

    /* renamed from: e */
    private final int f872e;

    /* renamed from: f */
    private final int f873f;

    /* renamed from: g */
    private final boolean f874g;

    /* renamed from: h */
    final Handler f875h;

    /* renamed from: p */
    private View f883p;

    /* renamed from: q */
    View f884q;

    /* renamed from: s */
    private boolean f886s;

    /* renamed from: t */
    private boolean f887t;

    /* renamed from: u */
    private int f888u;

    /* renamed from: v */
    private int f889v;

    /* renamed from: x */
    private boolean f891x;

    /* renamed from: y */
    private InterfaceC0201j.InterfaceC0202a f892y;

    /* renamed from: z */
    private ViewTreeObserver f893z;

    /* renamed from: i */
    private final List<C0192e> f876i = new ArrayList();

    /* renamed from: j */
    final List<C0188d> f877j = new ArrayList();

    /* renamed from: k */
    private final ViewTreeObserver.OnGlobalLayoutListener f878k = new ViewTreeObserver$OnGlobalLayoutListenerC0184a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f879l = new View$OnAttachStateChangeListenerC0185b();

    /* renamed from: m */
    private final InterfaceC0288k0 f880m = new C0186c();

    /* renamed from: n */
    private int f881n = 0;

    /* renamed from: o */
    private int f882o = 0;

    /* renamed from: w */
    private boolean f890w = false;

    /* renamed from: r */
    private int f885r = m1664G();

    /* renamed from: android.support.v7.view.menu.b$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0184a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0184a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0183b.this.mo3c() || View$OnKeyListenerC0183b.this.f877j.size() <= 0 || View$OnKeyListenerC0183b.this.f877j.get(0).f901a.m1241p()) {
                return;
            }
            View view = View$OnKeyListenerC0183b.this.f884q;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0183b.this.dismiss();
                return;
            }
            for (C0188d c0188d : View$OnKeyListenerC0183b.this.f877j) {
                c0188d.f901a.mo1f();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.b$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0185b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0185b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (View$OnKeyListenerC0183b.this.f893z != null) {
                if (!View$OnKeyListenerC0183b.this.f893z.isAlive()) {
                    View$OnKeyListenerC0183b.this.f893z = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0183b.this.f893z.removeGlobalOnLayoutListener(View$OnKeyListenerC0183b.this.f878k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.support.v7.view.menu.b$c */
    /* loaded from: classes.dex */
    class C0186c implements InterfaceC0288k0 {

        /* renamed from: android.support.v7.view.menu.b$c$a */
        /* loaded from: classes.dex */
        class RunnableC0187a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0188d f897b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f898c;

            /* renamed from: d */
            final /* synthetic */ C0192e f899d;

            RunnableC0187a(C0188d c0188d, MenuItem menuItem, C0192e c0192e) {
                this.f897b = c0188d;
                this.f898c = menuItem;
                this.f899d = c0192e;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0188d c0188d = this.f897b;
                if (c0188d != null) {
                    View$OnKeyListenerC0183b.this.f869B = true;
                    c0188d.f902b.m1622e(false);
                    View$OnKeyListenerC0183b.this.f869B = false;
                }
                if (this.f898c.isEnabled() && this.f898c.hasSubMenu()) {
                    this.f899d.m1644L(this.f898c, 4);
                }
            }
        }

        C0186c() {
        }

        @Override // android.support.p002v7.widget.InterfaceC0288k0
        /* renamed from: a */
        public void mo1193a(C0192e c0192e, MenuItem menuItem) {
            View$OnKeyListenerC0183b.this.f875h.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0183b.this.f877j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0192e == View$OnKeyListenerC0183b.this.f877j.get(i).f902b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            View$OnKeyListenerC0183b.this.f875h.postAtTime(new RunnableC0187a(i2 < View$OnKeyListenerC0183b.this.f877j.size() ? View$OnKeyListenerC0183b.this.f877j.get(i2) : null, menuItem, c0192e), c0192e, SystemClock.uptimeMillis() + 200);
        }

        @Override // android.support.p002v7.widget.InterfaceC0288k0
        /* renamed from: b */
        public void mo1192b(C0192e c0192e, MenuItem menuItem) {
            View$OnKeyListenerC0183b.this.f875h.removeCallbacksAndMessages(c0192e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class C0188d {

        /* renamed from: a */
        public final C0290l0 f901a;

        /* renamed from: b */
        public final C0192e f902b;

        /* renamed from: c */
        public final int f903c;

        public C0188d(C0290l0 c0290l0, C0192e c0192e, int i) {
            this.f901a = c0290l0;
            this.f902b = c0192e;
            this.f903c = i;
        }

        /* renamed from: a */
        public ListView m1660a() {
            return this.f901a.mo2d();
        }
    }

    public View$OnKeyListenerC0183b(Context context, View view, int i, int i2, boolean z) {
        this.f870c = context;
        this.f883p = view;
        this.f872e = i;
        this.f873f = i2;
        this.f874g = z;
        Resources resources = context.getResources();
        this.f871d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0572d.abc_config_prefDialogWidth));
        this.f875h = new Handler();
    }

    /* renamed from: C */
    private C0290l0 m1668C() {
        C0290l0 c0290l0 = new C0290l0(this.f870c, null, this.f872e, this.f873f);
        c0290l0.m1195L(this.f880m);
        c0290l0.m1257C(this);
        c0290l0.m1258B(this);
        c0290l0.m1239s(this.f883p);
        c0290l0.m1235w(this.f882o);
        c0290l0.m1259A(true);
        c0290l0.m1232z(2);
        return c0290l0;
    }

    /* renamed from: D */
    private int m1667D(C0192e c0192e) {
        int size = this.f877j.size();
        for (int i = 0; i < size; i++) {
            if (c0192e == this.f877j.get(i).f902b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m1666E(C0192e c0192e, C0192e c0192e2) {
        int size = c0192e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0192e.getItem(i);
            if (item.hasSubMenu() && c0192e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m1665F(C0188d c0188d, C0192e c0192e) {
        C0191d c0191d;
        int i;
        int firstVisiblePosition;
        MenuItem m1666E = m1666E(c0188d.f902b, c0192e);
        if (m1666E == null) {
            return null;
        }
        ListView m1660a = c0188d.m1660a();
        ListAdapter adapter = m1660a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0191d = (C0191d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0191d = (C0191d) adapter;
            i = 0;
        }
        int count = c0191d.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (m1666E == c0191d.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m1660a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m1660a.getChildCount()) {
            return m1660a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    private int m1664G() {
        return C0490o.m408d(this.f883p) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    private int m1663H(int i) {
        List<C0188d> list = this.f877j;
        ListView m1660a = list.get(list.size() - 1).m1660a();
        int[] iArr = new int[2];
        m1660a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f884q.getWindowVisibleDisplayFrame(rect);
        return this.f885r == 1 ? (iArr[0] + m1660a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: I */
    private void m1662I(C0192e c0192e) {
        C0188d c0188d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f870c);
        C0191d c0191d = new C0191d(c0192e, from, this.f874g);
        if (!mo3c() && this.f890w) {
            c0191d.m1652d(true);
        } else if (mo3c()) {
            c0191d.m1652d(AbstractC0198h.m1574x(c0192e));
        }
        int m1576o = AbstractC0198h.m1576o(c0191d, null, this.f870c, this.f871d);
        C0290l0 m1668C = m1668C();
        m1668C.mo1054r(c0191d);
        m1668C.m1236v(m1576o);
        m1668C.m1235w(this.f882o);
        if (this.f877j.size() > 0) {
            List<C0188d> list = this.f877j;
            c0188d = list.get(list.size() - 1);
            view = m1665F(c0188d, c0192e);
        } else {
            c0188d = null;
            view = null;
        }
        if (view != null) {
            m1668C.m1194M(false);
            m1668C.m1197J(null);
            int m1663H = m1663H(m1576o);
            boolean z = m1663H == 1;
            this.f885r = m1663H;
            if (Build.VERSION.SDK_INT >= 26) {
                m1668C.m1239s(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f883p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f882o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f883p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f882o & 5) == 5) {
                if (!z) {
                    m1576o = view.getWidth();
                    i3 = i - m1576o;
                }
                i3 = i + m1576o;
            } else {
                if (z) {
                    m1576o = view.getWidth();
                    i3 = i + m1576o;
                }
                i3 = i - m1576o;
            }
            m1668C.m1233y(i3);
            m1668C.m1256D(true);
            m1668C.m1252H(i2);
        } else {
            if (this.f886s) {
                m1668C.m1233y(this.f888u);
            }
            if (this.f887t) {
                m1668C.m1252H(this.f889v);
            }
            m1668C.m1234x(m1577n());
        }
        this.f877j.add(new C0188d(m1668C, c0192e, this.f885r));
        m1668C.mo1f();
        ListView mo2d = m1668C.mo2d();
        mo2d.setOnKeyListener(this);
        if (c0188d == null && this.f891x && c0192e.m1607x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0575g.abc_popup_menu_header_item_layout, (ViewGroup) mo2d, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0192e.m1607x());
            mo2d.addHeaderView(frameLayout, null, false);
            m1668C.mo1f();
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: a */
    public void mo1347a(C0192e c0192e, boolean z) {
        int m1667D = m1667D(c0192e);
        if (m1667D < 0) {
            return;
        }
        int i = m1667D + 1;
        if (i < this.f877j.size()) {
            this.f877j.get(i).f902b.m1622e(false);
        }
        C0188d remove = this.f877j.remove(m1667D);
        remove.f902b.m1641O(this);
        if (this.f869B) {
            remove.f901a.m1196K(null);
            remove.f901a.m1238t(0);
        }
        remove.f901a.dismiss();
        int size = this.f877j.size();
        this.f885r = size > 0 ? this.f877j.get(size - 1).f903c : m1664G();
        if (size != 0) {
            if (z) {
                this.f877j.get(0).f902b.m1622e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f892y;
        if (interfaceC0202a != null) {
            interfaceC0202a.mo184a(c0192e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f893z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f893z.removeGlobalOnLayoutListener(this.f878k);
            }
            this.f893z = null;
        }
        this.f884q.removeOnAttachStateChangeListener(this.f879l);
        this.f868A.onDismiss();
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: b */
    public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
        for (C0188d c0188d : this.f877j) {
            if (subMenuC0208m == c0188d.f902b) {
                c0188d.m1660a().requestFocus();
                return true;
            }
        }
        if (subMenuC0208m.hasVisibleItems()) {
            mo1553l(subMenuC0208m);
            InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f892y;
            if (interfaceC0202a != null) {
                interfaceC0202a.mo183b(subMenuC0208m);
            }
            return true;
        }
        return false;
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: c */
    public boolean mo3c() {
        return this.f877j.size() > 0 && this.f877j.get(0).f901a.mo3c();
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: d */
    public ListView mo2d() {
        if (this.f877j.isEmpty()) {
            return null;
        }
        List<C0188d> list = this.f877j;
        return list.get(list.size() - 1).m1660a();
    }

    @Override // p024w.InterfaceC0610h
    public void dismiss() {
        int size = this.f877j.size();
        if (size > 0) {
            C0188d[] c0188dArr = (C0188d[]) this.f877j.toArray(new C0188d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0188d c0188d = c0188dArr[i];
                if (c0188d.f901a.mo3c()) {
                    c0188d.f901a.dismiss();
                }
            }
        }
    }

    @Override // p024w.InterfaceC0610h
    /* renamed from: f */
    public void mo1f() {
        if (mo3c()) {
            return;
        }
        for (C0192e c0192e : this.f876i) {
            m1662I(c0192e);
        }
        this.f876i.clear();
        View view = this.f883p;
        this.f884q = view;
        if (view != null) {
            boolean z = this.f893z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f893z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f878k);
            }
            this.f884q.addOnAttachStateChangeListener(this.f879l);
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
        for (C0188d c0188d : this.f877j) {
            AbstractC0198h.m1573y(c0188d.m1660a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: j */
    public void mo1554j(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        this.f892y = interfaceC0202a;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: l */
    public void mo1553l(C0192e c0192e) {
        c0192e.m1626c(this, this.f870c);
        if (mo3c()) {
            m1662I(c0192e);
        } else {
            this.f876i.add(c0192e);
        }
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: m */
    protected boolean mo1578m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0188d c0188d;
        int size = this.f877j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0188d = null;
                break;
            }
            c0188d = this.f877j.get(i);
            if (!c0188d.f901a.mo3c()) {
                break;
            }
            i++;
        }
        if (c0188d != null) {
            c0188d.f902b.m1622e(false);
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
        if (this.f883p != view) {
            this.f883p = view;
            this.f882o = C0474d.m456a(this.f881n, C0490o.m408d(view));
        }
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: r */
    public void mo1551r(boolean z) {
        this.f890w = z;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: s */
    public void mo1550s(int i) {
        if (this.f881n != i) {
            this.f881n = i;
            this.f882o = C0474d.m456a(i, C0490o.m408d(this.f883p));
        }
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: t */
    public void mo1549t(int i) {
        this.f886s = true;
        this.f888u = i;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: u */
    public void mo1548u(PopupWindow.OnDismissListener onDismissListener) {
        this.f868A = onDismissListener;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: v */
    public void mo1547v(boolean z) {
        this.f891x = z;
    }

    @Override // android.support.p002v7.view.menu.AbstractC0198h
    /* renamed from: w */
    public void mo1546w(int i) {
        this.f887t = true;
        this.f889v = i;
    }
}