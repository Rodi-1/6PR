package f;

import f.f;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f1480a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
        r4.j(r2, 1, r17.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b5, code lost:
        r4.i(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c2, code lost:
        if (r6 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r6 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r6 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r6 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r6 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
        r3.j(r1, 1, r17.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r7 = r17.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r3.i(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
        if (r6 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01aa, code lost:
        if (r6 != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r16, f.f r17) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k.a(int, f.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r7 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r7 == 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(f.g r22, e.e r23, int r24, int r25, f.d r26) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k.b(f.g, e.e, int, int, f.d):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(g gVar, e.e eVar, f fVar) {
        f.b bVar = gVar.E[0];
        f.b bVar2 = f.b.WRAP_CONTENT;
        if (bVar != bVar2 && fVar.E[0] == f.b.MATCH_PARENT) {
            int i2 = fVar.f1458u.f1414e;
            int D = gVar.D() - fVar.f1460w.f1414e;
            e eVar2 = fVar.f1458u;
            eVar2.f1419j = eVar.r(eVar2);
            e eVar3 = fVar.f1460w;
            eVar3.f1419j = eVar.r(eVar3);
            eVar.f(fVar.f1458u.f1419j, i2);
            eVar.f(fVar.f1460w.f1419j, D);
            fVar.f1438a = 2;
            fVar.f0(i2, D);
        }
        if (gVar.E[1] == bVar2 || fVar.E[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i3 = fVar.f1459v.f1414e;
        int r2 = gVar.r() - fVar.x.f1414e;
        e eVar4 = fVar.f1459v;
        eVar4.f1419j = eVar.r(eVar4);
        e eVar5 = fVar.x;
        eVar5.f1419j = eVar.r(eVar5);
        eVar.f(fVar.f1459v.f1419j, i3);
        eVar.f(fVar.x.f1419j, r2);
        if (fVar.U > 0 || fVar.C() == 8) {
            e eVar6 = fVar.y;
            eVar6.f1419j = eVar.r(eVar6);
            eVar.f(fVar.y.f1419j, fVar.U + i3);
        }
        fVar.f1439b = 2;
        fVar.t0(i3, r2);
    }

    private static boolean d(f fVar, int i2) {
        f.b[] bVarArr = fVar.E;
        if (bVarArr[i2] != f.b.MATCH_CONSTRAINT) {
            return false;
        }
        if (fVar.I != 0.0f) {
            f.b bVar = bVarArr[i2 != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i2 == 0) {
            if (fVar.f1442e != 0 || fVar.f1445h != 0 || fVar.f1446i != 0) {
                return false;
            }
        } else if (fVar.f1443f != 0 || fVar.f1448k != 0 || fVar.f1449l != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        fVar.C[i4].f().f1485g = fVar.u().f1458u.f();
        fVar.C[i4].f().f1486h = i3;
        fVar.C[i4].f().f1496b = 1;
        fVar.C[i5].f().f1485g = fVar.C[i4].f();
        fVar.C[i5].f().f1486h = fVar.t(i2);
        fVar.C[i5].f().f1496b = 1;
    }
}