package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import h.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    final TextView f1246a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1247b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1248c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1249d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1250e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f1251f;

    /* renamed from: g  reason: collision with root package name */
    private int f1252g = 0;

    /* renamed from: h  reason: collision with root package name */
    private Typeface f1253h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1254i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f1255a;

        a(WeakReference weakReference) {
            this.f1255a = weakReference;
        }

        @Override // h.b.a
        public void c(int i2) {
        }

        @Override // h.b.a
        public void d(Typeface typeface) {
            y.this.n(this.f1255a, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(TextView textView) {
        this.f1246a = textView;
        this.f1251f = new b0(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y e(TextView textView) {
        return new z(textView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static t0 f(Context context, k kVar, int i2) {
        ColorStateList s2 = kVar.s(context, i2);
        if (s2 != null) {
            t0 t0Var = new t0();
            t0Var.f1193d = true;
            t0Var.f1190a = s2;
            return t0Var;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1254i) {
            this.f1253h = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1252g);
            }
        }
    }

    private void v(int i2, float f2) {
        this.f1251f.t(i2, f2);
    }

    private void w(Context context, v0 v0Var) {
        String n2;
        Typeface typeface;
        this.f1252g = v0Var.j(s.j.g2, this.f1252g);
        int i2 = s.j.k2;
        if (v0Var.q(i2) || v0Var.q(s.j.l2)) {
            this.f1253h = null;
            int i3 = s.j.l2;
            if (v0Var.q(i3)) {
                i2 = i3;
            }
            if (!context.isRestricted()) {
                try {
                    Typeface i4 = v0Var.i(i2, this.f1252g, new a(new WeakReference(this.f1246a)));
                    this.f1253h = i4;
                    this.f1254i = i4 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1253h != null || (n2 = v0Var.n(i2)) == null) {
                return;
            }
            this.f1253h = Typeface.create(n2, this.f1252g);
            return;
        }
        int i5 = s.j.f2;
        if (v0Var.q(i5)) {
            this.f1254i = false;
            int j2 = v0Var.j(i5, 1);
            if (j2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface = Typeface.SERIF;
            } else if (j2 != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f1253h = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Drawable drawable, t0 t0Var) {
        if (drawable == null || t0Var == null) {
            return;
        }
        k.C(drawable, t0Var, this.f1246a.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f1247b == null && this.f1248c == null && this.f1249d == null && this.f1250e == null) {
            return;
        }
        Drawable[] compoundDrawables = this.f1246a.getCompoundDrawables();
        b(compoundDrawables[0], this.f1247b);
        b(compoundDrawables[1], this.f1248c);
        b(compoundDrawables[2], this.f1249d);
        b(compoundDrawables[3], this.f1250e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f1251f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1251f.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f1251f.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1251f.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] j() {
        return this.f1251f.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f1251f.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1251f.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.m(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z, int i2, int i3, int i4, int i5) {
        if (android.support.v4.widget.b.f532a) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Context context, int i2) {
        ColorStateList c2;
        v0 r2 = v0.r(context, i2, s.j.d2);
        int i3 = s.j.m2;
        if (r2.q(i3)) {
            q(r2.a(i3, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            int i4 = s.j.h2;
            if (r2.q(i4) && (c2 = r2.c(i4)) != null) {
                this.f1246a.setTextColor(c2);
            }
        }
        w(context, r2);
        r2.u();
        Typeface typeface = this.f1253h;
        if (typeface != null) {
            this.f1246a.setTypeface(typeface, this.f1252g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z) {
        this.f1246a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i2, int i3, int i4, int i5) {
        this.f1251f.p(i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int[] iArr, int i2) {
        this.f1251f.q(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i2) {
        this.f1251f.r(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i2, float f2) {
        if (android.support.v4.widget.b.f532a || l()) {
            return;
        }
        v(i2, f2);
    }
}