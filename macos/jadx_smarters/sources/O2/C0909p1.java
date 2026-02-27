package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: O2.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0909p1 extends Exception implements InterfaceC0901n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6171d = d4.k0.A0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f6172e = d4.k0.A0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f6173f = d4.k0.A0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f6174g = d4.k0.A0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f6175h = d4.k0.A0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC0901n.a f6176i = new InterfaceC0901n.a() { // from class: O2.o1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return new C0909p1(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6177a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6178c;

    public C0909p1(Bundle bundle) {
        this(bundle.getString(f6173f), c(bundle), bundle.getInt(f6171d, 1000), bundle.getLong(f6172e, SystemClock.elapsedRealtime()));
    }

    public C0909p1(String str, Throwable th, int i9, long j9) {
        super(str, th);
        this.f6177a = i9;
        this.f6178c = j9;
    }

    public static RemoteException a(String str) {
        return new RemoteException(str);
    }

    public static Throwable b(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static Throwable c(Bundle bundle) {
        String string = bundle.getString(f6174g);
        String string2 = bundle.getString(f6175h);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C0909p1.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            if (thB != null) {
                return thB;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public static String e(int i9) {
        if (i9 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i9 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        if (i9 == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i9 == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i9) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i9) {
                    case AdError.SERVER_ERROR_CODE /* 2000 */:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case AdError.INTERNAL_ERROR_CODE /* 2001 */:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case AdError.CACHE_ERROR_CODE /* 2002 */:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case AdError.INTERNAL_ERROR_2004 /* 2004 */:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case AdError.INTERNAL_ERROR_2006 /* 2006 */:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case AdError.REMOTE_ADS_SERVICE_ERROR /* 2008 */:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i9) {
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i9) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i9) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i9 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public final String d() {
        return e(this.f6177a);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6171d, this.f6177a);
        bundle.putLong(f6172e, this.f6178c);
        bundle.putString(f6173f, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f6174g, cause.getClass().getName());
            bundle.putString(f6175h, cause.getMessage());
        }
        return bundle;
    }
}
