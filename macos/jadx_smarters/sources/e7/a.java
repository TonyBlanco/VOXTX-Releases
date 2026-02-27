package E7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.G;
import s5.I;

/* JADX INFO: loaded from: classes4.dex */
public class a implements C7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f1707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f1708b = new HashMap();

    public a(Map map) {
        this.f1707a = G.h();
        this.f1707a = G.i(map.keySet());
        h();
    }

    @Override // C7.b
    public D7.b a(int i9, int i10) {
        return (D7.b) ((D7.a) this.f1707a.get(i9)).e().get(i10);
    }

    @Override // C7.b
    public boolean b() {
        return !this.f1707a.isEmpty();
    }

    @Override // C7.b
    public D7.a c(int i9) {
        return (D7.a) this.f1707a.get(i9);
    }

    @Override // C7.b
    public List d(int i9) {
        if (i9 >= this.f1707a.size() || this.f1707a.get(i9) == null) {
            return null;
        }
        return ((D7.a) this.f1707a.get(i9)).e();
    }

    @Override // C7.b
    public D7.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        D7.a aVar = (D7.a) this.f1708b.get(str4);
        return aVar != null ? aVar : g(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // C7.b
    public int f() {
        return this.f1707a.size();
    }

    public D7.a g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int size = this.f1707a.size();
        D7.a aVar = new D7.a(str2, str, size, str3, str4, str5, str6, str7, str6);
        if (size > 0) {
            D7.a aVar2 = (D7.a) this.f1707a.get(size - 1);
            aVar2.n(aVar);
            aVar.o(aVar2);
        }
        this.f1707a.add(aVar);
        this.f1708b.put(aVar.i(), aVar);
        return aVar;
    }

    public final void h() {
        this.f1708b = I.h();
        for (int i9 = 0; i9 < this.f1707a.size(); i9++) {
            D7.a aVar = (D7.a) this.f1707a.get(i9);
            this.f1708b.put(aVar.i(), aVar);
        }
    }
}
