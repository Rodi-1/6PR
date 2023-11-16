package p006e;

import java.util.Arrays;
import p006e.C0359i;

/* renamed from: e.a */
/* loaded from: classes.dex */
public class C0350a {

    /* renamed from: b */
    private final C0351b f1764b;

    /* renamed from: c */
    private final C0352c f1765c;

    /* renamed from: a */
    int f1763a = 0;

    /* renamed from: d */
    private int f1766d = 8;

    /* renamed from: e */
    private C0359i f1767e = null;

    /* renamed from: f */
    private int[] f1768f = new int[8];

    /* renamed from: g */
    private int[] f1769g = new int[8];

    /* renamed from: h */
    private float[] f1770h = new float[8];

    /* renamed from: i */
    private int f1771i = -1;

    /* renamed from: j */
    private int f1772j = -1;

    /* renamed from: k */
    private boolean f1773k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0350a(C0351b c0351b, C0352c c0352c) {
        this.f1764b = c0351b;
        this.f1765c = c0352c;
    }

    /* renamed from: k */
    private boolean m990k(C0359i c0359i, C0354e c0354e) {
        return c0359i.f1812j <= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1000a(C0359i c0359i, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f1771i;
        if (i == -1) {
            this.f1771i = 0;
            this.f1770h[0] = f;
            this.f1768f[0] = c0359i.f1804b;
            this.f1769g[0] = -1;
            c0359i.f1812j++;
            c0359i.m926a(this.f1764b);
            this.f1763a++;
            if (this.f1773k) {
                return;
            }
            int i2 = this.f1772j + 1;
            this.f1772j = i2;
            int[] iArr = this.f1768f;
            if (i2 >= iArr.length) {
                this.f1773k = true;
                this.f1772j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1763a; i4++) {
            int[] iArr2 = this.f1768f;
            int i5 = iArr2[i];
            int i6 = c0359i.f1804b;
            if (i5 == i6) {
                float[] fArr = this.f1770h;
                fArr[i] = fArr[i] + f;
                if (fArr[i] == 0.0f) {
                    if (i == this.f1771i) {
                        this.f1771i = this.f1769g[i];
                    } else {
                        int[] iArr3 = this.f1769g;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        c0359i.m924c(this.f1764b);
                    }
                    if (this.f1773k) {
                        this.f1772j = i;
                    }
                    c0359i.f1812j--;
                    this.f1763a--;
                    return;
                }
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f1769g[i];
        }
        int i7 = this.f1772j;
        int i8 = i7 + 1;
        if (this.f1773k) {
            int[] iArr4 = this.f1768f;
            if (iArr4[i7] != -1) {
                i7 = iArr4.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr5 = this.f1768f;
        if (i7 >= iArr5.length && this.f1763a < iArr5.length) {
            int i9 = 0;
            while (true) {
                int[] iArr6 = this.f1768f;
                if (i9 >= iArr6.length) {
                    break;
                } else if (iArr6[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr7 = this.f1768f;
        if (i7 >= iArr7.length) {
            i7 = iArr7.length;
            int i10 = this.f1766d * 2;
            this.f1766d = i10;
            this.f1773k = false;
            this.f1772j = i7 - 1;
            this.f1770h = Arrays.copyOf(this.f1770h, i10);
            this.f1768f = Arrays.copyOf(this.f1768f, this.f1766d);
            this.f1769g = Arrays.copyOf(this.f1769g, this.f1766d);
        }
        this.f1768f[i7] = c0359i.f1804b;
        this.f1770h[i7] = f;
        int[] iArr8 = this.f1769g;
        if (i3 != -1) {
            iArr8[i7] = iArr8[i3];
            iArr8[i3] = i7;
        } else {
            iArr8[i7] = this.f1771i;
            this.f1771i = i7;
        }
        c0359i.f1812j++;
        c0359i.m926a(this.f1764b);
        this.f1763a++;
        if (!this.f1773k) {
            this.f1772j++;
        }
        int i11 = this.f1772j;
        int[] iArr9 = this.f1768f;
        if (i11 >= iArr9.length) {
            this.f1773k = true;
            this.f1772j = iArr9.length - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p006e.C0359i m999b(p006e.C0354e r15) {
        /*
            r14 = this;
            int r0 = r14.f1771i
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
            int r9 = r14.f1763a
            if (r4 >= r9) goto L8a
            float[] r9 = r14.f1770h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            e.c r12 = r14.f1765c
            e.i[] r12 = r12.f1781c
            int[] r13 = r14.f1768f
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
            e.b r9 = r14.f1764b
            r12.m924c(r9)
            r10 = 0
        L3d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L83
            e.i$a r11 = r12.f1809g
            e.i$a r13 = p006e.C0359i.EnumC0360a.UNRESTRICTED
            if (r11 != r13) goto L63
            if (r2 != 0) goto L52
        L4a:
            boolean r2 = r14.m990k(r12, r15)
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
            boolean r11 = r14.m990k(r12, r15)
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
            boolean r1 = r14.m990k(r12, r15)
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
            boolean r11 = r14.m990k(r12, r15)
            if (r11 == 0) goto L83
            r8 = r10
            r1 = r12
            r6 = 1
        L83:
            int[] r9 = r14.f1769g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto Lb
        L8a:
            if (r2 == 0) goto L8d
            return r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p006e.C0350a.m999b(e.e):e.i");
    }

    /* renamed from: c */
    public final void m998c() {
        int i = this.f1771i;
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            C0359i c0359i = this.f1765c.f1781c[this.f1768f[i]];
            if (c0359i != null) {
                c0359i.m924c(this.f1764b);
            }
            i = this.f1769g[i];
        }
        this.f1771i = -1;
        this.f1772j = -1;
        this.f1773k = false;
        this.f1763a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m997d(C0359i c0359i) {
        int i = this.f1771i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            if (this.f1768f[i] == c0359i.f1804b) {
                return true;
            }
            i = this.f1769g[i];
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m996e(float f) {
        int i = this.f1771i;
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            float[] fArr = this.f1770h;
            fArr[i] = fArr[i] / f;
            i = this.f1769g[i];
        }
    }

    /* renamed from: f */
    public final float m995f(C0359i c0359i) {
        int i = this.f1771i;
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            if (this.f1768f[i] == c0359i.f1804b) {
                return this.f1770h[i];
            }
            i = this.f1769g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0359i m994g(boolean[] zArr, C0359i c0359i) {
        C0359i.EnumC0360a enumC0360a;
        int i = this.f1771i;
        C0359i c0359i2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            float[] fArr = this.f1770h;
            if (fArr[i] < 0.0f) {
                C0359i c0359i3 = this.f1765c.f1781c[this.f1768f[i]];
                if ((zArr == null || !zArr[c0359i3.f1804b]) && c0359i3 != c0359i && ((enumC0360a = c0359i3.f1809g) == C0359i.EnumC0360a.SLACK || enumC0360a == C0359i.EnumC0360a.ERROR)) {
                    float f2 = fArr[i];
                    if (f2 < f) {
                        f = f2;
                        c0359i2 = c0359i3;
                    }
                }
            }
            i = this.f1769g[i];
        }
        return c0359i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C0359i m993h(int i) {
        int i2 = this.f1771i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1763a; i3++) {
            if (i3 == i) {
                return this.f1765c.f1781c[this.f1768f[i2]];
            }
            i2 = this.f1769g[i2];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final float m992i(int i) {
        int i2 = this.f1771i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1763a; i3++) {
            if (i3 == i) {
                return this.f1770h[i2];
            }
            i2 = this.f1769g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m991j() {
        int i = this.f1771i;
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            float[] fArr = this.f1770h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f1769g[i];
        }
    }

    /* renamed from: l */
    public final void m989l(C0359i c0359i, float f) {
        if (f == 0.0f) {
            m988m(c0359i, true);
            return;
        }
        int i = this.f1771i;
        if (i == -1) {
            this.f1771i = 0;
            this.f1770h[0] = f;
            this.f1768f[0] = c0359i.f1804b;
            this.f1769g[0] = -1;
            c0359i.f1812j++;
            c0359i.m926a(this.f1764b);
            this.f1763a++;
            if (this.f1773k) {
                return;
            }
            int i2 = this.f1772j + 1;
            this.f1772j = i2;
            int[] iArr = this.f1768f;
            if (i2 >= iArr.length) {
                this.f1773k = true;
                this.f1772j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1763a; i4++) {
            int[] iArr2 = this.f1768f;
            int i5 = iArr2[i];
            int i6 = c0359i.f1804b;
            if (i5 == i6) {
                this.f1770h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f1769g[i];
        }
        int i7 = this.f1772j;
        int i8 = i7 + 1;
        if (this.f1773k) {
            int[] iArr3 = this.f1768f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f1768f;
        if (i7 >= iArr4.length && this.f1763a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f1768f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f1768f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f1766d * 2;
            this.f1766d = i10;
            this.f1773k = false;
            this.f1772j = i7 - 1;
            this.f1770h = Arrays.copyOf(this.f1770h, i10);
            this.f1768f = Arrays.copyOf(this.f1768f, this.f1766d);
            this.f1769g = Arrays.copyOf(this.f1769g, this.f1766d);
        }
        this.f1768f[i7] = c0359i.f1804b;
        this.f1770h[i7] = f;
        int[] iArr7 = this.f1769g;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.f1771i;
            this.f1771i = i7;
        }
        c0359i.f1812j++;
        c0359i.m926a(this.f1764b);
        int i11 = this.f1763a + 1;
        this.f1763a = i11;
        if (!this.f1773k) {
            this.f1772j++;
        }
        int[] iArr8 = this.f1768f;
        if (i11 >= iArr8.length) {
            this.f1773k = true;
        }
        if (this.f1772j >= iArr8.length) {
            this.f1773k = true;
            this.f1772j = iArr8.length - 1;
        }
    }

    /* renamed from: m */
    public final float m988m(C0359i c0359i, boolean z) {
        if (this.f1767e == c0359i) {
            this.f1767e = null;
        }
        int i = this.f1771i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1763a) {
            if (this.f1768f[i] == c0359i.f1804b) {
                if (i == this.f1771i) {
                    this.f1771i = this.f1769g[i];
                } else {
                    int[] iArr = this.f1769g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0359i.m924c(this.f1764b);
                }
                c0359i.f1812j--;
                this.f1763a--;
                this.f1768f[i] = -1;
                if (this.f1773k) {
                    this.f1772j = i;
                }
                return this.f1770h[i];
            }
            i2++;
            i3 = i;
            i = this.f1769g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m987n(C0351b c0351b, C0351b c0351b2, boolean z) {
        int i = this.f1771i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
                int i3 = this.f1768f[i];
                C0359i c0359i = c0351b2.f1774a;
                if (i3 == c0359i.f1804b) {
                    float f = this.f1770h[i];
                    m988m(c0359i, z);
                    C0350a c0350a = c0351b2.f1777d;
                    int i4 = c0350a.f1771i;
                    for (int i5 = 0; i4 != -1 && i5 < c0350a.f1763a; i5++) {
                        m1000a(this.f1765c.f1781c[c0350a.f1768f[i4]], c0350a.f1770h[i4] * f, z);
                        i4 = c0350a.f1769g[i4];
                    }
                    c0351b.f1775b += c0351b2.f1775b * f;
                    if (z) {
                        c0351b2.f1774a.m924c(c0351b);
                    }
                    i = this.f1771i;
                } else {
                    i = this.f1769g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m986o(C0351b c0351b, C0351b[] c0351bArr) {
        int i = this.f1771i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
                C0359i c0359i = this.f1765c.f1781c[this.f1768f[i]];
                if (c0359i.f1805c != -1) {
                    float f = this.f1770h[i];
                    m988m(c0359i, true);
                    C0351b c0351b2 = c0351bArr[c0359i.f1805c];
                    if (!c0351b2.f1778e) {
                        C0350a c0350a = c0351b2.f1777d;
                        int i3 = c0350a.f1771i;
                        for (int i4 = 0; i3 != -1 && i4 < c0350a.f1763a; i4++) {
                            m1000a(this.f1765c.f1781c[c0350a.f1768f[i3]], c0350a.f1770h[i3] * f, true);
                            i3 = c0350a.f1769g[i3];
                        }
                    }
                    c0351b.f1775b += c0351b2.f1775b * f;
                    c0351b2.f1774a.m924c(c0351b);
                    i = this.f1771i;
                } else {
                    i = this.f1769g[i];
                }
            }
            return;
        }
    }

    public String toString() {
        int i = this.f1771i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f1763a; i2++) {
            str = ((str + " -> ") + this.f1770h[i] + " : ") + this.f1765c.f1781c[this.f1768f[i]];
            i = this.f1769g[i];
        }
        return str;
    }
}