package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final c f1695a;

    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // o.g.b, o.g.c
        public void a(MenuItem menuItem, char c2, int i2) {
            menuItem.setAlphabeticShortcut(c2, i2);
        }

        @Override // o.g.b, o.g.c
        public void b(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        @Override // o.g.b, o.g.c
        public void c(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        @Override // o.g.b, o.g.c
        public void d(MenuItem menuItem, char c2, int i2) {
            menuItem.setNumericShortcut(c2, i2);
        }

        @Override // o.g.b, o.g.c
        public void e(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        @Override // o.g.b, o.g.c
        public void f(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    static class b implements c {
        b() {
        }

        @Override // o.g.c
        public void a(MenuItem menuItem, char c2, int i2) {
        }

        @Override // o.g.c
        public void b(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        @Override // o.g.c
        public void c(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // o.g.c
        public void d(MenuItem menuItem, char c2, int i2) {
        }

        @Override // o.g.c
        public void e(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // o.g.c
        public void f(MenuItem menuItem, ColorStateList colorStateList) {
        }
    }

    /* loaded from: classes.dex */
    interface c {
        void a(MenuItem menuItem, char c2, int i2);

        void b(MenuItem menuItem, PorterDuff.Mode mode);

        void c(MenuItem menuItem, CharSequence charSequence);

        void d(MenuItem menuItem, char c2, int i2);

        void e(MenuItem menuItem, CharSequence charSequence);

        void f(MenuItem menuItem, ColorStateList colorStateList);
    }

    static {
        f1695a = Build.VERSION.SDK_INT >= 26 ? new a() : new b();
    }

    public static MenuItem a(MenuItem menuItem, o.c cVar) {
        if (menuItem instanceof k.b) {
            return ((k.b) menuItem).a(cVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setAlphabeticShortcut(c2, i2);
        } else {
            f1695a.a(menuItem, c2, i2);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setContentDescription(charSequence);
        } else {
            f1695a.c(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setIconTintList(colorStateList);
        } else {
            f1695a.f(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setIconTintMode(mode);
        } else {
            f1695a.b(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setNumericShortcut(c2, i2);
        } else {
            f1695a.d(menuItem, c2, i2);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof k.b) {
            ((k.b) menuItem).setTooltipText(charSequence);
        } else {
            f1695a.e(menuItem, charSequence);
        }
    }
}