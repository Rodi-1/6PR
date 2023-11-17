package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class p extends ImageView implements o.n, android.support.v4.widget.m {

    /* renamed from: b  reason: collision with root package name */
    private final f f1148b;

    /* renamed from: c  reason: collision with root package name */
    private final o f1149c;

    public p(Context context) {
        this(context, null);
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        f fVar = new f(this);
        this.f1148b = fVar;
        fVar.e(attributeSet, i2);
        o oVar = new o(this);
        this.f1149c = oVar;
        oVar.f(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1148b;
        if (fVar != null) {
            fVar.b();
        }
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // o.n
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1148b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // o.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1148b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.support.v4.widget.m
    public ColorStateList getSupportImageTintList() {
        o oVar = this.f1149c;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // android.support.v4.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar = this.f1149c;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1149c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1148b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.f1148b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1148b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1148b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1149c;
        if (oVar != null) {
            oVar.i(mode);
        }
    }
}