package g1;

import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;

/* JADX INFO: renamed from: g1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1806E {
    static {
        zzal zzalVar = F.f41136a;
    }

    public static zzga a(int i9, int i10, com.android.billingclient.api.a aVar) {
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(aVar.b());
            zzggVarZzy.zzm(aVar.a());
            zzggVarZzy.zzo(i9);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(i10);
            return (zzga) zzfzVarZzy.zzf();
        } catch (Exception e9) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e9);
            return null;
        }
    }

    public static zzga b(int i9, int i10, com.android.billingclient.api.a aVar, String str) {
        try {
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(aVar.b());
            zzggVarZzy.zzm(aVar.a());
            zzggVarZzy.zzo(i9);
            if (str != null) {
                zzggVarZzy.zzl(str);
            }
            zzfz zzfzVarZzy = zzga.zzy();
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(i10);
            return (zzga) zzfzVarZzy.zzf();
        } catch (Exception e9) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e9);
            return null;
        }
    }

    public static zzge c(int i9) {
        try {
            zzgd zzgdVarZzy = zzge.zzy();
            zzgdVarZzy.zzm(i9);
            return (zzge) zzgdVarZzy.zzf();
        } catch (Exception e9) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e9);
            return null;
        }
    }
}
