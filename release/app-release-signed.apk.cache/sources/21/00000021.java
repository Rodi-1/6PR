package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.m */
/* loaded from: classes.dex */
public class C0024m {

    /* renamed from: a */
    private final InterfaceC0025a f46a;

    /* renamed from: b */
    private final C0026n f47b;

    /* renamed from: android.arch.lifecycle.m$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0025a {
        /* renamed from: a */
        <T extends AbstractC0023l> T mo2234a(Class<T> cls);
    }

    public C0024m(C0026n c0026n, InterfaceC0025a interfaceC0025a) {
        this.f46a = interfaceC0025a;
        this.f47b = c0026n;
    }

    /* renamed from: a */
    public <T extends AbstractC0023l> T m2354a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m2353b("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC0023l> T m2353b(String str, Class<T> cls) {
        T t = (T) this.f47b.m2351b(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f46a.mo2234a(cls);
        this.f47b.m2350c(str, t2);
        return t2;
    }
}