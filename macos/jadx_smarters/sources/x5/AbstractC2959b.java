package x5;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import r5.m;

/* JADX INFO: renamed from: x5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2959b extends AbstractC2958a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f51956a;

    public AbstractC2959b() {
        Type typeA = a();
        this.f51956a = typeA;
        m.r(!(typeA instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeA);
    }

    public final Type b() {
        return this.f51956a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2959b) {
            return this.f51956a.equals(((AbstractC2959b) obj).f51956a);
        }
        return false;
    }

    public int hashCode() {
        return this.f51956a.hashCode();
    }

    public String toString() {
        return c.a(this.f51956a);
    }
}
