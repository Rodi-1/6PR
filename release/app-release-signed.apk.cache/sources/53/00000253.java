package r;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static Field f1811a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1812b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f1813c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1814d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f1815e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f1816f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f1817g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f1818h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return d(resources);
        }
        if (i2 >= 23) {
            return c(resources);
        }
        if (i2 >= 21) {
            return b(resources);
        }
        return false;
    }

    private static boolean b(Resources resources) {
        if (!f1812b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1811a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1812b = true;
        }
        Field field = f1811a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean c(Resources resources) {
        if (!f1812b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1811a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1812b = true;
        }
        Object obj = null;
        Field field = f1811a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        return obj != null && e(obj);
    }

    private static boolean d(Resources resources) {
        Object obj;
        if (!f1818h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1817g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f1818h = true;
        }
        Field field = f1817g;
        if (field == null) {
            return false;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f1812b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1811a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f1812b = true;
        }
        Field field2 = f1811a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        return obj2 != null && e(obj2);
    }

    private static boolean e(Object obj) {
        if (!f1814d) {
            try {
                f1813c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1814d = true;
        }
        Class cls = f1813c;
        if (cls == null) {
            return false;
        }
        if (!f1816f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1815e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f1816f = true;
        }
        Field field = f1815e;
        if (field == null) {
            return false;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
            return true;
        }
        return false;
    }
}