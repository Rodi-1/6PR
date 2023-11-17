package f;

import java.util.Arrays;

/* loaded from: classes.dex */
public class j extends f {
    protected f[] v0 = new f[4];
    protected int w0 = 0;

    public void I0(f fVar) {
        int i2 = this.w0 + 1;
        f[] fVarArr = this.v0;
        if (i2 > fVarArr.length) {
            this.v0 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        f[] fVarArr2 = this.v0;
        int i3 = this.w0;
        fVarArr2[i3] = fVar;
        this.w0 = i3 + 1;
    }

    public void J0() {
        this.w0 = 0;
    }
}