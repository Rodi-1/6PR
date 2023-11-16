package p007f;

import p006e.C0352c;
import p006e.C0359i;

/* renamed from: f.e */
/* loaded from: classes.dex */
public class C0365e {

    /* renamed from: b */
    final C0370f f1840b;

    /* renamed from: c */
    final EnumC0369d f1841c;

    /* renamed from: d */
    C0365e f1842d;

    /* renamed from: j */
    C0359i f1848j;

    /* renamed from: a */
    private C0380m f1839a = new C0380m(this);

    /* renamed from: e */
    public int f1843e = 0;

    /* renamed from: f */
    int f1844f = -1;

    /* renamed from: g */
    private EnumC0368c f1845g = EnumC0368c.NONE;

    /* renamed from: h */
    private EnumC0367b f1846h = EnumC0367b.RELAXED;

    /* renamed from: i */
    private int f1847i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0366a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1849a;

        static {
            int[] iArr = new int[EnumC0369d.values().length];
            f1849a = iArr;
            try {
                iArr[EnumC0369d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1849a[EnumC0369d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1849a[EnumC0369d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1849a[EnumC0369d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1849a[EnumC0369d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1849a[EnumC0369d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1849a[EnumC0369d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1849a[EnumC0369d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1849a[EnumC0369d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: f.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0367b {
        RELAXED,
        STRICT
    }

    /* renamed from: f.e$c */
    /* loaded from: classes.dex */
    public enum EnumC0368c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: f.e$d */
    /* loaded from: classes.dex */
    public enum EnumC0369d {
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

    public C0365e(C0370f c0370f, EnumC0369d enumC0369d) {
        this.f1840b = c0370f;
        this.f1841c = enumC0369d;
    }

    /* renamed from: a */
    public boolean m901a(C0365e c0365e, int i, int i2, EnumC0368c enumC0368c, int i3, boolean z) {
        if (c0365e == null) {
            this.f1842d = null;
            this.f1843e = 0;
            this.f1844f = -1;
            this.f1845g = EnumC0368c.NONE;
            this.f1847i = 2;
            return true;
        } else if (z || m890l(c0365e)) {
            this.f1842d = c0365e;
            if (i > 0) {
                this.f1843e = i;
            } else {
                this.f1843e = 0;
            }
            this.f1844f = i2;
            this.f1845g = enumC0368c;
            this.f1847i = i3;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m900b(C0365e c0365e, int i, EnumC0368c enumC0368c, int i2) {
        return m901a(c0365e, i, -1, enumC0368c, i2, false);
    }

    /* renamed from: c */
    public int m899c() {
        return this.f1847i;
    }

    /* renamed from: d */
    public int m898d() {
        C0365e c0365e;
        if (this.f1840b.m883C() == 8) {
            return 0;
        }
        return (this.f1844f <= -1 || (c0365e = this.f1842d) == null || c0365e.f1840b.m883C() != 8) ? this.f1843e : this.f1844f;
    }

    /* renamed from: e */
    public C0370f m897e() {
        return this.f1840b;
    }

    /* renamed from: f */
    public C0380m m896f() {
        return this.f1839a;
    }

    /* renamed from: g */
    public C0359i m895g() {
        return this.f1848j;
    }

    /* renamed from: h */
    public EnumC0368c m894h() {
        return this.f1845g;
    }

    /* renamed from: i */
    public C0365e m893i() {
        return this.f1842d;
    }

    /* renamed from: j */
    public EnumC0369d m892j() {
        return this.f1841c;
    }

    /* renamed from: k */
    public boolean m891k() {
        return this.f1842d != null;
    }

    /* renamed from: l */
    public boolean m890l(C0365e c0365e) {
        boolean z = false;
        if (c0365e == null) {
            return false;
        }
        EnumC0369d m892j = c0365e.m892j();
        EnumC0369d enumC0369d = this.f1841c;
        if (m892j == enumC0369d) {
            return enumC0369d != EnumC0369d.BASELINE || (c0365e.m897e().m873I() && m897e().m873I());
        }
        switch (C0366a.f1849a[enumC0369d.ordinal()]) {
            case 1:
                return (m892j == EnumC0369d.BASELINE || m892j == EnumC0369d.CENTER_X || m892j == EnumC0369d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = m892j == EnumC0369d.LEFT || m892j == EnumC0369d.RIGHT;
                if (c0365e.m897e() instanceof C0375i) {
                    return (z2 || m892j == EnumC0369d.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = m892j == EnumC0369d.TOP || m892j == EnumC0369d.BOTTOM;
                if (c0365e.m897e() instanceof C0375i) {
                    return (z3 || m892j == EnumC0369d.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f1841c.name());
        }
    }

    /* renamed from: m */
    public void m889m() {
        this.f1842d = null;
        this.f1843e = 0;
        this.f1844f = -1;
        this.f1845g = EnumC0368c.STRONG;
        this.f1847i = 0;
        this.f1846h = EnumC0367b.RELAXED;
        this.f1839a.mo750e();
    }

    /* renamed from: n */
    public void m888n(C0352c c0352c) {
        C0359i c0359i = this.f1848j;
        if (c0359i == null) {
            this.f1848j = new C0359i(C0359i.EnumC0360a.UNRESTRICTED, null);
        } else {
            c0359i.m923d();
        }
    }

    public String toString() {
        return this.f1840b.m836n() + ":" + this.f1841c.toString();
    }
}