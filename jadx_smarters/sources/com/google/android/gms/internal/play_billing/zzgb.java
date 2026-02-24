package com.google.android.gms.internal.play_billing;

import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
final class zzgb implements zzcw {
    static final zzcw zza = new zzgb();

    private zzgb() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i9) {
        switch (i9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return true;
            default:
                switch (i9) {
                    case 22:
                    case 23:
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
