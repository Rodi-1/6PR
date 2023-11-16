package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009h.C0397c;
import p010i.C0399b;

/* renamed from: android.support.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0044d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    public static class C0046b implements TypeEvaluator<C0399b.C0401b[]> {

        /* renamed from: a */
        private C0399b.C0401b[] f259a;

        private C0046b() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C0399b.C0401b[] evaluate(float f, C0399b.C0401b[] c0401bArr, C0399b.C0401b[] c0401bArr2) {
            if (C0399b.m691b(c0401bArr, c0401bArr2)) {
                C0399b.C0401b[] c0401bArr3 = this.f259a;
                if (c0401bArr3 == null || !C0399b.m691b(c0401bArr3, c0401bArr)) {
                    this.f259a = C0399b.m687f(c0401bArr);
                }
                for (int i = 0; i < c0401bArr.length; i++) {
                    this.f259a[i].m679d(c0401bArr[i], c0401bArr2[i], f);
                }
                return this.f259a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m2302a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m2301b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m2301b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0044d.m2301b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m2300c(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m2299d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m2298e(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m2295h(i4)) || (z2 && m2295h(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C0047e m2282a = i == 3 ? C0047e.m2282a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m2295h(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2295h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2295h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || m2282a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m2282a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0399b.C0401b[] m689d = C0399b.m689d(string);
        C0399b.C0401b[] m689d2 = C0399b.m689d(string2);
        if (m689d == null && m689d2 == null) {
            return null;
        }
        if (m689d == null) {
            if (m689d2 != null) {
                return PropertyValuesHolder.ofObject(str, new C0046b(), m689d2);
            }
            return null;
        }
        C0046b c0046b = new C0046b();
        if (m689d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c0046b, m689d);
        } else if (!C0399b.m691b(m689d, m689d2)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, c0046b, m689d, m689d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    private static int m2297f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m2295h(i3)) || (z2 && m2295h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m2296g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f243j);
        int i = 0;
        TypedValue m697i = C0397c.m697i(m698h, xmlPullParser, "value", 0);
        if ((m697i != null) && m2295h(m697i.type)) {
            i = 3;
        }
        m698h.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m2295h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m2294i(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m2293j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m2293j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m2292k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m2292k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m2302a(context, resources, theme, xmlResourceParser, f);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m2291l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f240g);
        TypedArray m698h2 = C0397c.m698h(resources, theme, attributeSet, C0038a.f244k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m2286q(valueAnimator, m698h, m698h2, f, xmlPullParser);
        int m701e = C0397c.m701e(m698h, xmlPullParser, "interpolator", 0, 0);
        if (m701e > 0) {
            valueAnimator.setInterpolator(C0043c.m2303b(context, m701e));
        }
        m698h.recycle();
        if (m698h2 != null) {
            m698h2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m2290m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f243j);
        float m703c = C0397c.m703c(m698h, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m697i = C0397c.m697i(m698h, xmlPullParser, "value", 0);
        boolean z = m697i != null;
        if (i == 4) {
            i = (z && m2295h(m697i.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(m703c, C0397c.m702d(m698h, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m703c, C0397c.m703c(m698h, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(m703c) : Keyframe.ofInt(m703c);
        int m701e = C0397c.m701e(m698h, xmlPullParser, "interpolator", 1, 0);
        if (m701e > 0) {
            ofInt.setInterpolator(C0043c.m2303b(context, m701e));
        }
        m698h.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m2289n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m2291l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m2288o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m2296g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m2290m = m2290m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m2290m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m2290m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m2300c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m2300c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m2299d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C0047e.m2282a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m2287p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f242i);
                String m700f = C0397c.m700f(m698h, xmlPullParser, "propertyName", 3);
                int m702d = C0397c.m702d(m698h, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m2288o = m2288o(context, resources, theme, xmlPullParser, m700f, m702d);
                if (m2288o == null) {
                    m2288o = m2298e(m698h, m702d, 0, 1, m700f);
                }
                if (m2288o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m2288o);
                }
                m698h.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m2286q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m702d = C0397c.m702d(typedArray, xmlPullParser, "duration", 1, 300);
        long m702d2 = C0397c.m702d(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m702d3 = C0397c.m702d(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0397c.m699g(xmlPullParser, "valueFrom") && C0397c.m699g(xmlPullParser, "valueTo")) {
            if (m702d3 == 4) {
                m702d3 = m2297f(typedArray, 5, 6);
            }
            PropertyValuesHolder m2298e = m2298e(typedArray, m702d3, 5, 6, "");
            if (m2298e != null) {
                valueAnimator.setValues(m2298e);
            }
        }
        valueAnimator.setDuration(m702d);
        valueAnimator.setStartDelay(m702d2);
        valueAnimator.setRepeatCount(C0397c.m702d(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0397c.m702d(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m2285r(valueAnimator, typedArray2, m702d3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m2285r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m700f = C0397c.m700f(typedArray, xmlPullParser, "pathData", 1);
        if (m700f == null) {
            objectAnimator.setPropertyName(C0397c.m700f(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m700f2 = C0397c.m700f(typedArray, xmlPullParser, "propertyXName", 2);
        String m700f3 = C0397c.m700f(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (m700f2 != null || m700f3 != null) {
            m2284s(C0399b.m688e(m700f), objectAnimator, f * 0.5f, m700f2, m700f3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    private static void m2284s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        char c = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2, fArr3, null);
            fArr[i] = fArr3[c];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                f2 -= ((Float) arrayList.get(i3)).floatValue();
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c = 0;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}