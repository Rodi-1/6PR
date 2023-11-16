package android.support.p001v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.k */
/* loaded from: classes.dex */
public abstract class AbstractC0085k<E> extends AbstractC0083i {

    /* renamed from: a */
    private final Activity f467a;

    /* renamed from: b */
    final Context f468b;

    /* renamed from: c */
    private final Handler f469c;

    /* renamed from: d */
    final int f470d;

    /* renamed from: e */
    final LayoutInflater$Factory2C0089m f471e;

    AbstractC0085k(Activity activity, Context context, Handler handler, int i) {
        this.f471e = new LayoutInflater$Factory2C0089m();
        this.f467a = activity;
        this.f468b = context;
        this.f469c = handler;
        this.f470d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0085k(ActivityC0079h activityC0079h) {
        this(activityC0079h, activityC0079h, activityC0079h.f451f, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Activity m2043d() {
        return this.f467a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Context m2042e() {
        return this.f468b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public LayoutInflater$Factory2C0089m m2041f() {
        return this.f471e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler m2040g() {
        return this.f469c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo2039h(ComponentCallbacksC0073g componentCallbacksC0073g);

    /* renamed from: i */
    public abstract void mo2038i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: j */
    public abstract LayoutInflater mo2037j();

    /* renamed from: k */
    public abstract int mo2036k();

    /* renamed from: l */
    public abstract boolean mo2035l();

    /* renamed from: m */
    public abstract boolean mo2034m(ComponentCallbacksC0073g componentCallbacksC0073g);

    /* renamed from: n */
    public abstract void mo2033n();
}