package M4;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzoy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzgi f4766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f4767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f4768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f4769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f4770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0713b f4771h;

    public /* synthetic */ j5(C0713b c0713b, String str, i5 i5Var) {
        this.f4771h = c0713b;
        this.f4764a = str;
        this.f4765b = true;
        this.f4767d = new BitSet();
        this.f4768e = new BitSet();
        this.f4769f = new C2695a();
        this.f4770g = new C2695a();
    }

    public /* synthetic */ j5(C0713b c0713b, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, i5 i5Var) {
        this.f4771h = c0713b;
        this.f4764a = str;
        this.f4767d = bitSet;
        this.f4768e = bitSet2;
        this.f4769f = map;
        this.f4770g = new C2695a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f4770g.put(num, arrayList);
        }
        this.f4765b = false;
        this.f4766c = zzgiVar;
    }

    public final zzfp a(int i9) {
        ArrayList arrayList;
        List listEmptyList;
        zzfo zzfoVarZzb = zzfp.zzb();
        zzfoVarZzb.zza(i9);
        zzfoVarZzb.zzc(this.f4765b);
        zzgi zzgiVar = this.f4766c;
        if (zzgiVar != null) {
            zzfoVarZzb.zzd(zzgiVar);
        }
        zzgh zzghVarZze = zzgi.zze();
        zzghVarZze.zzb(U4.J(this.f4767d));
        zzghVarZze.zzd(U4.J(this.f4768e));
        Map map = this.f4769f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f4769f.keySet()) {
                int iIntValue = num.intValue();
                Long l9 = (Long) this.f4769f.get(num);
                if (l9 != null) {
                    zzfq zzfqVarZzc = zzfr.zzc();
                    zzfqVarZzc.zzb(iIntValue);
                    zzfqVarZzc.zza(l9.longValue());
                    arrayList2.add((zzfr) zzfqVarZzc.zzaD());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzghVarZze.zza(arrayList);
        }
        Map map2 = this.f4770g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f4770g.keySet()) {
                zzgj zzgjVarZzd = zzgk.zzd();
                zzgjVarZzd.zzb(num2.intValue());
                List list = (List) this.f4770g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zzgjVarZzd.zza(list);
                }
                arrayList3.add((zzgk) zzgjVarZzd.zzaD());
            }
            listEmptyList = arrayList3;
        }
        zzghVarZze.zzc(listEmptyList);
        zzfoVarZzb.zzb(zzghVarZze);
        return (zzfp) zzfoVarZzb.zzaD();
    }

    public final void c(n5 n5Var) {
        int iA = n5Var.a();
        if (n5Var.f4960c != null) {
            this.f4768e.set(iA, true);
        }
        Boolean bool = n5Var.f4961d;
        if (bool != null) {
            this.f4767d.set(iA, bool.booleanValue());
        }
        if (n5Var.f4962e != null) {
            Map map = this.f4769f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l9 = (Long) map.get(numValueOf);
            long jLongValue = n5Var.f4962e.longValue() / 1000;
            if (l9 == null || jLongValue > l9.longValue()) {
                this.f4769f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (n5Var.f4963f != null) {
            Map map2 = this.f4770g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4770g.put(numValueOf2, arrayList);
            }
            if (n5Var.c()) {
                arrayList.clear();
            }
            zzoy.zzc();
            C0749h c0749hZ = this.f4771h.f4245a.z();
            String str = this.f4764a;
            C0775l1 c0775l1 = AbstractC0781m1.f4885a0;
            if (c0749hZ.B(str, c0775l1) && n5Var.b()) {
                arrayList.clear();
            }
            zzoy.zzc();
            boolean zB = this.f4771h.f4245a.z().B(this.f4764a, c0775l1);
            Long lValueOf = Long.valueOf(n5Var.f4963f.longValue() / 1000);
            if (!zB) {
                arrayList.add(lValueOf);
            } else {
                if (arrayList.contains(lValueOf)) {
                    return;
                }
                arrayList.add(lValueOf);
            }
        }
    }
}
