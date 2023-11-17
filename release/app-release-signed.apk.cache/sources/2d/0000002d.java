package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    b f124b;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public float n0;
        public boolean o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.n0 = 1.0f;
            this.o0 = false;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f2;
            this.n0 = 1.0f;
            this.o0 = false;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.c.j0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == d.c.t0) {
                    this.n0 = obtainStyledAttributes.getFloat(index, this.n0);
                } else if (index == d.c.G0) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                    this.o0 = true;
                } else if (index == d.c.B0) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == d.c.C0) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == d.c.A0) {
                    this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                } else if (index == d.c.y0) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == d.c.z0) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == d.c.u0) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == d.c.v0) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else {
                    if (index == d.c.w0) {
                        f2 = this.x0;
                    } else if (index == d.c.x0) {
                        this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                    } else if (index == d.c.F0) {
                        f2 = this.z0;
                    }
                    this.x0 = obtainStyledAttributes.getFloat(index, f2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f124b == null) {
            this.f124b = new b();
        }
        this.f124b.b(this);
        return this.f124b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}