package com.google.android.gms.internal.cast;

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
final class zzts<T> implements zzua<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzvb.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zztp zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final zztd zzj;
    private final zzur zzk;
    private final zzrx zzl;
    private final zztu zzm;
    private final zztk zzn;

    private zzts(int[] iArr, Object[] objArr, int i9, int i10, zztp zztpVar, boolean z9, boolean z10, int[] iArr2, int i11, int i12, zztu zztuVar, zztd zztdVar, zzur zzurVar, zzrx zzrxVar, zztk zztkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z9;
        boolean z11 = false;
        if (zzrxVar != null && zzrxVar.zzc(zztpVar)) {
            z11 = true;
        }
        this.zzf = z11;
        this.zzh = iArr2;
        this.zzi = i11;
        this.zzm = zztuVar;
        this.zzj = zztdVar;
        this.zzk = zzurVar;
        this.zzl = zzrxVar;
        this.zze = zztpVar;
        this.zzn = zztkVar;
    }

    private final boolean zzA(Object obj, int i9) {
        int iZzn = zzn(i9);
        long j9 = iZzn & 1048575;
        if (j9 != 1048575) {
            return (zzvb.zzc(obj, j9) & (1 << (iZzn >>> 20))) != 0;
        }
        int iZzp = zzp(i9);
        long j10 = iZzp & 1048575;
        switch (zzo(iZzp)) {
            case 0:
                return Double.doubleToRawLongBits(zzvb.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvb.zzb(obj, j10)) != 0;
            case 2:
                return zzvb.zzd(obj, j10) != 0;
            case 3:
                return zzvb.zzd(obj, j10) != 0;
            case 4:
                return zzvb.zzc(obj, j10) != 0;
            case 5:
                return zzvb.zzd(obj, j10) != 0;
            case 6:
                return zzvb.zzc(obj, j10) != 0;
            case 7:
                return zzvb.zzw(obj, j10);
            case 8:
                Object objZzf = zzvb.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzrm) {
                    return !zzrm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzvb.zzf(obj, j10) != null;
            case 10:
                return !zzrm.zzb.equals(zzvb.zzf(obj, j10));
            case 11:
                return zzvb.zzc(obj, j10) != 0;
            case 12:
                return zzvb.zzc(obj, j10) != 0;
            case 13:
                return zzvb.zzc(obj, j10) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return zzvb.zzd(obj, j10) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zzvb.zzc(obj, j10) != 0;
            case 16:
                return zzvb.zzd(obj, j10) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return zzvb.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzB(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzA(obj, i9) : (i11 & i12) != 0;
    }

    private static boolean zzC(Object obj, int i9, zzua zzuaVar) {
        return zzuaVar.zzh(zzvb.zzf(obj, i9 & 1048575));
    }

    private static boolean zzD(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzsh) {
            return ((zzsh) obj).zzJ();
        }
        return true;
    }

    private final boolean zzE(Object obj, int i9, int i10) {
        return zzvb.zzc(obj, (long) (zzn(i10) & 1048575)) == i9;
    }

    private static boolean zzF(Object obj, long j9) {
        return ((Boolean) zzvb.zzf(obj, j9)).booleanValue();
    }

    private static final void zzG(int i9, Object obj, zzvi zzviVar) throws IOException {
        if (obj instanceof String) {
            zzviVar.zzD(i9, (String) obj);
        } else {
            zzviVar.zzd(i9, (zzrm) obj);
        }
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
    public static com.google.android.gms.internal.cast.zzts zzi(java.lang.Class r32, com.google.android.gms.internal.cast.zztm r33, com.google.android.gms.internal.cast.zztu r34, com.google.android.gms.internal.cast.zztd r35, com.google.android.gms.internal.cast.zzur r36, com.google.android.gms.internal.cast.zzrx r37, com.google.android.gms.internal.cast.zztk r38) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzi(java.lang.Class, com.google.android.gms.internal.cast.zztm, com.google.android.gms.internal.cast.zztu, com.google.android.gms.internal.cast.zztd, com.google.android.gms.internal.cast.zzur, com.google.android.gms.internal.cast.zzrx, com.google.android.gms.internal.cast.zztk):com.google.android.gms.internal.cast.zzts");
    }

    private static double zzj(Object obj, long j9) {
        return ((Double) zzvb.zzf(obj, j9)).doubleValue();
    }

    private static float zzk(Object obj, long j9) {
        return ((Float) zzvb.zzf(obj, j9)).floatValue();
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
    
        if (zzE(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r3 = com.google.android.gms.internal.cast.zzru.zzx(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r3 = com.google.android.gms.internal.cast.zzru.zzx(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.cast.zzru.zzu(zzm(r16, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013a, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        r3 = com.google.android.gms.internal.cast.zzru.zzy(zzq(r16, r3));
        r4 = com.google.android.gms.internal.cast.zzru.zzx(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        if (zzE(r16, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        if (r3 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019c, code lost:
    
        r4 = com.google.android.gms.internal.cast.zzru.zzx(r11 << 3) + com.google.android.gms.internal.cast.zzru.zzx(r3);
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
    private final int zzl(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzl(java.lang.Object):int");
    }

    private static int zzm(Object obj, long j9) {
        return ((Integer) zzvb.zzf(obj, j9)).intValue();
    }

    private final int zzn(int i9) {
        return this.zzc[i9 + 2];
    }

    private static int zzo(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzp(int i9) {
        return this.zzc[i9 + 1];
    }

    private static long zzq(Object obj, long j9) {
        return ((Long) zzvb.zzf(obj, j9)).longValue();
    }

    private final zzua zzr(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzua zzuaVar = (zzua) this.zzd[i11];
        if (zzuaVar != null) {
            return zzuaVar;
        }
        zzua zzuaVarZzb = zztx.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzuaVarZzb;
        return zzuaVarZzb;
    }

    private final Object zzs(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    private static Field zzt(Class cls, String str) {
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

    private final void zzu(Object obj, Object obj2, int i9) {
        if (zzA(obj2, i9)) {
            int iZzp = zzp(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzp;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzua zzuaVarZzr = zzr(i9);
            if (!zzA(obj, i9)) {
                if (zzD(object)) {
                    Object objZzc = zzuaVarZzr.zzc();
                    zzuaVarZzr.zze(objZzc, object);
                    unsafe.putObject(obj, j9, objZzc);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzw(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzD(object2)) {
                Object objZzc2 = zzuaVarZzr.zzc();
                zzuaVarZzr.zze(objZzc2, object2);
                unsafe.putObject(obj, j9, objZzc2);
                object2 = objZzc2;
            }
            zzuaVarZzr.zze(object2, object);
        }
    }

    private final void zzv(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (zzE(obj2, i10, i9)) {
            int iZzp = zzp(i9) & 1048575;
            Unsafe unsafe = zzb;
            long j9 = iZzp;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
            }
            zzua zzuaVarZzr = zzr(i9);
            if (!zzE(obj, i10, i9)) {
                if (zzD(object)) {
                    Object objZzc = zzuaVarZzr.zzc();
                    zzuaVarZzr.zze(objZzc, object);
                    unsafe.putObject(obj, j9, objZzc);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                zzx(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!zzD(object2)) {
                Object objZzc2 = zzuaVarZzr.zzc();
                zzuaVarZzr.zze(objZzc2, object2);
                unsafe.putObject(obj, j9, objZzc2);
                object2 = objZzc2;
            }
            zzuaVarZzr.zze(object2, object);
        }
    }

    private final void zzw(Object obj, int i9) {
        int iZzn = zzn(i9);
        long j9 = 1048575 & iZzn;
        if (j9 == 1048575) {
            return;
        }
        zzvb.zzq(obj, j9, (1 << (iZzn >>> 20)) | zzvb.zzc(obj, j9));
    }

    private final void zzx(Object obj, int i9, int i10) {
        zzvb.zzq(obj, zzn(i10) & 1048575, i9);
    }

    private final void zzy(zzvi zzviVar, int i9, Object obj, int i10) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzz(Object obj, Object obj2, int i9) {
        return zzA(obj, i9) == zzA(obj2, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x035b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.cast.zzrm) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.cast.zzrm) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.cast.zzru.zzw((java.lang.String) r4);
     */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[PHI: r3
      0x00f9: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x0115, B:68:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzb(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final Object zzc() {
        return ((zzsh) this.zze).zzw();
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
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zze(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r17, com.google.android.gms.internal.cast.zzvi r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzf(java.lang.Object, com.google.android.gms.internal.cast.zzvi):void");
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final boolean zzg(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iZzp = zzp(i9);
            long j9 = iZzp & 1048575;
            switch (zzo(iZzp)) {
                case 0:
                    if (!zzz(obj, obj2, i9) || Double.doubleToLongBits(zzvb.zza(obj, j9)) != Double.doubleToLongBits(zzvb.zza(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzz(obj, obj2, i9) || Float.floatToIntBits(zzvb.zzb(obj, j9)) != Float.floatToIntBits(zzvb.zzb(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzz(obj, obj2, i9) || zzvb.zzd(obj, j9) != zzvb.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzz(obj, obj2, i9) || zzvb.zzd(obj, j9) != zzvb.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzz(obj, obj2, i9) || zzvb.zzd(obj, j9) != zzvb.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzz(obj, obj2, i9) || zzvb.zzw(obj, j9) != zzvb.zzw(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzz(obj, obj2, i9) || !zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzz(obj, obj2, i9) || !zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzz(obj, obj2, i9) || !zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!zzz(obj, obj2, i9) || zzvb.zzd(obj, j9) != zzvb.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!zzz(obj, obj2, i9) || zzvb.zzc(obj, j9) != zzvb.zzc(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzz(obj, obj2, i9) || zzvb.zzd(obj, j9) != zzvb.zzd(obj2, j9)) {
                        return false;
                    }
                    break;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    if (!zzz(obj, obj2, i9) || !zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
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
                    if (!zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
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
                    long jZzn = zzn(i9) & 1048575;
                    if (zzvb.zzc(obj, jZzn) != zzvb.zzc(obj2, jZzn) || !zzuc.zzV(zzvb.zzf(obj, j9), zzvb.zzf(obj2, j9))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzk.zzc(obj).equals(this.zzk.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzl.zza(obj);
        this.zzl.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzh(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzts.zzh(java.lang.Object):boolean");
    }
}
