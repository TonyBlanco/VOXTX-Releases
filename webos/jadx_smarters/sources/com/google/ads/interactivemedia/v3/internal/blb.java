package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class blb extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21642a;

    public blb(String str) {
        this.f21642a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f21642a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f21642a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb)) {
            return false;
        }
        String str = this.f21642a;
        String str2 = ((blb) obj).f21642a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f21642a);
    }

    public final int hashCode() {
        return this.f21642a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f21642a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f21642a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f21642a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f21642a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f21642a).longValue();
        }
    }

    public final String toString() {
        return this.f21642a;
    }
}
