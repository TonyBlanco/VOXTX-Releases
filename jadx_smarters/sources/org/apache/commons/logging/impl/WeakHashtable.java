package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    public static final class Entry implements Map.Entry {
        private final Object key;
        private final Object value;

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!getKey().equals(entry.getKey())) {
                return false;
            }
            if (getValue() == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }
    }

    public static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this);
            this.hashCode = obj.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getValue() {
            return this.reference.get();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Referenced)) {
                return false;
            }
            Referenced referenced = (Referenced) obj;
            Object value = getValue();
            Object value2 = referenced.getValue();
            return value == null ? value2 == null && hashCode() == referenced.hashCode() : value.equals(value2);
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    public static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced) {
            super(obj, referenceQueue);
            this.referenced = referenced;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Referenced getReferenced() {
            return this.referenced;
        }
    }

    private void purge() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.queue) {
            while (true) {
                try {
                    WeakKey weakKey = (WeakKey) this.queue.poll();
                    if (weakKey == null) {
                        break;
                    } else {
                        arrayList.add(weakKey.getReferenced());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            super.remove(arrayList.get(i9));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            try {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey != null) {
                    super.remove(weakKey.getReferenced());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        purge();
        Set<Map.Entry> setEntrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : setEntrySet) {
            Object value = ((Referenced) entry.getKey()).getValue();
            Object value2 = entry.getValue();
            if (value != null) {
                hashSet.add(new Entry(value, value2));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new Referenced(obj));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        purge();
        Set setKeySet = super.keySet();
        HashSet hashSet = new HashSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            Object value = ((Referenced) it.next()).getValue();
            if (value != null) {
                hashSet.add(value);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        purge();
        final Enumeration enumerationKeys = super.keys();
        return new Enumeration() { // from class: org.apache.commons.logging.impl.WeakHashtable.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return enumerationKeys.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return ((Referenced) enumerationKeys.nextElement()).getValue();
            }
        };
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        try {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed");
            }
            if (obj2 == null) {
                throw new NullPointerException("Null values are not allowed");
            }
            int i9 = this.changeCount;
            int i10 = i9 + 1;
            this.changeCount = i10;
            if (i9 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i10 % 10 == 0) {
                purgeOne();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.put(new Referenced(obj, this.queue), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    public void rehash() {
        purge();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        try {
            int i9 = this.changeCount;
            int i10 = i9 + 1;
            this.changeCount = i10;
            if (i9 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i10 % 10 == 0) {
                purgeOne();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.remove(new Referenced(obj));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        purge();
        return super.values();
    }
}
