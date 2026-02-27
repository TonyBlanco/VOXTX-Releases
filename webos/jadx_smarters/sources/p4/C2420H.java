package p4;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: p4.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2420H implements t4.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2422J f46401a;

    public C2420H(AbstractC2422J abstractC2422J) {
        this.f46401a = abstractC2422J;
    }

    @Override // t4.v
    public final void a(long j9) {
        try {
            AbstractC2422J abstractC2422J = this.f46401a;
            abstractC2422J.setResult(new C2421I(abstractC2422J, new Status(2103)));
        } catch (IllegalStateException e9) {
            C2434i.f46517m.d(e9, "Result already set when calling onRequestReplaced", new Object[0]);
        }
    }

    @Override // t4.v
    public final void b(long j9, int i9, Object obj) {
        if (true != (obj instanceof t4.r)) {
            obj = null;
        }
        try {
            this.f46401a.setResult(new C2423K(new Status(i9), obj != null ? ((t4.r) obj).f50732a : null, obj != null ? ((t4.r) obj).f50733b : null));
        } catch (IllegalStateException e9) {
            C2434i.f46517m.d(e9, "Result already set when calling onRequestCompleted", new Object[0]);
        }
    }
}
