package android.support.v4.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: t  reason: collision with root package name */
    private final ListView f549t;

    public h(ListView listView) {
        super(listView);
        this.f549t = listView;
    }

    @Override // android.support.v4.widget.a
    public boolean a(int i2) {
        return false;
    }

    @Override // android.support.v4.widget.a
    public boolean b(int i2) {
        ListView listView = this.f549t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (i2 > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i2 >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.v4.widget.a
    public void j(int i2, int i3) {
        i.a(this.f549t, i3);
    }
}