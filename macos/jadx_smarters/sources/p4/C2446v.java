package p4;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import n4.C2284p;
import org.json.JSONObject;

/* JADX INFO: renamed from: p4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2446v extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ JSONObject f46563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2434i f46564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446v(C2434i c2434i, int i9, int i10, JSONObject jSONObject) {
        super(c2434i, false);
        this.f46564g = c2434i;
        this.f46561d = i9;
        this.f46562e = i10;
        this.f46563f = jSONObject;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        C2284p c2284pX;
        C2434i c2434i = this.f46564g;
        int i9 = this.f46561d;
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        int iA = c2434i.k().a(i9);
        int iK = 0;
        if (iA == -1) {
            n4.r rVar = (n4.r) com.google.android.gms.common.internal.r.m(c2434i.l());
            iA = 0;
            while (true) {
                if (iA >= rVar.Z()) {
                    iA = -1;
                    break;
                } else if (((C2284p) com.google.android.gms.common.internal.r.m(rVar.X(iA))).K() == i9) {
                    break;
                } else {
                    iA++;
                }
            }
        }
        int i10 = this.f46562e;
        if (i10 < 0) {
            setResult(new C2421I(this, new Status(AdError.INTERNAL_ERROR_CODE, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.f46562e)))));
            return;
        }
        if (iA == i10) {
            setResult(new C2421I(this, new Status(0)));
            return;
        }
        if (i10 > iA) {
            i10++;
        }
        C2434i c2434i2 = this.f46564g;
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        int iB = c2434i2.k().b(i10);
        if (iB != 0) {
            iK = iB;
        } else {
            n4.r rVarL = c2434i2.l();
            if (rVarL != null && (c2284pX = rVarL.X(i10)) != null) {
                iK = c2284pX.K();
            }
        }
        this.f46564g.f46520c.S(d(), new int[]{this.f46561d}, iK, this.f46563f);
    }
}
