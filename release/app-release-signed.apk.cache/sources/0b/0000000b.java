package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f11g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private b.b<j<T>, LiveData<T>.a> f12a;

    /* renamed from: b  reason: collision with root package name */
    private int f13b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f14c;

    /* renamed from: d  reason: collision with root package name */
    private int f15d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17f;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {

        /* renamed from: e  reason: collision with root package name */
        final e f18e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LiveData f19f;

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void g(e eVar, c.a aVar) {
            if (this.f18e.a().a() == c.b.DESTROYED) {
                this.f19f.i(this.f20a);
            } else {
                h(j());
            }
        }

        @Override // android.arch.lifecycle.LiveData.a
        void i() {
            this.f18e.a().b(this);
        }

        @Override // android.arch.lifecycle.LiveData.a
        boolean j() {
            return this.f18e.a().a().a(c.b.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        final j<T> f20a;

        /* renamed from: b  reason: collision with root package name */
        boolean f21b;

        /* renamed from: c  reason: collision with root package name */
        int f22c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveData f23d;

        void h(boolean z) {
            if (z == this.f21b) {
                return;
            }
            this.f21b = z;
            boolean z2 = this.f23d.f13b == 0;
            this.f23d.f13b += this.f21b ? 1 : -1;
            if (z2 && this.f21b) {
                this.f23d.g();
            }
            if (this.f23d.f13b == 0 && !this.f21b) {
                this.f23d.h();
            }
            if (this.f21b) {
                this.f23d.f(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    private static void d(String str) {
        if (a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(LiveData<T>.a aVar) {
        if (aVar.f21b) {
            if (!aVar.j()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f22c;
            int i3 = this.f15d;
            if (i2 >= i3) {
                return;
            }
            aVar.f22c = i3;
            aVar.f20a.a(this.f14c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(LiveData<T>.a aVar) {
        if (this.f16e) {
            this.f17f = true;
            return;
        }
        this.f16e = true;
        do {
            this.f17f = false;
            if (aVar == null) {
                b.b<j<T>, LiveData<T>.a>.e e2 = this.f12a.e();
                while (e2.hasNext()) {
                    e((a) e2.next().getValue());
                    if (this.f17f) {
                        break;
                    }
                }
            } else {
                e(aVar);
                aVar = null;
            }
        } while (this.f17f);
        this.f16e = false;
    }

    protected abstract void g();

    protected abstract void h();

    public void i(j<T> jVar) {
        d("removeObserver");
        LiveData<T>.a g2 = this.f12a.g(jVar);
        if (g2 == null) {
            return;
        }
        g2.i();
        g2.h(false);
    }
}