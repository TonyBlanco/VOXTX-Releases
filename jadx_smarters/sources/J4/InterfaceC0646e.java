package J4;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: renamed from: J4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0646e {
    Location getLastLocation(GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.f removeLocationUpdates(GoogleApiClient googleApiClient, InterfaceC0651j interfaceC0651j);

    com.google.android.gms.common.api.f requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, InterfaceC0651j interfaceC0651j);
}
