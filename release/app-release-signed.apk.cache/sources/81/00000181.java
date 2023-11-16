package p006e;

import p006e.C0354e;
import p006e.C0359i;

/* renamed from: e.b */
/* loaded from: classes.dex */
public class C0351b implements C0354e.InterfaceC0355a {

    /* renamed from: d */
    public final C0350a f1777d;

    /* renamed from: a */
    C0359i f1774a = null;

    /* renamed from: b */
    float f1775b = 0.0f;

    /* renamed from: c */
    boolean f1776c = false;

    /* renamed from: e */
    boolean f1778e = false;

    public C0351b(C0352c c0352c) {
        this.f1777d = new C0350a(this, c0352c);
    }

    @Override // p006e.C0354e.InterfaceC0355a
    /* renamed from: a */
    public void mo932a(C0359i c0359i) {
        int i = c0359i.f1806d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f1777d.m989l(c0359i, f);
    }

    @Override // p006e.C0354e.InterfaceC0355a
    /* renamed from: b */
    public C0359i mo931b(C0354e c0354e, boolean[] zArr) {
        return this.f1777d.m994g(zArr, null);
    }

    @Override // p006e.C0354e.InterfaceC0355a
    /* renamed from: c */
    public void mo930c(C0354e.InterfaceC0355a interfaceC0355a) {
        if (!(interfaceC0355a instanceof C0351b)) {
            return;
        }
        C0351b c0351b = (C0351b) interfaceC0355a;
        this.f1774a = null;
        this.f1777d.m998c();
        int i = 0;
        while (true) {
            C0350a c0350a = c0351b.f1777d;
            if (i >= c0350a.f1763a) {
                return;
            }
            this.f1777d.m1000a(c0350a.m993h(i), c0351b.f1777d.m992i(i), true);
            i++;
        }
    }

    @Override // p006e.C0354e.InterfaceC0355a
    public void clear() {
        this.f1777d.m998c();
        this.f1774a = null;
        this.f1775b = 0.0f;
    }

