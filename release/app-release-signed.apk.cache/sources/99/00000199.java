package p007f;

import java.util.ArrayList;
import p006e.C0354e;
import p006e.C0359i;
import p007f.C0365e;
import p007f.C0370f;

/* renamed from: f.i */
/* loaded from: classes.dex */
public class C0375i extends C0370f {

    /* renamed from: v0 */
    protected float f1984v0 = -1.0f;

    /* renamed from: w0 */
    protected int f1985w0 = -1;

    /* renamed from: x0 */
    protected int f1986x0 = -1;

    /* renamed from: y0 */
    private C0365e f1987y0 = this.f1935v;

    /* renamed from: z0 */
    private int f1988z0 = 0;

    /* renamed from: A0 */
    private boolean f1980A0 = false;

    /* renamed from: B0 */
    private int f1981B0 = 0;

    /* renamed from: C0 */
    private C0379l f1982C0 = new C0379l();

    /* renamed from: D0 */
    private int f1983D0 = 8;

    /* renamed from: f.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0376a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1989a;

        static {
            int[] iArr = new int[C0365e.EnumC0369d.values().length];
            f1989a = iArr;
            try {
                iArr[C0365e.EnumC0369d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1989a[C0365e.EnumC0369d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1989a[C0365e.EnumC0369d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1989a[C0365e.EnumC0369d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1989a[C0365e.EnumC0369d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1989a[C0365e.EnumC0369d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1989a[C0365e.EnumC0369d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1989a[C0365e.EnumC0369d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1989a[C0365e.EnumC0369d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0375i() {
        this.f1871D.clear();
        this.f1871D.add(this.f1987y0);
        int length = this.f1870C.length;
        for (int i = 0; i < length; i++) {
            this.f1870C[i] = this.f1987y0;
        }
    }

    @Override // p007f.C0370f
    /* renamed from: G0 */
    public void mo785G0(C0354e c0354e) {
        if (m823u() == null) {
            return;
        }
        int m934y = c0354e.m934y(this.f1987y0);
        if (this.f1988z0 == 1) {
            m882C0(m934y);
            m880D0(0);
            m855b0(m823u().m829r());
            m814y0(0);
            return;
        }
        m882C0(0);
        m880D0(m934y);
        m814y0(m823u().m881D());
        m855b0(0);
    }

    /* renamed from: I0 */
    public int m784I0() {
        return this.f1988z0;
    }

    /* renamed from: J0 */
    public void m783J0(int i) {
        if (i > -1) {
            this.f1984v0 = -1.0f;
            this.f1985w0 = i;
            this.f1986x0 = -1;
        }
    }

    /* renamed from: K0 */
    public void m782K0(int i) {
        if (i > -1) {
            this.f1984v0 = -1.0f;
            this.f1985w0 = -1;
            this.f1986x0 = i;
        }
    }

