package p021t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.C0283k;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p008g.C0386a;

/* renamed from: t.b */
/* loaded from: classes.dex */
public final class C0580b {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2630a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0581a>> f2631b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2632c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t.b$a */
    /* loaded from: classes.dex */
    public static class C0581a {

        /* renamed from: a */
        final ColorStateList f2633a;

        /* renamed from: b */
        final Configuration f2634b;

        C0581a(ColorStateList colorStateList, Configuration configuration) {
            this.f2633a = colorStateList;
            this.f2634b = configuration;
        }
    }

    /* renamed from: a */
    private static void m101a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2632c) {
            WeakHashMap<Context, SparseArray<C0581a>> weakHashMap = f2631b;
            SparseArray<C0581a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0581a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m100b(Context context, int i) {
        C0581a c0581a;
        synchronized (f2632c) {
            SparseArray<C0581a> sparseArray = f2631b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0581a = sparseArray.get(i)) != null) {
                if (c0581a.f2634b.equals(context.getResources().getConfiguration())) {
                    return c0581a.f2633a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m99c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m100b = m100b(context, i);
        if (m100b != null) {
            return m100b;
        }
        ColorStateList m96f = m96f(context, i);
        if (m96f != null) {
            m101a(context, i, m96f);
            return m96f;
        }
        return C0386a.m735a(context, i);
    }

    /* renamed from: d */
    public static Drawable m98d(Context context, int i) {
        return C0283k.m1214n().m1212p(context, i);
    }

    /* renamed from: e */
    private static TypedValue m97e() {
        ThreadLocal<TypedValue> threadLocal = f2630a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: f */
    private static ColorStateList m96f(Context context, int i) {
        if (m95g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0579a.m106a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m95g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue m97e = m97e();
        resources.getValue(i, m97e, true);
        int i2 = m97e.type;
        return i2 >= 28 && i2 <= 31;
    }
}