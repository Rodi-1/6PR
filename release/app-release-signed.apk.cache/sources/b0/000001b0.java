package i;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<double[]> f1522a = new ThreadLocal<>();

    private static int a(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    public static int b(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int a2 = a(alpha2, alpha);
        return Color.argb(a2, c(Color.red(i2), alpha2, Color.red(i3), alpha, a2), c(Color.green(i2), alpha2, Color.green(i3), alpha, a2), c(Color.blue(i2), alpha2, Color.blue(i3), alpha, a2));
    }

    private static int c(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    public static int d(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}