package com.onesignal;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.F1;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D extends O {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static FusedLocationProviderClient f38181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static c f38182k;

    public class a implements OnFailureListener {
    }

    public class b implements OnSuccessListener {
    }

    public static class c extends LocationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FusedLocationProviderClient f38183a;

        public c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f38183a = fusedLocationProviderClient;
            a();
        }

        public final void a() {
            long j9 = F1.N0() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j9).setInterval(j9).setMaxWaitTime((long) (j9 * 1.5d)).setPriority(HttpStatus.SC_PROCESSING);
            F1.a(F1.v.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f38183a.requestLocationUpdates(priority, this, O.h().getLooper());
        }
    }

    public static void e() {
        synchronized (O.f38399d) {
            f38181j = null;
        }
    }

    public static void l() {
        synchronized (O.f38399d) {
            try {
                F1.a(F1.v.DEBUG, "HMSLocationController onFocusChange!");
                if (O.k() && f38181j == null) {
                    return;
                }
                FusedLocationProviderClient fusedLocationProviderClient = f38181j;
                if (fusedLocationProviderClient != null) {
                    c cVar = f38182k;
                    if (cVar != null) {
                        fusedLocationProviderClient.removeLocationUpdates(cVar);
                    }
                    f38182k = new c(f38181j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p() {
        q();
    }

    public static void q() {
        synchronized (O.f38399d) {
            if (f38181j == null) {
                try {
                    f38181j = LocationServices.getFusedLocationProviderClient(O.f38402g);
                } catch (Exception e9) {
                    F1.a(F1.v.ERROR, "Huawei LocationServices getFusedLocationProviderClient failed! " + e9);
                    e();
                    return;
                }
            }
            Location location = O.f38403h;
            if (location != null) {
                O.d(location);
            } else {
                f38181j.getLastLocation().addOnSuccessListener(new b()).addOnFailureListener(new a());
            }
        }
    }
}
