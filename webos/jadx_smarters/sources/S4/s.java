package s4;

import o4.AbstractC2345w;
import o4.InterfaceC2347y;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC2347y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2709a f49963a;

    public /* synthetic */ s(AbstractActivityC2709a abstractActivityC2709a, r rVar) {
        this.f49963a = abstractActivityC2709a;
    }

    @Override // o4.InterfaceC2347y
    public final /* synthetic */ void onSessionEnded(AbstractC2345w abstractC2345w, int i9) {
        this.f49963a.finish();
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionEnding(AbstractC2345w abstractC2345w) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(AbstractC2345w abstractC2345w, int i9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumed(AbstractC2345w abstractC2345w, boolean z9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResuming(AbstractC2345w abstractC2345w, String str) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(AbstractC2345w abstractC2345w, int i9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarted(AbstractC2345w abstractC2345w, String str) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarting(AbstractC2345w abstractC2345w) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionSuspended(AbstractC2345w abstractC2345w, int i9) {
    }
}
