package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final C0009a f946b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f947c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuView f948d;

    /* renamed from: e  reason: collision with root package name */
    protected d f949e;

    /* renamed from: f  reason: collision with root package name */
    protected int f950f;

    /* renamed from: g  reason: collision with root package name */
    protected o.s f951g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f952h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f953i;

    /* renamed from: android.support.v7.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0009a implements o.t {

        /* renamed from: a  reason: collision with root package name */
        private boolean f954a = false;

        /* renamed from: b  reason: collision with root package name */
        int f955b;

        protected C0009a() {
        }

        @Override // o.t
        public void a(View view) {
            if (this.f954a) {
                return;
            }
            a aVar = a.this;
            aVar.f951g = null;
            a.super.setVisibility(this.f955b);
        }

        @Override // o.t
        public void b(View view) {
            a.super.setVisibility(0);
            this.f954a = false;
        }

        @Override // o.t
        public void c(View view) {
            this.f954a = true;
        }

        public C0009a d(o.s sVar, int i2) {
            a.this.f951g = sVar;
            this.f955b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f946b = new C0009a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(s.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f947c = context;
        } else {
            this.f947c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public o.s f(int i2, long j2) {
        o.s a2;
        o.s sVar = this.f951g;
        if (sVar != null) {
            sVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a2 = o.o.a(this).a(1.0f);
        } else {
            a2 = o.o.a(this).a(0.0f);
        }
        a2.d(j2);
        a2.f(this.f946b.d(a2, i2));
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f951g != null ? this.f946b.f955b : getVisibility();
    }

    public int getContentHeight() {
        return this.f950f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, s.j.f1864a, s.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(s.j.f1873j, 0));
        obtainStyledAttributes.recycle();
        d dVar = this.f949e;
        if (dVar != null) {
            dVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f953i = false;
        }
        if (!this.f953i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f953i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f953i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f952h = false;
        }
        if (!this.f952h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f952h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f952h = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f950f = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            o.s sVar = this.f951g;
            if (sVar != null) {
                sVar.b();
            }
            super.setVisibility(i2);
        }
    }
}