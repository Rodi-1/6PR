package android.support.v7.widget;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class x0 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            y0.h(view, charSequence);
        }
    }
}