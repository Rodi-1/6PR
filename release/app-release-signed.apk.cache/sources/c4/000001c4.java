package p011j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p011j.C0416d;

/* renamed from: j.e */
/* loaded from: classes.dex */
class C0418e extends C0416d {

    /* renamed from: j.e$a */
    /* loaded from: classes.dex */
    private static class C0419a extends C0416d.AbstractC0417a {
        C0419a(C0416d.AbstractC0417a abstractC0417a, Resources resources) {
            super(abstractC0417a, resources);
        }

        @Override // p011j.C0416d.AbstractC0417a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0418e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0418e(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0418e(C0416d.AbstractC0417a abstractC0417a, Resources resources) {
        super(abstractC0417a, resources);
    }

    @Override // p011j.C0416d
    /* renamed from: d */
    C0416d.AbstractC0417a mo611d() {
        return new C0419a(this.f2063e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2065g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2065g.setAutoMirrored(z);
    }
}