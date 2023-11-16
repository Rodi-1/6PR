package p007f;

import java.util.ArrayList;
import p006e.C0352c;
import p006e.C0354e;
import p007f.C0365e;

/* renamed from: f.f */
/* loaded from: classes.dex */
public class C0370f {

    /* renamed from: u0 */
    public static float f1867u0 = 0.5f;

    /* renamed from: B */
    C0365e f1869B;

    /* renamed from: C */
    protected C0365e[] f1870C;

    /* renamed from: D */
    protected ArrayList<C0365e> f1871D;

    /* renamed from: E */
    protected EnumC0372b[] f1872E;

    /* renamed from: F */
    C0370f f1873F;

    /* renamed from: G */
    int f1874G;

    /* renamed from: H */
    int f1875H;

    /* renamed from: I */
    protected float f1876I;

    /* renamed from: J */
    protected int f1877J;

    /* renamed from: K */
    protected int f1878K;

    /* renamed from: L */
    protected int f1879L;

    /* renamed from: M */
    int f1880M;

    /* renamed from: N */
    int f1881N;

    /* renamed from: O */
    private int f1882O;

    /* renamed from: P */
    private int f1883P;

    /* renamed from: Q */
    private int f1884Q;

    /* renamed from: R */
    private int f1885R;

    /* renamed from: S */
    protected int f1886S;

    /* renamed from: T */
    protected int f1887T;

    /* renamed from: U */
    int f1888U;

    /* renamed from: V */
    protected int f1889V;

    /* renamed from: W */
    protected int f1890W;

    /* renamed from: X */
    private int f1891X;

    /* renamed from: Y */
    private int f1892Y;

    /* renamed from: Z */
    float f1893Z;

    /* renamed from: a0 */
    float f1895a0;

    /* renamed from: b0 */
    private Object f1897b0;

    /* renamed from: c */
    C0381n f1898c;

    /* renamed from: c0 */
    private int f1899c0;

    /* renamed from: d */
    C0381n f1900d;

    /* renamed from: d0 */
    private int f1901d0;

    /* renamed from: e0 */
    private String f1903e0;

    /* renamed from: f0 */
    private String f1905f0;

    /* renamed from: g0 */
    boolean f1907g0;

    /* renamed from: h0 */
    boolean f1909h0;

    /* renamed from: i0 */
    boolean f1911i0;

    /* renamed from: j0 */
    boolean f1913j0;

    /* renamed from: k0 */
    boolean f1915k0;

    /* renamed from: l0 */
    int f1917l0;

    /* renamed from: m0 */
    int f1919m0;

    /* renamed from: n */
    boolean f1920n;

    /* renamed from: n0 */
    boolean f1921n0;

    /* renamed from: o */
    boolean f1922o;

    /* renamed from: o0 */
    boolean f1923o0;

    /* renamed from: p0 */
    float[] f1925p0;

    /* renamed from: q0 */
    protected C0370f[] f1927q0;

    /* renamed from: r0 */
    protected C0370f[] f1929r0;

    /* renamed from: s0 */
    C0370f f1931s0;

    /* renamed from: t0 */
    C0370f f1933t0;

    /* renamed from: a */
    public int f1894a = -1;

    /* renamed from: b */
    public int f1896b = -1;

    /* renamed from: e */
    int f1902e = 0;

    /* renamed from: f */
    int f1904f = 0;

    /* renamed from: g */
    int[] f1906g = new int[2];

    /* renamed from: h */
    int f1908h = 0;

    /* renamed from: i */
    int f1910i = 0;

    /* renamed from: j */
    float f1912j = 1.0f;

    /* renamed from: k */
    int f1914k = 0;

    /* renamed from: l */
    int f1916l = 0;

    /* renamed from: m */
    float f1918m = 1.0f;

    /* renamed from: p */
    int f1924p = -1;

    /* renamed from: q */
    float f1926q = 1.0f;

    /* renamed from: r */
    C0374h f1928r = null;

    /* renamed from: s */
    private int[] f1930s = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: t */
    private float f1932t = 0.0f;

