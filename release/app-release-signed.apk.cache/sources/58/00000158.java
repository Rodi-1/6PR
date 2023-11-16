package android.support.p002v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.s0 */
/* loaded from: classes.dex */
public class C0310s0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1492c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0310s0>> f1493d;

    /* renamed from: a */
    private final Resources f1494a;

    /* renamed from: b */
    private final Resources.Theme f1495b;

    private C0310s0(Context context) {
        super(context);
        if (!C0241a1.m1398a()) {
            this.f1494a = new C0314u0(this, context.getResources());
            this.f1495b = null;
            return;
        }
        C0241a1 c0241a1 = new C0241a1(this, context.getResources());
        this.f1494a = c0241a1;
        Resources.Theme newTheme = c0241a1.newTheme();
        this.f1495b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m1130a(Context context) {
        if ((context instanceof C0310s0) || (context.getResources() instanceof C0314u0) || (context.getResources() instanceof C0241a1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0241a1.m1398a();
    }

    /* renamed from: b */
    public static Context m1129b(Context context) {
        if (m1130a(context)) {
            synchronized (f1492c) {
                ArrayList<WeakReference<C0310s0>> arrayList = f1493d;
                if (arrayList == null) {
                    f1493d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<C0310s0> weakReference = f1493d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1493d.remove(size);
                        }
                    }
                    for (int size2 = f1493d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C0310s0> weakReference2 = f1493d.get(size2);
                        C0310s0 c0310s0 = weakReference2 != null ? weakReference2.get() : null;
                        if (c0310s0 != null && c0310s0.getBaseContext() == context) {
                            return c0310s0;
                        }
                    }
                }
                C0310s0 c0310s02 = new C0310s0(context);
                f1493d.add(new WeakReference<>(c0310s02));
                return c0310s02;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1494a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1494a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1495b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1495b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}