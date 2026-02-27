package o4;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2348z f45865a;

    @Override // o4.T
    public final F4.a zzb(String str) {
        AbstractC2345w abstractC2345wCreateSession = this.f45865a.createSession(str);
        if (abstractC2345wCreateSession == null) {
            return null;
        }
        return abstractC2345wCreateSession.o();
    }

    @Override // o4.T
    public final String zzc() {
        return this.f45865a.getCategory();
    }

    @Override // o4.T
    public final boolean zzd() {
        return this.f45865a.isSessionRecoverable();
    }
}
