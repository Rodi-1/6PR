package android.support.p001v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.h */
/* loaded from: classes.dex */
public class C0155h extends AbstractView$OnTouchListenerC0135a {

    /* renamed from: t */
    private final ListView f699t;

    public C0155h(ListView listView) {
        super(listView);
        this.f699t = listView;
    }

    @Override // android.support.p001v4.widget.AbstractView$OnTouchListenerC0135a
    /* renamed from: a */
    public boolean mo1732a(int i) {
        return false;
    }

    @Override // android.support.p001v4.widget.AbstractView$OnTouchListenerC0135a
    /* renamed from: b */
    public boolean mo1731b(int i) {
        ListView listView = this.f699t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.p001v4.widget.AbstractView$OnTouchListenerC0135a
    /* renamed from: j */
    public void mo1730j(int i, int i2) {
        C0156i.m1729a(this.f699t, i2);
    }
}