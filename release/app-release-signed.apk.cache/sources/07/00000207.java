package o;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f1696a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f1697b;

    /* renamed from: c  reason: collision with root package name */
    private final View f1698c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1699d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f1700e;

    public i(View view) {
        this.f1698c = view;
    }

    private ViewParent g(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.f1697b;
        }
        return this.f1696a;
    }

    private void l(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f1696a = viewParent;
        } else if (i2 != 1) {
        } else {
            this.f1697b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return r.a(g2, this.f1698c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return r.b(g2, this.f1698c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2) {
        return d(i2, i3, iArr, iArr2, 0);
    }

    public boolean d(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        if (!j() || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1698c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f1700e == null) {
                this.f1700e = new int[2];
            }
            iArr = this.f1700e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        r.c(g2, this.f1698c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f1698c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0);
    }

    public boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        ViewParent g2;
        int i7;
        int i8;
        if (!j() || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1698c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        r.d(g2, this.f1698c, i2, i3, i4, i5, i6);
        if (iArr != null) {
            this.f1698c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public boolean h() {
        return i(0);
    }

    public boolean i(int i2) {
        return g(i2) != null;
    }

    public boolean j() {
        return this.f1699d;
    }

    public void k(boolean z) {
        if (this.f1699d) {
            o.y(this.f1698c);
        }
        this.f1699d = z;
    }

    public boolean m(int i2) {
        return n(i2, 0);
    }

    public boolean n(int i2, int i3) {
        if (i(i3)) {
            return true;
        }
        if (j()) {
            View view = this.f1698c;
            for (ViewParent parent = this.f1698c.getParent(); parent != null; parent = parent.getParent()) {
                if (r.f(parent, view, this.f1698c, i2, i3)) {
                    l(i3, parent);
                    r.e(parent, view, this.f1698c, i2, i3);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void o() {
        p(0);
    }

    public void p(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            r.g(g2, this.f1698c, i2);
            l(i2, null);
        }
    }
}