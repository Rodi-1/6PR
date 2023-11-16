package android.support.p002v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p001v4.widget.C0157j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.r */
/* loaded from: classes.dex */
class C0307r extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1487b;

    /* renamed from: a */
    private boolean f1488a;

    static {
        f1487b = Build.VERSION.SDK_INT < 21;
    }

    public C0307r(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1136a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1136a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0316v0 m1108t = C0316v0.m1108t(context, attributeSet, C0578j.f2479O1, i, i2);
        int i3 = C0578j.f2487Q1;
        if (m1108t.m1111q(i3)) {
            m1135b(m1108t.m1127a(i3, false));
        }
        setBackgroundDrawable(m1108t.m1122f(C0578j.f2483P1));
        m1108t.m1107u();
    }

    /* renamed from: b */
    private void m1135b(boolean z) {
        if (f1487b) {
            this.f1488a = z;
        } else {
            C0157j.m1728a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1487b && this.f1488a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1487b && this.f1488a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1487b && this.f1488a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}