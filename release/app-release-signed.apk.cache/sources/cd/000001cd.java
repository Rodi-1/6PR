package m;

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
import h.b;
import i.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import m.c;
import n.j;
import n.k;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final n.g<String, Typeface> f1564a = new n.g<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final m.c f1565b = new m.c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1566c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final k<String, ArrayList<c.d<g>>> f1567d = new k<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f1568e = new d();

    /* loaded from: classes.dex */
    static class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f1569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m.a f1570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1571c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f1572d;

        a(Context context, m.a aVar, int i2, String str) {
            this.f1569a = context;
            this.f1570b = aVar;
            this.f1571c = i2;
            this.f1572d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public g call() {
            g j2 = b.j(this.f1569a, this.f1570b, this.f1571c);
            if (j2.f1583a != null) {
                b.f1564a.d(this.f1572d, j2.f1583a);
            }
            return j2;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0017b implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f1573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Handler f1574b;

        C0017b(b.a aVar, Handler handler) {
            this.f1573a = aVar;
            this.f1574b = handler;
        }

        @Override // m.c.d
        /* renamed from: b */
        public void a(g gVar) {
            int i2;
            b.a aVar;
            if (gVar == null) {
                aVar = this.f1573a;
                i2 = 1;
            } else {
                i2 = gVar.f1584b;
                if (i2 == 0) {
                    this.f1573a.b(gVar.f1583a, this.f1574b);
                    return;
                }
                aVar = this.f1573a;
            }
            aVar.a(i2, this.f1574b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1575a;

        c(String str) {
            this.f1575a = str;
        }

        @Override // m.c.d
        /* renamed from: b */
        public void a(g gVar) {
            synchronized (b.f1566c) {
                ArrayList arrayList = (ArrayList) b.f1567d.get(this.f1575a);
                if (arrayList == null) {
                    return;
                }
                b.f1567d.remove(this.f1575a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((c.d) arrayList.get(i2)).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            if (bArr.length == bArr2.length) {
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    if (bArr[i4] != bArr2[i4]) {
                        i2 = bArr[i4];
                        i3 = bArr2[i4];
                    }
                }
                return 0;
            }
            i2 = bArr.length;
            i3 = bArr2.length;
            return i2 - i3;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f1576a;

        /* renamed from: b  reason: collision with root package name */
        private final f[] f1577b;

        public e(int i2, f[] fVarArr) {
            this.f1576a = i2;
            this.f1577b = fVarArr;
        }

        public f[] a() {
            return this.f1577b;
        }

        public int b() {
            return this.f1576a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f1578a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1579b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1580c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1581d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1582e;

        public f(Uri uri, int i2, int i3, boolean z, int i4) {
            this.f1578a = (Uri) j.a(uri);
            this.f1579b = i2;
            this.f1580c = i3;
            this.f1581d = z;
            this.f1582e = i4;
        }

        public int a() {
            return this.f1582e;
        }

        public int b() {
            return this.f1579b;
        }

        public Uri c() {
            return this.f1578a;
        }

        public int d() {
            return this.f1580c;
        }

        public boolean e() {
            return this.f1581d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f1583a;

        /* renamed from: b  reason: collision with root package name */
        final int f1584b;

        g(Typeface typeface, int i2) {
            this.f1583a = typeface;
            this.f1584b = i2;
        }
    }

    private static List<byte[]> e(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean f(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e g(Context context, CancellationSignal cancellationSignal, m.a aVar) {
        ProviderInfo l2 = l(context.getPackageManager(), aVar, context.getResources());
        return l2 == null ? new e(1, null) : new e(0, i(context, aVar, l2.authority, cancellationSignal));
    }

    private static List<List<byte[]>> h(m.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : h.a.b(resources, aVar.b());
    }

    static f[] i(Context context, m.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g j(Context context, m.a aVar, int i2) {
        try {
            e g2 = g(context, null, aVar);
            if (g2.b() != 0) {
                return new g(null, g2.b() == 1 ? -2 : -3);
            }
            Typeface a2 = i.c.a(context, null, g2.a(), i2);
            return new g(a2, a2 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface k(Context context, m.a aVar, b.a aVar2, Handler handler, boolean z, int i2, int i3) {
        String str = aVar.c() + "-" + i3;
        Typeface c2 = f1564a.c(str);
        if (c2 != null) {
            if (aVar2 != null) {
                aVar2.d(c2);
            }
            return c2;
        } else if (z && i2 == -1) {
            g j2 = j(context, aVar, i3);
            if (aVar2 != null) {
                int i4 = j2.f1584b;
                if (i4 == 0) {
                    aVar2.b(j2.f1583a, handler);
                } else {
                    aVar2.a(i4, handler);
                }
            }
            return j2.f1583a;
        } else {
            a aVar3 = new a(context, aVar, i3, str);
            if (z) {
                try {
                    return ((g) f1565b.g(aVar3, i2)).f1583a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            C0017b c0017b = aVar2 == null ? null : new C0017b(aVar2, handler);
            synchronized (f1566c) {
                k<String, ArrayList<c.d<g>>> kVar = f1567d;
                if (kVar.containsKey(str)) {
                    if (c0017b != null) {
                        kVar.get(str).add(c0017b);
                    }
                    return null;
                }
                if (c0017b != null) {
                    ArrayList<c.d<g>> arrayList = new ArrayList<>();
                    arrayList.add(c0017b);
                    kVar.put(str, arrayList);
                }
                f1565b.f(aVar3, new c(str));
                return null;
            }
        }
    }

    public static ProviderInfo l(PackageManager packageManager, m.a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (!resolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        } else {
            List<byte[]> e2 = e(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(e2, f1568e);
            List<List<byte[]>> h2 = h(aVar, resources);
            for (int i2 = 0; i2 < h2.size(); i2++) {
                ArrayList arrayList = new ArrayList(h2.get(i2));
                Collections.sort(arrayList, f1568e);
                if (f(e2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static Map<Uri, ByteBuffer> m(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, i.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}