package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import p019r.AbstractC0531d;

/* renamed from: android.support.v7.widget.a1 */
/* loaded from: classes.dex */
public class C0241a1 extends Resources {

    /* renamed from: a */
    private final WeakReference<Context> f1238a;

    public C0241a1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1238a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1398a() {
        return AbstractC0531d.m272n() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Drawable m1397b(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f1238a.get();
        return context != null ? C0283k.m1214n().m1202z(context, this, i) : super.getDrawable(i);
    }
}