    /* renamed from: L0 */
    public void m781L0(float f) {
        if (f > -1.0f) {
            this.f1984v0 = f;
            this.f1985w0 = -1;
            this.f1986x0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m780M0(int i) {
        if (this.f1988z0 == i) {
            return;
        }
        this.f1988z0 = i;
        this.f1871D.clear();
        this.f1987y0 = this.f1988z0 == 1 ? this.f1934u : this.f1935v;
        this.f1871D.add(this.f1987y0);
        int length = this.f1870C.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f1870C[i2] = this.f1987y0;
        }
    }

    @Override // p007f.C0370f
    /* renamed from: b */
    public void mo779b(C0354e c0354e) {
        C0373g c0373g = (C0373g) m823u();
        if (c0373g == null) {
            return;
        }
        C0365e mo776h = c0373g.mo776h(C0365e.EnumC0369d.LEFT);
        C0365e mo776h2 = c0373g.mo776h(C0365e.EnumC0369d.RIGHT);
        C0370f c0370f = this.f1873F;
        boolean z = true;
        boolean z2 = c0370f != null && c0370f.f1872E[0] == C0370f.EnumC0372b.WRAP_CONTENT;
        if (this.f1988z0 == 0) {
            mo776h = c0373g.mo776h(C0365e.EnumC0369d.TOP);
            mo776h2 = c0373g.mo776h(C0365e.EnumC0369d.BOTTOM);
            C0370f c0370f2 = this.f1873F;
            z2 = (c0370f2 == null || c0370f2.f1872E[1] != C0370f.EnumC0372b.WRAP_CONTENT) ? false : false;
        }
        if (this.f1985w0 != -1) {
            C0359i m941r = c0354e.m941r(this.f1987y0);
            c0354e.m954e(m941r, c0354e.m941r(mo776h), this.f1985w0, 6);
            if (z2) {
                c0354e.m950i(c0354e.m941r(mo776h2), m941r, 0, 5);
            }
        } else if (this.f1986x0 == -1) {
            if (this.f1984v0 != -1.0f) {
                c0354e.m955d(C0354e.m939t(c0354e, c0354e.m941r(this.f1987y0), c0354e.m941r(mo776h), c0354e.m941r(mo776h2), this.f1984v0, this.f1980A0));
            }
        } else {
            C0359i m941r2 = c0354e.m941r(this.f1987y0);
            C0359i m941r3 = c0354e.m941r(mo776h2);
            c0354e.m954e(m941r2, m941r3, -this.f1986x0, 6);
            if (z2) {
                c0354e.m950i(m941r2, c0354e.m941r(mo776h), 0, 5);
                c0354e.m950i(m941r3, m941r2, 0, 5);
            }
        }
    }

    @Override // p007f.C0370f
    /* renamed from: c */
    public boolean mo778c() {
        return true;
    }

    @Override // p007f.C0370f
    /* renamed from: d */
    public void mo777d(int i) {
        int i2;
        C0380m m896f;
        C0365e c0365e;
        C0380m m896f2;
        C0365e c0365e2;
        C0365e c0365e3;
        C0380m m896f3;
        int i3;
        C0370f m823u = m823u();
        if (m823u == null) {
            return;
        }
        if (m784I0() == 1) {
            this.f1935v.m896f().m766h(1, m823u.f1935v.m896f(), 0);
            this.f1937x.m896f().m766h(1, m823u.f1935v.m896f(), 0);
            if (this.f1985w0 != -1) {
                this.f1934u.m896f().m766h(1, m823u.f1934u.m896f(), this.f1985w0);
                m896f2 = this.f1936w.m896f();
                c0365e3 = m823u.f1934u;
                m896f3 = c0365e3.m896f();
                i3 = this.f1985w0;
            } else if (this.f1986x0 == -1) {
                if (this.f1984v0 == -1.0f || m823u.m827s() != C0370f.EnumC0372b.FIXED) {
                    return;
                }
                i2 = (int) (m823u.f1874G * this.f1984v0);
                this.f1934u.m896f().m766h(1, m823u.f1934u.m896f(), i2);
                m896f = this.f1936w.m896f();
                c0365e = m823u.f1934u;
                m896f.m766h(1, c0365e.m896f(), i2);
                return;
            } else {
                this.f1934u.m896f().m766h(1, m823u.f1936w.m896f(), -this.f1986x0);
                m896f2 = this.f1936w.m896f();
                c0365e2 = m823u.f1936w;
                m896f3 = c0365e2.m896f();
                i3 = -this.f1986x0;
            }
        } else {
            this.f1934u.m896f().m766h(1, m823u.f1934u.m896f(), 0);
            this.f1936w.m896f().m766h(1, m823u.f1934u.m896f(), 0);
            if (this.f1985w0 != -1) {
                this.f1935v.m896f().m766h(1, m823u.f1935v.m896f(), this.f1985w0);
                m896f2 = this.f1937x.m896f();
                c0365e3 = m823u.f1935v;
                m896f3 = c0365e3.m896f();
                i3 = this.f1985w0;
            } else if (this.f1986x0 == -1) {
                if (this.f1984v0 == -1.0f || m823u.m885B() != C0370f.EnumC0372b.FIXED) {
                    return;
                }
                i2 = (int) (m823u.f1875H * this.f1984v0);
                this.f1935v.m896f().m766h(1, m823u.f1935v.m896f(), i2);
                m896f = this.f1937x.m896f();
                c0365e = m823u.f1935v;
                m896f.m766h(1, c0365e.m896f(), i2);
                return;
            } else {
                this.f1935v.m896f().m766h(1, m823u.f1937x.m896f(), -this.f1986x0);
                m896f2 = this.f1937x.m896f();
                c0365e2 = m823u.f1937x;
                m896f3 = c0365e2.m896f();
                i3 = -this.f1986x0;
            }
        }
        m896f2.m766h(1, m896f3, i3);
    }

    @Override // p007f.C0370f
    /* renamed from: h */
    public C0365e mo776h(C0365e.EnumC0369d enumC0369d) {
        switch (C0376a.f1989a[enumC0369d.ordinal()]) {
            case 1:
            case 2:
                if (this.f1988z0 == 1) {
                    return this.f1987y0;
                }
                break;
            case 3:
            case 4:
                if (this.f1988z0 == 0) {
                    return this.f1987y0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0369d.name());
    }

    @Override // p007f.C0370f
    /* renamed from: i */
    public ArrayList<C0365e> mo775i() {
        return this.f1871D;
    }
}