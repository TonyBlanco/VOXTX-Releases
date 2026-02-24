package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bqj;
import com.google.ads.interactivemedia.v3.internal.bqn;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class bqj<MessageType extends bqn<MessageType, BuilderType>, BuilderType extends bqj<MessageType, BuilderType>> extends bom<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected bqn f22101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bqn f22102b;

    public bqj(MessageType messagetype) {
        this.f22102b = messagetype;
        if (messagetype.aO()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22101a = a();
    }

    private final bqn a() {
        return this.f22102b.aA();
    }

    private static void b(Object obj, Object obj2) {
        bsa.a().c(obj).g(obj, obj2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bom
    public final /* synthetic */ bom aR(bon bonVar) {
        be((bqn) bonVar);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bom, com.google.ads.interactivemedia.v3.internal.brr
    public final /* bridge */ /* synthetic */ void aT(bpg bpgVar, bqb bqbVar) throws IOException {
        if (!this.f22101a.aO()) {
            bc();
        }
        try {
            bsa.a().c(this.f22101a).h(this.f22101a, bpi.q(bpgVar), bqbVar);
        } catch (RuntimeException e9) {
            if (!(e9.getCause() instanceof IOException)) {
                throw e9;
            }
            throw ((IOException) e9.getCause());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bom
    /* JADX INFO: renamed from: aV, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bqj clone() {
        bqj bqjVar = (bqj) this.f22102b.aP(5);
        bqjVar.f22101a = aZ();
        return bqjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brr
    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final MessageType aY() {
        MessageType messagetype = (MessageType) aZ();
        if (messagetype.bd()) {
            return messagetype;
        }
        throw new bsw();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brr
    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public MessageType aZ() {
        if (!this.f22101a.aO()) {
            return (MessageType) this.f22101a;
        }
        this.f22101a.aJ();
        return (MessageType) this.f22101a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brt
    public final /* synthetic */ brs ba() {
        return this.f22102b;
    }

    public final void bb() {
        if (this.f22101a.aO()) {
            return;
        }
        bc();
    }

    public void bc() {
        bqn bqnVarA = a();
        b(bqnVarA, this.f22101a);
        this.f22101a = bqnVarA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brt
    public final boolean bd() {
        return bqn.aN(this.f22101a, false);
    }

    public final void be(bqn bqnVar) {
        if (this.f22102b.equals(bqnVar)) {
            return;
        }
        if (!this.f22101a.aO()) {
            bc();
        }
        b(this.f22101a, bqnVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bom
    /* JADX INFO: renamed from: bf, reason: merged with bridge method [inline-methods] */
    public final void aU(byte[] bArr, int i9, bqb bqbVar) throws bqw {
        if (!this.f22101a.aO()) {
            bc();
        }
        try {
            bsa.a().c(this.f22101a).i(this.f22101a, bArr, 0, i9, new boq(bqbVar));
        } catch (bqw e9) {
            throw e9;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw bqw.i();
        }
    }
}
