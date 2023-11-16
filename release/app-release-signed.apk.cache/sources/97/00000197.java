package p007f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006e.C0354e;
import p007f.C0365e;
import p007f.C0370f;

/* renamed from: f.g */
/* loaded from: classes.dex */
public class C0373g extends C0385q {

    /* renamed from: A0 */
    int f1947A0;

    /* renamed from: B0 */
    int f1948B0;

    /* renamed from: C0 */
    int f1949C0;

    /* renamed from: y0 */
    private C0383p f1967y0;

    /* renamed from: z0 */
    int f1968z0;

    /* renamed from: w0 */
    private boolean f1965w0 = false;

    /* renamed from: x0 */
    protected C0354e f1966x0 = new C0354e();

    /* renamed from: D0 */
    int f1950D0 = 0;

    /* renamed from: E0 */
    int f1951E0 = 0;

    /* renamed from: F0 */
    C0364d[] f1952F0 = new C0364d[4];

    /* renamed from: G0 */
    C0364d[] f1953G0 = new C0364d[4];

    /* renamed from: H0 */
    public List<C0374h> f1954H0 = new ArrayList();

    /* renamed from: I0 */
    public boolean f1955I0 = false;

    /* renamed from: J0 */
    public boolean f1956J0 = false;

    /* renamed from: K0 */
    public boolean f1957K0 = false;

    /* renamed from: L0 */
    public int f1958L0 = 0;

    /* renamed from: M0 */
    public int f1959M0 = 0;

    /* renamed from: N0 */
    private int f1960N0 = 7;

    /* renamed from: O0 */
    public boolean f1961O0 = false;

    /* renamed from: P0 */
    private boolean f1962P0 = false;

    /* renamed from: Q0 */
    private boolean f1963Q0 = false;

    /* renamed from: R0 */
    int f1964R0 = 0;

    /* renamed from: P0 */
    private void m809P0(C0370f c0370f) {
        int i = this.f1950D0 + 1;
        C0364d[] c0364dArr = this.f1953G0;
        if (i >= c0364dArr.length) {
            this.f1953G0 = (C0364d[]) Arrays.copyOf(c0364dArr, c0364dArr.length * 2);
        }
        this.f1953G0[this.f1950D0] = new C0364d(c0370f, 0, m804U0());
        this.f1950D0++;
    }

    /* renamed from: Q0 */
    private void m808Q0(C0370f c0370f) {
        int i = this.f1951E0 + 1;
        C0364d[] c0364dArr = this.f1952F0;
        if (i >= c0364dArr.length) {
            this.f1952F0 = (C0364d[]) Arrays.copyOf(c0364dArr, c0364dArr.length * 2);
        }
        this.f1952F0[this.f1951E0] = new C0364d(c0370f, 1, m804U0());
        this.f1951E0++;
    }

