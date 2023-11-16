package p007f;

import java.util.ArrayList;
import p007f.C0370f;

/* renamed from: f.d */
/* loaded from: classes.dex */
public class C0364d {

    /* renamed from: a */
    protected C0370f f1822a;

    /* renamed from: b */
    protected C0370f f1823b;

    /* renamed from: c */
    protected C0370f f1824c;

    /* renamed from: d */
    protected C0370f f1825d;

    /* renamed from: e */
    protected C0370f f1826e;

    /* renamed from: f */
    protected C0370f f1827f;

    /* renamed from: g */
    protected C0370f f1828g;

    /* renamed from: h */
    protected ArrayList<C0370f> f1829h;

    /* renamed from: i */
    protected int f1830i;

    /* renamed from: j */
    protected int f1831j;

    /* renamed from: k */
    protected float f1832k = 0.0f;

    /* renamed from: l */
    private int f1833l;

    /* renamed from: m */
    private boolean f1834m;

    /* renamed from: n */
    protected boolean f1835n;

    /* renamed from: o */
    protected boolean f1836o;

    /* renamed from: p */
    protected boolean f1837p;

    /* renamed from: q */
    private boolean f1838q;

    public C0364d(C0370f c0370f, int i, boolean z) {
        this.f1822a = c0370f;
        this.f1833l = i;
        this.f1834m = z;
    }

    /* renamed from: b */
    private void m903b() {
        int i = this.f1833l * 2;
        C0370f c0370f = this.f1822a;
        boolean z = false;
        C0370f c0370f2 = c0370f;
        boolean z2 = false;
        while (!z2) {
            this.f1830i++;
            C0370f[] c0370fArr = c0370f.f1929r0;
            int i2 = this.f1833l;
            C0370f c0370f3 = null;
            c0370fArr[i2] = null;
            c0370f.f1927q0[i2] = null;
            if (c0370f.m883C() != 8) {
                if (this.f1823b == null) {
                    this.f1823b = c0370f;
                }
                this.f1825d = c0370f;
                C0370f.EnumC0372b[] enumC0372bArr = c0370f.f1872E;
                int i3 = this.f1833l;
                if (enumC0372bArr[i3] == C0370f.EnumC0372b.MATCH_CONSTRAINT) {
                    int[] iArr = c0370f.f1906g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f1831j++;
                        float[] fArr = c0370f.f1925p0;
                        float f = fArr[i3];
                        if (f > 0.0f) {
                            this.f1832k += fArr[i3];
                        }
                        if (m902c(c0370f, i3)) {
                            if (f < 0.0f) {
                                this.f1835n = true;
                            } else {
                                this.f1836o = true;
                            }
                            if (this.f1829h == null) {
                                this.f1829h = new ArrayList<>();
                            }
                            this.f1829h.add(c0370f);
                        }
                        if (this.f1827f == null) {
                            this.f1827f = c0370f;
                        }
                        C0370f c0370f4 = this.f1828g;
                        if (c0370f4 != null) {
                            c0370f4.f1927q0[this.f1833l] = c0370f;
                        }
                        this.f1828g = c0370f;
                    }
                }
            }
            if (c0370f2 != c0370f) {
                c0370f2.f1929r0[this.f1833l] = c0370f;
            }
            C0365e c0365e = c0370f.f1870C[i + 1].f1842d;
            if (c0365e != null) {
                C0370f c0370f5 = c0365e.f1840b;
                C0365e[] c0365eArr = c0370f5.f1870C;
                if (c0365eArr[i].f1842d != null && c0365eArr[i].f1842d.f1840b == c0370f) {
                    c0370f3 = c0370f5;
                }
            }
            if (c0370f3 == null) {
                c0370f3 = c0370f;
                z2 = true;
            }
            c0370f2 = c0370f;
            c0370f = c0370f3;
        }
        this.f1824c = c0370f;
        if (this.f1833l == 0 && this.f1834m) {
            this.f1826e = c0370f;
        } else {
            this.f1826e = this.f1822a;
        }
        if (this.f1836o && this.f1835n) {
            z = true;
        }
        this.f1837p = z;
    }

    /* renamed from: c */
    private static boolean m902c(C0370f c0370f, int i) {
        if (c0370f.m883C() != 8 && c0370f.f1872E[i] == C0370f.EnumC0372b.MATCH_CONSTRAINT) {
            int[] iArr = c0370f.f1906g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m904a() {
        if (!this.f1838q) {
            m903b();
        }
        this.f1838q = true;
    }
}