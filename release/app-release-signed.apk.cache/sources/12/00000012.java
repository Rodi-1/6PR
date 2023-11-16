package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.c */
/* loaded from: classes.dex */
public abstract class AbstractC0009c {

    /* renamed from: android.arch.lifecycle.c$a */
    /* loaded from: classes.dex */
    public enum EnumC0010a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.c$b */
    /* loaded from: classes.dex */
    public enum EnumC0011b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m2380a(EnumC0011b enumC0011b) {
            return compareTo(enumC0011b) >= 0;
        }
    }

    /* renamed from: a */
    public abstract EnumC0011b mo2379a();

    /* renamed from: b */
    public abstract void mo2378b(InterfaceC0012d interfaceC0012d);
}