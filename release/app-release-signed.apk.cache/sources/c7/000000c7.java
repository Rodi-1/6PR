package android.support.p002v7.view.menu;

import android.content.Context;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.widget.C0316v0;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0192e.InterfaceC0194b, InterfaceC0203k, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private static final int[] f837d = {16842964, 16843049};

    /* renamed from: b */
    private C0192e f838b;

    /* renamed from: c */
    private int f839c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0316v0 m1108t = C0316v0.m1108t(context, attributeSet, f837d, i, 0);
        if (m1108t.m1111q(0)) {
            setBackgroundDrawable(m1108t.m1122f(0));
        }
        if (m1108t.m1111q(1)) {
            setDivider(m1108t.m1122f(1));
        }
        m1108t.m1107u();
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k
    /* renamed from: b */
    public void mo1499b(C0192e c0192e) {
        this.f838b = c0192e;
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0194b
    /* renamed from: c */
    public boolean mo1498c(C0196g c0196g) {
        return this.f838b.m1644L(c0196g, 0);
    }

    public int getWindowAnimations() {
        return this.f839c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1498c((C0196g) getAdapter().getItem(i));
    }
}