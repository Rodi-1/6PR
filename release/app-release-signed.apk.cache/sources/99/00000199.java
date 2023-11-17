package f;

import f.e;
import f.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends f {
    protected float v0 = -1.0f;
    protected int w0 = -1;
    protected int x0 = -1;
    private e y0 = this.f1459v;
    private int z0 = 0;
    private boolean A0 = false;
    private int B0 = 0;
    private l C0 = new l();
    private int D0 = 8;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1479a;

        static {
            int[] iArr = new int[e.d.values().length];
            f1479a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1479a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1479a[e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1479a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1479a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1479a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1479a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1479a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1479a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public i() {
        this.D.clear();
        this.D.add(this.y0);
        int length = this.C.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.C[i2] = this.y0;
        }
    }

    @Override // f.f
    public void G0(e.e eVar) {
        if (u() == null) {
            return;
        }
        int y = eVar.y(this.y0);
        if (this.z0 == 1) {
            C0(y);
            D0(0);
            b0(u().r());
            y0(0);
            return;
        }
        C0(0);
        D0(y);
        y0(u().D());
        b0(0);
    }

    public int I0() {
        return this.z0;
    }

    public void J0(int i2) {
        if (i2 > -1) {
            this.v0 = -1.0f;
            this.w0 = i2;
            this.x0 = -1;
        }
    }

    public void K0(int i2) {
        if (i2 > -1) {
            this.v0 = -1.0f;
            this.w0 = -1;
            this.x0 = i2;
        }
    }

    public void L0(float f2) {
        if (f2 > -1.0f) {
            this.v0 = f2;
            this.w0 = -1;
            this.x0 = -1;
        }
    }

    public void M0(int i2) {
        if (this.z0 == i2) {
            return;
        }
        this.z0 = i2;
        this.D.clear();
        this.y0 = this.z0 == 1 ? this.f1458u : this.f1459v;
        this.D.add(this.y0);
        int length = this.C.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.C[i3] = this.y0;
        }
    }

    @Override // f.f
    public void b(e.e eVar) {
        g gVar = (g) u();
        if (gVar == null) {
            return;
        }
        e h2 = gVar.h(e.d.LEFT);
        e h3 = gVar.h(e.d.RIGHT);
        f fVar = this.F;
        boolean z = true;
        boolean z2 = fVar != null && fVar.E[0] == f.b.WRAP_CONTENT;
        if (this.z0 == 0) {
            h2 = gVar.h(e.d.TOP);
            h3 = gVar.h(e.d.BOTTOM);
            f fVar2 = this.F;
            z2 = (fVar2 == null || fVar2.E[1] != f.b.WRAP_CONTENT) ? false : false;
        }
        if (this.w0 != -1) {
            e.i r2 = eVar.r(this.y0);
            eVar.e(r2, eVar.r(h2), this.w0, 6);
            if (z2) {
                eVar.i(eVar.r(h3), r2, 0, 5);
            }
        } else if (this.x0 == -1) {
            if (this.v0 != -1.0f) {
                eVar.d(e.e.t(eVar, eVar.r(this.y0), eVar.r(h2), eVar.r(h3), this.v0, this.A0));
            }
        } else {
            e.i r3 = eVar.r(this.y0);
            e.i r4 = eVar.r(h3);
            eVar.e(r3, r4, -this.x0, 6);
            if (z2) {
                eVar.i(r3, eVar.r(h2), 0, 5);
                eVar.i(r4, r3, 0, 5);
            }
        }
    }

    @Override // f.f
    public boolean c() {
        return true;
    }

    @Override // f.f
    public void d(int i2) {
        int i3;
        m f2;
        e eVar;
        m f3;
        e eVar2;
        e eVar3;
        m f4;
        int i4;
        f u2 = u();
        if (u2 == null) {
            return;
        }
        if (I0() == 1) {
            this.f1459v.f().h(1, u2.f1459v.f(), 0);
            this.x.f().h(1, u2.f1459v.f(), 0);
            if (this.w0 != -1) {
                this.f1458u.f().h(1, u2.f1458u.f(), this.w0);
                f3 = this.f1460w.f();
                eVar3 = u2.f1458u;
                f4 = eVar3.f();
                i4 = this.w0;
            } else if (this.x0 == -1) {
                if (this.v0 == -1.0f || u2.s() != f.b.FIXED) {
                    return;
                }
                i3 = (int) (u2.G * this.v0);
                this.f1458u.f().h(1, u2.f1458u.f(), i3);
                f2 = this.f1460w.f();
                eVar = u2.f1458u;
                f2.h(1, eVar.f(), i3);
                return;
            } else {
                this.f1458u.f().h(1, u2.f1460w.f(), -this.x0);
                f3 = this.f1460w.f();
                eVar2 = u2.f1460w;
                f4 = eVar2.f();
                i4 = -this.x0;
            }
        } else {
            this.f1458u.f().h(1, u2.f1458u.f(), 0);
            this.f1460w.f().h(1, u2.f1458u.f(), 0);
            if (this.w0 != -1) {
                this.f1459v.f().h(1, u2.f1459v.f(), this.w0);
                f3 = this.x.f();
                eVar3 = u2.f1459v;
                f4 = eVar3.f();
                i4 = this.w0;
            } else if (this.x0 == -1) {
                if (this.v0 == -1.0f || u2.B() != f.b.FIXED) {
                    return;
                }
                i3 = (int) (u2.H * this.v0);
                this.f1459v.f().h(1, u2.f1459v.f(), i3);
                f2 = this.x.f();
                eVar = u2.f1459v;
                f2.h(1, eVar.f(), i3);
                return;
            } else {
                this.f1459v.f().h(1, u2.x.f(), -this.x0);
                f3 = this.x.f();
                eVar2 = u2.x;
                f4 = eVar2.f();
                i4 = -this.x0;
            }
        }
        f3.h(1, f4, i4);
    }

    @Override // f.f
    public e h(e.d dVar) {
        switch (a.f1479a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.z0 == 1) {
                    return this.y0;
                }
                break;
            case 3:
            case 4:
                if (this.z0 == 0) {
                    return this.y0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // f.f
    public ArrayList<e> i() {
        return this.D;
    }
}