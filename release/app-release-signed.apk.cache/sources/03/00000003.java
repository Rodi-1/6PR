package p000a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.b */
/* loaded from: classes.dex */
public class C0003b extends AbstractC0004c {

    /* renamed from: a */
    private final Object f5a = new Object();

    /* renamed from: b */
    private ExecutorService f6b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f7c;

    @Override // p000a.AbstractC0004c
    /* renamed from: a */
    public void mo2401a(Runnable runnable) {
        this.f6b.execute(runnable);
    }

    @Override // p000a.AbstractC0004c
    /* renamed from: b */
    public boolean mo2400b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000a.AbstractC0004c
    /* renamed from: c */
    public void mo2399c(Runnable runnable) {
        if (this.f7c == null) {
            synchronized (this.f5a) {
                if (this.f7c == null) {
                    this.f7c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7c.post(runnable);
    }
}