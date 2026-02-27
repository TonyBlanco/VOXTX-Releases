package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2444t extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2434i f46556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444t(C2434i c2434i, int i9, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46556f = c2434i;
        this.f46554d = i9;
        this.f46555e = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46556f.f46520c.R(d(), new int[]{this.f46554d}, this.f46555e);
    }
}
