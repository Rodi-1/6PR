package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class f implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f155a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f156b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray h2 = h.c.h(resources, theme, attributeSet, a.f139l);
        d(h2, xmlPullParser);
        h2.recycle();
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f155a = new float[min];
        this.f156b = new float[min];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < min; i3++) {
            pathMeasure.getPosTan((i3 * length) / (min - 1), fArr, null);
            this.f155a[i3] = fArr[0];
            this.f156b[i3] = fArr[1];
        }
        if (Math.abs(this.f155a[0]) <= 1.0E-5d && Math.abs(this.f156b[0]) <= 1.0E-5d) {
            int i4 = min - 1;
            if (Math.abs(this.f155a[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f156b[i4] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i5 = 0;
                while (i2 < min) {
                    float[] fArr2 = this.f155a;
                    int i6 = i5 + 1;
                    float f3 = fArr2[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f155a[0]);
        sb.append(",");
        sb.append(this.f156b[0]);
        sb.append(" end:");
        int i7 = min - 1;
        sb.append(this.f155a[i7]);
        sb.append(",");
        sb.append(this.f156b[i7]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (h.c.g(xmlPullParser, "pathData")) {
            String f2 = h.c.f(typedArray, xmlPullParser, "pathData", 4);
            Path e2 = i.b.e(f2);
            if (e2 != null) {
                b(e2);
                return;
            }
            throw new InflateException("The path is null, which is created from " + f2);
        } else if (!h.c.g(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!h.c.g(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float c2 = h.c.c(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float c3 = h.c.c(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean g2 = h.c.g(xmlPullParser, "controlX2");
            if (g2 != h.c.g(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (g2) {
                a(c2, c3, h.c.c(typedArray, xmlPullParser, "controlX2", 2, 0.0f), h.c.c(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                c(c2, c3);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f155a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f155a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f155a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f156b[i2];
        }
        float[] fArr2 = this.f156b;
        float f4 = fArr2[i2];
        return f4 + (((f2 - fArr[i2]) / f3) * (fArr2[length] - f4));
    }
}