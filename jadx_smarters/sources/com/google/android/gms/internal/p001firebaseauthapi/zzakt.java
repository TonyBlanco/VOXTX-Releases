package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzakt<T> implements zzalf<T> {
    private final zzakn zza;
    private final zzame<?, ?> zzb;
    private final boolean zzc;
    private final zzaiq<?> zzd;

    private zzakt(zzame<?, ?> zzameVar, zzaiq<?> zzaiqVar, zzakn zzaknVar) {
        this.zzb = zzameVar;
        this.zzc = zzaiqVar.zza(zzaknVar);
        this.zzd = zzaiqVar;
        this.zza = zzaknVar;
    }

    public static <T> zzakt<T> zza(zzame<?, ?> zzameVar, zzaiq<?> zzaiqVar, zzakn zzaknVar) {
        return new zzakt<>(zzameVar, zzaiqVar, zzaknVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final int zza(T t9) {
        zzame<?, ?> zzameVar = this.zzb;
        int iZzb = zzameVar.zzb(zzameVar.zzd(t9));
        return this.zzc ? iZzb + this.zzd.zza(t9).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final T zza() {
        zzakn zzaknVar = this.zza;
        return zzaknVar instanceof zzajc ? (T) ((zzajc) zzaknVar).zzo() : (T) zzaknVar.zzq().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r11, com.google.android.gms.internal.p001firebaseauthapi.zzalc r12, com.google.android.gms.internal.p001firebaseauthapi.zzaio r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.firebase-auth-api.zzame<?, ?> r0 = r10.zzb
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r1 = r10.zzd
            java.lang.Object r2 = r0.zzc(r11)
            com.google.android.gms.internal.firebase-auth-api.zzaiv r3 = r1.zzb(r11)
        Lc:
            int r4 = r12.zzc()     // Catch: java.lang.Throwable -> L34
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r11, r2)
            return
        L19:
            int r4 = r12.zzd()     // Catch: java.lang.Throwable -> L34
            r6 = 11
            if (r4 == r6) goto L40
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3b
            com.google.android.gms.internal.firebase-auth-api.zzakn r5 = r10.zza     // Catch: java.lang.Throwable -> L34
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r13, r5, r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L85
        L34:
            r12 = move-exception
            goto L91
        L36:
            boolean r4 = r0.zza(r2, r12)     // Catch: java.lang.Throwable -> L34
            goto L86
        L3b:
            boolean r4 = r12.zzt()     // Catch: java.lang.Throwable -> L34
            goto L86
        L40:
            r4 = 0
            r6 = 0
            r6 = r4
            r7 = 0
        L44:
            int r8 = r12.zzc()     // Catch: java.lang.Throwable -> L34
            if (r8 == r5) goto L72
            int r8 = r12.zzd()     // Catch: java.lang.Throwable -> L34
            r9 = 16
            if (r8 != r9) goto L5d
            int r7 = r12.zzj()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.firebase-auth-api.zzakn r4 = r10.zza     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r1.zza(r13, r4, r7)     // Catch: java.lang.Throwable -> L34
            goto L44
        L5d:
            r9 = 26
            if (r8 != r9) goto L6c
            if (r4 == 0) goto L67
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L44
        L67:
            com.google.android.gms.internal.firebase-auth-api.zzahp r6 = r12.zzp()     // Catch: java.lang.Throwable -> L34
            goto L44
        L6c:
            boolean r8 = r12.zzt()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
        L72:
            int r5 = r12.zzd()     // Catch: java.lang.Throwable -> L34
            r8 = 12
            if (r5 != r8) goto L8c
            if (r6 == 0) goto L85
            if (r4 == 0) goto L82
            r1.zza(r6, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L85
        L82:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L34
        L85:
            r4 = 1
        L86:
            if (r4 != 0) goto Lc
            r0.zzb(r11, r2)
            return
        L8c:
            com.google.android.gms.internal.firebase-auth-api.zzaji r12 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzb()     // Catch: java.lang.Throwable -> L34
            throw r12     // Catch: java.lang.Throwable -> L34
        L91:
            r0.zzb(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakt.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzalc, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final void zza(T t9, zzana zzanaVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t9).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzaix zzaixVar = (zzaix) entry.getKey();
            if (zzaixVar.zzc() != zzanb.MESSAGE || zzaixVar.zze() || zzaixVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzanaVar.zza(zzaixVar.zza(), entry instanceof zzajm ? ((zzajm) entry).zza().zzc() : entry.getValue());
        }
        zzame<?, ?> zzameVar = this.zzb;
        zzameVar.zza(zzameVar.zzd(t9), zzanaVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final void zza(T t9, T t10) {
        zzalh.zza(this.zzb, t9, t10);
        if (this.zzc) {
            zzalh.zza(this.zzd, t9, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p001firebaseauthapi.zzahk r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzajc r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc) r0
            com.google.android.gms.internal.firebase-auth-api.zzamd r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamd r2 = com.google.android.gms.internal.p001firebaseauthapi.zzamd.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzamd r1 = com.google.android.gms.internal.p001firebaseauthapi.zzamd.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzb r10 = (com.google.android.gms.internal.firebase-auth-api.zzajc.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaio r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakn r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajc.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p001firebaseauthapi.zzalb.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzahp r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r2
            goto L53
        L72:
            com.google.android.gms.internal.p001firebaseauthapi.zzalb.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaio r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakn r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajc.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzaji r10 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakt.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzahk):void");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final int zzb(T t9) {
        int iHashCode = this.zzb.zzd(t9).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t9).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final boolean zzb(T t9, T t10) {
        if (!this.zzb.zzd(t9).equals(this.zzb.zzd(t10))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t9).equals(this.zzd.zza(t10));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final void zzc(T t9) {
        this.zzb.zzf(t9);
        this.zzd.zzc(t9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalf
    public final boolean zzd(T t9) {
        return this.zzd.zza(t9).zzg();
    }
}
