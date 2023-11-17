package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import f.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: b  reason: collision with root package name */
    protected int[] f92b;

    /* renamed from: c  reason: collision with root package name */
    protected int f93c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f94d;

    /* renamed from: e  reason: collision with root package name */
    protected j f95e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f96f;

    /* renamed from: g  reason: collision with root package name */
    private String f97g;

    public a(Context context) {
        super(context);
        this.f92b = new int[32];
        this.f96f = false;
        this.f94d = context;
        b(null);
    }

    private void a(String str) {
        int i2;
        Object c2;
        if (str == null || this.f94d == null) {
            return;
        }
        String trim = str.trim();
        try {
            i2 = d.b.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i2 = 0;
        }
        if (i2 == 0) {
            i2 = this.f94d.getResources().getIdentifier(trim, "id", this.f94d.getPackageName());
        }
        if (i2 == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
            i2 = ((Integer) c2).intValue();
        }
        if (i2 != 0) {
            setTag(i2, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c.f1314a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == d.c.f1323j) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f97g = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f97g);
        }
        j jVar = this.f95e;
        if (jVar == null) {
            return;
        }
        jVar.J0();
        for (int i2 = 0; i2 < this.f93c; i2++) {
            View e2 = constraintLayout.e(this.f92b[i2]);
            if (e2 != null) {
                this.f95e.I0(constraintLayout.f(e2));
            }
        }
    }

    public void f() {
        if (this.f95e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).l0 = this.f95e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f92b, this.f93c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f96f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f93c = 0;
        for (int i2 : iArr) {
            setTag(i2, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        int i3 = this.f93c + 1;
        int[] iArr = this.f92b;
        if (i3 > iArr.length) {
            this.f92b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f92b;
        int i4 = this.f93c;
        iArr2[i4] = i2;
        this.f93c = i4 + 1;
    }
}