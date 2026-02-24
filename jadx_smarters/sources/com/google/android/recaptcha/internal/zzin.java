package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzin {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzjf zzc;
    private static final zzjf zzd;
    private static final zzjf zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzZ(false);
        zzd = zzZ(true);
        zze = new zzjh();
    }

    public static zzjf zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i9, List list, zzgs zzgsVar, Object obj2, zzjf zzjfVar) {
        if (zzgsVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int iIntValue = num.intValue();
                if (zzgsVar.zza()) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = zzC(obj, i9, iIntValue, obj2, zzjfVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgsVar.zza()) {
                    obj2 = zzC(obj, i9, iIntValue2, obj2, zzjfVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzC(Object obj, int i9, int i10, Object obj2, zzjf zzjfVar) {
        if (obj2 == null) {
            obj2 = zzjfVar.zzc(obj);
        }
        zzjfVar.zzl(obj2, i9, i10);
        return obj2;
    }

    public static void zzD(zzga zzgaVar, Object obj, Object obj2) {
        zzge zzgeVarZzb = zzgaVar.zzb(obj2);
        if (zzgeVarZzb.zza.isEmpty()) {
            return;
        }
        zzgaVar.zzc(obj).zzh(zzgeVarZzb);
    }

    public static void zzE(zzjf zzjfVar, Object obj, Object obj2) {
        zzjfVar.zzo(obj, zzjfVar.zze(zzjfVar.zzd(obj), zzjfVar.zzd(obj2)));
    }

    public static void zzF(Class cls) {
        Class cls2;
        if (!zzgo.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzG(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzc(i9, list, z9);
    }

    public static void zzH(int i9, List list, zzjx zzjxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zze(i9, list);
    }

    public static void zzI(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzg(i9, list, z9);
    }

    public static void zzJ(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzj(i9, list, z9);
    }

    public static void zzK(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzl(i9, list, z9);
    }

    public static void zzL(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzn(i9, list, z9);
    }

    public static void zzM(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzp(i9, list, z9);
    }

    public static void zzN(int i9, List list, zzjx zzjxVar, zzil zzilVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzfl) zzjxVar).zzq(i9, list.get(i10), zzilVar);
        }
    }

    public static void zzO(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzs(i9, list, z9);
    }

    public static void zzP(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzu(i9, list, z9);
    }

    public static void zzQ(int i9, List list, zzjx zzjxVar, zzil zzilVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzfl) zzjxVar).zzv(i9, list.get(i10), zzilVar);
        }
    }

    public static void zzR(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzy(i9, list, z9);
    }

    public static void zzS(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzA(i9, list, z9);
    }

    public static void zzT(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzC(i9, list, z9);
    }

    public static void zzU(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzE(i9, list, z9);
    }

    public static void zzV(int i9, List list, zzjx zzjxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzH(i9, list);
    }

    public static void zzW(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzJ(i9, list, z9);
    }

    public static void zzX(int i9, List list, zzjx zzjxVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjxVar.zzL(i9, list, z9);
    }

    public static boolean zzY(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zzjf zzZ(boolean z9) {
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
            return (zzjf) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z9));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfk.zzy(i9 << 3) + 1);
    }

    public static int zzb(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzy = size * zzfk.zzy(i9 << 3);
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iZzd = ((zzez) list.get(i10)).zzd();
            iZzy += zzfk.zzy(iZzd) + iZzd;
        }
        return iZzy;
    }

    public static int zzc(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzd(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzfk.zzu(zzgpVar.zze(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzfk.zzu(((Integer) list.get(i9)).intValue());
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
        return size * (zzfk.zzy(i9 << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfk.zzy(i9 << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i9, List list, zzil zzilVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzt += zzfk.zzt(i9, (zzhy) list.get(i10), zzilVar);
        }
        return iZzt;
    }

    public static int zzj(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzk(List list) {
        int iZzu;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzfk.zzu(zzgpVar.zze(i9));
                i9++;
            }
        } else {
            iZzu = 0;
            while (i9 < size) {
                iZzu += zzfk.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzu;
    }

    public static int zzl(int i9, List list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzfk.zzy(i9 << 3));
    }

    public static int zzm(List list) {
        int iZzz;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            iZzz = 0;
            while (i9 < size) {
                iZzz += zzfk.zzz(zzhnVar.zze(i9));
                i9++;
            }
        } else {
            iZzz = 0;
            while (i9 < size) {
                iZzz += zzfk.zzz(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzz;
    }

    public static int zzn(int i9, Object obj, zzil zzilVar) {
        if (!(obj instanceof zzhe)) {
            return zzfk.zzy(i9 << 3) + zzfk.zzw((zzhy) obj, zzilVar);
        }
        int i10 = zzfk.zzb;
        int iZza = ((zzhe) obj).zza();
        return zzfk.zzy(i9 << 3) + zzfk.zzy(iZza) + iZza;
    }

    public static int zzo(int i9, List list, zzil zzilVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzy = zzfk.zzy(i9 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzhe) {
                int iZza = ((zzhe) obj).zza();
                iZzy += zzfk.zzy(iZza) + iZza;
            } else {
                iZzy += zzfk.zzw((zzhy) obj, zzilVar);
            }
        }
        return iZzy;
    }

    public static int zzp(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzq(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            iZzy = 0;
            while (i9 < size) {
                int iZze = zzgpVar.zze(i9);
                iZzy += zzfk.zzy((iZze >> 31) ^ (iZze + iZze));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                int iIntValue = ((Integer) list.get(i9)).intValue();
                iZzy += zzfk.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i9++;
            }
        }
        return iZzy;
    }

    public static int zzr(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzs(List list) {
        int iZzz;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            iZzz = 0;
            while (i9 < size) {
                long jZze = zzhnVar.zze(i9);
                iZzz += zzfk.zzz((jZze >> 63) ^ (jZze + jZze));
                i9++;
            }
        } else {
            iZzz = 0;
            while (i9 < size) {
                long jLongValue = ((Long) list.get(i9)).longValue();
                iZzz += zzfk.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
        }
        return iZzz;
    }

    public static int zzt(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int i11 = zzfk.zzb;
        boolean z9 = list instanceof zzhg;
        int iZzy = zzfk.zzy(i9 << 3) * size;
        if (z9) {
            zzhg zzhgVar = (zzhg) list;
            while (i10 < size) {
                Object objZzf = zzhgVar.zzf(i10);
                if (objZzf instanceof zzez) {
                    int iZzd = ((zzez) objZzf).zzd();
                    iZzy += zzfk.zzy(iZzd) + iZzd;
                } else {
                    iZzy += zzfk.zzx((String) objZzf);
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzez) {
                    int iZzd2 = ((zzez) obj).zzd();
                    iZzy += zzfk.zzy(iZzd2) + iZzd2;
                } else {
                    iZzy += zzfk.zzx((String) obj);
                }
                i10++;
            }
        }
        return iZzy;
    }

    public static int zzu(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzv(List list) {
        int iZzy;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzfk.zzy(zzgpVar.zze(i9));
                i9++;
            }
        } else {
            iZzy = 0;
            while (i9 < size) {
                iZzy += zzfk.zzy(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iZzy;
    }

    public static int zzw(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzfk.zzy(i9 << 3));
    }

    public static int zzx(List list) {
        int iZzz;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            iZzz = 0;
            while (i9 < size) {
                iZzz += zzfk.zzz(zzhnVar.zze(i9));
                i9++;
            }
        } else {
            iZzz = 0;
            while (i9 < size) {
                iZzz += zzfk.zzz(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iZzz;
    }

    public static zzjf zzy() {
        return zzc;
    }

    public static zzjf zzz() {
        return zzd;
    }
}
