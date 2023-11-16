package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.widget.InterfaceC0138b;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p009h.C0393b;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.y */
/* loaded from: classes.dex */
class C0329y {

    /* renamed from: a */
    final TextView f1558a;

    /* renamed from: b */
    private C0312t0 f1559b;

    /* renamed from: c */
    private C0312t0 f1560c;

    /* renamed from: d */
    private C0312t0 f1561d;

    /* renamed from: e */
    private C0312t0 f1562e;

    /* renamed from: f */
    private final C0243b0 f1563f;

    /* renamed from: g */
    private int f1564g = 0;

    /* renamed from: h */
    private Typeface f1565h;

    /* renamed from: i */
    private boolean f1566i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.y$a */
    /* loaded from: classes.dex */
    public class C0330a extends C0393b.AbstractC0394a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f1567a;

        C0330a(WeakReference weakReference) {
            this.f1567a = weakReference;
        }

        @Override // p009h.C0393b.AbstractC0394a
        /* renamed from: c */
        public void mo707c(int i) {
        }

        @Override // p009h.C0393b.AbstractC0394a
        /* renamed from: d */
        public void mo706d(Typeface typeface) {
            C0329y.this.m1041n(this.f1567a, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0329y(TextView textView) {
        this.f1558a = textView;
        this.f1563f = new C0243b0(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0329y m1049e(TextView textView) {
        return new C0334z(textView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static C0312t0 m1048f(Context context, C0283k c0283k, int i) {
        ColorStateList m1209s = c0283k.m1209s(context, i);
        if (m1209s != null) {
            C0312t0 c0312t0 = new C0312t0();
            c0312t0.f1501d = true;
            c0312t0.f1498a = m1209s;
            return c0312t0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m1041n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1566i) {
            this.f1565h = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1564g);
            }
        }
    }

    /* renamed from: v */
    private void m1033v(int i, float f) {
        this.f1563f.m1377t(i, f);
    }

    /* renamed from: w */
    private void m1032w(Context context, C0316v0 c0316v0) {
        String m1114n;
        Typeface typeface;
        this.f1564g = c0316v0.m1118j(C0578j.f2553g2, this.f1564g);
        int i = C0578j.f2569k2;
        if (c0316v0.m1111q(i) || c0316v0.m1111q(C0578j.f2573l2)) {
            this.f1565h = null;
            int i2 = C0578j.f2573l2;
            if (c0316v0.m1111q(i2)) {
                i = i2;
            }
            if (!context.isRestricted()) {
                try {
                    Typeface m1119i = c0316v0.m1119i(i, this.f1564g, new C0330a(new WeakReference(this.f1558a)));
                    this.f1565h = m1119i;
                    this.f1566i = m1119i == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1565h != null || (m1114n = c0316v0.m1114n(i)) == null) {
                return;
            }
            this.f1565h = Typeface.create(m1114n, this.f1564g);
            return;
        }
        int i3 = C0578j.f2549f2;
        if (c0316v0.m1111q(i3)) {
            this.f1566i = false;
            int m1118j = c0316v0.m1118j(i3, 1);
            if (m1118j == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (m1118j == 2) {
                typeface = Typeface.SERIF;
            } else if (m1118j != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f1565h = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1051b(Drawable drawable, C0312t0 c0312t0) {
        if (drawable == null || c0312t0 == null) {
            return;
        }
        C0283k.m1229C(drawable, c0312t0, this.f1558a.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1021c() {
        if (this.f1559b == null && this.f1560c == null && this.f1561d == null && this.f1562e == null) {
            return;
        }
        Drawable[] compoundDrawables = this.f1558a.getCompoundDrawables();
        m1051b(compoundDrawables[0], this.f1559b);
        m1051b(compoundDrawables[1], this.f1560c);
        m1051b(compoundDrawables[2], this.f1561d);
        m1051b(compoundDrawables[3], this.f1562e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1050d() {
        this.f1563f.m1396a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1047g() {
        return this.f1563f.m1390g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1046h() {
        return this.f1563f.m1389h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1045i() {
        return this.f1563f.m1388i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m1044j() {
        return this.f1563f.m1387j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m1043k() {
        return this.f1563f.m1386k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m1042l() {
        return this.f1563f.m1383n();
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
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1020m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0329y.mo1020m(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1040o(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC0138b.f682a) {
            return;
        }
        m1050d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1039p(Context context, int i) {
        ColorStateList m1125c;
        C0316v0 m1110r = C0316v0.m1110r(context, i, C0578j.f2541d2);
        int i2 = C0578j.f2577m2;
        if (m1110r.m1111q(i2)) {
            m1038q(m1110r.m1127a(i2, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            int i3 = C0578j.f2557h2;
            if (m1110r.m1111q(i3) && (m1125c = m1110r.m1125c(i3)) != null) {
                this.f1558a.setTextColor(m1125c);
            }
        }
        m1032w(context, m1110r);
        m1110r.m1107u();
        Typeface typeface = this.f1565h;
        if (typeface != null) {
            this.f1558a.setTypeface(typeface, this.f1564g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1038q(boolean z) {
        this.f1558a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1037r(int i, int i2, int i3, int i4) {
        this.f1563f.m1381p(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1036s(int[] iArr, int i) {
        this.f1563f.m1380q(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1035t(int i) {
        this.f1563f.m1379r(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m1034u(int i, float f) {
        if (InterfaceC0138b.f682a || m1042l()) {
            return;
        }
        m1033v(i, f);
    }
}