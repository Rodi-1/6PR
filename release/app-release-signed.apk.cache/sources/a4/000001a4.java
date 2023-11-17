package g;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1507a = new Object();

    public static ColorStateList a(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i2) : context.getResources().getColorStateList(i2);
    }

    public static Drawable b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i2) : context.getResources().getDrawable(i2);
    }

    public static boolean c(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}