package p010i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p009h.C0388a;
import p010i.C0402c;
import p014m.C0427b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i.h */
/* loaded from: classes.dex */
public class C0408h implements C0402c.InterfaceC0403a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i.h$a */
    /* loaded from: classes.dex */
    public class C0409a implements InterfaceC0411c<C0427b.C0433f> {
        C0409a() {
        }

        @Override // p010i.C0408h.InterfaceC0411c
        /* renamed from: c */
        public int mo642a(C0427b.C0433f c0433f) {
            return c0433f.m580d();
        }

        @Override // p010i.C0408h.InterfaceC0411c
        /* renamed from: d */
        public boolean mo641b(C0427b.C0433f c0433f) {
            return c0433f.m579e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i.h$b */
    /* loaded from: classes.dex */
    public class C0410b implements InterfaceC0411c<C0388a.C0391c> {
        C0410b() {
        }

        @Override // p010i.C0408h.InterfaceC0411c
        /* renamed from: c */
        public int mo642a(C0388a.C0391c c0391c) {
            return c0391c.m718e();
        }

        @Override // p010i.C0408h.InterfaceC0411c
        /* renamed from: d */
        public boolean mo641b(C0388a.C0391c c0391c) {
            return c0391c.m717f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i.h$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0411c<T> {
        /* renamed from: a */
        int mo642a(T t);

        /* renamed from: b */
        boolean mo641b(T t);
    }

    /* renamed from: e */
    private C0388a.C0391c m649e(C0388a.C0390b c0390b, int i) {
        return (C0388a.C0391c) m648f(c0390b.m723a(), i, new C0410b());
    }

    /* renamed from: f */
    private static <T> T m648f(T[] tArr, int i, InterfaceC0411c<T> interfaceC0411c) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC0411c.mo642a(t2) - i2) * 2) + (interfaceC0411c.mo641b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    @Override // p010i.C0402c.InterfaceC0403a
    /* renamed from: a */
    public Typeface mo653a(Context context, Resources resources, int i, String str, int i2) {
        File m636e = C0412i.m636e(context);
        if (m636e == null) {
            return null;
        }
        try {
            if (C0412i.m638c(m636e, resources, i)) {
                return Typeface.createFromFile(m636e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m636e.delete();
        }
    }

    @Override // p010i.C0402c.InterfaceC0403a
    /* renamed from: b */
    public Typeface mo652b(Context context, C0388a.C0390b c0390b, Resources resources, int i) {
        C0388a.C0391c m649e = m649e(c0390b, i);
        if (m649e == null) {
            return null;
        }
        return C0402c.m675c(context, resources, m649e.m721b(), m649e.m722a(), i);
    }

    @Override // p010i.C0402c.InterfaceC0403a
    /* renamed from: c */
    public Typeface mo651c(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0433fArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m647g(c0433fArr, i).m581c());
            try {
                Typeface m650d = m650d(context, inputStream);
                C0412i.m640a(inputStream);
                return m650d;
            } catch (IOException unused) {
                C0412i.m640a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0412i.m640a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface m650d(Context context, InputStream inputStream) {
        File m636e = C0412i.m636e(context);
        if (m636e == null) {
            return null;
        }
        try {
            if (C0412i.m637d(m636e, inputStream)) {
                return Typeface.createFromFile(m636e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m636e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C0427b.C0433f m647g(C0427b.C0433f[] c0433fArr, int i) {
        return (C0427b.C0433f) m648f(c0433fArr, i, new C0409a());
    }
}