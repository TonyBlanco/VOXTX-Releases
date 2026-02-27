package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bsc implements brp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final brs f22203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f22205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22206d;

    public bsc(brs brsVar, String str, Object[] objArr) {
        this.f22203a = brsVar;
        this.f22204b = str;
        this.f22205c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22206d = cCharAt;
            return;
        }
        int i9 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f22206d = i9 | (cCharAt2 << i10);
                return;
            } else {
                i9 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brp
    public final brs a() {
        return this.f22203a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brp
    public final boolean b() {
        return (this.f22206d & 2) == 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brp
    public final int c() {
        return (this.f22206d & 1) == 1 ? 1 : 2;
    }

    public final String d() {
        return this.f22204b;
    }

    public final Object[] e() {
        return this.f22205c;
    }
}
