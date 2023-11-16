package p007f;

import java.util.Arrays;

/* renamed from: f.j */
/* loaded from: classes.dex */
public class C0377j extends C0370f {

    /* renamed from: v0 */
    protected C0370f[] f1990v0 = new C0370f[4];

    /* renamed from: w0 */
    protected int f1991w0 = 0;

    /* renamed from: I0 */
    public void m774I0(C0370f c0370f) {
        int i = this.f1991w0 + 1;
        C0370f[] c0370fArr = this.f1990v0;
        if (i > c0370fArr.length) {
            this.f1990v0 = (C0370f[]) Arrays.copyOf(c0370fArr, c0370fArr.length * 2);
        }
        C0370f[] c0370fArr2 = this.f1990v0;
        int i2 = this.f1991w0;
        c0370fArr2[i2] = c0370f;
        this.f1991w0 = i2 + 1;
    }

    /* renamed from: J0 */
    public void m773J0() {
        this.f1991w0 = 0;
    }
}