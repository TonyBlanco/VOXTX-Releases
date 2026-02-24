package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzic implements zzil {
    private final zzhy zza;
    private final zzjf zzb;
    private final boolean zzc;
    private final zzga zzd;

    private zzic(zzjf zzjfVar, zzga zzgaVar, zzhy zzhyVar) {
        this.zzb = zzjfVar;
        this.zzc = zzgaVar.zzj(zzhyVar);
        this.zzd = zzgaVar;
        this.zza = zzhyVar;
    }

    public static zzic zzc(zzjf zzjfVar, zzga zzgaVar, zzhy zzhyVar) {
        return new zzic(zzjfVar, zzgaVar, zzhyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zza(Object obj) {
        zzjf zzjfVar = this.zzb;
        int iZzb = zzjfVar.zzb(zzjfVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        zzhy zzhyVar = this.zza;
        return zzhyVar instanceof zzgo ? ((zzgo) zzhyVar).zzs() : zzhyVar.zzV().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzg(Object obj, Object obj2) {
        zzin.zzE(this.zzb, obj, obj2);
        if (this.zzc) {
            zzin.zzD(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzh(Object obj, zzik zzikVar, zzfz zzfzVar) throws IOException {
        boolean zZzO;
        zzjf zzjfVar = this.zzb;
        zzga zzgaVar = this.zzd;
        Object objZzc = zzjfVar.zzc(obj);
        zzge zzgeVarZzc = zzgaVar.zzc(obj);
        while (zzikVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzikVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzgaVar.zzd(zzfzVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzgaVar.zzg(zzikVar, objZzd, zzfzVar, zzgeVarZzc);
                        } else {
                            zZzO = zzjfVar.zzr(objZzc, zzikVar);
                        }
                    } else {
                        zZzO = zzikVar.zzO();
                    }
                    if (!zZzO) {
                        zzjfVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzd2 = null;
                    zzez zzezVarZzp = null;
                    int iZzj = 0;
                    while (zzikVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzikVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzikVar.zzj();
                            objZzd2 = zzgaVar.zzd(zzfzVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzgaVar.zzg(zzikVar, objZzd2, zzfzVar, zzgeVarZzc);
                            } else {
                                zzezVarZzp = zzikVar.zzp();
                            }
                        } else if (!zzikVar.zzO()) {
                            break;
                        }
                    }
                    if (zzikVar.zzd() != 12) {
                        throw zzgy.zzb();
                    }
                    if (zzezVarZzp != null) {
                        if (objZzd2 != null) {
                            zzgaVar.zzh(zzezVarZzp, objZzd2, zzfzVar, zzgeVarZzc);
                        } else {
                            zzjfVar.zzk(objZzc, iZzj, zzezVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzjfVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzjfVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088 A[EDGE_INSN: B:57:0x0088->B:33:0x0088 BREAK  A[LOOP:1: B:18:0x004b->B:60:0x004b], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzem r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 3
            r1 = r10
            com.google.android.recaptcha.internal.zzgo r1 = (com.google.android.recaptcha.internal.zzgo) r1
            com.google.android.recaptcha.internal.zzjg r2 = r1.zzc
            com.google.android.recaptcha.internal.zzjg r3 = com.google.android.recaptcha.internal.zzjg.zzc()
            if (r2 != r3) goto L12
            com.google.android.recaptcha.internal.zzjg r2 = com.google.android.recaptcha.internal.zzjg.zzf()
            r1.zzc = r2
        L12:
            com.google.android.recaptcha.internal.zzgk r10 = (com.google.android.recaptcha.internal.zzgk) r10
            r10.zzi()
            r10 = 0
            r1 = r10
        L19:
            if (r12 >= r13) goto L91
            int r5 = com.google.android.recaptcha.internal.zzen.zzj(r11, r12, r14)
            int r3 = r14.zza
            r12 = 11
            r4 = 2
            if (r3 == r12) goto L49
            r12 = r3 & 7
            if (r12 != r4) goto L44
            com.google.android.recaptcha.internal.zzga r12 = r9.zzd
            com.google.android.recaptcha.internal.zzfz r1 = r14.zzd
            com.google.android.recaptcha.internal.zzhy r4 = r9.zza
            int r6 = r3 >>> 3
            java.lang.Object r1 = r12.zzd(r1, r4, r6)
            if (r1 != 0) goto L41
            r4 = r11
            r6 = r13
            r7 = r2
            r8 = r14
            int r12 = com.google.android.recaptcha.internal.zzen.zzi(r3, r4, r5, r6, r7, r8)
            goto L19
        L41:
            int r11 = com.google.android.recaptcha.internal.zzih.zza
            throw r10
        L44:
            int r12 = com.google.android.recaptcha.internal.zzen.zzp(r3, r11, r5, r13, r14)
            goto L19
        L49:
            r12 = 0
            r3 = r10
        L4b:
            if (r5 >= r13) goto L88
            int r5 = com.google.android.recaptcha.internal.zzen.zzj(r11, r5, r14)
            int r6 = r14.zza
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r4) goto L6c
            if (r7 == r0) goto L5c
            goto L7f
        L5c:
            if (r1 != 0) goto L69
            if (r8 != r4) goto L7f
            int r5 = com.google.android.recaptcha.internal.zzen.zza(r11, r5, r14)
            java.lang.Object r3 = r14.zzc
            com.google.android.recaptcha.internal.zzez r3 = (com.google.android.recaptcha.internal.zzez) r3
            goto L4b
        L69:
            int r11 = com.google.android.recaptcha.internal.zzih.zza
            throw r10
        L6c:
            if (r8 != 0) goto L7f
            int r5 = com.google.android.recaptcha.internal.zzen.zzj(r11, r5, r14)
            int r12 = r14.zza
            com.google.android.recaptcha.internal.zzga r1 = r9.zzd
            com.google.android.recaptcha.internal.zzfz r6 = r14.zzd
            com.google.android.recaptcha.internal.zzhy r7 = r9.zza
            java.lang.Object r1 = r1.zzd(r6, r7, r12)
            goto L4b
        L7f:
            r7 = 12
            if (r6 == r7) goto L88
            int r5 = com.google.android.recaptcha.internal.zzen.zzp(r6, r11, r5, r13, r14)
            goto L4b
        L88:
            if (r3 == 0) goto L8f
            int r12 = r12 << r0
            r12 = r12 | r4
            r2.zzj(r12, r3)
        L8f:
            r12 = r5
            goto L19
        L91:
            if (r12 != r13) goto L94
            return
        L94:
            com.google.android.recaptcha.internal.zzgy r10 = com.google.android.recaptcha.internal.zzgy.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzic.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzem):void");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzj(Object obj, zzjx zzjxVar) throws IOException {
        Iterator itZzf = this.zzd.zzb(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzgd zzgdVar = (zzgd) entry.getKey();
            if (zzgdVar.zze() != zzjw.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzgdVar.zzg();
            zzgdVar.zzf();
            zzjxVar.zzw(zzgdVar.zza(), entry instanceof zzhb ? ((zzhb) entry).zza().zzb() : entry.getValue());
        }
        zzjf zzjfVar = this.zzb;
        zzjfVar.zzp(zzjfVar.zzd(obj), zzjxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
