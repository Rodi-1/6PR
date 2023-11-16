package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p020s.C0569a;

/* renamed from: android.support.v7.widget.u */
/* loaded from: classes.dex */
public class C0313u extends RatingBar {

    /* renamed from: b */
    private final C0309s f1502b;

    public C0313u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.ratingBarStyle);
    }

    public C0313u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0309s c0309s = new C0309s(this);
        this.f1502b = c0309s;
        c0309s.mo1106c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m1133b = this.f1502b.m1133b();
        if (m1133b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1133b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}