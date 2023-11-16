package p007f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007f.C0370f;

/* renamed from: f.a */
/* loaded from: classes.dex */
public class C0361a {
    /* renamed from: a */
    public static void m920a(C0373g c0373g) {
        if ((c0373g.m807R0() & 32) != 32) {
            m911j(c0373g);
            return;
        }
        c0373g.f1961O0 = true;
        c0373g.f1955I0 = false;
        c0373g.f1956J0 = false;
        c0373g.f1957K0 = false;
        ArrayList<C0370f> arrayList = c0373g.f2019v0;
        List<C0374h> list = c0373g.f1954H0;
        C0370f.EnumC0372b m827s = c0373g.m827s();
        C0370f.EnumC0372b enumC0372b = C0370f.EnumC0372b.WRAP_CONTENT;
        boolean z = m827s == enumC0372b;
        boolean z2 = c0373g.m885B() == enumC0372b;
        boolean z3 = z || z2;
        list.clear();
        for (C0370f c0370f : arrayList) {
            c0370f.f1928r = null;
            c0370f.f1915k0 = false;
            c0370f.mo864S();
        }
        for (C0370f c0370f2 : arrayList) {
            if (c0370f2.f1928r == null && !m919b(c0370f2, list, z3)) {
                m911j(c0373g);
                c0373g.f1961O0 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0374h c0374h : list) {
            i = Math.max(i, m918c(c0374h, 0));
            i2 = Math.max(i2, m918c(c0374h, 1));
        }
        if (z) {
            c0373g.m847g0(C0370f.EnumC0372b.FIXED);
            c0373g.m814y0(i);
            c0373g.f1955I0 = true;
            c0373g.f1956J0 = true;
            c0373g.f1958L0 = i;
        }
        if (z2) {
            c0373g.m822u0(C0370f.EnumC0372b.FIXED);
            c0373g.m855b0(i2);
            c0373g.f1955I0 = true;
            c0373g.f1957K0 = true;
            c0373g.f1959M0 = i2;
        }
        m912i(list, 0, c0373g.m881D());
        m912i(list, 1, c0373g.m829r());
    }

    /* renamed from: b */
    private static boolean m919b(C0370f c0370f, List<C0374h> list, boolean z) {
        C0374h c0374h = new C0374h(new ArrayList(), true);
        list.add(c0374h);
        return m910k(c0370f, c0374h, list, z);
    }

    /* renamed from: c */
    private static int m918c(C0374h c0374h, int i) {
        int i2 = i * 2;
        List<C0370f> m791b = c0374h.m791b(i);
        int size = m791b.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0370f c0370f = m791b.get(i4);
            C0365e[] c0365eArr = c0370f.f1870C;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m917d(c0370f, i, c0365eArr[i5].f1842d == null || !(c0365eArr[i2].f1842d == null || c0365eArr[i5].f1842d == null), 0));
        }
        c0374h.f1973e[i] = i3;
        return i3;
    }

    /* renamed from: d */
    private static int m917d(C0370f c0370f, int i, boolean z, int i2) {
        int m829r;
        int m844j;
        int i3;
        int i4;
        int i5;
        int m881D;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (c0370f.f1911i0) {
            boolean z2 = c0370f.f1938y.f1842d != null && i == 1;
            if (z) {
                m829r = c0370f.m844j();
                m844j = c0370f.m829r() - c0370f.m844j();
                i4 = i * 2;
                i3 = i4 + 1;
            } else {
                m829r = c0370f.m829r() - c0370f.m844j();
                m844j = c0370f.m844j();
                i3 = i * 2;
                i4 = i3 + 1;
            }
            C0365e[] c0365eArr = c0370f.f1870C;
            if (c0365eArr[i3].f1842d == null || c0365eArr[i4].f1842d != null) {
                i5 = 1;
            } else {
                i5 = -1;
                int i10 = i3;
                i3 = i4;
                i4 = i10;
            }
            int i11 = z2 ? i2 - m829r : i2;
            int m898d = (c0365eArr[i4].m898d() * i5) + m916e(c0370f, i);
            int i12 = i11 + m898d;
            int m881D2 = (i == 0 ? c0370f.m881D() : c0370f.m829r()) * i5;
            Iterator<C0382o> it = c0370f.f1870C[i4].m896f().f2007a.iterator();
            while (it.hasNext()) {
                i9 = Math.max(i9, m917d(((C0380m) it.next()).f1993c.f1840b, i, z, i12));
            }
            int i13 = 0;
            for (Iterator<C0382o> it2 = c0370f.f1870C[i3].m896f().f2007a.iterator(); it2.hasNext(); it2 = it2) {
                i13 = Math.max(i13, m917d(((C0380m) it2.next()).f1993c.f1840b, i, z, m881D2 + i12));
            }
            if (z2) {
                i9 -= m829r;
                m881D = i13 + m844j;
            } else {
                m881D = i13 + ((i == 0 ? c0370f.m881D() : c0370f.m829r()) * i5);
            }
            int i14 = 1;
            if (i == 1) {
                Iterator<C0382o> it3 = c0370f.f1938y.m896f().f2007a.iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    Iterator<C0382o> it4 = it3;
                    C0380m c0380m = (C0380m) it3.next();
                    if (i5 == i14) {
                        i15 = Math.max(i15, m917d(c0380m.f1993c.f1840b, i, z, m829r + i12));
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i15 = Math.max(i15, m917d(c0380m.f1993c.f1840b, i, z, (m844j * i5) + i12));
                    }
                    it3 = it4;
                    i3 = i8;
                    i14 = 1;
                }
                i6 = i3;
                int i16 = i15;
                i7 = (c0370f.f1938y.m896f().f2007a.size() <= 0 || z2) ? i16 : i5 == 1 ? i16 + m829r : i16 - m844j;
            } else {
                i6 = i3;
                i7 = 0;
            }
            int max = m898d + Math.max(i9, Math.max(m881D, i7));
            int i17 = m881D2 + i12;
            if (i5 == -1) {
                i17 = i12;
                i12 = i17;
            }
            if (z) {
                C0378k.m768e(c0370f, i, i12);
                c0370f.m858Z(i12, i17, i);
            } else {
                c0370f.f1928r.m792a(c0370f, i);
                c0370f.m830q0(i12, i);
            }
            if (c0370f.m835o(i) == C0370f.EnumC0372b.MATCH_CONSTRAINT && c0370f.f1876I != 0.0f) {
                c0370f.f1928r.m792a(c0370f, i);
            }
            C0365e[] c0365eArr2 = c0370f.f1870C;
            if (c0365eArr2[i4].f1842d != null && c0365eArr2[i6].f1842d != null) {
                C0370f m823u = c0370f.m823u();
                C0365e[] c0365eArr3 = c0370f.f1870C;
                if (c0365eArr3[i4].f1842d.f1840b == m823u && c0365eArr3[i6].f1842d.f1840b == m823u) {
                    c0370f.f1928r.m792a(c0370f, i);
                }
            }
            return max;
        }
        return 0;
    }

    /* renamed from: e */
    private static int m916e(C0370f c0370f, int i) {
        C0365e c0365e;
        int i2 = i * 2;
        C0365e[] c0365eArr = c0370f.f1870C;
        C0365e c0365e2 = c0365eArr[i2];
        C0365e c0365e3 = c0365eArr[i2 + 1];
        C0365e c0365e4 = c0365e2.f1842d;
        if (c0365e4 != null) {
            C0370f c0370f2 = c0365e4.f1840b;
            C0370f c0370f3 = c0370f.f1873F;
            if (c0370f2 == c0370f3 && (c0365e = c0365e3.f1842d) != null && c0365e.f1840b == c0370f3) {
                return (int) ((((c0370f3.m825t(i) - c0365e2.m898d()) - c0365e3.m898d()) - c0370f.m825t(i)) * (i == 0 ? c0370f.f1893Z : c0370f.f1895a0));
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    private static void m915f(C0373g c0373g, C0370f c0370f, C0374h c0374h) {
        c0374h.f1972d = false;
        c0373g.f1961O0 = false;
        c0370f.f1911i0 = false;
    }

    /* renamed from: g */
    private static int m914g(C0370f c0370f) {
        C0370f.EnumC0372b m827s = c0370f.m827s();
        C0370f.EnumC0372b enumC0372b = C0370f.EnumC0372b.MATCH_CONSTRAINT;
        if (m827s == enumC0372b) {
            int m829r = (int) (c0370f.f1877J == 0 ? c0370f.m829r() * c0370f.f1876I : c0370f.m829r() / c0370f.f1876I);
            c0370f.m814y0(m829r);
            return m829r;
        } else if (c0370f.m885B() == enumC0372b) {
            int m881D = (int) (c0370f.f1877J == 1 ? c0370f.m881D() * c0370f.f1876I : c0370f.m881D() / c0370f.f1876I);
            c0370f.m855b0(m881D);
            return m881D;
        } else {
            return -1;
        }
    }

    /* renamed from: h */
    private static void m913h(C0365e c0365e) {
        C0380m m896f = c0365e.m896f();
        C0365e c0365e2 = c0365e.f1842d;
        if (c0365e2 == null || c0365e2.f1842d == c0365e) {
            return;
        }
        c0365e2.m896f().m754a(m896f);
    }

    /* renamed from: i */
    public static void m912i(List<C0374h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0370f c0370f : list.get(i3).m790c(i)) {
                if (c0370f.f1911i0) {
                    m909l(c0370f, i, i2);
                }
            }
        }
    }

    /* renamed from: j */
    private static void m911j(C0373g c0373g) {
        c0373g.f1954H0.clear();
        c0373g.f1954H0.add(0, new C0374h(c0373g.f2019v0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0159, code lost:
        if (r4.f1840b == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:
        if (r4.f1840b == r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m910k(p007f.C0370f r8, p007f.C0374h r9, java.util.List<p007f.C0374h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0361a.m910k(f.f, f.h, java.util.List, boolean):boolean");
    }

    /* renamed from: l */
    private static void m909l(C0370f c0370f, int i, int i2) {
        int i3 = i * 2;
        C0365e[] c0365eArr = c0370f.f1870C;
        C0365e c0365e = c0365eArr[i3];
        C0365e c0365e2 = c0365eArr[i3 + 1];
        if ((c0365e.f1842d == null || c0365e2.f1842d == null) ? false : true) {
            C0378k.m768e(c0370f, i, m916e(c0370f, i) + c0365e.m898d());
        } else if (c0370f.f1876I == 0.0f || c0370f.m835o(i) != C0370f.EnumC0372b.MATCH_CONSTRAINT) {
            int m821v = i2 - c0370f.m821v(i);
            int m825t = m821v - c0370f.m825t(i);
            c0370f.m858Z(m825t, m821v, i);
            C0378k.m768e(c0370f, i, m825t);
        } else {
            int m914g = m914g(c0370f);
            int i4 = (int) c0370f.f1870C[i3].m896f().f1998h;
            c0365e2.m896f().f1997g = c0365e.m896f();
            c0365e2.m896f().f1998h = m914g;
            c0365e2.m896f().f2008b = 1;
            c0370f.m858Z(i4, i4 + m914g, i);
        }
    }
}