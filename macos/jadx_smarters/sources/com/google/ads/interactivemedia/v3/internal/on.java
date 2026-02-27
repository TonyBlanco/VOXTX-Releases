package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class on implements oz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zy f23929b = new zy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final zh f23930a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1333s f23931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final co f23932d;

    public on(zh zhVar, C1333s c1333s, co coVar) {
        this.f23930a = zhVar;
        this.f23931c = c1333s;
        this.f23932d = coVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oz
    public final oz a() {
        zh abyVar;
        af.w(!b());
        zh zhVar = this.f23930a;
        if (zhVar instanceof pp) {
            abyVar = new pp(this.f23931c.f24458c, this.f23932d);
        } else if (zhVar instanceof adm) {
            abyVar = new adm();
        } else if (zhVar instanceof adh) {
            abyVar = new adh();
        } else if (zhVar instanceof adk) {
            abyVar = new adk();
        } else {
            if (!(zhVar instanceof aby)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(zhVar.getClass().getSimpleName()));
            }
            abyVar = new aby();
        }
        return new on(abyVar, this.f23931c, this.f23932d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oz
    public final boolean b() {
        zh zhVar = this.f23930a;
        return (zhVar instanceof aep) || (zhVar instanceof acs);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oz
    public final boolean c(zi ziVar) throws IOException {
        return this.f23930a.a(ziVar, f23929b) == 0;
    }
}
