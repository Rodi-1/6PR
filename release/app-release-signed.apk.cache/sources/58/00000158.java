package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class s0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1184c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<s0>> f1185d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1186a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1187b;

    private s0(Context context) {
        super(context);
        if (!a1.a()) {
            this.f1186a = new u0(this, context.getResources());
            this.f1187b = null;
            return;
        }
        a1 a1Var = new a1(this, context.getResources());
        this.f1186a = a1Var;
        Resources.Theme newTheme = a1Var.newTheme();
        this.f1187b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof s0) || (context.getResources() instanceof u0) || (context.getResources() instanceof a1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || a1.a();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1184c) {
                ArrayList<WeakReference<s0>> arrayList = f1185d;
                if (arrayList == null) {
                    f1185d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<s0> weakReference = f1185d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1185d.remove(size);
                        }
                    }
                    for (int size2 = f1185d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<s0> weakReference2 = f1185d.get(size2);
                        s0 s0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (s0Var != null && s0Var.getBaseContext() == context) {
                            return s0Var;
                        }
                    }
                }
                s0 s0Var2 = new s0(context);
                f1185d.add(new WeakReference<>(s0Var2));
                return s0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1186a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1186a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1187b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f1187b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}