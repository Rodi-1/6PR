package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class u0 extends m0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1195b;

    public u0(Context context, Resources resources) {
        super(resources);
        this.f1195b = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.m0, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f1195b.get();
        if (drawable != null && context != null) {
            k.n();
            k.D(context, i2, drawable);
        }
        return drawable;
    }
}