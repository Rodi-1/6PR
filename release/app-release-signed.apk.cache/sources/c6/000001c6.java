package p011j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p011j.C0416d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j.f */
/* loaded from: classes.dex */
public class C0420f extends C0418e {

    /* renamed from: i */
    private static Method f2070i;

    /* renamed from: j.f$a */
    /* loaded from: classes.dex */
    private static class C0421a extends C0416d.AbstractC0417a {
        C0421a(C0416d.AbstractC0417a abstractC0417a, Resources resources) {
            super(abstractC0417a, resources);
        }

        @Override // p011j.C0416d.AbstractC0417a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0420f(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0420f(Drawable drawable) {
        super(drawable);
        m610g();
    }

    C0420f(C0416d.AbstractC0417a abstractC0417a, Resources resources) {
        super(abstractC0417a, resources);
        m610g();
    }

    /* renamed from: g */
    private void m610g() {
        if (f2070i == null) {
            try {
                f2070i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // p011j.C0416d
    /* renamed from: c */
    protected boolean mo612c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f2065g;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // p011j.C0418e, p011j.C0416d
    /* renamed from: d */
    C0416d.AbstractC0417a mo611d() {
        return new C0421a(this.f2063e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2065g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2065g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2065g;
        if (drawable != null && (method = f2070i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f2065g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2065g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p011j.C0416d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // p011j.C0416d, android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTint(int i) {
        if (mo612c()) {
            super.setTint(i);
        } else {
            this.f2065g.setTint(i);
        }
    }

    @Override // p011j.C0416d, android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintList(ColorStateList colorStateList) {
        if (mo612c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2065g.setTintList(colorStateList);
        }
    }

    @Override // p011j.C0416d, android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo612c()) {
            super.setTintMode(mode);
        } else {
            this.f2065g.setTintMode(mode);
        }
    }
}