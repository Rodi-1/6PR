package i;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import h.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import m.b;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: a  reason: collision with root package name */
    protected final Class f1533a;

    /* renamed from: b  reason: collision with root package name */
    protected final Constructor f1534b;

    /* renamed from: c  reason: collision with root package name */
    protected final Method f1535c;

    /* renamed from: d  reason: collision with root package name */
    protected final Method f1536d;

    /* renamed from: e  reason: collision with root package name */
    protected final Method f1537e;

    /* renamed from: f  reason: collision with root package name */
    protected final Method f1538f;

    /* renamed from: g  reason: collision with root package name */
    protected final Method f1539g;

    public f() {
        Method method;
        Constructor constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class t2 = t();
            constructor = u(t2);
            method2 = q(t2);
            method3 = r(t2);
            method4 = v(t2);
            method5 = p(t2);
            method = s(t2);
            cls = t2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1533a = cls;
        this.f1534b = constructor;
        this.f1535c = method2;
        this.f1536d = method3;
        this.f1537e = method4;
        this.f1538f = method5;
        this.f1539g = method;
    }

    private void i(Object obj) {
        try {
            this.f1538f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean j(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1535c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f1536d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean m(Object obj) {
        try {
            return ((Boolean) this.f1537e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean n() {
        if (this.f1535c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1535c != null;
    }

    private Object o() {
        try {
            return this.f1534b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // i.h, i.c.a
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (n()) {
            Object o2 = o();
            if (!j(context, o2, str, 0, -1, -1, null)) {
                i(o2);
                return null;
            } else if (m(o2)) {
                return l(o2);
            } else {
                return null;
            }
        }
        return super.a(context, resources, i2, str, i3);
    }

    @Override // i.h, i.c.a
    public Typeface b(Context context, a.b bVar, Resources resources, int i2) {
        a.c[] a2;
        if (n()) {
            Object o2 = o();
            for (a.c cVar : bVar.a()) {
                if (!j(context, o2, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                    i(o2);
                    return null;
                }
            }
            if (m(o2)) {
                return l(o2);
            }
            return null;
        }
        return super.b(context, bVar, resources, i2);
    }

    @Override // i.d, i.h, i.c.a
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (!n()) {
            b.f g2 = g(fVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g2.c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g2.d()).setItalic(g2.e()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m2 = m.b.m(context, fVarArr, cancellationSignal);
        Object o2 = o();
        boolean z = false;
        for (b.f fVar : fVarArr) {
            ByteBuffer byteBuffer = m2.get(fVar.c());
            if (byteBuffer != null) {
                if (!k(o2, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                    i(o2);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            i(o2);
            return null;
        } else if (m(o2)) {
            return Typeface.create(l(o2), i2);
        } else {
            return null;
        }
    }

    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1533a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1539g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected Method p(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method s(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class t() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor u(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method v(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}