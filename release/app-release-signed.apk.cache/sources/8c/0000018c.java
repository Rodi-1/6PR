package p007f;

import java.util.ArrayList;
import p006e.C0354e;
import p006e.C0359i;
import p007f.C0370f;

/* renamed from: f.b */
/* loaded from: classes.dex */
public class C0362b extends C0377j {

    /* renamed from: x0 */
    private int f1819x0 = 0;

    /* renamed from: y0 */
    private ArrayList<C0380m> f1820y0 = new ArrayList<>(4);

    /* renamed from: z0 */
    private boolean f1821z0 = true;

    /* renamed from: K0 */
    public void m908K0(boolean z) {
        this.f1821z0 = z;
    }

    /* renamed from: L0 */
    public void m907L0(int i) {
        this.f1819x0 = i;
    }

    @Override // p007f.C0370f
    /* renamed from: S */
    public void mo864S() {
        super.mo864S();
        this.f1820y0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    @Override // p007f.C0370f
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo863U() {
        /*
            r11 = this;
            int r0 = r11.f1819x0
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
            f.e r0 = r11.f1937x
            goto L1a
        L15:
            f.e r0 = r11.f1935v
            goto L22
        L18:
            f.e r0 = r11.f1936w
        L1a:
            f.m r0 = r0.m896f()
            r1 = 0
            goto L26
        L20:
            f.e r0 = r11.f1934u
        L22:
            f.m r0 = r0.m896f()
        L26:
            java.util.ArrayList<f.m> r5 = r11.f1820y0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L2e:
            if (r7 >= r5) goto L58
            java.util.ArrayList<f.m> r8 = r11.f1820y0
            java.lang.Object r8 = r8.get(r7)
            f.m r8 = (p007f.C0380m) r8
            int r9 = r8.f2008b
            if (r9 == r4) goto L3d
            return
        L3d:
            int r9 = r11.f1819x0
            if (r9 == 0) goto L4b
            if (r9 != r3) goto L44
            goto L4b
        L44:
            float r9 = r8.f1998h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L55
            goto L51
        L4b:
            float r9 = r8.f1998h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L55
        L51:
            f.m r1 = r8.f1997g
            r6 = r1
            r1 = r9
        L55:
            int r7 = r7 + 1
            goto L2e
        L58:
            p006e.C0354e.m935x()
            r0.f1997g = r6
            r0.f1998h = r1
            r0.m753b()
            int r0 = r11.f1819x0
            if (r0 == 0) goto L76
            if (r0 == r4) goto L73
            if (r0 == r3) goto L70
            if (r0 == r2) goto L6d
            return
        L6d:
            f.e r0 = r11.f1935v
            goto L78
        L70:
            f.e r0 = r11.f1937x
            goto L78
        L73:
            f.e r0 = r11.f1934u
            goto L78
        L76:
            f.e r0 = r11.f1936w
        L78:
            f.m r0 = r0.m896f()
            r0.m762l(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0362b.mo863U():void");
    }

    @Override // p007f.C0370f
    /* renamed from: b */
    public void mo779b(C0354e c0354e) {
        Object[] objArr;
        boolean z;
        C0359i c0359i;
        C0365e c0365e;
        int i;
        int i2;
        C0365e[] c0365eArr = this.f1870C;
        c0365eArr[0] = this.f1934u;
        c0365eArr[2] = this.f1935v;
        c0365eArr[1] = this.f1936w;
        c0365eArr[3] = this.f1937x;
        int i3 = 0;
        while (true) {
            objArr = this.f1870C;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].f1848j = c0354e.m941r(objArr[i3]);
            i3++;
        }
        int i4 = this.f1819x0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0365e c0365e2 = objArr[i4];
        for (int i5 = 0; i5 < this.f1991w0; i5++) {
            C0370f c0370f = this.f1990v0[i5];
            if ((this.f1821z0 || c0370f.mo778c()) && ((((i = this.f1819x0) == 0 || i == 1) && c0370f.m827s() == C0370f.EnumC0372b.MATCH_CONSTRAINT) || (((i2 = this.f1819x0) == 2 || i2 == 3) && c0370f.m885B() == C0370f.EnumC0372b.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
        }
        z = false;
        int i6 = this.f1819x0;
        if (i6 == 0 || i6 == 1 ? m823u().m827s() == C0370f.EnumC0372b.WRAP_CONTENT : m823u().m885B() == C0370f.EnumC0372b.WRAP_CONTENT) {
            z = false;
        }
        for (int i7 = 0; i7 < this.f1991w0; i7++) {
            C0370f c0370f2 = this.f1990v0[i7];
            if (this.f1821z0 || c0370f2.mo778c()) {
                C0359i m941r = c0354e.m941r(c0370f2.f1870C[this.f1819x0]);
                C0365e[] c0365eArr2 = c0370f2.f1870C;
                int i8 = this.f1819x0;
                c0365eArr2[i8].f1848j = m941r;
                if (i8 == 0 || i8 == 2) {
                    c0354e.m949j(c0365e2.f1848j, m941r, z);
                } else {
                    c0354e.m951h(c0365e2.f1848j, m941r, z);
                }
            }
        }
        int i9 = this.f1819x0;
        if (i9 == 0) {
            c0354e.m954e(this.f1936w.f1848j, this.f1934u.f1848j, 0, 6);
            if (z) {
                return;
            }
            c0359i = this.f1934u.f1848j;
            c0365e = this.f1873F.f1936w;
        } else if (i9 == 1) {
            c0354e.m954e(this.f1934u.f1848j, this.f1936w.f1848j, 0, 6);
            if (z) {
                return;
            }
            c0359i = this.f1934u.f1848j;
            c0365e = this.f1873F.f1934u;
        } else if (i9 == 2) {
            c0354e.m954e(this.f1937x.f1848j, this.f1935v.f1848j, 0, 6);
            if (z) {
                return;
            }
            c0359i = this.f1935v.f1848j;
            c0365e = this.f1873F.f1937x;
        } else if (i9 != 3) {
            return;
        } else {
            c0354e.m954e(this.f1935v.f1848j, this.f1937x.f1848j, 0, 6);
            if (z) {
                return;
            }
            c0359i = this.f1935v.f1848j;
            c0365e = this.f1873F.f1935v;
        }
        c0354e.m954e(c0359i, c0365e.f1848j, 0, 5);
    }

    @Override // p007f.C0370f
    /* renamed from: c */
    public boolean mo778c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    @Override // p007f.C0370f
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo777d(int r8) {
        /*
            r7 = this;
            f.f r8 = r7.f1873F
            if (r8 != 0) goto L5
            return
        L5:
            f.g r8 = (p007f.C0373g) r8
            r0 = 2
            boolean r8 = r8.m801X0(r0)
            if (r8 != 0) goto Lf
            return
        Lf:
            int r8 = r7.f1819x0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L25
            if (r8 == r2) goto L22
            if (r8 == r0) goto L1f
            if (r8 == r1) goto L1c
            return
        L1c:
            f.e r8 = r7.f1937x
            goto L27
        L1f:
            f.e r8 = r7.f1935v
            goto L27
        L22:
            f.e r8 = r7.f1936w
            goto L27
        L25:
            f.e r8 = r7.f1934u
        L27:
            f.m r8 = r8.m896f()
            r3 = 5
            r8.m758p(r3)
            int r3 = r7.f1819x0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L44
            if (r3 != r2) goto L38
            goto L44
        L38:
            f.e r3 = r7.f1934u
            f.m r3 = r3.m896f()
            r3.m762l(r5, r4)
            f.e r3 = r7.f1936w
            goto L4f
        L44:
            f.e r3 = r7.f1935v
            f.m r3 = r3.m896f()
            r3.m762l(r5, r4)
            f.e r3 = r7.f1937x
        L4f:
            f.m r3 = r3.m896f()
            r3.m762l(r5, r4)
            java.util.ArrayList<f.m> r3 = r7.f1820y0
            r3.clear()
            r3 = 0
        L5c:
            int r4 = r7.f1991w0
            if (r3 >= r4) goto L97
            f.f[] r4 = r7.f1990v0
            r4 = r4[r3]
            boolean r6 = r7.f1821z0
            if (r6 != 0) goto L6f
            boolean r6 = r4.mo778c()
            if (r6 != 0) goto L6f
            goto L94
        L6f:
            int r6 = r7.f1819x0
            if (r6 == 0) goto L84
            if (r6 == r2) goto L81
            if (r6 == r0) goto L7e
            if (r6 == r1) goto L7b
            r4 = r5
            goto L8a
        L7b:
            f.e r4 = r4.f1937x
            goto L86
        L7e:
            f.e r4 = r4.f1935v
            goto L86
        L81:
            f.e r4 = r4.f1936w
            goto L86
        L84:
            f.e r4 = r4.f1934u
        L86:
            f.m r4 = r4.m896f()
        L8a:
            if (r4 == 0) goto L94
            java.util.ArrayList<f.m> r6 = r7.f1820y0
            r6.add(r4)
            r4.m754a(r8)
        L94:
            int r3 = r3 + 1
            goto L5c
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0362b.mo777d(int):void");
    }
}