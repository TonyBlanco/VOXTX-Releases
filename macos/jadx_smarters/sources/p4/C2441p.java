package p4;

import n4.C2284p;
import org.json.JSONObject;

/* JADX INFO: renamed from: p4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2441p extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2284p[] f46541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f46544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2434i f46546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441p(C2434i c2434i, C2284p[] c2284pArr, int i9, int i10, long j9, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46546i = c2434i;
        this.f46541d = c2284pArr;
        this.f46542e = i9;
        this.f46543f = i10;
        this.f46544g = j9;
        this.f46545h = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46546i.f46520c.Q(d(), this.f46541d, this.f46542e, this.f46543f, this.f46544g, this.f46545h);
    }
}