    /* renamed from: d */
    public C0351b m985d(C0354e c0354e, int i) {
        this.f1777d.m989l(c0354e.m943p(i, "ep"), 1.0f);
        this.f1777d.m989l(c0354e.m943p(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0351b m984e(C0359i c0359i, int i) {
        this.f1777d.m989l(c0359i, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m983f(C0354e c0354e) {
        boolean z;
        C0359i m999b = this.f1777d.m999b(c0354e);
        if (m999b == null) {
            z = true;
        } else {
            m967v(m999b);
            z = false;
        }
        if (this.f1777d.f1763a == 0) {
            this.f1778e = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0351b m982g(C0359i c0359i, C0359i c0359i2, int i, float f, C0359i c0359i3, C0359i c0359i4, int i2) {
        float f2;
        if (c0359i2 == c0359i3) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i4, 1.0f);
            this.f1777d.m989l(c0359i2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1777d.m989l(c0359i3, -1.0f);
            this.f1777d.m989l(c0359i4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f1775b = f2;
            }
        } else {
            if (f <= 0.0f) {
                this.f1777d.m989l(c0359i, -1.0f);
                this.f1777d.m989l(c0359i2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                this.f1777d.m989l(c0359i3, -1.0f);
                this.f1777d.m989l(c0359i4, 1.0f);
                f2 = i2;
            } else {
                float f3 = 1.0f - f;
                this.f1777d.m989l(c0359i, f3 * 1.0f);
                this.f1777d.m989l(c0359i2, f3 * (-1.0f));
                this.f1777d.m989l(c0359i3, (-1.0f) * f);
                this.f1777d.m989l(c0359i4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
            }
            this.f1775b = f2;
        }
        return this;
    }

    @Override // p006e.C0354e.InterfaceC0355a
    public C0359i getKey() {
        return this.f1774a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0351b m981h(C0359i c0359i, int i) {
        this.f1774a = c0359i;
        float f = i;
        c0359i.f1807e = f;
        this.f1775b = f;
        this.f1778e = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0351b m980i(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, float f) {
        this.f1777d.m989l(c0359i, -1.0f);
        this.f1777d.m989l(c0359i2, 1.0f - f);
        this.f1777d.m989l(c0359i3, f);
        return this;
    }

    /* renamed from: j */
    public C0351b m979j(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, C0359i c0359i4, float f) {
        this.f1777d.m989l(c0359i, -1.0f);
        this.f1777d.m989l(c0359i2, 1.0f);
        this.f1777d.m989l(c0359i3, f);
        this.f1777d.m989l(c0359i4, -f);
        return this;
    }

    /* renamed from: k */
    public C0351b m978k(float f, float f2, float f3, C0359i c0359i, C0359i c0359i2, C0359i c0359i3, C0359i c0359i4) {
        this.f1775b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1777d.m989l(c0359i4, 1.0f);
            this.f1777d.m989l(c0359i3, -1.0f);
        } else if (f == 0.0f) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f1777d.m989l(c0359i3, 1.0f);
            this.f1777d.m989l(c0359i4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1777d.m989l(c0359i4, f4);
            this.f1777d.m989l(c0359i3, -f4);
        }
        return this;
    }

    /* renamed from: l */
    public C0351b m977l(C0359i c0359i, int i) {
        C0350a c0350a;
        float f;
        if (i < 0) {
            this.f1775b = i * (-1);
            c0350a = this.f1777d;
            f = 1.0f;
        } else {
            this.f1775b = i;
            c0350a = this.f1777d;
            f = -1.0f;
        }
        c0350a.m989l(c0359i, f);
        return this;
    }

    /* renamed from: m */
    public C0351b m976m(C0359i c0359i, C0359i c0359i2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1775b = i;
        }
        if (z) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
        } else {
            this.f1777d.m989l(c0359i, -1.0f);
            this.f1777d.m989l(c0359i2, 1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C0351b m975n(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1775b = i;
        }
        if (z) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1777d.m989l(c0359i3, -1.0f);
        } else {
            this.f1777d.m989l(c0359i, -1.0f);
            this.f1777d.m989l(c0359i2, 1.0f);
            this.f1777d.m989l(c0359i3, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0351b m974o(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1775b = i;
        }
        if (z) {
            this.f1777d.m989l(c0359i, 1.0f);
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1777d.m989l(c0359i3, 1.0f);
        } else {
            this.f1777d.m989l(c0359i, -1.0f);
            this.f1777d.m989l(c0359i2, 1.0f);
            this.f1777d.m989l(c0359i3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0351b m973p(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, C0359i c0359i4, float f) {
        this.f1777d.m989l(c0359i3, 0.5f);
        this.f1777d.m989l(c0359i4, 0.5f);
        this.f1777d.m989l(c0359i, -0.5f);
        this.f1777d.m989l(c0359i2, -0.5f);
        this.f1775b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m972q() {
        float f = this.f1775b;
        if (f < 0.0f) {
            this.f1775b = f * (-1.0f);
            this.f1777d.m991j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m971r() {
        C0359i c0359i = this.f1774a;
        return c0359i != null && (c0359i.f1809g == C0359i.EnumC0360a.UNRESTRICTED || this.f1775b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m970s(C0359i c0359i) {
        return this.f1777d.m997d(c0359i);
    }

    /* renamed from: t */
    public boolean m969t() {
        return this.f1774a == null && this.f1775b == 0.0f && this.f1777d.f1763a == 0;
    }

    public String toString() {
        return m965x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C0359i m968u(C0359i c0359i) {
        return this.f1777d.m994g(null, c0359i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m967v(C0359i c0359i) {
        C0359i c0359i2 = this.f1774a;
        if (c0359i2 != null) {
            this.f1777d.m989l(c0359i2, -1.0f);
            this.f1774a = null;
        }
        float m988m = this.f1777d.m988m(c0359i, true) * (-1.0f);
        this.f1774a = c0359i;
        if (m988m == 1.0f) {
            return;
        }
        this.f1775b /= m988m;
        this.f1777d.m996e(m988m);
    }

    /* renamed from: w */
    public void m966w() {
        this.f1774a = null;
        this.f1777d.m998c();
        this.f1775b = 0.0f;
        this.f1778e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m965x() {
        /*
            r9 = this;
            e.i r0 = r9.f1774a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.i r1 = r9.f1774a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f1775b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f1775b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            e.a r5 = r9.f1777d
            int r5 = r5.f1763a
        L57:
            if (r2 >= r5) goto Ld4
            e.a r6 = r9.f1777d
            e.i r6 = r6.m993h(r2)
            if (r6 != 0) goto L62
            goto Ld1
        L62:
            e.a r7 = r9.f1777d
            float r7 = r7.m992i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Ld1
        L6d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La4
        L84:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Lad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc6
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld1:
            int r2 = r2 + 1
            goto L57
        Ld4:
            if (r1 != 0) goto Le7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006e.C0351b.m965x():java.lang.String");
    }
}