package e;

import e.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private final b f1338b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1339c;

    /* renamed from: a  reason: collision with root package name */
    int f1337a = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f1340d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f1341e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1342f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f1343g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f1344h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f1345i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f1346j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1347k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f1338b = bVar;
        this.f1339c = cVar;
    }

    private boolean k(i iVar, e eVar) {
        return iVar.f1386j <= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(i iVar, float f2, boolean z) {
        if (f2 == 0.0f) {
            return;
        }
        int i2 = this.f1345i;
        if (i2 == -1) {
            this.f1345i = 0;
            this.f1344h[0] = f2;
            this.f1342f[0] = iVar.f1378b;
            this.f1343g[0] = -1;
            iVar.f1386j++;
            iVar.a(this.f1338b);
            this.f1337a++;
            if (this.f1347k) {
                return;
            }
            int i3 = this.f1346j + 1;
            this.f1346j = i3;
            int[] iArr = this.f1342f;
            if (i3 >= iArr.length) {
                this.f1347k = true;
                this.f1346j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1337a; i5++) {
            int[] iArr2 = this.f1342f;
            int i6 = iArr2[i2];
            int i7 = iVar.f1378b;
            if (i6 == i7) {
                float[] fArr = this.f1344h;
                fArr[i2] = fArr[i2] + f2;
                if (fArr[i2] == 0.0f) {
                    if (i2 == this.f1345i) {
                        this.f1345i = this.f1343g[i2];
                    } else {
                        int[] iArr3 = this.f1343g;
                        iArr3[i4] = iArr3[i2];
                    }
                    if (z) {
                        iVar.c(this.f1338b);
                    }
                    if (this.f1347k) {
                        this.f1346j = i2;
                    }
                    iVar.f1386j--;
                    this.f1337a--;
                    return;
                }
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f1343g[i2];
        }
        int i8 = this.f1346j;
        int i9 = i8 + 1;
        if (this.f1347k) {
            int[] iArr4 = this.f1342f;
            if (iArr4[i8] != -1) {
                i8 = iArr4.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr5 = this.f1342f;
        if (i8 >= iArr5.length && this.f1337a < iArr5.length) {
            int i10 = 0;
            while (true) {
                int[] iArr6 = this.f1342f;
                if (i10 >= iArr6.length) {
                    break;
                } else if (iArr6[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr7 = this.f1342f;
        if (i8 >= iArr7.length) {
            i8 = iArr7.length;
            int i11 = this.f1340d * 2;
            this.f1340d = i11;
            this.f1347k = false;
            this.f1346j = i8 - 1;
            this.f1344h = Arrays.copyOf(this.f1344h, i11);
            this.f1342f = Arrays.copyOf(this.f1342f, this.f1340d);
            this.f1343g = Arrays.copyOf(this.f1343g, this.f1340d);
        }
        this.f1342f[i8] = iVar.f1378b;
        this.f1344h[i8] = f2;
        int[] iArr8 = this.f1343g;
        if (i4 != -1) {
            iArr8[i8] = iArr8[i4];
            iArr8[i4] = i8;
        } else {
            iArr8[i8] = this.f1345i;
            this.f1345i = i8;
        }
        iVar.f1386j++;
        iVar.a(this.f1338b);
        this.f1337a++;
        if (!this.f1347k) {
            this.f1346j++;
        }
        int i12 = this.f1346j;
        int[] iArr9 = this.f1342f;
        if (i12 >= iArr9.length) {
            this.f1347k = true;
            this.f1346j = iArr9.length - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e.i b(e.e r15) {
        /*
            r14 = this;
            int r0 = r14.f1345i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lb:
            r9 = -1
            if (r0 == r9) goto L8a
            int r9 = r14.f1337a
            if (r4 >= r9) goto L8a
            float[] r9 = r14.f1344h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            e.c r12 = r14.f1339c
            e.i[] r12 = r12.f1355c
            int[] r13 = r14.f1342f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L31
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L3d
            r9[r0] = r3
            goto L37
        L31:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r9[r0] = r3
        L37:
            e.b r9 = r14.f1338b
            r12.c(r9)
            r10 = 0
        L3d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L83
            e.i$a r11 = r12.f1383g
            e.i$a r13 = e.i.a.UNRESTRICTED
            if (r11 != r13) goto L63
            if (r2 != 0) goto L52
        L4a:
            boolean r2 = r14.k(r12, r15)
            r5 = r2
            r7 = r10
            r2 = r12
            goto L83
        L52:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L57
            goto L4a
        L57:
            if (r5 != 0) goto L83
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L83
            r7 = r10
            r2 = r12
            r5 = 1
            goto L83
        L63:
            if (r2 != 0) goto L83
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L83
            if (r1 != 0) goto L73
        L6b:
            boolean r1 = r14.k(r12, r15)
            r6 = r1
            r8 = r10
            r1 = r12
            goto L83
        L73:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L78
            goto L6b
        L78:
            if (r6 != 0) goto L83
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L83
            r8 = r10
            r1 = r12
            r6 = 1
        L83:
            int[] r9 = r14.f1343g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto Lb
        L8a:
            if (r2 == 0) goto L8d
            return r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.b(e.e):e.i");
    }

    public final void c() {
        int i2 = this.f1345i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            i iVar = this.f1339c.f1355c[this.f1342f[i2]];
            if (iVar != null) {
                iVar.c(this.f1338b);
            }
            i2 = this.f1343g[i2];
        }
        this.f1345i = -1;
        this.f1346j = -1;
        this.f1347k = false;
        this.f1337a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(i iVar) {
        int i2 = this.f1345i;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            if (this.f1342f[i2] == iVar.f1378b) {
                return true;
            }
            i2 = this.f1343g[i2];
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f2) {
        int i2 = this.f1345i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            float[] fArr = this.f1344h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1343g[i2];
        }
    }

    public final float f(i iVar) {
        int i2 = this.f1345i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            if (this.f1342f[i2] == iVar.f1378b) {
                return this.f1344h[i2];
            }
            i2 = this.f1343g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i g(boolean[] zArr, i iVar) {
        i.a aVar;
        int i2 = this.f1345i;
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            float[] fArr = this.f1344h;
            if (fArr[i2] < 0.0f) {
                i iVar3 = this.f1339c.f1355c[this.f1342f[i2]];
                if ((zArr == null || !zArr[iVar3.f1378b]) && iVar3 != iVar && ((aVar = iVar3.f1383g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f3 = fArr[i2];
                    if (f3 < f2) {
                        f2 = f3;
                        iVar2 = iVar3;
                    }
                }
            }
            i2 = this.f1343g[i2];
        }
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i h(int i2) {
        int i3 = this.f1345i;
        for (int i4 = 0; i3 != -1 && i4 < this.f1337a; i4++) {
            if (i4 == i2) {
                return this.f1339c.f1355c[this.f1342f[i3]];
            }
            i3 = this.f1343g[i3];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float i(int i2) {
        int i3 = this.f1345i;
        for (int i4 = 0; i3 != -1 && i4 < this.f1337a; i4++) {
            if (i4 == i2) {
                return this.f1344h[i3];
            }
            i3 = this.f1343g[i3];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        int i2 = this.f1345i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            float[] fArr = this.f1344h;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1343g[i2];
        }
    }

    public final void l(i iVar, float f2) {
        if (f2 == 0.0f) {
            m(iVar, true);
            return;
        }
        int i2 = this.f1345i;
        if (i2 == -1) {
            this.f1345i = 0;
            this.f1344h[0] = f2;
            this.f1342f[0] = iVar.f1378b;
            this.f1343g[0] = -1;
            iVar.f1386j++;
            iVar.a(this.f1338b);
            this.f1337a++;
            if (this.f1347k) {
                return;
            }
            int i3 = this.f1346j + 1;
            this.f1346j = i3;
            int[] iArr = this.f1342f;
            if (i3 >= iArr.length) {
                this.f1347k = true;
                this.f1346j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1337a; i5++) {
            int[] iArr2 = this.f1342f;
            int i6 = iArr2[i2];
            int i7 = iVar.f1378b;
            if (i6 == i7) {
                this.f1344h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f1343g[i2];
        }
        int i8 = this.f1346j;
        int i9 = i8 + 1;
        if (this.f1347k) {
            int[] iArr3 = this.f1342f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f1342f;
        if (i8 >= iArr4.length && this.f1337a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f1342f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f1342f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f1340d * 2;
            this.f1340d = i11;
            this.f1347k = false;
            this.f1346j = i8 - 1;
            this.f1344h = Arrays.copyOf(this.f1344h, i11);
            this.f1342f = Arrays.copyOf(this.f1342f, this.f1340d);
            this.f1343g = Arrays.copyOf(this.f1343g, this.f1340d);
        }
        this.f1342f[i8] = iVar.f1378b;
        this.f1344h[i8] = f2;
        int[] iArr7 = this.f1343g;
        if (i4 != -1) {
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            iArr7[i8] = this.f1345i;
            this.f1345i = i8;
        }
        iVar.f1386j++;
        iVar.a(this.f1338b);
        int i12 = this.f1337a + 1;
        this.f1337a = i12;
        if (!this.f1347k) {
            this.f1346j++;
        }
        int[] iArr8 = this.f1342f;
        if (i12 >= iArr8.length) {
            this.f1347k = true;
        }
        if (this.f1346j >= iArr8.length) {
            this.f1347k = true;
            this.f1346j = iArr8.length - 1;
        }
    }

    public final float m(i iVar, boolean z) {
        if (this.f1341e == iVar) {
            this.f1341e = null;
        }
        int i2 = this.f1345i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1337a) {
            if (this.f1342f[i2] == iVar.f1378b) {
                if (i2 == this.f1345i) {
                    this.f1345i = this.f1343g[i2];
                } else {
                    int[] iArr = this.f1343g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.f1338b);
                }
                iVar.f1386j--;
                this.f1337a--;
                this.f1342f[i2] = -1;
                if (this.f1347k) {
                    this.f1346j = i2;
                }
                return this.f1344h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1343g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(b bVar, b bVar2, boolean z) {
        int i2 = this.f1345i;
        while (true) {
            for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
                int i4 = this.f1342f[i2];
                i iVar = bVar2.f1348a;
                if (i4 == iVar.f1378b) {
                    float f2 = this.f1344h[i2];
                    m(iVar, z);
                    a aVar = bVar2.f1351d;
                    int i5 = aVar.f1345i;
                    for (int i6 = 0; i5 != -1 && i6 < aVar.f1337a; i6++) {
                        a(this.f1339c.f1355c[aVar.f1342f[i5]], aVar.f1344h[i5] * f2, z);
                        i5 = aVar.f1343g[i5];
                    }
                    bVar.f1349b += bVar2.f1349b * f2;
                    if (z) {
                        bVar2.f1348a.c(bVar);
                    }
                    i2 = this.f1345i;
                } else {
                    i2 = this.f1343g[i2];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar, b[] bVarArr) {
        int i2 = this.f1345i;
        while (true) {
            for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
                i iVar = this.f1339c.f1355c[this.f1342f[i2]];
                if (iVar.f1379c != -1) {
                    float f2 = this.f1344h[i2];
                    m(iVar, true);
                    b bVar2 = bVarArr[iVar.f1379c];
                    if (!bVar2.f1352e) {
                        a aVar = bVar2.f1351d;
                        int i4 = aVar.f1345i;
                        for (int i5 = 0; i4 != -1 && i5 < aVar.f1337a; i5++) {
                            a(this.f1339c.f1355c[aVar.f1342f[i4]], aVar.f1344h[i4] * f2, true);
                            i4 = aVar.f1343g[i4];
                        }
                    }
                    bVar.f1349b += bVar2.f1349b * f2;
                    bVar2.f1348a.c(bVar);
                    i2 = this.f1345i;
                } else {
                    i2 = this.f1343g[i2];
                }
            }
            return;
        }
    }

    public String toString() {
        int i2 = this.f1345i;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f1337a; i3++) {
            str = ((str + " -> ") + this.f1344h[i2] + " : ") + this.f1339c.f1355c[this.f1342f[i2]];
            i2 = this.f1343g[i2];
        }
        return str;
    }
}