package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aal implements an {
    public static final Parcelable.Creator<aal> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1333s f18662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1333s f18663g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18668e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18669h;

    static {
        r rVar = new r();
        rVar.ae("application/id3");
        f18662f = rVar.v();
        r rVar2 = new r();
        rVar2.ae("application/x-scte35");
        f18663g = rVar2.v();
        CREATOR = new aak();
    }

    public aal(Parcel parcel) {
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18664a = string;
        this.f18665b = parcel.readString();
        this.f18666c = parcel.readLong();
        this.f18667d = parcel.readLong();
        this.f18668e = (byte[]) cq.G(parcel.createByteArray());
    }

    public aal(String str, String str2, long j9, long j10, byte[] bArr) {
        this.f18664a = str;
        this.f18665b = str2;
        this.f18666c = j9;
        this.f18667d = j10;
        this.f18668e = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.C1333s b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f18664a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2c
            r2 = -795945609(0xffffffffd08ed577, float:-1.9170834E10)
            if (r1 == r2) goto L22
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L18
            goto L36
        L18:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L22:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 0
            goto L37
        L2c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 2
            goto L37
        L36:
            r0 = -1
        L37:
            if (r0 == 0) goto L42
            if (r0 == r4) goto L42
            if (r0 == r3) goto L3f
            r0 = 0
            return r0
        L3f:
            com.google.ads.interactivemedia.v3.internal.s r0 = com.google.ads.interactivemedia.v3.internal.aal.f18663g
            return r0
        L42:
            com.google.ads.interactivemedia.v3.internal.s r0 = com.google.ads.interactivemedia.v3.internal.aal.f18662f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aal.b():com.google.ads.interactivemedia.v3.internal.s");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aal.class == obj.getClass()) {
            aal aalVar = (aal) obj;
            if (this.f18666c == aalVar.f18666c && this.f18667d == aalVar.f18667d && cq.V(this.f18664a, aalVar.f18664a) && cq.V(this.f18665b, aalVar.f18665b) && Arrays.equals(this.f18668e, aalVar.f18668e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f18669h;
        if (i9 != 0) {
            return i9;
        }
        String str = this.f18664a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18665b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j9 = this.f18666c;
        long j10 = this.f18667d;
        int iHashCode3 = ((((((iHashCode + iHashCode2) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + Arrays.hashCode(this.f18668e);
        this.f18669h = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f18664a + ", id=" + this.f18667d + ", durationMs=" + this.f18666c + ", value=" + this.f18665b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18664a);
        parcel.writeString(this.f18665b);
        parcel.writeLong(this.f18666c);
        parcel.writeLong(this.f18667d);
        parcel.writeByteArray(this.f18668e);
    }
}
