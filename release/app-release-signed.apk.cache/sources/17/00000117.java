package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class c extends b {
    public c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f960a;
        if (actionBarContainer.f819i) {
            drawable = actionBarContainer.f818h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f816f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
}