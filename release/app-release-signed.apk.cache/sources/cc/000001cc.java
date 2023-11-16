package p014m;

import android.util.Base64;
import java.util.List;
import p015n.C0461j;

/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C0426a {

    /* renamed from: a */
    private final String f2071a;

    /* renamed from: b */
    private final String f2072b;

    /* renamed from: c */
    private final String f2073c;

    /* renamed from: d */
    private final List<List<byte[]>> f2074d;

    /* renamed from: e */
    private final int f2075e;

    /* renamed from: f */
    private final String f2076f;

    public C0426a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) C0461j.m500a(str);
        this.f2071a = str4;
        String str5 = (String) C0461j.m500a(str2);
        this.f2072b = str5;
        String str6 = (String) C0461j.m500a(str3);
        this.f2073c = str6;
        this.f2074d = (List) C0461j.m500a(list);
        this.f2075e = 0;
        this.f2076f = str4 + "-" + str5 + "-" + str6;
    }

    /* renamed from: a */
    public List<List<byte[]>> m608a() {
        return this.f2074d;
    }

    /* renamed from: b */
    public int m607b() {
        return this.f2075e;
    }

    /* renamed from: c */
    public String m606c() {
        return this.f2076f;
    }

    /* renamed from: d */
    public String m605d() {
        return this.f2071a;
    }

    /* renamed from: e */
    public String m604e() {
        return this.f2072b;
    }

    /* renamed from: f */
    public String m603f() {
        return this.f2073c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2071a + ", mProviderPackage: " + this.f2072b + ", mQuery: " + this.f2073c + ", mCertificates:");
        for (int i = 0; i < this.f2074d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f2074d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2075e);
        return sb.toString();
    }
}