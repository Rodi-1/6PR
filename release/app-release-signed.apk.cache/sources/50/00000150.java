package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p001v4.widget.InterfaceC0164m;
import android.util.AttributeSet;
import android.widget.ImageView;
import p016o.InterfaceC0489n;

/* renamed from: android.support.v7.widget.p */
/* loaded from: classes.dex */
public class C0302p extends ImageView implements InterfaceC0489n, InterfaceC0164m {

    /* renamed from: b */
    private final C0259f f1452b;

    /* renamed from: c */
    private final C0296o f1453c;

    public C0302p(Context context) {
        this(context, null);
    }

    public C0302p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0302p(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0259f c0259f = new C0259f(this);
        this.f1452b = c0259f;
        c0259f.m1316e(attributeSet, i);
        C0296o c0296o = new C0296o(this);
        this.f1453c = c0296o;
        c0296o.m1175f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            c0259f.m1319b();
        }
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1179b();
        }
    }

    @Override // p016o.InterfaceC0489n
    public ColorStateList getSupportBackgroundTintList() {
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            return c0259f.m1318c();
        }
        return null;
    }

    @Override // p016o.InterfaceC0489n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            return c0259f.m1317d();
        }
        return null;
    }

    @Override // android.support.p001v4.widget.InterfaceC0164m
    public ColorStateList getSupportImageTintList() {
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            return c0296o.m1178c();
        }
        return null;
    }

    @Override // android.support.p001v4.widget.InterfaceC0164m
    public PorterDuff.Mode getSupportImageTintMode() {
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            return c0296o.m1177d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1453c.m1176e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            c0259f.m1315f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            c0259f.m1314g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1179b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1179b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1174g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1179b();
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            c0259f.m1312i(colorStateList);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0259f c0259f = this.f1452b;
        if (c0259f != null) {
            c0259f.m1311j(mode);
        }
    }

    @Override // android.support.p001v4.widget.InterfaceC0164m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1173h(colorStateList);
        }
    }

    @Override // android.support.p001v4.widget.InterfaceC0164m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0296o c0296o = this.f1453c;
        if (c0296o != null) {
            c0296o.m1172i(mode);
        }
    }
}