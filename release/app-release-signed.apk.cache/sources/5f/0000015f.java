package android.support.p002v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p011j.C0413a;
import p016o.C0490o;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.w */
/* loaded from: classes.dex */
class C0317w extends C0309s {

    /* renamed from: d */
    private final SeekBar f1508d;

    /* renamed from: e */
    private Drawable f1509e;

    /* renamed from: f */
    private ColorStateList f1510f;

    /* renamed from: g */
    private PorterDuff.Mode f1511g;

    /* renamed from: h */
    private boolean f1512h;

    /* renamed from: i */
    private boolean f1513i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0317w(SeekBar seekBar) {
        super(seekBar);
        this.f1510f = null;
        this.f1511g = null;
        this.f1512h = false;
        this.f1513i = false;
        this.f1508d = seekBar;
    }

    /* renamed from: f */
    private void m1105f() {
        Drawable drawable = this.f1509e;
        if (drawable != null) {
            if (this.f1512h || this.f1513i) {
                Drawable m618p = C0413a.m618p(drawable.mutate());
                this.f1509e = m618p;
                if (this.f1512h) {
                    C0413a.m620n(m618p, this.f1510f);
                }
                if (this.f1513i) {
                    C0413a.m619o(this.f1509e, this.f1511g);
                }
                if (this.f1509e.isStateful()) {
                    this.f1509e.setState(this.f1508d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v7.widget.C0309s
    /* renamed from: c */
    public void mo1106c(AttributeSet attributeSet, int i) {
        super.mo1106c(attributeSet, i);
        C0316v0 m1108t = C0316v0.m1108t(this.f1508d.getContext(), attributeSet, C0578j.f2489R, i, 0);
        Drawable m1121g = m1108t.m1121g(C0578j.f2493S);
        if (m1121g != null) {
            this.f1508d.setThumb(m1121g);
        }
        m1101j(m1108t.m1122f(C0578j.f2497T));
        int i2 = C0578j.f2505V;
        if (m1108t.m1111q(i2)) {
            this.f1511g = C0258e0.m1321d(m1108t.m1118j(i2, -1), this.f1511g);
            this.f1513i = true;
        }
        int i3 = C0578j.f2501U;
        if (m1108t.m1111q(i3)) {
            this.f1510f = m1108t.m1125c(i3);
            this.f1512h = true;
        }
        m1108t.m1107u();
        m1105f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1104g(Canvas canvas) {
        if (this.f1509e != null) {
            int max = this.f1508d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1509e.getIntrinsicWidth();
                int intrinsicHeight = this.f1509e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1509e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1508d.getWidth() - this.f1508d.getPaddingLeft()) - this.f1508d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1508d.getPaddingLeft(), this.f1508d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1509e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1103h() {
        Drawable drawable = this.f1509e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1508d.getDrawableState())) {
            this.f1508d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1102i() {
        Drawable drawable = this.f1509e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m1101j(Drawable drawable) {
        Drawable drawable2 = this.f1509e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1509e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1508d);
            C0413a.m622l(drawable, C0490o.m408d(this.f1508d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1508d.getDrawableState());
            }
            m1105f();
        }
        this.f1508d.invalidate();
    }
}