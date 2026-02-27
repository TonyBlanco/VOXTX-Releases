package G5;

import H5.InterfaceC0627s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements InterfaceC0627s, H5.T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2239a;

    public j0(FirebaseAuth firebaseAuth) {
        this.f2239a = firebaseAuth;
    }

    @Override // H5.T
    public final void a(zzafn zzafnVar, AbstractC0553u abstractC0553u) {
        this.f2239a.s(abstractC0553u, zzafnVar, true, true);
    }

    @Override // H5.InterfaceC0627s
    public final void zza(Status status) {
        int I9 = status.I();
        if (I9 == 17011 || I9 == 17021 || I9 == 17005) {
            this.f2239a.k();
        }
    }
}
