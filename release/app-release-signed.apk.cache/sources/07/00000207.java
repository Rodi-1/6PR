package p016o;

import android.view.View;
import android.view.ViewParent;

/* renamed from: o.i */
/* loaded from: classes.dex */
public class C0484i {

    /* renamed from: a */
    private ViewParent f2214a;

    /* renamed from: b */
    private ViewParent f2215b;

    /* renamed from: c */
    private final View f2216c;

    /* renamed from: d */
    private boolean f2217d;

    /* renamed from: e */
    private int[] f2218e;

    public C0484i(View view) {
        this.f2216c = view;
    }

    /* renamed from: g */
    private ViewParent m431g(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f2215b;
        }
        return this.f2214a;
    }

    /* renamed from: l */
    private void m426l(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2214a = viewParent;
        } else if (i != 1) {
        } else {
            this.f2215b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m437a(float f, float f2, boolean z) {
        ViewParent m431g;
        if (!m428j() || (m431g = m431g(0)) == null) {
            return false;
        }
        return C0507r.m358a(m431g, this.f2216c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m436b(float f, float f2) {
        ViewParent m431g;
        if (!m428j() || (m431g = m431g(0)) == null) {
            return false;
        }
        return C0507r.m357b(m431g, this.f2216c, f, f2);
    }

    /* renamed from: c */
    public boolean m435c(int i, int i2, int[] iArr, int[] iArr2) {
        return m434d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m434d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m431g;
        int i4;
        int i5;
        if (!m428j() || (m431g = m431g(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2216c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f2218e == null) {
                this.f2218e = new int[2];
            }
            iArr = this.f2218e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0507r.m356c(m431g, this.f2216c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f2216c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public boolean m433e(int i, int i2, int i3, int i4, int[] iArr) {
        return m432f(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: f */
    public boolean m432f(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent m431g;
        int i6;
        int i7;
        if (!m428j() || (m431g = m431g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2216c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        C0507r.m355d(m431g, this.f2216c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f2216c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m430h() {
        return m429i(0);
    }

    /* renamed from: i */
    public boolean m429i(int i) {
        return m431g(i) != null;
    }

    /* renamed from: j */
    public boolean m428j() {
        return this.f2217d;
    }

    /* renamed from: k */
    public void m427k(boolean z) {
        if (this.f2217d) {
            C0490o.m387y(this.f2216c);
        }
        this.f2217d = z;
    }

    /* renamed from: m */
    public boolean m425m(int i) {
        return m424n(i, 0);
    }

    /* renamed from: n */
    public boolean m424n(int i, int i2) {
        if (m429i(i2)) {
            return true;
        }
        if (m428j()) {
            View view = this.f2216c;
            for (ViewParent parent = this.f2216c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0507r.m353f(parent, view, this.f2216c, i, i2)) {
                    m426l(i2, parent);
                    C0507r.m354e(parent, view, this.f2216c, i, i2);
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

    /* renamed from: o */
    public void m423o() {
        m422p(0);
    }

    /* renamed from: p */
    public void m422p(int i) {
        ViewParent m431g = m431g(i);
        if (m431g != null) {
            C0507r.m352g(m431g, this.f2216c, i);
            m426l(i, null);
        }
    }
}