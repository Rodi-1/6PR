package f;

import e.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    final f f1411b;

    /* renamed from: c  reason: collision with root package name */
    final d f1412c;

    /* renamed from: d  reason: collision with root package name */
    e f1413d;

    /* renamed from: j  reason: collision with root package name */
    e.i f1419j;

    /* renamed from: a  reason: collision with root package name */
    private m f1410a = new m(this);

    /* renamed from: e  reason: collision with root package name */
    public int f1414e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f1415f = -1;

    /* renamed from: g  reason: collision with root package name */
    private c f1416g = c.NONE;

    /* renamed from: h  reason: collision with root package name */
    private b f1417h = b.RELAXED;

    /* renamed from: i  reason: collision with root package name */
    private int f1418i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1420a;

        static {
            int[] iArr = new int[d.values().length];
            f1420a = iArr;
            try {
                iArr[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1420a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1420a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1420a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1420a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1420a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1420a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1420a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1420a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        RELAXED,
        STRICT
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* loaded from: classes.dex */
    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, d dVar) {
        this.f1411b = fVar;
        this.f1412c = dVar;
    }

    public boolean a(e eVar, int i2, int i3, c cVar, int i4, boolean z) {
        if (eVar == null) {
            this.f1413d = null;
            this.f1414e = 0;
            this.f1415f = -1;
            this.f1416g = c.NONE;
            this.f1418i = 2;
            return true;
        } else if (z || l(eVar)) {
            this.f1413d = eVar;
            if (i2 > 0) {
                this.f1414e = i2;
            } else {
                this.f1414e = 0;
            }
            this.f1415f = i3;
            this.f1416g = cVar;
            this.f1418i = i4;
            return true;
        } else {
            return false;
        }
    }

    public boolean b(e eVar, int i2, c cVar, int i3) {
        return a(eVar, i2, -1, cVar, i3, false);
    }

    public int c() {
        return this.f1418i;
    }

    public int d() {
        e eVar;
        if (this.f1411b.C() == 8) {
            return 0;
        }
        return (this.f1415f <= -1 || (eVar = this.f1413d) == null || eVar.f1411b.C() != 8) ? this.f1414e : this.f1415f;
    }

    public f e() {
        return this.f1411b;
    }

    public m f() {
        return this.f1410a;
    }

    public e.i g() {
        return this.f1419j;
    }

    public c h() {
        return this.f1416g;
    }

    public e i() {
        return this.f1413d;
    }

    public d j() {
        return this.f1412c;
    }

    public boolean k() {
        return this.f1413d != null;
    }

    public boolean l(e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        d j2 = eVar.j();
        d dVar = this.f1412c;
        if (j2 == dVar) {
            return dVar != d.BASELINE || (eVar.e().I() && e().I());
        }
        switch (a.f1420a[dVar.ordinal()]) {
            case 1:
                return (j2 == d.BASELINE || j2 == d.CENTER_X || j2 == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j2 == d.LEFT || j2 == d.RIGHT;
                if (eVar.e() instanceof i) {
                    return (z2 || j2 == d.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = j2 == d.TOP || j2 == d.BOTTOM;
                if (eVar.e() instanceof i) {
                    return (z3 || j2 == d.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f1412c.name());
        }
    }

    public void m() {
        this.f1413d = null;
        this.f1414e = 0;
        this.f1415f = -1;
        this.f1416g = c.STRONG;
        this.f1418i = 0;
        this.f1417h = b.RELAXED;
        this.f1410a.e();
    }

    public void n(e.c cVar) {
        e.i iVar = this.f1419j;
        if (iVar == null) {
            this.f1419j = new e.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f1411b.n() + ":" + this.f1412c.toString();
    }
}