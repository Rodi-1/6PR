package p019r;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: r.l */
/* loaded from: classes.dex */
class C0560l {

    /* renamed from: a */
    private static Field f2358a;

    /* renamed from: b */
    private static boolean f2359b;

    /* renamed from: c */
    private static Class f2360c;

    /* renamed from: d */
    private static boolean f2361d;

    /* renamed from: e */
    private static Field f2362e;

    /* renamed from: f */
    private static boolean f2363f;

    /* renamed from: g */
    private static Field f2364g;

    /* renamed from: h */
    private static boolean f2365h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m155a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return m152d(resources);
        }
        if (i >= 23) {
            return m153c(resources);
        }
        if (i >= 21) {
            return m154b(resources);
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m154b(Resources resources) {
        if (!f2359b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2358a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2359b = true;
        }
        Field field = f2358a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m153c(Resources resources) {
        if (!f2359b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2358a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2359b = true;
        }
        Object obj = null;
        Field field = f2358a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        return obj != null && m151e(obj);
    }

    /* renamed from: d */
    private static boolean m152d(Resources resources) {
        Object obj;
        if (!f2365h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2364g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2365h = true;
        }
        Field field = f2364g;
        if (field == null) {
            return false;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f2359b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2358a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2359b = true;
        }
        Field field2 = f2358a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        return obj2 != null && m151e(obj2);
    }

    /* renamed from: e */
    private static boolean m151e(Object obj) {
        if (!f2361d) {
            try {
                f2360c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2361d = true;
        }
        Class cls = f2360c;
        if (cls == null) {
            return false;
        }
        if (!f2363f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2362e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2363f = true;
        }
        Field field = f2362e;
        if (field == null) {
            return false;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
            return true;
        }
        return false;
    }
}