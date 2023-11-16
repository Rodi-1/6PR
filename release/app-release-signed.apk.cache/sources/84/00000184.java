package p006e;

import java.util.Arrays;
import java.util.HashMap;
import p006e.C0359i;
import p007f.C0365e;
import p007f.C0370f;

/* renamed from: e.e */
/* loaded from: classes.dex */
public class C0354e {

    /* renamed from: q */
    private static int f1782q = 1000;

    /* renamed from: r */
    public static final /* synthetic */ int f1783r = 0;

    /* renamed from: c */
    private InterfaceC0355a f1786c;

    /* renamed from: f */
    C0351b[] f1789f;

    /* renamed from: l */
    final C0352c f1795l;

    /* renamed from: p */
    private final InterfaceC0355a f1799p;

    /* renamed from: a */
    int f1784a = 0;

    /* renamed from: b */
    private HashMap<String, C0359i> f1785b = null;

    /* renamed from: d */
    private int f1787d = 32;

    /* renamed from: e */
    private int f1788e = 32;

    /* renamed from: g */
    public boolean f1790g = false;

    /* renamed from: h */
    private boolean[] f1791h = new boolean[32];

    /* renamed from: i */
    int f1792i = 1;

    /* renamed from: j */
    int f1793j = 0;

    /* renamed from: k */
    private int f1794k = 32;

    /* renamed from: m */
    private C0359i[] f1796m = new C0359i[f1782q];

    /* renamed from: n */
    private int f1797n = 0;

    /* renamed from: o */
    private C0351b[] f1798o = new C0351b[32];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0355a {
        /* renamed from: a */
        void mo932a(C0359i c0359i);

        /* renamed from: b */
        C0359i mo931b(C0354e c0354e, boolean[] zArr);

        /* renamed from: c */
        void mo930c(InterfaceC0355a interfaceC0355a);

        void clear();

        C0359i getKey();
    }

    public C0354e() {
        this.f1789f = null;
        this.f1789f = new C0351b[32];
        m961D();
        C0352c c0352c = new C0352c();
        this.f1795l = c0352c;
        this.f1786c = new C0353d(c0352c);
        this.f1799p = new C0351b(c0352c);
    }

