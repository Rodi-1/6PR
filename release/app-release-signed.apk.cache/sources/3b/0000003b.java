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
import p009h.C0397c;
import p010i.C0399b;

/* renamed from: android.support.graphics.drawable.f  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC0048f implements Interpolator {

    /* renamed from: a */
    private float[] f261a;

    /* renamed from: b */
    private float[] f262b;

    public animationInterpolatorC0048f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public animationInterpolatorC0048f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f245l);
        m2278d(m698h, xmlPullParser);
        m698h.recycle();
    }

    /* renamed from: a */
    private void m2281a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m2280b(path);
    }

    /* renamed from: b */
    private void m2280b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f261a = new float[min];
        this.f262b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f261a[i2] = fArr[0];
            this.f262b[i2] = fArr[1];
        }
        if (Math.abs(this.f261a[0]) <= 1.0E-5d && Math.abs(this.f262b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f261a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f262b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f261a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f261a[0]);
        sb.append(",");
        sb.append(this.f262b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f261a[i6]);
        sb.append(",");
        sb.append(this.f262b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private void m2279c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m2280b(path);
    }

    /* renamed from: d */
    private void m2278d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0397c.m699g(xmlPullParser, "pathData")) {
            String m700f = C0397c.m700f(typedArray, xmlPullParser, "pathData", 4);
            Path m688e = C0399b.m688e(m700f);
            if (m688e != null) {
                m2280b(m688e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m700f);
        } else if (!C0397c.m699g(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!C0397c.m699g(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float m703c = C0397c.m703c(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float m703c2 = C0397c.m703c(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean m699g = C0397c.m699g(xmlPullParser, "controlX2");
            if (m699g != C0397c.m699g(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m699g) {
                m2281a(m703c, m703c2, C0397c.m703c(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0397c.m703c(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                m2279c(m703c, m703c2);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f261a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f261a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f261a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f262b[i];
        }
        float[] fArr2 = this.f262b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}