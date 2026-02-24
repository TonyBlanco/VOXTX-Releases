package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import G8.L;
import G8.M;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k8.m;
import k8.n;
import k8.q;
import l8.AbstractC2205B;
import l8.l;
import l8.s;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2512c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzba implements zzas, zzbi {

    @NotNull
    public static final zzat zza = new zzat(null);

    @NotNull
    private final zzbc zzb;

    @NotNull
    private final L zzc;

    @NotNull
    private final zzbn zzd;

    @NotNull
    private final Map zze;

    @NotNull
    private final Map zzf;

    public zzba(@NotNull zzbc zzbcVar, @NotNull L l9, @NotNull Context context) {
        this.zzb = zzbcVar;
        this.zzc = l9;
        zzbn zzbnVar = new zzbn();
        this.zzd = zzbnVar;
        this.zze = zzbnVar.zzb().zzc();
        this.zzf = AbstractC2205B.e(m.a(39, zzbt.zza), m.a(34, zzcg.zza), m.a(35, zzco.zza), m.a(25, zzbz.zza), m.a(37, zzcn.zza), m.a(21, zzbo.zza), m.a(22, zzcm.zza), m.a(23, zzch.zza), m.a(24, zzbw.zza), m.a(1, zzcj.zza), m.a(2, zzbs.zza), m.a(38, zzcl.zza), m.a(3, zzca.zza), m.a(4, zzcb.zza), m.a(17, zzbv.zza), m.a(32, zzbp.zza), m.a(5, zzcd.zza), m.a(31, zzbq.zza), m.a(36, zzbr.zza), m.a(16, zzbu.zza), m.a(26, zzck.zza), m.a(6, zzcc.zza), m.a(27, zzci.zza), m.a(8, zzce.zza), m.a(9, zzcf.zza));
        zzcr.zzb(new int[0]);
        zzbnVar.zze(3, context);
    }

    public static final /* synthetic */ void zzh(zzba zzbaVar, int i9, List list) throws zzt {
        if (list.isEmpty()) {
            throw new zzt(4, 3, null);
        }
        if (!zzx(list)) {
            throw new zzt(4, 5, null);
        }
        zzmk zzmkVarZzf = zzmn.zzf();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzmu zzmuVar = (zzmu) it.next();
            zzml zzmlVarZzf = zzmm.zzf();
            Object objZza = zzbaVar.zzd.zzb().zza(zzmuVar);
            if (objZza == null) {
                throw new zzt(4, 4, null);
            }
            if (objZza instanceof Integer) {
                zzmlVarZzf.zzt(((Number) objZza).intValue());
            } else if (objZza instanceof Short) {
                zzmlVarZzf.zzs(((Number) objZza).shortValue());
            } else if (objZza instanceof Byte) {
                zzmlVarZzf.zze(zzez.zzm(new byte[]{((Number) objZza).byteValue()}, 0, 1));
            } else if (objZza instanceof Long) {
                zzmlVarZzf.zzu(((Number) objZza).longValue());
            } else if (objZza instanceof Double) {
                zzmlVarZzf.zzq(((Number) objZza).doubleValue());
            } else if (objZza instanceof Float) {
                zzmlVarZzf.zzr(((Number) objZza).floatValue());
            } else if (objZza instanceof Boolean) {
                zzmlVarZzf.zzd(((Boolean) objZza).booleanValue());
            } else if (objZza instanceof Character) {
                zzmlVarZzf.zzp(objZza.toString());
            } else {
                zzmlVarZzf.zzv(objZza instanceof String ? (String) objZza : objZza.toString());
            }
            zzmkVarZzf.zze((zzmm) zzmlVarZzf.zzj());
        }
        zzbm zzbmVarZzb = zzbaVar.zzd.zzb();
        byte[] bArrZzd = ((zzmn) zzmkVarZzf.zzj()).zzd();
        zzbmVarZzb.zzf(i9, zzeb.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }

    public static final /* synthetic */ void zzi(zzba zzbaVar, List list) throws zzt {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object objZza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (objZza2 == null) {
            throw new zzt(4, 4, null);
        }
        if (!(objZza2 instanceof Integer) && !(objZza2 instanceof Short) && !(objZza2 instanceof Byte) && !(objZza2 instanceof Long) && !(objZza2 instanceof Double) && !(objZza2 instanceof Float) && !(objZza2 instanceof Boolean) && !(objZza2 instanceof Character) && !(objZza2 instanceof String)) {
            throw new zzt(4, 7, null);
        }
        zzbaVar.zzv(str, objZza2.toString());
    }

    public static final /* synthetic */ void zzj(zzba zzbaVar, List list) throws zzt {
        if (!zzx(list)) {
            throw new zzt(4, 5, null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbaVar.zzd.zzb().zzb(((zzmu) it.next()).zzi());
        }
    }

    public static final /* synthetic */ void zzk(zzba zzbaVar, int i9, List list) throws zzt {
        int iIntValue;
        if (list.size() != 4 && list.size() != 5) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object objZza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzt(4, 5, null);
        }
        Object objZza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(2));
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            throw new zzt(4, 5, null);
        }
        String strZza = zzbh.zza(zzbaVar, str2, zzbaVar.zzd.zza());
        Object objZza4 = zzbaVar.zzd.zzb().zza((zzmu) list.get(3));
        if (list.size() == 5) {
            Object objZza5 = zzbaVar.zzd.zzb().zza((zzmu) list.get(4));
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                throw new zzt(4, 5, null);
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            byte bZza = zzbaVar.zzd.zza();
            if (objZza2 instanceof String) {
                objZza2 = zzbh.zza(zzbaVar, (String) objZza2, bZza);
            }
            Class clsZza = zzbk.zza(objZza2);
            zzbaVar.zzd.zzb().zzf(i9, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzbe(new zzau(zzbaVar, str, iIntValue), strZza, objZza4)));
        } catch (Exception e9) {
            throw new zzt(6, 20, e9);
        }
    }

    public static final /* synthetic */ void zzl(zzba zzbaVar, int i9, List list) throws zzt {
        if (list.size() != 4 && list.size() != 5) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            throw new zzt(4, 5, null);
        }
        int iIntValue = num.intValue();
        Object objZza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            throw new zzt(4, 5, null);
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(2));
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        String strZza = zzbh.zza(zzbaVar, str, zzbaVar.zzd.zza());
        Object objZza4 = zzbaVar.zzd.zzb().zza((zzmu) list.get(3));
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            throw new zzt(4, 5, null);
        }
        String strZza2 = zzbh.zza(zzbaVar, str2, zzbaVar.zzd.zza());
        Object objZza5 = list.size() == 5 ? zzbaVar.zzd.zzb().zza((zzmu) list.get(4)) : null;
        zzbf zzbfVar = new zzbf(iIntValue2);
        try {
            Class clsZza = zzbk.zza(strZza);
            zzbaVar.zzd.zzb().zzf(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzbg(zzbfVar, strZza2, objZza5)));
            zzbaVar.zzd.zzb().zzf(i9, zzbfVar);
        } catch (Exception e9) {
            throw new zzt(6, 20, e9);
        }
    }

    public static final /* synthetic */ void zzm(zzba zzbaVar, int i9, List list) throws zzt {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            zzbaVar.zzd.zzb().zzf(i9, field.get(zzbaVar.zzd.zzb().zza((zzmu) list.get(1))));
        } catch (Exception e9) {
            throw new zzt(6, 16, e9);
        }
    }

    public static final /* synthetic */ void zzn(zzba zzbaVar, int i9, List list) throws zzt {
        if (list.size() != 1) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            zzbaVar.zzd.zzb().zzf(i9, field.get(null));
        } catch (Exception e9) {
            throw new zzt(6, 16, e9);
        }
    }

    public static final /* synthetic */ void zzo(zzba zzbaVar, int i9, List list) throws zzt {
        if (list.isEmpty()) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Constructor)) {
            objZza = null;
        }
        Constructor constructor = (Constructor) objZza;
        if (constructor == null) {
            throw new zzt(4, 5, null);
        }
        Object[] objArrZzg = zzbaVar.zzd.zzb().zzg(list.subList(1, list.size()));
        try {
            zzbaVar.zzd.zzb().zzf(i9, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e9) {
            throw new zzt(6, 14, e9);
        }
    }

    public static final /* synthetic */ void zzp(zzba zzbaVar, List list) throws zzt {
        if (list.size() != 3) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            field.set(zzbaVar.zzd.zzb().zza((zzmu) list.get(1)), zzbaVar.zzd.zzb().zza((zzmu) list.get(2)));
        } catch (Exception e9) {
            throw new zzt(6, 11, e9);
        }
    }

    public static final /* synthetic */ void zzq(zzba zzbaVar, List list) throws zzt {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            field.set(null, zzbaVar.zzd.zzb().zza((zzmu) list.get(1)));
        } catch (Exception e9) {
            throw new zzt(6, 11, e9);
        }
    }

    public static final /* synthetic */ void zzr(zzba zzbaVar, zzn zznVar, int i9, List list) throws zzt {
        if (list.size() != 2 && list.size() != 0) {
            throw new zzt(4, 3, null);
        }
        if (list.size() == 0) {
            zzbaVar.zzd.zzb().zzf(i9, new zzn());
            return;
        }
        Object objZza = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object objZza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (objZza2 instanceof zzn)) {
            objZza2 = null;
        }
        zzn zznVar2 = (zzn) objZza2;
        if (zznVar2 == null) {
            throw new zzt(4, 5, null);
        }
        byte[] bArrZzd = zzar.zza(zznVar, zznVar2).zzd();
        zzbaVar.zzv(str, zzeb.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzt(List list, zzn zznVar, zzn zznVar2, InterfaceC2372d interfaceC2372d) {
        Object objC = M.c(new zzax(this, list, zznVar, zznVar2, null), interfaceC2372d);
        return objC == AbstractC2512c.d() ? objC : q.f43674a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzu(Exception exc, String str, zzn zznVar, zzn zznVar2, int i9, InterfaceC2372d interfaceC2372d) {
        Object objC = M.c(new zzay(exc, i9, zznVar, zznVar2, str, this, null), interfaceC2372d);
        return objC == AbstractC2512c.d() ? objC : q.f43674a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, String... strArr) {
        this.zzb.zzb(str, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzw(zzmv zzmvVar, zzbl zzblVar) throws zzt {
        zzdk zzdkVarZzb = zzdk.zzb();
        int iZzb = zzblVar.zzb();
        zzby zzbyVar = (zzby) this.zzf.get(Integer.valueOf(zzmvVar.zzf()));
        if (zzbyVar == null) {
            return false;
        }
        Object[] objArrZzg = this.zzd.zzb().zzg(zzmvVar.zzj());
        zzbyVar.zza(zzmvVar.zzg(), zzblVar, Arrays.copyOf(objArrZzg, objArrZzg.length));
        if (iZzb == zzblVar.zzb()) {
            zzblVar.zzg(zzblVar.zzb() + 1);
        }
        zzdkVarZzb.zzf();
        long jZza = zzdkVarZzb.zza(TimeUnit.MICROSECONDS);
        zzj zzjVar = zzj.zza;
        zzj.zza(zzms.zza(zzmvVar.zzk()), jZza);
        zzmvVar.zzk();
        s.A(zzmvVar.zzj(), null, null, null, 0, null, new zzav(this), 31, null);
        return true;
    }

    private static final boolean zzx(List list) {
        ArrayList arrayList = new ArrayList(l.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzmu) it.next()).zzM()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzmh zzy(String str, List list) throws zzt {
        if (str.length() == 0) {
            throw new zzt(3, 17, null);
        }
        try {
            zzcq zzcqVar = new zzcq((short) zzcr.zza(s.K(list)), (short) 255);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb.append((char) n.a(n.a(str.charAt(i9)) ^ n.a(zzcqVar.zza())));
            }
            return zzmh.zzg(zzeb.zzh().zzj(sb.toString()));
        } catch (Exception e9) {
            throw new zzt(3, 18, e9);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzas
    public final void zza(@NotNull String str) {
        AbstractC0579k.d(this.zzc, null, null, new zzaz(this, str, new zzn(), null), 3, null);
    }

    @NotNull
    public final zzbn zzb() {
        return this.zzd;
    }
}
