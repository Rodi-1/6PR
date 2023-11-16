package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.view.View;

/* renamed from: android.support.constraint.d */
/* loaded from: classes.dex */
public class C0036d extends View {
    public C0036d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0028a c0028a = (ConstraintLayout.C0028a) getLayoutParams();
        c0028a.f94a = i;
        setLayoutParams(c0028a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0028a c0028a = (ConstraintLayout.C0028a) getLayoutParams();
        c0028a.f96b = i;
        setLayoutParams(c0028a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0028a c0028a = (ConstraintLayout.C0028a) getLayoutParams();
        c0028a.f98c = f;
        setLayoutParams(c0028a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}