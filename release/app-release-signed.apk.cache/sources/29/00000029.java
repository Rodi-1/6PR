package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p005d.C0348b;
import p005d.C0349c;
import p007f.C0377j;

/* renamed from: android.support.constraint.a */
/* loaded from: classes.dex */
public abstract class AbstractC0030a extends View {

    /* renamed from: b */
    protected int[] f134b;

    /* renamed from: c */
    protected int f135c;

    /* renamed from: d */
    protected Context f136d;

    /* renamed from: e */
    protected C0377j f137e;

    /* renamed from: f */
    protected boolean f138f;

    /* renamed from: g */
    private String f139g;

    public AbstractC0030a(Context context) {
        super(context);
        this.f134b = new int[32];
        this.f138f = false;
        this.f136d = context;
        mo1001b(null);
    }

    /* renamed from: a */
    private void m2333a(String str) {
        int i;
        Object m2347c;
        if (str == null || this.f136d == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = C0348b.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            i = this.f136d.getResources().getIdentifier(trim, "id", this.f136d.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (m2347c = ((ConstraintLayout) getParent()).m2347c(0, trim)) != null && (m2347c instanceof Integer)) {
            i = ((Integer) m2347c).intValue();
        }
        if (i != 0) {
            setTag(i, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m2333a(str.substring(i));
                return;
            } else {
                m2333a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1001b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0349c.f1685a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0349c.f1712j) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f139g = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void m2332c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void m2331d(ConstraintLayout constraintLayout) {
    }

    /* renamed from: e */
    public void m2330e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f139g);
        }
        C0377j c0377j = this.f137e;
        if (c0377j == null) {
            return;
        }
        c0377j.m773J0();
        for (int i = 0; i < this.f135c; i++) {
            View m2345e = constraintLayout.m2345e(this.f134b[i]);
            if (m2345e != null) {
                this.f137e.m774I0(constraintLayout.m2344f(m2345e));
            }
        }
    }

    /* renamed from: f */
    public void m2329f() {
        if (this.f137e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0028a) {
            ((ConstraintLayout.C0028a) layoutParams).f117l0 = this.f137e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f134b, this.f135c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f138f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f135c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f135c + 1;
        int[] iArr = this.f134b;
        if (i2 > iArr.length) {
            this.f134b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f134b;
        int i3 = this.f135c;
        iArr2[i3] = i;
        this.f135c = i3 + 1;
    }
}