    /* renamed from: b1 */
    private void m797b1() {
        this.f1950D0 = 0;
        this.f1951E0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // p007f.C0385q
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo741K0() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0373g.mo741K0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m811N0(C0370f c0370f, int i) {
        if (i == 0) {
            m809P0(c0370f);
        } else if (i == 1) {
            m808Q0(c0370f);
        }
    }

    /* renamed from: O0 */
    public boolean m810O0(C0354e c0354e) {
        mo779b(c0354e);
        int size = this.f2019v0.size();
        for (int i = 0; i < size; i++) {
            C0370f c0370f = this.f2019v0.get(i);
            if (c0370f instanceof C0373g) {
                C0370f.EnumC0372b[] enumC0372bArr = c0370f.f1872E;
                C0370f.EnumC0372b enumC0372b = enumC0372bArr[0];
                C0370f.EnumC0372b enumC0372b2 = enumC0372bArr[1];
                C0370f.EnumC0372b enumC0372b3 = C0370f.EnumC0372b.WRAP_CONTENT;
                if (enumC0372b == enumC0372b3) {
                    c0370f.m847g0(C0370f.EnumC0372b.FIXED);
                }
                if (enumC0372b2 == enumC0372b3) {
                    c0370f.m822u0(C0370f.EnumC0372b.FIXED);
                }
                c0370f.mo779b(c0354e);
                if (enumC0372b == enumC0372b3) {
                    c0370f.m847g0(enumC0372b);
                }
                if (enumC0372b2 == enumC0372b3) {
                    c0370f.m822u0(enumC0372b2);
                }
            } else {
                C0378k.m770c(this, c0354e, c0370f);
                c0370f.mo779b(c0354e);
            }
        }
        if (this.f1950D0 > 0) {
            C0363c.m906a(this, c0354e, 0);
        }
        if (this.f1951E0 > 0) {
            C0363c.m906a(this, c0354e, 1);
        }
        return true;
    }

    @Override // p007f.C0385q, p007f.C0370f
    /* renamed from: Q */
    public void mo738Q() {
        this.f1966x0.m960E();
        this.f1968z0 = 0;
        this.f1948B0 = 0;
        this.f1947A0 = 0;
        this.f1949C0 = 0;
        this.f1954H0.clear();
        this.f1961O0 = false;
        super.mo738Q();
    }

    /* renamed from: R0 */
    public int m807R0() {
        return this.f1960N0;
    }

    /* renamed from: S0 */
    public boolean m806S0() {
        return false;
    }

    /* renamed from: T0 */
    public boolean m805T0() {
        return this.f1963Q0;
    }

    /* renamed from: U0 */
    public boolean m804U0() {
        return this.f1965w0;
    }

    /* renamed from: V0 */
    public boolean m803V0() {
        return this.f1962P0;
    }

    /* renamed from: W0 */
    public void m802W0() {
        if (!m801X0(8)) {
            mo777d(this.f1960N0);
        }
        m794e1();
    }

    /* renamed from: X0 */
    public boolean m801X0(int i) {
        return (this.f1960N0 & i) == i;
    }

    /* renamed from: Y0 */
    public void m800Y0(int i, int i2) {
        C0381n c0381n;
        C0381n c0381n2;
        C0370f.EnumC0372b enumC0372b = this.f1872E[0];
        C0370f.EnumC0372b enumC0372b2 = C0370f.EnumC0372b.WRAP_CONTENT;
        if (enumC0372b != enumC0372b2 && (c0381n2 = this.f1898c) != null) {
            c0381n2.m755h(i);
        }
        if (this.f1872E[1] == enumC0372b2 || (c0381n = this.f1900d) == null) {
            return;
        }
        c0381n.m755h(i2);
    }

    /* renamed from: Z0 */
    public void m799Z0() {
        int size = this.f2019v0.size();
        mo864S();
        for (int i = 0; i < size; i++) {
            this.f2019v0.get(i).mo864S();
        }
    }

    /* renamed from: a1 */
    public void m798a1() {
        m799Z0();
        mo777d(this.f1960N0);
    }

    /* renamed from: c1 */
    public void m796c1(int i) {
        this.f1960N0 = i;
    }

    @Override // p007f.C0370f
    /* renamed from: d */
    public void mo777d(int i) {
        super.mo777d(i);
        int size = this.f2019v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2019v0.get(i2).mo777d(i);
        }
    }

    /* renamed from: d1 */
    public void m795d1(boolean z) {
        this.f1965w0 = z;
    }

    /* renamed from: e1 */
    public void m794e1() {
        C0380m m896f = mo776h(C0365e.EnumC0369d.LEFT).m896f();
        C0380m m896f2 = mo776h(C0365e.EnumC0369d.TOP).m896f();
        m896f.m762l(null, 0.0f);
        m896f2.m762l(null, 0.0f);
    }

    /* renamed from: f1 */
    public void m793f1(C0354e c0354e, boolean[] zArr) {
        zArr[2] = false;
        mo785G0(c0354e);
        int size = this.f2019v0.size();
        for (int i = 0; i < size; i++) {
            C0370f c0370f = this.f2019v0.get(i);
            c0370f.mo785G0(c0354e);
            C0370f.EnumC0372b enumC0372b = c0370f.f1872E[0];
            C0370f.EnumC0372b enumC0372b2 = C0370f.EnumC0372b.MATCH_CONSTRAINT;
            if (enumC0372b == enumC0372b2 && c0370f.m881D() < c0370f.m877F()) {
                zArr[2] = true;
            }
            if (c0370f.f1872E[1] == enumC0372b2 && c0370f.m829r() < c0370f.m879E()) {
                zArr[2] = true;
            }
        }
    }
}