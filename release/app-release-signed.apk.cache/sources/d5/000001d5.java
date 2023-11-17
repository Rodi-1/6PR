package m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f1586b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f1587c;

    /* renamed from: f  reason: collision with root package name */
    private final int f1590f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1591g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1592h;

    /* renamed from: a  reason: collision with root package name */
    private final Object f1585a = new Object();

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f1589e = new a();

    /* renamed from: d  reason: collision with root package name */
    private int f1588d = 0;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c.this.c();
                return true;
            } else if (i2 != 1) {
                return true;
            } else {
                c.this.d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f1594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f1595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f1596d;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f1598b;

            a(Object obj) {
                this.f1598b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1596d.a(this.f1598b);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f1594b = callable;
            this.f1595c = handler;
            this.f1596d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f1594b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f1595c.post(new a(obj));
        }
    }

    /* renamed from: m.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0018c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f1600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f1601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f1602d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f1603e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Condition f1604f;

        RunnableC0018c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f1600b = atomicReference;
            this.f1601c = callable;
            this.f1602d = reentrantLock;
            this.f1603e = atomicBoolean;
            this.f1604f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1600b.set(this.f1601c.call());
            } catch (Exception unused) {
            }
            this.f1602d.lock();
            try {
                this.f1603e.set(false);
                this.f1604f.signal();
            } finally {
                this.f1602d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t2);
    }

    public c(String str, int i2, int i3) {
        this.f1592h = str;
        this.f1591g = i2;
        this.f1590f = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f1585a) {
            if (this.f1587c.hasMessages(1)) {
                return;
            }
            this.f1586b.quit();
            this.f1586b = null;
            this.f1587c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f1585a) {
            this.f1587c.removeMessages(0);
            Handler handler = this.f1587c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f1590f);
        }
    }

    private void e(Runnable runnable) {
        synchronized (this.f1585a) {
            if (this.f1586b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f1592h, this.f1591g);
                this.f1586b = handlerThread;
                handlerThread.start();
                this.f1587c = new Handler(this.f1586b.getLooper(), this.f1589e);
                this.f1588d++;
            }
            this.f1587c.removeMessages(0);
            Handler handler = this.f1587c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, new Handler(), dVar));
    }

    public <T> T g(Callable<T> callable, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new RunnableC0018c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
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