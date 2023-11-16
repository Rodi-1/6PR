package p007f;

import p006e.C0354e;
import p006e.C0359i;
import p007f.C0365e;

/* renamed from: f.m */
/* loaded from: classes.dex */
public class C0380m extends C0382o {

    /* renamed from: c */
    C0365e f1993c;

    /* renamed from: d */
    float f1994d;

    /* renamed from: e */
    C0380m f1995e;

    /* renamed from: f */
    float f1996f;

    /* renamed from: g */
    C0380m f1997g;

    /* renamed from: h */
    float f1998h;

    /* renamed from: j */
    private C0380m f2000j;

    /* renamed from: k */
    private float f2001k;

    /* renamed from: i */
    int f1999i = 0;

    /* renamed from: l */
    private C0381n f2002l = null;

    /* renamed from: m */
    private int f2003m = 1;

    /* renamed from: n */
    private C0381n f2004n = null;

    /* renamed from: o */
    private int f2005o = 1;

    public C0380m(C0365e c0365e) {
        this.f1993c = c0365e;
    }

    @Override // p007f.C0382o
    /* renamed from: e */
    public void mo750e() {
        super.mo750e();
        this.f1995e = null;
        this.f1996f = 0.0f;
        this.f2002l = null;
        this.f2003m = 1;
        this.f2004n = null;
        this.f2005o = 1;
        this.f1997g = null;
        this.f1998h = 0.0f;
        this.f1994d = 0.0f;
        this.f2000j = null;
        this.f2001k = 0.0f;
        this.f1999i = 0;
    }

