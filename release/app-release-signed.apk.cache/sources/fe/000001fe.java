package p016o;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: o.e */
/* loaded from: classes.dex */
public final class C0475e {

    /* renamed from: a */
    private static Field f2210a;

    /* renamed from: b */
    private static boolean f2211b;

    /* renamed from: c */
    static final C0477b f2212c;

    /* renamed from: o.e$a */
    /* loaded from: classes.dex */
    static class C0476a extends C0477b {
        C0476a() {
        }

        @Override // p016o.C0475e.C0477b
        /* renamed from: a */
        public void mo453a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: o.e$b */
    /* loaded from: classes.dex */
    static class C0477b {
        C0477b() {
        }

        /* renamed from: a */
        public void mo453a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                C0475e.m455a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                C0475e.m455a(layoutInflater, factory2);
            }
        }
    }

    static {
        f2212c = Build.VERSION.SDK_INT >= 21 ? new C0476a() : new C0477b();
    }

    /* renamed from: a */
    static void m455a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2211b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2210a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f2211b = true;
        }
        Field field = f2210a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m454b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f2212c.mo453a(layoutInflater, factory2);
    }
}