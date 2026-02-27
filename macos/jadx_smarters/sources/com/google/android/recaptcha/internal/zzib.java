package com.google.android.recaptcha.internal;

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
final class zzib<T> implements zzil<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhy zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzhm zzn;
    private final zzjf zzo;
    private final zzga zzp;
    private final zzie zzq;
    private final zzht zzr;

    private zzib(int[] iArr, Object[] objArr, int i9, int i10, zzhy zzhyVar, boolean z9, boolean z10, int[] iArr2, int i11, int i12, zzie zzieVar, zzhm zzhmVar, zzjf zzjfVar, zzga zzgaVar, zzht zzhtVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        this.zzi = zzhyVar instanceof zzgo;
        this.zzj = z9;
        boolean z11 = false;
        if (zzgaVar != null && zzgaVar.zzj(zzhyVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzq = zzieVar;
        this.zzn = zzhmVar;
        this.zzo = zzjfVar;
        this.zzp = zzgaVar;
        this.zzg = zzhyVar;
        this.zzr = zzhtVar;
    }

    private static long zzA(Object obj, long j9) {
        return ((Long) zzjp.zzf(obj, j9)).longValue();
    }

    private final zzgs zzB(int i9) {
        int i10 = i9 / 3;
        return (zzgs) this.zzd[i10 + i10 + 1];
    }

    private final zzil zzC(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzil zzilVar = (zzil) this.zzd[i11];
        if (zzilVar != null) {
            return zzilVar;
        }
        zzil zzilVarZzb = zzih.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzilVarZzb;
        return zzilVarZzb;
    }

    private final Object zzD(Object obj, int i9, Object obj2, zzjf zzjfVar, Object obj3) {
        int i10 = this.zzc[i9];
        Object objZzf = zzjp.zzf(obj, zzz(i9) & 1048575);
        if (objZzf == null || zzB(i9) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzF(Object obj, int i9) {
        zzil zzilVarZzC = zzC(i9);
        int iZzz = zzz(i9) & 1048575;
        if (!zzT(obj, i9)) {
            return zzilVarZzC.zze();
        }
        Object object = zzb.getObject(obj, iZzz);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzilVarZzC.zze();
        if (object != null) {
            zzilVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzG(Object obj, int i9, int i10) {
        zzil zzilVarZzC = zzC(i10);
        if (!zzX(obj, i9, i10)) {
            return zzilVarZzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i10) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzilVarZzC.zze();
        if (object != null) {
            zzilVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzH(Class cls, String str) {
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

    private static void zzI(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i9) {
        if (zzT(obj2, i9)) {
            int iZzz = zzz(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzz;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzil zzilVarZzC = zzC(i9);
            if (!zzT(obj, i9)) {
                if (zzW(object)) {
                    Object objZze = zzilVarZzC.zze();
                    zzilVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzM(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzW(object2)) {
                Object objZze2 = zzilVarZzC.zze();
                zzilVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzilVarZzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (zzX(obj2, i10, i9)) {
            int iZzz = zzz(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzz;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzil zzilVarZzC = zzC(i9);
            if (!zzX(obj, i10, i9)) {
                if (zzW(object)) {
                    Object objZze = zzilVarZzC.zze();
                    zzilVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzN(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzW(object2)) {
                Object objZze2 = zzilVarZzC.zze();
                zzilVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzilVarZzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i9, zzik zzikVar) throws IOException {
        int i10;
        Object objZzr;
        if (zzS(i9)) {
            i10 = i9 & 1048575;
            objZzr = zzikVar.zzs();
        } else {
            i10 = i9 & 1048575;
            objZzr = this.zzi ? zzikVar.zzr() : zzikVar.zzp();
        }
        zzjp.zzs(obj, i10, objZzr);
    }

    private final void zzM(Object obj, int i9) {
        int iZzw = zzw(i9);
        long j9 = 1048575 & iZzw;
        if (j9 == 1048575) {
            return;
        }
        zzjp.zzq(obj, j9, (1 << (iZzw >>> 20)) | zzjp.zzc(obj, j9));
    }

    private final void zzN(Object obj, int i9, int i10) {
        zzjp.zzq(obj, zzw(i10) & 1048575, i9);
    }

    private final void zzO(Object obj, int i9, Object obj2) {
        zzb.putObject(obj, zzz(i9) & 1048575, obj2);
        zzM(obj, i9);
    }

    private final void zzP(Object obj, int i9, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzN(obj, i9, i10);
    }

    private final void zzQ(zzjx zzjxVar, int i9, Object obj, int i10) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i9) {
        return zzT(obj, i9) == zzT(obj2, i9);
    }

    private static boolean zzS(int i9) {
        return (i9 & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i9) {
        int iZzw = zzw(i9);
        long j9 = iZzw & 1048575;
        if (j9 != 1048575) {
            return (zzjp.zzc(obj, j9) & (1 << (iZzw >>> 20))) != 0;
        }
        int iZzz = zzz(i9);
        long j10 = iZzz & 1048575;
        switch (zzy(iZzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzjp.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjp.zzb(obj, j10)) != 0;
            case 2:
                return zzjp.zzd(obj, j10) != 0;
            case 3:
                return zzjp.zzd(obj, j10) != 0;
            case 4:
                return zzjp.zzc(obj, j10) != 0;
            case 5:
                return zzjp.zzd(obj, j10) != 0;
            case 6:
                return zzjp.zzc(obj, j10) != 0;
            case 7:
                return zzjp.zzw(obj, j10);
            case 8:
                Object objZzf = zzjp.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzez) {
                    return !zzez.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjp.zzf(obj, j10) != null;
            case 10:
                return !zzez.zzb.equals(zzjp.zzf(obj, j10));
            case 11:
                return zzjp.zzc(obj, j10) != 0;
            case 12:
                return zzjp.zzc(obj, j10) != 0;
            case 13:
                return zzjp.zzc(obj, j10) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return zzjp.zzd(obj, j10) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zzjp.zzc(obj, j10) != 0;
            case 16:
                return zzjp.zzd(obj, j10) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return zzjp.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzT(obj, i9) : (i11 & i12) != 0;
    }

    private static boolean zzV(Object obj, int i9, zzil zzilVar) {
        return zzilVar.zzl(zzjp.zzf(obj, i9 & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zzF();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i9, int i10) {
        return zzjp.zzc(obj, (long) (zzw(i10) & 1048575)) == i9;
    }

    private static boolean zzY(Object obj, long j9) {
        return ((Boolean) zzjp.zzf(obj, j9)).booleanValue();
    }

    private static final void zzZ(int i9, Object obj, zzjx zzjxVar) throws IOException {
        if (obj instanceof String) {
            zzjxVar.zzG(i9, (String) obj);
        } else {
            zzjxVar.zzd(i9, (zzez) obj);
        }
    }

    public static zzjg zzd(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar != zzjg.zzc()) {
            return zzjgVar;
        }
        zzjg zzjgVarZzf = zzjg.zzf();
        zzgoVar.zzc = zzjgVarZzf;
        return zzjgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzib zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzhv r33, com.google.android.recaptcha.internal.zzie r34, com.google.android.recaptcha.internal.zzhm r35, com.google.android.recaptcha.internal.zzjf r36, com.google.android.recaptcha.internal.zzga r37, com.google.android.recaptcha.internal.zzht r38) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzhv, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzhm, com.google.android.recaptcha.internal.zzjf, com.google.android.recaptcha.internal.zzga, com.google.android.recaptcha.internal.zzht):com.google.android.recaptcha.internal.zzib");
    }

    private static double zzn(Object obj, long j9) {
        return ((Double) zzjp.zzf(obj, j9)).doubleValue();
    }

    private static float zzo(Object obj, long j9) {
        return ((Float) zzjp.zzf(obj, j9)).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x034c, code lost:
    
        if ((r10 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if ((r10 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011a, code lost:
    
        r11 = r12 << 3;
        r10 = com.google.android.recaptcha.internal.zzfk.zzx((java.lang.String) r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzp(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzp(java.lang.Object):int");
    }

    private static int zzq(Object obj, long j9) {
        return ((Integer) zzjp.zzf(obj, j9)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i9, int i10, int i11, long j9, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzE = zzE(i11);
        Object object = unsafe.getObject(obj, j9);
        if (zzht.zzb(object)) {
            zzhs zzhsVarZzb = zzhs.zza().zzb();
            zzht.zzc(zzhsVarZzb, object);
            unsafe.putObject(obj, j9, zzhsVarZzb);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j9, int i16, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, i9))));
                int i17 = i9 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, i9))));
                int i18 = i9 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm = zzen.zzm(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, Long.valueOf(zzemVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                int iZzj = zzen.zzj(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, Integer.valueOf(zzemVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Long.valueOf(zzen.zzq(bArr, i9)));
                int i19 = i9 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Integer.valueOf(zzen.zzb(bArr, i9)));
                int i20 = i9 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm2 = zzen.zzm(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, Boolean.valueOf(zzemVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int iZzj2 = zzen.zzj(bArr, i9, zzemVar);
                int i21 = zzemVar.zza;
                if (i21 == 0) {
                    unsafe.putObject(obj, j9, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zzju.zzf(bArr, iZzj2, iZzj2 + i21)) {
                        throw zzgy.zzd();
                    }
                    unsafe.putObject(obj, j9, new String(bArr, iZzj2, i21, zzgw.zzb));
                    iZzj2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i9;
                }
                Object objZzG = zzG(obj, i12, i16);
                int iZzo = zzen.zzo(objZzG, zzC(i16), bArr, i9, i10, zzemVar);
                zzP(obj, i12, i16, objZzG);
                return iZzo;
            case 61:
                if (i13 != 2) {
                    return i9;
                }
                int iZza = zzen.zza(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, zzemVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i9;
                }
                int iZzj3 = zzen.zzj(bArr, i9, zzemVar);
                int i22 = zzemVar.zza;
                zzgs zzgsVarZzB = zzB(i16);
                if (zzgsVarZzB == null || zzgsVarZzB.zza()) {
                    unsafe.putObject(obj, j9, Integer.valueOf(i22));
                    unsafe.putInt(obj, j10, i12);
                } else {
                    zzd(obj).zzj(i11, Long.valueOf(i22));
                }
                return iZzj3;
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                if (i13 != 0) {
                    return i9;
                }
                int iZzj4 = zzen.zzj(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, Integer.valueOf(zzff.zzF(zzemVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm3 = zzen.zzm(bArr, i9, zzemVar);
                unsafe.putObject(obj, j9, Long.valueOf(zzff.zzG(zzemVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 != 3) {
                    return i9;
                }
                Object objZzG2 = zzG(obj, i12, i16);
                int iZzn = zzen.zzn(objZzG2, zzC(i16), bArr, i9, i10, (i11 & (-8)) | 4, zzemVar);
                zzP(obj, i12, i16, objZzG2);
                return iZzn;
            default:
                return i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0268, code lost:
    
        if (r29.zzb != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x026a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x026c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x026d, code lost:
    
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0270, code lost:
    
        if (r4 >= r19) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0272, code lost:
    
        r6 = com.google.android.recaptcha.internal.zzen.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0278, code lost:
    
        if (r20 == r29.zza) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027b, code lost:
    
        r4 = com.google.android.recaptcha.internal.zzen.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0283, code lost:
    
        if (r29.zzb == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0286, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0146, code lost:
    
        r12.add(com.google.android.recaptcha.internal.zzez.zzm(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x026d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r4 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        r12.add(com.google.android.recaptcha.internal.zzez.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r12.add(com.google.android.recaptcha.internal.zzez.zzm(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        if (r1 >= r19) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        r4 = com.google.android.recaptcha.internal.zzen.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r20 == r29.zza) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzen.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r4 < 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        if (r4 > (r17.length - r1)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (r4 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01c6 -> B:93:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x020d -> B:112:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0283 -> B:151:0x026a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x015d -> B:63:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.recaptcha.internal.zzem r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.recaptcha.internal.zzem):int");
    }

    private final int zzu(int i9) {
        if (i9 < this.zze || i9 > this.zzf) {
            return -1;
        }
        return zzx(i9, 0);
    }

    private final int zzv(int i9, int i10) {
        if (i9 < this.zze || i9 > this.zzf) {
            return -1;
        }
        return zzx(i9, i10);
    }

    private final int zzw(int i9) {
        return this.zzc[i9 + 2];
    }

    private final int zzx(int i9, int i10) {
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

    private static int zzy(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzz(int i9) {
        return this.zzc[i9 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x035b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.recaptcha.internal.zzfk.zzx((java.lang.String) r4);
     */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[PHI: r3
      0x00f9: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x0115, B:68:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x050a, code lost:
    
        if (r3 == 1048575) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x050c, code lost:
    
        r30.putInt(r9, r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0512, code lost:
    
        r8 = r6.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0517, code lost:
    
        if (r8 >= r6.zzm) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0519, code lost:
    
        zzD(r34, r6.zzk[r8], null, r6.zzo, r34);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x052e, code lost:
    
        if (r15 != 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0530, code lost:
    
        if (r7 != r37) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0537, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0538, code lost:
    
        if (r7 > r37) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x053a, code lost:
    
        if (r10 != r15) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x053c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0541, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzem r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzem):int");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        return ((zzgo) this.zzg).zzs();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
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
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzg(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05aa A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:62:0x00e0, B:185:0x05a5, B:187:0x05aa, B:188:0x05af, B:118:0x02b9, B:120:0x02c2, B:121:0x02ce, B:122:0x02d2, B:123:0x02de, B:124:0x02e2, B:125:0x02ee, B:126:0x02f2, B:127:0x02fe, B:128:0x0302, B:129:0x030e, B:130:0x0312, B:131:0x031e, B:132:0x0322, B:133:0x032e, B:134:0x0332, B:135:0x033e, B:136:0x0343, B:137:0x034f, B:138:0x0354, B:139:0x0365, B:140:0x0376, B:141:0x0387, B:142:0x0398, B:143:0x03b4, B:144:0x03c2, B:145:0x03d3, B:146:0x03e8, B:148:0x03f1, B:149:0x0403, B:150:0x0415, B:151:0x0423, B:152:0x0431, B:153:0x043f, B:154:0x044d, B:155:0x045b, B:156:0x0469, B:157:0x0477, B:158:0x0485, B:159:0x0495, B:160:0x049a, B:161:0x04a7, B:162:0x04ac, B:163:0x04ba, B:164:0x04c8, B:165:0x04d6, B:167:0x04e3, B:170:0x04ea, B:171:0x04f0, B:172:0x04f7, B:173:0x0505, B:174:0x0513, B:175:0x0525, B:176:0x052d, B:177:0x053c, B:178:0x054b, B:179:0x055a, B:180:0x0569, B:181:0x0578, B:182:0x0587, B:183:0x0596), top: B:210:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05da A[LOOP:2: B:198:0x05d6->B:200:0x05da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05b5 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzik r19, com.google.android.recaptcha.internal.zzfz r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzik, com.google.android.recaptcha.internal.zzfz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ed, code lost:
    
        if (r0 != r24) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ef, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0302, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0332, code lost:
    
        if (r0 != r14) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x034f, code lost:
    
        if (r0 != r14) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.recaptcha.internal.zzem r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzem):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r18, com.google.android.recaptcha.internal.zzjx r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzjx):void");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzk(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iZzz = zzz(i9);
            long j9 = iZzz & 1048575;
            switch (zzy(iZzz)) {
                case 0:
                    if (!zzR(obj, obj2, i9) || Double.doubleToLongBits(zzjp.zza(obj, j9)) != Double.doubleToLongBits(zzjp.zza(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzR(obj, obj2, i9) || Float.floatToIntBits(zzjp.zzb(obj, j9)) != Float.floatToIntBits(zzjp.zzb(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzR(obj, obj2, i9) || zzjp.zzd(obj, j9) != zzjp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzR(obj, obj2, i9) || zzjp.zzd(obj, j9) != zzjp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzR(obj, obj2, i9) || zzjp.zzd(obj, j9) != zzjp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzR(obj, obj2, i9) || zzjp.zzw(obj, j9) != zzjp.zzw(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzR(obj, obj2, i9) || !zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzR(obj, obj2, i9) || !zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzR(obj, obj2, i9) || !zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!zzR(obj, obj2, i9) || zzjp.zzd(obj, j9) != zzjp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!zzR(obj, obj2, i9) || zzjp.zzc(obj, j9) != zzjp.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzR(obj, obj2, i9) || zzjp.zzd(obj, j9) != zzjp.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    if (!zzR(obj, obj2, i9) || !zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
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
                    if (!zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
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
                    long jZzw = zzw(i9) & 1048575;
                    if (zzjp.zzc(obj, jZzw) != zzjp.zzc(obj2, jZzw) || !zzin.zzY(zzjp.zzf(obj, j9), zzjp.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzp.zzb(obj).equals(this.zzp.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzl(java.lang.Object):boolean");
    }
}
