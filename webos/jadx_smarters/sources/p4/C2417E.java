package p4;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;
import n4.D0;
import okhttp3.internal.ws.WebSocketProtocol;
import t4.AbstractC2774a;
import t4.InterfaceC2792t;

/* JADX INFO: renamed from: p4.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2417E implements InterfaceC2792t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D0 f46397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f46398b = new AtomicLong((AbstractC2774a.g() & WebSocketProtocol.PAYLOAD_SHORT_MAX) * 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2434i f46399c;

    public C2417E(C2434i c2434i) {
        this.f46399c = c2434i;
    }

    @Override // t4.InterfaceC2792t
    public final void a(String str, String str2, final long j9, String str3) {
        D0 d02 = this.f46397a;
        if (d02 == null) {
            throw new IllegalStateException("Device is not connected");
        }
        d02.c(str, str2).addOnFailureListener(new OnFailureListener() { // from class: p4.D
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f46395a.f46399c.f46520c.s(j9, exc instanceof com.google.android.gms.common.api.b ? ((com.google.android.gms.common.api.b) exc).getStatusCode() : 13);
            }
        });
    }

    public final void b(D0 d02) {
        this.f46397a = d02;
    }

    @Override // t4.InterfaceC2792t
    public final long zza() {
        return this.f46398b.getAndIncrement();
    }
}
