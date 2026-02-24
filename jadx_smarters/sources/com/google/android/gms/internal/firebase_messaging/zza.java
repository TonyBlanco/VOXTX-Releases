package com.google.android.gms.internal.firebase_messaging;

import c6.d;
import c6.e;
import c6.f;
import java.io.IOException;
import org.apache.commons.logging.LogFactory;
import r6.C2680a;

/* JADX INFO: loaded from: classes3.dex */
final class zza implements e {
    static final zza zza = new zza();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;
    private static final d zzl;
    private static final d zzm;
    private static final d zzn;
    private static final d zzo;
    private static final d zzp;

    static {
        d.b bVarA = d.a("projectNumber");
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzb = bVarA.b(zzoVar.zzb()).a();
        d.b bVarA2 = d.a("messageId");
        zzo zzoVar2 = new zzo();
        zzoVar2.zza(2);
        zzc = bVarA2.b(zzoVar2.zzb()).a();
        d.b bVarA3 = d.a("instanceId");
        zzo zzoVar3 = new zzo();
        zzoVar3.zza(3);
        zzd = bVarA3.b(zzoVar3.zzb()).a();
        d.b bVarA4 = d.a("messageType");
        zzo zzoVar4 = new zzo();
        zzoVar4.zza(4);
        zze = bVarA4.b(zzoVar4.zzb()).a();
        d.b bVarA5 = d.a("sdkPlatform");
        zzo zzoVar5 = new zzo();
        zzoVar5.zza(5);
        zzf = bVarA5.b(zzoVar5.zzb()).a();
        d.b bVarA6 = d.a("packageName");
        zzo zzoVar6 = new zzo();
        zzoVar6.zza(6);
        zzg = bVarA6.b(zzoVar6.zzb()).a();
        d.b bVarA7 = d.a("collapseKey");
        zzo zzoVar7 = new zzo();
        zzoVar7.zza(7);
        zzh = bVarA7.b(zzoVar7.zzb()).a();
        d.b bVarA8 = d.a(LogFactory.PRIORITY_KEY);
        zzo zzoVar8 = new zzo();
        zzoVar8.zza(8);
        zzi = bVarA8.b(zzoVar8.zzb()).a();
        d.b bVarA9 = d.a("ttl");
        zzo zzoVar9 = new zzo();
        zzoVar9.zza(9);
        zzj = bVarA9.b(zzoVar9.zzb()).a();
        d.b bVarA10 = d.a("topic");
        zzo zzoVar10 = new zzo();
        zzoVar10.zza(10);
        zzk = bVarA10.b(zzoVar10.zzb()).a();
        d.b bVarA11 = d.a("bulkId");
        zzo zzoVar11 = new zzo();
        zzoVar11.zza(11);
        zzl = bVarA11.b(zzoVar11.zzb()).a();
        d.b bVarA12 = d.a("event");
        zzo zzoVar12 = new zzo();
        zzoVar12.zza(12);
        zzm = bVarA12.b(zzoVar12.zzb()).a();
        d.b bVarA13 = d.a("analyticsLabel");
        zzo zzoVar13 = new zzo();
        zzoVar13.zza(13);
        zzn = bVarA13.b(zzoVar13.zzb()).a();
        d.b bVarA14 = d.a("campaignId");
        zzo zzoVar14 = new zzo();
        zzoVar14.zza(14);
        zzo = bVarA14.b(zzoVar14.zzb()).a();
        d.b bVarA15 = d.a("composerLabel");
        zzo zzoVar15 = new zzo();
        zzoVar15.zza(15);
        zzp = bVarA15.b(zzoVar15.zzb()).a();
    }

    private zza() {
    }

    @Override // c6.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        C2680a c2680a = (C2680a) obj;
        f fVar = (f) obj2;
        fVar.add(zzb, c2680a.l());
        fVar.add(zzc, c2680a.h());
        fVar.add(zzd, c2680a.g());
        fVar.add(zze, c2680a.i());
        fVar.add(zzf, c2680a.m());
        fVar.add(zzg, c2680a.j());
        fVar.add(zzh, c2680a.d());
        fVar.add(zzi, c2680a.k());
        fVar.add(zzj, c2680a.o());
        fVar.add(zzk, c2680a.n());
        fVar.add(zzl, c2680a.b());
        fVar.add(zzm, c2680a.f());
        fVar.add(zzn, c2680a.a());
        fVar.add(zzo, c2680a.c());
        fVar.add(zzp, c2680a.e());
    }
}
