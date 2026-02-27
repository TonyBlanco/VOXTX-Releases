package com.amplifyframework.hub;

import j$.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class HubEvent<T> {
    private final T data;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    public interface Data<T> {
        HubEvent<T> toHubEvent();
    }

    private HubEvent(String str, T t9) {
        this.name = str;
        this.data = t9;
    }

    public static <E extends Enum<E>> HubEvent<?> create(E e9) {
        Objects.requireNonNull(e9);
        return new HubEvent<>(e9.toString(), null);
    }

    public static <T, E extends Enum<E>> HubEvent<T> create(E e9, T t9) {
        Objects.requireNonNull(e9);
        Objects.requireNonNull(t9);
        return new HubEvent<>(e9.toString(), t9);
    }

    public static HubEvent<?> create(String str) {
        return new HubEvent<>(str, null);
    }

    public static <T> HubEvent<T> create(String str, T t9) {
        return new HubEvent<>(str, t9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HubEvent.class != obj.getClass()) {
            return false;
        }
        HubEvent hubEvent = (HubEvent) obj;
        if (O.c.a(this.name, hubEvent.name) && O.c.a(this.data, hubEvent.data)) {
            return O.c.a(this.uuid, hubEvent.uuid);
        }
        return false;
    }

    public T getData() {
        return this.data;
    }

    public UUID getId() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t9 = this.data;
        int iHashCode2 = (iHashCode + (t9 != null ? t9.hashCode() : 0)) * 31;
        UUID uuid = this.uuid;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "HubEvent{name='" + this.name + "', data=" + this.data + ", uuid=" + this.uuid + '}';
    }
}
