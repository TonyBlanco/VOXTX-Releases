package v4;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2879c f51351a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C2879c c2879c, Looper looper) {
        super(looper);
        this.f51351a = c2879c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2879c.d(this.f51351a, message);
    }
}
