package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.e;
import android.support.v7.widget.v0;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f646d = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    private e f647b;

    /* renamed from: c  reason: collision with root package name */
    private int f648c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        v0 t2 = v0.t(context, attributeSet, f646d, i2, 0);
        if (t2.q(0)) {
            setBackgroundDrawable(t2.f(0));
        }
        if (t2.q(1)) {
            setDivider(t2.f(1));
        }
        t2.u();
    }

    @Override // android.support.v7.view.menu.k
    public void b(e eVar) {
        this.f647b = eVar;
    }

    @Override // android.support.v7.view.menu.e.b
    public boolean c(g gVar) {
        return this.f647b.L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f648c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        c((g) getAdapter().getItem(i2));
    }
}