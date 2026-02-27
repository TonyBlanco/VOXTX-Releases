package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
final class zzaij implements zzalc {
    private final zzaia zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaij(zzaia zzaiaVar) {
        zzaia zzaiaVar2 = (zzaia) zzajf.zza(zzaiaVar, "input");
        this.zza = zzaiaVar2;
        zzaiaVar2.zzd = this;
    }

    public static zzaij zza(zzaia zzaiaVar) {
        zzaij zzaijVar = zzaiaVar.zzd;
        return zzaijVar != null ? zzaijVar : new zzaij(zzaiaVar);
    }

    private final <T> T zza(zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        T tZza = zzalfVar.zza();
        zzc(tZza, zzalfVar, zzaioVar);
        zzalfVar.zzc(tZza);
        return tZza;
    }

    private final Object zza(zzamr zzamrVar, Class<?> cls, zzaio zzaioVar) throws IOException {
        switch (zzaii.zza[zzamrVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzalb.zza().zza((Class) cls), zzaioVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Long.valueOf(zzn());
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case LangUtils.HASH_SEED /* 17 */:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i9) throws IOException {
        if (this.zza.zzc() != i9) {
            throw zzaji.zzi();
        }
    }

    private final void zza(List<String> list, boolean z9) throws IOException {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) != 2) {
            throw zzaji.zza();
        }
        if (!(list instanceof zzajt) || z9) {
            do {
                list.add(z9 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        do {
            zzajtVar.zza(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    private final <T> T zzb(zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        T tZza = zzalfVar.zza();
        zzd(tZza, zzalfVar, zzaioVar);
        zzalfVar.zzc(tZza);
        return tZza;
    }

    private final void zzb(int i9) throws IOException {
        if ((this.zzb & 7) != i9) {
            throw zzaji.zza();
        }
    }

    private static void zzc(int i9) throws IOException {
        if ((i9 & 3) != 0) {
            throw zzaji.zzg();
        }
    }

    private final <T> void zzc(T t9, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        int i9 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalfVar.zza(t9, this, zzaioVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzaji.zzg();
            }
        } finally {
            this.zzc = i9;
        }
    }

    private static void zzd(int i9) throws IOException {
        if ((i9 & 7) != 0) {
            throw zzaji.zzg();
        }
    }

    private final <T> void zzd(T t9, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        int iZzj = this.zza.zzj();
        zzaia zzaiaVar = this.zza;
        if (zzaiaVar.zza >= zzaiaVar.zzb) {
            throw new zzaji("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZzb = zzaiaVar.zzb(iZzj);
        this.zza.zza++;
        zzalfVar.zza(t9, this, zzaioVar);
        this.zza.zzc(0);
        r5.zza--;
        this.zza.zzd(iZzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final double zza() throws IOException {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final <T> void zza(T t9, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        zzb(3);
        zzc(t9, zzalfVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zza(List<Boolean> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzahn)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzahn zzahnVar = (zzahn) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzahnVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzahnVar.zza(this.zza.zzu());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    @Deprecated
    public final <T> void zza(List<T> list, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        int iZzi;
        int i9 = this.zzb;
        if ((i9 & 7) != 3) {
            throw zzaji.zza();
        }
        do {
            list.add(zza(zzalfVar, zzaioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i9);
        this.zzd = iZzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r7.zza.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p001firebaseauthapi.zzake<K, V> r9, com.google.android.gms.internal.p001firebaseauthapi.zzaio r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzaia r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaia r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L39
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5d
            com.google.android.gms.internal.firebase-auth-api.zzaia r5 = r7.zza     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L48
            if (r4 == r0) goto L3b
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzaji r4 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            throw r4     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
        L39:
            r8 = move-exception
            goto L66
        L3b:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zzc     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            V r5 = r9.zzd     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            goto L14
        L48:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zza     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.p001firebaseauthapi.zzajl -> L50
            goto L14
        L50:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L57
            goto L14
        L57:
            com.google.android.gms.internal.firebase-auth-api.zzaji r8 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch: java.lang.Throwable -> L39
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Throwable -> L39
        L5d:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.firebase-auth-api.zzaia r8 = r7.zza
            r8.zzd(r1)
            return
        L66:
            com.google.android.gms.internal.firebase-auth-api.zzaia r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaij.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzake, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final float zzb() throws IOException {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final <T> void zzb(T t9, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        zzb(2);
        zzd(t9, zzalfVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzb(List<zzahp> list) throws IOException {
        int iZzi;
        if ((this.zzb & 7) != 2) {
            throw zzaji.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final <T> void zzb(List<T> list, zzalf<T> zzalfVar, zzaio zzaioVar) throws IOException {
        int iZzi;
        int i9 = this.zzb;
        if ((i9 & 7) != 2) {
            throw zzaji.zza();
        }
        do {
            list.add(zzb(zzalfVar, zzaioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i9);
        this.zzd = iZzi;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzc() throws IOException {
        int i9 = this.zzd;
        if (i9 != 0) {
            this.zzb = i9;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i10 = this.zzb;
        return (i10 == 0 || i10 == this.zzc) ? a.e.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzc(List<Double> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzaim)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzaim zzaimVar = (zzaim) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzaimVar.zza(this.zza.zza());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzaimVar.zza(this.zza.zza());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzd(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajdVar.zzc(this.zza.zzd());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zze() throws IOException {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zze(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i9 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajdVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i10 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzf() throws IOException {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzf(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajy)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzajyVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzajyVar.zza(this.zza.zzk());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzg() throws IOException {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzg(List<Float> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajb)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i9 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajb zzajbVar = (zzajb) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajbVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i10 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajbVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzh() throws IOException {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzh(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajdVar.zzc(this.zza.zzf());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzi() throws IOException {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzi(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajy)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajyVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajyVar.zza(this.zza.zzl());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzj() throws IOException {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzj(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i9 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajdVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i10 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final long zzk() throws IOException {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzk(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajy)) {
            int i9 = this.zzb & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i10 = this.zzb & 7;
        if (i10 == 1) {
            do {
                zzajyVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzajyVar.zza(this.zza.zzn());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final long zzl() throws IOException {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzl(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajdVar.zzc(this.zza.zzh());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final long zzm() throws IOException {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzm(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajy)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajyVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajyVar.zza(this.zza.zzo());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final long zzn() throws IOException {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzn(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final long zzo() throws IOException {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzo(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final zzahp zzp() throws IOException {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzp(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajdVar.zzc(this.zza.zzj());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final String zzq() throws IOException {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzq(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajy)) {
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i9 != 2) {
                throw zzaji.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i10 = this.zzb & 7;
        if (i10 == 0) {
            do {
                zzajyVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i10 != 2) {
            throw zzaji.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajyVar.zza(this.zza.zzp());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final String zzr() throws IOException {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final boolean zzs() throws IOException {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final boolean zzt() throws IOException {
        int i9;
        if (this.zza.zzt() || (i9 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i9);
    }
}
