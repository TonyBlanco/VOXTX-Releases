package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzago {
    private final int zza;
    private List<String> zzb;

    public zzago() {
        this(null);
    }

    public zzago(int i9, List<String> list) {
        List<String> listEmptyList;
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, o.a(list.get(i10)));
            }
            listEmptyList = Collections.unmodifiableList(list);
        }
        this.zzb = listEmptyList;
    }

    private zzago(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public static zzago zza() {
        return new zzago(null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }
}
