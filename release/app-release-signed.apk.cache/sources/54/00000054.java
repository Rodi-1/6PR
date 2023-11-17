package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
abstract class e extends z {

    /* renamed from: d  reason: collision with root package name */
    boolean f278d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    abstract View h(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View h2 = h(view, str, context, attributeSet);
        return h2 == null ? super.onCreateView(view, str, context, attributeSet) : h2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View h2 = h(null, str, context, attributeSet);
        return h2 == null ? super.onCreateView(str, context, attributeSet) : h2;
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.f278d && i2 != -1) {
            g(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }
}