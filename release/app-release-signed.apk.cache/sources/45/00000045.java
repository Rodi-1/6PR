package android.support.v4.app;

import android.arch.lifecycle.m;
import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LoaderManagerImpl extends u {

    /* renamed from: c  reason: collision with root package name */
    static boolean f226c = false;

    /* renamed from: a  reason: collision with root package name */
    private final android.arch.lifecycle.e f227a;

    /* renamed from: b  reason: collision with root package name */
    private final LoaderViewModel f228b;

    /* loaded from: classes.dex */
    static class LoaderViewModel extends android.arch.lifecycle.l {

        /* renamed from: c  reason: collision with root package name */
        private static final m.a f229c = new a();

        /* renamed from: a  reason: collision with root package name */
        private n.l<a> f230a = new n.l<>();

        /* renamed from: b  reason: collision with root package name */
        private boolean f231b = false;

        /* loaded from: classes.dex */
        static class a implements m.a {
            a() {
            }

            @Override // android.arch.lifecycle.m.a
            public <T extends android.arch.lifecycle.l> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        static LoaderViewModel c(android.arch.lifecycle.n nVar) {
            return (LoaderViewModel) new android.arch.lifecycle.m(nVar, f229c).a(LoaderViewModel.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.arch.lifecycle.l
        public void a() {
            super.a();
            int k2 = this.f230a.k();
            for (int i2 = 0; i2 < k2; i2++) {
                this.f230a.l(i2).j();
            }
            this.f230a.b();
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f230a.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f230a.k(); i2++) {
                    a l2 = this.f230a.l(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f230a.h(i2));
                    printWriter.print(": ");
                    printWriter.println(l2.toString());
                    l2.k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void d() {
            int k2 = this.f230a.k();
            for (int i2 = 0; i2 < k2; i2++) {
                this.f230a.l(i2).l();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a<D> extends android.arch.lifecycle.i<D> {

        /* renamed from: h  reason: collision with root package name */
        private final int f232h;

        /* renamed from: i  reason: collision with root package name */
        private final Bundle f233i;

        /* renamed from: j  reason: collision with root package name */
        private android.arch.lifecycle.e f234j;

        @Override // android.arch.lifecycle.LiveData
        protected void g() {
            if (LoaderManagerImpl.f226c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        protected void h() {
            if (LoaderManagerImpl.f226c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        public void i(android.arch.lifecycle.j<D> jVar) {
            super.i(jVar);
            this.f234j = null;
        }

        void j() {
            if (LoaderManagerImpl.f226c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f232h);
            printWriter.print(" mArgs=");
            printWriter.println(this.f233i);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f232h);
            sb.append(" : ");
            n.d.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoaderManagerImpl(android.arch.lifecycle.e eVar, android.arch.lifecycle.n nVar) {
        this.f227a = eVar;
        this.f228b = LoaderViewModel.c(nVar);
    }

    @Override // android.support.v4.app.u
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f228b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.support.v4.app.u
    public void c() {
        this.f228b.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        n.d.a(this.f227a, sb);
        sb.append("}}");
        return sb.toString();
    }
}