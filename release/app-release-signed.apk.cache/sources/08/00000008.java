package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0009c;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f9a;

    /* renamed from: android.arch.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0005a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10a;

        static {
            int[] iArr = new int[AbstractC0009c.EnumC0010a.values().length];
            f10a = iArr;
            try {
                iArr[AbstractC0009c.EnumC0010a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10a[AbstractC0009c.EnumC0010a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: g */
    public void mo2383g(InterfaceC0013e interfaceC0013e, AbstractC0009c.EnumC0010a enumC0010a) {
        switch (C0005a.f10a[enumC0010a.ordinal()]) {
            case 1:
                this.f9a.m2396c(interfaceC0013e);
                return;
            case 2:
                this.f9a.m2397b(interfaceC0013e);
                return;
            case 3:
                this.f9a.m2393f(interfaceC0013e);
                return;
            case 4:
                this.f9a.m2395d(interfaceC0013e);
                return;
            case 5:
                this.f9a.m2394e(interfaceC0013e);
                return;
            case 6:
                this.f9a.m2398a(interfaceC0013e);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}