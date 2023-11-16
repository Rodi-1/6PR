package android.support.p001v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c */
/* loaded from: classes.dex */
public final class C0139c {

    /* renamed from: a */
    private static final C0142c f683a;

    /* renamed from: android.support.v4.widget.c$a */
    /* loaded from: classes.dex */
    static class C0140a extends C0142c {
        C0140a() {
        }

        @Override // android.support.p001v4.widget.C0139c.C0142c
        /* renamed from: b */
        public void mo1747b(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @Override // android.support.p001v4.widget.C0139c.C0142c
        /* renamed from: c */
        public void mo1746c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.c$b */
    /* loaded from: classes.dex */
    static class C0141b extends C0140a {
        C0141b() {
        }

        @Override // android.support.p001v4.widget.C0139c.C0142c
        /* renamed from: a */
        public Drawable mo1748a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.c$c */
    /* loaded from: classes.dex */
    static class C0142c {

        /* renamed from: a */
        private static Field f684a;

        /* renamed from: b */
        private static boolean f685b;

        C0142c() {
        }

        /* renamed from: a */
        public Drawable mo1748a(CompoundButton compoundButton) {
            if (!f685b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f684a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f685b = true;
            }
            Field field = f684a;
            if (field != null) {
                try {
                    return (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f684a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public void mo1747b(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof InterfaceC0163l) {
                ((InterfaceC0163l) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: c */
        public void mo1746c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof InterfaceC0163l) {
                ((InterfaceC0163l) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f683a = i >= 23 ? new C0141b() : i >= 21 ? new C0140a() : new C0142c();
    }

    /* renamed from: a */
    public static Drawable m1751a(CompoundButton compoundButton) {
        return f683a.mo1748a(compoundButton);
    }

    /* renamed from: b */
    public static void m1750b(CompoundButton compoundButton, ColorStateList colorStateList) {
        f683a.mo1747b(compoundButton, colorStateList);
    }

    /* renamed from: c */
    public static void m1749c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f683a.mo1746c(compoundButton, mode);
    }
}