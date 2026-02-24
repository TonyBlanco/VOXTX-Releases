package o4;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: renamed from: o4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2348z {
    private final Context zza;
    private final String zzb;
    private final c0 zzc = new c0(this, null);

    public AbstractC2348z(Context context, String str) {
        this.zza = ((Context) com.google.android.gms.common.internal.r.m(context)).getApplicationContext();
        this.zzb = com.google.android.gms.common.internal.r.g(str);
    }

    public abstract AbstractC2345w createSession(String str);

    public final String getCategory() {
        return this.zzb;
    }

    public final Context getContext() {
        return this.zza;
    }

    public abstract boolean isSessionRecoverable();

    public final IBinder zza() {
        return this.zzc;
    }
}
