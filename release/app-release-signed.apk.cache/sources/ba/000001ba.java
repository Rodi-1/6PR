package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import h.a;
import i.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import m.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h implements c.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c<b.f> {
        a() {
        }

        @Override // i.h.c
        /* renamed from: c */
        public int a(b.f fVar) {
            return fVar.d();
        }

        @Override // i.h.c
        /* renamed from: d */
        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c<a.c> {
        b() {
        }

        @Override // i.h.c
        /* renamed from: c */
        public int a(a.c cVar) {
            return cVar.e();
        }

        @Override // i.h.c
        /* renamed from: d */
        public boolean b(a.c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t2);

        boolean b(T t2);
    }

    private a.c e(a.b bVar, int i2) {
        return (a.c) f(bVar.a(), i2, new b());
    }

    private static <T> T f(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t2 = null;
        int i4 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int abs = (Math.abs(cVar.a(t3) - i3) * 2) + (cVar.b(t3) == z ? 0 : 1);
            if (t2 == null || i4 > abs) {
                t2 = t3;
                i4 = abs;
            }
        }
        return t2;
    }

    @Override // i.c.a
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        File e2 = i.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (i.c(e2, resources, i2)) {
                return Typeface.createFromFile(e2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    @Override // i.c.a
    public Typeface b(Context context, a.b bVar, Resources resources, int i2) {
        a.c e2 = e(bVar, i2);
        if (e2 == null) {
            return null;
        }
        return i.c.c(context, resources, e2.b(), e2.a(), i2);
    }

    @Override // i.c.a
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(g(fVarArr, i2).c());
            try {
                Typeface d2 = d(context, inputStream);
                i.a(inputStream);
                return d2;
            } catch (IOException unused) {
                i.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                i.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e2 = i.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (i.d(e2, inputStream)) {
                return Typeface.createFromFile(e2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b.f g(b.f[] fVarArr, int i2) {
        return (b.f) f(fVarArr, i2, new a());
    }
}