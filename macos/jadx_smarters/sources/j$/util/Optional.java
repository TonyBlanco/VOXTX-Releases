package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Optional f42221b = new Optional();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42222a;

    private Optional() {
        this.f42222a = null;
    }

    private Optional(Object obj) {
        this.f42222a = Objects.requireNonNull(obj);
    }

    public static Optional a() {
        return f42221b;
    }

    public static Optional d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t9) {
        return t9 == null ? f42221b : new Optional<>(t9);
    }

    public final Object b() {
        Object obj = this.f42222a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f42222a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f42222a, ((Optional) obj).f42222a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42222a);
    }

    public final String toString() {
        Object obj = this.f42222a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
