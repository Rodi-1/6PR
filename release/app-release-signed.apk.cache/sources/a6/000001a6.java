package h;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0013a {
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0013a {

        /* renamed from: a  reason: collision with root package name */
        private final c[] f1508a;

        public b(c[] cVarArr) {
            this.f1508a = cVarArr;
        }

        public c[] a() {
            return this.f1508a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f1509a;

        /* renamed from: b  reason: collision with root package name */
        private int f1510b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1511c;

        /* renamed from: d  reason: collision with root package name */
        private String f1512d;

        /* renamed from: e  reason: collision with root package name */
        private int f1513e;

        /* renamed from: f  reason: collision with root package name */
        private int f1514f;

        public c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.f1509a = str;
            this.f1510b = i2;
            this.f1511c = z;
            this.f1512d = str2;
            this.f1513e = i3;
            this.f1514f = i4;
        }

        public String a() {
            return this.f1509a;
        }

        public int b() {
            return this.f1514f;
        }

        public int c() {
            return this.f1513e;
        }

        public String d() {
            return this.f1512d;
        }

        public int e() {
            return this.f1510b;
        }

        public boolean f() {
            return this.f1511c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0013a {

        /* renamed from: a  reason: collision with root package name */
        private final m.a f1515a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1516b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1517c;

        public d(m.a aVar, int i2, int i3) {
            this.f1515a = aVar;
            this.f1517c = i2;
            this.f1516b = i3;
        }

        public int a() {
            return this.f1517c;
        }

        public m.a b() {
            return this.f1515a;
        }

        public int c() {
            return this.f1516b;
        }
    }

    public static InterfaceC0013a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i2) {
        ArrayList arrayList = null;
        if (i2 != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                        arrayList.add(g(resources.getStringArray(obtainTypedArray.getResourceId(i3, 0))));
                    }
                } else {
                    arrayList.add(g(resources.getStringArray(i2)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    private static InterfaceC0013a c(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return d(xmlPullParser, resources);
        }
        f(xmlPullParser);
        return null;
    }

    private static InterfaceC0013a d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.b.f1293a);
        String string = obtainAttributes.getString(c.b.f1294b);
        String string2 = obtainAttributes.getString(c.b.f1298f);
        String string3 = obtainAttributes.getString(c.b.f1299g);
        int resourceId = obtainAttributes.getResourceId(c.b.f1295c, 0);
        int integer = obtainAttributes.getInteger(c.b.f1296d, 1);
        int integer2 = obtainAttributes.getInteger(c.b.f1297e, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                f(xmlPullParser);
            }
            return new d(new m.a(string, string2, string3, b(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(e(xmlPullParser, resources));
                } else {
                    f(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    private static c e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.b.f1300h);
        int i2 = c.b.f1309q;
        if (!obtainAttributes.hasValue(i2)) {
            i2 = c.b.f1302j;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = c.b.f1307o;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = c.b.f1303k;
        }
        boolean z = 1 == obtainAttributes.getInt(i4, 0);
        int i5 = c.b.f1310r;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = c.b.f1304l;
        }
        int i6 = c.b.f1308p;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = c.b.f1305m;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = c.b.f1306n;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = c.b.f1301i;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            f(xmlPullParser);
        }
        return new c(string2, i3, z, string, i7, resourceId);
    }

    private static void f(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> g(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}