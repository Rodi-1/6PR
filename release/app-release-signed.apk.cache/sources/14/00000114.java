package android.support.p002v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
/* loaded from: classes.dex */
class C0242b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1239a;

    public C0242b(ActionBarContainer actionBarContainer) {
        this.f1239a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1239a;
        if (actionBarContainer.f1033i) {
            Drawable drawable = actionBarContainer.f1032h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1030f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1239a;
        Drawable drawable3 = actionBarContainer2.f1031g;
        if (drawable3 == null || !actionBarContainer2.f1034j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}