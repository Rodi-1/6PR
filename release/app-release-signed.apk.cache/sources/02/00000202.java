package p016o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p012k.InterfaceMenuItemC0423b;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C0479g {

    /* renamed from: a */
    static final InterfaceC0482c f2213a;

    /* renamed from: o.g$a */
    /* loaded from: classes.dex */
    static class C0480a extends C0481b {
        C0480a() {
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: a */
        public void mo443a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: b */
        public void mo442b(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: c */
        public void mo441c(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: d */
        public void mo440d(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: e */
        public void mo439e(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        @Override // p016o.C0479g.C0481b, p016o.C0479g.InterfaceC0482c
        /* renamed from: f */
        public void mo438f(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: o.g$b */
    /* loaded from: classes.dex */
    static class C0481b implements InterfaceC0482c {
        C0481b() {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: a */
        public void mo443a(MenuItem menuItem, char c, int i) {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: b */
        public void mo442b(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: c */
        public void mo441c(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: d */
        public void mo440d(MenuItem menuItem, char c, int i) {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: e */
        public void mo439e(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // p016o.C0479g.InterfaceC0482c
        /* renamed from: f */
        public void mo438f(MenuItem menuItem, ColorStateList colorStateList) {
        }
    }

    /* renamed from: o.g$c */
    /* loaded from: classes.dex */
    interface InterfaceC0482c {
        /* renamed from: a */
        void mo443a(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo442b(MenuItem menuItem, PorterDuff.Mode mode);

        /* renamed from: c */
        void mo441c(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: d */
        void mo440d(MenuItem menuItem, char c, int i);

        /* renamed from: e */
        void mo439e(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: f */
        void mo438f(MenuItem menuItem, ColorStateList colorStateList);
    }

    static {
        f2213a = Build.VERSION.SDK_INT >= 26 ? new C0480a() : new C0481b();
    }

    /* renamed from: a */
    public static MenuItem m450a(MenuItem menuItem, AbstractC0471c abstractC0471c) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            return ((InterfaceMenuItemC0423b) menuItem).mo30a(abstractC0471c);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m449b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f2213a.mo443a(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m448c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setContentDescription(charSequence);
        } else {
            f2213a.mo441c(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m447d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setIconTintList(colorStateList);
        } else {
            f2213a.mo438f(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m446e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setIconTintMode(mode);
        } else {
            f2213a.mo442b(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m445f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setNumericShortcut(c, i);
        } else {
            f2213a.mo440d(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m444g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            ((InterfaceMenuItemC0423b) menuItem).setTooltipText(charSequence);
        } else {
            f2213a.mo439e(menuItem, charSequence);
        }
    }
}