package f;

import f.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static void a(g gVar) {
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.O0 = true;
        gVar.I0 = false;
        gVar.J0 = false;
        gVar.K0 = false;
        ArrayList<f> arrayList = gVar.v0;
        List<h> list = gVar.H0;
        f.b s2 = gVar.s();
        f.b bVar = f.b.WRAP_CONTENT;
        boolean z = s2 == bVar;
        boolean z2 = gVar.B() == bVar;
        boolean z3 = z || z2;
        list.clear();
        for (f fVar : arrayList) {
            fVar.f1455r = null;
            fVar.k0 = false;
            fVar.S();
        }
        for (f fVar2 : arrayList) {
            if (fVar2.f1455r == null && !b(fVar2, list, z3)) {
                j(gVar);
                gVar.O0 = false;
                return;
            }
        }
        int i2 = 0;
        int i3 = 0;
        for (h hVar : list) {
            i2 = Math.max(i2, c(hVar, 0));
            i3 = Math.max(i3, c(hVar, 1));
        }
        if (z) {
            gVar.g0(f.b.FIXED);
            gVar.y0(i2);
            gVar.I0 = true;
            gVar.J0 = true;
            gVar.L0 = i2;
        }
        if (z2) {
            gVar.u0(f.b.FIXED);
            gVar.b0(i3);
            gVar.I0 = true;
            gVar.K0 = true;
            gVar.M0 = i3;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    private static boolean b(f fVar, List<h> list, boolean z) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z);
    }

    private static int c(h hVar, int i2) {
        int i3 = i2 * 2;
        List<f> b2 = hVar.b(i2);
        int size = b2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = b2.get(i5);
            e[] eVarArr = fVar.C;
            int i6 = i3 + 1;
            i4 = Math.max(i4, d(fVar, i2, eVarArr[i6].f1413d == null || !(eVarArr[i3].f1413d == null || eVarArr[i6].f1413d == null), 0));
        }
        hVar.f1472e[i2] = i4;
        return i4;
    }

    private static int d(f fVar, int i2, boolean z, int i3) {
        int r2;
        int j2;
        int i4;
        int i5;
        int i6;
        int D;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (fVar.i0) {
            boolean z2 = fVar.y.f1413d != null && i2 == 1;
            if (z) {
                r2 = fVar.j();
                j2 = fVar.r() - fVar.j();
                i5 = i2 * 2;
                i4 = i5 + 1;
            } else {
                r2 = fVar.r() - fVar.j();
                j2 = fVar.j();
                i4 = i2 * 2;
                i5 = i4 + 1;
            }
            e[] eVarArr = fVar.C;
            if (eVarArr[i4].f1413d == null || eVarArr[i5].f1413d != null) {
                i6 = 1;
            } else {
                i6 = -1;
                int i11 = i4;
                i4 = i5;
                i5 = i11;
            }
            int i12 = z2 ? i3 - r2 : i3;
            int d2 = (eVarArr[i5].d() * i6) + e(fVar, i2);
            int i13 = i12 + d2;
            int D2 = (i2 == 0 ? fVar.D() : fVar.r()) * i6;
            Iterator<o> it = fVar.C[i5].f().f1495a.iterator();
            while (it.hasNext()) {
                i10 = Math.max(i10, d(((m) it.next()).f1481c.f1411b, i2, z, i13));
            }
            int i14 = 0;
            for (Iterator<o> it2 = fVar.C[i4].f().f1495a.iterator(); it2.hasNext(); it2 = it2) {
                i14 = Math.max(i14, d(((m) it2.next()).f1481c.f1411b, i2, z, D2 + i13));
            }
            if (z2) {
                i10 -= r2;
                D = i14 + j2;
            } else {
                D = i14 + ((i2 == 0 ? fVar.D() : fVar.r()) * i6);
            }
            int i15 = 1;
            if (i2 == 1) {
                Iterator<o> it3 = fVar.y.f().f1495a.iterator();
                int i16 = 0;
                while (it3.hasNext()) {
                    Iterator<o> it4 = it3;
                    m mVar = (m) it3.next();
                    if (i6 == i15) {
                        i16 = Math.max(i16, d(mVar.f1481c.f1411b, i2, z, r2 + i13));
                        i9 = i4;
                    } else {
                        i9 = i4;
                        i16 = Math.max(i16, d(mVar.f1481c.f1411b, i2, z, (j2 * i6) + i13));
                    }
                    it3 = it4;
                    i4 = i9;
                    i15 = 1;
                }
                i7 = i4;
                int i17 = i16;
                i8 = (fVar.y.f().f1495a.size() <= 0 || z2) ? i17 : i6 == 1 ? i17 + r2 : i17 - j2;
            } else {
                i7 = i4;
                i8 = 0;
            }
            int max = d2 + Math.max(i10, Math.max(D, i8));
            int i18 = D2 + i13;
            if (i6 == -1) {
                i18 = i13;
                i13 = i18;
            }
            if (z) {
                k.e(fVar, i2, i13);
                fVar.Z(i13, i18, i2);
            } else {
                fVar.f1455r.a(fVar, i2);
                fVar.q0(i13, i2);
            }
            if (fVar.o(i2) == f.b.MATCH_CONSTRAINT && fVar.I != 0.0f) {
                fVar.f1455r.a(fVar, i2);
            }
            e[] eVarArr2 = fVar.C;
            if (eVarArr2[i5].f1413d != null && eVarArr2[i7].f1413d != null) {
                f u2 = fVar.u();
                e[] eVarArr3 = fVar.C;
                if (eVarArr3[i5].f1413d.f1411b == u2 && eVarArr3[i7].f1413d.f1411b == u2) {
                    fVar.f1455r.a(fVar, i2);
                }
            }
            return max;
        }
        return 0;
    }

    private static int e(f fVar, int i2) {
        e eVar;
        int i3 = i2 * 2;
        e[] eVarArr = fVar.C;
        e eVar2 = eVarArr[i3];
        e eVar3 = eVarArr[i3 + 1];
        e eVar4 = eVar2.f1413d;
        if (eVar4 != null) {
            f fVar2 = eVar4.f1411b;
            f fVar3 = fVar.F;
            if (fVar2 == fVar3 && (eVar = eVar3.f1413d) != null && eVar.f1411b == fVar3) {
                return (int) ((((fVar3.t(i2) - eVar2.d()) - eVar3.d()) - fVar.t(i2)) * (i2 == 0 ? fVar.Z : fVar.a0));
            }
            return 0;
        }
        return 0;
    }

    private static void f(g gVar, f fVar, h hVar) {
        hVar.f1471d = false;
        gVar.O0 = false;
        fVar.i0 = false;
    }

    private static int g(f fVar) {
        f.b s2 = fVar.s();
        f.b bVar = f.b.MATCH_CONSTRAINT;
        if (s2 == bVar) {
            int r2 = (int) (fVar.J == 0 ? fVar.r() * fVar.I : fVar.r() / fVar.I);
            fVar.y0(r2);
            return r2;
        } else if (fVar.B() == bVar) {
            int D = (int) (fVar.J == 1 ? fVar.D() * fVar.I : fVar.D() / fVar.I);
            fVar.b0(D);
            return D;
        } else {
            return -1;
        }
    }

    private static void h(e eVar) {
        m f2 = eVar.f();
        e eVar2 = eVar.f1413d;
        if (eVar2 == null || eVar2.f1413d == eVar) {
            return;
        }
        eVar2.f().a(f2);
    }

    public static void i(List<h> list, int i2, int i3) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            for (f fVar : list.get(i4).c(i2)) {
                if (fVar.i0) {
                    l(fVar, i2, i3);
                }
            }
        }
    }

    private static void j(g gVar) {
        gVar.H0.clear();
        gVar.H0.add(0, new h(gVar.v0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0159, code lost:
        if (r4.f1411b == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:
        if (r4.f1411b == r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean k(f.f r8, f.h r9, java.util.List<f.h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.k(f.f, f.h, java.util.List, boolean):boolean");
    }

    private static void l(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        e[] eVarArr = fVar.C;
        e eVar = eVarArr[i4];
        e eVar2 = eVarArr[i4 + 1];
        if ((eVar.f1413d == null || eVar2.f1413d == null) ? false : true) {
            k.e(fVar, i2, e(fVar, i2) + eVar.d());
        } else if (fVar.I == 0.0f || fVar.o(i2) != f.b.MATCH_CONSTRAINT) {
            int v2 = i3 - fVar.v(i2);
            int t2 = v2 - fVar.t(i2);
            fVar.Z(t2, v2, i2);
            k.e(fVar, i2, t2);
        } else {
            int g2 = g(fVar);
            int i5 = (int) fVar.C[i4].f().f1486h;
            eVar2.f().f1485g = eVar.f();
            eVar2.f().f1486h = g2;
            eVar2.f().f1496b = 1;
            fVar.Z(i5, i5 + g2, i2);
        }
    }
}