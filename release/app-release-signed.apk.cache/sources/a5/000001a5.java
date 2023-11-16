package p008g;

import android.content.Context;
import android.os.Process;
import android.support.p001v4.app.C0066b;

/* renamed from: g.b */
/* loaded from: classes.dex */
public final class C0387b {
    /* renamed from: a */
    public static int m732a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m2217b = C0066b.m2217b(str);
        if (m2217b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0066b.m2218a(context, m2217b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m731b(Context context, String str) {
        return m732a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}