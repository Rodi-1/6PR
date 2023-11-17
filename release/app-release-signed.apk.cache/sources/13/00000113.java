package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class a1 extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f959a;

    public a1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f959a = new WeakReference<>(context);
    }

    public static boolean a() {
        return r.d.n() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable b(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f959a.get();
        return context != null ? k.n().z(context, this, i2) : super.getDrawable(i2);
    }
}