package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum bul implements bqp {
    LOGSID_NONE(0),
    LOGSID_IP_ADDRESS(1),
    LOGSID_IP_ADDRESS_INTERNAL(2),
    LOGSID_USER_AGENT(3),
    LOGSID_SENSITIVE_TIMESTAMP(4),
    LOGSID_SENSITIVE_LOCATION(5),
    LOGSID_APPROXIMATE_LOCATION(15),
    LOGSID_COARSE_LOCATION(6),
    LOGSID_OTHER_LOCATION(9),
    LOGSID_OTHER_VERSION_ID(7),
    LOGSID_REFERER(8),
    LOGSID_THIRD_PARTY_PARAMETERS(16),
    LOGSID_OTHER_PSEUDONYMOUS_ID(10),
    LOGSID_PREF(11),
    LOGSID_ZWIEBACK(12),
    LOGSID_BISCOTTI(13),
    LOGSID_CUSTOM_SESSION_ID(14),
    LOGSID_OTHER_PERSONAL_ID(20),
    LOGSID_GAIA_ID(21),
    LOGSID_EMAIL(22),
    LOGSID_USERNAME(23),
    LOGSID_PHONE_NUMBER(24),
    LOGSID_GAIA_ID_PUBLIC(HttpStatus.SC_MULTI_STATUS),
    LOGSID_OTHER_AUTHENTICATED_ID(30),
    LOGSID_OTHER_UNAUTHENTICATED_ID(31),
    LOGSID_PARTNER_OR_CUSTOMER_ID(32),
    LOGSID_PUBLISHER_ID(35),
    LOGSID_DASHER_ID(33),
    LOGSID_FOCUS_GROUP_ID(34),
    LOGSID_OTHER_MOBILE_DEVICE_ID(50),
    LOGSID_GSERVICES_ANDROID_ID(51),
    LOGSID_HARDWARE_ID(52),
    LOGSID_MSISDN_ID(53),
    LOGSID_BUILD_SERIAL_ID(54),
    LOGSID_UDID_ID(55),
    LOGSID_ANDROID_LOGGING_ID(56),
    LOGSID_SECURE_SETTINGS_ANDROID_ID(57),
    LOGSID_OTHER_IDENTIFYING_USER_INFO(100),
    LOGSID_USER_INPUT(200),
    LOGSID_DEMOGRAPHIC_INFO(HttpStatus.SC_CREATED),
    LOGSID_GENERIC_KEY(HttpStatus.SC_ACCEPTED),
    LOGSID_GENERIC_VALUE(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION),
    LOGSID_COOKIE(HttpStatus.SC_NO_CONTENT),
    LOGSID_URL(HttpStatus.SC_RESET_CONTENT),
    LOGSID_HTTPHEADER(HttpStatus.SC_PARTIAL_CONTENT);


    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final bqq f22531T = new bqq() { // from class: com.google.ads.interactivemedia.v3.internal.buk
        @Override // com.google.ads.interactivemedia.v3.internal.bqq
        public final /* synthetic */ bqp a(int i9) {
            return bul.b(i9);
        }
    };

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int f22559V;

    bul(int i9) {
        this.f22559V = i9;
    }

    public static bqq a() {
        return f22531T;
    }

    public static bul b(int i9) {
        if (i9 == 100) {
            return LOGSID_OTHER_IDENTIFYING_USER_INFO;
        }
        switch (i9) {
            case 0:
                return LOGSID_NONE;
            case 1:
                return LOGSID_IP_ADDRESS;
            case 2:
                return LOGSID_IP_ADDRESS_INTERNAL;
            case 3:
                return LOGSID_USER_AGENT;
            case 4:
                return LOGSID_SENSITIVE_TIMESTAMP;
            case 5:
                return LOGSID_SENSITIVE_LOCATION;
            case 6:
                return LOGSID_COARSE_LOCATION;
            case 7:
                return LOGSID_OTHER_VERSION_ID;
            case 8:
                return LOGSID_REFERER;
            case 9:
                return LOGSID_OTHER_LOCATION;
            case 10:
                return LOGSID_OTHER_PSEUDONYMOUS_ID;
            case 11:
                return LOGSID_PREF;
            case 12:
                return LOGSID_ZWIEBACK;
            case 13:
                return LOGSID_BISCOTTI;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return LOGSID_CUSTOM_SESSION_ID;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return LOGSID_APPROXIMATE_LOCATION;
            case 16:
                return LOGSID_THIRD_PARTY_PARAMETERS;
            default:
                switch (i9) {
                    case 20:
                        return LOGSID_OTHER_PERSONAL_ID;
                    case 21:
                        return LOGSID_GAIA_ID;
                    case 22:
                        return LOGSID_EMAIL;
                    case 23:
                        return LOGSID_USERNAME;
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        return LOGSID_PHONE_NUMBER;
                    default:
                        switch (i9) {
                            case 30:
                                return LOGSID_OTHER_AUTHENTICATED_ID;
                            case 31:
                                return LOGSID_OTHER_UNAUTHENTICATED_ID;
                            case 32:
                                return LOGSID_PARTNER_OR_CUSTOMER_ID;
                            case 33:
                                return LOGSID_DASHER_ID;
                            case 34:
                                return LOGSID_FOCUS_GROUP_ID;
                            case 35:
                                return LOGSID_PUBLISHER_ID;
                            default:
                                switch (i9) {
                                    case 50:
                                        return LOGSID_OTHER_MOBILE_DEVICE_ID;
                                    case 51:
                                        return LOGSID_GSERVICES_ANDROID_ID;
                                    case 52:
                                        return LOGSID_HARDWARE_ID;
                                    case 53:
                                        return LOGSID_MSISDN_ID;
                                    case 54:
                                        return LOGSID_BUILD_SERIAL_ID;
                                    case 55:
                                        return LOGSID_UDID_ID;
                                    case 56:
                                        return LOGSID_ANDROID_LOGGING_ID;
                                    case 57:
                                        return LOGSID_SECURE_SETTINGS_ANDROID_ID;
                                    default:
                                        switch (i9) {
                                            case 200:
                                                return LOGSID_USER_INPUT;
                                            case HttpStatus.SC_CREATED /* 201 */:
                                                return LOGSID_DEMOGRAPHIC_INFO;
                                            case HttpStatus.SC_ACCEPTED /* 202 */:
                                                return LOGSID_GENERIC_KEY;
                                            case HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION /* 203 */:
                                                return LOGSID_GENERIC_VALUE;
                                            case HttpStatus.SC_NO_CONTENT /* 204 */:
                                                return LOGSID_COOKIE;
                                            case HttpStatus.SC_RESET_CONTENT /* 205 */:
                                                return LOGSID_URL;
                                            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                                                return LOGSID_HTTPHEADER;
                                            case HttpStatus.SC_MULTI_STATUS /* 207 */:
                                                return LOGSID_GAIA_ID_PUBLIC;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqp
    public final int getNumber() {
        return this.f22559V;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22559V);
    }
}
