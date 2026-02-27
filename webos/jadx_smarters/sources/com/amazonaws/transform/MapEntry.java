package com.amazonaws.transform;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    public K setKey(K k9) {
        this.key = k9;
        return k9;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v9) {
        this.value = v9;
        return v9;
    }
}
