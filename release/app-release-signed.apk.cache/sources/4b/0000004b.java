package android.support.p001v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p008g.C0386a;

/* renamed from: android.support.v4.app.a0 */
/* loaded from: classes.dex */
public final class C0062a0 implements Iterable<Intent> {

    /* renamed from: d */
    private static final C0065c f342d = new C0064b();

    /* renamed from: b */
    private final ArrayList<Intent> f343b = new ArrayList<>();

    /* renamed from: c */
    private final Context f344c;

    /* renamed from: android.support.v4.app.a0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0063a {
        /* renamed from: f */
        Intent mo286f();
    }

    /* renamed from: android.support.v4.app.a0$b */
    /* loaded from: classes.dex */
    static class C0064b extends C0065c {
        C0064b() {
        }
    }

    /* renamed from: android.support.v4.app.a0$c */
    /* loaded from: classes.dex */
    static class C0065c {
        C0065c() {
        }
    }

    private C0062a0(Context context) {
        this.f344c = context;
    }

    /* renamed from: d */
    public static C0062a0 m2221d(Context context) {
        return new C0062a0(context);
    }

    /* renamed from: a */
    public C0062a0 m2224a(Intent intent) {
        this.f343b.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0062a0 m2223b(Activity activity) {
        Intent mo286f = activity instanceof InterfaceC0063a ? ((InterfaceC0063a) activity).mo286f() : null;
        if (mo286f == null) {
            mo286f = C0126v.m1827a(activity);
        }
        if (mo286f != null) {
            ComponentName component = mo286f.getComponent();
            if (component == null) {
                component = mo286f.resolveActivity(this.f344c.getPackageManager());
            }
            m2222c(component);
            m2224a(mo286f);
        }
        return this;
    }

    /* renamed from: c */
    public C0062a0 m2222c(ComponentName componentName) {
        int size = this.f343b.size();
        try {
            Context context = this.f344c;
            while (true) {
                Intent m1826b = C0126v.m1826b(context, componentName);
                if (m1826b == null) {
                    return this;
                }
                this.f343b.add(size, m1826b);
                context = this.f344c;
                componentName = m1826b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public void m2220e() {
        m2219f(null);
    }

    /* renamed from: f */
    public void m2219f(Bundle bundle) {
        if (this.f343b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f343b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0386a.m733c(this.f344c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f344c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f343b.iterator();
    }
}