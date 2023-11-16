package p009h;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p004c.C0346b;
import p014m.C0426a;

/* renamed from: h.a */
/* loaded from: classes.dex */
public class C0388a {

    /* renamed from: h.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0389a {
    }

    /* renamed from: h.a$b */
    /* loaded from: classes.dex */
    public static final class C0390b implements InterfaceC0389a {

        /* renamed from: a */
        private final C0391c[] f2021a;

        public C0390b(C0391c[] c0391cArr) {
            this.f2021a = c0391cArr;
        }

        /* renamed from: a */
        public C0391c[] m723a() {
            return this.f2021a;
        }
    }

    /* renamed from: h.a$c */
    /* loaded from: classes.dex */
    public static final class C0391c {

        /* renamed from: a */
        private final String f2022a;

        /* renamed from: b */
        private int f2023b;

        /* renamed from: c */
        private boolean f2024c;

        /* renamed from: d */
        private String f2025d;

        /* renamed from: e */
        private int f2026e;

        /* renamed from: f */
        private int f2027f;

        public C0391c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2022a = str;
            this.f2023b = i;
            this.f2024c = z;
            this.f2025d = str2;
            this.f2026e = i2;
            this.f2027f = i3;
        }

        /* renamed from: a */
        public String m722a() {
            return this.f2022a;
        }

        /* renamed from: b */
        public int m721b() {
            return this.f2027f;
        }

        /* renamed from: c */
        public int m720c() {
            return this.f2026e;
        }

        /* renamed from: d */
        public String m719d() {
            return this.f2025d;
        }

        /* renamed from: e */
        public int m718e() {
            return this.f2023b;
        }

        /* renamed from: f */
        public boolean m717f() {
            return this.f2024c;
        }
    }

    /* renamed from: h.a$d */
    /* loaded from: classes.dex */
    public static final class C0392d implements InterfaceC0389a {

        /* renamed from: a */
        private final C0426a f2028a;

        /* renamed from: b */
        private final int f2029b;

        /* renamed from: c */
        private final int f2030c;

        public C0392d(C0426a c0426a, int i, int i2) {
            this.f2028a = c0426a;
            this.f2030c = i;
            this.f2029b = i2;
        }

        /* renamed from: a */
        public int m716a() {
            return this.f2030c;
        }

        /* renamed from: b */
        public C0426a m715b() {
            return this.f2028a;
        }

        /* renamed from: c */
        public int m714c() {
            return this.f2029b;
        }
    }

    /* renamed from: a */
    public static InterfaceC0389a m730a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m728c(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static List<List<byte[]>> m729b(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(m724g(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(m724g(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: c */
    private static InterfaceC0389a m728c(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m727d(xmlPullParser, resources);
        }
        m725f(xmlPullParser);
        return null;
    }

    /* renamed from: d */
    private static InterfaceC0389a m727d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0346b.f1605a);
        String string = obtainAttributes.getString(C0346b.f1606b);
        String string2 = obtainAttributes.getString(C0346b.f1610f);
        String string3 = obtainAttributes.getString(C0346b.f1611g);
        int resourceId = obtainAttributes.getResourceId(C0346b.f1607c, 0);
        int integer = obtainAttributes.getInteger(C0346b.f1608d, 1);
        int integer2 = obtainAttributes.getInteger(C0346b.f1609e, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m725f(xmlPullParser);
            }
            return new C0392d(new C0426a(string, string2, string3, m729b(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m726e(xmlPullParser, resources));
                } else {
                    m725f(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0390b((C0391c[]) arrayList.toArray(new C0391c[arrayList.size()]));
    }

    /* renamed from: e */
    private static C0391c m726e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0346b.f1612h);
        int i = C0346b.f1621q;
        if (!obtainAttributes.hasValue(i)) {
            i = C0346b.f1614j;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C0346b.f1619o;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C0346b.f1615k;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C0346b.f1622r;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C0346b.f1616l;
        }
        int i5 = C0346b.f1620p;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C0346b.f1617m;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C0346b.f1618n;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C0346b.f1613i;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m725f(xmlPullParser);
        }
        return new C0391c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: f */
    private static void m725f(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: g */
    private static List<byte[]> m724g(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}