package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.view.View;

/* loaded from: classes.dex */
public class e extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f125b;

    /* renamed from: c  reason: collision with root package name */
    private View f126c;

    /* renamed from: d  reason: collision with root package name */
    private int f127d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f126c == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f126c.getLayoutParams();
        aVar2.l0.x0(0);
        aVar.l0.y0(aVar2.l0.D());
        aVar.l0.b0(aVar2.l0.r());
        aVar2.l0.x0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f125b == -1 && !isInEditMode()) {
            setVisibility(this.f127d);
        }
        View findViewById = constraintLayout.findViewById(this.f125b);
        this.f126c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.a) findViewById.getLayoutParams()).a0 = true;
            this.f126c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f126c;
    }

    public int getEmptyVisibility() {
        return this.f127d;
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

    public void setContentId(int i2) {
        View findViewById;
        if (this.f125b == i2) {
            return;
        }
        View view = this.f126c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f126c.getLayoutParams()).a0 = false;
            this.f126c = null;
        }
        this.f125b = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f127d = i2;
    }
}