package q;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f1730a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1731b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f1730a = fArr;
        this.f1731b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1730a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1731b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.f1730a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}