package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    Context f708b;

    /* renamed from: c  reason: collision with root package name */
    LayoutInflater f709c;

    /* renamed from: d  reason: collision with root package name */
    e f710d;

    /* renamed from: e  reason: collision with root package name */
    ExpandedMenuView f711e;

    /* renamed from: f  reason: collision with root package name */
    int f712f;

    /* renamed from: g  reason: collision with root package name */
    int f713g;

    /* renamed from: h  reason: collision with root package name */
    int f714h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f715i;

    /* renamed from: j  reason: collision with root package name */
    a f716j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f717b = -1;

        public a() {
            a();
        }

        void a() {
            g v2 = c.this.f710d.v();
            if (v2 != null) {
                ArrayList<g> z = c.this.f710d.z();
                int size = z.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (z.get(i2) == v2) {
                        this.f717b = i2;
                        return;
                    }
                }
            }
            this.f717b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i2) {
            ArrayList<g> z = c.this.f710d.z();
            int i3 = i2 + c.this.f712f;
            int i4 = this.f717b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return z.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f710d.z().size() - c.this.f712f;
            return this.f717b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f709c.inflate(cVar.f714h, viewGroup, false);
            }
            ((k.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i2, int i3) {
        this.f714h = i2;
        this.f713g = i3;
    }

    public c(Context context, int i2) {
        this(i2, 0);
        this.f708b = context;
        this.f709c = LayoutInflater.from(context);
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.f715i;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        if (mVar.hasVisibleItems()) {
            new f(mVar).d(null);
            j.a aVar = this.f715i;
            if (aVar != null) {
                aVar.b(mVar);
                return true;
            }
            return true;
        }
        return false;
    }

    public ListAdapter c() {
        if (this.f716j == null) {
            this.f716j = new a();
        }
        return this.f716j;
    }

    public k d(ViewGroup viewGroup) {
        if (this.f711e == null) {
            this.f711e = (ExpandedMenuView) this.f709c.inflate(s.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f716j == null) {
                this.f716j = new a();
            }
            this.f711e.setAdapter((ListAdapter) this.f716j);
            this.f711e.setOnItemClickListener(this);
        }
        return this.f711e;
    }

    @Override // android.support.v7.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void i(boolean z) {
        a aVar = this.f716j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public void j(j.a aVar) {
        this.f715i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.content.Context r3, android.support.v7.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f713g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f713g
            r0.<init>(r3, r1)
            r2.f708b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f709c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f708b
            if (r0 == 0) goto L23
            r2.f708b = r3
            android.view.LayoutInflater r0 = r2.f709c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f710d = r4
            android.support.v7.view.menu.c$a r3 = r2.f716j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.c.k(android.content.Context, android.support.v7.view.menu.e):void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f710d.M(this.f716j.getItem(i2), this, 0);
    }
}