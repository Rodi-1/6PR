package f;

import f.e;

/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: c  reason: collision with root package name */
    e f1481c;

    /* renamed from: d  reason: collision with root package name */
    float f1482d;

    /* renamed from: e  reason: collision with root package name */
    m f1483e;

    /* renamed from: f  reason: collision with root package name */
    float f1484f;

    /* renamed from: g  reason: collision with root package name */
    m f1485g;

    /* renamed from: h  reason: collision with root package name */
    float f1486h;

    /* renamed from: j  reason: collision with root package name */
    private m f1488j;

    /* renamed from: k  reason: collision with root package name */
    private float f1489k;

    /* renamed from: i  reason: collision with root package name */
    int f1487i = 0;

    /* renamed from: l  reason: collision with root package name */
    private n f1490l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f1491m = 1;

    /* renamed from: n  reason: collision with root package name */
    private n f1492n = null;

    /* renamed from: o  reason: collision with root package name */
    private int f1493o = 1;

    public m(e eVar) {
        this.f1481c = eVar;
    }

    @Override // f.o
    public void e() {
        super.e();
        this.f1483e = null;
        this.f1484f = 0.0f;
        this.f1490l = null;
        this.f1491m = 1;
        this.f1492n = null;
        this.f1493o = 1;
        this.f1485g = null;
        this.f1486h = 0.0f;
        this.f1482d = 0.0f;
        this.f1488j = null;
        this.f1489k = 0.0f;
        this.f1487i = 0;
    }

    @Override // f.o
    public void f() {
        int i2;
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        m mVar6;
        e eVar;
        float D;
        float f2;
        m mVar7;
        float f3;
        boolean z = true;
        if (this.f1496b == 1 || (i2 = this.f1487i) == 4) {
            return;
        }
        n nVar = this.f1490l;
        if (nVar != null) {
            if (nVar.f1496b != 1) {
                return;
            }
            this.f1484f = this.f1491m * nVar.f1494c;
        }
        n nVar2 = this.f1492n;
        if (nVar2 != null) {
            if (nVar2.f1496b != 1) {
                return;
            }
            this.f1489k = this.f1493o * nVar2.f1494c;
        }
        if (i2 == 1 && ((mVar7 = this.f1483e) == null || mVar7.f1496b == 1)) {
            if (mVar7 == null) {
                this.f1485g = this;
                f3 = this.f1484f;
            } else {
                this.f1485g = mVar7.f1485g;
                f3 = mVar7.f1486h + this.f1484f;
            }
            this.f1486h = f3;
            b();
            return;
        }
        if (i2 == 2 && (mVar4 = this.f1483e) != null && mVar4.f1496b == 1 && (mVar5 = this.f1488j) != null && (mVar6 = mVar5.f1483e) != null && mVar6.f1496b == 1) {
            e.e.x();
            m mVar8 = this.f1483e;
            this.f1485g = mVar8.f1485g;
            m mVar9 = this.f1488j;
            m mVar10 = mVar9.f1483e;
            mVar9.f1485g = mVar10.f1485g;
            e.d dVar = this.f1481c.f1412c;
            e.d dVar2 = e.d.RIGHT;
            int i3 = 0;
            if (dVar != dVar2 && dVar != e.d.BOTTOM) {
                z = false;
            }
            float f4 = z ? mVar8.f1486h - mVar10.f1486h : mVar10.f1486h - mVar8.f1486h;
            if (dVar == e.d.LEFT || dVar == dVar2) {
                D = f4 - eVar.f1411b.D();
                f2 = this.f1481c.f1411b.Z;
            } else {
                D = f4 - eVar.f1411b.r();
                f2 = this.f1481c.f1411b.a0;
            }
            int d2 = this.f1481c.d();
            int d3 = this.f1488j.f1481c.d();
            if (this.f1481c.i() == this.f1488j.f1481c.i()) {
                f2 = 0.5f;
                d3 = 0;
            } else {
                i3 = d2;
            }
            float f5 = i3;
            float f6 = d3;
            float f7 = (D - f5) - f6;
            if (z) {
                m mVar11 = this.f1488j;
                mVar11.f1486h = mVar11.f1483e.f1486h + f6 + (f7 * f2);
                this.f1486h = (this.f1483e.f1486h - f5) - (f7 * (1.0f - f2));
            } else {
                this.f1486h = this.f1483e.f1486h + f5 + (f7 * f2);
                m mVar12 = this.f1488j;
                mVar12.f1486h = (mVar12.f1483e.f1486h - f6) - (f7 * (1.0f - f2));
            }
        } else if (i2 != 3 || (mVar = this.f1483e) == null || mVar.f1496b != 1 || (mVar2 = this.f1488j) == null || (mVar3 = mVar2.f1483e) == null || mVar3.f1496b != 1) {
            if (i2 == 5) {
                this.f1481c.f1411b.U();
                return;
            }
            return;
        } else {
            e.e.x();
            m mVar13 = this.f1483e;
            this.f1485g = mVar13.f1485g;
            m mVar14 = this.f1488j;
            m mVar15 = mVar14.f1483e;
            mVar14.f1485g = mVar15.f1485g;
            this.f1486h = mVar13.f1486h + this.f1484f;
            mVar14.f1486h = mVar15.f1486h + mVar14.f1484f;
        }
        b();
        this.f1488j.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(e.e eVar) {
        e.i g2 = this.f1481c.g();
        m mVar = this.f1485g;
        if (mVar == null) {
            eVar.f(g2, (int) (this.f1486h + 0.5f));
        } else {
            eVar.e(g2, eVar.r(mVar.f1481c), (int) (this.f1486h + 0.5f), 6);
        }
    }

    public void h(int i2, m mVar, int i3) {
        this.f1487i = i2;
        this.f1483e = mVar;
        this.f1484f = i3;
        mVar.a(this);
    }

    public void i(m mVar, int i2) {
        this.f1483e = mVar;
        this.f1484f = i2;
        mVar.a(this);
    }

    public void j(m mVar, int i2, n nVar) {
        this.f1483e = mVar;
        mVar.a(this);
        this.f1490l = nVar;
        this.f1491m = i2;
        nVar.a(this);
    }

    public float k() {
        return this.f1486h;
    }

    public void l(m mVar, float f2) {
        int i2 = this.f1496b;
        if (i2 == 0 || !(this.f1485g == mVar || this.f1486h == f2)) {
            this.f1485g = mVar;
            this.f1486h = f2;
            if (i2 == 1) {
                c();
            }
            b();
        }
    }

    String m(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void n(m mVar, float f2) {
        this.f1488j = mVar;
        this.f1489k = f2;
    }

    public void o(m mVar, int i2, n nVar) {
        this.f1488j = mVar;
        this.f1492n = nVar;
        this.f1493o = i2;
    }

    public void p(int i2) {
        this.f1487i = i2;
    }

    public void q() {
        e i2 = this.f1481c.i();
        if (i2 == null) {
            return;
        }
        if (i2.i() == this.f1481c) {
            this.f1487i = 4;
            i2.f().f1487i = 4;
        }
        int d2 = this.f1481c.d();
        e.d dVar = this.f1481c.f1412c;
        if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
            d2 = -d2;
        }
        i(i2.f(), d2);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f1496b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f1481c);
            str = " UNRESOLVED} type: ";
        } else if (this.f1485g == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f1481c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1486h);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f1481c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1485g);
            sb.append(":");
            sb.append(this.f1486h);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m(this.f1487i));
        return sb.toString();
    }
}