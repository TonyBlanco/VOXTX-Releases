package g1;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;

/* JADX INFO: loaded from: classes.dex */
public final class H implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzgu f41137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f41138c;

    public H(Context context, zzgu zzguVar) {
        this.f41138c = new J(context);
        this.f41137b = zzguVar;
    }

    @Override // g1.F
    public final void a(zzge zzgeVar, int i9) {
        try {
            zzgt zzgtVar = (zzgt) this.f41137b.zzi();
            zzgtVar.zzl(i9);
            this.f41137b = (zzgu) zzgtVar.zzf();
            b(zzgeVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // g1.F
    public final void b(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f41137b);
            zzhdVarZzy.zzm(zzgeVar);
            this.f41138c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // g1.F
    public final void c(zzhl zzhlVar) {
        if (zzhlVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f41137b);
            zzhdVarZzy.zzo(zzhlVar);
            this.f41138c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // g1.F
    public final void d(zzga zzgaVar, int i9) {
        try {
            zzgt zzgtVar = (zzgt) this.f41137b.zzi();
            zzgtVar.zzl(i9);
            this.f41137b = (zzgu) zzgtVar.zzf();
            e(zzgaVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // g1.F
    public final void e(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f41137b);
            zzhdVarZzy.zzl(zzgaVar);
            this.f41138c.a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
