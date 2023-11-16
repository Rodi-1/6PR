package p010i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p009h.C0388a;
import p009h.C0393b;
import p013l.C0425a;
import p014m.C0427b;
import p015n.C0453g;

/* renamed from: i.c */
/* loaded from: classes.dex */
public class C0402c {

    /* renamed from: a */
    private static final InterfaceC0403a f2040a;

    /* renamed from: b */
    private static final C0453g<String, Typeface> f2041b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0403a {
        /* renamed from: a */
        Typeface mo653a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: b */
        Typeface mo652b(Context context, C0388a.C0390b c0390b, Resources resources, int i);

        /* renamed from: c */
        Typeface mo651c(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i);
    }

    static {
        InterfaceC0403a c0406f;
        if (C0425a.m609a()) {
            c0406f = new C0407g();
        } else {
            int i = Build.VERSION.SDK_INT;
            c0406f = i >= 26 ? new C0406f() : (i < 24 || !C0405e.m669j()) ? i >= 21 ? new C0404d() : new C0408h() : new C0405e();
        }
        f2040a = c0406f;
        f2041b = new C0453g<>(16);
    }

    /* renamed from: a */
    public static Typeface m677a(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i) {
        return f2040a.mo651c(context, cancellationSignal, c0433fArr, i);
    }

    /* renamed from: b */
    public static Typeface m676b(Context context, C0388a.InterfaceC0389a interfaceC0389a, Resources resources, int i, int i2, C0393b.AbstractC0394a abstractC0394a, Handler handler, boolean z) {
        Typeface mo652b;
        if (interfaceC0389a instanceof C0388a.C0392d) {
            C0388a.C0392d c0392d = (C0388a.C0392d) interfaceC0389a;
            boolean z2 = false;
            if (!z ? abstractC0394a == null : c0392d.m716a() == 0) {
                z2 = true;
            }
            mo652b = C0427b.m592k(context, c0392d.m715b(), abstractC0394a, handler, z2, z ? c0392d.m714c() : -1, i2);
        } else {
            mo652b = f2040a.mo652b(context, (C0388a.C0390b) interfaceC0389a, resources, i2);
            if (abstractC0394a != null) {
                if (mo652b != null) {
                    abstractC0394a.m708b(mo652b, handler);
                } else {
                    abstractC0394a.m709a(-3, handler);
                }
            }
        }
        if (mo652b != null) {
            f2041b.m525d(m674d(resources, i, i2), mo652b);
        }
        return mo652b;
    }

    /* renamed from: c */
    public static Typeface m675c(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo653a = f2040a.mo653a(context, resources, i, str, i2);
        if (mo653a != null) {
            f2041b.m525d(m674d(resources, i, i2), mo653a);
        }
        return mo653a;
    }

    /* renamed from: d */
    private static String m674d(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: e */
    public static Typeface m673e(Resources resources, int i, int i2) {
        return f2041b.m526c(m674d(resources, i, i2));
    }
}