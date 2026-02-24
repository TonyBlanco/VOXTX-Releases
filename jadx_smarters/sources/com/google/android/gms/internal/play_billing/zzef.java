package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i9, int i10, zzec zzecVar, int i11, boolean z9, int[] iArr2, int i12, int i13, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        boolean z10 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i9) {
        if (zzI(obj2, i9)) {
            int iZzs = zzs(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzs;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i9);
            if (!zzI(obj, i9)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzD(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (zzM(obj2, i10, i9)) {
            int iZzs = zzs(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzs;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i9);
            if (!zzM(obj, i10, i9)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzE(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i9) {
        int iZzp = zzp(i9);
        long j9 = 1048575 & iZzp;
        if (j9 == 1048575) {
            return;
        }
        zzfp.zzq(obj, j9, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j9));
    }

    private final void zzE(Object obj, int i9, int i10) {
        zzfp.zzq(obj, zzp(i10) & 1048575, i9);
    }

    private final void zzF(Object obj, int i9, Object obj2) {
        zzb.putObject(obj, zzs(i9) & 1048575, obj2);
        zzD(obj, i9);
    }

    private final void zzG(Object obj, int i9, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzE(obj, i9, i10);
    }

    private final boolean zzH(Object obj, Object obj2, int i9) {
        return zzI(obj, i9) == zzI(obj2, i9);
    }

    private final boolean zzI(Object obj, int i9) {
        int iZzp = zzp(i9);
        long j9 = iZzp & 1048575;
        if (j9 != 1048575) {
            return (zzfp.zzc(obj, j9) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i9);
        long j10 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j10)) != 0;
            case 2:
                return zzfp.zzd(obj, j10) != 0;
            case 3:
                return zzfp.zzd(obj, j10) != 0;
            case 4:
                return zzfp.zzc(obj, j10) != 0;
            case 5:
                return zzfp.zzd(obj, j10) != 0;
            case 6:
                return zzfp.zzc(obj, j10) != 0;
            case 7:
                return zzfp.zzw(obj, j10);
            case 8:
                Object objZzf = zzfp.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j10) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j10));
            case 11:
                return zzfp.zzc(obj, j10) != 0;
            case 12:
                return zzfp.zzc(obj, j10) != 0;
            case 13:
                return zzfp.zzc(obj, j10) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return zzfp.zzd(obj, j10) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zzfp.zzc(obj, j10) != 0;
            case 16:
                return zzfp.zzd(obj, j10) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return zzfp.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzI(obj, i9) : (i11 & i12) != 0;
    }

    private static boolean zzK(Object obj, int i9, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i9 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i9, int i10) {
        return zzfp.zzc(obj, (long) (zzp(i10) & 1048575)) == i9;
    }

    private static boolean zzN(Object obj, long j9) {
        return ((Boolean) zzfp.zzf(obj, j9)).booleanValue();
    }

    private static final void zzO(int i9, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i9, (String) obj);
        } else {
            zzfxVar.zzd(i9, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzdz r34, com.google.android.gms.internal.play_billing.zzei r35, com.google.android.gms.internal.play_billing.zzdq r36, com.google.android.gms.internal.play_billing.zzff r37, com.google.android.gms.internal.play_billing.zzce r38, com.google.android.gms.internal.play_billing.zzdx r39) {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j9) {
        return ((Double) zzfp.zzf(obj, j9)).doubleValue();
    }

    private static float zzn(Object obj, long j9) {
        return ((Float) zzfp.zzf(obj, j9)).floatValue();
    }

    private static int zzo(Object obj, long j9) {
        return ((Integer) zzfp.zzf(obj, j9)).intValue();
    }

    private final int zzp(int i9) {
        return this.zzc[i9 + 2];
    }

    private final int zzq(int i9, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i9 == i13) {
                return i12;
            }
            if (i9 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzs(int i9) {
        return this.zzc[i9 + 1];
    }

    private static long zzt(Object obj, long j9) {
        return ((Long) zzfp.zzf(obj, j9)).longValue();
    }

    private final zzcw zzu(int i9) {
        int i10 = i9 / 3;
        return (zzcw) this.zzd[i10 + i10 + 1];
    }

    private final zzeo zzv(int i9) {
        Object[] objArr = this.zzd;
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzeo zzeoVar = (zzeo) objArr[i11];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzx(Object obj, int i9) {
        zzeo zzeoVarZzv = zzv(i9);
        int iZzs = zzs(i9) & 1048575;
        if (!zzI(obj, i9)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i9, int i10) {
        zzeo zzeoVarZzv = zzv(i10);
        if (!zzM(obj, i9, i10)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i10) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0538, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.zzbq) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.zzbq) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0);
        r1 = com.google.android.gms.internal.play_billing.zzby.zzv((java.lang.String) r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a1  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5 A[PHI: r1 r2
      0x00f5: PHI (r1v14 int) = (r1v9 int), (r1v15 int) binds: [B:74:0x0111, B:68:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r2v10 java.lang.Object) = (r2v7 java.lang.Object), (r2v11 java.lang.Object) binds: [B:74:0x0111, B:68:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0711, code lost:
    
        if (r3 == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0713, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.zzbq.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0719, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.zzbq.zzl(r40, r2, r3));
        r2 = r2 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0721, code lost:
    
        if (r2 >= r42) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0723, code lost:
    
        r3 = com.google.android.gms.internal.play_billing.zzbd.zzh(r40, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0729, code lost:
    
        if (r11 != r10.zza) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x072b, code lost:
    
        r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r40, r3, r10);
        r3 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0731, code lost:
    
        if (r3 < 0) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0735, code lost:
    
        if (r3 > (r40.length - r2)) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0737, code lost:
    
        if (r3 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x073e, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0743, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0744, code lost:
    
        r3 = r38;
        r0 = r40;
        r7 = r10;
        r13 = r15;
        r15 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08b5, code lost:
    
        if (r7.zzb != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08b7, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08b9, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08ba, code lost:
    
        r12.zze(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x08bd, code lost:
    
        if (r8 >= r42) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x08bf, code lost:
    
        r9 = com.google.android.gms.internal.play_billing.zzbd.zzh(r0, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x08c5, code lost:
    
        if (r3 != r7.zza) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x08c7, code lost:
    
        r8 = com.google.android.gms.internal.play_billing.zzbd.zzk(r0, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x08cf, code lost:
    
        if (r7.zzb == 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0df6, code lost:
    
        if (r0 == r11) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0df8, code lost:
    
        r36.putInt(r7, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0dfe, code lost:
    
        r0 = r13.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0e02, code lost:
    
        if (r0 >= r13.zzk) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0e04, code lost:
    
        r1 = r13.zzi;
        r3 = r13.zzc;
        r1 = r1[r0];
        r3 = r3[r1];
        r3 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r13.zzs(r1) & r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0e16, code lost:
    
        if (r3 != null) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0e1e, code lost:
    
        if (r13.zzu(r1) != null) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0e21, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0e23, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzdw) r3;
        r0 = (com.google.android.gms.internal.play_billing.zzdv) r13.zzw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0e2b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0e2c, code lost:
    
        if (r9 != 0) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0e2e, code lost:
    
        if (r8 != r14) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0e35, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0e36, code lost:
    
        if (r8 > r14) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0e38, code lost:
    
        if (r2 != r9) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0e3a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0e3f, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0721, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.zzbq.zzl(r40, r2, r3));
        r2 = r2 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x08ba, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0ab3 A[PHI: r0 r3 r7 r11 r13 r14 r15 r36
      0x0ab3: PHI (r0v72 byte[]) = (r0v28 byte[]), (r0v30 byte[]), (r0v32 byte[]), (r0v42 byte[]), (r0v56 byte[]), (r0v71 byte[]), (r0v76 byte[]) binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r3v114 com.google.android.gms.internal.play_billing.zzef<T>) = 
      (r3v75 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v76 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v77 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v85 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v95 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v109 com.google.android.gms.internal.play_billing.zzef<T>)
      (r3v119 com.google.android.gms.internal.play_billing.zzef<T>)
     binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r7v32 com.google.android.gms.internal.play_billing.zzbc) = 
      (r7v12 com.google.android.gms.internal.play_billing.zzbc)
      (r7v13 com.google.android.gms.internal.play_billing.zzbc)
      (r7v14 com.google.android.gms.internal.play_billing.zzbc)
      (r7v20 com.google.android.gms.internal.play_billing.zzbc)
      (r7v27 com.google.android.gms.internal.play_billing.zzbc)
      (r7v31 com.google.android.gms.internal.play_billing.zzbc)
      (r7v37 com.google.android.gms.internal.play_billing.zzbc)
     binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r11v72 int) = (r11v31 int), (r11v31 int), (r11v31 int), (r11v59 int), (r11v31 int), (r11v31 int), (r11v31 int) binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r13v96 int) = (r13v77 int), (r13v78 int), (r13v79 int), (r13v85 int), (r13v92 int), (r13v95 int), (r13v101 int) binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r14v100 int) = (r14v72 int), (r14v73 int), (r14v74 int), (r14v80 int), (r14v93 int), (r14v97 int), (r14v105 int) binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r15v40 int) = (r15v16 int), (r15v17 int), (r15v18 int), (r15v21 int), (r15v30 int), (r15v37 int), (r15v45 int) binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0ab3: PHI (r36v29 sun.misc.Unsafe) = 
      (r36v8 sun.misc.Unsafe)
      (r36v9 sun.misc.Unsafe)
      (r36v10 sun.misc.Unsafe)
      (r36v16 sun.misc.Unsafe)
      (r36v22 sun.misc.Unsafe)
      (r36v26 sun.misc.Unsafe)
      (r36v32 sun.misc.Unsafe)
     binds: [B:450:0x0a85, B:434:0x0a29, B:417:0x09d9, B:343:0x0869, B:286:0x075d, B:210:0x05ec, B:192:0x058d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0d6f  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0ab6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0ace A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x0737 -> B:265:0x0713). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:307:0x07eb -> B:299:0x07ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:329:0x083f -> B:319:0x0816). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:367:0x08cf -> B:360:0x08b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.play_billing.zzbc r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzg(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i9, int i10, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i9, i10, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r25, com.google.android.gms.internal.play_billing.zzfx r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int iZzs = zzs(i9);
            long j9 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i9) || Double.doubleToLongBits(zzfp.zza(obj, j9)) != Double.doubleToLongBits(zzfp.zza(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i9) || Float.floatToIntBits(zzfp.zzb(obj, j9)) != Float.floatToIntBits(zzfp.zzb(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i9) || zzfp.zzd(obj, j9) != zzfp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i9) || zzfp.zzd(obj, j9) != zzfp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i9) || zzfp.zzd(obj, j9) != zzfp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i9) || zzfp.zzw(obj, j9) != zzfp.zzw(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i9) || !zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i9) || !zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i9) || !zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!zzH(obj, obj2, i9) || zzfp.zzd(obj, j9) != zzfp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!zzH(obj, obj2, i9) || zzfp.zzc(obj, j9) != zzfp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i9) || zzfp.zzd(obj, j9) != zzfp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    if (!zzH(obj, obj2, i9) || !zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case LangUtils.HASH_OFFSET /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                case 67:
                case 68:
                    long jZzp = zzp(i9) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j9), zzfp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzk(java.lang.Object):boolean");
    }
}
