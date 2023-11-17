package r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class n {

    /* renamed from: d  reason: collision with root package name */
    private static n f1823d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1824a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f1825b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1826c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1827a;

        /* renamed from: b  reason: collision with root package name */
        long f1828b;

        /* renamed from: c  reason: collision with root package name */
        long f1829c;

        /* renamed from: d  reason: collision with root package name */
        long f1830d;

        /* renamed from: e  reason: collision with root package name */
        long f1831e;

        /* renamed from: f  reason: collision with root package name */
        long f1832f;

        a() {
        }
    }

    n(Context context, LocationManager locationManager) {
        this.f1824a = context;
        this.f1825b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(Context context) {
        if (f1823d == null) {
            Context applicationContext = context.getApplicationContext();
            f1823d = new n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1823d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c2 = g.b.b(this.f1824a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c3 = g.b.b(this.f1824a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c3 == null || c2 == null) ? c3 != null ? c3 : c2 : c3.getTime() > c2.getTime() ? c3 : c2;
    }

    private Location c(String str) {
        try {
            if (this.f1825b.isProviderEnabled(str)) {
                return this.f1825b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f1826c.f1832f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.f1826c;
        long currentTimeMillis = System.currentTimeMillis();
        m b2 = m.b();
        b2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b2.f1820a;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f1822c == 1;
        long j4 = b2.f1821b;
        long j5 = b2.f1820a;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b2.f1821b;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j5 ? 0 + j6 : currentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.f1827a = z2;
        aVar.f1828b = j3;
        aVar.f1829c = j4;
        aVar.f1830d = j5;
        aVar.f1831e = j6;
        aVar.f1832f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f1826c;
        if (e()) {
            return aVar.f1827a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.f1827a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}