    @Override // p007f.C0382o
    /* renamed from: f */
    public void mo749f() {
        int i;
        C0380m c0380m;
        C0380m c0380m2;
        C0380m c0380m3;
        C0380m c0380m4;
        C0380m c0380m5;
        C0380m c0380m6;
        C0365e c0365e;
        float m881D;
        float f;
        C0380m c0380m7;
        float f2;
        boolean z = true;
        if (this.f2008b == 1 || (i = this.f1999i) == 4) {
            return;
        }
        C0381n c0381n = this.f2002l;
        if (c0381n != null) {
            if (c0381n.f2008b != 1) {
                return;
            }
            this.f1996f = this.f2003m * c0381n.f2006c;
        }
        C0381n c0381n2 = this.f2004n;
        if (c0381n2 != null) {
            if (c0381n2.f2008b != 1) {
                return;
            }
            this.f2001k = this.f2005o * c0381n2.f2006c;
        }
        if (i == 1 && ((c0380m7 = this.f1995e) == null || c0380m7.f2008b == 1)) {
            if (c0380m7 == null) {
                this.f1997g = this;
                f2 = this.f1996f;
            } else {
                this.f1997g = c0380m7.f1997g;
                f2 = c0380m7.f1998h + this.f1996f;
            }
            this.f1998h = f2;
            m753b();
            return;
        }
        if (i == 2 && (c0380m4 = this.f1995e) != null && c0380m4.f2008b == 1 && (c0380m5 = this.f2000j) != null && (c0380m6 = c0380m5.f1995e) != null && c0380m6.f2008b == 1) {
            C0354e.m935x();
            C0380m c0380m8 = this.f1995e;
            this.f1997g = c0380m8.f1997g;
            C0380m c0380m9 = this.f2000j;
            C0380m c0380m10 = c0380m9.f1995e;
            c0380m9.f1997g = c0380m10.f1997g;
            C0365e.EnumC0369d enumC0369d = this.f1993c.f1841c;
            C0365e.EnumC0369d enumC0369d2 = C0365e.EnumC0369d.RIGHT;
            int i2 = 0;
            if (enumC0369d != enumC0369d2 && enumC0369d != C0365e.EnumC0369d.BOTTOM) {
                z = false;
            }
            float f3 = z ? c0380m8.f1998h - c0380m10.f1998h : c0380m10.f1998h - c0380m8.f1998h;
            if (enumC0369d == C0365e.EnumC0369d.LEFT || enumC0369d == enumC0369d2) {
                m881D = f3 - c0365e.f1840b.m881D();
                f = this.f1993c.f1840b.f1893Z;
            } else {
                m881D = f3 - c0365e.f1840b.m829r();
                f = this.f1993c.f1840b.f1895a0;
            }
            int m898d = this.f1993c.m898d();
            int m898d2 = this.f2000j.f1993c.m898d();
            if (this.f1993c.m893i() == this.f2000j.f1993c.m893i()) {
                f = 0.5f;
                m898d2 = 0;
            } else {
                i2 = m898d;
            }
            float f4 = i2;
            float f5 = m898d2;
            float f6 = (m881D - f4) - f5;
            if (z) {
                C0380m c0380m11 = this.f2000j;
                c0380m11.f1998h = c0380m11.f1995e.f1998h + f5 + (f6 * f);
                this.f1998h = (this.f1995e.f1998h - f4) - (f6 * (1.0f - f));
            } else {
                this.f1998h = this.f1995e.f1998h + f4 + (f6 * f);
                C0380m c0380m12 = this.f2000j;
                c0380m12.f1998h = (c0380m12.f1995e.f1998h - f5) - (f6 * (1.0f - f));
            }
        } else if (i != 3 || (c0380m = this.f1995e) == null || c0380m.f2008b != 1 || (c0380m2 = this.f2000j) == null || (c0380m3 = c0380m2.f1995e) == null || c0380m3.f2008b != 1) {
            if (i == 5) {
                this.f1993c.f1840b.mo863U();
                return;
            }
            return;
        } else {
            C0354e.m935x();
            C0380m c0380m13 = this.f1995e;
            this.f1997g = c0380m13.f1997g;
            C0380m c0380m14 = this.f2000j;
            C0380m c0380m15 = c0380m14.f1995e;
            c0380m14.f1997g = c0380m15.f1997g;
            this.f1998h = c0380m13.f1998h + this.f1996f;
            c0380m14.f1998h = c0380m15.f1998h + c0380m14.f1996f;
        }
        m753b();
        this.f2000j.m753b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m767g(C0354e c0354e) {
        C0359i m895g = this.f1993c.m895g();
        C0380m c0380m = this.f1997g;
        if (c0380m == null) {
            c0354e.m953f(m895g, (int) (this.f1998h + 0.5f));
        } else {
            c0354e.m954e(m895g, c0354e.m941r(c0380m.f1993c), (int) (this.f1998h + 0.5f), 6);
        }
    }

    /* renamed from: h */
    public void m766h(int i, C0380m c0380m, int i2) {
        this.f1999i = i;
        this.f1995e = c0380m;
        this.f1996f = i2;
        c0380m.m754a(this);
    }

    /* renamed from: i */
    public void m765i(C0380m c0380m, int i) {
        this.f1995e = c0380m;
        this.f1996f = i;
        c0380m.m754a(this);
    }

    /* renamed from: j */
    public void m764j(C0380m c0380m, int i, C0381n c0381n) {
        this.f1995e = c0380m;
        c0380m.m754a(this);
        this.f2002l = c0381n;
        this.f2003m = i;
        c0381n.m754a(this);
    }

    /* renamed from: k */
    public float m763k() {
        return this.f1998h;
    }

    /* renamed from: l */
    public void m762l(C0380m c0380m, float f) {
        int i = this.f2008b;
        if (i == 0 || !(this.f1997g == c0380m || this.f1998h == f)) {
            this.f1997g = c0380m;
            this.f1998h = f;
            if (i == 1) {
                m752c();
            }
            m753b();
        }
    }

    /* renamed from: m */
    String m761m(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: n */
    public void m760n(C0380m c0380m, float f) {
        this.f2000j = c0380m;
        this.f2001k = f;
    }

    /* renamed from: o */
    public void m759o(C0380m c0380m, int i, C0381n c0381n) {
        this.f2000j = c0380m;
        this.f2004n = c0381n;
        this.f2005o = i;
    }

    /* renamed from: p */
    public void m758p(int i) {
        this.f1999i = i;
    }

    /* renamed from: q */
    public void m757q() {
        C0365e m893i = this.f1993c.m893i();
        if (m893i == null) {
            return;
        }
        if (m893i.m893i() == this.f1993c) {
            this.f1999i = 4;
            m893i.m896f().f1999i = 4;
        }
        int m898d = this.f1993c.m898d();
        C0365e.EnumC0369d enumC0369d = this.f1993c.f1841c;
        if (enumC0369d == C0365e.EnumC0369d.RIGHT || enumC0369d == C0365e.EnumC0369d.BOTTOM) {
            m898d = -m898d;
        }
        m765i(m893i.m896f(), m898d);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f2008b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f1993c);
            str = " UNRESOLVED} type: ";
        } else if (this.f1997g == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f1993c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1998h);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f1993c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1997g);
            sb.append(":");
            sb.append(this.f1998h);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m761m(this.f1999i));
        return sb.toString();
    }
}