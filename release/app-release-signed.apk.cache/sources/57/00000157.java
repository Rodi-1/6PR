package android.support.p002v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p011j.InterfaceC0415c;

/* renamed from: android.support.v7.widget.s */
/* loaded from: classes.dex */
class C0309s {

    /* renamed from: c */
    private static final int[] f1489c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1490a;

    /* renamed from: b */
    private Bitmap f1491b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0309s(ProgressBar progressBar) {
        this.f1490a = progressBar;
    }

    /* renamed from: a */
    private Shape m1134a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: d */
    private Drawable m1132d(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0415c) {
            InterfaceC0415c interfaceC0415c = (InterfaceC0415c) drawable;
            Drawable mo617a = interfaceC0415c.mo617a();
            if (mo617a != null) {
                interfaceC0415c.mo616b(m1132d(mo617a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1132d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1491b == null) {
                this.f1491b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m1134a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1131e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m1132d = m1132d(animationDrawable.getFrame(i), true);
                m1132d.setLevel(10000);
                animationDrawable2.addFrame(m1132d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m1133b() {
        return this.f1491b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1106c(AttributeSet attributeSet, int i) {
        C0316v0 m1108t = C0316v0.m1108t(this.f1490a.getContext(), attributeSet, f1489c, i, 0);
        Drawable m1121g = m1108t.m1121g(0);
        if (m1121g != null) {
            this.f1490a.setIndeterminateDrawable(m1131e(m1121g));
        }
        Drawable m1121g2 = m1108t.m1121g(1);
        if (m1121g2 != null) {
            this.f1490a.setProgressDrawable(m1132d(m1121g2, false));
        }
        m1108t.m1107u();
    }
}