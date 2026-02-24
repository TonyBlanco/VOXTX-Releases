package com.google.android.gms.internal.measurement;

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
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i9, int i10, zzmi zzmiVar, boolean z9, boolean z10, int[] iArr2, int i11, int i12, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        this.zzi = z9;
        boolean z11 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i9) {
        int i10 = i9 / 3;
        return (zzlf) this.zzd[i10 + i10 + 1];
    }

    private final zzmt zzB(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzmt zzmtVar = (zzmt) this.zzd[i11];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzmtVarZzb = zzmq.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzmtVarZzb;
        return zzmtVarZzb;
    }

    private final Object zzC(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzD(Object obj, int i9) {
        zzmt zzmtVarZzB = zzB(i9);
        int iZzy = zzy(i9) & 1048575;
        if (!zzP(obj, i9)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, iZzy);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzE(Object obj, int i9, int i10) {
        zzmt zzmtVarZzB = zzB(i10);
        if (!zzT(obj, i9, i10)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i10) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i9) {
        if (zzP(obj2, i9)) {
            int iZzy = zzy(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzy;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i9);
            if (!zzP(obj, i9)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzJ(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (zzT(obj2, i10, i9)) {
            int iZzy = zzy(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzy;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i9);
            if (!zzT(obj, i10, i9)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j9, objZze);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzK(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j9, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i9) {
        int iZzv = zzv(i9);
        long j9 = 1048575 & iZzv;
        if (j9 == 1048575) {
            return;
        }
        zznu.zzq(obj, j9, (1 << (iZzv >>> 20)) | zznu.zzc(obj, j9));
    }

    private final void zzK(Object obj, int i9, int i10) {
        zznu.zzq(obj, zzv(i10) & 1048575, i9);
    }

    private final void zzL(Object obj, int i9, Object obj2) {
        zzb.putObject(obj, zzy(i9) & 1048575, obj2);
        zzJ(obj, i9);
    }

    private final void zzM(Object obj, int i9, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzK(obj, i9, i10);
    }

    private final void zzN(zzoc zzocVar, int i9, Object obj, int i10) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i9) {
        return zzP(obj, i9) == zzP(obj2, i9);
    }

    private final boolean zzP(Object obj, int i9) {
        int iZzv = zzv(i9);
        long j9 = iZzv & 1048575;
        if (j9 != 1048575) {
            return (zznu.zzc(obj, j9) & (1 << (iZzv >>> 20))) != 0;
        }
        int iZzy = zzy(i9);
        long j10 = iZzy & 1048575;
        switch (zzx(iZzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j10)) != 0;
            case 2:
                return zznu.zzd(obj, j10) != 0;
            case 3:
                return zznu.zzd(obj, j10) != 0;
            case 4:
                return zznu.zzc(obj, j10) != 0;
            case 5:
                return zznu.zzd(obj, j10) != 0;
            case 6:
                return zznu.zzc(obj, j10) != 0;
            case 7:
                return zznu.zzw(obj, j10);
            case 8:
                Object objZzf = zznu.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzka) {
                    return !zzka.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j10) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j10));
            case 11:
                return zznu.zzc(obj, j10) != 0;
            case 12:
                return zznu.zzc(obj, j10) != 0;
            case 13:
                return zznu.zzc(obj, j10) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return zznu.zzd(obj, j10) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zznu.zzc(obj, j10) != 0;
            case 16:
                return zznu.zzd(obj, j10) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return zznu.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzP(obj, i9) : (i11 & i12) != 0;
    }

    private static boolean zzR(Object obj, int i9, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i9 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i9, int i10) {
        return zznu.zzc(obj, (long) (zzv(i10) & 1048575)) == i9;
    }

    private static boolean zzU(Object obj, long j9) {
        return ((Boolean) zznu.zzf(obj, j9)).booleanValue();
    }

    private static final void zzV(int i9, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i9, (String) obj);
        } else {
            zzocVar.zzd(i9, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarZzf = zznl.zzf();
        zzlbVar.zzc = zznlVarZzf;
        return zznlVarZzf;
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
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r32, com.google.android.gms.internal.measurement.zzmf r33, com.google.android.gms.internal.measurement.zzmn r34, com.google.android.gms.internal.measurement.zzlw r35, com.google.android.gms.internal.measurement.zznk r36, com.google.android.gms.internal.measurement.zzko r37, com.google.android.gms.internal.measurement.zzmd r38) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j9) {
        return ((Double) zznu.zzf(obj, j9)).doubleValue();
    }

    private static float zzn(Object obj, long j9) {
        return ((Float) zznu.zzf(obj, j9)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0203, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021d, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022b, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0239, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0247, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0255, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r3 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r3 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.measurement.zzki.zzu(zzp(r16, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013a, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        r3 = com.google.android.gms.internal.measurement.zzki.zzy(zzz(r16, r3));
        r4 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019c, code lost:
    
        r4 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + com.google.android.gms.internal.measurement.zzki.zzx(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b3, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cd, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f6, code lost:
    
        if (r3 > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzo(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzo(java.lang.Object):int");
    }

    private static int zzp(Object obj, long j9) {
        return ((Integer) zznu.zzf(obj, j9)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i9, int i10, int i11, long j9, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzC = zzC(i11);
        Object object = unsafe.getObject(obj, j9);
        if (!((zzmc) object).zze()) {
            zzmc zzmcVarZzb = zzmc.zza().zzb();
            zzmd.zzb(zzmcVarZzb, object);
            unsafe.putObject(obj, j9, zzmcVarZzb);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j9, int i16, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i9))));
                int i17 = i9 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i9))));
                int i18 = i9 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm = zzjo.zzm(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, Long.valueOf(zzjnVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                int iZzj = zzjo.zzj(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, Integer.valueOf(zzjnVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Long.valueOf(zzjo.zzp(bArr, i9)));
                int i19 = i9 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Integer.valueOf(zzjo.zzb(bArr, i9)));
                int i20 = i9 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm2 = zzjo.zzm(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, Boolean.valueOf(zzjnVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int iZzj2 = zzjo.zzj(bArr, i9, zzjnVar);
                int i21 = zzjnVar.zza;
                if (i21 == 0) {
                    unsafe.putObject(obj, j9, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zznz.zze(bArr, iZzj2, iZzj2 + i21)) {
                        throw zzll.zzc();
                    }
                    unsafe.putObject(obj, j9, new String(bArr, iZzj2, i21, zzlj.zzb));
                    iZzj2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i9;
                }
                Object objZzE = zzE(obj, i12, i16);
                int iZzo = zzjo.zzo(objZzE, zzB(i16), bArr, i9, i10, zzjnVar);
                zzM(obj, i12, i16, objZzE);
                return iZzo;
            case 61:
                if (i13 != 2) {
                    return i9;
                }
                int iZza = zzjo.zza(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, zzjnVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i9;
                }
                int iZzj3 = zzjo.zzj(bArr, i9, zzjnVar);
                int i22 = zzjnVar.zza;
                zzlf zzlfVarZzA = zzA(i16);
                if (zzlfVarZzA == null || zzlfVarZzA.zza(i22)) {
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
                int iZzj4 = zzjo.zzj(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i9;
                }
                int iZzm3 = zzjo.zzm(bArr, i9, zzjnVar);
                unsafe.putObject(obj, j9, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 != 3) {
                    return i9;
                }
                Object objZzE2 = zzE(obj, i12, i16);
                int iZzn = zzjo.zzn(objZzE2, zzB(i16), bArr, i9, i10, (i11 & (-8)) | 4, zzjnVar);
                zzM(obj, i12, i16, objZzE2);
                return iZzn;
            default:
                return i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b4, code lost:
    
        if (r31.zzb != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02b8, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02b9, code lost:
    
        r14.zze(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02bc, code lost:
    
        if (r1 >= r21) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02be, code lost:
    
        r4 = com.google.android.gms.internal.measurement.zzjo.zzj(r19, r1, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02c4, code lost:
    
        if (r22 == r31.zza) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02c7, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzjo.zzm(r19, r4, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02cf, code lost:
    
        if (r31.zzb == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02d2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0193, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.zzka.zzl(r19, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02b9, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0183, code lost:
    
        if (r4 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.zzka.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018b, code lost:
    
        r14.add(com.google.android.gms.internal.measurement.zzka.zzl(r19, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
    
        if (r1 >= r21) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        r4 = com.google.android.gms.internal.measurement.zzjo.zzj(r19, r1, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r22 == r31.zza) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019e, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzjo.zzj(r19, r4, r31);
        r4 = r31.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a4, code lost:
    
        if (r4 < 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        if (r4 > (r19.length - r1)) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        if (r4 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b1, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0213 -> B:114:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x025a -> B:133:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x02cf -> B:171:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01aa -> B:84:0x0185). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(java.lang.Object r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, com.google.android.gms.internal.measurement.zzjn r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzjn):int");
    }

    private final int zzt(int i9) {
        if (i9 < this.zze || i9 > this.zzf) {
            return -1;
        }
        return zzw(i9, 0);
    }

    private final int zzu(int i9, int i10) {
        if (i9 < this.zze || i9 > this.zzf) {
            return -1;
        }
        return zzw(i9, i10);
    }

    private final int zzv(int i9) {
        return this.zzc[i9 + 2];
    }

    private final int zzw(int i9, int i10) {
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

    private static int zzx(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzy(int i9) {
        return this.zzc[i9 + 1];
    }

    private static long zzz(Object obj, long j9) {
        return ((Long) zznu.zzf(obj, j9)).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x035b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzka) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzka) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.measurement.zzki.zzw((java.lang.String) r4);
     */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[PHI: r3
      0x00f9: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x0115, B:68:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0449, code lost:
    
        if (r6 == 1048575) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x044b, code lost:
    
        r29.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0451, code lost:
    
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0455, code lost:
    
        if (r2 >= r8.zzl) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0457, code lost:
    
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0469, code lost:
    
        if (r5 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0470, code lost:
    
        if (r8.zzA(r4) != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0472, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0475, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x047d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0480, code lost:
    
        if (r9 != 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0482, code lost:
    
        if (r0 != r35) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0489, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x048a, code lost:
    
        if (r0 > r35) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x048c, code lost:
    
        if (r3 != r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x048e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0493, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.zzjn r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
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
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzg(java.lang.Object, java.lang.Object):void");
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
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r17, com.google.android.gms.internal.measurement.zzoc r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzi(java.lang.Object, com.google.android.gms.internal.measurement.zzoc):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iZzy = zzy(i9);
            long j9 = iZzy & 1048575;
            switch (zzx(iZzy)) {
                case 0:
                    if (!zzO(obj, obj2, i9) || Double.doubleToLongBits(zznu.zza(obj, j9)) != Double.doubleToLongBits(zznu.zza(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzO(obj, obj2, i9) || Float.floatToIntBits(zznu.zzb(obj, j9)) != Float.floatToIntBits(zznu.zzb(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzO(obj, obj2, i9) || zznu.zzd(obj, j9) != zznu.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzO(obj, obj2, i9) || zznu.zzd(obj, j9) != zznu.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzO(obj, obj2, i9) || zznu.zzd(obj, j9) != zznu.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzO(obj, obj2, i9) || zznu.zzw(obj, j9) != zznu.zzw(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzO(obj, obj2, i9) || !zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzO(obj, obj2, i9) || !zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzO(obj, obj2, i9) || !zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!zzO(obj, obj2, i9) || zznu.zzd(obj, j9) != zznu.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!zzO(obj, obj2, i9) || zznu.zzc(obj, j9) != zznu.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzO(obj, obj2, i9) || zznu.zzd(obj, j9) != zznu.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    if (!zzO(obj, obj2, i9) || !zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
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
                    if (!zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
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
                    long jZzv = zzv(i9) & 1048575;
                    if (zznu.zzc(obj, jZzv) != zznu.zzc(obj2, jZzv) || !zzmv.zzV(zznu.zzf(obj, j9), zznu.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzk(java.lang.Object):boolean");
    }
}
