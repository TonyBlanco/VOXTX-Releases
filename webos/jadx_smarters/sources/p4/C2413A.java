package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2413A extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2413A(C2434i c2434i, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46392e = c2434i;
        this.f46391d = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46392e.f46520c.N(d(), this.f46391d);
    }
}
