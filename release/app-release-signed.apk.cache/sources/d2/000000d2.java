package android.support.p002v7.view.menu;

import android.support.p002v7.view.menu.InterfaceC0203k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import p020s.C0575g;

/* renamed from: android.support.v7.view.menu.d */
/* loaded from: classes.dex */
public class C0191d extends BaseAdapter {

    /* renamed from: g */
    static final int f915g = C0575g.abc_popup_menu_item_layout;

    /* renamed from: b */
    C0192e f916b;

    /* renamed from: c */
    private int f917c = -1;

    /* renamed from: d */
    private boolean f918d;

    /* renamed from: e */
    private final boolean f919e;

    /* renamed from: f */
    private final LayoutInflater f920f;

    public C0191d(C0192e c0192e, LayoutInflater layoutInflater, boolean z) {
        this.f919e = z;
        this.f920f = layoutInflater;
        this.f916b = c0192e;
        m1655a();
    }

    /* renamed from: a */
    void m1655a() {
        C0196g m1609v = this.f916b.m1609v();
        if (m1609v != null) {
            ArrayList<C0196g> m1605z = this.f916b.m1605z();
            int size = m1605z.size();
            for (int i = 0; i < size; i++) {
                if (m1605z.get(i) == m1609v) {
                    this.f917c = i;
                    return;
                }
            }
        }
        this.f917c = -1;
    }

    /* renamed from: b */
    public C0192e m1654b() {
        return this.f916b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C0196g getItem(int i) {
        ArrayList<C0196g> m1605z = this.f919e ? this.f916b.m1605z() : this.f916b.m1648E();
        int i2 = this.f917c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m1605z.get(i);
    }

    /* renamed from: d */
    public void m1652d(boolean z) {
        this.f918d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0196g> m1605z = this.f919e ? this.f916b.m1605z() : this.f916b.m1648E();
        int i = this.f917c;
        int size = m1605z.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f920f.inflate(f915g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f916b.mo1543F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0203k.InterfaceC0204a interfaceC0204a = (InterfaceC0203k.InterfaceC0204a) view;
        if (this.f918d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0204a.mo1558d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m1655a();
        super.notifyDataSetChanged();
    }
}