package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements InterfaceC2157d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43693a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43694c;

    public s(Class jClass, String moduleName) {
        l.e(jClass, "jClass");
        l.e(moduleName, "moduleName");
        this.f43693a = jClass;
        this.f43694c = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC2157d
    public Class a() {
        return this.f43693a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && l.a(a(), ((s) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
