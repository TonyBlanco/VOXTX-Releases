package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzab {
    private final zzj zza;
    private final boolean zzb;
    private final zzah zzc;
    private final int zzd;

    private zzab(zzah zzahVar) {
        this(zzahVar, false, zzn.zza, a.e.API_PRIORITY_OTHER);
    }

    private zzab(zzah zzahVar, boolean z9, zzj zzjVar, int i9) {
        this.zzc = zzahVar;
        this.zzb = false;
        this.zza = zzjVar;
        this.zzd = a.e.API_PRIORITY_OTHER;
    }

    public static zzab zza(char c9) {
        zzl zzlVar = new zzl(c9);
        zzy.zza(zzlVar);
        return new zzab(new zzaa(zzlVar));
    }

    public static zzab zza(String str) {
        zzs zzsVarZza = zzx.zza(str);
        if (!zzsVarZza.zza("").zzc()) {
            return new zzab(new zzac(zzsVarZza));
        }
        throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zzsVarZza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> itZza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add(itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
