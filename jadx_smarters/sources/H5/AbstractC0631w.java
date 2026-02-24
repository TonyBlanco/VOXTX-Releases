package H5;

import android.text.TextUtils;
import com.google.android.gms.internal.p001firebaseauthapi.zzafr;
import com.google.android.gms.internal.p001firebaseauthapi.zzagr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: H5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0631w {
    public static G5.B a(zzafr zzafrVar) {
        if (zzafrVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafrVar.zze())) {
            return new G5.J(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), com.google.android.gms.common.internal.r.g(zzafrVar.zze()));
        }
        if (zzafrVar.zzb() != null) {
            return new G5.M(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), (zzagr) com.google.android.gms.common.internal.r.n(zzafrVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G5.B bA = a((zzafr) it.next());
            if (bA != null) {
                arrayList.add(bA);
            }
        }
        return arrayList;
    }
}
