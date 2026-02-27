package H5;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Utf8;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: H5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0622m {
    public static Status a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? b((String) listAsList.get(0), (String) listAsList.get(1)) : b((String) listAsList.get(0), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Status b(String str, String str2) {
        int i9;
        str.hashCode();
        byte b9 = -1;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    b9 = 0;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    b9 = 1;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    b9 = 2;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    b9 = 3;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    b9 = 4;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    b9 = 5;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    b9 = 6;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    b9 = 7;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    b9 = 8;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    b9 = 9;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    b9 = 10;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    b9 = 11;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    b9 = 12;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    b9 = 13;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    b9 = 14;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    b9 = 15;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    b9 = 16;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    b9 = 17;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    b9 = 18;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    b9 = 19;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    b9 = 20;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    b9 = 21;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    b9 = 22;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    b9 = 23;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    b9 = 24;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    b9 = 25;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    b9 = 26;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    b9 = 27;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    b9 = 28;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    b9 = 29;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    b9 = 30;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    b9 = 31;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    b9 = 32;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    b9 = 33;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    b9 = 34;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    b9 = 35;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    b9 = 36;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    b9 = 37;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    b9 = 38;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    b9 = 39;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    b9 = 40;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    b9 = 41;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    b9 = 42;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    b9 = 43;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    b9 = 44;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    b9 = 45;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    b9 = 46;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    b9 = 47;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    b9 = 48;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    b9 = 49;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    b9 = 50;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    b9 = 51;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    b9 = 52;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    b9 = 53;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    b9 = 54;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    b9 = 55;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    b9 = 56;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    b9 = 57;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    b9 = 58;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    b9 = 59;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    b9 = 60;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    b9 = 61;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    b9 = 62;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    b9 = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    b9 = 64;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    b9 = 65;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    b9 = 66;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    b9 = 67;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    b9 = 68;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    b9 = 69;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    b9 = 70;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    b9 = 71;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    b9 = 72;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    b9 = 73;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    b9 = 74;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    b9 = 75;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    b9 = 76;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    b9 = 77;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    b9 = 78;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    b9 = 79;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    b9 = 80;
                }
                break;
        }
        switch (b9) {
            case 0:
                i9 = 18001;
                break;
            case 1:
                i9 = 17033;
                break;
            case 2:
                i9 = 17057;
                break;
            case 3:
                i9 = 17091;
                break;
            case 4:
            case 30:
            case 63:
                i9 = 17004;
                break;
            case 5:
                i9 = 17068;
                break;
            case 6:
                i9 = 17052;
                break;
            case 7:
                i9 = 17061;
                break;
            case 8:
                i9 = 17206;
                break;
            case 9:
                i9 = 17200;
                break;
            case 10:
                i9 = 17029;
                break;
            case 11:
                i9 = 17038;
                break;
            case 12:
                i9 = 17030;
                break;
            case 13:
                i9 = 17034;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i9 = 17044;
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                i9 = 17021;
                break;
            case 16:
                i9 = 17079;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                i9 = 18002;
                break;
            case 18:
                i9 = 17046;
                break;
            case 19:
                i9 = 17087;
                break;
            case 20:
            case 72:
                i9 = 17008;
                break;
            case 21:
                i9 = 17085;
                break;
            case 22:
                i9 = 17094;
                break;
            case 23:
                i9 = 17064;
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                i9 = 17016;
                break;
            case 25:
                i9 = 17084;
                break;
            case 26:
                i9 = 17035;
                break;
            case 27:
                i9 = 17014;
                break;
            case 28:
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                i9 = 17020;
                break;
            case 29:
                i9 = 17207;
                break;
            case 31:
                i9 = 17203;
                break;
            case 32:
            case 51:
                i9 = 17006;
                break;
            case 33:
                i9 = 17062;
                break;
            case 34:
                i9 = 17088;
                break;
            case 35:
                i9 = 17082;
                break;
            case 36:
            case 39:
                i9 = 17011;
                break;
            case LangUtils.HASH_OFFSET /* 37 */:
                i9 = 17056;
                break;
            case 38:
                i9 = 17026;
                break;
            case 40:
                i9 = 17089;
                break;
            case 41:
                i9 = 17032;
                break;
            case 42:
                i9 = 17041;
                break;
            case 43:
                i9 = 17074;
                break;
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                i9 = 17081;
                break;
            case 45:
                i9 = 17095;
                break;
            case 46:
                i9 = 17007;
                break;
            case 47:
                i9 = 17017;
                break;
            case 48:
                i9 = 17065;
                break;
            case 49:
                i9 = 17204;
                break;
            case 50:
                i9 = 17205;
                break;
            case 52:
                i9 = 17086;
                break;
            case 53:
                i9 = 17075;
                break;
            case 54:
                i9 = 17083;
                break;
            case 55:
                i9 = 17049;
                break;
            case 56:
                i9 = 17071;
                break;
            case 57:
                i9 = 17002;
                break;
            case 58:
                i9 = 17058;
                break;
            case 59:
                i9 = 17078;
                break;
            case 60:
                i9 = 17093;
                break;
            case 61:
                i9 = 17031;
                break;
            case 62:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                i9 = 17010;
                break;
            case 64:
                i9 = 17000;
                break;
            case 65:
                i9 = 17009;
                break;
            case 67:
                i9 = 17202;
                break;
            case 68:
                i9 = 17051;
                break;
            case 69:
                i9 = 17043;
                break;
            case 70:
                i9 = 17025;
                break;
            case 71:
                i9 = 17201;
                break;
            case 73:
                i9 = 17005;
                break;
            case 74:
                i9 = 17042;
                break;
            case 75:
                i9 = 17028;
                break;
            case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                i9 = 17040;
                break;
            case 78:
                i9 = 17045;
                break;
            case 79:
                i9 = 17090;
                break;
            case 80:
                i9 = 17073;
                break;
            default:
                i9 = 17499;
                break;
        }
        if (i9 != 17499) {
            return new Status(i9, str2);
        }
        if (str2 == null) {
            return new Status(i9, str);
        }
        return new Status(i9, str + ":" + str2);
    }
}
