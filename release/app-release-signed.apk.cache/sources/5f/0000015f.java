package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class w extends s {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1200d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1201e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1202f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1203g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1204h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1205i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(SeekBar seekBar) {
        super(seekBar);
        this.f1202f = null;
        this.f1203g = null;
        this.f1204h = false;
        this.f1205i = false;
        this.f1200d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1201e;
        if (drawable != null) {
            if (this.f1204h || this.f1205i) {
                Drawable p2 = j.a.p(drawable.mutate());
                this.f1201e = p2;
                if (this.f1204h) {
                    j.a.n(p2, this.f1202f);
                }
                if (this.f1205i) {
                    j.a.o(this.f1201e, this.f1203g);
                }
                if (this.f1201e.isStateful()) {
                    this.f1201e.setState(this.f1200d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.s
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        v0 t2 = v0.t(this.f1200d.getContext(), attributeSet, s.j.R, i2, 0);
        Drawable g2 = t2.g(s.j.S);
        if (g2 != null) {
            this.f1200d.setThumb(g2);
        }
        j(t2.f(s.j.T));
        int i3 = s.j.V;
        if (t2.q(i3)) {
            this.f1203g = e0.d(t2.j(i3, -1), this.f1203g);
            this.f1205i = true;
        }
        int i4 = s.j.U;
        if (t2.q(i4)) {
            this.f1202f = t2.c(i4);
            this.f1204h = true;
        }
        t2.u();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1201e != null) {
            int max = this.f1200d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1201e.getIntrinsicWidth();
                int intrinsicHeight = this.f1201e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1201e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1200d.getWidth() - this.f1200d.getPaddingLeft()) - this.f1200d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1200d.getPaddingLeft(), this.f1200d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1201e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1201e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1200d.getDrawableState())) {
            this.f1200d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1201e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1201e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1201e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1200d);
            j.a.l(drawable, o.o.d(this.f1200d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1200d.getDrawableState());
            }
            f();
        }
        this.f1200d.invalidate();
    }
}