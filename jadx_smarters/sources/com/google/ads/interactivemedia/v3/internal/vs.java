package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class vs implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24899b;

    public vs(C1333s c1333s, int i9) {
        this.f24898a = 1 == (c1333s.f24459d & 1);
        this.f24899b = wd.j(i9, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vs vsVar) {
        return aut.j().d(this.f24899b, vsVar.f24899b).d(this.f24898a, vsVar.f24898a).a();
    }
}
