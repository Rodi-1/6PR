package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final FullLifecycleObserver f9a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10a;

        static {
            int[] iArr = new int[c.a.values().length];
            f10a = iArr;
            try {
                iArr[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10a[c.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10a[c.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10a[c.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void g(e eVar, c.a aVar) {
        switch (a.f10a[aVar.ordinal()]) {
            case 1:
                this.f9a.c(eVar);
                return;
            case 2:
                this.f9a.b(eVar);
                return;
            case 3:
                this.f9a.f(eVar);
                return;
            case 4:
                this.f9a.d(eVar);
                return;
            case 5:
                this.f9a.e(eVar);
                return;
            case 6:
                this.f9a.a(eVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}