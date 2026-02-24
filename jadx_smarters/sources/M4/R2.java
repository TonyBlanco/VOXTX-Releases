package M4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: loaded from: classes3.dex */
public final class R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f4446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzcl f4448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f4450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4451j;

    public R2(Context context, zzcl zzclVar, Long l9) {
        this.f4449h = true;
        com.google.android.gms.common.internal.r.m(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.r.m(applicationContext);
        this.f4442a = applicationContext;
        this.f4450i = l9;
        if (zzclVar != null) {
            this.f4448g = zzclVar;
            this.f4443b = zzclVar.zzf;
            this.f4444c = zzclVar.zze;
            this.f4445d = zzclVar.zzd;
            this.f4449h = zzclVar.zzc;
            this.f4447f = zzclVar.zzb;
            this.f4451j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f4446e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
