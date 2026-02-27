package com.google.ads.interactivemedia.v3.api;

import com.google.android.gms.common.internal.Hide;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class AdError extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdErrorCode f18597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdErrorType f18598b;

    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(HttpStatus.SC_MOVED_TEMPORARILY),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(HttpStatus.SC_PAYMENT_REQUIRED),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(HttpStatus.SC_BAD_GATEWAY),
        VAST_NONLINEAR_ASSET_MISMATCH(HttpStatus.SC_SERVICE_UNAVAILABLE),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(WebSocketProtocol.CLOSE_NO_STATUS_CODE),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18600b;

        AdErrorCode(int i9) {
            this.f18600b = i9;
        }

        public int getErrorNumber() {
            return this.f18600b;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "AdErrorCode [name: " + name() + ", number: " + this.f18600b + "]";
        }
    }

    public enum AdErrorType {
        LOAD,
        PLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdError(AdErrorType adErrorType, int i9, String str) {
        AdErrorCode adErrorCode;
        AdErrorCode[] adErrorCodeArrValues = AdErrorCode.values();
        int length = adErrorCodeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                adErrorCode = adErrorCodeArrValues[i10];
                if (adErrorCode.getErrorNumber() == i9) {
                    break;
                } else {
                    i10++;
                }
            } else {
                adErrorCode = i9 == 1204 ? AdErrorCode.INTERNAL_ERROR : AdErrorCode.UNKNOWN_ERROR;
            }
        }
        this(adErrorType, adErrorCode, str);
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.f18598b = adErrorType;
        this.f18597a = adErrorCode;
    }

    public AdErrorCode getErrorCode() {
        return this.f18597a;
    }

    public int getErrorCodeNumber() {
        return this.f18597a.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.f18598b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    @Hide
    public String toString() {
        return "AdError [errorType: " + String.valueOf(this.f18598b) + ", errorCode: " + String.valueOf(this.f18597a) + ", message: " + getMessage() + "]";
    }
}