    /* renamed from: u */
    C0365e f1934u = new C0365e(this, C0365e.EnumC0369d.LEFT);

    /* renamed from: v */
    C0365e f1935v = new C0365e(this, C0365e.EnumC0369d.TOP);

    /* renamed from: w */
    C0365e f1936w = new C0365e(this, C0365e.EnumC0369d.RIGHT);

    /* renamed from: x */
    C0365e f1937x = new C0365e(this, C0365e.EnumC0369d.BOTTOM);

    /* renamed from: y */
    C0365e f1938y = new C0365e(this, C0365e.EnumC0369d.BASELINE);

    /* renamed from: z */
    C0365e f1939z = new C0365e(this, C0365e.EnumC0369d.CENTER_X);

    /* renamed from: A */
    C0365e f1868A = new C0365e(this, C0365e.EnumC0369d.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0371a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1940a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1941b;

        static {
            int[] iArr = new int[EnumC0372b.values().length];
            f1941b = iArr;
            try {
                iArr[EnumC0372b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1941b[EnumC0372b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1941b[EnumC0372b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1941b[EnumC0372b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C0365e.EnumC0369d.values().length];
            f1940a = iArr2;
            try {
                iArr2[C0365e.EnumC0369d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1940a[C0365e.EnumC0369d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1940a[C0365e.EnumC0369d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1940a[C0365e.EnumC0369d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1940a[C0365e.EnumC0369d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1940a[C0365e.EnumC0369d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1940a[C0365e.EnumC0369d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1940a[C0365e.EnumC0369d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1940a[C0365e.EnumC0369d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: f.f$b */
    /* loaded from: classes.dex */
    public enum EnumC0372b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0370f() {
        C0365e c0365e = new C0365e(this, C0365e.EnumC0369d.CENTER);
        this.f1869B = c0365e;
        this.f1870C = new C0365e[]{this.f1934u, this.f1936w, this.f1935v, this.f1937x, this.f1938y, c0365e};
        this.f1871D = new ArrayList<>();
        EnumC0372b enumC0372b = EnumC0372b.FIXED;
        this.f1872E = new EnumC0372b[]{enumC0372b, enumC0372b};
        this.f1873F = null;
        this.f1874G = 0;
        this.f1875H = 0;
        this.f1876I = 0.0f;
        this.f1877J = -1;
        this.f1878K = 0;
        this.f1879L = 0;
        this.f1880M = 0;
        this.f1881N = 0;
        this.f1882O = 0;
        this.f1883P = 0;
        this.f1884Q = 0;
        this.f1885R = 0;
        this.f1886S = 0;
        this.f1887T = 0;
        this.f1888U = 0;
        float f = f1867u0;
        this.f1893Z = f;
        this.f1895a0 = f;
        this.f1899c0 = 0;
        this.f1901d0 = 0;
        this.f1903e0 = null;
        this.f1905f0 = null;
        this.f1911i0 = false;
        this.f1913j0 = false;
        this.f1915k0 = false;
        this.f1917l0 = 0;
        this.f1919m0 = 0;
        this.f1925p0 = new float[]{-1.0f, -1.0f};
        this.f1927q0 = new C0370f[]{null, null};
        this.f1929r0 = new C0370f[]{null, null};
        this.f1931s0 = null;
        this.f1933t0 = null;
        m857a();
    }

    /* renamed from: K */
    private boolean m871K(int i) {
        int i2 = i * 2;
        C0365e[] c0365eArr = this.f1870C;
        if (c0365eArr[i2].f1842d != null && c0365eArr[i2].f1842d.f1842d != c0365eArr[i2]) {
            int i3 = i2 + 1;
            if (c0365eArr[i3].f1842d != null && c0365eArr[i3].f1842d.f1842d == c0365eArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m857a() {
        this.f1871D.add(this.f1934u);
        this.f1871D.add(this.f1935v);
        this.f1871D.add(this.f1936w);
        this.f1871D.add(this.f1937x);
        this.f1871D.add(this.f1939z);
        this.f1871D.add(this.f1868A);
        this.f1871D.add(this.f1869B);
        this.f1871D.add(this.f1938y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cd, code lost:
        if (r27 != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m852e(p006e.C0354e r26, boolean r27, p006e.C0359i r28, p006e.C0359i r29, p007f.C0370f.EnumC0372b r30, boolean r31, p007f.C0365e r32, p007f.C0365e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0370f.m852e(e.e, boolean, e.i, e.i, f.f$b, boolean, f.e, f.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public int m887A() {
        return this.f1879L + this.f1887T;
    }

    /* renamed from: A0 */
    public void m886A0(int i) {
        this.f1892Y = i;
    }

    /* renamed from: B */
    public EnumC0372b m885B() {
        return this.f1872E[1];
    }

    /* renamed from: B0 */
    public void m884B0(int i) {
        this.f1891X = i;
    }

    /* renamed from: C */
    public int m883C() {
        return this.f1901d0;
    }

    /* renamed from: C0 */
    public void m882C0(int i) {
        this.f1878K = i;
    }

    /* renamed from: D */
    public int m881D() {
        if (this.f1901d0 == 8) {
            return 0;
        }
        return this.f1874G;
    }

    /* renamed from: D0 */
    public void m880D0(int i) {
        this.f1879L = i;
    }

    /* renamed from: E */
    public int m879E() {
        return this.f1892Y;
    }

    /* renamed from: E0 */
    public void m878E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f1924p == -1) {
            if (z3 && !z4) {
                this.f1924p = 0;
            } else if (!z3 && z4) {
                this.f1924p = 1;
                if (this.f1877J == -1) {
                    this.f1926q = 1.0f / this.f1926q;
                }
            }
        }
        if (this.f1924p == 0 && (!this.f1935v.m891k() || !this.f1937x.m891k())) {
            this.f1924p = 1;
        } else if (this.f1924p == 1 && (!this.f1934u.m891k() || !this.f1936w.m891k())) {
            this.f1924p = 0;
        }
        if (this.f1924p == -1 && (!this.f1935v.m891k() || !this.f1937x.m891k() || !this.f1934u.m891k() || !this.f1936w.m891k())) {
            if (this.f1935v.m891k() && this.f1937x.m891k()) {
                this.f1924p = 0;
            } else if (this.f1934u.m891k() && this.f1936w.m891k()) {
                this.f1926q = 1.0f / this.f1926q;
                this.f1924p = 1;
            }
        }
        if (this.f1924p == -1) {
            if (z && !z2) {
                this.f1924p = 0;
            } else if (!z && z2) {
                this.f1926q = 1.0f / this.f1926q;
                this.f1924p = 1;
            }
        }
        if (this.f1924p == -1) {
            int i = this.f1908h;
            if (i > 0 && this.f1914k == 0) {
                this.f1924p = 0;
            } else if (i == 0 && this.f1914k > 0) {
                this.f1926q = 1.0f / this.f1926q;
                this.f1924p = 1;
            }
        }
        if (this.f1924p == -1 && z && z2) {
            this.f1926q = 1.0f / this.f1926q;
            this.f1924p = 1;
        }
    }

    /* renamed from: F */
    public int m877F() {
        return this.f1891X;
    }

    /* renamed from: F0 */
    public void mo744F0() {
        int i = this.f1878K;
        int i2 = this.f1879L;
        this.f1882O = i;
        this.f1883P = i2;
        this.f1884Q = (this.f1874G + i) - i;
        this.f1885R = (this.f1875H + i2) - i2;
    }

    /* renamed from: G */
    public int m876G() {
        return this.f1878K;
    }

    /* renamed from: G0 */
    public void mo785G0(C0354e c0354e) {
        int m934y = c0354e.m934y(this.f1934u);
        int m934y2 = c0354e.m934y(this.f1935v);
        int m934y3 = c0354e.m934y(this.f1936w);
        int m934y4 = c0354e.m934y(this.f1937x);
        int i = m934y4 - m934y2;
        if (m934y3 - m934y < 0 || i < 0 || m934y == Integer.MIN_VALUE || m934y == Integer.MAX_VALUE || m934y2 == Integer.MIN_VALUE || m934y2 == Integer.MAX_VALUE || m934y3 == Integer.MIN_VALUE || m934y3 == Integer.MAX_VALUE || m934y4 == Integer.MIN_VALUE || m934y4 == Integer.MAX_VALUE) {
            m934y4 = 0;
            m934y = 0;
            m934y2 = 0;
            m934y3 = 0;
        }
        m856a0(m934y, m934y2, m934y3, m934y4);
    }

    /* renamed from: H */
    public int m875H() {
        return this.f1879L;
    }

    /* renamed from: H0 */
    public void m874H0() {
        for (int i = 0; i < 6; i++) {
            this.f1870C[i].m896f().m757q();
        }
    }

    /* renamed from: I */
    public boolean m873I() {
        return this.f1888U > 0;
    }

    /* renamed from: J */
    public void m872J(C0365e.EnumC0369d enumC0369d, C0370f c0370f, C0365e.EnumC0369d enumC0369d2, int i, int i2) {
        mo776h(enumC0369d).m901a(c0370f.mo776h(enumC0369d2), i, i2, C0365e.EnumC0368c.STRONG, 0, true);
    }

    /* renamed from: L */
    public boolean m870L() {
        return this.f1934u.m896f().f2008b == 1 && this.f1936w.m896f().f2008b == 1 && this.f1935v.m896f().f2008b == 1 && this.f1937x.m896f().f2008b == 1;
    }

    /* renamed from: M */
    public boolean m869M() {
        C0365e c0365e = this.f1934u;
        C0365e c0365e2 = c0365e.f1842d;
        if (c0365e2 == null || c0365e2.f1842d != c0365e) {
            C0365e c0365e3 = this.f1936w;
            C0365e c0365e4 = c0365e3.f1842d;
            return c0365e4 != null && c0365e4.f1842d == c0365e3;
        }
        return true;
    }

    /* renamed from: N */
    public boolean m868N() {
        C0365e c0365e = this.f1935v;
        C0365e c0365e2 = c0365e.f1842d;
        if (c0365e2 == null || c0365e2.f1842d != c0365e) {
            C0365e c0365e3 = this.f1937x;
            C0365e c0365e4 = c0365e3.f1842d;
            return c0365e4 != null && c0365e4.f1842d == c0365e3;
        }
        return true;
    }

    /* renamed from: O */
    public boolean m867O() {
        return this.f1904f == 0 && this.f1876I == 0.0f && this.f1914k == 0 && this.f1916l == 0 && this.f1872E[1] == EnumC0372b.MATCH_CONSTRAINT;
    }

    /* renamed from: P */
    public boolean m866P() {
        return this.f1902e == 0 && this.f1876I == 0.0f && this.f1908h == 0 && this.f1910i == 0 && this.f1872E[0] == EnumC0372b.MATCH_CONSTRAINT;
    }

    /* renamed from: Q */
    public void mo738Q() {
        this.f1934u.m889m();
        this.f1935v.m889m();
        this.f1936w.m889m();
        this.f1937x.m889m();
        this.f1938y.m889m();
        this.f1939z.m889m();
        this.f1868A.m889m();
        this.f1869B.m889m();
        this.f1873F = null;
        this.f1932t = 0.0f;
        this.f1874G = 0;
        this.f1875H = 0;
        this.f1876I = 0.0f;
        this.f1877J = -1;
        this.f1878K = 0;
        this.f1879L = 0;
        this.f1882O = 0;
        this.f1883P = 0;
        this.f1884Q = 0;
        this.f1885R = 0;
        this.f1886S = 0;
        this.f1887T = 0;
        this.f1888U = 0;
        this.f1889V = 0;
        this.f1890W = 0;
        this.f1891X = 0;
        this.f1892Y = 0;
        float f = f1867u0;
        this.f1893Z = f;
        this.f1895a0 = f;
        EnumC0372b[] enumC0372bArr = this.f1872E;
        EnumC0372b enumC0372b = EnumC0372b.FIXED;
        enumC0372bArr[0] = enumC0372b;
        enumC0372bArr[1] = enumC0372b;
        this.f1897b0 = null;
        this.f1899c0 = 0;
        this.f1901d0 = 0;
        this.f1905f0 = null;
        this.f1907g0 = false;
        this.f1909h0 = false;
        this.f1917l0 = 0;
        this.f1919m0 = 0;
        this.f1921n0 = false;
        this.f1923o0 = false;
        float[] fArr = this.f1925p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1894a = -1;
        this.f1896b = -1;
        int[] iArr = this.f1930s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1902e = 0;
        this.f1904f = 0;
        this.f1912j = 1.0f;
        this.f1918m = 1.0f;
        this.f1910i = Integer.MAX_VALUE;
        this.f1916l = Integer.MAX_VALUE;
        this.f1908h = 0;
        this.f1914k = 0;
        this.f1924p = -1;
        this.f1926q = 1.0f;
        C0381n c0381n = this.f1898c;
        if (c0381n != null) {
            c0381n.mo750e();
        }
        C0381n c0381n2 = this.f1900d;
        if (c0381n2 != null) {
            c0381n2.mo750e();
        }
        this.f1928r = null;
        this.f1911i0 = false;
        this.f1913j0 = false;
        this.f1915k0 = false;
    }

    /* renamed from: R */
    public void m865R() {
        C0370f m823u = m823u();
        if (m823u != null && (m823u instanceof C0373g) && ((C0373g) m823u()).m806S0()) {
            return;
        }
        int size = this.f1871D.size();
        for (int i = 0; i < size; i++) {
            this.f1871D.get(i).m889m();
        }
    }

    /* renamed from: S */
    public void mo864S() {
        for (int i = 0; i < 6; i++) {
            this.f1870C[i].m896f().mo750e();
        }
    }

    /* renamed from: T */
    public void mo737T(C0352c c0352c) {
        this.f1934u.m888n(c0352c);
        this.f1935v.m888n(c0352c);
        this.f1936w.m888n(c0352c);
        this.f1937x.m888n(c0352c);
        this.f1938y.m888n(c0352c);
        this.f1869B.m888n(c0352c);
        this.f1939z.m888n(c0352c);
        this.f1868A.m888n(c0352c);
    }

    /* renamed from: U */
    public void mo863U() {
    }

    /* renamed from: V */
    public void m862V(int i) {
        this.f1888U = i;
    }

    /* renamed from: W */
    public void m861W(Object obj) {
        this.f1897b0 = obj;
    }

    /* renamed from: X */
    public void m860X(String str) {
        this.f1903e0 = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    /* renamed from: Y */
    public void m859Y(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f1876I = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.f1876I = f;
            this.f1877J = i2;
        }
    }

    /* renamed from: Z */
    public void m858Z(int i, int i2, int i3) {
        if (i3 == 0) {
            m849f0(i, i2);
        } else if (i3 == 1) {
            m824t0(i, i2);
        }
        this.f1913j0 = true;
    }

    /* renamed from: a0 */
    public void m856a0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f1878K = i;
        this.f1879L = i2;
        if (this.f1901d0 == 8) {
            this.f1874G = 0;
            this.f1875H = 0;
            return;
        }
        EnumC0372b[] enumC0372bArr = this.f1872E;
        EnumC0372b enumC0372b = enumC0372bArr[0];
        EnumC0372b enumC0372b2 = EnumC0372b.FIXED;
        if (enumC0372b == enumC0372b2 && i7 < (i6 = this.f1874G)) {
            i7 = i6;
        }
        if (enumC0372bArr[1] == enumC0372b2 && i8 < (i5 = this.f1875H)) {
            i8 = i5;
        }
        this.f1874G = i7;
        this.f1875H = i8;
        int i9 = this.f1890W;
        if (i8 < i9) {
            this.f1875H = i9;
        }
        int i10 = this.f1889V;
        if (i7 < i10) {
            this.f1874G = i10;
        }
        this.f1913j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0233 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo779b(p006e.C0354e r42) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0370f.mo779b(e.e):void");
    }

    /* renamed from: b0 */
    public void m855b0(int i) {
        this.f1875H = i;
        int i2 = this.f1890W;
        if (i < i2) {
            this.f1875H = i2;
        }
    }

    /* renamed from: c */
    public boolean mo778c() {
        return this.f1901d0 != 8;
    }

    /* renamed from: c0 */
    public void m854c0(boolean z) {
        this.f1922o = z;
    }

    /* renamed from: d */
    public void mo777d(int i) {
        C0378k.m772a(i, this);
    }

    /* renamed from: d0 */
    public void m853d0(float f) {
        this.f1893Z = f;
    }

    /* renamed from: e0 */
    public void m851e0(int i) {
        this.f1917l0 = i;
    }

    /* renamed from: f */
    public void m850f(C0370f c0370f, float f, int i) {
        C0365e.EnumC0369d enumC0369d = C0365e.EnumC0369d.CENTER;
        m872J(enumC0369d, c0370f, enumC0369d, i, 0);
        this.f1932t = f;
    }

    /* renamed from: f0 */
    public void m849f0(int i, int i2) {
        this.f1878K = i;
        int i3 = i2 - i;
        this.f1874G = i3;
        int i4 = this.f1889V;
        if (i3 < i4) {
            this.f1874G = i4;
        }
    }

    /* renamed from: g */
    public void m848g(C0354e c0354e) {
        c0354e.m941r(this.f1934u);
        c0354e.m941r(this.f1935v);
        c0354e.m941r(this.f1936w);
        c0354e.m941r(this.f1937x);
        if (this.f1888U > 0) {
            c0354e.m941r(this.f1938y);
        }
    }

    /* renamed from: g0 */
    public void m847g0(EnumC0372b enumC0372b) {
        this.f1872E[0] = enumC0372b;
        if (enumC0372b == EnumC0372b.WRAP_CONTENT) {
            m814y0(this.f1891X);
        }
    }

    /* renamed from: h */
    public C0365e mo776h(C0365e.EnumC0369d enumC0369d) {
        switch (C0371a.f1940a[enumC0369d.ordinal()]) {
            case 1:
                return this.f1934u;
            case 2:
                return this.f1935v;
            case 3:
                return this.f1936w;
            case 4:
                return this.f1937x;
            case 5:
                return this.f1938y;
            case 6:
                return this.f1869B;
            case 7:
                return this.f1939z;
            case 8:
                return this.f1868A;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC0369d.name());
        }
    }

    /* renamed from: h0 */
    public void m846h0(int i, int i2, int i3, float f) {
        this.f1902e = i;
        this.f1908h = i2;
        this.f1910i = i3;
        this.f1912j = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f1902e = 2;
    }

    /* renamed from: i */
    public ArrayList<C0365e> mo775i() {
        return this.f1871D;
    }

    /* renamed from: i0 */
    public void m845i0(float f) {
        this.f1925p0[0] = f;
    }

    /* renamed from: j */
    public int m844j() {
        return this.f1888U;
    }

    /* renamed from: j0 */
    public void m843j0(int i) {
        this.f1930s[1] = i;
    }

    /* renamed from: k */
    public float m842k(int i) {
        if (i == 0) {
            return this.f1893Z;
        }
        if (i == 1) {
            return this.f1895a0;
        }
        return -1.0f;
    }

    /* renamed from: k0 */
    public void m841k0(int i) {
        this.f1930s[0] = i;
    }

    /* renamed from: l */
    public int m840l() {
        return m875H() + this.f1875H;
    }

    /* renamed from: l0 */
    public void m839l0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f1890W = i;
    }

    /* renamed from: m */
    public Object m838m() {
        return this.f1897b0;
    }

    /* renamed from: m0 */
    public void m837m0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f1889V = i;
    }

    /* renamed from: n */
    public String m836n() {
        return this.f1903e0;
    }

    /* renamed from: n0 */
    public void mo736n0(int i, int i2) {
        this.f1886S = i;
        this.f1887T = i2;
    }

    /* renamed from: o */
    public EnumC0372b m835o(int i) {
        if (i == 0) {
            return m827s();
        }
        if (i == 1) {
            return m885B();
        }
        return null;
    }

    /* renamed from: o0 */
    public void m834o0(int i, int i2) {
        this.f1878K = i;
        this.f1879L = i2;
    }

    /* renamed from: p */
    public int m833p() {
        return this.f1882O + this.f1886S;
    }

    /* renamed from: p0 */
    public void m832p0(C0370f c0370f) {
        this.f1873F = c0370f;
    }

    /* renamed from: q */
    public int m831q() {
        return this.f1883P + this.f1887T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m830q0(int i, int i2) {
        if (i2 == 0) {
            this.f1880M = i;
        } else if (i2 == 1) {
            this.f1881N = i;
        }
    }

    /* renamed from: r */
    public int m829r() {
        if (this.f1901d0 == 8) {
            return 0;
        }
        return this.f1875H;
    }

    /* renamed from: r0 */
    public void m828r0(float f) {
        this.f1895a0 = f;
    }

    /* renamed from: s */
    public EnumC0372b m827s() {
        return this.f1872E[0];
    }

    /* renamed from: s0 */
    public void m826s0(int i) {
        this.f1919m0 = i;
    }

    /* renamed from: t */
    public int m825t(int i) {
        if (i == 0) {
            return m881D();
        }
        if (i == 1) {
            return m829r();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void m824t0(int i, int i2) {
        this.f1879L = i;
        int i3 = i2 - i;
        this.f1875H = i3;
        int i4 = this.f1890W;
        if (i3 < i4) {
            this.f1875H = i4;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f1905f0 != null) {
            str = "type: " + this.f1905f0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1903e0 != null) {
            str2 = "id: " + this.f1903e0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1878K);
        sb.append(", ");
        sb.append(this.f1879L);
        sb.append(") - (");
        sb.append(this.f1874G);
        sb.append(" x ");
        sb.append(this.f1875H);
        sb.append(") wrap: (");
        sb.append(this.f1891X);
        sb.append(" x ");
        sb.append(this.f1892Y);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public C0370f m823u() {
        return this.f1873F;
    }

    /* renamed from: u0 */
    public void m822u0(EnumC0372b enumC0372b) {
        this.f1872E[1] = enumC0372b;
        if (enumC0372b == EnumC0372b.WRAP_CONTENT) {
            m855b0(this.f1892Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m821v(int i) {
        if (i == 0) {
            return this.f1880M;
        }
        if (i == 1) {
            return this.f1881N;
        }
        return 0;
    }

    /* renamed from: v0 */
    public void m820v0(int i, int i2, int i3, float f) {
        this.f1904f = i;
        this.f1914k = i2;
        this.f1916l = i3;
        this.f1918m = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f1904f = 2;
    }

    /* renamed from: w */
    public C0381n m819w() {
        if (this.f1900d == null) {
            this.f1900d = new C0381n();
        }
        return this.f1900d;
    }

    /* renamed from: w0 */
    public void m818w0(float f) {
        this.f1925p0[1] = f;
    }

    /* renamed from: x */
    public C0381n m817x() {
        if (this.f1898c == null) {
            this.f1898c = new C0381n();
        }
        return this.f1898c;
    }

    /* renamed from: x0 */
    public void m816x0(int i) {
        this.f1901d0 = i;
    }

    /* renamed from: y */
    public int m815y() {
        return m876G() + this.f1874G;
    }

    /* renamed from: y0 */
    public void m814y0(int i) {
        this.f1874G = i;
        int i2 = this.f1889V;
        if (i < i2) {
            this.f1874G = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public int m813z() {
        return this.f1878K + this.f1886S;
    }

    /* renamed from: z0 */
    public void m812z0(boolean z) {
        this.f1920n = z;
    }
}