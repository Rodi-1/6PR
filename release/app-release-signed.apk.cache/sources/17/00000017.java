package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0009c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p003b.C0336a;
import p003b.C0337b;

/* renamed from: android.arch.lifecycle.f */
/* loaded from: classes.dex */
public class C0014f extends AbstractC0009c {

    /* renamed from: c */
    private final WeakReference<InterfaceC0013e> f35c;

    /* renamed from: a */
    private C0336a<InterfaceC0012d, C0016b> f33a = new C0336a<>();

    /* renamed from: d */
    private int f36d = 0;

    /* renamed from: e */
    private boolean f37e = false;

    /* renamed from: f */
    private boolean f38f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0009c.EnumC0011b> f39g = new ArrayList<>();

    /* renamed from: b */
    private AbstractC0009c.EnumC0011b f34b = AbstractC0009c.EnumC0011b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0015a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40a;

        /* renamed from: b */
        static final /* synthetic */ int[] f41b;

        static {
            int[] iArr = new int[AbstractC0009c.EnumC0011b.values().length];
            f41b = iArr;
            try {
                iArr[AbstractC0009c.EnumC0011b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41b[AbstractC0009c.EnumC0011b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41b[AbstractC0009c.EnumC0011b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41b[AbstractC0009c.EnumC0011b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41b[AbstractC0009c.EnumC0011b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[AbstractC0009c.EnumC0010a.values().length];
            f40a = iArr2;
            try {
                iArr2[AbstractC0009c.EnumC0010a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40a[AbstractC0009c.EnumC0010a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.f$b */
    /* loaded from: classes.dex */
    public static class C0016b {

        /* renamed from: a */
        AbstractC0009c.EnumC0011b f42a;

        /* renamed from: b */
        GenericLifecycleObserver f43b;

        /* renamed from: a */
        void m2364a(InterfaceC0013e interfaceC0013e, AbstractC0009c.EnumC0010a enumC0010a) {
            AbstractC0009c.EnumC0011b m2374f = C0014f.m2374f(enumC0010a);
            this.f42a = C0014f.m2370j(this.f42a, m2374f);
            this.f43b.mo2383g(interfaceC0013e, enumC0010a);
            this.f42a = m2374f;
        }
    }

    public C0014f(InterfaceC0013e interfaceC0013e) {
        this.f35c = new WeakReference<>(interfaceC0013e);
    }

    /* renamed from: c */
    private void m2377c(InterfaceC0013e interfaceC0013e) {
        Iterator<Map.Entry<InterfaceC0012d, C0016b>> m1013b = this.f33a.m1013b();
        while (m1013b.hasNext() && !this.f38f) {
            Map.Entry<InterfaceC0012d, C0016b> next = m1013b.next();
            C0016b value = next.getValue();
            while (value.f42a.compareTo(this.f34b) > 0 && !this.f38f && this.f33a.contains(next.getKey())) {
                AbstractC0009c.EnumC0010a m2376d = m2376d(value.f42a);
                m2367m(m2374f(m2376d));
                value.m2364a(interfaceC0013e, m2376d);
                m2368l();
            }
        }
    }

    /* renamed from: d */
    private static AbstractC0009c.EnumC0010a m2376d(AbstractC0009c.EnumC0011b enumC0011b) {
        int i = C0015a.f41b[enumC0011b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Unexpected state value " + enumC0011b);
                        }
                        throw new IllegalArgumentException();
                    }
                    return AbstractC0009c.EnumC0010a.ON_PAUSE;
                }
                return AbstractC0009c.EnumC0010a.ON_STOP;
            }
            return AbstractC0009c.EnumC0010a.ON_DESTROY;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m2375e(InterfaceC0013e interfaceC0013e) {
        C0337b<InterfaceC0012d, C0016b>.C0342e m1010e = this.f33a.m1010e();
        while (m1010e.hasNext() && !this.f38f) {
            Map.Entry next = m1010e.next();
            C0016b c0016b = (C0016b) next.getValue();
            while (c0016b.f42a.compareTo(this.f34b) < 0 && !this.f38f && this.f33a.contains(next.getKey())) {
                m2367m(c0016b.f42a);
                c0016b.m2364a(interfaceC0013e, m2365o(c0016b.f42a));
                m2368l();
            }
        }
    }

    /* renamed from: f */
    static AbstractC0009c.EnumC0011b m2374f(AbstractC0009c.EnumC0010a enumC0010a) {
        switch (C0015a.f40a[enumC0010a.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0009c.EnumC0011b.CREATED;
            case 3:
            case 4:
                return AbstractC0009c.EnumC0011b.STARTED;
            case 5:
                return AbstractC0009c.EnumC0011b.RESUMED;
            case 6:
                return AbstractC0009c.EnumC0011b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + enumC0010a);
        }
    }

    /* renamed from: h */
    private boolean m2372h() {
        if (this.f33a.size() == 0) {
            return true;
        }
        AbstractC0009c.EnumC0011b enumC0011b = this.f33a.m1012c().getValue().f42a;
        AbstractC0009c.EnumC0011b enumC0011b2 = this.f33a.m1009f().getValue().f42a;
        return enumC0011b == enumC0011b2 && this.f34b == enumC0011b2;
    }

    /* renamed from: j */
    static AbstractC0009c.EnumC0011b m2370j(AbstractC0009c.EnumC0011b enumC0011b, AbstractC0009c.EnumC0011b enumC0011b2) {
        return (enumC0011b2 == null || enumC0011b2.compareTo(enumC0011b) >= 0) ? enumC0011b : enumC0011b2;
    }

    /* renamed from: k */
    private void m2369k(AbstractC0009c.EnumC0011b enumC0011b) {
        if (this.f34b == enumC0011b) {
            return;
        }
        this.f34b = enumC0011b;
        if (this.f37e || this.f36d != 0) {
            this.f38f = true;
            return;
        }
        this.f37e = true;
        m2366n();
        this.f37e = false;
    }

    /* renamed from: l */
    private void m2368l() {
        ArrayList<AbstractC0009c.EnumC0011b> arrayList = this.f39g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: m */
    private void m2367m(AbstractC0009c.EnumC0011b enumC0011b) {
        this.f39g.add(enumC0011b);
    }

    /* renamed from: n */
    private void m2366n() {
        InterfaceC0013e interfaceC0013e = this.f35c.get();
        if (interfaceC0013e == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean m2372h = m2372h();
            this.f38f = false;
            if (m2372h) {
                return;
            }
            if (this.f34b.compareTo(this.f33a.m1012c().getValue().f42a) < 0) {
                m2377c(interfaceC0013e);
            }
            Map.Entry<InterfaceC0012d, C0016b> m1009f = this.f33a.m1009f();
            if (!this.f38f && m1009f != null && this.f34b.compareTo(m1009f.getValue().f42a) > 0) {
                m2375e(interfaceC0013e);
            }
        }
    }

    /* renamed from: o */
    private static AbstractC0009c.EnumC0010a m2365o(AbstractC0009c.EnumC0011b enumC0011b) {
        int i = C0015a.f41b[enumC0011b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0009c.EnumC0010a.ON_START;
            }
            if (i == 3) {
                return AbstractC0009c.EnumC0010a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + enumC0011b);
            }
        }
        return AbstractC0009c.EnumC0010a.ON_CREATE;
    }

    @Override // android.arch.lifecycle.AbstractC0009c
    /* renamed from: a */
    public AbstractC0009c.EnumC0011b mo2379a() {
        return this.f34b;
    }

    @Override // android.arch.lifecycle.AbstractC0009c
    /* renamed from: b */
    public void mo2378b(InterfaceC0012d interfaceC0012d) {
        this.f33a.mo1008g(interfaceC0012d);
    }

    /* renamed from: g */
    public void m2373g(AbstractC0009c.EnumC0010a enumC0010a) {
        m2369k(m2374f(enumC0010a));
    }

    /* renamed from: i */
    public void m2371i(AbstractC0009c.EnumC0011b enumC0011b) {
        m2369k(enumC0011b);
    }
}