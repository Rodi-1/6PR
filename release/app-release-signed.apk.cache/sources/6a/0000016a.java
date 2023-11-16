package android.support.p002v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.x0 */
/* loaded from: classes.dex */
public class C0328x0 {
    /* renamed from: a */
    public static void m1053a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC0331y0.m1024h(view, charSequence);
        }
    }
}