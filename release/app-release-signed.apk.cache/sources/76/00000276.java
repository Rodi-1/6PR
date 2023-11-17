package v;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o.s;
import o.t;
import o.u;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f1948c;

    /* renamed from: d  reason: collision with root package name */
    t f1949d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1950e;

    /* renamed from: b  reason: collision with root package name */
    private long f1947b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final u f1951f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<s> f1946a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends u {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1952a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1953b = 0;

        a() {
        }

        @Override // o.t
        public void a(View view) {
            int i2 = this.f1953b + 1;
            this.f1953b = i2;
            if (i2 == h.this.f1946a.size()) {
                t tVar = h.this.f1949d;
                if (tVar != null) {
                    tVar.a(null);
                }
                d();
            }
        }

        @Override // o.u, o.t
        public void b(View view) {
            if (this.f1952a) {
                return;
            }
            this.f1952a = true;
            t tVar = h.this.f1949d;
            if (tVar != null) {
                tVar.b(null);
            }
        }

        void d() {
            this.f1953b = 0;
            this.f1952a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f1950e) {
            Iterator<s> it = this.f1946a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1950e = false;
        }
    }

    void b() {
        this.f1950e = false;
    }

    public h c(s sVar) {
        if (!this.f1950e) {
            this.f1946a.add(sVar);
        }
        return this;
    }

    public h d(s sVar, s sVar2) {
        this.f1946a.add(sVar);
        sVar2.h(sVar.c());
        this.f1946a.add(sVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f1950e) {
            this.f1947b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1950e) {
            this.f1948c = interpolator;
        }
        return this;
    }

    public h g(t tVar) {
        if (!this.f1950e) {
            this.f1949d = tVar;
        }
        return this;
    }

    public void h() {
        if (this.f1950e) {
            return;
        }
        Iterator<s> it = this.f1946a.iterator();
        while (it.hasNext()) {
            s next = it.next();
            long j2 = this.f1947b;
            if (j2 >= 0) {
                next.d(j2);
            }
            Interpolator interpolator = this.f1948c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f1949d != null) {
                next.f(this.f1951f);
            }
            next.j();
        }
        this.f1950e = true;
    }
}