package p4;

import org.json.JSONObject;

/* JADX INFO: renamed from: p4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2442q extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f46547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2434i f46549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2442q(C2434i c2434i, int[] iArr, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46549f = c2434i;
        this.f46547d = iArr;
        this.f46548e = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46549f.f46520c.R(d(), this.f46547d, this.f46548e);
    }
}
