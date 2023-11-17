package android.arch.lifecycle;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final a f46a;

    /* renamed from: b  reason: collision with root package name */
    private final n f47b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends l> T a(Class<T> cls);
    }

    public m(n nVar, a aVar) {
        this.f46a = aVar;
        this.f47b = nVar;
    }

    public <T extends l> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends l> T b(String str, Class<T> cls) {
        T t2 = (T) this.f47b.b(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        T t3 = (T) this.f46a.a(cls);
        this.f47b.c(str, t3);
        return t3;
    }
}