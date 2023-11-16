package p006e;

import java.util.Arrays;

/* renamed from: e.i */
/* loaded from: classes.dex */
public class C0359i {

    /* renamed from: k */
    private static int f1802k = 1;

    /* renamed from: a */
    private String f1803a;

    /* renamed from: e */
    public float f1807e;

    /* renamed from: g */
    EnumC0360a f1809g;

    /* renamed from: b */
    public int f1804b = -1;

    /* renamed from: c */
    int f1805c = -1;

    /* renamed from: d */
    public int f1806d = 0;

    /* renamed from: f */
    float[] f1808f = new float[7];

    /* renamed from: h */
    C0351b[] f1810h = new C0351b[8];

    /* renamed from: i */
    int f1811i = 0;

    /* renamed from: j */
    public int f1812j = 0;

    /* renamed from: e.i$a */
    /* loaded from: classes.dex */
    public enum EnumC0360a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0359i(EnumC0360a enumC0360a, String str) {
        this.f1809g = enumC0360a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m925b() {
        f1802k++;
    }

    /* renamed from: a */
    public final void m926a(C0351b c0351b) {
        int i = 0;
        while (true) {
            int i2 = this.f1811i;
            if (i >= i2) {
                C0351b[] c0351bArr = this.f1810h;
                if (i2 >= c0351bArr.length) {
                    this.f1810h = (C0351b[]) Arrays.copyOf(c0351bArr, c0351bArr.length * 2);
                }
                C0351b[] c0351bArr2 = this.f1810h;
                int i3 = this.f1811i;
                c0351bArr2[i3] = c0351b;
                this.f1811i = i3 + 1;
                return;
            } else if (this.f1810h[i] == c0351b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public final void m924c(C0351b c0351b) {
        int i = this.f1811i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1810h[i2] == c0351b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0351b[] c0351bArr = this.f1810h;
                    int i4 = i2 + i3;
                    c0351bArr[i4] = c0351bArr[i4 + 1];
                }
                this.f1811i--;
                return;
            }
        }
    }

    /* renamed from: d */
    public void m923d() {
        this.f1803a = null;
        this.f1809g = EnumC0360a.UNKNOWN;
        this.f1806d = 0;
        this.f1804b = -1;
        this.f1805c = -1;
        this.f1807e = 0.0f;
        this.f1811i = 0;
        this.f1812j = 0;
    }

    /* renamed from: e */
    public void m922e(EnumC0360a enumC0360a, String str) {
        this.f1809g = enumC0360a;
    }

    /* renamed from: f */
    public final void m921f(C0351b c0351b) {
        int i = this.f1811i;
        for (int i2 = 0; i2 < i; i2++) {
            C0351b[] c0351bArr = this.f1810h;
            c0351bArr[i2].f1777d.m987n(c0351bArr[i2], c0351b, false);
        }
        this.f1811i = 0;
    }

    public String toString() {
        return "" + this.f1803a;
    }
}