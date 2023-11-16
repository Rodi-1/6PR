package p010i;

import android.graphics.Color;

/* renamed from: i.a */
/* loaded from: classes.dex */
public final class C0398a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f2035a = new ThreadLocal<>();

    /* renamed from: a */
    private static int m696a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: b */
    public static int m695b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int m696a = m696a(alpha2, alpha);
        return Color.argb(m696a, m694c(Color.red(i), alpha2, Color.red(i2), alpha, m696a), m694c(Color.green(i), alpha2, Color.green(i2), alpha, m696a), m694c(Color.blue(i), alpha2, Color.blue(i2), alpha, m696a));
    }

    /* renamed from: c */
    private static int m694c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: d */
    public static int m693d(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}