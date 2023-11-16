package p011j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C0413a {

    /* renamed from: a */
    private static Method f2055a;

    /* renamed from: b */
    private static boolean f2056b;

    /* renamed from: c */
    private static Method f2057c;

    /* renamed from: d */
    private static boolean f2058d;

    /* renamed from: a */
    public static void m633a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b */
    public static boolean m632b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: c */
    public static int m631c(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: d */
    public static ColorFilter m630d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: e */
    public static int m629e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f2058d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2057c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f2058d = true;
        }
        Method method = f2057c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f2057c = null;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static void m628f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: g */
    public static boolean m627g(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* renamed from: h */
    public static void m626h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: i */
    public static void m625i(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: j */
    public static void m624j(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: k */
    public static void m623k(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public static boolean m622l(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!f2056b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2055a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f2056b = true;
        }
        Method method = f2055a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f2055a = null;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static void m621m(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0414b) {
            ((InterfaceC0414b) drawable).setTint(i);
        }
    }

    /* renamed from: n */
    public static void m620n(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0414b) {
            ((InterfaceC0414b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: o */
    public static void m619o(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0414b) {
            ((InterfaceC0414b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: p */
    public static Drawable m618p(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0414b) ? new C0420f(drawable) : drawable : !(drawable instanceof InterfaceC0414b) ? new C0418e(drawable) : drawable;
    }
}