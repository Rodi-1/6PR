package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p020s.C0569a;

/* renamed from: android.support.v7.widget.v */
/* loaded from: classes.dex */
public class C0315v extends SeekBar {

    /* renamed from: b */
    private final C0317w f1504b;

    public C0315v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.seekBarStyle);
    }

    public C0315v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0317w c0317w = new C0317w(this);
        this.f1504b = c0317w;
        c0317w.mo1106c(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1504b.m1103h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1504b.m1102i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1504b.m1104g(canvas);
    }
}