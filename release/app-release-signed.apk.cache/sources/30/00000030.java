package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.view.View;

/* renamed from: android.support.constraint.e */
/* loaded from: classes.dex */
public class C0037e extends View {

    /* renamed from: b */
    private int f231b;

    /* renamed from: c */
    private View f232c;

    /* renamed from: d */
    private int f233d;

    /* renamed from: a */
    public void m2312a(ConstraintLayout constraintLayout) {
        if (this.f232c == null) {
            return;
        }
        ConstraintLayout.C0028a c0028a = (ConstraintLayout.C0028a) getLayoutParams();
        ConstraintLayout.C0028a c0028a2 = (ConstraintLayout.C0028a) this.f232c.getLayoutParams();
        c0028a2.f117l0.m816x0(0);
        c0028a.f117l0.m814y0(c0028a2.f117l0.m881D());
        c0028a.f117l0.m855b0(c0028a2.f117l0.m829r());
        c0028a2.f117l0.m816x0(8);
    }

    /* renamed from: b */
    public void m2311b(ConstraintLayout constraintLayout) {
        if (this.f231b == -1 && !isInEditMode()) {
            setVisibility(this.f233d);
        }
        View findViewById = constraintLayout.findViewById(this.f231b);
        this.f232c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0028a) findViewById.getLayoutParams()).f95a0 = true;
            this.f232c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f232c;
    }

    public int getEmptyVisibility() {
        return this.f233d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f231b == i) {
            return;
        }
        View view = this.f232c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0028a) this.f232c.getLayoutParams()).f95a0 = false;
            this.f232c = null;
        }
        this.f231b = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f233d = i;
    }
}