package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzalh {
    private static final Class<?> zza = zzd();
    private static final zzame<?, ?> zzb = zzc();
    private static final zzame<?, ?> zzc = new zzamg();

    public static int zza(int i9, Object obj, zzalf zzalfVar) {
        return obj instanceof zzajr ? zzaik.zzb(i9, (zzajr) obj) : zzaik.zzb(i9, (zzakn) obj, zzalfVar);
    }

    public static int zza(int i9, List<zzahp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = size * zzaik.zzi(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZzi += zzaik.zza(list.get(i10));
        }
        return iZzi;
    }

    public static int zza(int i9, List<zzakn> list, zzalf zzalfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZza += zzaik.zza(i9, list.get(i10), zzalfVar);
        }
        return iZza;
    }

    public static int zza(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i9, true);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzame<?, ?> zza() {
        return zzb;
    }

    public static <UT, UB> UB zza(Object obj, int i9, int i10, UB ub, zzame<UT, UB> zzameVar) {
        if (ub == null) {
            ub = zzameVar.zzc(obj);
        }
        zzameVar.zzb(ub, i9, i10);
        return ub;
    }

    public static <UT, UB> UB zza(Object obj, int i9, List<Integer> list, zzajg zzajgVar, UB ub, zzame<UT, UB> zzameVar) {
        if (zzajgVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (zzajgVar.zza(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) zza(obj, i9, iIntValue, ub, zzameVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzajgVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i9, iIntValue2, ub, zzameVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i9, List<zzahp> list, zzana zzanaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i9, list);
    }

    public static void zza(int i9, List<?> list, zzana zzanaVar, zzalf zzalfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i9, list, zzalfVar);
    }

    public static void zza(int i9, List<Boolean> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i9, list, z9);
    }

    public static <T, FT extends zzaix<FT>> void zza(zzaiq<FT> zzaiqVar, T t9, T t10) {
        zzaiv<T> zzaivVarZza = zzaiqVar.zza(t10);
        if (zzaivVarZza.zza.isEmpty()) {
            return;
        }
        zzaiqVar.zzb(t9).zza((zzaiv) zzaivVarZza);
    }

    public static <T> void zza(zzakg zzakgVar, T t9, T t10, long j9) {
        zzamk.zza(t9, j9, zzakgVar.zza(zzamk.zze(t9, j9), zzamk.zze(t10, j9)));
    }

    public static <T, UT, UB> void zza(zzame<UT, UB> zzameVar, T t9, T t10) {
        zzameVar.zzc(t9, zzameVar.zza(zzameVar.zzd(t9), zzameVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzajc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzb(int i9, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzaik.zzi(i9) * size;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            while (i10 < size) {
                Object objZzb = zzajtVar.zzb(i10);
                iZzi += objZzb instanceof zzahp ? zzaik.zza((zzahp) objZzb) : zzaik.zza((String) objZzb);
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                iZzi += obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((String) obj);
                i10++;
            }
        }
        return iZzi;
    }

    public static int zzb(int i9, List<?> list, zzalf zzalfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzaik.zzi(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iZzi += obj instanceof zzajr ? zzaik.zza((zzajr) obj) : zzaik.zza((zzakn) obj, zzalfVar);
        }
        return iZzi;
    }

    public static int zzb(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaik.zzi(i9));
    }

    public static int zzb(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzc = 0;
            while (i9 < size) {
                iZzc += zzaik.zzc(zzajdVar.zzb(i9));
                i9++;
            }
        } else {
            iZzc = 0;
            while (i9 < size) {
                iZzc += zzaik.zzc(list.get(i9).intValue());
                i9++;
            }
        }
        return iZzc;
    }

    public static zzame<?, ?> zzb() {
        return zzc;
    }

    public static void zzb(int i9, List<String> list, zzana zzanaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i9, list);
    }

    public static void zzb(int i9, List<?> list, zzana zzanaVar, zzalf zzalfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i9, list, zzalfVar);
    }

    public static void zzb(int i9, List<Double> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i9, list, z9);
    }

    public static int zzc(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zzc(i9, 0);
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    private static zzame<?, ?> zzc() {
        try {
            Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (zzame) clsZze.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzc(i9, list, z9);
    }

    public static int zzd(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i9, 0L);
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzd(i9, list, z9);
    }

    public static int zze(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaik.zzi(i9));
    }

    public static int zze(List<Integer> list) {
        int iZze;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZze = 0;
            while (i9 < size) {
                iZze += zzaik.zze(zzajdVar.zzb(i9));
                i9++;
            }
        } else {
            iZze = 0;
            while (i9 < size) {
                iZze += zzaik.zze(list.get(i9).intValue());
                i9++;
            }
        }
        return iZze;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zze(int i9, List<Long> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zze(i9, list, z9);
    }

    public static int zzf(int i9, List<Long> list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaik.zzi(i9));
    }

    public static int zzf(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            iZzd = 0;
            while (i9 < size) {
                iZzd += zzaik.zzd(zzajyVar.zzb(i9));
                i9++;
            }
        } else {
            iZzd = 0;
            while (i9 < size) {
                iZzd += zzaik.zzd(list.get(i9).longValue());
                i9++;
            }
        }
        return iZzd;
    }

    public static void zzf(int i9, List<Float> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzf(i9, list, z9);
    }

    public static int zzg(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaik.zzi(i9));
    }

    public static int zzg(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzh = 0;
            while (i9 < size) {
                iZzh += zzaik.zzh(zzajdVar.zzb(i9));
                i9++;
            }
        } else {
            iZzh = 0;
            while (i9 < size) {
                iZzh += zzaik.zzh(list.get(i9).intValue());
                i9++;
            }
        }
        return iZzh;
    }

    public static void zzg(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzg(i9, list, z9);
    }

    public static int zzh(int i9, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaik.zzi(i9));
    }

    public static int zzh(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            iZzf = 0;
            while (i9 < size) {
                iZzf += zzaik.zzf(zzajyVar.zzb(i9));
                i9++;
            }
        } else {
            iZzf = 0;
            while (i9 < size) {
                iZzf += zzaik.zzf(list.get(i9).longValue());
                i9++;
            }
        }
        return iZzf;
    }

    public static void zzh(int i9, List<Long> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzh(i9, list, z9);
    }

    public static int zzi(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaik.zzi(i9));
    }

    public static int zzi(List<Integer> list) {
        int iZzj;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzj = 0;
            while (i9 < size) {
                iZzj += zzaik.zzj(zzajdVar.zzb(i9));
                i9++;
            }
        } else {
            iZzj = 0;
            while (i9 < size) {
                iZzj += zzaik.zzj(list.get(i9).intValue());
                i9++;
            }
        }
        return iZzj;
    }

    public static void zzi(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzi(i9, list, z9);
    }

    public static int zzj(int i9, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaik.zzi(i9));
    }

    public static int zzj(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            iZzg = 0;
            while (i9 < size) {
                iZzg += zzaik.zzg(zzajyVar.zzb(i9));
                i9++;
            }
        } else {
            iZzg = 0;
            while (i9 < size) {
                iZzg += zzaik.zzg(list.get(i9).longValue());
                i9++;
            }
        }
        return iZzg;
    }

    public static void zzj(int i9, List<Long> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzj(i9, list, z9);
    }

    public static void zzk(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzk(i9, list, z9);
    }

    public static void zzl(int i9, List<Long> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzl(i9, list, z9);
    }

    public static void zzm(int i9, List<Integer> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzm(i9, list, z9);
    }

    public static void zzn(int i9, List<Long> list, zzana zzanaVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzn(i9, list, z9);
    }
}
