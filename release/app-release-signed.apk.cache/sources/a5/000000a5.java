package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final b f548a;

    /* loaded from: classes.dex */
    static class a implements b {
        a() {
        }

        @Override // android.support.v4.widget.g.b
        public PorterDuff.Mode a(ImageView imageView) {
            if (imageView instanceof m) {
                return ((m) imageView).getSupportImageTintMode();
            }
            return null;
        }

        @Override // android.support.v4.widget.g.b
        public void b(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof m) {
                ((m) imageView).setSupportImageTintMode(mode);
            }
        }

        @Override // android.support.v4.widget.g.b
        public void c(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof m) {
                ((m) imageView).setSupportImageTintList(colorStateList);
            }
        }

        @Override // android.support.v4.widget.g.b
        public ColorStateList d(ImageView imageView) {
            if (imageView instanceof m) {
                return ((m) imageView).getSupportImageTintList();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        PorterDuff.Mode a(ImageView imageView);

        void b(ImageView imageView, PorterDuff.Mode mode);

        void c(ImageView imageView, ColorStateList colorStateList);

        ColorStateList d(ImageView imageView);
    }

    /* loaded from: classes.dex */
    static class c extends a {
        c() {
        }

        @Override // android.support.v4.widget.g.a, android.support.v4.widget.g.b
        public PorterDuff.Mode a(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @Override // android.support.v4.widget.g.a, android.support.v4.widget.g.b
        public void b(ImageView imageView, PorterDuff.Mode mode) {
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

        @Override // android.support.v4.widget.g.a, android.support.v4.widget.g.b
        public void c(ImageView imageView, ColorStateList colorStateList) {
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

        @Override // android.support.v4.widget.g.a, android.support.v4.widget.g.b
        public ColorStateList d(ImageView imageView) {
            return imageView.getImageTintList();
        }
    }

    static {
        f548a = Build.VERSION.SDK_INT >= 21 ? new c() : new a();
    }

    public static ColorStateList a(ImageView imageView) {
        return f548a.d(imageView);
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return f548a.a(imageView);
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        f548a.c(imageView, colorStateList);
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        f548a.b(imageView, mode);
    }
}