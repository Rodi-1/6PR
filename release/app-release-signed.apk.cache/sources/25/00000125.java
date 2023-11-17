package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final View f1001a;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1004d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1005e;

    /* renamed from: f  reason: collision with root package name */
    private t0 f1006f;

    /* renamed from: c  reason: collision with root package name */
    private int f1003c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final k f1002b = k.n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(View view) {
        this.f1001a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1006f == null) {
            this.f1006f = new t0();
        }
        t0 t0Var = this.f1006f;
        t0Var.a();
        ColorStateList b2 = o.o.b(this.f1001a);
        if (b2 != null) {
            t0Var.f1193d = true;
            t0Var.f1190a = b2;
        }
        PorterDuff.Mode c2 = o.o.c(this.f1001a);
        if (c2 != null) {
            t0Var.f1192c = true;
            t0Var.f1191b = c2;
        }
        if (t0Var.f1193d || t0Var.f1192c) {
            k.C(drawable, t0Var, this.f1001a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f1004d != null : i2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1001a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            t0 t0Var = this.f1005e;
            if (t0Var != null) {
                k.C(background, t0Var, this.f1001a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1004d;
            if (t0Var2 != null) {
                k.C(background, t0Var2, this.f1001a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        t0 t0Var = this.f1005e;
        if (t0Var != null) {
            return t0Var.f1190a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        t0 t0Var = this.f1005e;
        if (t0Var != null) {
            return t0Var.f1191b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        v0 t2 = v0.t(this.f1001a.getContext(), attributeSet, s.j.T2, i2, 0);
        try {
            int i3 = s.j.U2;
            if (t2.q(i3)) {
                this.f1003c = t2.m(i3, -1);
                ColorStateList s2 = this.f1002b.s(this.f1001a.getContext(), this.f1003c);
                if (s2 != null) {
                    h(s2);
                }
            }
            int i4 = s.j.V2;
            if (t2.q(i4)) {
                o.o.s(this.f1001a, t2.c(i4));
            }
            int i5 = s.j.W2;
            if (t2.q(i5)) {
                o.o.t(this.f1001a, e0.d(t2.j(i5, -1), null));
            }
        } finally {
            t2.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1003c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i2) {
        this.f1003c = i2;
        k kVar = this.f1002b;
        h(kVar != null ? kVar.s(this.f1001a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1004d == null) {
                this.f1004d = new t0();
            }
            t0 t0Var = this.f1004d;
            t0Var.f1190a = colorStateList;
            t0Var.f1193d = true;
        } else {
            this.f1004d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1005e == null) {
            this.f1005e = new t0();
        }
        t0 t0Var = this.f1005e;
        t0Var.f1190a = colorStateList;
        t0Var.f1193d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1005e == null) {
            this.f1005e = new t0();
        }
        t0 t0Var = this.f1005e;
        t0Var.f1191b = mode;
        t0Var.f1192c = true;
        b();
    }
}