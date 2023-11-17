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

/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    private C0003b f140c;

    /* renamed from: d  reason: collision with root package name */
    private Context f141d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f142e;

    /* renamed from: f  reason: collision with root package name */
    private Animator.AnimatorListener f143f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Object> f144g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable.Callback f145h;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f147a;

        /* renamed from: b  reason: collision with root package name */
        h f148b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f149c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Animator> f150d;

        /* renamed from: e  reason: collision with root package name */
        n.a<Animator, String> f151e;

        public C0003b(Context context, C0003b c0003b, Drawable.Callback callback, Resources resources) {
            if (c0003b != null) {
                this.f147a = c0003b.f147a;
                h hVar = c0003b.f148b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f148b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = (h) this.f148b.mutate();
                    this.f148b = hVar2;
                    hVar2.setCallback(callback);
                    this.f148b.setBounds(c0003b.f148b.getBounds());
                    this.f148b.h(false);
                }
                ArrayList<Animator> arrayList = c0003b.f150d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f150d = new ArrayList<>(size);
                    this.f151e = new n.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0003b.f150d.get(i2);
                        Animator clone = animator.clone();
                        String str = c0003b.f151e.get(animator);
                        clone.setTarget(this.f148b.d(str));
                        this.f150d.add(clone);
                        this.f151e.put(clone, str);
                    }
                    c();
                }
            }
        }

        public void c() {
            if (this.f149c == null) {
                this.f149c = new AnimatorSet();
            }
            this.f149c.playTogether(this.f150d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f147a;
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

    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f152a;

        public c(Drawable.ConstantState constantState) {
            this.f152a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f152a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f152a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f152a.newDrawable();
            bVar.f157b = newDrawable;
            newDrawable.setCallback(bVar.f145h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f152a.newDrawable(resources);
            bVar.f157b = newDrawable;
            newDrawable.setCallback(bVar.f145h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f152a.newDrawable(resources, theme);
            bVar.f157b = newDrawable;
            newDrawable.setCallback(bVar.f145h);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0003b c0003b, Resources resources) {
        this.f142e = null;
        this.f143f = null;
        this.f144g = null;
        a aVar = new a();
        this.f145h = aVar;
        this.f141d = context;
        if (c0003b != null) {
            this.f140c = c0003b;
        } else {
            this.f140c = new C0003b(context, c0003b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f140c.f148b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        if (this.f140c.f150d == null) {
            this.f140c.f150d = new ArrayList();
            this.f140c.f151e = new n.a<>();
        }
        this.f140c.f150d.add(animator);
        this.f140c.f151e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f142e == null) {
                    this.f142e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f142e);
            }
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            return j.a.b(drawable);
        }
        return false;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f140c.f148b.draw(canvas);
        if (this.f140c.f149c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f157b;
        return drawable != null ? j.a.c(drawable) : this.f140c.f148b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f140c.f147a;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f157b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f157b.getConstantState());
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f140c.f148b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f140c.f148b.getIntrinsicWidth();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getOpacity() : this.f140c.f148b.getOpacity();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
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
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = h.c.h(resources, theme, attributeSet, android.support.graphics.drawable.a.f132e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b2 = h.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.f145h);
                        h hVar = this.f140c.f148b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f140c.f148b = b2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, android.support.graphics.drawable.a.f133f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f141d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f140c.c();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f157b;
        return drawable != null ? j.a.g(drawable) : this.f140c.f148b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f157b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f140c.f149c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.isStateful() : this.f140c.f148b.isStateful();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f140c.f148b.setBounds(rect);
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.setLevel(i2) : this.f140c.f148b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.setState(iArr) : this.f140c.f148b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f140c.f148b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.i(drawable, z);
        } else {
            this.f140c.f148b.setAutoMirrored(z);
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f140c.f148b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTint(int i2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.m(drawable, i2);
        } else {
            this.f140c.f148b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.n(drawable, colorStateList);
        } else {
            this.f140c.f148b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.o(drawable, mode);
        } else {
            this.f140c.f148b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f140c.f148b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f140c.f149c.isStarted()) {
        } else {
            this.f140c.f149c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f140c.f149c.end();
        }
    }
}