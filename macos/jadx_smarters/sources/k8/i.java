package k8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43664a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43665c;

    public i(Object obj, Object obj2) {
        this.f43664a = obj;
        this.f43665c = obj2;
    }

    public final Object a() {
        return this.f43664a;
    }

    public final Object b() {
        return this.f43665c;
    }

    public final Object c() {
        return this.f43664a;
    }

    public final Object d() {
        return this.f43665c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f43664a, iVar.f43664a) && kotlin.jvm.internal.l.a(this.f43665c, iVar.f43665c);
    }

    public int hashCode() {
        Object obj = this.f43664a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f43665c;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f43664a + ", " + this.f43665c + ')';
    }
}
