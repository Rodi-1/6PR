package p009h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: h.b */
/* loaded from: classes.dex */
public final class C0393b {

    /* renamed from: h.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0394a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h.b$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0395a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Typeface f2031b;

            RunnableC0395a(Typeface typeface) {
                this.f2031b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0394a.this.mo706d(this.f2031b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h.b$a$b */
        /* loaded from: classes.dex */
        public class RunnableC0396b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f2033b;

            RunnableC0396b(int i) {
                this.f2033b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0394a.this.mo707c(this.f2033b);
            }
        }

        /* renamed from: a */
        public final void m709a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0396b(i));
        }

        /* renamed from: b */
        public final void m708b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0395a(typeface));
        }

        /* renamed from: c */
        public abstract void mo707c(int i);

        /* renamed from: d */
        public abstract void mo706d(Typeface typeface);
    }

    /* renamed from: a */
    public static Drawable m713a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: b */
    public static Typeface m712b(Context context, int i, TypedValue typedValue, int i2, AbstractC0394a abstractC0394a) {
        if (context.isRestricted()) {
            return null;
        }
        return m711c(context, i, typedValue, i2, abstractC0394a, null, true);
    }

    /* renamed from: c */
    private static Typeface m711c(Context context, int i, TypedValue typedValue, int i2, AbstractC0394a abstractC0394a, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m710d = m710d(context, resources, typedValue, i, i2, abstractC0394a, handler, z);
        if (m710d == null && abstractC0394a == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m710d;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m710d(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p009h.C0393b.AbstractC0394a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L9a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.m709a(r14, r10)
        L25:
            return r13
        L26:
            android.graphics.Typeface r1 = p010i.C0402c.m673e(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.m708b(r1, r10)
        L31:
            return r1
        L32:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r1 == 0) goto L65
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            h.a$a r2 = p009h.C0388a.m730a(r1, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r2 != 0) goto L53
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L52
            r9.m709a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L52:
            return r13
        L53:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p010i.C0402c.m676b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            return r0
        L65:
            r1 = r15
            android.graphics.Typeface r0 = p010i.C0402c.m675c(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L75
            if (r0 == 0) goto L72
            r9.m708b(r0, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            goto L75
        L72:
            r9.m709a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L75:
            return r0
        L76:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L87
        L7f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L87:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L99
            r9.m709a(r14, r10)
        L99:
            return r13
        L9a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p009h.C0393b.m710d(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, h.b$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}