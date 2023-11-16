package android.support.p002v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p001v4.widget.C0151g;
import android.util.AttributeSet;
import android.widget.ImageView;
import p020s.C0578j;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.o */
/* loaded from: classes.dex */
public class C0296o {

    /* renamed from: a */
    private final ImageView f1428a;

    /* renamed from: b */
    private C0312t0 f1429b;

    /* renamed from: c */
    private C0312t0 f1430c;

    /* renamed from: d */
    private C0312t0 f1431d;

    public C0296o(ImageView imageView) {
        this.f1428a = imageView;
    }

    /* renamed from: a */
    private boolean m1180a(Drawable drawable) {
        if (this.f1431d == null) {
            this.f1431d = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1431d;
        c0312t0.m1128a();
        ColorStateList m1740a = C0151g.m1740a(this.f1428a);
        if (m1740a != null) {
            c0312t0.f1501d = true;
            c0312t0.f1498a = m1740a;
        }
        PorterDuff.Mode m1739b = C0151g.m1739b(this.f1428a);
        if (m1739b != null) {
            c0312t0.f1500c = true;
            c0312t0.f1499b = m1739b;
        }
        if (c0312t0.f1501d || c0312t0.f1500c) {
            C0283k.m1229C(drawable, c0312t0, this.f1428a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m1171j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1429b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1179b() {
        Drawable drawable = this.f1428a.getDrawable();
        if (drawable != null) {
            C0258e0.m1323b(drawable);
        }
        if (drawable != null) {
            if (m1171j() && m1180a(drawable)) {
                return;
            }
            C0312t0 c0312t0 = this.f1430c;
            if (c0312t0 != null) {
                C0283k.m1229C(drawable, c0312t0, this.f1428a.getDrawableState());
                return;
            }
            C0312t0 c0312t02 = this.f1429b;
            if (c0312t02 != null) {
                C0283k.m1229C(drawable, c0312t02, this.f1428a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1178c() {
        C0312t0 c0312t0 = this.f1430c;
        if (c0312t0 != null) {
            return c0312t0.f1498a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1177d() {
        C0312t0 c0312t0 = this.f1430c;
        if (c0312t0 != null) {
            return c0312t0.f1499b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1176e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1428a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m1175f(AttributeSet attributeSet, int i) {
        int m1115m;
        C0316v0 m1108t = C0316v0.m1108t(this.f1428a.getContext(), attributeSet, C0578j.f2473N, i, 0);
        try {
            Drawable drawable = this.f1428a.getDrawable();
            if (drawable == null && (m1115m = m1108t.m1115m(C0578j.f2477O, -1)) != -1 && (drawable = C0580b.m98d(this.f1428a.getContext(), m1115m)) != null) {
                this.f1428a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0258e0.m1323b(drawable);
            }
            int i2 = C0578j.f2481P;
            if (m1108t.m1111q(i2)) {
                C0151g.m1738c(this.f1428a, m1108t.m1125c(i2));
            }
            int i3 = C0578j.f2485Q;
            if (m1108t.m1111q(i3)) {
                C0151g.m1737d(this.f1428a, C0258e0.m1321d(m1108t.m1118j(i3, -1), null));
            }
        } finally {
            m1108t.m1107u();
        }
    }

    /* renamed from: g */
    public void m1174g(int i) {
        if (i != 0) {
            Drawable m98d = C0580b.m98d(this.f1428a.getContext(), i);
            if (m98d != null) {
                C0258e0.m1323b(m98d);
            }
            this.f1428a.setImageDrawable(m98d);
        } else {
            this.f1428a.setImageDrawable(null);
        }
        m1179b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1173h(ColorStateList colorStateList) {
        if (this.f1430c == null) {
            this.f1430c = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1430c;
        c0312t0.f1498a = colorStateList;
        c0312t0.f1501d = true;
        m1179b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1172i(PorterDuff.Mode mode) {
        if (this.f1430c == null) {
            this.f1430c = new C0312t0();
        }
        C0312t0 c0312t0 = this.f1430c;
        c0312t0.f1499b = mode;
        c0312t0.f1500c = true;
        m1179b();
    }
}