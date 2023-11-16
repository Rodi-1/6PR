package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p009h.C0397c;
import p011j.C0413a;
import p015n.C0445a;

/* renamed from: android.support.graphics.drawable.b */
/* loaded from: classes.dex */
public class C0039b extends AbstractC0049g implements Animatable {

    /* renamed from: c */
    private C0041b f246c;

    /* renamed from: d */
    private Context f247d;

    /* renamed from: e */
    private ArgbEvaluator f248e;

    /* renamed from: f */
    private Animator.AnimatorListener f249f;

    /* renamed from: g */
    private ArrayList<Object> f250g;

    /* renamed from: h */
    final Drawable.Callback f251h;

    /* renamed from: android.support.graphics.drawable.b$a */
    /* loaded from: classes.dex */
    class C0040a implements Drawable.Callback {
        C0040a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0039b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0039b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0039b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.b$b */
    /* loaded from: classes.dex */
    public static class C0041b extends Drawable.ConstantState {

        /* renamed from: a */
        int f253a;

        /* renamed from: b */
        C0050h f254b;

        /* renamed from: c */
        AnimatorSet f255c;

        /* renamed from: d */
        private ArrayList<Animator> f256d;

        /* renamed from: e */
        C0445a<Animator, String> f257e;

        public C0041b(Context context, C0041b c0041b, Drawable.Callback callback, Resources resources) {
            if (c0041b != null) {
                this.f253a = c0041b.f253a;
                C0050h c0050h = c0041b.f254b;
                if (c0050h != null) {
                    Drawable.ConstantState constantState = c0050h.getConstantState();
                    this.f254b = (C0050h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0050h c0050h2 = (C0050h) this.f254b.mutate();
                    this.f254b = c0050h2;
                    c0050h2.setCallback(callback);
                    this.f254b.setBounds(c0041b.f254b.getBounds());
                    this.f254b.m2270h(false);
                }
                ArrayList<Animator> arrayList = c0041b.f256d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f256d = new ArrayList<>(size);
                    this.f257e = new C0445a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0041b.f256d.get(i);
                        Animator clone = animator.clone();
                        String str = c0041b.f257e.get(animator);
                        clone.setTarget(this.f254b.m2274d(str));
                        this.f256d.add(clone);
                        this.f257e.put(clone, str);
                    }
                    m2305c();
                }
            }
        }

        /* renamed from: c */
        public void m2305c() {
            if (this.f255c == null) {
                this.f255c = new AnimatorSet();
            }
            this.f255c.playTogether(this.f256d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f253a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.graphics.drawable.b$c */
    /* loaded from: classes.dex */
    private static class C0042c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f258a;

        public C0042c(Drawable.ConstantState constantState) {
            this.f258a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f258a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f258a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0039b c0039b = new C0039b();
            Drawable newDrawable = this.f258a.newDrawable();
            c0039b.f263b = newDrawable;
            newDrawable.setCallback(c0039b.f251h);
            return c0039b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0039b c0039b = new C0039b();
            Drawable newDrawable = this.f258a.newDrawable(resources);
            c0039b.f263b = newDrawable;
            newDrawable.setCallback(c0039b.f251h);
            return c0039b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0039b c0039b = new C0039b();
            Drawable newDrawable = this.f258a.newDrawable(resources, theme);
            c0039b.f263b = newDrawable;
            newDrawable.setCallback(c0039b.f251h);
            return c0039b;
        }
    }

    C0039b() {
        this(null, null, null);
    }

    private C0039b(Context context) {
        this(context, null, null);
    }

    private C0039b(Context context, C0041b c0041b, Resources resources) {
        this.f248e = null;
        this.f249f = null;
        this.f250g = null;
        C0040a c0040a = new C0040a();
        this.f251h = c0040a;
        this.f247d = context;
        if (c0041b != null) {
            this.f246c = c0041b;
        } else {
            this.f246c = new C0041b(context, c0041b, c0040a, resources);
        }
    }

    /* renamed from: a */
    public static C0039b m2310a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0039b c0039b = new C0039b(context);
        c0039b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0039b;
    }

    /* renamed from: b */
    private void m2309b(String str, Animator animator) {
        animator.setTarget(this.f246c.f254b.m2274d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m2308c(animator);
        }
        if (this.f246c.f256d == null) {
            this.f246c.f256d = new ArrayList();
            this.f246c.f257e = new C0445a<>();
        }
        this.f246c.f256d.add(animator);
        this.f246c.f257e.put(animator, str);
    }

    /* renamed from: c */
    private void m2308c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m2308c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f248e == null) {
                    this.f248e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f248e);
            }
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m633a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            return C0413a.m632b(drawable);
        }
        return false;
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f246c.f254b.draw(canvas);
        if (this.f246c.f255c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f263b;
        return drawable != null ? C0413a.m631c(drawable) : this.f246c.f254b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f246c.f253a;
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f263b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0042c(this.f263b.getConstantState());
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f246c.f254b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f246c.f254b.getIntrinsicWidth();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getOpacity() : this.f246c.f254b.getOpacity();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m628f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0397c.m698h(resources, theme, attributeSet, C0038a.f238e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0050h m2276b = C0050h.m2276b(resources, resourceId, theme);
                        m2276b.m2270h(false);
                        m2276b.setCallback(this.f251h);
                        C0050h c0050h = this.f246c.f254b;
                        if (c0050h != null) {
                            c0050h.setCallback(null);
                        }
                        this.f246c.f254b = m2276b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0038a.f239f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f247d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m2309b(string, C0044d.m2294i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f246c.m2305c();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f263b;
        return drawable != null ? C0413a.m627g(drawable) : this.f246c.f254b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f263b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f246c.f255c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.isStateful() : this.f246c.f254b.isStateful();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f246c.f254b.setBounds(rect);
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.setLevel(i) : this.f246c.f254b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.setState(iArr) : this.f246c.f254b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f246c.f254b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m625i(drawable, z);
        } else {
            this.f246c.f254b.setAutoMirrored(z);
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f246c.f254b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTint(int i) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m621m(drawable, i);
        } else {
            this.f246c.f254b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m620n(drawable, colorStateList);
        } else {
            this.f246c.f254b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m619o(drawable, mode);
        } else {
            this.f246c.f254b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f246c.f254b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f246c.f255c.isStarted()) {
        } else {
            this.f246c.f255c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f246c.f255c.end();
        }
    }
}