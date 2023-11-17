package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import h.a;
import h.b;
import m.b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f1527a;

    /* renamed from: b  reason: collision with root package name */
    private static final n.g<String, Typeface> f1528b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        Typeface a(Context context, Resources resources, int i2, String str, int i3);

        Typeface b(Context context, a.b bVar, Resources resources, int i2);

        Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2);
    }

    static {
        a fVar;
        if (l.a.a()) {
            fVar = new g();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            fVar = i2 >= 26 ? new f() : (i2 < 24 || !e.j()) ? i2 >= 21 ? new d() : new h() : new e();
        }
        f1527a = fVar;
        f1528b = new n.g<>(16);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        return f1527a.c(context, cancellationSignal, fVarArr, i2);
    }

    public static Typeface b(Context context, a.InterfaceC0013a interfaceC0013a, Resources resources, int i2, int i3, b.a aVar, Handler handler, boolean z) {
        Typeface b2;
        if (interfaceC0013a instanceof a.d) {
            a.d dVar = (a.d) interfaceC0013a;
            boolean z2 = false;
            if (!z ? aVar == null : dVar.a() == 0) {
                z2 = true;
            }
            b2 = m.b.k(context, dVar.b(), aVar, handler, z2, z ? dVar.c() : -1, i3);
        } else {
            b2 = f1527a.b(context, (a.b) interfaceC0013a, resources, i3);
            if (aVar != null) {
                if (b2 != null) {
                    aVar.b(b2, handler);
                } else {
                    aVar.a(-3, handler);
                }
            }
        }
        if (b2 != null) {
            f1528b.d(d(resources, i2, i3), b2);
        }
        return b2;
    }

    public static Typeface c(Context context, Resources resources, int i2, String str, int i3) {
        Typeface a2 = f1527a.a(context, resources, i2, str, i3);
        if (a2 != null) {
            f1528b.d(d(resources, i2, i3), a2);
        }
        return a2;
    }

    private static String d(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface e(Resources resources, int i2, int i3) {
        return f1528b.c(d(resources, i2, i3));
    }
}