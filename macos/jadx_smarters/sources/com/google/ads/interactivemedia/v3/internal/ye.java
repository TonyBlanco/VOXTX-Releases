package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25163c;

    public /* synthetic */ ye(yh yhVar, bl blVar, int i9) {
        this.f25163c = i9;
        this.f25161a = yhVar;
        this.f25162b = blVar;
    }

    public /* synthetic */ ye(yh yhVar, ep epVar, int i9) {
        this.f25163c = i9;
        this.f25161a = yhVar;
        this.f25162b = epVar;
    }

    public /* synthetic */ ye(yh yhVar, Exception exc, int i9) {
        this.f25163c = i9;
        this.f25162b = yhVar;
        this.f25161a = exc;
    }

    public /* synthetic */ ye(yh yhVar, String str, int i9) {
        this.f25163c = i9;
        this.f25162b = yhVar;
        this.f25161a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.f25163c;
        if (i9 == 0) {
            ((yh) this.f25161a).k((ep) this.f25162b);
            return;
        }
        if (i9 == 1) {
            ((yh) this.f25162b).o((Exception) this.f25161a);
        } else if (i9 == 2) {
            ((yh) this.f25161a).i((ep) this.f25162b);
        } else if (i9 != 3) {
            ((yh) this.f25162b).h((String) this.f25161a);
        } else {
            ((yh) this.f25161a).p((bl) this.f25162b);
        }
    }
}
