package com.onesignal;

import J4.AbstractC0652k;
import J4.InterfaceC0651j;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.F1;
import org.apache.http.HttpStatus;
import w4.C2914b;

/* JADX INFO: renamed from: com.onesignal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1592v extends O {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static B f38900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static d f38901k;

    /* JADX INFO: renamed from: com.onesignal.v$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(AbstractC1592v.s());
                F1.a(F1.v.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                O.e();
                O.m(O.f38402g);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.v$b */
    public static class b {
        public static Location a(GoogleApiClient googleApiClient) {
            synchronized (O.f38399d) {
                try {
                    if (!googleApiClient.j()) {
                        return null;
                    }
                    return AbstractC0652k.f3297b.getLastLocation(googleApiClient);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, InterfaceC0651j interfaceC0651j) {
            try {
                synchronized (O.f38399d) {
                    try {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        if (googleApiClient.j()) {
                            AbstractC0652k.f3297b.requestLocationUpdates(googleApiClient, locationRequest, interfaceC0651j);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                F1.b(F1.v.WARN, "FusedLocationApi.requestLocationUpdates failed!", th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.v$c */
    public static class c implements GoogleApiClient.b, GoogleApiClient.c {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
        public void onConnected(Bundle bundle) {
            synchronized (O.f38399d) {
                try {
                    if (AbstractC1592v.f38900j != null && AbstractC1592v.f38900j.c() != null) {
                        F1.v vVar = F1.v.DEBUG;
                        F1.a(vVar, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + O.f38403h);
                        if (O.f38403h == null) {
                            O.f38403h = b.a(AbstractC1592v.f38900j.c());
                            F1.a(vVar, "GMSLocationController GoogleApiClientListener lastLocation: " + O.f38403h);
                            Location location = O.f38403h;
                            if (location != null) {
                                O.d(location);
                            }
                        }
                        AbstractC1592v.f38901k = new d(AbstractC1592v.f38900j.c());
                        return;
                    }
                    F1.a(F1.v.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
        public void onConnectionFailed(C2914b c2914b) {
            F1.a(F1.v.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + c2914b);
            AbstractC1592v.e();
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
        public void onConnectionSuspended(int i9) {
            F1.a(F1.v.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i9);
            AbstractC1592v.e();
        }
    }

    /* JADX INFO: renamed from: com.onesignal.v$d */
    public static class d implements InterfaceC0651j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GoogleApiClient f38902a;

        public d(GoogleApiClient googleApiClient) {
            this.f38902a = googleApiClient;
            b();
        }

        @Override // J4.InterfaceC0651j
        public void a(Location location) {
            F1.a(F1.v.DEBUG, "GMSLocationController onLocationChanged: " + location);
            O.f38403h = location;
        }

        public final void b() {
            long j9 = F1.N0() ? 270000L : 570000L;
            if (this.f38902a != null) {
                LocationRequest locationRequestN = LocationRequest.H().K(j9).L(j9).M((long) (j9 * 1.5d)).N(HttpStatus.SC_PROCESSING);
                F1.a(F1.v.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                b.b(this.f38902a, locationRequestN, this);
            }
        }
    }

    public static void e() {
        synchronized (O.f38399d) {
            try {
                B b9 = f38900j;
                if (b9 != null) {
                    b9.b();
                }
                f38900j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l() {
        synchronized (O.f38399d) {
            try {
                F1.a(F1.v.DEBUG, "GMSLocationController onFocusChange!");
                B b9 = f38900j;
                if (b9 != null && b9.c().j()) {
                    B b10 = f38900j;
                    if (b10 != null) {
                        GoogleApiClient googleApiClientC = b10.c();
                        if (f38901k != null) {
                            AbstractC0652k.f3297b.removeLocationUpdates(googleApiClientC, f38901k);
                        }
                        f38901k = new d(googleApiClientC);
                    }
                }
            } finally {
            }
        }
    }

    public static void p() {
        t();
    }

    public static int s() {
        return 30000;
    }

    public static void t() {
        Location location;
        if (O.f38401f != null) {
            return;
        }
        synchronized (O.f38399d) {
            try {
                u();
                if (f38900j == null || (location = O.f38403h) == null) {
                    c cVar = new c(null);
                    B b9 = new B(new GoogleApiClient.a(O.f38402g).a(AbstractC0652k.f3296a).b(cVar).c(cVar).e(O.h().f38405a).d());
                    f38900j = b9;
                    b9.a();
                } else {
                    O.d(location);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void u() {
        Thread thread = new Thread(new a(), "OS_GMS_LOCATION_FALLBACK");
        O.f38401f = thread;
        thread.start();
    }
}
