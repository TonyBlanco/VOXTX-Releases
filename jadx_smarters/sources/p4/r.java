package p4;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C2434i c2434i, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46551e = c2434i;
        this.f46550d = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46551e.f46520c.i(d(), 0, -1L, null, -1, null, null, this.f46550d);
    }
}
