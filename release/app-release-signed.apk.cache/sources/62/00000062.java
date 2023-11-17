package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class k<E> extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f337a;

    /* renamed from: b  reason: collision with root package name */
    final Context f338b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f339c;

    /* renamed from: d  reason: collision with root package name */
    final int f340d;

    /* renamed from: e  reason: collision with root package name */
    final m f341e;

    k(Activity activity, Context context, Handler handler, int i2) {
        this.f341e = new m();
        this.f337a = activity;
        this.f338b = context;
        this.f339c = handler;
        this.f340d = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(h hVar) {
        this(hVar, hVar, hVar.f321f, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity d() {
        return this.f337a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context e() {
        return this.f338b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m f() {
        return this.f341e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler g() {
        return this.f339c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(g gVar);

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract LayoutInflater j();

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m(g gVar);

    public abstract void n();
}