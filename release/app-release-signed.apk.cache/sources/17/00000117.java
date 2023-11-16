package android.support.p002v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
/* loaded from: classes.dex */
class C0245c extends C0242b {
    public C0245c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1239a;
        if (actionBarContainer.f1033i) {
            drawable = actionBarContainer.f1032h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1030f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
}