package android.arch.lifecycle;

import android.arch.lifecycle.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<e> f35c;

    /* renamed from: a  reason: collision with root package name */
    private b.a<d, b> f33a = new b.a<>();

    /* renamed from: d  reason: collision with root package name */
    private int f36d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38f = false;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<c.b> f39g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private c.b f34b = c.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41b;

        static {
            int[] iArr = new int[c.b.values().length];
            f41b = iArr;
            try {
                iArr[c.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41b[c.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41b[c.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41b[c.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41b[c.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f40a = iArr2;
            try {
                iArr2[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40a[c.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40a[c.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40a[c.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        c.b f42a;

        /* renamed from: b  reason: collision with root package name */
        GenericLifecycleObserver f43b;

        void a(e eVar, c.a aVar) {
            c.b f2 = f.f(aVar);
            this.f42a = f.j(this.f42a, f2);
            this.f43b.g(eVar, aVar);
            this.f42a = f2;
        }
    }

    public f(e eVar) {
        this.f35c = new WeakReference<>(eVar);
    }

    private void c(e eVar) {
        Iterator<Map.Entry<d, b>> b2 = this.f33a.b();
        while (b2.hasNext() && !this.f38f) {
            Map.Entry<d, b> next = b2.next();
            b value = next.getValue();
            while (value.f42a.compareTo(this.f34b) > 0 && !this.f38f && this.f33a.contains(next.getKey())) {
                c.a d2 = d(value.f42a);
                m(f(d2));
                value.a(eVar, d2);
                l();
            }
        }
    }

    private static c.a d(c.b bVar) {
        int i2 = a.f41b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalArgumentException("Unexpected state value " + bVar);
                        }
                        throw new IllegalArgumentException();
                    }
                    return c.a.ON_PAUSE;
                }
                return c.a.ON_STOP;
            }
            return c.a.ON_DESTROY;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(e eVar) {
        b.b<d, b>.e e2 = this.f33a.e();
        while (e2.hasNext() && !this.f38f) {
            Map.Entry next = e2.next();
            b bVar = (b) next.getValue();
            while (bVar.f42a.compareTo(this.f34b) < 0 && !this.f38f && this.f33a.contains(next.getKey())) {
                m(bVar.f42a);
                bVar.a(eVar, o(bVar.f42a));
                l();
            }
        }
    }

    static c.b f(c.a aVar) {
        switch (a.f40a[aVar.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean h() {
        if (this.f33a.size() == 0) {
            return true;
        }
        c.b bVar = this.f33a.c().getValue().f42a;
        c.b bVar2 = this.f33a.f().getValue().f42a;
        return bVar == bVar2 && this.f34b == bVar2;
    }

    static c.b j(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void k(c.b bVar) {
        if (this.f34b == bVar) {
            return;
        }
        this.f34b = bVar;
        if (this.f37e || this.f36d != 0) {
            this.f38f = true;
            return;
        }
        this.f37e = true;
        n();
        this.f37e = false;
    }

    private void l() {
        ArrayList<c.b> arrayList = this.f39g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c.b bVar) {
        this.f39g.add(bVar);
    }

    private void n() {
        e eVar = this.f35c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean h2 = h();
            this.f38f = false;
            if (h2) {
                return;
            }
            if (this.f34b.compareTo(this.f33a.c().getValue().f42a) < 0) {
                c(eVar);
            }
            Map.Entry<d, b> f2 = this.f33a.f();
            if (!this.f38f && f2 != null && this.f34b.compareTo(f2.getValue().f42a) > 0) {
                e(eVar);
            }
        }
    }

    private static c.a o(c.b bVar) {
        int i2 = a.f41b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return c.a.ON_START;
            }
            if (i2 == 3) {
                return c.a.ON_RESUME;
            }
            if (i2 == 4) {
                throw new IllegalArgumentException();
            }
            if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return c.a.ON_CREATE;
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f34b;
    }

    @Override // android.arch.lifecycle.c
    public void b(d dVar) {
        this.f33a.g(dVar);
    }

    public void g(c.a aVar) {
        k(f(aVar));
    }

    public void i(c.b bVar) {
        k(bVar);
    }
}