package p011j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: j.d */
/* loaded from: classes.dex */
class C0416d extends Drawable implements Drawable.Callback, InterfaceC0415c, InterfaceC0414b {

    /* renamed from: h */
    static final PorterDuff.Mode f2059h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f2060b;

    /* renamed from: c */
    private PorterDuff.Mode f2061c;

    /* renamed from: d */
    private boolean f2062d;

    /* renamed from: e */
    AbstractC0417a f2063e;

    /* renamed from: f */
    private boolean f2064f;

    /* renamed from: g */
    Drawable f2065g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0417a extends Drawable.ConstantState {

        /* renamed from: a */
        int f2066a;

        /* renamed from: b */
        Drawable.ConstantState f2067b;

        /* renamed from: c */
        ColorStateList f2068c;

        /* renamed from: d */
        PorterDuff.Mode f2069d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0417a(AbstractC0417a abstractC0417a, Resources resources) {
            this.f2068c = null;
            this.f2069d = C0416d.f2059h;
            if (abstractC0417a != null) {
                this.f2066a = abstractC0417a.f2066a;
                this.f2067b = abstractC0417a.f2067b;
                this.f2068c = abstractC0417a.f2068c;
                this.f2069d = abstractC0417a.f2069d;
            }
        }

        /* renamed from: a */
        boolean m613a() {
            return this.f2067b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f2066a;
            Drawable.ConstantState constantState = this.f2067b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0416d(Drawable drawable) {
        this.f2063e = mo611d();
        mo616b(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0416d(AbstractC0417a abstractC0417a, Resources resources) {
        this.f2063e = abstractC0417a;
        m615e(resources);
    }

    /* renamed from: e */
    private void m615e(Resources resources) {
        Drawable.ConstantState constantState;
        AbstractC0417a abstractC0417a = this.f2063e;
        if (abstractC0417a == null || (constantState = abstractC0417a.f2067b) == null) {
            return;
        }
        mo616b(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m614f(int[] iArr) {
        if (mo612c()) {
            AbstractC0417a abstractC0417a = this.f2063e;
            ColorStateList colorStateList = abstractC0417a.f2068c;
            PorterDuff.Mode mode = abstractC0417a.f2069d;
            if (colorStateList == null || mode == null) {
                this.f2062d = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2062d || colorForState != this.f2060b || mode != this.f2061c) {
                    setColorFilter(colorForState, mode);
                    this.f2060b = colorForState;
                    this.f2061c = mode;
                    this.f2062d = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p011j.InterfaceC0415c
    /* renamed from: a */
    public final Drawable mo617a() {
        return this.f2065g;
    }

    @Override // p011j.InterfaceC0415c
    /* renamed from: b */
    public final void mo616b(Drawable drawable) {
        Drawable drawable2 = this.f2065g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2065g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            AbstractC0417a abstractC0417a = this.f2063e;
            if (abstractC0417a != null) {
                abstractC0417a.f2067b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    protected boolean mo612c() {
        return true;
    }

    /* renamed from: d */
    AbstractC0417a mo611d() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2065g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC0417a abstractC0417a = this.f2063e;
        return changingConfigurations | (abstractC0417a != null ? abstractC0417a.getChangingConfigurations() : 0) | this.f2065g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        AbstractC0417a abstractC0417a = this.f2063e;
        if (abstractC0417a == null || !abstractC0417a.m613a()) {
            return null;
        }
        this.f2063e.f2066a = getChangingConfigurations();
        return this.f2063e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2065g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2065g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2065g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2065g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2065g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2065g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2065g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2065g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2065g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        AbstractC0417a abstractC0417a;
        ColorStateList colorStateList = (!mo612c() || (abstractC0417a = this.f2063e) == null) ? null : abstractC0417a.f2068c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2065g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2065g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2064f && super.mutate() == this) {
            this.f2063e = mo611d();
            Drawable drawable = this.f2065g;
            if (drawable != null) {
                drawable.mutate();
            }
            AbstractC0417a abstractC0417a = this.f2063e;
            if (abstractC0417a != null) {
                Drawable drawable2 = this.f2065g;
                abstractC0417a.f2067b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2064f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2065g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f2065g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2065g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2065g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2065g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2065g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2065g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m614f(iArr) || this.f2065g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintList(ColorStateList colorStateList) {
        this.f2063e.f2068c = colorStateList;
        m614f(getState());
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2063e.f2069d = mode;
        m614f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2065g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}