package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2445u extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f46558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2434i f46560g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2445u(C2434i c2434i, int i9, long j9, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46560g = c2434i;
        this.f46557d = i9;
        this.f46558e = j9;
        this.f46559f = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46560g.f46520c.i(d(), this.f46557d, this.f46558e, null, 0, null, null, this.f46559f);
    }
}
