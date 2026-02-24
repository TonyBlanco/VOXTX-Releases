package okhttp3.internal.http2;

import E8.n;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.l;
import okhttp3.internal.Util;
import okio.ByteString;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();

    @NotNull
    public static final ByteString CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        for (int i9 = 0; i9 < 256; i9++) {
            String binaryString = Integer.toBinaryString(i9);
            l.d(binaryString, "Integer.toBinaryString(it)");
            strArr[i9] = n.w(Util.format("%8s", binaryString), TokenParser.SP, '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = l.l(strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = FLAGS;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + "|" + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + "|" + strArr3[i12] + "|PADDED";
        }
        int length = FLAGS.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i15] == null) {
                strArr4[i15] = BINARY[i15];
            }
        }
    }

    private Http2() {
    }

    @NotNull
    public final String formatFlags(int i9, int i10) {
        String str;
        int i11;
        Object obj;
        String str2;
        String str3;
        if (i10 == 0) {
            return "";
        }
        if (i9 != 2 && i9 != 3) {
            if (i9 == 4 || i9 == 6) {
                return i10 == 1 ? "ACK" : BINARY[i10];
            }
            if (i9 != 7 && i9 != 8) {
                String[] strArr = FLAGS;
                if (i10 < strArr.length) {
                    str = strArr[i10];
                    l.b(str);
                } else {
                    str = BINARY[i10];
                }
                String str4 = str;
                if (i9 == 5 && (i10 & 4) != 0) {
                    i11 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i9 != 0 || (i10 & 32) == 0) {
                        return str4;
                    }
                    i11 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return n.x(str4, str2, str3, false, i11, obj);
            }
        }
        return BINARY[i10];
    }

    @NotNull
    public final String formattedType$okhttp(int i9) {
        String[] strArr = FRAME_NAMES;
        return i9 < strArr.length ? strArr[i9] : Util.format("0x%02x", Integer.valueOf(i9));
    }

    @NotNull
    public final String frameLog(boolean z9, int i9, int i10, int i11, int i12) {
        return Util.format("%s 0x%08x %5d %-13s %s", z9 ? "<<" : ">>", Integer.valueOf(i9), Integer.valueOf(i10), formattedType$okhttp(i11), formatFlags(i11, i12));
    }
}
