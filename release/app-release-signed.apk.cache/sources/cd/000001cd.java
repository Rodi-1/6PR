package p014m;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p009h.C0388a;
import p009h.C0393b;
import p010i.C0402c;
import p010i.C0412i;
import p014m.C0435c;
import p015n.C0453g;
import p015n.C0461j;
import p015n.C0462k;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C0427b {

    /* renamed from: a */
    private static final C0453g<String, Typeface> f2077a = new C0453g<>(16);

    /* renamed from: b */
    private static final C0435c f2078b = new C0435c("fonts", 10, 10000);

    /* renamed from: c */
    private static final Object f2079c = new Object();

    /* renamed from: d */
    private static final C0462k<String, ArrayList<C0435c.InterfaceC0440d<C0434g>>> f2080d = new C0462k<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f2081e = new C0431d();

    /* renamed from: m.b$a */
    /* loaded from: classes.dex */
    static class CallableC0428a implements Callable<C0434g> {

        /* renamed from: a */
        final /* synthetic */ Context f2082a;

        /* renamed from: b */
        final /* synthetic */ C0426a f2083b;

        /* renamed from: c */
        final /* synthetic */ int f2084c;

        /* renamed from: d */
        final /* synthetic */ String f2085d;

        CallableC0428a(Context context, C0426a c0426a, int i, String str) {
            this.f2082a = context;
            this.f2083b = c0426a;
            this.f2084c = i;
            this.f2085d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0434g call() {
            C0434g m593j = C0427b.m593j(this.f2082a, this.f2083b, this.f2084c);
            if (m593j.f2096a != null) {
                C0427b.f2077a.m525d(this.f2085d, m593j.f2096a);
            }
            return m593j;
        }
    }

    /* renamed from: m.b$b */
    /* loaded from: classes.dex */
    static class C0429b implements C0435c.InterfaceC0440d<C0434g> {

        /* renamed from: a */
        final /* synthetic */ C0393b.AbstractC0394a f2086a;

        /* renamed from: b */
        final /* synthetic */ Handler f2087b;

        C0429b(C0393b.AbstractC0394a abstractC0394a, Handler handler) {
            this.f2086a = abstractC0394a;
            this.f2087b = handler;
        }

        @Override // p014m.C0435c.InterfaceC0440d
        /* renamed from: b */
        public void mo571a(C0434g c0434g) {
            int i;
            C0393b.AbstractC0394a abstractC0394a;
            if (c0434g == null) {
                abstractC0394a = this.f2086a;
                i = 1;
            } else {
                i = c0434g.f2097b;
                if (i == 0) {
                    this.f2086a.m708b(c0434g.f2096a, this.f2087b);
                    return;
                }
                abstractC0394a = this.f2086a;
            }
            abstractC0394a.m709a(i, this.f2087b);
        }
    }

    /* renamed from: m.b$c */
    /* loaded from: classes.dex */
    static class C0430c implements C0435c.InterfaceC0440d<C0434g> {

        /* renamed from: a */
        final /* synthetic */ String f2088a;

        C0430c(String str) {
            this.f2088a = str;
        }

        @Override // p014m.C0435c.InterfaceC0440d
        /* renamed from: b */
        public void mo571a(C0434g c0434g) {
            synchronized (C0427b.f2079c) {
                ArrayList arrayList = (ArrayList) C0427b.f2080d.get(this.f2088a);
                if (arrayList == null) {
                    return;
                }
                C0427b.f2080d.remove(this.f2088a);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C0435c.InterfaceC0440d) arrayList.get(i)).mo571a(c0434g);
                }
            }
        }
    }

    /* renamed from: m.b$d */
    /* loaded from: classes.dex */
    static class C0431d implements Comparator<byte[]> {
        C0431d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* renamed from: m.b$e */
    /* loaded from: classes.dex */
    public static class C0432e {

        /* renamed from: a */
        private final int f2089a;

        /* renamed from: b */
        private final C0433f[] f2090b;

        public C0432e(int i, C0433f[] c0433fArr) {
            this.f2089a = i;
            this.f2090b = c0433fArr;
        }

        /* renamed from: a */
        public C0433f[] m585a() {
            return this.f2090b;
        }

        /* renamed from: b */
        public int m584b() {
            return this.f2089a;
        }
    }

    /* renamed from: m.b$f */
    /* loaded from: classes.dex */
    public static class C0433f {

        /* renamed from: a */
        private final Uri f2091a;

        /* renamed from: b */
        private final int f2092b;

        /* renamed from: c */
        private final int f2093c;

        /* renamed from: d */
        private final boolean f2094d;

        /* renamed from: e */
        private final int f2095e;

        public C0433f(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2091a = (Uri) C0461j.m500a(uri);
            this.f2092b = i;
            this.f2093c = i2;
            this.f2094d = z;
            this.f2095e = i3;
        }

        /* renamed from: a */
        public int m583a() {
            return this.f2095e;
        }

        /* renamed from: b */
        public int m582b() {
            return this.f2092b;
        }

        /* renamed from: c */
        public Uri m581c() {
            return this.f2091a;
        }

        /* renamed from: d */
        public int m580d() {
            return this.f2093c;
        }

        /* renamed from: e */
        public boolean m579e() {
            return this.f2094d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m.b$g */
    /* loaded from: classes.dex */
    public static final class C0434g {

        /* renamed from: a */
        final Typeface f2096a;

        /* renamed from: b */
        final int f2097b;

        C0434g(Typeface typeface, int i) {
            this.f2096a = typeface;
            this.f2097b = i;
        }
    }

    /* renamed from: e */
    private static List<byte[]> m598e(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: f */
    private static boolean m597f(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static C0432e m596g(Context context, CancellationSignal cancellationSignal, C0426a c0426a) {
        ProviderInfo m591l = m591l(context.getPackageManager(), c0426a, context.getResources());
        return m591l == null ? new C0432e(1, null) : new C0432e(0, m594i(context, c0426a, m591l.authority, cancellationSignal));
    }

    /* renamed from: h */
    private static List<List<byte[]>> m595h(C0426a c0426a, Resources resources) {
        return c0426a.m608a() != null ? c0426a.m608a() : C0388a.m729b(resources, c0426a.m607b());
    }

    /* renamed from: i */
    static C0433f[] m594i(Context context, C0426a c0426a, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0426a.m603f()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new C0433f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0433f[]) arrayList.toArray(new C0433f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static C0434g m593j(Context context, C0426a c0426a, int i) {
        try {
            C0432e m596g = m596g(context, null, c0426a);
            if (m596g.m584b() != 0) {
                return new C0434g(null, m596g.m584b() == 1 ? -2 : -3);
            }
            Typeface m677a = C0402c.m677a(context, null, m596g.m585a(), i);
            return new C0434g(m677a, m677a != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0434g(null, -1);
        }
    }

    /* renamed from: k */
    public static Typeface m592k(Context context, C0426a c0426a, C0393b.AbstractC0394a abstractC0394a, Handler handler, boolean z, int i, int i2) {
        String str = c0426a.m606c() + "-" + i2;
        Typeface m526c = f2077a.m526c(str);
        if (m526c != null) {
            if (abstractC0394a != null) {
                abstractC0394a.mo706d(m526c);
            }
            return m526c;
        } else if (z && i == -1) {
            C0434g m593j = m593j(context, c0426a, i2);
            if (abstractC0394a != null) {
                int i3 = m593j.f2097b;
                if (i3 == 0) {
                    abstractC0394a.m708b(m593j.f2096a, handler);
                } else {
                    abstractC0394a.m709a(i3, handler);
                }
            }
            return m593j.f2096a;
        } else {
            CallableC0428a callableC0428a = new CallableC0428a(context, c0426a, i2, str);
            if (z) {
                try {
                    return ((C0434g) f2078b.m572g(callableC0428a, i)).f2096a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            C0429b c0429b = abstractC0394a == null ? null : new C0429b(abstractC0394a, handler);
            synchronized (f2079c) {
                C0462k<String, ArrayList<C0435c.InterfaceC0440d<C0434g>>> c0462k = f2080d;
                if (c0462k.containsKey(str)) {
                    if (c0429b != null) {
                        c0462k.get(str).add(c0429b);
                    }
                    return null;
                }
                if (c0429b != null) {
                    ArrayList<C0435c.InterfaceC0440d<C0434g>> arrayList = new ArrayList<>();
                    arrayList.add(c0429b);
                    c0462k.put(str, arrayList);
                }
                f2078b.m573f(callableC0428a, new C0430c(str));
                return null;
            }
        }
    }

    /* renamed from: l */
    public static ProviderInfo m591l(PackageManager packageManager, C0426a c0426a, Resources resources) {
        String m605d = c0426a.m605d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m605d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m605d);
        } else if (!resolveContentProvider.packageName.equals(c0426a.m604e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m605d + ", but package was not " + c0426a.m604e());
        } else {
            List<byte[]> m598e = m598e(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(m598e, f2081e);
            List<List<byte[]>> m595h = m595h(c0426a, resources);
            for (int i = 0; i < m595h.size(); i++) {
                ArrayList arrayList = new ArrayList(m595h.get(i));
                Collections.sort(arrayList, f2081e);
                if (m597f(m598e, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    /* renamed from: m */
    public static Map<Uri, ByteBuffer> m590m(Context context, C0433f[] c0433fArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0433f c0433f : c0433fArr) {
            if (c0433f.m583a() == 0) {
                Uri m581c = c0433f.m581c();
                if (!hashMap.containsKey(m581c)) {
                    hashMap.put(m581c, C0412i.m635f(context, cancellationSignal, m581c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}