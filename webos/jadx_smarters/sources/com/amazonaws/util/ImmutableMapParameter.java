package com.amazonaws.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableMapParameter<K, V> implements Map<K, V> {
    private static final String DUPLICATED_KEY_MESSAGE = "Duplicate keys are provided.";
    private static final String UNMODIFIABLE_MESSAGE = "This is an immutable map.";
    private final Map<K, V> map;

    public static class Builder<K, V> {
        private final Map<K, V> entries = new HashMap();

        public ImmutableMapParameter<K, V> build() {
            HashMap map = new HashMap();
            map.putAll(this.entries);
            return new ImmutableMapParameter<>(map);
        }

        public Builder<K, V> put(K k9, V v9) {
            ImmutableMapParameter.putAndWarnDuplicateKeys(this.entries, k9, v9);
            return this;
        }
    }

    private ImmutableMapParameter(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k9, V v9) {
        return new ImmutableMapParameter<>(Collections.singletonMap(k9, v9));
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k9, V v9, K k10, V v10) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k9, v9);
        putAndWarnDuplicateKeys(map, k10, v10);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k9, V v9, K k10, V v10, K k11, V v11) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k9, v9);
        putAndWarnDuplicateKeys(map, k10, v10);
        putAndWarnDuplicateKeys(map, k11, v11);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k9, v9);
        putAndWarnDuplicateKeys(map, k10, v10);
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k9, v9);
        putAndWarnDuplicateKeys(map, k10, v10);
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        putAndWarnDuplicateKeys(map, k13, v13);
        return new ImmutableMapParameter<>(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void putAndWarnDuplicateKeys(Map<K, V> map, K k9, V v9) {
        if (map.containsKey(k9)) {
            throw new IllegalArgumentException(DUPLICATED_KEY_MESSAGE);
        }
        map.put(k9, v9);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public V put(K k9, V v9) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.map.values();
    }
}
