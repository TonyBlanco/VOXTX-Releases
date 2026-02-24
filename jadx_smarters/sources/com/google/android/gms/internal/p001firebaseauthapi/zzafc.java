package com.google.android.gms.internal.p001firebaseauthapi;

import G5.f0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafv zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private f0 zzl;
    private List<zzafr> zzm;
    private zzap<zzafq> zzn;

    public zzafc() {
        this.zzf = new zzafv();
        this.zzn = zzap.zzh();
    }

    public zzafc(String str, String str2, boolean z9, String str3, String str4, zzafv zzafvVar, String str5, String str6, long j9, long j10, boolean z10, f0 f0Var, List<zzafr> list, zzap<zzafq> zzapVar) {
        zzafv zzafvVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z9;
        this.zzd = str3;
        this.zze = str4;
        if (zzafvVar == null) {
            zzafvVar2 = new zzafv();
        } else {
            List<zzafs> listZza = zzafvVar.zza();
            zzafv zzafvVar3 = new zzafv();
            if (listZza != null) {
                zzafvVar3.zza().addAll(listZza);
            }
            zzafvVar2 = zzafvVar3;
        }
        this.zzf = zzafvVar2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j9;
        this.zzj = j10;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzapVar;
    }

    public final long zza() {
        return this.zzi;
    }

    public final zzafc zza(f0 f0Var) {
        this.zzl = f0Var;
        return this;
    }

    public final zzafc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzafc zza(List<zzafs> list) {
        r.m(list);
        zzafv zzafvVar = new zzafv();
        this.zzf = zzafvVar;
        zzafvVar.zza().addAll(list);
        return this;
    }

    public final zzafc zza(boolean z9) {
        this.zzk = z9;
        return this;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final zzafc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzafc zzc(String str) {
        r.g(str);
        this.zzg = str;
        return this;
    }

    public final zzafc zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzap<zzafq> zzd() {
        return this.zzn;
    }

    public final f0 zze() {
        return this.zzl;
    }

    public final zzafv zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafr> zzk() {
        return this.zzm;
    }

    public final List<zzafs> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }
}
