package o4;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2347y f45814a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f45815c;

    public Z(InterfaceC2347y interfaceC2347y, Class cls) {
        this.f45814a = interfaceC2347y;
        this.f45815c = cls;
    }

    @Override // o4.Q
    public final void B(F4.a aVar, int i9) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionResumeFailed((AbstractC2345w) this.f45815c.cast(abstractC2345w), i9);
    }

    @Override // o4.Q
    public final void S(F4.a aVar, int i9) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionStartFailed((AbstractC2345w) this.f45815c.cast(abstractC2345w), i9);
    }

    @Override // o4.Q
    public final void U0(F4.a aVar, String str) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionResuming((AbstractC2345w) this.f45815c.cast(abstractC2345w), str);
    }

    @Override // o4.Q
    public final void V0(F4.a aVar) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionEnding((AbstractC2345w) this.f45815c.cast(abstractC2345w));
    }

    @Override // o4.Q
    public final void X(F4.a aVar, boolean z9) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionResumed((AbstractC2345w) this.f45815c.cast(abstractC2345w), z9);
    }

    @Override // o4.Q
    public final void f0(F4.a aVar) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionStarting((AbstractC2345w) this.f45815c.cast(abstractC2345w));
    }

    @Override // o4.Q
    public final void h(F4.a aVar, String str) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionStarted((AbstractC2345w) this.f45815c.cast(abstractC2345w), str);
    }

    @Override // o4.Q
    public final void q(F4.a aVar, int i9) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionEnded((AbstractC2345w) this.f45815c.cast(abstractC2345w), i9);
    }

    @Override // o4.Q
    public final void w0(F4.a aVar, int i9) {
        InterfaceC2347y interfaceC2347y;
        AbstractC2345w abstractC2345w = (AbstractC2345w) F4.b.E(aVar);
        if (!this.f45815c.isInstance(abstractC2345w) || (interfaceC2347y = this.f45814a) == null) {
            return;
        }
        interfaceC2347y.onSessionSuspended((AbstractC2345w) this.f45815c.cast(abstractC2345w), i9);
    }

    @Override // o4.Q
    public final F4.a zzb() {
        return F4.b.Z(this.f45814a);
    }
}
