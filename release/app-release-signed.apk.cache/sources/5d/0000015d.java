package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class v extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    private final w f1196b;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.seekBarStyle);
    }

    public v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w wVar = new w(this);
        this.f1196b = wVar;
        wVar.c(attributeSet, i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1196b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1196b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1196b.g(canvas);
    }
}