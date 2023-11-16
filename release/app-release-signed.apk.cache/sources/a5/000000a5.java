package android.support.p001v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.g */
/* loaded from: classes.dex */
public class C0151g {

    /* renamed from: a */
    static final InterfaceC0153b f698a;

    /* renamed from: android.support.v4.widget.g$a */
    /* loaded from: classes.dex */
    static class C0152a implements InterfaceC0153b {
        C0152a() {
        }

        @Override // android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: a */
        public PorterDuff.Mode mo1736a(ImageView imageView) {
            if (imageView instanceof InterfaceC0164m) {
                return ((InterfaceC0164m) imageView).getSupportImageTintMode();
            }
            return null;
        }

        @Override // android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: b */
        public void mo1735b(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof InterfaceC0164m) {
                ((InterfaceC0164m) imageView).setSupportImageTintMode(mode);
            }
        }

        @Override // android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: c */
        public void mo1734c(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof InterfaceC0164m) {
                ((InterfaceC0164m) imageView).setSupportImageTintList(colorStateList);
            }
        }

        @Override // android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: d */
        public ColorStateList mo1733d(ImageView imageView) {
            if (imageView instanceof InterfaceC0164m) {
                return ((InterfaceC0164m) imageView).getSupportImageTintList();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.g$b */
    /* loaded from: classes.dex */
    interface InterfaceC0153b {
        /* renamed from: a */
        PorterDuff.Mode mo1736a(ImageView imageView);

        /* renamed from: b */
        void mo1735b(ImageView imageView, PorterDuff.Mode mode);

        /* renamed from: c */
        void mo1734c(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: d */
        ColorStateList mo1733d(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.g$c */
    /* loaded from: classes.dex */
    static class C0154c extends C0152a {
        C0154c() {
        }

        @Override // android.support.p001v4.widget.C0151g.C0152a, android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: a */
        public PorterDuff.Mode mo1736a(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @Override // android.support.p001v4.widget.C0151g.C0152a, android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: b */
        public void mo1735b(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.p001v4.widget.C0151g.C0152a, android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: c */
        public void mo1734c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.p001v4.widget.C0151g.C0152a, android.support.p001v4.widget.C0151g.InterfaceC0153b
        /* renamed from: d */
        public ColorStateList mo1733d(ImageView imageView) {
            return imageView.getImageTintList();
        }
    }

    static {
        f698a = Build.VERSION.SDK_INT >= 21 ? new C0154c() : new C0152a();
    }

    /* renamed from: a */
    public static ColorStateList m1740a(ImageView imageView) {
        return f698a.mo1733d(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m1739b(ImageView imageView) {
        return f698a.mo1736a(imageView);
    }

    /* renamed from: c */
    public static void m1738c(ImageView imageView, ColorStateList colorStateList) {
        f698a.mo1734c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m1737d(ImageView imageView, PorterDuff.Mode mode) {
        f698a.mo1735b(imageView, mode);
    }
}