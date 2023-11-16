package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.u0 */
/* loaded from: classes.dex */
class C0314u0 extends C0293m0 {

    /* renamed from: b */
    private final WeakReference<Context> f1503b;

    public C0314u0(Context context, Resources resources) {
        super(resources);
        this.f1503b = new WeakReference<>(context);
    }

    @Override // android.support.p002v7.widget.C0293m0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1503b.get();
        if (drawable != null && context != null) {
            C0283k.m1214n();
            C0283k.m1228D(context, i, drawable);
        }
        return drawable;
    }
}