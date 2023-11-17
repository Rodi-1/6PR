package android.support.v7.view.menu;

import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    static final int f719g = s.g.abc_popup_menu_item_layout;

    /* renamed from: b  reason: collision with root package name */
    e f720b;

    /* renamed from: c  reason: collision with root package name */
    private int f721c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f722d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f723e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f724f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z) {
        this.f723e = z;
        this.f724f = layoutInflater;
        this.f720b = eVar;
        a();
    }

    void a() {
        g v2 = this.f720b.v();
        if (v2 != null) {
            ArrayList<g> z = this.f720b.z();
            int size = z.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z.get(i2) == v2) {
                    this.f721c = i2;
                    return;
                }
            }
        }
        this.f721c = -1;
    }

    public e b() {
        return this.f720b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i2) {
        ArrayList<g> z = this.f723e ? this.f720b.z() : this.f720b.E();
        int i3 = this.f721c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return z.get(i2);
    }

    public void d(boolean z) {
        this.f722d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z = this.f723e ? this.f720b.z() : this.f720b.E();
        int i2 = this.f721c;
        int size = z.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f724f.inflate(f719g, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f720b.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f722d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}