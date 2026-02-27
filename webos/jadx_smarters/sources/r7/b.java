package R7;

import com.onesignal.G1;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1 f9351a;

    public b(G1 client) {
        l.e(client, "client");
        this.f9351a = client;
    }

    public final G1 b() {
        return this.f9351a;
    }
}
