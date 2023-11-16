package android.support.p001v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: android.support.v4.app.b */
/* loaded from: classes.dex */
public final class C0066b {
    /* renamed from: a */
    public static int m2218a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static String m2217b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}