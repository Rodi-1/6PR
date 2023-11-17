package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.c;
import android.os.Bundle;

/* loaded from: classes.dex */
public class z extends Activity implements android.arch.lifecycle.e {

    /* renamed from: b  reason: collision with root package name */
    private n.k<Class<Object>, Object> f477b = new n.k<>();

    /* renamed from: c  reason: collision with root package name */
    private android.arch.lifecycle.f f478c = new android.arch.lifecycle.f(this);

    public android.arch.lifecycle.c a() {
        return this.f478c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        android.arch.lifecycle.k.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f478c.i(c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}