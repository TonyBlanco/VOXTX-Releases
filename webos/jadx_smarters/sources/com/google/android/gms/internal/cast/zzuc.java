package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzur zzc;
    private static final zzur zzd;
    private static final zzur zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzW(false);
        zzd = zzW(true);
        zze = new zzut();
    }

    public static zzur zzA() {
        return zze;
    }

    public static void zzB(zzur zzurVar, Object obj, Object obj2) {
        zzurVar.zzf(obj, zzurVar.zzd(zzurVar.zzc(obj), zzurVar.zzc(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzsh.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i9, list, z9);
    }

    public static void zzE(int i9, List list, zzvi zzviVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zze(i9, list);
    }

    public static void zzF(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i9, list, z9);
    }

    public static void zzG(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzi(i9, list, z9);
    }

    public static void zzH(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzk(i9, list, z9);
    }

    public static void zzI(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzm(i9, list, z9);
    }

    public static void zzJ(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzo(i9, list, z9);
    }

    public static void zzK(int i9, List list, zzvi zzviVar, zzua zzuaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzrv) zzviVar).zzp(i9, list.get(i10), zzuaVar);
        }
    }

    public static void zzL(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzr(i9, list, z9);
    }

    public static void zzM(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzt(i9, list, z9);
    }

    public static void zzN(int i9, List list, zzvi zzviVar, zzua zzuaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzrv) zzviVar).zzu(i9, list.get(i10), zzuaVar);
        }
    }

    public static void zzO(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzw(i9, list, z9);
    }

    public static void zzP(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i9, list, z9);
    }

    public static void zzQ(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i9, list, z9);
    }

    public static void zzR(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i9, list, z9);
    }

    public static void zzS(int i9, List list, zzvi zzviVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i9, list);
    }

    public static void zzT(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzG(i9, list, z9);
    }

    public static void zzU(int i9, List list, zzvi zzviVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzI(i9, list, z9);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zzur zzW(boolean z9) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzur) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z9));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i9 << 3) + 1);
    }

    public static int zzb(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = size * zzru.zzx(i9 << 3);
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iZzd = ((zzrm) list.get(i10)).zzd();
            iZzx += zzru.zzx(iZzd) + iZzd;
        }
        return iZzx;
    }

    public static int zzc(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzd(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzru.zzu(zzsiVar.zzd(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzru.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzu;
    }

    public static int zze(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i9 << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i9 << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i9, List list, zzua zzuaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzt += zzru.zzt(i9, (zztp) list.get(i10), zzuaVar);
        }
        return iZzt;
    }

    public static int zzj(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzk(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzru.zzu(zzsiVar.zzd(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzru.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzu;
    }

    public static int zzl(int i9, List list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzru.zzx(i9 << 3));
    }

    public static int zzm(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzru.zzy(zzteVar.zzd(i9));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzru.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzy;
    }

    public static int zzn(int i9, Object obj, zzua zzuaVar) {
        if (!(obj instanceof zzsv)) {
            return zzru.zzx(i9 << 3) + zzru.zzv((zztp) obj, zzuaVar);
        }
        int i10 = zzru.zzb;
        int iZza = ((zzsv) obj).zza();
        return zzru.zzx(i9 << 3) + zzru.zzx(iZza) + iZza;
    }

    public static int zzo(int i9, List list, zzua zzuaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzru.zzx(i9 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzsv) {
                int iZza = ((zzsv) obj).zza();
                iZzx += zzru.zzx(iZza) + iZza;
            } else {
                iZzx += zzru.zzv((zztp) obj, zzuaVar);
            }
        }
        return iZzx;
    }

    public static int zzp(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzq(List list) {
        int iZzx;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzx = 0;
            while (i9 < size) {
                int iZzd = zzsiVar.zzd(i9);
                iZzx += zzru.zzx((iZzd >> 31) ^ (iZzd + iZzd));
                i9++;
            }
        } else {
            iZzx = 0;
            while (i9 < size) {
                int iIntValue = ((Integer) list.get(i9)).intValue();
                iZzx += zzru.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i9++;
            }
        }
        return iZzx;
    }

    public static int zzr(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzs(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i9 < size) {
                long jZzd = zzteVar.zzd(i9);
                iZzy += zzru.zzy((jZzd >> 63) ^ (jZzd + jZzd));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                long jLongValue = ((Long) list.get(i9)).longValue();
                iZzy += zzru.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
        }
        return iZzy;
    }

    public static int zzt(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int i11 = zzru.zzb;
        boolean z9 = list instanceof zzsx;
        int iZzx = zzru.zzx(i9 << 3) * size;
        if (z9) {
            zzsx zzsxVar = (zzsx) list;
            while (i10 < size) {
                Object objZze = zzsxVar.zze(i10);
                if (objZze instanceof zzrm) {
                    int iZzd = ((zzrm) objZze).zzd();
                    iZzx += zzru.zzx(iZzd) + iZzd;
                } else {
                    iZzx += zzru.zzw((String) objZze);
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzrm) {
                    int iZzd2 = ((zzrm) obj).zzd();
                    iZzx += zzru.zzx(iZzd2) + iZzd2;
                } else {
                    iZzx += zzru.zzw((String) obj);
                }
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzu(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzv(List list) {
        int iZzx;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzx = 0;
            while (i9 < size) {
                iZzx += zzru.zzx(zzsiVar.zzd(i9));
                i9++;
            }
        } else {
            iZzx = 0;
            while (i9 < size) {
                iZzx += zzru.zzx(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzx;
    }

    public static int zzw(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzru.zzx(i9 << 3));
    }

    public static int zzx(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzru.zzy(zzteVar.zzd(i9));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzru.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzy;
    }

    public static zzur zzy() {
        return zzc;
    }

    public static zzur zzz() {
        return zzd;
    }
}
