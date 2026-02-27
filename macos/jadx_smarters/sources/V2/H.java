package V2;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements CryptoConfig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9881d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f9882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9884c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = d4.k0.f39779c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = d4.k0.f39780d
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            V2.H.f9881d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.H.<clinit>():void");
    }

    public H(UUID uuid, byte[] bArr, boolean z9) {
        this.f9882a = uuid;
        this.f9883b = bArr;
        this.f9884c = z9;
    }
}
