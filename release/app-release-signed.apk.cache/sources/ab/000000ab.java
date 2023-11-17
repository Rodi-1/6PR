package android.support.v4.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final d f550a;

    /* loaded from: classes.dex */
    static class a extends d {
        a() {
        }

        @Override // android.support.v4.widget.j.d
        public void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {

        /* renamed from: c  reason: collision with root package name */
        private static Field f551c;

        static {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f551c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
        }

        b() {
        }

        @Override // android.support.v4.widget.j.d
        public void a(PopupWindow popupWindow, boolean z) {
            Field field = f551c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.widget.j.b, android.support.v4.widget.j.d
        public void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @Override // android.support.v4.widget.j.d
        public void b(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    /* loaded from: classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private static Method f552a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f553b;

        d() {
        }

        public void a(PopupWindow popupWindow, boolean z) {
        }

        public void b(PopupWindow popupWindow, int i2) {
            if (!f553b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    f552a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                }
                f553b = true;
            }
            Method method = f552a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Integer.valueOf(i2));
                } catch (Exception unused2) {
                }
            }
        }

        public void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            throw null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f550a = i2 >= 23 ? new c() : i2 >= 21 ? new b() : new a();
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        f550a.a(popupWindow, z);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        f550a.b(popupWindow, i2);
    }

    public static void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        f550a.c(popupWindow, view, i2, i3, i4);
    }
}