package android.support.p001v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.app.e */
/* loaded from: classes.dex */
abstract class AbstractActivityC0071e extends ActivityC0130z {

    /* renamed from: d */
    boolean f384d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m2198g(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: h */
    abstract View mo2083h(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View mo2083h = mo2083h(view, str, context, attributeSet);
        return mo2083h == null ? super.onCreateView(view, str, context, attributeSet) : mo2083h;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View mo2083h = mo2083h(null, str, context, attributeSet);
        return mo2083h == null ? super.onCreateView(str, context, attributeSet) : mo2083h;
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f384d && i != -1) {
            m2198g(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}