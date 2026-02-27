package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2450z extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2450z(C2434i c2434i, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46571e = c2434i;
        this.f46570d = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46571e.f46520c.M(d(), this.f46570d);
    }
}
