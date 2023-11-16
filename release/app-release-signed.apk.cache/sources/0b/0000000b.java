package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0009c;
import p000a.C0000a;
import p003b.C0337b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: g */
    private static final Object f11g = new Object();

    /* renamed from: a */
    private C0337b<InterfaceC0020j<T>, LiveData<T>.AbstractC0006a> f12a;

    /* renamed from: b */
    private int f13b;

    /* renamed from: c */
    private volatile Object f14c;

    /* renamed from: d */
    private int f15d;

    /* renamed from: e */
    private boolean f16e;

    /* renamed from: f */
    private boolean f17f;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC0006a implements GenericLifecycleObserver {

        /* renamed from: e */
        final InterfaceC0013e f18e;

        /* renamed from: f */
        final /* synthetic */ LiveData f19f;

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        /* renamed from: g */
        public void mo2383g(InterfaceC0013e interfaceC0013e, AbstractC0009c.EnumC0010a enumC0010a) {
            if (this.f18e.mo1819a().mo2379a() == AbstractC0009c.EnumC0011b.DESTROYED) {
                this.f19f.mo2231i(this.f20a);
            } else {
                m2386h(mo2384j());
            }
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0006a
        /* renamed from: i */
        void mo2385i() {
            this.f18e.mo1819a().mo2378b(this);
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0006a
        /* renamed from: j */
        boolean mo2384j() {
            return this.f18e.mo1819a().mo2379a().m2380a(AbstractC0009c.EnumC0011b.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.arch.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public abstract class AbstractC0006a {

        /* renamed from: a */
        final InterfaceC0020j<T> f20a;

        /* renamed from: b */
        boolean f21b;

        /* renamed from: c */
        int f22c;

        /* renamed from: d */
        final /* synthetic */ LiveData f23d;

        /* renamed from: h */
        void m2386h(boolean z) {
            if (z == this.f21b) {
                return;
            }
            this.f21b = z;
            boolean z2 = this.f23d.f13b == 0;
            this.f23d.f13b += this.f21b ? 1 : -1;
            if (z2 && this.f21b) {
                this.f23d.mo2233g();
            }
            if (this.f23d.f13b == 0 && !this.f21b) {
                this.f23d.mo2232h();
            }
            if (this.f21b) {
                this.f23d.m2387f(this);
            }
        }

        /* renamed from: i */
        void mo2385i() {
        }

        /* renamed from: j */
        abstract boolean mo2384j();
    }

    /* renamed from: d */
    private static void m2389d(String str) {
        if (C0000a.m2402d().mo2400b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m2388e(LiveData<T>.AbstractC0006a abstractC0006a) {
        if (abstractC0006a.f21b) {
            if (!abstractC0006a.mo2384j()) {
                abstractC0006a.m2386h(false);
                return;
            }
            int i = abstractC0006a.f22c;
            int i2 = this.f15d;
            if (i >= i2) {
                return;
            }
            abstractC0006a.f22c = i2;
            abstractC0006a.f20a.m2363a(this.f14c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m2387f(LiveData<T>.AbstractC0006a abstractC0006a) {
        if (this.f16e) {
            this.f17f = true;
            return;
        }
        this.f16e = true;
        do {
            this.f17f = false;
            if (abstractC0006a == null) {
                C0337b<InterfaceC0020j<T>, LiveData<T>.AbstractC0006a>.C0342e m1010e = this.f12a.m1010e();
                while (m1010e.hasNext()) {
                    m2388e((AbstractC0006a) m1010e.next().getValue());
                    if (this.f17f) {
                        break;
                    }
                }
            } else {
                m2388e(abstractC0006a);
                abstractC0006a = null;
            }
        } while (this.f17f);
        this.f16e = false;
    }

    /* renamed from: g */
    protected abstract void mo2233g();

    /* renamed from: h */
    protected abstract void mo2232h();

    /* renamed from: i */
    public void mo2231i(InterfaceC0020j<T> interfaceC0020j) {
        m2389d("removeObserver");
        LiveData<T>.AbstractC0006a mo1008g = this.f12a.mo1008g(interfaceC0020j);
        if (mo1008g == null) {
            return;
        }
        mo1008g.mo2385i();
        mo1008g.m2386h(false);
    }
}