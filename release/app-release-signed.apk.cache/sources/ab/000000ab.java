package android.support.p001v4.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.j */
/* loaded from: classes.dex */
public final class C0157j {

    /* renamed from: a */
    static final C0161d f700a;

    /* renamed from: android.support.v4.widget.j$a */
    /* loaded from: classes.dex */
    static class C0158a extends C0161d {
        C0158a() {
        }

        @Override // android.support.p001v4.widget.C0157j.C0161d
        /* renamed from: c */
        public void mo1723c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.j$b */
    /* loaded from: classes.dex */
    static class C0159b extends C0158a {

        /* renamed from: c */
        private static Field f701c;

        static {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f701c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C0159b() {
        }

        @Override // android.support.p001v4.widget.C0157j.C0161d
        /* renamed from: a */
        public void mo1725a(PopupWindow popupWindow, boolean z) {
            Field field = f701c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.j$c */
    /* loaded from: classes.dex */
    static class C0160c extends C0159b {
        C0160c() {
        }

        @Override // android.support.p001v4.widget.C0157j.C0159b, android.support.p001v4.widget.C0157j.C0161d
        /* renamed from: a */
        public void mo1725a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @Override // android.support.p001v4.widget.C0157j.C0161d
        /* renamed from: b */
        public void mo1724b(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: android.support.v4.widget.j$d */
    /* loaded from: classes.dex */
    static class C0161d {

        /* renamed from: a */
        private static Method f702a;

        /* renamed from: b */
        private static boolean f703b;

        C0161d() {
        }

        /* renamed from: a */
        public void mo1725a(PopupWindow popupWindow, boolean z) {
        }

        /* renamed from: b */
        public void mo1724b(PopupWindow popupWindow, int i) {
            if (!f703b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    f702a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                }
                f703b = true;
            }
            Method method = f702a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Integer.valueOf(i));
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: c */
        public void mo1723c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            throw null;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f700a = i >= 23 ? new C0160c() : i >= 21 ? new C0159b() : new C0158a();
    }

    /* renamed from: a */
    public static void m1728a(PopupWindow popupWindow, boolean z) {
        f700a.mo1725a(popupWindow, z);
    }

    /* renamed from: b */
    public static void m1727b(PopupWindow popupWindow, int i) {
        f700a.mo1724b(popupWindow, i);
    }

    /* renamed from: c */
    public static void m1726c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f700a.mo1723c(popupWindow, view, i, i2, i3);
    }
}