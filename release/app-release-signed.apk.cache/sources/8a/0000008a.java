package android.support.p001v4.app;

import android.arch.lifecycle.InterfaceC0013e;
import android.arch.lifecycle.InterfaceC0027o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.u */
/* loaded from: classes.dex */
public abstract class AbstractC0125u {
    /* renamed from: b */
    public static <T extends InterfaceC0013e & InterfaceC0027o> AbstractC0125u m1829b(T t) {
        return new LoaderManagerImpl(t, t.mo2084b());
    }

    /* renamed from: a */
    public abstract void mo1830a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo1828c();
}