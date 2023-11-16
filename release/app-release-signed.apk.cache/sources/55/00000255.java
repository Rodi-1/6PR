package p019r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p008g.C0387b;

/* renamed from: r.n */
/* loaded from: classes.dex */
class C0562n {

    /* renamed from: d */
    private static C0562n f2370d;

    /* renamed from: a */
    private final Context f2371a;

    /* renamed from: b */
    private final LocationManager f2372b;

    /* renamed from: c */
    private final C0563a f2373c = new C0563a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.n$a */
    /* loaded from: classes.dex */
    public static class C0563a {

        /* renamed from: a */
        boolean f2374a;

        /* renamed from: b */
        long f2375b;

        /* renamed from: c */
        long f2376c;

        /* renamed from: d */
        long f2377d;

        /* renamed from: e */
        long f2378e;

        /* renamed from: f */
        long f2379f;

        C0563a() {
        }
    }

    C0562n(Context context, LocationManager locationManager) {
        this.f2371a = context;
        this.f2372b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0562n m148a(Context context) {
        if (f2370d == null) {
            Context applicationContext = context.getApplicationContext();
            f2370d = new C0562n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2370d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m147b() {
        Location m146c = C0387b.m731b(this.f2371a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m146c("network") : null;
        Location m146c2 = C0387b.m731b(this.f2371a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m146c("gps") : null;
        return (m146c2 == null || m146c == null) ? m146c2 != null ? m146c2 : m146c : m146c2.getTime() > m146c.getTime() ? m146c2 : m146c;
    }

    /* renamed from: c */
    private Location m146c(String str) {
        try {
            if (this.f2372b.isProviderEnabled(str)) {
                return this.f2372b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m144e() {
        return this.f2373c.f2379f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m143f(Location location) {
        long j;
        C0563a c0563a = this.f2373c;
        long currentTimeMillis = System.currentTimeMillis();
        C0561m m149b = C0561m.m149b();
        m149b.m150a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m149b.f2367a;
        m149b.m150a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m149b.f2369c == 1;
        long j3 = m149b.f2368b;
        long j4 = m149b.f2367a;
        boolean z2 = z;
        m149b.m150a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m149b.f2368b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        c0563a.f2374a = z2;
        c0563a.f2375b = j2;
        c0563a.f2376c = j3;
        c0563a.f2377d = j4;
        c0563a.f2378e = j5;
        c0563a.f2379f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m145d() {
        C0563a c0563a = this.f2373c;
        if (m144e()) {
            return c0563a.f2374a;
        }
        Location m147b = m147b();
        if (m147b != null) {
            m143f(m147b);
            return c0563a.f2374a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}