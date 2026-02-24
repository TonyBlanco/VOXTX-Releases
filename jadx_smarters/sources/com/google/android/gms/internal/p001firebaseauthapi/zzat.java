package com.google.android.gms.internal.p001firebaseauthapi;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzat<K, V> implements Serializable, Map<K, V>, j$.util.Map {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzau<Map.Entry<K, V>> zzb;
    private transient zzau<K> zzc;
    private transient zzak<V> zzd;

    public static <K, V> zzat<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzat) && !(map instanceof SortedMap)) {
            zzat<K, V> zzatVar = (zzat) map;
            zzatVar.zzd();
            return zzatVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        zzas zzasVar = new zzas(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzasVar.zza(setEntrySet);
        return zzasVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzak) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzau<Map.Entry<K, V>> zzauVar = this.zzb;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<Map.Entry<K, V>> zzauVarZzb = zzb();
        this.zzb = zzauVarZzb;
        return zzauVarZzb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v9) {
        V v10 = get(obj);
        return v10 != null ? v10 : v9;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzbd.zza((zzau) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzau<K> zzauVar = this.zzc;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<K> zzauVarZzc = zzc();
        this.zzc = zzauVarZzc;
        return zzauVarZzc;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k9, V v9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        int size = size();
        zzai.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzak<V> zzakVar = this.zzd;
        if (zzakVar != null) {
            return zzakVar;
        }
        zzak<V> zzakVarZza = zza();
        this.zzd = zzakVarZza;
        return zzakVarZza;
    }

    public abstract zzak<V> zza();

    public abstract zzau<Map.Entry<K, V>> zzb();

    public abstract zzau<K> zzc();

    public abstract boolean zzd();
}
