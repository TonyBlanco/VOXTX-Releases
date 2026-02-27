package r4;

import o4.C2328e;
import p4.C2434i;

/* JADX INFO: renamed from: r4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2660a {
    private C2434i zza;

    public C2434i getRemoteMediaClient() {
        return this.zza;
    }

    public void onMediaStatusUpdated() {
    }

    public void onSendingRemoteMediaRequest() {
    }

    public void onSessionConnected(C2328e c2328e) {
        this.zza = c2328e != null ? c2328e.r() : null;
    }

    public void onSessionEnded() {
        this.zza = null;
    }
}
