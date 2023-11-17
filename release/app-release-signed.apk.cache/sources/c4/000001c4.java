package j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import j.d;

/* loaded from: classes.dex */
class e extends d {

    /* loaded from: classes.dex */
    private static class a extends d.a {
        a(d.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // j.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // j.d
    d.a d() {
        return new a(this.f1550e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1552g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f1552g.setAutoMirrored(z);
    }
}