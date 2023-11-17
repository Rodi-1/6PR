package f;

import f.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends j {
    private int x0 = 0;
    private ArrayList<m> y0 = new ArrayList<>(4);
    private boolean z0 = true;

    public void K0(boolean z) {
        this.z0 = z;
    }

    public void L0(int i2) {
        this.x0 = i2;
    }

    @Override // f.f
    public void S() {
        super.S();
        this.y0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    @Override // f.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U() {
        /*
            r11 = this;
            int r0 = r11.x0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r4) goto L18
            if (r0 == r3) goto L15
            if (r0 == r2) goto L12
            return
        L12:
            f.e r0 = r11.x
            goto L1a
        L15:
            f.e r0 = r11.f1459v
            goto L22
        L18:
            f.e r0 = r11.f1460w
        L1a:
            f.m r0 = r0.f()
            r1 = 0
            goto L26
        L20:
            f.e r0 = r11.f1458u
        L22:
            f.m r0 = r0.f()
        L26:
            java.util.ArrayList<f.m> r5 = r11.y0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L2e:
            if (r7 >= r5) goto L58
            java.util.ArrayList<f.m> r8 = r11.y0
            java.lang.Object r8 = r8.get(r7)
            f.m r8 = (f.m) r8
            int r9 = r8.f1496b
            if (r9 == r4) goto L3d
            return
        L3d:
            int r9 = r11.x0
            if (r9 == 0) goto L4b
            if (r9 != r3) goto L44
            goto L4b
        L44:
            float r9 = r8.f1486h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L55
            goto L51
        L4b:
            float r9 = r8.f1486h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L55
        L51:
            f.m r1 = r8.f1485g
            r6 = r1
            r1 = r9
        L55:
            int r7 = r7 + 1
            goto L2e
        L58:
            e.e.x()
            r0.f1485g = r6
            r0.f1486h = r1
            r0.b()
            int r0 = r11.x0
            if (r0 == 0) goto L76
            if (r0 == r4) goto L73
            if (r0 == r3) goto L70
            if (r0 == r2) goto L6d
            return
        L6d:
            f.e r0 = r11.f1459v
            goto L78
        L70:
            f.e r0 = r11.x
            goto L78
        L73:
            f.e r0 = r11.f1458u
            goto L78
        L76:
            f.e r0 = r11.f1460w
        L78:
            f.m r0 = r0.f()
            r0.l(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.U():void");
    }

    @Override // f.f
    public void b(e.e eVar) {
        Object[] objArr;
        boolean z;
        e.i iVar;
        e eVar2;
        int i2;
        int i3;
        e[] eVarArr = this.C;
        eVarArr[0] = this.f1458u;
        eVarArr[2] = this.f1459v;
        eVarArr[1] = this.f1460w;
        eVarArr[3] = this.x;
        int i4 = 0;
        while (true) {
            objArr = this.C;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].f1419j = eVar.r(objArr[i4]);
            i4++;
        }
        int i5 = this.x0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        e eVar3 = objArr[i5];
        for (int i6 = 0; i6 < this.w0; i6++) {
            f fVar = this.v0[i6];
            if ((this.z0 || fVar.c()) && ((((i2 = this.x0) == 0 || i2 == 1) && fVar.s() == f.b.MATCH_CONSTRAINT) || (((i3 = this.x0) == 2 || i3 == 3) && fVar.B() == f.b.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
        }
        z = false;
        int i7 = this.x0;
        if (i7 == 0 || i7 == 1 ? u().s() == f.b.WRAP_CONTENT : u().B() == f.b.WRAP_CONTENT) {
            z = false;
        }
        for (int i8 = 0; i8 < this.w0; i8++) {
            f fVar2 = this.v0[i8];
            if (this.z0 || fVar2.c()) {
                e.i r2 = eVar.r(fVar2.C[this.x0]);
                e[] eVarArr2 = fVar2.C;
                int i9 = this.x0;
                eVarArr2[i9].f1419j = r2;
                if (i9 == 0 || i9 == 2) {
                    eVar.j(eVar3.f1419j, r2, z);
                } else {
                    eVar.h(eVar3.f1419j, r2, z);
                }
            }
        }
        int i10 = this.x0;
        if (i10 == 0) {
            eVar.e(this.f1460w.f1419j, this.f1458u.f1419j, 0, 6);
            if (z) {
                return;
            }
            iVar = this.f1458u.f1419j;
            eVar2 = this.F.f1460w;
        } else if (i10 == 1) {
            eVar.e(this.f1458u.f1419j, this.f1460w.f1419j, 0, 6);
            if (z) {
                return;
            }
            iVar = this.f1458u.f1419j;
            eVar2 = this.F.f1458u;
        } else if (i10 == 2) {
            eVar.e(this.x.f1419j, this.f1459v.f1419j, 0, 6);
            if (z) {
                return;
            }
            iVar = this.f1459v.f1419j;
            eVar2 = this.F.x;
        } else if (i10 != 3) {
            return;
        } else {
            eVar.e(this.f1459v.f1419j, this.x.f1419j, 0, 6);
            if (z) {
                return;
            }
            iVar = this.f1459v.f1419j;
            eVar2 = this.F.f1459v;
        }
        eVar.e(iVar, eVar2.f1419j, 0, 5);
    }

    @Override // f.f
    public boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    @Override // f.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(int r8) {
        /*
            r7 = this;
            f.f r8 = r7.F
            if (r8 != 0) goto L5
            return
        L5:
            f.g r8 = (f.g) r8
            r0 = 2
            boolean r8 = r8.X0(r0)
            if (r8 != 0) goto Lf
            return
        Lf:
            int r8 = r7.x0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L25
            if (r8 == r2) goto L22
            if (r8 == r0) goto L1f
            if (r8 == r1) goto L1c
            return
        L1c:
            f.e r8 = r7.x
            goto L27
        L1f:
            f.e r8 = r7.f1459v
            goto L27
        L22:
            f.e r8 = r7.f1460w
            goto L27
        L25:
            f.e r8 = r7.f1458u
        L27:
            f.m r8 = r8.f()
            r3 = 5
            r8.p(r3)
            int r3 = r7.x0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L44
            if (r3 != r2) goto L38
            goto L44
        L38:
            f.e r3 = r7.f1458u
            f.m r3 = r3.f()
            r3.l(r5, r4)
            f.e r3 = r7.f1460w
            goto L4f
        L44:
            f.e r3 = r7.f1459v
            f.m r3 = r3.f()
            r3.l(r5, r4)
            f.e r3 = r7.x
        L4f:
            f.m r3 = r3.f()
            r3.l(r5, r4)
            java.util.ArrayList<f.m> r3 = r7.y0
            r3.clear()
            r3 = 0
        L5c:
            int r4 = r7.w0
            if (r3 >= r4) goto L97
            f.f[] r4 = r7.v0
            r4 = r4[r3]
            boolean r6 = r7.z0
            if (r6 != 0) goto L6f
            boolean r6 = r4.c()
            if (r6 != 0) goto L6f
            goto L94
        L6f:
            int r6 = r7.x0
            if (r6 == 0) goto L84
            if (r6 == r2) goto L81
            if (r6 == r0) goto L7e
            if (r6 == r1) goto L7b
            r4 = r5
            goto L8a
        L7b:
            f.e r4 = r4.x
            goto L86
        L7e:
            f.e r4 = r4.f1459v
            goto L86
        L81:
            f.e r4 = r4.f1460w
            goto L86
        L84:
            f.e r4 = r4.f1458u
        L86:
            f.m r4 = r4.f()
        L8a:
            if (r4 == 0) goto L94
            java.util.ArrayList<f.m> r6 = r7.y0
            r6.add(r4)
            r4.a(r8)
        L94:
            int r3 = r3 + 1
            goto L5c
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.d(int):void");
    }
}