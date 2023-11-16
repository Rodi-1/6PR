package android.support.p002v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p024w.InterfaceC0610h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.h */
/* loaded from: classes.dex */
public abstract class AbstractC0198h implements InterfaceC0610h, InterfaceC0201j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private Rect f988b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static int m1576o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public static boolean m1574x(C0192e c0192e) {
        int size = c0192e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0192e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public static C0191d m1573y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0191d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0191d) listAdapter;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: e */
    public boolean mo1413e(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: h */
    public boolean mo1412h(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: k */
    public void mo1342k(Context context, C0192e c0192e) {
    }

    /* renamed from: l */
    public abstract void mo1553l(C0192e c0192e);

    /* renamed from: m */
    protected boolean mo1578m() {
        return true;
    }

    /* renamed from: n */
    public Rect m1577n() {
        return this.f988b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1573y(listAdapter).f916b.m1643M((MenuItem) listAdapter.getItem(i), this, mo1578m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo1552p(View view);

    /* renamed from: q */
    public void m1575q(Rect rect) {
        this.f988b = rect;
    }

    /* renamed from: r */
    public abstract void mo1551r(boolean z);

    /* renamed from: s */
    public abstract void mo1550s(int i);

    /* renamed from: t */
    public abstract void mo1549t(int i);

    /* renamed from: u */
    public abstract void mo1548u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo1547v(boolean z);

    /* renamed from: w */
    public abstract void mo1546w(int i);
}