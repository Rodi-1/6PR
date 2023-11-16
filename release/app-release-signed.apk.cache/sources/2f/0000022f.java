package p018q;

import android.view.animation.Interpolator;

/* renamed from: q.d  reason: invalid class name */
/* loaded from: classes.dex */
abstract class AbstractanimationInterpolatorC0524d implements Interpolator {

    /* renamed from: a */
    private final float[] f2248a;

    /* renamed from: b */
    private final float f2249b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC0524d(float[] fArr) {
        this.f2248a = fArr;
        this.f2249b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2248a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f2249b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f2248a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}