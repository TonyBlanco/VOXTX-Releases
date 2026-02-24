package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzfg implements zzik {
    private final zzff zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfg(zzff zzffVar) {
        byte[] bArr = zzgw.zzd;
        this.zza = zzffVar;
        zzffVar.zzc = this;
    }

    private final void zzP(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int i9 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzilVar.zzh(obj, this, zzfzVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgy.zzg();
            }
        } finally {
            this.zzc = i9;
        }
    }

    private final void zzQ(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int iZzn = this.zza.zzn();
        zzff zzffVar = this.zza;
        if (zzffVar.zza >= zzffVar.zzb) {
            throw new zzgy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = zzffVar.zze(iZzn);
        this.zza.zza++;
        zzilVar.zzh(obj, this, zzfzVar);
        this.zza.zzz(0);
        r5.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzR(int i9) throws IOException {
        if (this.zza.zzd() != i9) {
            throw zzgy.zzj();
        }
    }

    private final void zzS(int i9) throws IOException {
        if ((this.zzb & 7) != i9) {
            throw zzgy.zza();
        }
    }

    private static final void zzT(int i9) throws IOException {
        if ((i9 & 3) != 0) {
            throw zzgy.zzg();
        }
    }

    private static final void zzU(int i9) throws IOException {
        if ((i9 & 7) != 0) {
            throw zzgy.zzg();
        }
    }

    public static zzfg zzq(zzff zzffVar) {
        zzfg zzfgVar = zzffVar.zzc;
        return zzfgVar != null ? zzfgVar : new zzfg(zzffVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzhn)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzhnVar.zzf(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzhnVar.zzf(this.zza.zzo());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgg)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i9 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgg zzggVar = (zzgg) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzggVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i10 != 5) {
            throw zzgy.zza();
        }
        do {
            zzggVar.zze(this.zza.zzc());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    @Deprecated
    public final void zzC(List list, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int iZzm;
        int i9 = this.zzb;
        if ((i9 & 7) != 3) {
            throw zzgy.zza();
        }
        do {
            Object objZze = zzilVar.zze();
            zzP(objZze, zzilVar, zzfzVar);
            zzilVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i9);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzgpVar.zzg(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpVar.zzg(this.zza.zzh());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzE(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzhn)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzhnVar.zzf(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzhnVar.zzf(this.zza.zzp());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzF(List list, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int iZzm;
        int i9 = this.zzb;
        if ((i9 & 7) != 2) {
            throw zzgy.zza();
        }
        do {
            Object objZze = zzilVar.zze();
            zzQ(objZze, zzilVar, zzfzVar);
            zzilVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i9);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i9 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzgpVar.zzg(this.zza.zzk());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i10 != 5) {
            throw zzgy.zza();
        }
        do {
            zzgpVar.zzg(this.zza.zzk());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzH(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzhn)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzhnVar.zzf(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzhnVar.zzf(this.zza.zzt());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzgpVar.zzg(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpVar.zzg(this.zza.zzl());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzhn)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzhnVar.zzf(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzhnVar.zzf(this.zza.zzu());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    public final void zzK(List list, boolean z9) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
        }
        if (!(list instanceof zzhg) || z9) {
            do {
                list.add(z9 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzhg zzhgVar = (zzhg) list;
        do {
            zzhgVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzgpVar.zzg(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpVar.zzg(this.zza.zzn());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzM(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzhn)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzhnVar.zzf(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzhnVar.zzf(this.zza.zzv());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzO() throws IOException {
        int i9;
        if (this.zza.zzC() || (i9 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i9);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        return (iZzm == 0 || iZzm == this.zzc) ? a.e.API_PRIORITY_OTHER : iZzm >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final zzez zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzt(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        zzS(3);
        zzP(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzu(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        zzS(2);
        zzQ(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzv(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzeo)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzeo zzeoVar = (zzeo) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzeoVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzeoVar.zze(this.zza.zzD());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzw(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzft)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzft zzftVar = (zzft) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzftVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzftVar.zze(this.zza.zzb());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzy(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i9 != 2) {
                throw zzgy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzgpVar.zzg(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i10 != 2) {
            throw zzgy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpVar.zzg(this.zza.zzf());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgp)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i9 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzgpVar.zzg(this.zza.zzg());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i10 != 5) {
            throw zzgy.zza();
        }
        do {
            zzgpVar.zzg(this.zza.zzg());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }
}
