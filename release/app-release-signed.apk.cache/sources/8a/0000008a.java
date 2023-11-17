package android.support.v4.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class u {
    public static <T extends android.arch.lifecycle.e & android.arch.lifecycle.o> u b(T t2) {
        return new LoaderManagerImpl(t2, t2.b());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}