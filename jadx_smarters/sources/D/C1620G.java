package d;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import org.achartengine.chart.TimeChart;

/* JADX INFO: renamed from: d.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1620G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1620G f39262d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f39264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f39265c = new a();

    /* JADX INFO: renamed from: d.G$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f39267b;
    }

    public C1620G(Context context, LocationManager locationManager) {
        this.f39263a = context;
        this.f39264b = locationManager;
    }

    public static C1620G a(Context context) {
        if (f39262d == null) {
            Context applicationContext = context.getApplicationContext();
            f39262d = new C1620G(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f39262d;
    }

    public final Location b() {
        Location locationC = E.d.b(this.f39263a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = E.d.b(this.f39263a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.f39264b.isProviderEnabled(str)) {
                return this.f39264b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e9) {
            Log.d("TwilightManager", "Failed to get last known location", e9);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f39265c;
        if (e()) {
            return aVar.f39266a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f39266a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i9 = Calendar.getInstance().get(11);
        return i9 < 6 || i9 >= 22;
    }

    public final boolean e() {
        return this.f39265c.f39267b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j9;
        a aVar = this.f39265c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1619F c1619fB = C1619F.b();
        c1619fB.a(jCurrentTimeMillis - TimeChart.DAY, location.getLatitude(), location.getLongitude());
        c1619fB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z9 = c1619fB.f39261c == 1;
        long j10 = c1619fB.f39260b;
        long j11 = c1619fB.f39259a;
        c1619fB.a(jCurrentTimeMillis + TimeChart.DAY, location.getLatitude(), location.getLongitude());
        long j12 = c1619fB.f39260b;
        if (j10 == -1 || j11 == -1) {
            j9 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j11) {
                j12 = jCurrentTimeMillis > j10 ? j11 : j10;
            }
            j9 = j12 + 60000;
        }
        aVar.f39266a = z9;
        aVar.f39267b = j9;
    }
}
