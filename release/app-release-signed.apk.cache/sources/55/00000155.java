package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class r extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1179b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1180a;

    static {
        f1179b = Build.VERSION.SDK_INT < 21;
    }

    public r(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        v0 t2 = v0.t(context, attributeSet, s.j.O1, i2, i3);
        int i4 = s.j.Q1;
        if (t2.q(i4)) {
            b(t2.a(i4, false));
        }
        setBackgroundDrawable(t2.f(s.j.P1));
        t2.u();
    }

    private void b(boolean z) {
        if (f1179b) {
            this.f1180a = z;
        } else {
            android.support.v4.widget.j.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f1179b && this.f1180a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1179b && this.f1180a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f1179b && this.f1180a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}