package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    static final PorterDuff.Mode f1546h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f1547b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1548c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1549d;

    /* renamed from: e  reason: collision with root package name */
    a f1550e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1551f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1552g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f1553a;

        /* renamed from: b  reason: collision with root package name */
        Drawable.ConstantState f1554b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f1555c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f1556d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, Resources resources) {
            this.f1555c = null;
            this.f1556d = d.f1546h;
            if (aVar != null) {
                this.f1553a = aVar.f1553a;
                this.f1554b = aVar.f1554b;
                this.f1555c = aVar.f1555c;
                this.f1556d = aVar.f1556d;
            }
        }

        boolean a() {
            return this.f1554b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i2 = this.f1553a;
            Drawable.ConstantState constantState = this.f1554b;
            return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Drawable drawable) {
        this.f1550e = d();
        b(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, Resources resources) {
        this.f1550e = aVar;
        e(resources);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        a aVar = this.f1550e;
        if (aVar == null || (constantState = aVar.f1554b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (c()) {
            a aVar = this.f1550e;
            ColorStateList colorStateList = aVar.f1555c;
            PorterDuff.Mode mode = aVar.f1556d;
            if (colorStateList == null || mode == null) {
                this.f1549d = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f1549d || colorForState != this.f1547b || mode != this.f1548c) {
                    setColorFilter(colorForState, mode);
                    this.f1547b = colorForState;
                    this.f1548c = mode;
                    this.f1549d = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // j.c
    public final Drawable a() {
        return this.f1552g;
    }

    @Override // j.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f1552g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1552g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.f1550e;
            if (aVar != null) {
                aVar.f1554b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    a d() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f1552g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f1550e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f1552g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.f1550e;
        if (aVar == null || !aVar.a()) {
            return null;
        }
        this.f1550e.f1553a = getChangingConfigurations();
        return this.f1550e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1552g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1552g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1552g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f1552g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f1552g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1552g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f1552g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f1552g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f1552g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList colorStateList = (!c() || (aVar = this.f1550e) == null) ? null : aVar.f1555c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1552g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1552g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1551f && super.mutate() == this) {
            this.f1550e = d();
            Drawable drawable = this.f1552g;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f1550e;
            if (aVar != null) {
                Drawable drawable2 = this.f1552g;
                aVar.f1554b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1551f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1552g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f1552g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1552g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f1552g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1552g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1552g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1552g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f1552g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1550e.f1555c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1550e.f1556d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1552g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}