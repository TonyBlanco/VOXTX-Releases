package D5;

import C5.a;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.b f1449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L4.a f1450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1451d;

    public d(L4.a aVar, a.b bVar) {
        this.f1449b = bVar;
        this.f1450c = aVar;
        c cVar = new c(this);
        this.f1451d = cVar;
        aVar.b(cVar);
        this.f1448a = new HashSet();
    }
}
