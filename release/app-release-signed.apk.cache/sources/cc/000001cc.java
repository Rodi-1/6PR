package m;

import android.util.Base64;
import java.util.List;
import n.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f1558a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1559b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1560c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f1561d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1562e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1563f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) j.a(str);
        this.f1558a = str4;
        String str5 = (String) j.a(str2);
        this.f1559b = str5;
        String str6 = (String) j.a(str3);
        this.f1560c = str6;
        this.f1561d = (List) j.a(list);
        this.f1562e = 0;
        this.f1563f = str4 + "-" + str5 + "-" + str6;
    }

    public List<List<byte[]>> a() {
        return this.f1561d;
    }

    public int b() {
        return this.f1562e;
    }

    public String c() {
        return this.f1563f;
    }

    public String d() {
        return this.f1558a;
    }

    public String e() {
        return this.f1559b;
    }

    public String f() {
        return this.f1560c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1558a + ", mProviderPackage: " + this.f1559b + ", mQuery: " + this.f1560c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f1561d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f1561d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1562e);
        return sb.toString();
    }
}