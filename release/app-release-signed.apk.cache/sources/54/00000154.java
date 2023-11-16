package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import p010i.C0398a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.q0 */
/* loaded from: classes.dex */
public class C0306q0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1477a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1478b = {-16842910};

    /* renamed from: c */
    static final int[] f1479c = {16842908};

    /* renamed from: d */
    static final int[] f1480d = {16843518};

    /* renamed from: e */
    static final int[] f1481e = {16842919};

    /* renamed from: f */
    static final int[] f1482f = {16842912};

    /* renamed from: g */
    static final int[] f1483g = {16842913};

    /* renamed from: h */
    static final int[] f1484h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1485i = new int[0];

    /* renamed from: j */
    private static final int[] f1486j = new int[1];

    /* renamed from: a */
    public static int m1141a(Context context, int i) {
        ColorStateList m1138d = m1138d(context, i);
        if (m1138d == null || !m1138d.isStateful()) {
            TypedValue m1137e = m1137e();
            context.getTheme().resolveAttribute(16842803, m1137e, true);
            return m1139c(context, i, m1137e.getFloat());
        }
        return m1138d.getColorForState(f1478b, m1138d.getDefaultColor());
    }

    /* renamed from: b */
    public static int m1140b(Context context, int i) {
        int[] iArr = f1486j;
        iArr[0] = i;
        C0316v0 m1109s = C0316v0.m1109s(context, null, iArr);
        try {
            return m1109s.m1126b(0, 0);
        } finally {
            m1109s.m1107u();
        }
    }

    /* renamed from: c */
    static int m1139c(Context context, int i, float f) {
        int m1140b = m1140b(context, i);
        return C0398a.m693d(m1140b, Math.round(Color.alpha(m1140b) * f));
    }

    /* renamed from: d */
    public static ColorStateList m1138d(Context context, int i) {
        int[] iArr = f1486j;
        iArr[0] = i;
        C0316v0 m1109s = C0316v0.m1109s(context, null, iArr);
        try {
            return m1109s.m1125c(0);
        } finally {
            m1109s.m1107u();
        }
    }

    /* renamed from: e */
    private static TypedValue m1137e() {
        ThreadLocal<TypedValue> threadLocal = f1477a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}