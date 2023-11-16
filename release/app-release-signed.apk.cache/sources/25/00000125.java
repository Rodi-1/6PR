package android.support.p002v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p016o.C0490o;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.f */
/* loaded from: classes.dex */
class C0259f {

    /* renamed from: a */
    private final View f1289a;

    /* renamed from: d */
    private C0312t0 f1292d;

    /* renamed from: e */
    private C0312t0 f1293e;

    /* renamed from: f */
    private C0312t0 f1294f;

    /* renamed from: c */
    private int f1291c = -1;

    /* renamed from: b */
    private final C0283k f1290b = C0283k.m1214n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0259f(View view) {
        this.f1289a = view;
    }

    /* renamed from: a */
    private boolean m1320a(Drawable drawable) {
        if (this.f1294f == null) {
            this.f1294f = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1294f;
        c0312t0.m1128a();
        ColorStateList m410b = C0490o.m410b(this.f1289a);
        if (m410b != null) {
            c0312t0.f1501d = true;
            c0312t0.f1498a = m410b;
        }
        PorterDuff.Mode m409c = C0490o.m409c(this.f1289a);
        if (m409c != null) {
            c0312t0.f1500c = true;
            c0312t0.f1499b = m409c;
        }
        if (c0312t0.f1501d || c0312t0.f1500c) {
            C0283k.m1229C(drawable, c0312t0, this.f1289a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m1310k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1292d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1319b() {
        Drawable background = this.f1289a.getBackground();
        if (background != null) {
            if (m1310k() && m1320a(background)) {
                return;
            }
            C0312t0 c0312t0 = this.f1293e;
            if (c0312t0 != null) {
                C0283k.m1229C(background, c0312t0, this.f1289a.getDrawableState());
                return;
            }
            C0312t0 c0312t02 = this.f1292d;
            if (c0312t02 != null) {
                C0283k.m1229C(background, c0312t02, this.f1289a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1318c() {
        C0312t0 c0312t0 = this.f1293e;
        if (c0312t0 != null) {
            return c0312t0.f1498a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1317d() {
        C0312t0 c0312t0 = this.f1293e;
        if (c0312t0 != null) {
            return c0312t0.f1499b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1316e(AttributeSet attributeSet, int i) {
        C0316v0 m1108t = C0316v0.m1108t(this.f1289a.getContext(), attributeSet, C0578j.f2500T2, i, 0);
        try {
            int i2 = C0578j.f2504U2;
            if (m1108t.m1111q(i2)) {
                this.f1291c = m1108t.m1115m(i2, -1);
                ColorStateList m1209s = this.f1290b.m1209s(this.f1289a.getContext(), this.f1291c);
                if (m1209s != null) {
                    m1313h(m1209s);
                }
            }
            int i3 = C0578j.f2508V2;
            if (m1108t.m1111q(i3)) {
                C0490o.m393s(this.f1289a, m1108t.m1125c(i3));
            }
            int i4 = C0578j.f2512W2;
            if (m1108t.m1111q(i4)) {
                C0490o.m392t(this.f1289a, C0258e0.m1321d(m1108t.m1118j(i4, -1), null));
            }
        } finally {
            m1108t.m1107u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1315f(Drawable drawable) {
        this.f1291c = -1;
        m1313h(null);
        m1319b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1314g(int i) {
        this.f1291c = i;
        C0283k c0283k = this.f1290b;
        m1313h(c0283k != null ? c0283k.m1209s(this.f1289a.getContext(), i) : null);
        m1319b();
    }

    /* renamed from: h */
    void m1313h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1292d == null) {
                this.f1292d = new C0312t0();
            }
            C0312t0 c0312t0 = this.f1292d;
            c0312t0.f1498a = colorStateList;
            c0312t0.f1501d = true;
        } else {
            this.f1292d = null;
        }
        m1319b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1312i(ColorStateList colorStateList) {
        if (this.f1293e == null) {
            this.f1293e = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1293e;
        c0312t0.f1498a = colorStateList;
        c0312t0.f1501d = true;
        m1319b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1311j(PorterDuff.Mode mode) {
        if (this.f1293e == null) {
            this.f1293e = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1293e;
        c0312t0.f1499b = mode;
        c0312t0.f1500c = true;
        m1319b();
    }
}