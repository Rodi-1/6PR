package android.support.p001v4.app;

import android.app.Activity;
import android.arch.lifecycle.AbstractC0009c;
import android.arch.lifecycle.C0014f;
import android.arch.lifecycle.FragmentC0021k;
import android.arch.lifecycle.InterfaceC0013e;
import android.os.Bundle;
import p015n.C0462k;

/* renamed from: android.support.v4.app.z */
/* loaded from: classes.dex */
public class ActivityC0130z extends Activity implements InterfaceC0013e {

    /* renamed from: b */
    private C0462k<Class<Object>, Object> f621b = new C0462k<>();

    /* renamed from: c */
    private C0014f f622c = new C0014f(this);

    /* renamed from: a */
    public AbstractC0009c mo1819a() {
        return this.f622c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0021k.m2358e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f622c.m2371i(AbstractC0009c.EnumC0011b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}