package p014m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: m.c */
/* loaded from: classes.dex */
public class C0435c {

    /* renamed from: b */
    private HandlerThread f2099b;

    /* renamed from: c */
    private Handler f2100c;

    /* renamed from: f */
    private final int f2103f;

    /* renamed from: g */
    private final int f2104g;

    /* renamed from: h */
    private final String f2105h;

    /* renamed from: a */
    private final Object f2098a = new Object();

    /* renamed from: e */
    private Handler.Callback f2102e = new C0436a();

    /* renamed from: d */
    private int f2101d = 0;

    /* renamed from: m.c$a */
    /* loaded from: classes.dex */
    class C0436a implements Handler.Callback {
        C0436a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0435c.this.m576c();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0435c.this.m575d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: m.c$b */
    /* loaded from: classes.dex */
    class RunnableC0437b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f2107b;

        /* renamed from: c */
        final /* synthetic */ Handler f2108c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0440d f2109d;

        /* renamed from: m.c$b$a */
        /* loaded from: classes.dex */
        class RunnableC0438a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f2111b;

            RunnableC0438a(Object obj) {
                this.f2111b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0437b.this.f2109d.mo571a(this.f2111b);
            }
        }

        RunnableC0437b(Callable callable, Handler handler, InterfaceC0440d interfaceC0440d) {
            this.f2107b = callable;
            this.f2108c = handler;
            this.f2109d = interfaceC0440d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f2107b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2108c.post(new RunnableC0438a(obj));
        }
    }

    /* renamed from: m.c$c */
    /* loaded from: classes.dex */
    class RunnableC0439c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f2113b;

        /* renamed from: c */
        final /* synthetic */ Callable f2114c;

        /* renamed from: d */
        final /* synthetic */ ReentrantLock f2115d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f2116e;

        /* renamed from: f */
        final /* synthetic */ Condition f2117f;

        RunnableC0439c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f2113b = atomicReference;
            this.f2114c = callable;
            this.f2115d = reentrantLock;
            this.f2116e = atomicBoolean;
            this.f2117f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2113b.set(this.f2114c.call());
            } catch (Exception unused) {
            }
            this.f2115d.lock();
            try {
                this.f2116e.set(false);
                this.f2117f.signal();
            } finally {
                this.f2115d.unlock();
            }
        }
    }

    /* renamed from: m.c$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0440d<T> {
        /* renamed from: a */
        void mo571a(T t);
    }

    public C0435c(String str, int i, int i2) {
        this.f2105h = str;
        this.f2104g = i;
        this.f2103f = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m576c() {
        synchronized (this.f2098a) {
            if (this.f2100c.hasMessages(1)) {
                return;
            }
            this.f2099b.quit();
            this.f2099b = null;
            this.f2100c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m575d(Runnable runnable) {
        runnable.run();
        synchronized (this.f2098a) {
            this.f2100c.removeMessages(0);
            Handler handler = this.f2100c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f2103f);
        }
    }

    /* renamed from: e */
    private void m574e(Runnable runnable) {
        synchronized (this.f2098a) {
            if (this.f2099b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f2105h, this.f2104g);
                this.f2099b = handlerThread;
                handlerThread.start();
                this.f2100c = new Handler(this.f2099b.getLooper(), this.f2102e);
                this.f2101d++;
            }
            this.f2100c.removeMessages(0);
            Handler handler = this.f2100c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: f */
    public <T> void m573f(Callable<T> callable, InterfaceC0440d<T> interfaceC0440d) {
        m574e(new RunnableC0437b(callable, new Handler(), interfaceC0440d));
    }

    /* renamed from: g */
    public <T> T m572g(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m574e(new RunnableC0439c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (InterruptedException unused) {
                    }
                    if (!atomicBoolean.get()) {
                        return (T) atomicReference.get();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return (T) atomicReference.get();
        } finally {
            reentrantLock.unlock();
        }
    }
}