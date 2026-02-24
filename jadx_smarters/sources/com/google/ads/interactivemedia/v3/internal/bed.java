package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bed extends azh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bid f21134b;

    public /* synthetic */ bed(String str, bid bidVar) {
        this.f21133a = str;
        this.f21134b = bidVar;
    }

    public final String toString() {
        String str = this.f21133a;
        bid bidVar = this.f21134b;
        bhq bhqVar = bhq.UNKNOWN_KEYMATERIAL;
        bid bidVar2 = bid.UNKNOWN_PREFIX;
        int iOrdinal = bidVar.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
