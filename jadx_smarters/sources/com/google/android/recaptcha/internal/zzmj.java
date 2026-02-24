package com.google.android.recaptcha.internal;

import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmj extends zzgo implements zzhz {
    private static final zzmj zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzlx zzh;
    private int zzi;
    private zzlu zzj;

    static {
        zzmj zzmjVar = new zzmj();
        zzb = zzmjVar;
        zzgo.zzC(zzmj.class, zzmjVar);
    }

    private zzmj() {
    }

    public static /* synthetic */ void zzG(zzmj zzmjVar, int i9) {
        if (i9 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzmjVar.zzd = i9 - 2;
    }

    public static /* synthetic */ void zzH(zzmj zzmjVar, int i9) {
        if (i9 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzmjVar.zzf = i9 - 2;
    }

    public static zzmi zzf() {
        return (zzmi) zzb.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005\t\u0006\u000b\u0007\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new zzmj();
        }
        zzlv zzlvVar = null;
        if (i10 == 4) {
            return new zzmi(zzlvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzj() {
        int i9;
        switch (this.zzf) {
            case 0:
                i9 = 2;
                break;
            case 1:
                i9 = 3;
                break;
            case 2:
                i9 = 4;
                break;
            case 3:
                i9 = 5;
                break;
            case 4:
                i9 = 6;
                break;
            case 5:
                i9 = 7;
                break;
            case 6:
                i9 = 8;
                break;
            case 7:
                i9 = 9;
                break;
            case 8:
                i9 = 10;
                break;
            case 9:
                i9 = 11;
                break;
            case 10:
                i9 = 12;
                break;
            case 11:
                i9 = 13;
                break;
            case 12:
                i9 = 14;
                break;
            case 13:
                i9 = 15;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i9 = 16;
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                i9 = 17;
                break;
            case 16:
                i9 = 18;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                i9 = 19;
                break;
            case 18:
                i9 = 20;
                break;
            case 19:
                i9 = 21;
                break;
            case 20:
                i9 = 22;
                break;
            case 21:
                i9 = 23;
                break;
            case 22:
                i9 = 24;
                break;
            case 23:
                i9 = 25;
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                i9 = 26;
                break;
            case 25:
                i9 = 27;
                break;
            case 26:
                i9 = 28;
                break;
            case 27:
                i9 = 29;
                break;
            case 28:
                i9 = 30;
                break;
            case 29:
                i9 = 31;
                break;
            case 30:
                i9 = 32;
                break;
            case 31:
                i9 = 33;
                break;
            case 32:
                i9 = 34;
                break;
            case 33:
                i9 = 35;
                break;
            case 34:
                i9 = 36;
                break;
            case 35:
                i9 = 37;
                break;
            case 36:
                i9 = 38;
                break;
            case LangUtils.HASH_OFFSET /* 37 */:
                i9 = 39;
                break;
            case 38:
                i9 = 40;
                break;
            case 39:
                i9 = 41;
                break;
            case 40:
                i9 = 42;
                break;
            case 41:
                i9 = 43;
                break;
            case 42:
                i9 = 44;
                break;
            case 43:
                i9 = 45;
                break;
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                i9 = 46;
                break;
            case 45:
                i9 = 47;
                break;
            case 46:
                i9 = 48;
                break;
            default:
                i9 = 0;
                break;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }

    public final int zzk() {
        int i9;
        switch (this.zzd) {
            case 0:
                i9 = 2;
                break;
            case 1:
                i9 = 3;
                break;
            case 2:
                i9 = 4;
                break;
            case 3:
                i9 = 5;
                break;
            case 4:
                i9 = 6;
                break;
            case 5:
                i9 = 7;
                break;
            case 6:
                i9 = 8;
                break;
            case 7:
                i9 = 9;
                break;
            case 8:
                i9 = 10;
                break;
            case 9:
                i9 = 11;
                break;
            case 10:
                i9 = 12;
                break;
            default:
                i9 = 0;
                break;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
