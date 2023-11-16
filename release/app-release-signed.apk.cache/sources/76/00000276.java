package p023v;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p016o.C0511s;
import p016o.C0515u;
import p016o.InterfaceC0514t;

/* renamed from: v.h */
/* loaded from: classes.dex */
public class C0595h {

    /* renamed from: c */
    private Interpolator f2700c;

    /* renamed from: d */
    InterfaceC0514t f2701d;

    /* renamed from: e */
    private boolean f2702e;

    /* renamed from: b */
    private long f2699b = -1;

    /* renamed from: f */
    private final C0515u f2703f = new C0596a();

    /* renamed from: a */
    final ArrayList<C0511s> f2698a = new ArrayList<>();

    /* renamed from: v.h$a */
    /* loaded from: classes.dex */
    class C0596a extends C0515u {

        /* renamed from: a */
        private boolean f2704a = false;

        /* renamed from: b */
        private int f2705b = 0;

        C0596a() {
        }

        @Override // p016o.InterfaceC0514t
        /* renamed from: a */
        public void mo33a(View view) {
            int i = this.f2705b + 1;
            this.f2705b = i;
            if (i == C0595h.this.f2698a.size()) {
                InterfaceC0514t interfaceC0514t = C0595h.this.f2701d;
                if (interfaceC0514t != null) {
                    interfaceC0514t.mo33a(null);
                }
                m31d();
            }
        }

        @Override // p016o.C0515u, p016o.InterfaceC0514t
        /* renamed from: b */
        public void mo32b(View view) {
            if (this.f2704a) {
                return;
            }
            this.f2704a = true;
            InterfaceC0514t interfaceC0514t = C0595h.this.f2701d;
            if (interfaceC0514t != null) {
                interfaceC0514t.mo32b(null);
            }
        }

        /* renamed from: d */
        void m31d() {
            this.f2705b = 0;
            this.f2704a = false;
            C0595h.this.m40b();
        }
    }

    /* renamed from: a */
    public void m41a() {
        if (this.f2702e) {
            Iterator<C0511s> it = this.f2698a.iterator();
            while (it.hasNext()) {
                it.next().m343b();
            }
            this.f2702e = false;
        }
    }

    /* renamed from: b */
    void m40b() {
        this.f2702e = false;
    }

    /* renamed from: c */
    public C0595h m39c(C0511s c0511s) {
        if (!this.f2702e) {
            this.f2698a.add(c0511s);
        }
        return this;
    }

    /* renamed from: d */
    public C0595h m38d(C0511s c0511s, C0511s c0511s2) {
        this.f2698a.add(c0511s);
        c0511s2.m337h(c0511s.m342c());
        this.f2698a.add(c0511s2);
        return this;
    }

    /* renamed from: e */
    public C0595h m37e(long j) {
        if (!this.f2702e) {
            this.f2699b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0595h m36f(Interpolator interpolator) {
        if (!this.f2702e) {
            this.f2700c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0595h m35g(InterfaceC0514t interfaceC0514t) {
        if (!this.f2702e) {
            this.f2701d = interfaceC0514t;
        }
        return this;
    }

    /* renamed from: h */
    public void m34h() {
        if (this.f2702e) {
            return;
        }
        Iterator<C0511s> it = this.f2698a.iterator();
        while (it.hasNext()) {
            C0511s next = it.next();
            long j = this.f2699b;
            if (j >= 0) {
                next.m341d(j);
            }
            Interpolator interpolator = this.f2700c;
            if (interpolator != null) {
                next.m340e(interpolator);
            }
            if (this.f2701d != null) {
                next.m339f(this.f2703f);
            }
            next.m335j();
        }
        this.f2702e = true;
    }
}