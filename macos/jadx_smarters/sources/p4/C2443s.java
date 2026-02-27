package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2443s extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443s(C2434i c2434i, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46553e = c2434i;
        this.f46552d = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46553e.f46520c.i(d(), 0, -1L, null, 1, null, null, this.f46552d);
    }
}
