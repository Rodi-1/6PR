package f;

import f.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f {
    public static float u0 = 0.5f;
    e B;
    protected e[] C;
    protected ArrayList<e> D;
    protected b[] E;
    f F;
    int G;
    int H;
    protected float I;
    protected int J;
    protected int K;
    protected int L;
    int M;
    int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    protected int S;
    protected int T;
    int U;
    protected int V;
    protected int W;
    private int X;
    private int Y;
    float Z;
    float a0;
    private Object b0;

    /* renamed from: c  reason: collision with root package name */
    n f1440c;
    private int c0;

    /* renamed from: d  reason: collision with root package name */
    n f1441d;
    private int d0;
    private String e0;
    private String f0;
    boolean g0;
    boolean h0;
    boolean i0;
    boolean j0;
    boolean k0;
    int l0;
    int m0;

    /* renamed from: n  reason: collision with root package name */
    boolean f1451n;
    boolean n0;

    /* renamed from: o  reason: collision with root package name */
    boolean f1452o;
    boolean o0;
    float[] p0;
    protected f[] q0;
    protected f[] r0;
    f s0;
    f t0;

    /* renamed from: a  reason: collision with root package name */
    public int f1438a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f1439b = -1;

    /* renamed from: e  reason: collision with root package name */
    int f1442e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f1443f = 0;

    /* renamed from: g  reason: collision with root package name */
    int[] f1444g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    int f1445h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f1446i = 0;

    /* renamed from: j  reason: collision with root package name */
    float f1447j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    int f1448k = 0;

    /* renamed from: l  reason: collision with root package name */
    int f1449l = 0;

    /* renamed from: m  reason: collision with root package name */
    float f1450m = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    int f1453p = -1;

    /* renamed from: q  reason: collision with root package name */
    float f1454q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    h f1455r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f1456s = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: t  reason: collision with root package name */
    private float f1457t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    e f1458u = new e(this, e.d.LEFT);

    /* renamed from: v  reason: collision with root package name */
    e f1459v = new e(this, e.d.TOP);

    /* renamed from: w  reason: collision with root package name */
    e f1460w = new e(this, e.d.RIGHT);
    e x = new e(this, e.d.BOTTOM);
    e y = new e(this, e.d.BASELINE);
    e z = new e(this, e.d.CENTER_X);
    e A = new e(this, e.d.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1461a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1462b;

        static {
            int[] iArr = new int[b.values().length];
            f1462b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1462b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1462b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1462b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.d.values().length];
            f1461a = iArr2;
            try {
                iArr2[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1461a[e.d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1461a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1461a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1461a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1461a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1461a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1461a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1461a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public f() {
        e eVar = new e(this, e.d.CENTER);
        this.B = eVar;
        this.C = new e[]{this.f1458u, this.f1460w, this.f1459v, this.x, this.y, eVar};
        this.D = new ArrayList<>();
        b bVar = b.FIXED;
        this.E = new b[]{bVar, bVar};
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f2 = u0;
        this.Z = f2;
        this.a0 = f2;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = null;
        this.f0 = null;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = 0;
        this.m0 = 0;
        this.p0 = new float[]{-1.0f, -1.0f};
        this.q0 = new f[]{null, null};
        this.r0 = new f[]{null, null};
        this.s0 = null;
        this.t0 = null;
        a();
    }

    private boolean K(int i2) {
        int i3 = i2 * 2;
        e[] eVarArr = this.C;
        if (eVarArr[i3].f1413d != null && eVarArr[i3].f1413d.f1413d != eVarArr[i3]) {
            int i4 = i3 + 1;
            if (eVarArr[i4].f1413d != null && eVarArr[i4].f1413d.f1413d == eVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    private void a() {
        this.D.add(this.f1458u);
        this.D.add(this.f1459v);
        this.D.add(this.f1460w);
        this.D.add(this.x);
        this.D.add(this.z);
        this.D.add(this.A);
        this.D.add(this.B);
        this.D.add(this.y);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(e.e r26, boolean r27, e.i r28, e.i r29, f.f.b r30, boolean r31, f.e r32, f.e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.e(e.e, boolean, e.i, e.i, f.f$b, boolean, f.e, f.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int A() {
        return this.L + this.T;
    }

    public void A0(int i2) {
        this.Y = i2;
    }

    public b B() {
        return this.E[1];
    }

    public void B0(int i2) {
        this.X = i2;
    }

    public int C() {
        return this.d0;
    }

    public void C0(int i2) {
        this.K = i2;
    }

    public int D() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.G;
    }

    public void D0(int i2) {
        this.L = i2;
    }

    public int E() {
        return this.Y;
    }

    public void E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f1453p == -1) {
            if (z3 && !z4) {
                this.f1453p = 0;
            } else if (!z3 && z4) {
                this.f1453p = 1;
                if (this.J == -1) {
                    this.f1454q = 1.0f / this.f1454q;
                }
            }
        }
        if (this.f1453p == 0 && (!this.f1459v.k() || !this.x.k())) {
            this.f1453p = 1;
        } else if (this.f1453p == 1 && (!this.f1458u.k() || !this.f1460w.k())) {
            this.f1453p = 0;
        }
        if (this.f1453p == -1 && (!this.f1459v.k() || !this.x.k() || !this.f1458u.k() || !this.f1460w.k())) {
            if (this.f1459v.k() && this.x.k()) {
                this.f1453p = 0;
            } else if (this.f1458u.k() && this.f1460w.k()) {
                this.f1454q = 1.0f / this.f1454q;
                this.f1453p = 1;
            }
        }
        if (this.f1453p == -1) {
            if (z && !z2) {
                this.f1453p = 0;
            } else if (!z && z2) {
                this.f1454q = 1.0f / this.f1454q;
                this.f1453p = 1;
            }
        }
        if (this.f1453p == -1) {
            int i2 = this.f1445h;
            if (i2 > 0 && this.f1448k == 0) {
                this.f1453p = 0;
            } else if (i2 == 0 && this.f1448k > 0) {
                this.f1454q = 1.0f / this.f1454q;
                this.f1453p = 1;
            }
        }
        if (this.f1453p == -1 && z && z2) {
            this.f1454q = 1.0f / this.f1454q;
            this.f1453p = 1;
        }
    }

    public int F() {
        return this.X;
    }

    public void F0() {
        int i2 = this.K;
        int i3 = this.L;
        this.O = i2;
        this.P = i3;
        this.Q = (this.G + i2) - i2;
        this.R = (this.H + i3) - i3;
    }

    public int G() {
        return this.K;
    }

    public void G0(e.e eVar) {
        int y = eVar.y(this.f1458u);
        int y2 = eVar.y(this.f1459v);
        int y3 = eVar.y(this.f1460w);
        int y4 = eVar.y(this.x);
        int i2 = y4 - y2;
        if (y3 - y < 0 || i2 < 0 || y == Integer.MIN_VALUE || y == Integer.MAX_VALUE || y2 == Integer.MIN_VALUE || y2 == Integer.MAX_VALUE || y3 == Integer.MIN_VALUE || y3 == Integer.MAX_VALUE || y4 == Integer.MIN_VALUE || y4 == Integer.MAX_VALUE) {
            y4 = 0;
            y = 0;
            y2 = 0;
            y3 = 0;
        }
        a0(y, y2, y3, y4);
    }

    public int H() {
        return this.L;
    }

    public void H0() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.C[i2].f().q();
        }
    }

    public boolean I() {
        return this.U > 0;
    }

    public void J(e.d dVar, f fVar, e.d dVar2, int i2, int i3) {
        h(dVar).a(fVar.h(dVar2), i2, i3, e.c.STRONG, 0, true);
    }

    public boolean L() {
        return this.f1458u.f().f1496b == 1 && this.f1460w.f().f1496b == 1 && this.f1459v.f().f1496b == 1 && this.x.f().f1496b == 1;
    }

    public boolean M() {
        e eVar = this.f1458u;
        e eVar2 = eVar.f1413d;
        if (eVar2 == null || eVar2.f1413d != eVar) {
            e eVar3 = this.f1460w;
            e eVar4 = eVar3.f1413d;
            return eVar4 != null && eVar4.f1413d == eVar3;
        }
        return true;
    }

    public boolean N() {
        e eVar = this.f1459v;
        e eVar2 = eVar.f1413d;
        if (eVar2 == null || eVar2.f1413d != eVar) {
            e eVar3 = this.x;
            e eVar4 = eVar3.f1413d;
            return eVar4 != null && eVar4.f1413d == eVar3;
        }
        return true;
    }

    public boolean O() {
        return this.f1443f == 0 && this.I == 0.0f && this.f1448k == 0 && this.f1449l == 0 && this.E[1] == b.MATCH_CONSTRAINT;
    }

    public boolean P() {
        return this.f1442e == 0 && this.I == 0.0f && this.f1445h == 0 && this.f1446i == 0 && this.E[0] == b.MATCH_CONSTRAINT;
    }

    public void Q() {
        this.f1458u.m();
        this.f1459v.m();
        this.f1460w.m();
        this.x.m();
        this.y.m();
        this.z.m();
        this.A.m();
        this.B.m();
        this.F = null;
        this.f1457t = 0.0f;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f2 = u0;
        this.Z = f2;
        this.a0 = f2;
        b[] bVarArr = this.E;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.b0 = null;
        this.c0 = 0;
        this.d0 = 0;
        this.f0 = null;
        this.g0 = false;
        this.h0 = false;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = false;
        this.o0 = false;
        float[] fArr = this.p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1438a = -1;
        this.f1439b = -1;
        int[] iArr = this.f1456s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1442e = 0;
        this.f1443f = 0;
        this.f1447j = 1.0f;
        this.f1450m = 1.0f;
        this.f1446i = Integer.MAX_VALUE;
        this.f1449l = Integer.MAX_VALUE;
        this.f1445h = 0;
        this.f1448k = 0;
        this.f1453p = -1;
        this.f1454q = 1.0f;
        n nVar = this.f1440c;
        if (nVar != null) {
            nVar.e();
        }
        n nVar2 = this.f1441d;
        if (nVar2 != null) {
            nVar2.e();
        }
        this.f1455r = null;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
    }

    public void R() {
        f u2 = u();
        if (u2 != null && (u2 instanceof g) && ((g) u()).S0()) {
            return;
        }
        int size = this.D.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D.get(i2).m();
        }
    }

    public void S() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.C[i2].f().e();
        }
    }

    public void T(e.c cVar) {
        this.f1458u.n(cVar);
        this.f1459v.n(cVar);
        this.f1460w.n(cVar);
        this.x.n(cVar);
        this.y.n(cVar);
        this.B.n(cVar);
        this.z.n(cVar);
        this.A.n(cVar);
    }

    public void U() {
    }

    public void V(int i2) {
        this.U = i2;
    }

    public void W(Object obj) {
        this.b0 = obj;
    }

    public void X(String str) {
        this.e0 = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void Y(String str) {
        float f2;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.I = 0.0f;
            return;
        }
        int i3 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i4 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i3 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i3 = 1;
            }
            i4 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i4);
            if (substring2.length() > 0) {
                f2 = Float.parseFloat(substring2);
            }
            f2 = 0.0f;
        } else {
            String substring3 = str.substring(i4, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f2 = i3 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f2 = 0.0f;
        }
        i2 = (f2 > i2 ? 1 : (f2 == i2 ? 0 : -1));
        if (i2 > 0) {
            this.I = f2;
            this.J = i3;
        }
    }

    public void Z(int i2, int i3, int i4) {
        if (i4 == 0) {
            f0(i2, i3);
        } else if (i4 == 1) {
            t0(i2, i3);
        }
        this.j0 = true;
    }

    public void a0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.K = i2;
        this.L = i3;
        if (this.d0 == 8) {
            this.G = 0;
            this.H = 0;
            return;
        }
        b[] bVarArr = this.E;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.G)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.H)) {
            i9 = i6;
        }
        this.G = i8;
        this.H = i9;
        int i10 = this.W;
        if (i9 < i10) {
            this.H = i10;
        }
        int i11 = this.V;
        if (i8 < i11) {
            this.G = i11;
        }
        this.j0 = true;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(e.e r42) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.b(e.e):void");
    }

    public void b0(int i2) {
        this.H = i2;
        int i3 = this.W;
        if (i2 < i3) {
            this.H = i3;
        }
    }

    public boolean c() {
        return this.d0 != 8;
    }

    public void c0(boolean z) {
        this.f1452o = z;
    }

    public void d(int i2) {
        k.a(i2, this);
    }

    public void d0(float f2) {
        this.Z = f2;
    }

    public void e0(int i2) {
        this.l0 = i2;
    }

    public void f(f fVar, float f2, int i2) {
        e.d dVar = e.d.CENTER;
        J(dVar, fVar, dVar, i2, 0);
        this.f1457t = f2;
    }

    public void f0(int i2, int i3) {
        this.K = i2;
        int i4 = i3 - i2;
        this.G = i4;
        int i5 = this.V;
        if (i4 < i5) {
            this.G = i5;
        }
    }

    public void g(e.e eVar) {
        eVar.r(this.f1458u);
        eVar.r(this.f1459v);
        eVar.r(this.f1460w);
        eVar.r(this.x);
        if (this.U > 0) {
            eVar.r(this.y);
        }
    }

    public void g0(b bVar) {
        this.E[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            y0(this.X);
        }
    }

    public e h(e.d dVar) {
        switch (a.f1461a[dVar.ordinal()]) {
            case 1:
                return this.f1458u;
            case 2:
                return this.f1459v;
            case 3:
                return this.f1460w;
            case 4:
                return this.x;
            case 5:
                return this.y;
            case 6:
                return this.B;
            case 7:
                return this.z;
            case 8:
                return this.A;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public void h0(int i2, int i3, int i4, float f2) {
        this.f1442e = i2;
        this.f1445h = i3;
        this.f1446i = i4;
        this.f1447j = f2;
        if (f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f1442e = 2;
    }

    public ArrayList<e> i() {
        return this.D;
    }

    public void i0(float f2) {
        this.p0[0] = f2;
    }

    public int j() {
        return this.U;
    }

    public void j0(int i2) {
        this.f1456s[1] = i2;
    }

    public float k(int i2) {
        if (i2 == 0) {
            return this.Z;
        }
        if (i2 == 1) {
            return this.a0;
        }
        return -1.0f;
    }

    public void k0(int i2) {
        this.f1456s[0] = i2;
    }

    public int l() {
        return H() + this.H;
    }

    public void l0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.W = i2;
    }

    public Object m() {
        return this.b0;
    }

    public void m0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.V = i2;
    }

    public String n() {
        return this.e0;
    }

    public void n0(int i2, int i3) {
        this.S = i2;
        this.T = i3;
    }

    public b o(int i2) {
        if (i2 == 0) {
            return s();
        }
        if (i2 == 1) {
            return B();
        }
        return null;
    }

    public void o0(int i2, int i3) {
        this.K = i2;
        this.L = i3;
    }

    public int p() {
        return this.O + this.S;
    }

    public void p0(f fVar) {
        this.F = fVar;
    }

    public int q() {
        return this.P + this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(int i2, int i3) {
        if (i3 == 0) {
            this.M = i2;
        } else if (i3 == 1) {
            this.N = i2;
        }
    }

    public int r() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.H;
    }

    public void r0(float f2) {
        this.a0 = f2;
    }

    public b s() {
        return this.E[0];
    }

    public void s0(int i2) {
        this.m0 = i2;
    }

    public int t(int i2) {
        if (i2 == 0) {
            return D();
        }
        if (i2 == 1) {
            return r();
        }
        return 0;
    }

    public void t0(int i2, int i3) {
        this.L = i2;
        int i4 = i3 - i2;
        this.H = i4;
        int i5 = this.W;
        if (i4 < i5) {
            this.H = i5;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f0 != null) {
            str = "type: " + this.f0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.e0 != null) {
            str2 = "id: " + this.e0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.K);
        sb.append(", ");
        sb.append(this.L);
        sb.append(") - (");
        sb.append(this.G);
        sb.append(" x ");
        sb.append(this.H);
        sb.append(") wrap: (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public f u() {
        return this.F;
    }

    public void u0(b bVar) {
        this.E[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            b0(this.Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v(int i2) {
        if (i2 == 0) {
            return this.M;
        }
        if (i2 == 1) {
            return this.N;
        }
        return 0;
    }

    public void v0(int i2, int i3, int i4, float f2) {
        this.f1443f = i2;
        this.f1448k = i3;
        this.f1449l = i4;
        this.f1450m = f2;
        if (f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f1443f = 2;
    }

    public n w() {
        if (this.f1441d == null) {
            this.f1441d = new n();
        }
        return this.f1441d;
    }

    public void w0(float f2) {
        this.p0[1] = f2;
    }

    public n x() {
        if (this.f1440c == null) {
            this.f1440c = new n();
        }
        return this.f1440c;
    }

    public void x0(int i2) {
        this.d0 = i2;
    }

    public int y() {
        return G() + this.G;
    }

    public void y0(int i2) {
        this.G = i2;
        int i3 = this.V;
        if (i2 < i3) {
            this.G = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z() {
        return this.K + this.S;
    }

    public void z0(boolean z) {
        this.f1451n = z;
    }
}