    /* renamed from: C */
    private final int m962C(InterfaceC0355a interfaceC0355a, boolean z) {
        for (int i = 0; i < this.f1792i; i++) {
            this.f1791h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f1792i * 2) {
                return i2;
            }
            if (interfaceC0355a.getKey() != null) {
                this.f1791h[interfaceC0355a.getKey().f1804b] = true;
            }
            C0359i mo931b = interfaceC0355a.mo931b(this, this.f1791h);
            if (mo931b != null) {
                boolean[] zArr = this.f1791h;
                int i3 = mo931b.f1804b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo931b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f1793j; i5++) {
                    C0351b c0351b = this.f1789f[i5];
                    if (c0351b.f1774a.f1809g != C0359i.EnumC0360a.UNRESTRICTED && !c0351b.f1778e && c0351b.m970s(mo931b)) {
                        float m995f = c0351b.f1777d.m995f(mo931b);
                        if (m995f < 0.0f) {
                            float f2 = (-c0351b.f1775b) / m995f;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0351b c0351b2 = this.f1789f[i4];
                    c0351b2.f1774a.f1805c = -1;
                    c0351b2.m967v(mo931b);
                    C0359i c0359i = c0351b2.f1774a;
                    c0359i.f1805c = i4;
                    c0359i.m921f(c0351b2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: D */
    private void m961D() {
        int i = 0;
        while (true) {
            C0351b[] c0351bArr = this.f1789f;
            if (i >= c0351bArr.length) {
                return;
            }
            C0351b c0351b = c0351bArr[i];
            if (c0351b != null) {
                this.f1795l.f1779a.mo928b(c0351b);
            }
            this.f1789f[i] = null;
            i++;
        }
    }

    /* renamed from: F */
    private final void m959F(C0351b c0351b) {
        if (this.f1793j > 0) {
            c0351b.f1777d.m986o(c0351b, this.f1789f);
            if (c0351b.f1777d.f1763a == 0) {
                c0351b.f1778e = true;
            }
        }
    }

    /* renamed from: a */
    private C0359i m958a(C0359i.EnumC0360a enumC0360a, String str) {
        C0359i mo927c = this.f1795l.f1780b.mo927c();
        if (mo927c == null) {
            mo927c = new C0359i(enumC0360a, str);
        } else {
            mo927c.m923d();
        }
        mo927c.m922e(enumC0360a, str);
        int i = this.f1797n;
        int i2 = f1782q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f1782q = i3;
            this.f1796m = (C0359i[]) Arrays.copyOf(this.f1796m, i3);
        }
        C0359i[] c0359iArr = this.f1796m;
        int i4 = this.f1797n;
        this.f1797n = i4 + 1;
        c0359iArr[i4] = mo927c;
        return mo927c;
    }

    /* renamed from: g */
    private void m952g(C0351b c0351b) {
        c0351b.m985d(this, 0);
    }

    /* renamed from: m */
    private final void m946m(C0351b c0351b) {
        C0351b[] c0351bArr = this.f1789f;
        int i = this.f1793j;
        if (c0351bArr[i] != null) {
            this.f1795l.f1779a.mo928b(c0351bArr[i]);
        }
        C0351b[] c0351bArr2 = this.f1789f;
        int i2 = this.f1793j;
        c0351bArr2[i2] = c0351b;
        C0359i c0359i = c0351b.f1774a;
        c0359i.f1805c = i2;
        this.f1793j = i2 + 1;
        c0359i.m921f(c0351b);
    }

    /* renamed from: o */
    private void m944o() {
        for (int i = 0; i < this.f1793j; i++) {
            C0351b c0351b = this.f1789f[i];
            c0351b.f1774a.f1807e = c0351b.f1775b;
        }
    }

    /* renamed from: t */
    public static C0351b m939t(C0354e c0354e, C0359i c0359i, C0359i c0359i2, C0359i c0359i3, float f, boolean z) {
        C0351b m940s = c0354e.m940s();
        if (z) {
            c0354e.m952g(m940s);
        }
        return m940s.m980i(c0359i, c0359i2, c0359i3, f);
    }

    /* renamed from: v */
    private int m937v(InterfaceC0355a interfaceC0355a) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f1793j) {
                z = false;
                break;
            }
            C0351b[] c0351bArr = this.f1789f;
            if (c0351bArr[i].f1774a.f1809g != C0359i.EnumC0360a.UNRESTRICTED && c0351bArr[i].f1775b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.f1793j) {
                    C0351b c0351b = this.f1789f[i3];
                    if (c0351b.f1774a.f1809g != C0359i.EnumC0360a.UNRESTRICTED && !c0351b.f1778e && c0351b.f1775b < f) {
                        int i7 = 1;
                        while (i7 < this.f1792i) {
                            C0359i c0359i = this.f1795l.f1781c[i7];
                            float m995f = c0351b.f1777d.m995f(c0359i);
                            if (m995f > f) {
                                for (int i8 = 0; i8 < 7; i8++) {
                                    float f3 = c0359i.f1808f[i8] / m995f;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                        i5 = i7;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C0351b c0351b2 = this.f1789f[i4];
                    c0351b2.f1774a.f1805c = -1;
                    c0351b2.m967v(this.f1795l.f1781c[i5]);
                    C0359i c0359i2 = c0351b2.f1774a;
                    c0359i2.f1805c = i4;
                    c0359i2.m921f(c0351b2);
                } else {
                    z2 = true;
                }
                if (i2 > this.f1792i / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: x */
    public static C0356f m935x() {
        return null;
    }

    /* renamed from: z */
    private void m933z() {
        int i = this.f1787d * 2;
        this.f1787d = i;
        this.f1789f = (C0351b[]) Arrays.copyOf(this.f1789f, i);
        C0352c c0352c = this.f1795l;
        c0352c.f1781c = (C0359i[]) Arrays.copyOf(c0352c.f1781c, this.f1787d);
        int i2 = this.f1787d;
        this.f1791h = new boolean[i2];
        this.f1788e = i2;
        this.f1794k = i2;
    }

    /* renamed from: A */
    public void m964A() {
        if (this.f1790g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f1793j) {
                    z = true;
                    break;
                } else if (!this.f1789f[i].f1778e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m944o();
                return;
            }
        }
        m963B(this.f1786c);
    }

    /* renamed from: B */
    void m963B(InterfaceC0355a interfaceC0355a) {
        m959F((C0351b) interfaceC0355a);
        m937v(interfaceC0355a);
        m962C(interfaceC0355a, false);
        m944o();
    }

    /* renamed from: E */
    public void m960E() {
        C0352c c0352c;
        int i = 0;
        while (true) {
            c0352c = this.f1795l;
            C0359i[] c0359iArr = c0352c.f1781c;
            if (i >= c0359iArr.length) {
                break;
            }
            C0359i c0359i = c0359iArr[i];
            if (c0359i != null) {
                c0359i.m923d();
            }
            i++;
        }
        c0352c.f1780b.mo929a(this.f1796m, this.f1797n);
        this.f1797n = 0;
        Arrays.fill(this.f1795l.f1781c, (Object) null);
        HashMap<String, C0359i> hashMap = this.f1785b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1784a = 0;
        this.f1786c.clear();
        this.f1792i = 1;
        for (int i2 = 0; i2 < this.f1793j; i2++) {
            this.f1789f[i2].f1776c = false;
        }
        m961D();
        this.f1793j = 0;
    }

    /* renamed from: b */
    public void m957b(C0370f c0370f, C0370f c0370f2, float f, int i) {
        C0365e.EnumC0369d enumC0369d = C0365e.EnumC0369d.LEFT;
        C0359i m941r = m941r(c0370f.mo776h(enumC0369d));
        C0365e.EnumC0369d enumC0369d2 = C0365e.EnumC0369d.TOP;
        C0359i m941r2 = m941r(c0370f.mo776h(enumC0369d2));
        C0365e.EnumC0369d enumC0369d3 = C0365e.EnumC0369d.RIGHT;
        C0359i m941r3 = m941r(c0370f.mo776h(enumC0369d3));
        C0365e.EnumC0369d enumC0369d4 = C0365e.EnumC0369d.BOTTOM;
        C0359i m941r4 = m941r(c0370f.mo776h(enumC0369d4));
        C0359i m941r5 = m941r(c0370f2.mo776h(enumC0369d));
        C0359i m941r6 = m941r(c0370f2.mo776h(enumC0369d2));
        C0359i m941r7 = m941r(c0370f2.mo776h(enumC0369d3));
        C0359i m941r8 = m941r(c0370f2.mo776h(enumC0369d4));
        C0351b m940s = m940s();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        m940s.m973p(m941r2, m941r4, m941r6, m941r8, (float) (sin * d2));
        m955d(m940s);
        C0351b m940s2 = m940s();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        m940s2.m973p(m941r, m941r3, m941r5, m941r7, (float) (cos * d2));
        m955d(m940s2);
    }

    /* renamed from: c */
    public void m956c(C0359i c0359i, C0359i c0359i2, int i, float f, C0359i c0359i3, C0359i c0359i4, int i2, int i3) {
        C0351b m940s = m940s();
        m940s.m982g(c0359i, c0359i2, i, f, c0359i3, c0359i4, i2);
        if (i3 != 6) {
            m940s.m985d(this, i3);
        }
        m955d(m940s);
    }

    /* renamed from: d */
    public void m955d(C0351b c0351b) {
        C0359i m968u;
        if (c0351b == null) {
            return;
        }
        boolean z = true;
        if (this.f1793j + 1 >= this.f1794k || this.f1792i + 1 >= this.f1788e) {
            m933z();
        }
        boolean z2 = false;
        if (!c0351b.f1778e) {
            m959F(c0351b);
            if (c0351b.m969t()) {
                return;
            }
            c0351b.m972q();
            if (c0351b.m983f(this)) {
                C0359i m942q = m942q();
                c0351b.f1774a = m942q;
                m946m(c0351b);
                this.f1799p.mo930c(c0351b);
                m962C(this.f1799p, true);
                if (m942q.f1805c == -1) {
                    if (c0351b.f1774a == m942q && (m968u = c0351b.m968u(m942q)) != null) {
                        c0351b.m967v(m968u);
                    }
                    if (!c0351b.f1778e) {
                        c0351b.f1774a.m921f(c0351b);
                    }
                    this.f1793j--;
                }
            } else {
                z = false;
            }
            if (!c0351b.m971r()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        m946m(c0351b);
    }

    /* renamed from: e */
    public C0351b m954e(C0359i c0359i, C0359i c0359i2, int i, int i2) {
        C0351b m940s = m940s();
        m940s.m976m(c0359i, c0359i2, i);
        if (i2 != 6) {
            m940s.m985d(this, i2);
        }
        m955d(m940s);
        return m940s;
    }

    /* renamed from: f */
    public void m953f(C0359i c0359i, int i) {
        C0351b m940s;
        int i2 = c0359i.f1805c;
        if (i2 != -1) {
            C0351b c0351b = this.f1789f[i2];
            if (!c0351b.f1778e) {
                if (c0351b.f1777d.f1763a == 0) {
                    c0351b.f1778e = true;
                } else {
                    m940s = m940s();
                    m940s.m977l(c0359i, i);
                }
            }
            c0351b.f1775b = i;
            return;
        }
        m940s = m940s();
        m940s.m981h(c0359i, i);
        m955d(m940s);
    }

    /* renamed from: h */
    public void m951h(C0359i c0359i, C0359i c0359i2, boolean z) {
        C0351b m940s = m940s();
        C0359i m938u = m938u();
        m938u.f1806d = 0;
        m940s.m975n(c0359i, c0359i2, m938u, 0);
        if (z) {
            m945n(m940s, (int) (m940s.f1777d.m995f(m938u) * (-1.0f)), 1);
        }
        m955d(m940s);
    }

    /* renamed from: i */
    public void m950i(C0359i c0359i, C0359i c0359i2, int i, int i2) {
        C0351b m940s = m940s();
        C0359i m938u = m938u();
        m938u.f1806d = 0;
        m940s.m975n(c0359i, c0359i2, m938u, i);
        if (i2 != 6) {
            m945n(m940s, (int) (m940s.f1777d.m995f(m938u) * (-1.0f)), i2);
        }
        m955d(m940s);
    }

    /* renamed from: j */
    public void m949j(C0359i c0359i, C0359i c0359i2, boolean z) {
        C0351b m940s = m940s();
        C0359i m938u = m938u();
        m938u.f1806d = 0;
        m940s.m974o(c0359i, c0359i2, m938u, 0);
        if (z) {
            m945n(m940s, (int) (m940s.f1777d.m995f(m938u) * (-1.0f)), 1);
        }
        m955d(m940s);
    }

    /* renamed from: k */
    public void m948k(C0359i c0359i, C0359i c0359i2, int i, int i2) {
        C0351b m940s = m940s();
        C0359i m938u = m938u();
        m938u.f1806d = 0;
        m940s.m974o(c0359i, c0359i2, m938u, i);
        if (i2 != 6) {
            m945n(m940s, (int) (m940s.f1777d.m995f(m938u) * (-1.0f)), i2);
        }
        m955d(m940s);
    }

    /* renamed from: l */
    public void m947l(C0359i c0359i, C0359i c0359i2, C0359i c0359i3, C0359i c0359i4, float f, int i) {
        C0351b m940s = m940s();
        m940s.m979j(c0359i, c0359i2, c0359i3, c0359i4, f);
        if (i != 6) {
            m940s.m985d(this, i);
        }
        m955d(m940s);
    }

    /* renamed from: n */
    void m945n(C0351b c0351b, int i, int i2) {
        c0351b.m984e(m943p(i2, null), i);
    }

    /* renamed from: p */
    public C0359i m943p(int i, String str) {
        if (this.f1792i + 1 >= this.f1788e) {
            m933z();
        }
        C0359i m958a = m958a(C0359i.EnumC0360a.ERROR, str);
        int i2 = this.f1784a + 1;
        this.f1784a = i2;
        this.f1792i++;
        m958a.f1804b = i2;
        m958a.f1806d = i;
        this.f1795l.f1781c[i2] = m958a;
        this.f1786c.mo932a(m958a);
        return m958a;
    }

    /* renamed from: q */
    public C0359i m942q() {
        if (this.f1792i + 1 >= this.f1788e) {
            m933z();
        }
        C0359i m958a = m958a(C0359i.EnumC0360a.SLACK, null);
        int i = this.f1784a + 1;
        this.f1784a = i;
        this.f1792i++;
        m958a.f1804b = i;
        this.f1795l.f1781c[i] = m958a;
        return m958a;
    }

    /* renamed from: r */
    public C0359i m941r(Object obj) {
        C0359i c0359i = null;
        if (obj == null) {
            return null;
        }
        if (this.f1792i + 1 >= this.f1788e) {
            m933z();
        }
        if (obj instanceof C0365e) {
            C0365e c0365e = (C0365e) obj;
            c0359i = c0365e.m895g();
            if (c0359i == null) {
                c0365e.m888n(this.f1795l);
                c0359i = c0365e.m895g();
            }
            int i = c0359i.f1804b;
            if (i == -1 || i > this.f1784a || this.f1795l.f1781c[i] == null) {
                if (i != -1) {
                    c0359i.m923d();
                }
                int i2 = this.f1784a + 1;
                this.f1784a = i2;
                this.f1792i++;
                c0359i.f1804b = i2;
                c0359i.f1809g = C0359i.EnumC0360a.UNRESTRICTED;
                this.f1795l.f1781c[i2] = c0359i;
            }
        }
        return c0359i;
    }

    /* renamed from: s */
    public C0351b m940s() {
        C0351b mo927c = this.f1795l.f1779a.mo927c();
        if (mo927c == null) {
            mo927c = new C0351b(this.f1795l);
        } else {
            mo927c.m966w();
        }
        C0359i.m925b();
        return mo927c;
    }

    /* renamed from: u */
    public C0359i m938u() {
        if (this.f1792i + 1 >= this.f1788e) {
            m933z();
        }
        C0359i m958a = m958a(C0359i.EnumC0360a.SLACK, null);
        int i = this.f1784a + 1;
        this.f1784a = i;
        this.f1792i++;
        m958a.f1804b = i;
        this.f1795l.f1781c[i] = m958a;
        return m958a;
    }

    /* renamed from: w */
    public C0352c m936w() {
        return this.f1795l;
    }

    /* renamed from: y */
    public int m934y(Object obj) {
        C0359i m895g = ((C0365e) obj).m895g();
        if (m895g != null) {
            return (int) (m895g.f1807e + 0.5f);
        }
        return 0;
    }
}