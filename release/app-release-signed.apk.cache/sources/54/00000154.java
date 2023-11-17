package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1169a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1170b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1171c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1172d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1173e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1174f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1175g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f1176h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f1177i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1178j = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 == null || !d2.isStateful()) {
            TypedValue e2 = e();
            context.getTheme().resolveAttribute(16842803, e2, true);
            return c(context, i2, e2.getFloat());
        }
        return d2.getColorForState(f1170b, d2.getDefaultColor());
    }

    public static int b(Context context, int i2) {
        int[] iArr = f1178j;
        iArr[0] = i2;
        v0 s2 = v0.s(context, null, iArr);
        try {
            return s2.b(0, 0);
        } finally {
            s2.u();
        }
    }

    static int c(Context context, int i2, float f2) {
        int b2 = b(context, i2);
        return i.a.d(b2, Math.round(Color.alpha(b2) * f2));
    }

    public static ColorStateList d(Context context, int i2) {
        int[] iArr = f1178j;
        iArr[0] = i2;
        v0 s2 = v0.s(context, null, iArr);
        try {
            return s2.c(0);
        } finally {
            s2.u();
        }
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1169a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}