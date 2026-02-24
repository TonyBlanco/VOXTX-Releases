package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class qb implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa f24167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f24170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1322o f24171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f24174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f24175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24176m;

    public /* synthetic */ qb(String str, qa qaVar, long j9, int i9, long j10, C1322o c1322o, String str2, String str3, long j11, long j12, boolean z9) {
        this.f24166c = str;
        this.f24167d = qaVar;
        this.f24168e = j9;
        this.f24169f = i9;
        this.f24170g = j10;
        this.f24171h = c1322o;
        this.f24172i = str2;
        this.f24173j = str3;
        this.f24174k = j11;
        this.f24175l = j12;
        this.f24176m = z9;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l9 = (Long) obj;
        if (this.f24170g > l9.longValue()) {
            return 1;
        }
        return this.f24170g >= l9.longValue() ? 0 : -1;
    }
}
