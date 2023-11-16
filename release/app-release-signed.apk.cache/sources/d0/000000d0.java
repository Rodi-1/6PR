package android.support.p002v7.view.menu;

import android.content.Context;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p020s.C0575g;

/* renamed from: android.support.v7.view.menu.c */
/* loaded from: classes.dex */
public class C0189c implements InterfaceC0201j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f904b;

    /* renamed from: c */
    LayoutInflater f905c;

    /* renamed from: d */
    C0192e f906d;

    /* renamed from: e */
    ExpandedMenuView f907e;

    /* renamed from: f */
    int f908f;

    /* renamed from: g */
    int f909g;

    /* renamed from: h */
    int f910h;

    /* renamed from: i */
    private InterfaceC0201j.InterfaceC0202a f911i;

    /* renamed from: j */
    C0190a f912j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.c$a */
    /* loaded from: classes.dex */
    public class C0190a extends BaseAdapter {

        /* renamed from: b */
        private int f913b = -1;

        public C0190a() {
            m1657a();
        }

        /* renamed from: a */
        void m1657a() {
            C0196g m1609v = C0189c.this.f906d.m1609v();
            if (m1609v != null) {
                ArrayList<C0196g> m1605z = C0189c.this.f906d.m1605z();
                int size = m1605z.size();
                for (int i = 0; i < size; i++) {
                    if (m1605z.get(i) == m1609v) {
                        this.f913b = i;
                        return;
                    }
                }
            }
            this.f913b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0196g getItem(int i) {
            ArrayList<C0196g> m1605z = C0189c.this.f906d.m1605z();
            int i2 = i + C0189c.this.f908f;
            int i3 = this.f913b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m1605z.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0189c.this.f906d.m1605z().size() - C0189c.this.f908f;
            return this.f913b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0189c c0189c = C0189c.this;
                view = c0189c.f905c.inflate(c0189c.f910h, viewGroup, false);
            }
            ((InterfaceC0203k.InterfaceC0204a) view).mo1558d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m1657a();
            super.notifyDataSetChanged();
        }
    }

    public C0189c(int i, int i2) {
        this.f910h = i;
        this.f909g = i2;
    }

    public C0189c(Context context, int i) {
        this(i, 0);
        this.f904b = context;
        this.f905c = LayoutInflater.from(context);
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: a */
    public void mo1347a(C0192e c0192e, boolean z) {
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f911i;
        if (interfaceC0202a != null) {
            interfaceC0202a.mo184a(c0192e, z);
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: b */
    public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
        if (subMenuC0208m.hasVisibleItems()) {
            new DialogInterface$OnKeyListenerC0195f(subMenuC0208m).m1603d(null);
            InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f911i;
            if (interfaceC0202a != null) {
                interfaceC0202a.mo183b(subMenuC0208m);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public ListAdapter m1659c() {
        if (this.f912j == null) {
            this.f912j = new C0190a();
        }
        return this.f912j;
    }

    /* renamed from: d */
    public InterfaceC0203k m1658d(ViewGroup viewGroup) {
        if (this.f907e == null) {
            this.f907e = (ExpandedMenuView) this.f905c.inflate(C0575g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f912j == null) {
                this.f912j = new C0190a();
            }
            this.f907e.setAdapter((ListAdapter) this.f912j);
            this.f907e.setOnItemClickListener(this);
        }
        return this.f907e;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: e */
    public boolean mo1413e(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: g */
    public boolean mo1344g() {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: h */
    public boolean mo1412h(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: i */
    public void mo1343i(boolean z) {
        C0190a c0190a = this.f912j;
        if (c0190a != null) {
            c0190a.notifyDataSetChanged();
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: j */
    public void mo1554j(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        this.f911i = interfaceC0202a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1342k(android.content.Context r3, android.support.p002v7.view.menu.C0192e r4) {
        /*
            r2 = this;
            int r0 = r2.f909g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f909g
            r0.<init>(r3, r1)
            r2.f904b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f905c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f904b
            if (r0 == 0) goto L23
            r2.f904b = r3
            android.view.LayoutInflater r0 = r2.f905c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f906d = r4
            android.support.v7.view.menu.c$a r3 = r2.f912j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.view.menu.C0189c.mo1342k(android.content.Context, android.support.v7.view.menu.e):void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f906d.m1643M(this.f912j.getItem(i), this, 0);
    }
}