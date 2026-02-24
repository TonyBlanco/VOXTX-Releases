package H5;

import G5.AbstractC0535b;
import com.google.android.gms.internal.p001firebaseauthapi.zzafw;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0535b f2673d;

    public c0(zzafw zzafwVar) {
        int i9 = 5;
        this.f2671b = zzafwVar.zzg() ? zzafwVar.zzc() : zzafwVar.zzb();
        this.f2672c = zzafwVar.zzb();
        AbstractC0535b a0Var = null;
        if (!zzafwVar.zzh()) {
            this.f2670a = 3;
            this.f2673d = null;
            return;
        }
        String strZzd = zzafwVar.zzd();
        strZzd.hashCode();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i9 = 6;
                break;
            case "PASSWORD_RESET":
                i9 = 0;
                break;
            case "VERIFY_EMAIL":
                i9 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i9 = 4;
                break;
            case "RECOVER_EMAIL":
                i9 = 2;
                break;
            default:
                i9 = 3;
                break;
        }
        this.f2670a = i9;
        if (i9 == 4 || i9 == 3) {
            this.f2673d = null;
            return;
        }
        if (zzafwVar.zzf()) {
            a0Var = new Z(zzafwVar.zzb(), AbstractC0631w.a(zzafwVar.zza()));
        } else if (zzafwVar.zzg()) {
            a0Var = new X(zzafwVar.zzc(), zzafwVar.zzb());
        } else if (zzafwVar.zze()) {
            a0Var = new a0(zzafwVar.zzb());
        }
        this.f2673d = a0Var;
    }

    public final int a() {
        return this.f2670a;
    }
}
