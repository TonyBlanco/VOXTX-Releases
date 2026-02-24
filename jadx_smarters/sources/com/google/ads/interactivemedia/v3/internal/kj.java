package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class kj implements jz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f23502b = 250000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f23503c = 750000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f23504d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f23505e = 250000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f23506f = 50000000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23507g = 2;

    public kj(ki kiVar) {
    }

    public static int a(int i9, int i10, int i11) {
        return axy.a(((((long) i9) * ((long) i10)) * ((long) i11)) / 1000000);
    }

    public static int b(int i9) {
        switch (i9) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 3062500;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return 8000;
            case 16:
                return 256000;
            case LangUtils.HASH_SEED /* 17 */:
                return 336000;
        }
    }
}
