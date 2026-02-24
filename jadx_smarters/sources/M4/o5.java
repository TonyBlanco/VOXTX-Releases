package M4;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzoy;

/* JADX INFO: loaded from: classes3.dex */
public final class o5 extends n5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzet f4979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0713b f4980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(C0713b c0713b, String str, int i9, zzet zzetVar) {
        super(str, i9);
        this.f4980h = c0713b;
        this.f4979g = zzetVar;
    }

    @Override // M4.n5
    public final int a() {
        return this.f4979g.zza();
    }

    @Override // M4.n5
    public final boolean b() {
        return false;
    }

    @Override // M4.n5
    public final boolean c() {
        return true;
    }

    public final boolean k(Long l9, Long l10, zzgm zzgmVar, boolean z9) {
        C0846x1 c0846x1W;
        String strF;
        String str;
        Boolean boolF;
        zzoy.zzc();
        boolean zB = this.f4980h.f4245a.z().B(this.f4958a, AbstractC0781m1.f4882Y);
        boolean zZzg = this.f4979g.zzg();
        boolean zZzh = this.f4979g.zzh();
        boolean zZzi = this.f4979g.zzi();
        boolean z10 = zZzg || zZzh || zZzi;
        Boolean boolJ = null;
        boolJ = null;
        if (z9 && !z10) {
            this.f4980h.f4245a.d().v().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f4959b), this.f4979g.zzj() ? Integer.valueOf(this.f4979g.zza()) : null);
            return true;
        }
        zzem zzemVarZzb = this.f4979g.zzb();
        boolean zZzg2 = zzemVarZzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzemVarZzb.zzi()) {
                boolF = n5.h(zzgmVar.zzb(), zzemVarZzb.zzc());
                boolJ = n5.j(boolF, zZzg2);
            } else {
                c0846x1W = this.f4980h.f4245a.d().w();
                strF = this.f4980h.f4245a.D().f(zzgmVar.zzf());
                str = "No number filter for long property. property";
                c0846x1W.b(str, strF);
            }
        } else if (!zzgmVar.zzq()) {
            if (zzgmVar.zzt()) {
                if (zzemVarZzb.zzk()) {
                    boolF = n5.f(zzgmVar.zzg(), zzemVarZzb.zzd(), this.f4980h.f4245a.d());
                } else if (!zzemVarZzb.zzi()) {
                    c0846x1W = this.f4980h.f4245a.d().w();
                    strF = this.f4980h.f4245a.D().f(zzgmVar.zzf());
                    str = "No string or number filter defined. property";
                } else if (U4.P(zzgmVar.zzg())) {
                    boolF = n5.i(zzgmVar.zzg(), zzemVarZzb.zzc());
                } else {
                    this.f4980h.f4245a.d().w().c("Invalid user property value for Numeric number filter. property, value", this.f4980h.f4245a.D().f(zzgmVar.zzf()), zzgmVar.zzg());
                }
                boolJ = n5.j(boolF, zZzg2);
            } else {
                c0846x1W = this.f4980h.f4245a.d().w();
                strF = this.f4980h.f4245a.D().f(zzgmVar.zzf());
                str = "User property has no value, property";
            }
            c0846x1W.b(str, strF);
        } else if (zzemVarZzb.zzi()) {
            boolF = n5.g(zzgmVar.zza(), zzemVarZzb.zzc());
            boolJ = n5.j(boolF, zZzg2);
        } else {
            c0846x1W = this.f4980h.f4245a.d().w();
            strF = this.f4980h.f4245a.D().f(zzgmVar.zzf());
            str = "No number filter for double property. property";
            c0846x1W.b(str, strF);
        }
        this.f4980h.f4245a.d().v().b("Property filter result", boolJ == null ? Constants.NULL_VERSION_ID : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.f4960c = Boolean.TRUE;
        if (zZzi && !boolJ.booleanValue()) {
            return true;
        }
        if (!z9 || this.f4979g.zzg()) {
            this.f4961d = boolJ;
        }
        if (boolJ.booleanValue() && z10 && zzgmVar.zzs()) {
            long jZzc = zzgmVar.zzc();
            if (l9 != null) {
                jZzc = l9.longValue();
            }
            if (zB && this.f4979g.zzg() && !this.f4979g.zzh() && l10 != null) {
                jZzc = l10.longValue();
            }
            if (this.f4979g.zzh()) {
                this.f4963f = Long.valueOf(jZzc);
            } else {
                this.f4962e = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}
