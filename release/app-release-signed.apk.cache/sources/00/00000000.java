package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.a */
/* loaded from: classes.dex */
public class C0000a extends AbstractC0004c {

    /* renamed from: c */
    private static volatile C0000a f0c;

    /* renamed from: d */
    private static final Executor f1d = new ExecutorC0001a();

    /* renamed from: e */
    private static final Executor f2e = new ExecutorC0002b();

    /* renamed from: a */
    private AbstractC0004c f3a;

    /* renamed from: b */
    private AbstractC0004c f4b;

    /* renamed from: a.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0001a implements Executor {
        ExecutorC0001a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0000a.m2402d().mo2399c(runnable);
        }
    }

    /* renamed from: a.a$b */
    /* loaded from: classes.dex */
    static class ExecutorC0002b implements Executor {
        ExecutorC0002b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0000a.m2402d().mo2401a(runnable);
        }
    }

    private C0000a() {
        C0003b c0003b = new C0003b();
        this.f4b = c0003b;
        this.f3a = c0003b;
    }

    /* renamed from: d */
    public static C0000a m2402d() {
        if (f0c != null) {
            return f0c;
        }
        synchronized (C0000a.class) {
            if (f0c == null) {
                f0c = new C0000a();
            }
        }
        return f0c;
    }

    @Override // p000a.AbstractC0004c
    /* renamed from: a */
    public void mo2401a(Runnable runnable) {
        this.f3a.mo2401a(runnable);
    }

    @Override // p000a.AbstractC0004c
    /* renamed from: b */
    public boolean mo2400b() {
        return this.f3a.mo2400b();
    }

    @Override // p000a.AbstractC0004c
    /* renamed from: c */
    public void mo2399c(Runnable runnable) {
        this.f3a.mo2399c(runnable);
    }
}