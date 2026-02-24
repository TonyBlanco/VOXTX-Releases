package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznkVar = (zznk) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    public static Object zzA(Object obj, int i9, int i10, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i9, i10);
        return obj2;
    }

    public static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i9, list, z9);
    }

    public static void zzE(int i9, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i9, list);
    }

    public static void zzF(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i9, list, z9);
    }

    public static void zzG(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i9, list, z9);
    }

    public static void zzH(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i9, list, z9);
    }

    public static void zzI(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i9, list, z9);
    }

    public static void zzJ(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i9, list, z9);
    }

    public static void zzK(int i9, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzkj) zzocVar).zzq(i9, list.get(i10), zzmtVar);
        }
    }

    public static void zzL(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i9, list, z9);
    }

    public static void zzM(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i9, list, z9);
    }

    public static void zzN(int i9, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzkj) zzocVar).zzv(i9, list.get(i10), zzmtVar);
        }
    }

    public static void zzO(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i9, list, z9);
    }

    public static void zzP(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i9, list, z9);
    }

    public static void zzQ(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i9, list, z9);
    }

    public static void zzR(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i9, list, z9);
    }

    public static void zzS(int i9, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i9, list);
    }

    public static void zzT(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i9, list, z9);
    }

    public static void zzU(int i9, List list, zzoc zzocVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i9, list, z9);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i9 << 3) + 1);
    }

    public static int zzb(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = size * zzki.zzx(i9 << 3);
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iZzd = ((zzka) list.get(i10)).zzd();
            iZzx += zzki.zzx(iZzd) + iZzd;
        }
        return iZzx;
    }

    public static int zzc(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzd(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzki.zzu(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzki.zzu(((Integer) list.get(i9)).intValue());
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
        return size * (zzki.zzx(i9 << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i9 << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i9, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzt += zzki.zzt(i9, (zzmi) list.get(i10), zzmtVar);
        }
        return iZzt;
    }

    public static int zzj(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzk(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzki.zzu(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzki.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzu;
    }

    public static int zzl(int i9, List list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzki.zzx(i9 << 3));
    }

    public static int zzm(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzki.zzy(zzlxVar.zza(i9));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzki.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzy;
    }

    public static int zzn(int i9, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i9 << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i10 = zzki.zzb;
        int iZza = ((zzlo) obj).zza();
        return zzki.zzx(i9 << 3) + zzki.zzx(iZza) + iZza;
    }

    public static int zzo(int i9, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzki.zzx(i9 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzlo) {
                int iZza = ((zzlo) obj).zza();
                iZzx += zzki.zzx(iZza) + iZza;
            } else {
                iZzx += zzki.zzv((zzmi) obj, zzmtVar);
            }
        }
        return iZzx;
    }

    public static int zzp(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzq(List list) {
        int iZzx;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            iZzx = 0;
            while (i9 < size) {
                int iZze = zzlcVar.zze(i9);
                iZzx += zzki.zzx((iZze >> 31) ^ (iZze + iZze));
                i9++;
            }
        } else {
            iZzx = 0;
            while (i9 < size) {
                int iIntValue = ((Integer) list.get(i9)).intValue();
                iZzx += zzki.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
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
        return zzs(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzs(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            iZzy = 0;
            while (i9 < size) {
                long jZza = zzlxVar.zza(i9);
                iZzy += zzki.zzy((jZza >> 63) ^ (jZza + jZza));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                long jLongValue = ((Long) list.get(i9)).longValue();
                iZzy += zzki.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
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
        boolean z9 = list instanceof zzlq;
        int iZzx = zzki.zzx(i9 << 3) * size;
        if (z9) {
            zzlq zzlqVar = (zzlq) list;
            while (i10 < size) {
                Object objZzf = zzlqVar.zzf(i10);
                if (objZzf instanceof zzka) {
                    int iZzd = ((zzka) objZzf).zzd();
                    iZzx += zzki.zzx(iZzd) + iZzd;
                } else {
                    iZzx += zzki.zzw((String) objZzf);
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzka) {
                    int iZzd2 = ((zzka) obj).zzd();
                    iZzx += zzki.zzx(iZzd2) + iZzd2;
                } else {
                    iZzx += zzki.zzw((String) obj);
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
        return zzv(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzv(List list) {
        int iZzx;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            iZzx = 0;
            while (i9 < size) {
                iZzx += zzki.zzx(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            iZzx = 0;
            while (i9 < size) {
                iZzx += zzki.zzx(((Integer) list.get(i9)).intValue());
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
        return zzx(list) + (size * zzki.zzx(i9 << 3));
    }

    public static int zzx(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzki.zzy(zzlxVar.zza(i9));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzki.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzy;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
