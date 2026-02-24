package j4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: j4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2097b extends e {
    private static final a.g zza;
    private static final a.AbstractC0252a zzb;
    private static final com.google.android.gms.common.api.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        C2098c c2098c = new C2098c();
        zzb = c2098c;
        zzc = new com.google.android.gms.common.api.a("SmsRetriever.API", c2098c, gVar);
    }

    public AbstractC2097b(Activity activity) {
        super(activity, zzc, (a.d) null, e.a.f26452c);
    }

    public AbstractC2097b(Context context) {
        super(context, zzc, (a.d) null, e.a.f26452c);
    }

    public abstract Task startSmsRetriever();
}
