package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class D {
    public C8.e a(i iVar) {
        return iVar;
    }

    public C8.c b(Class cls) {
        return new C2158e(cls);
    }

    public C8.d c(Class cls, String str) {
        return new s(cls, str);
    }

    public C8.g d(n nVar) {
        return nVar;
    }

    public C8.h e(p pVar) {
        return pVar;
    }

    public C8.j f(t tVar) {
        return tVar;
    }

    public C8.l g(v vVar) {
        return vVar;
    }

    public String h(h hVar) {
        String string = hVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(m mVar) {
        return h(mVar);
    }
}
