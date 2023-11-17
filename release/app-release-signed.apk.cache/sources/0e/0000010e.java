package android.support.v7.widget;

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

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f941b;

    /* renamed from: c  reason: collision with root package name */
    private int f942c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f943d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutInflater f944e;

    /* renamed from: f  reason: collision with root package name */
    private a f945f;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f941b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.X2, i2, 0);
        this.f942c = obtainStyledAttributes.getResourceId(s.j.a3, -1);
        this.f941b = obtainStyledAttributes.getResourceId(s.j.Z2, 0);
        setId(obtainStyledAttributes.getResourceId(s.j.Y2, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f941b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f944e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f941b, viewGroup, false);
            int i2 = this.f942c;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f943d = new WeakReference<>(inflate);
            a aVar = this.f945f;
            if (aVar != null) {
                aVar.a(this, inflate);
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
        return this.f942c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f944e;
    }

    public int getLayoutResource() {
        return this.f941b;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f942c = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f944e = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f941b = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f945f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f943d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }
}