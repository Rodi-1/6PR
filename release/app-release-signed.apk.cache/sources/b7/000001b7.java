package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import h.a;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import m.b;
import n.k;

/* loaded from: classes.dex */
class e extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f1529a;

    /* renamed from: b  reason: collision with root package name */
    private static final Constructor f1530b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f1531c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f1532d;

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
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f1530b = constructor;
        f1529a = cls;
        f1531c = method2;
        f1532d = method;
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f1531c.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1529a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1532d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean j() {
        Method method = f1531c;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f1530b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // i.h, i.c.a
    public Typeface b(Context context, a.b bVar, Resources resources, int i2) {
        a.c[] a2;
        Object k2 = k();
        for (a.c cVar : bVar.a()) {
            ByteBuffer b2 = i.b(context, resources, cVar.b());
            if (b2 == null || !h(k2, b2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return i(k2);
    }

    @Override // i.h, i.c.a
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        Object k2 = k();
        k kVar = new k();
        for (b.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) kVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = i.f(context, cancellationSignal, c2);
                kVar.put(c2, byteBuffer);
            }
            if (!h(k2, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        return Typeface.create(i(k2), i2);
    }
}