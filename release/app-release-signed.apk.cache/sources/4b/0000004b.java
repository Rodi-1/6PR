package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 implements Iterable<Intent> {

    /* renamed from: d  reason: collision with root package name */
    private static final c f236d = new b();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Intent> f237b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f238c;

    /* loaded from: classes.dex */
    public interface a {
        Intent f();
    }

    /* loaded from: classes.dex */
    static class b extends c {
        b() {
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }
    }

    private a0(Context context) {
        this.f238c = context;
    }

    public static a0 d(Context context) {
        return new a0(context);
    }

    public a0 a(Intent intent) {
        this.f237b.add(intent);
        return this;
    }

    public a0 b(Activity activity) {
        Intent f2 = activity instanceof a ? ((a) activity).f() : null;
        if (f2 == null) {
            f2 = v.a(activity);
        }
        if (f2 != null) {
            ComponentName component = f2.getComponent();
            if (component == null) {
                component = f2.resolveActivity(this.f238c.getPackageManager());
            }
            c(component);
            a(f2);
        }
        return this;
    }

    public a0 c(ComponentName componentName) {
        int size = this.f237b.size();
        try {
            Context context = this.f238c;
            while (true) {
                Intent b2 = v.b(context, componentName);
                if (b2 == null) {
                    return this;
                }
                this.f237b.add(size, b2);
                context = this.f238c;
                componentName = b2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f237b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f237b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (g.a.c(this.f238c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f238c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f237b.iterator();
    }
}