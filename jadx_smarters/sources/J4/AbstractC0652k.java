package J4;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;

/* JADX INFO: renamed from: J4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0652k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f3296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0646e f3297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC0648g f3298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC0657p f3299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.g f3300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.AbstractC0252a f3301f;

    static {
        a.g gVar = new a.g();
        f3300e = gVar;
        G g9 = new G();
        f3301f = g9;
        f3296a = new com.google.android.gms.common.api.a("LocationServices.API", g9, gVar);
        f3297b = new zzz();
        f3298c = new zzaf();
        f3299d = new zzbi();
    }

    public static zzaz a(GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.r.b(googleApiClient != null, "GoogleApiClient parameter is required.");
        zzaz zzazVar = (zzaz) googleApiClient.g(f3300e);
        com.google.android.gms.common.internal.r.q(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }
}
