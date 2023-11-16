package android.support.p001v4.app;

import android.arch.lifecycle.AbstractC0023l;
import android.arch.lifecycle.C0019i;
import android.arch.lifecycle.C0024m;
import android.arch.lifecycle.C0026n;
import android.arch.lifecycle.InterfaceC0013e;
import android.arch.lifecycle.InterfaceC0020j;
import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p015n.C0450d;
import p015n.C0463l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.LoaderManagerImpl */
/* loaded from: classes.dex */
public class LoaderManagerImpl extends AbstractC0125u {

    /* renamed from: c */
    static boolean f332c = false;

    /* renamed from: a */
    private final InterfaceC0013e f333a;

    /* renamed from: b */
    private final LoaderViewModel f334b;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    /* loaded from: classes.dex */
    static class LoaderViewModel extends AbstractC0023l {

        /* renamed from: c */
        private static final C0024m.InterfaceC0025a f335c = new C0058a();

        /* renamed from: a */
        private C0463l<C0059a> f336a = new C0463l<>();

        /* renamed from: b */
        private boolean f337b = false;

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$a */
        /* loaded from: classes.dex */
        static class C0058a implements C0024m.InterfaceC0025a {
            C0058a() {
            }

            @Override // android.arch.lifecycle.C0024m.InterfaceC0025a
            /* renamed from: a */
            public <T extends AbstractC0023l> T mo2234a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        /* renamed from: c */
        static LoaderViewModel m2236c(C0026n c0026n) {
            return (LoaderViewModel) new C0024m(c0026n, f335c).m2354a(LoaderViewModel.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.arch.lifecycle.AbstractC0023l
        /* renamed from: a */
        public void mo2238a() {
            super.mo2238a();
            int m477k = this.f336a.m477k();
            for (int i = 0; i < m477k; i++) {
                this.f336a.m476l(i).m2230j();
            }
            this.f336a.m486b();
        }

        /* renamed from: b */
        public void m2237b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f336a.m477k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f336a.m477k(); i++) {
                    C0059a m476l = this.f336a.m476l(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f336a.m480h(i));
                    printWriter.print(": ");
                    printWriter.println(m476l.toString());
                    m476l.m2229k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: d */
        void m2235d() {
            int m477k = this.f336a.m477k();
            for (int i = 0; i < m477k; i++) {
                this.f336a.m476l(i).m2228l();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    /* loaded from: classes.dex */
    public static class C0059a<D> extends C0019i<D> {

        /* renamed from: h */
        private final int f338h;

        /* renamed from: i */
        private final Bundle f339i;

        /* renamed from: j */
        private InterfaceC0013e f340j;

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: g */
        protected void mo2233g() {
            if (LoaderManagerImpl.f332c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: h */
        protected void mo2232h() {
            if (LoaderManagerImpl.f332c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: i */
        public void mo2231i(InterfaceC0020j<D> interfaceC0020j) {
            super.mo2231i(interfaceC0020j);
            this.f340j = null;
        }

        /* renamed from: j */
        void m2230j() {
            if (LoaderManagerImpl.f332c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: k */
        public void m2229k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f338h);
            printWriter.print(" mArgs=");
            printWriter.println(this.f339i);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* renamed from: l */
        void m2228l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f338h);
            sb.append(" : ");
            C0450d.m540a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoaderManagerImpl(InterfaceC0013e interfaceC0013e, C0026n c0026n) {
        this.f333a = interfaceC0013e;
        this.f334b = LoaderViewModel.m2236c(c0026n);
    }

    @Override // android.support.p001v4.app.AbstractC0125u
    /* renamed from: a */
    public void mo1830a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f334b.m2237b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.support.p001v4.app.AbstractC0125u
    /* renamed from: c */
    public void mo1828c() {
        this.f334b.m2235d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0450d.m540a(this.f333a, sb);
        sb.append("}}");
        return sb.toString();
    }
}