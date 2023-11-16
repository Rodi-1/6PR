package android.support.p002v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p020s.C0578j;

/* renamed from: android.support.v7.widget.ViewStubCompat */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    private int f1220b;

    /* renamed from: c */
    private int f1221c;

    /* renamed from: d */
    private WeakReference<View> f1222d;

    /* renamed from: e */
    private LayoutInflater f1223e;

    /* renamed from: f */
    private InterfaceC0237a f1224f;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0237a {
        /* renamed from: a */
        void m1406a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1220b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2516X2, i, 0);
        this.f1221c = obtainStyledAttributes.getResourceId(C0578j.f2529a3, -1);
        this.f1220b = obtainStyledAttributes.getResourceId(C0578j.f2524Z2, 0);
        setId(obtainStyledAttributes.getResourceId(C0578j.f2520Y2, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1407a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1220b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1223e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1220b, viewGroup, false);
            int i = this.f1221c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1222d = new WeakReference<>(inflate);
            InterfaceC0237a interfaceC0237a = this.f1224f;
            if (interfaceC0237a != null) {
                interfaceC0237a.m1406a(this, inflate);
            }
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1221c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1223e;
    }

    public int getLayoutResource() {
        return this.f1220b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1221c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1223e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1220b = i;
    }

    public void setOnInflateListener(InterfaceC0237a interfaceC0237a) {
        this.f1224f = interfaceC0237a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1222d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m1407a();
        }
    }
}