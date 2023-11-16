package android.support.p001v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.app.f */
/* loaded from: classes.dex */
abstract class AbstractActivityC0072f extends AbstractActivityC0071e {

    /* renamed from: e */
    boolean f385e;

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f385e && i != -1) {
            AbstractActivityC0071e.m2198g(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f384d && i != -1) {
            AbstractActivityC0071e.m2198g(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}