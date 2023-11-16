package p010i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p009h.C0388a;
import p014m.C0427b;
import p015n.C0462k;

/* renamed from: i.e */
/* loaded from: classes.dex */
class C0405e extends C0408h {

    /* renamed from: a */
    private static final Class f2042a;

    /* renamed from: b */
    private static final Constructor f2043b;

    /* renamed from: c */
    private static final Method f2044c;

    /* renamed from: d */
    private static final Method f2045d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f2043b = constructor;
        f2042a = cls;
        f2044c = method2;
        f2045d = method;
    }

    /* renamed from: h */
    private static boolean m671h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2044c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    private static Typeface m670i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2042a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2045d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public static boolean m669j() {
        Method method = f2044c;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: k */
    private static Object m668k() {
        try {
            return f2043b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: b */
    public Typeface mo652b(Context context, C0388a.C0390b c0390b, Resources resources, int i) {
        C0388a.C0391c[] m723a;
        Object m668k = m668k();
        for (C0388a.C0391c c0391c : c0390b.m723a()) {
            ByteBuffer m639b = C0412i.m639b(context, resources, c0391c.m721b());
            if (m639b == null || !m671h(m668k, m639b, c0391c.m720c(), c0391c.m718e(), c0391c.m717f())) {
                return null;
            }
        }
        return m670i(m668k);
    }

    @Override // p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: c */
    public Typeface mo651c(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i) {
        Object m668k = m668k();
        C0462k c0462k = new C0462k();
        for (C0427b.C0433f c0433f : c0433fArr) {
            Uri m581c = c0433f.m581c();
            ByteBuffer byteBuffer = (ByteBuffer) c0462k.get(m581c);
            if (byteBuffer == null) {
                byteBuffer = C0412i.m635f(context, cancellationSignal, m581c);
                c0462k.put(m581c, byteBuffer);
            }
            if (!m671h(m668k, byteBuffer, c0433f.m582b(), c0433f.m580d(), c0433f.m579e())) {
                return null;
            }
        }
        return Typeface.create(m670i(m668k), i);
    }
}