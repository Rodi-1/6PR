package o;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Field f1692a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1693b;

    /* renamed from: c  reason: collision with root package name */
    static final b f1694c;

    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // o.e.b
        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                e.a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                e.a(layoutInflater, factory2);
            }
        }
    }

    static {
        f1694c = Build.VERSION.SDK_INT >= 21 ? new a() : new b();
    }

    static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1693b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1692a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e2);
            }
            f1693b = true;
        }
        Field field = f1692a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f1694c.a(layoutInflater, factory2);
    }
}