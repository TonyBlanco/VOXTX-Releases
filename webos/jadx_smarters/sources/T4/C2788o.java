package t4;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: t4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2788o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f50730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2791s f50731b;

    public C2788o(C2791s c2791s, v vVar) {
        this.f50731b = c2791s;
        this.f50730a = vVar;
    }

    @Override // t4.v
    public final void a(long j9) {
        v vVar = this.f50730a;
        if (vVar != null) {
            vVar.a(j9);
        }
    }

    @Override // t4.v
    public final void b(long j9, int i9, Object obj) {
        if (this.f50730a != null) {
            if (i9 == 2001) {
                C2791s c2791s = this.f50731b;
                c2791s.f50654a.f("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(c2791s.f50741i));
                this.f50731b.f50740h.zzl();
                i9 = AdError.INTERNAL_ERROR_CODE;
            }
            this.f50730a.b(j9, i9, obj);
        }
    }
}
