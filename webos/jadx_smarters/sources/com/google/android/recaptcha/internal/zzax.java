package com.google.android.recaptcha.internal;

import G8.L;
import G8.M;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k8.k;
import k8.q;
import l8.s;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.AbstractC2643b;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzax extends l implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ zzn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, List list, zzn zznVar, zzn zznVar2, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zzb = zzbaVar;
        this.zzc = list;
        this.zzd = zznVar;
        this.zze = zznVar2;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        zzax zzaxVar = new zzax(this.zzb, this.zzc, this.zzd, this.zze, interfaceC2372d);
        zzaxVar.zzf = obj;
        return zzaxVar;
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objD = AbstractC2512c.d();
        int i9 = this.zza;
        k.b(obj);
        if (i9 == 0) {
            L l9 = (L) this.zzf;
            zzbl zzblVar = new zzbl(this.zzb.zzb());
            zzdk zzdkVarZzb = zzdk.zzb();
            while (zzblVar.zzb() >= 0 && zzblVar.zzb() < this.zzc.size() && M.e(l9)) {
                zzmv zzmvVar = (zzmv) this.zzc.get(zzblVar.zzb());
                try {
                    int iZzk = zzmvVar.zzk();
                    int iZzg = zzmvVar.zzg();
                    List listZzj = zzmvVar.zzj();
                    if (!this.zzb.zzw(zzmvVar, zzblVar)) {
                        zzdk zzdkVarZzb2 = zzdk.zzb();
                        int i10 = iZzk - 2;
                        if (i10 == 7) {
                            zzba.zzo(this.zzb, iZzg, listZzj);
                        } else if (i10 == 15) {
                            zzba.zzi(this.zzb, listZzj);
                        } else if (i10 == 30) {
                            zzba.zzh(this.zzb, iZzg, listZzj);
                        } else if (i10 != 40) {
                            switch (i10) {
                                case 10:
                                    zzba.zzm(this.zzb, iZzg, listZzj);
                                    break;
                                case 11:
                                    zzba.zzn(this.zzb, iZzg, listZzj);
                                    break;
                                case 12:
                                    zzba.zzp(this.zzb, listZzj);
                                    break;
                                case 13:
                                    zzba.zzq(this.zzb, listZzj);
                                    break;
                                default:
                                    switch (i10) {
                                        case 18:
                                            zzba.zzk(this.zzb, iZzg, listZzj);
                                            break;
                                        case 19:
                                            zzba.zzl(this.zzb, iZzg, listZzj);
                                            break;
                                        case 20:
                                            zzba.zzj(this.zzb, listZzj);
                                            break;
                                        default:
                                            throw new zzt(5, 2, null);
                                    }
                                    break;
                            }
                        } else {
                            zzba.zzr(this.zzb, this.zzd, iZzg, listZzj);
                        }
                        zzdkVarZzb2.zzf();
                        long jZza = zzdkVarZzb2.zza(TimeUnit.MICROSECONDS);
                        zzj zzjVar = zzj.zza;
                        zzj.zza(zzms.zza(iZzk), jZza);
                        AbstractC2643b.c(jZza);
                        AbstractC2643b.b(iZzg);
                        s.A(listZzj, null, null, null, 0, null, new zzaw(this.zzb), 31, null);
                        zzblVar.zzg(zzblVar.zzb() + 1);
                    }
                } catch (Exception e9) {
                    zzba zzbaVar = this.zzb;
                    String strZzd = zzblVar.zzd();
                    zzn zznVar = this.zzd;
                    zzn zznVar2 = this.zze;
                    int iZzb = zzblVar.zzb();
                    this.zza = 1;
                    if (zzbaVar.zzu(e9, strZzd, zznVar, zznVar2, iZzb, this) == objD) {
                        return objD;
                    }
                }
            }
            zzdkVarZzb.zzf();
            AbstractC2643b.c(zzdkVarZzb.zza(TimeUnit.MICROSECONDS));
            return q.f43674a;
        }
        return q.f43674a;
    }
}
