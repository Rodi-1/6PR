package p010i;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p009h.C0388a;
import p014m.C0427b;

/* renamed from: i.f */
/* loaded from: classes.dex */
public class C0406f extends C0404d {

    /* renamed from: a */
    protected final Class f2046a;

    /* renamed from: b */
    protected final Constructor f2047b;

    /* renamed from: c */
    protected final Method f2048c;

    /* renamed from: d */
    protected final Method f2049d;

    /* renamed from: e */
    protected final Method f2050e;

    /* renamed from: f */
    protected final Method f2051f;

    /* renamed from: g */
    protected final Method f2052g;

    public C0406f() {
        Method method;
        Constructor constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class m658t = m658t();
            constructor = m657u(m658t);
            method2 = m660q(m658t);
            method3 = m659r(m658t);
            method4 = m656v(m658t);
            method5 = m661p(m658t);
            method = mo654s(m658t);
            cls = m658t;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2046a = cls;
        this.f2047b = constructor;
        this.f2048c = method2;
        this.f2049d = method3;
        this.f2050e = method4;
        this.f2051f = method5;
        this.f2052g = method;
    }

    /* renamed from: i */
    private void m667i(Object obj) {
        try {
            this.f2051f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    private boolean m666j(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2048c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    private boolean m665k(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2049d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private boolean m664m(Object obj) {
        try {
            return ((Boolean) this.f2050e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    private boolean m663n() {
        if (this.f2048c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2048c != null;
    }

    /* renamed from: o */
    private Object m662o() {
        try {
            return this.f2047b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: a */
    public Typeface mo653a(Context context, Resources resources, int i, String str, int i2) {
        if (m663n()) {
            Object m662o = m662o();
            if (!m666j(context, m662o, str, 0, -1, -1, null)) {
                m667i(m662o);
                return null;
            } else if (m664m(m662o)) {
                return mo655l(m662o);
            } else {
                return null;
            }
        }
        return super.mo653a(context, resources, i, str, i2);
    }

    @Override // p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: b */
    public Typeface mo652b(Context context, C0388a.C0390b c0390b, Resources resources, int i) {
        C0388a.C0391c[] m723a;
        if (m663n()) {
            Object m662o = m662o();
            for (C0388a.C0391c c0391c : c0390b.m723a()) {
                if (!m666j(context, m662o, c0391c.m722a(), c0391c.m720c(), c0391c.m718e(), c0391c.m717f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0391c.m719d()))) {
                    m667i(m662o);
                    return null;
                }
            }
            if (m664m(m662o)) {
                return mo655l(m662o);
            }
            return null;
        }
        return super.mo652b(context, c0390b, resources, i);
    }

    @Override // p010i.C0404d, p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: c */
    public Typeface mo651c(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i) {
        if (c0433fArr.length < 1) {
            return null;
        }
        if (!m663n()) {
            C0427b.C0433f m647g = m647g(c0433fArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m647g.m581c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m647g.m580d()).setItalic(m647g.m579e()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m590m = C0427b.m590m(context, c0433fArr, cancellationSignal);
        Object m662o = m662o();
        boolean z = false;
        for (C0427b.C0433f c0433f : c0433fArr) {
            ByteBuffer byteBuffer = m590m.get(c0433f.m581c());
            if (byteBuffer != null) {
                if (!m665k(m662o, byteBuffer, c0433f.m582b(), c0433f.m580d(), c0433f.m579e() ? 1 : 0)) {
                    m667i(m662o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m667i(m662o);
            return null;
        } else if (m664m(m662o)) {
            return Typeface.create(mo655l(m662o), i);
        } else {
            return null;
        }
    }

    /* renamed from: l */
    protected Typeface mo655l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2046a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2052g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: p */
    protected Method m661p(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: q */
    protected Method m660q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: r */
    protected Method m659r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: s */
    protected Method mo654s(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: t */
    protected Class m658t() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: u */
    protected Constructor m657u(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: v */
    protected Method m656v(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}