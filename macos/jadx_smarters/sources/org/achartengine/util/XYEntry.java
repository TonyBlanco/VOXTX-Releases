package org.achartengine.util;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class XYEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    public XYEntry(K k9, V v9) {
        this.key = k9;
        this.value = v9;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v9) {
        this.value = v9;
        return v9;
    }
}
