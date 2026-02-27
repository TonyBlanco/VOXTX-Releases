package s6;

import I5.C0637c;
import I5.InterfaceC0639e;
import I5.r;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.message.TokenParser;

/* JADX INFO: renamed from: s6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2747c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f50168b;

    public C2747c(Set set, d dVar) {
        this.f50167a = e(set);
        this.f50168b = dVar;
    }

    public static C0637c c() {
        return C0637c.e(i.class).b(r.n(f.class)).f(new I5.h() { // from class: s6.b
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return C2747c.d(interfaceC0639e);
            }
        }).d();
    }

    public static /* synthetic */ i d(InterfaceC0639e interfaceC0639e) {
        return new C2747c(interfaceC0639e.c(f.class), d.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(TokenParser.SP);
            }
        }
        return sb.toString();
    }

    @Override // s6.i
    public String a() {
        if (this.f50168b.b().isEmpty()) {
            return this.f50167a;
        }
        return this.f50167a + TokenParser.SP + e(this.f50168b.b());
    }
}
