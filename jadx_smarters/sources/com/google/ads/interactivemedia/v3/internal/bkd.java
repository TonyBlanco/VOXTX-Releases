package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class bkd extends bjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21597a;

    public bkd(Boolean bool) {
        this.f21597a = bool;
    }

    public bkd(Number number) {
        this.f21597a = number;
    }

    public bkd(String str) {
        str.getClass();
        this.f21597a = str;
    }

    private static boolean g(bkd bkdVar) {
        Object obj = bkdVar.f21597a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Object obj = this.f21597a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new blb((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String b() {
        Object obj = this.f21597a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (e()) {
            return a().toString();
        }
        if (d()) {
            return ((Boolean) this.f21597a).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(this.f21597a.getClass())));
    }

    public final boolean c() {
        return d() ? ((Boolean) this.f21597a).booleanValue() : Boolean.parseBoolean(b());
    }

    public final boolean d() {
        return this.f21597a instanceof Boolean;
    }

    public final boolean e() {
        return this.f21597a instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bkd.class != obj.getClass()) {
            return false;
        }
        bkd bkdVar = (bkd) obj;
        if (this.f21597a == null) {
            return bkdVar.f21597a == null;
        }
        if (g(this) && g(bkdVar)) {
            return a().longValue() == bkdVar.a().longValue();
        }
        Object obj2 = this.f21597a;
        if (!(obj2 instanceof Number) || !(bkdVar.f21597a instanceof Number)) {
            return obj2.equals(bkdVar.f21597a);
        }
        double dDoubleValue = a().doubleValue();
        double dDoubleValue2 = bkdVar.a().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final boolean f() {
        return this.f21597a instanceof String;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f21597a == null) {
            return 31;
        }
        if (g(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            Object obj = this.f21597a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }
}
