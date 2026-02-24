package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class zzalg<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzalr> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzals zze;
    private Map<K, V> zzf;
    private volatile zzalk zzg;

    private zzalg(int i9) {
        this.zza = i9;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalr> r0 = r4.zzb
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalr> r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.firebase-auth-api.zzalr r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzalr) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalr> r3 = r4.zzb
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.firebase-auth-api.zzalr r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzalr) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzalg.zza(java.lang.Comparable):int");
    }

    public static <FieldDescriptorType extends zzaix<FieldDescriptorType>> zzalg<FieldDescriptorType, Object> zza(int i9) {
        return new zzalj(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i9) {
        zzg();
        V v9 = (V) this.zzb.remove(i9).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zzb.add(new zzalr(this, it.next()));
            it.remove();
        }
        return v9;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzals(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalg)) {
            return super.equals(obj);
        }
        zzalg zzalgVar = (zzalg) obj;
        int size = size();
        if (size != zzalgVar.size()) {
            return false;
        }
        int iZza = zza();
        if (iZza != zzalgVar.zza()) {
            objEntrySet = entrySet();
            objEntrySet2 = zzalgVar.entrySet();
        } else {
            for (int i9 = 0; i9 < iZza; i9++) {
                if (!zzb(i9).equals(zzalgVar.zzb(i9))) {
                    return false;
                }
            }
            if (iZza == size) {
                return true;
            }
            objEntrySet = this.zzc;
            objEntrySet2 = zzalgVar.zzc;
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) this.zzb.get(iZza).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZza = zza();
        int iHashCode = 0;
        for (int i9 = 0; i9 < iZza; i9++) {
            iHashCode += this.zzb.get(i9).hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzc(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public final int zza() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k9, V v9) {
        zzg();
        int iZza = zza(k9);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).setValue(v9);
        }
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i9 = -(iZza + 1);
        if (i9 >= this.zza) {
            return zzf().put(k9, v9);
        }
        int size = this.zzb.size();
        int i10 = this.zza;
        if (size == i10) {
            zzalr zzalrVarRemove = this.zzb.remove(i10 - 1);
            zzf().put((Comparable) zzalrVarRemove.getKey(), zzalrVarRemove.getValue());
        }
        this.zzb.add(i9, new zzalr(this, k9, v9));
        return null;
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? zzalm.zza() : this.zzc.entrySet();
    }

    public final Map.Entry<K, V> zzb(int i9) {
        return this.zzb.get(i9);
    }

    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzg == null) {
            this.zzg = new zzalk(this);
        }
        return this.zzg;
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
