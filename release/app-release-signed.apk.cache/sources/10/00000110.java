package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p016o.C0490o;
import p016o.C0511s;
import p016o.InterfaceC0514t;
import p020s.C0569a;
import p020s.C0578j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0238a extends ViewGroup {

    /* renamed from: b */
    protected final C0239a f1225b;

    /* renamed from: c */
    protected final Context f1226c;

    /* renamed from: d */
    protected ActionMenuView f1227d;

    /* renamed from: e */
    protected C0248d f1228e;

    /* renamed from: f */
    protected int f1229f;

    /* renamed from: g */
    protected C0511s f1230g;

    /* renamed from: h */
    private boolean f1231h;

    /* renamed from: i */
    private boolean f1232i;

    /* renamed from: android.support.v7.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0239a implements InterfaceC0514t {

        /* renamed from: a */
        private boolean f1233a = false;

        /* renamed from: b */
        int f1234b;

        protected C0239a() {
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            if (this.f1233a) {
                return;
            }
            AbstractC0238a abstractC0238a = AbstractC0238a.this;
            abstractC0238a.f1230g = null;
            AbstractC0238a.super.setVisibility(this.f1234b);
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: b */
        public void mo32b(View view) {
            AbstractC0238a.super.setVisibility(0);
            this.f1233a = false;
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: c */
        public void mo333c(View view) {
            this.f1233a = true;
        }

        /* renamed from: d */
        public C0239a m1399d(C0511s c0511s, int i) {
            AbstractC0238a.this.f1230g = c0511s;
            this.f1234b = i;
            return this;
        }
    }

    AbstractC0238a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0238a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1225b = new C0239a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0569a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1226c = context;
        } else {
            this.f1226c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m1402d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m1403c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m1401e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0511s mo1400f(int i, long j) {
        C0511s m344a;
        C0511s c0511s = this.f1230g;
        if (c0511s != null) {
            c0511s.m343b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            m344a = C0490o.m411a(this).m344a(1.0f);
        } else {
            m344a = C0490o.m411a(this).m344a(0.0f);
        }
        m344a.m341d(j);
        m344a.m339f(this.f1225b.m1399d(m344a, i));
        return m344a;
    }

    public int getAnimatedVisibility() {
        return this.f1230g != null ? this.f1225b.f1234b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1229f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0578j.f2525a, C0569a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0578j.f2562j, 0));
        obtainStyledAttributes.recycle();
        C0248d c0248d = this.f1228e;
        if (c0248d != null) {
            c0248d.m1353E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1232i = false;
        }
        if (!this.f1232i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1232i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1232i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1231h = false;
        }
        if (!this.f1231h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1231h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1231h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1229f = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0511s c0511s = this.f1230g;
            if (c0511s != null) {
                c0511s.m343b();
            }
            super.setVisibility(i);
        }
    }
}