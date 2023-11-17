package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final C0006c f533a;

    /* loaded from: classes.dex */
    static class a extends C0006c {
        a() {
        }

        @Override // android.support.v4.widget.c.C0006c
        public void b(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @Override // android.support.v4.widget.c.C0006c
        public void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.widget.c.C0006c
        public Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0006c {

        /* renamed from: a  reason: collision with root package name */
        private static Field f534a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f535b;

        C0006c() {
        }

        public Drawable a(CompoundButton compoundButton) {
            if (!f535b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f534a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
                }
                f535b = true;
            }
            Field field = f534a;
            if (field != null) {
                try {
                    return (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e3) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                    f534a = null;
                }
            }
            return null;
        }

        public void b(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof l) {
                ((l) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        public void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof l) {
                ((l) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f533a = i2 >= 23 ? new b() : i2 >= 21 ? new a() : new C0006c();
    }

    public static Drawable a(CompoundButton compoundButton) {
        return f533a.a(compoundButton);
    }

    public static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
        f533a.b(compoundButton, colorStateList);
    }

    public static void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f533a.c(compoundButton, mode);
    }
}