package okhttp3.internal.http;

import E8.n;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.Protocol;
import okhttp3.Response;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;

    @NotNull
    public final String message;

    @NotNull
    public final Protocol protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final StatusLine get(@NotNull Response response) {
            l.e(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        @NotNull
        public final StatusLine parse(@NotNull String statusLine) throws IOException {
            Protocol protocol;
            int i9;
            String strSubstring;
            l.e(statusLine, "statusLine");
            if (n.B(statusLine, "HTTP/1.", false, 2, null)) {
                i9 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!n.B(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i9 = 4;
            }
            int i10 = i9 + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i9, i10);
                l.d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i11 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i10) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i9 + 4);
                    l.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public StatusLine(@NotNull Protocol protocol, int i9, @NotNull String message) {
        l.e(protocol, "protocol");
        l.e(message, "message");
        this.protocol = protocol;
        this.code = i9;
        this.message = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(TokenParser.SP);
        sb.append(this.code);
        sb.append(TokenParser.SP);
        sb.append(this.message);
        String string = sb.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
