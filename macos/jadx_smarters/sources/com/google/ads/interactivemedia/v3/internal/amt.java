package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class amt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f20270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20271b;

    public amt(ams amsVar, int i9) {
        this.f20271b = i9;
        this.f20270a = amsVar;
    }

    public amt(amu amuVar, int i9) {
        this.f20271b = i9;
        this.f20270a = amuVar;
    }

    public amt(anw anwVar, int i9) {
        this.f20271b = i9;
        this.f20270a = anwVar;
    }

    public amt(aod aodVar, int i9) {
        this.f20271b = i9;
        this.f20270a = aodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        int i9 = this.f20271b;
        boolean z9 = false;
        if (i9 == 0) {
            if (((amu) this.f20270a).f20275b != null) {
                return;
            }
            synchronized (amu.f20273c) {
                if (((amu) this.f20270a).f20275b != null) {
                    return;
                }
                try {
                    zBooleanValue = ((Boolean) aqo.f20534i.b()).booleanValue();
                } catch (IllegalStateException unused) {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    try {
                        amu.f20272a = ata.c(((amu) this.f20270a).f20276e.f20361a, "ADSHIELD");
                        z9 = zBooleanValue;
                    } catch (Throwable unused2) {
                    }
                } else {
                    z9 = zBooleanValue;
                }
                ((amu) this.f20270a).f20275b = Boolean.valueOf(z9);
                amu.f20273c.open();
                return;
            }
        }
        if (i9 != 1) {
            if (i9 == 2) {
                ((anw) this.f20270a).w();
                return;
            } else if (i9 != 3) {
                ((aod) this.f20270a).f();
                return;
            } else {
                aqo.a(((anw) this.f20270a).f20361a);
                return;
            }
        }
        synchronized (((ams) this.f20270a).f20266n) {
            if (((ams) this.f20270a).f20267o) {
                return;
            }
            ((ams) this.f20270a).f20267o = true;
            try {
                ams.j((ams) this.f20270a);
            } catch (Exception e9) {
                ((ams) this.f20270a).f20260h.c(2023, -1L, e9);
            }
            synchronized (((ams) this.f20270a).f20266n) {
                ((ams) this.f20270a).f20267o = false;
            }
        }
    }
}
