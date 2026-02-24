package com.amplifyframework.datastore;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.Model;
import j$.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreItemChange<T extends Model> {
    private final Initiator initiator;
    private final T item;
    private final Class<T> itemClass;
    private final Type type;
    private final UUID uuid;

    public static final class Builder<T extends Model> {
        private Initiator initiator;
        private T item;
        private Class<T> itemClass;
        private Type type;
        private UUID uuid;

        @SuppressLint({"SyntheticAccessor"})
        public DataStoreItemChange<T> build() {
            UUID uuidRandomUUID = this.uuid;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
            }
            UUID uuid = uuidRandomUUID;
            randomUuid();
            Objects.requireNonNull(uuid);
            Type type = this.type;
            Objects.requireNonNull(type);
            T t9 = this.item;
            Objects.requireNonNull(t9);
            Class<T> cls = this.itemClass;
            Objects.requireNonNull(cls);
            Initiator initiator = this.initiator;
            Objects.requireNonNull(initiator);
            return new DataStoreItemChange<>(uuid, type, t9, cls, initiator);
        }

        public Builder<T> initiator(Initiator initiator) {
            Objects.requireNonNull(initiator);
            this.initiator = initiator;
            return this;
        }

        public Builder<T> item(T t9) {
            Objects.requireNonNull(t9);
            this.item = t9;
            return this;
        }

        public Builder<T> itemClass(Class<T> cls) {
            Objects.requireNonNull(cls);
            this.itemClass = cls;
            return this;
        }

        public Builder<T> randomUuid() {
            this.uuid = null;
            return this;
        }

        public Builder<T> type(Type type) {
            Objects.requireNonNull(type);
            this.type = type;
            return this;
        }

        public Builder<T> uuid(String str) {
            Objects.requireNonNull(str);
            this.uuid = UUID.fromString(str);
            return this;
        }
    }

    public enum Initiator {
        LOCAL,
        REMOTE
    }

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    private DataStoreItemChange(UUID uuid, Type type, T t9, Class<T> cls, Initiator initiator) {
        this.uuid = uuid;
        this.type = type;
        this.item = t9;
        this.itemClass = cls;
        this.initiator = initiator;
    }

    public static <T extends Model> Builder<T> builder() {
        return new Builder<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DataStoreItemChange.class != obj.getClass()) {
            return false;
        }
        DataStoreItemChange dataStoreItemChange = (DataStoreItemChange) obj;
        return this.uuid.equals(dataStoreItemChange.uuid) && this.type == dataStoreItemChange.type && this.item.equals(dataStoreItemChange.item) && this.itemClass.equals(dataStoreItemChange.itemClass) && this.initiator == dataStoreItemChange.initiator;
    }

    public int hashCode() {
        return (((((((this.uuid.hashCode() * 31) + this.type.hashCode()) * 31) + this.item.hashCode()) * 31) + this.itemClass.hashCode()) * 31) + this.initiator.hashCode();
    }

    public Initiator initiator() {
        return this.initiator;
    }

    public T item() {
        return this.item;
    }

    public Class<T> itemClass() {
        return this.itemClass;
    }

    public String toString() {
        return "DataStoreItemChange{uuid=" + this.uuid + ", type=" + this.type + ", item=" + this.item + ", itemClass=" + this.itemClass + ", initiator=" + this.initiator + '}';
    }

    public Type type() {
        return this.type;
    }

    public UUID uuid() {
        return this.uuid;
    }
}
