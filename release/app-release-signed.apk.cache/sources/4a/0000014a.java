package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1124a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1125b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1126c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1127d;

    public o(ImageView imageView) {
        this.f1124a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1127d == null) {
            this.f1127d = new t0();
        }
        t0 t0Var = this.f1127d;
        t0Var.a();
        ColorStateList a2 = android.support.v4.widget.g.a(this.f1124a);
        if (a2 != null) {
            t0Var.f1193d = true;
            t0Var.f1190a = a2;
        }
        PorterDuff.Mode b2 = android.support.v4.widget.g.b(this.f1124a);
        if (b2 != null) {
            t0Var.f1192c = true;
            t0Var.f1191b = b2;
        }
        if (t0Var.f1193d || t0Var.f1192c) {
            k.C(drawable, t0Var, this.f1124a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f1125b != null : i2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1124a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            t0 t0Var = this.f1126c;
            if (t0Var != null) {
                k.C(drawable, t0Var, this.f1124a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1125b;
            if (t0Var2 != null) {
                k.C(drawable, t0Var2, this.f1124a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        t0 t0Var = this.f1126c;
        if (t0Var != null) {
            return t0Var.f1190a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        t0 t0Var = this.f1126c;
        if (t0Var != null) {
            return t0Var.f1191b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1124a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int m2;
        v0 t2 = v0.t(this.f1124a.getContext(), attributeSet, s.j.N, i2, 0);
        try {
            Drawable drawable = this.f1124a.getDrawable();
            if (drawable == null && (m2 = t2.m(s.j.O, -1)) != -1 && (drawable = t.b.d(this.f1124a.getContext(), m2)) != null) {
                this.f1124a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i3 = s.j.P;
            if (t2.q(i3)) {
                android.support.v4.widget.g.c(this.f1124a, t2.c(i3));
            }
            int i4 = s.j.Q;
            if (t2.q(i4)) {
                android.support.v4.widget.g.d(this.f1124a, e0.d(t2.j(i4, -1), null));
            }
        } finally {
            t2.u();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable d2 = t.b.d(this.f1124a.getContext(), i2);
            if (d2 != null) {
                e0.b(d2);
            }
            this.f1124a.setImageDrawable(d2);
        } else {
            this.f1124a.setImageDrawable(null);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f1126c == null) {
            this.f1126c = new t0();
        }
        t0 t0Var = this.f1126c;
        t0Var.f1190a = colorStateList;
        t0Var.f1193d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f1126c == null) {
            this.f1126c = new t0();
        }
        t0 t0Var = this.f1126c;
        t0Var.f1191b = mode;
        t0Var.f1192c = true;
        b();
    }
}