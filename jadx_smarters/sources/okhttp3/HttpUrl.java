package okhttp3;

import B8.h;
import E8.e;
import E8.n;
import E8.o;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.E;
import l8.k;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import okio.Utf8;
import org.apache.http.HttpHost;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;
    private final boolean isHttps;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;
    private final String url;

    @NotNull
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i9, int i10) {
                try {
                    int i11 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i9, i10, "", false, false, false, false, null, 248, null));
                    if (1 <= i11 && 65535 >= i11) {
                        return i11;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i9, int i10) {
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt == ':') {
                        return i9;
                    }
                    if (cCharAt == '[') {
                        do {
                            i9++;
                            if (i9 < i10) {
                            }
                        } while (str.charAt(i9) != ']');
                    }
                    i9++;
                }
                return i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i9, int i10) {
                if (i10 - i9 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i9);
                if ((l.f(cCharAt, 97) < 0 || l.f(cCharAt, IjkMediaMeta.FF_PROFILE_H264_HIGH_422) > 0) && (l.f(cCharAt, 65) < 0 || l.f(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i9++;
                    if (i9 >= i10) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i9);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i9;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i9, int i10) {
                int i11 = 0;
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i9++;
                }
                return i11;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String str, boolean z9) {
            int i9 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i9, str.length());
                push(str, i9, iDelimiterOffset, iDelimiterOffset < str.length(), z9);
                i9 = iDelimiterOffset + 1;
            } while (i9 <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i9 = this.port;
            if (i9 != -1) {
                return i9;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            l.b(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return l.a(str, InstructionFileId.DOT) || n.o(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return l.a(str, "..") || n.o(str, "%2e.", true) || n.o(str, ".%2e", true) || n.o(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i9, int i10, boolean z9, boolean z10) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i9, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z10, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r2.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z9) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            B8.a aVarL = h.l(h.j(list.size() - 2, 0), 2);
            int iD = aVarL.d();
            int iF = aVarL.f();
            int iG = aVarL.g();
            if (iG >= 0) {
                if (iD > iF) {
                    return;
                }
            } else if (iD < iF) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                l.b(list2);
                if (l.a(str, list2.get(iD))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    l.b(list3);
                    list3.remove(iD + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    l.b(list4);
                    list4.remove(iD);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    l.b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (iD == iF) {
                    return;
                } else {
                    iD += iG;
                }
            }
        }

        private final void resolvePath(String str, int i9, int i10) {
            if (i9 == i10) {
                return;
            }
            char cCharAt = str.charAt(i9);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i9++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i11 = i9;
                if (i11 >= i10) {
                    return;
                }
                i9 = Util.delimiterOffset(str, "/\\", i11, i10);
                boolean z9 = i9 < i10;
                push(str, i11, i9, z9, true);
                if (z9) {
                    i9++;
                }
            }
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            l.e(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            l.e(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            l.e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.b(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            l.e(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            l.e(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String str) {
            l.e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.b(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(l8.l.o(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(l8.l.o(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            l.e(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            l.e(encodedPath, "encodedPath");
            if (n.B(encodedPath, "/", false, 2, null)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(@org.jetbrains.annotations.Nullable java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            l.e(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            l.e(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String input) {
            int iDelimiterOffset;
            int i9;
            int i10;
            int i11;
            String str;
            int i12;
            boolean z9;
            boolean z10;
            l.e(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            byte b9 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (n.y(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = ClientConstants.DOMAIN_SCHEME;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!n.y(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = HttpHost.DEFAULT_SCHEME_NAME;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b10 = Utf8.REPLACEMENT_BYTE;
            byte b11 = 35;
            if (iSlashCount >= 2 || httpUrl == null || (!l.a(httpUrl.scheme(), this.scheme))) {
                int i13 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i13, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : (byte) -1;
                    if (bCharAt == b9 || bCharAt == b11 || bCharAt == 47 || bCharAt == 92 || bCharAt == b10) {
                        break;
                    }
                    if (bCharAt != 64) {
                        i11 = iIndexOfLastNonAsciiWhitespace$default;
                        str = str2;
                    } else {
                        if (z11) {
                            i11 = iIndexOfLastNonAsciiWhitespace$default;
                            str = str2;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i12 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i13, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z9 = z12;
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, ':', i13, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i11 = iIndexOfLastNonAsciiWhitespace$default;
                            str = str2;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i13, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            i12 = iDelimiterOffset;
                            if (iDelimiterOffset2 != i12) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z10 = true;
                            } else {
                                z10 = z11;
                            }
                            z11 = z10;
                            z9 = true;
                        }
                        i13 = i12 + 1;
                        z12 = z9;
                    }
                    str2 = str;
                    iIndexOfLastNonAsciiWhitespace$default = i11;
                    b11 = 35;
                    b10 = Utf8.REPLACEMENT_BYTE;
                    b9 = -1;
                }
                i9 = iIndexOfLastNonAsciiWhitespace$default;
                String str3 = str2;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(input, i13, iDelimiterOffset);
                int i14 = iPortColonOffset + 1;
                if (i14 < iDelimiterOffset) {
                    i10 = i13;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i13, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(input, i14, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i14, iDelimiterOffset);
                        l.d(strSubstring2, str3);
                        sb3.append(strSubstring2);
                        sb3.append(TokenParser.DQUOTE);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    i10 = i13;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i10, iPortColonOffset, false, 4, null));
                    String str4 = this.scheme;
                    l.b(str4);
                    this.port = companion4.defaultPort(str4);
                }
                if (!(this.host != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i10, iPortColonOffset);
                    l.d(strSubstring3, str3);
                    sb4.append(strSubstring3);
                    sb4.append(TokenParser.DQUOTE);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i9 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i15 = i9;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i15);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i15 && input.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i15);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i15 && input.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, iDelimiterOffset3 + 1, i15, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            l.e(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder port(int i9) {
            if (1 <= i9 && 65535 >= i9) {
                this.port = i9;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i9).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder query(@org.jetbrains.annotations.Nullable java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new e("[\"<>^`{|}]").b(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i9 = 0; i9 < size; i9++) {
                List<String> list = this.encodedPathSegments;
                list.set(i9, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i9), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str2 = list2.get(i10);
                    list2.set(i10, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            l.e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            l.e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i9) {
            this.encodedPathSegments.remove(i9);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            l.e(scheme, "scheme");
            String str = HttpHost.DEFAULT_SCHEME_NAME;
            if (!n.o(scheme, HttpHost.DEFAULT_SCHEME_NAME, true)) {
                str = ClientConstants.DOMAIN_SCHEME;
                if (!n.o(scheme, ClientConstants.DOMAIN_SCHEME, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
            }
            this.scheme = str;
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            l.e(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i9, @NotNull String encodedPathSegment) {
            l.e(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i9, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            l.e(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            l.e(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i9, @NotNull String pathSegment) {
            l.e(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i9, strCanonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i9) {
            this.port = i9;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String str) {
            l.e(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
            Le:
                r0.append(r1)
                goto L15
            L12:
                java.lang.String r1 = "//"
                goto Le
            L15:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L20
                goto L28
            L20:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L42
            L28:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3d
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3d:
                r1 = 64
                r0.append(r1)
            L42:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L67
                kotlin.jvm.internal.l.b(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = E8.o.F(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L62
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L67
            L62:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L67:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L70
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L89
            L70:
                int r1 = r6.effectivePort()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L83
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.l.b(r3)
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L89
            L83:
                r0.append(r2)
                r0.append(r1)
            L89:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto La1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.l.b(r2)
                r1.toQueryString$okhttp(r2, r0)
            La1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Laf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Laf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.l.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            l.e(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
            return companion.canonicalize$okhttp(str, (i11 & 1) != 0 ? 0 : i9, (i11 & 2) != 0 ? str.length() : i10, str2, (i11 & 8) != 0 ? false : z9, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i9, int i10) {
            int i11 = i9 + 2;
            return i11 < i10 && str.charAt(i9) == '%' && Util.parseHexDigit(str.charAt(i9 + 1)) != -1 && Util.parseHexDigit(str.charAt(i11)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i9, int i10, boolean z9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z9 = false;
            }
            return companion.percentDecode$okhttp(str, i9, i10, z9);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[LOOP:1: B:52:0x0090->B:54:0x0096, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i9, int i10, boolean z9) {
            int i11;
            while (i9 < i10) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i9);
                if (iCodePointAt == 37 && (i11 = i9 + 2) < i10) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i9 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i11));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i9 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i9 = Character.charCount(iCodePointAt) + i11;
                    }
                } else if (iCodePointAt == 43 && z9) {
                    buffer.writeByte(32);
                    i9++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i9 += Character.charCount(iCodePointAt);
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m96deprecated_get(@NotNull String url) {
            l.e(url, "url");
            return get(url);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m97deprecated_get(@NotNull URI uri) {
            l.e(uri, "uri");
            return get(uri);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m98deprecated_get(@NotNull URL url) {
            l.e(url, "url");
            return get(url);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m99deprecated_parse(@NotNull String url) {
            l.e(url, "url");
            return parse(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String canonicalize$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r14, int r15, int r16, @org.jetbrains.annotations.NotNull java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, @org.jetbrains.annotations.Nullable java.nio.charset.Charset r22) throws java.io.EOFException {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.l.e(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.l.e(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L71
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L25
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L25
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L27
                if (r21 == 0) goto L25
                goto L27
            L25:
                r11 = r13
                goto L4f
            L27:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = E8.o.F(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L25
                r1 = 37
                if (r0 != r1) goto L41
                if (r18 == 0) goto L25
                if (r19 == 0) goto L41
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4f
                goto L42
            L41:
                r11 = r13
            L42:
                r1 = 43
                if (r0 != r1) goto L49
                if (r20 == 0) goto L49
                goto L4f
            L49:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4f:
                okio.Buffer r12 = new okio.Buffer
                r12.<init>()
                r0 = r15
                r12.writeUtf8(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.readUtf8()
                return r0
            L71:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.l.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int defaultPort(@NotNull String scheme) {
            l.e(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals(ClientConstants.DOMAIN_SCHEME)) {
                    return 443;
                }
            } else if (scheme.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                return 80;
            }
            return -1;
        }

        @NotNull
        public final HttpUrl get(@NotNull String toHttpUrl) {
            l.e(toHttpUrl, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, toHttpUrl).build();
        }

        @Nullable
        public final HttpUrl get(@NotNull URI toHttpUrlOrNull) {
            l.e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            l.d(string, "toString()");
            return parse(string);
        }

        @Nullable
        public final HttpUrl get(@NotNull URL toHttpUrlOrNull) {
            l.e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            l.d(string, "toString()");
            return parse(string);
        }

        @Nullable
        public final HttpUrl parse(@NotNull String toHttpUrlOrNull) {
            l.e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return get(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String percentDecode, int i9, int i10, boolean z9) {
            l.e(percentDecode, "$this$percentDecode");
            for (int i11 = i9; i11 < i10; i11++) {
                char cCharAt = percentDecode.charAt(i11);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i9, i11);
                    writePercentDecoded(buffer, percentDecode, i11, i10, z9);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = percentDecode.substring(i9, i10);
            l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(@NotNull List<String> toPathString, @NotNull StringBuilder out) {
            l.e(toPathString, "$this$toPathString");
            l.e(out, "out");
            int size = toPathString.size();
            for (int i9 = 0; i9 < size; i9++) {
                out.append('/');
                out.append(toPathString.get(i9));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String toQueryNamesAndValues) {
            String strSubstring;
            l.e(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 <= toQueryNamesAndValues.length()) {
                int iQ = o.Q(toQueryNamesAndValues, '&', i9, false, 4, null);
                if (iQ == -1) {
                    iQ = toQueryNamesAndValues.length();
                }
                int i10 = iQ;
                int iQ2 = o.Q(toQueryNamesAndValues, '=', i9, false, 4, null);
                if (iQ2 == -1 || iQ2 > i10) {
                    String strSubstring2 = toQueryNamesAndValues.substring(i9, i10);
                    l.d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = toQueryNamesAndValues.substring(i9, iQ2);
                    l.d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = toQueryNamesAndValues.substring(iQ2 + 1, i10);
                    l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i9 = i10 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> toQueryString, @NotNull StringBuilder out) {
            l.e(toQueryString, "$this$toQueryString");
            l.e(out, "out");
            B8.a aVarL = h.l(h.m(0, toQueryString.size()), 2);
            int iD = aVarL.d();
            int iF = aVarL.f();
            int iG = aVarL.g();
            if (iG >= 0) {
                if (iD > iF) {
                    return;
                }
            } else if (iD < iF) {
                return;
            }
            while (true) {
                String str = toQueryString.get(iD);
                String str2 = toQueryString.get(iD + 1);
                if (iD > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iD == iF) {
                    return;
                } else {
                    iD += iG;
                }
            }
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i9, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        l.e(scheme, "scheme");
        l.e(username, "username");
        l.e(password, "password");
        l.e(host, "host");
        l.e(pathSegments, "pathSegments");
        l.e(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i9;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = l.a(scheme, ClientConstants.DOMAIN_SCHEME);
    }

    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m77deprecated_encodedFragment() {
        return encodedFragment();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m78deprecated_encodedPassword() {
        return encodedPassword();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m79deprecated_encodedPath() {
        return encodedPath();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m80deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m81deprecated_encodedQuery() {
        return encodedQuery();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m82deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m83deprecated_fragment() {
        return this.fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final String m84deprecated_host() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final String m85deprecated_password() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m86deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m87deprecated_pathSize() {
        return pathSize();
    }

    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m88deprecated_port() {
        return this.port;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m89deprecated_query() {
        return query();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m90deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m91deprecated_querySize() {
        return querySize();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m92deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m93deprecated_uri() {
        return uri();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m94deprecated_url() {
        return url();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final String m95deprecated_username() {
        return this.username;
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int iQ = o.Q(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iQ);
        l.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int iQ = o.Q(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
        int iQ2 = o.Q(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iQ, iQ2);
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedPath() {
        int iQ = o.Q(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iQ, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iQ, iDelimiterOffset);
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int iQ = o.Q(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iQ, str.length());
        ArrayList arrayList = new ArrayList();
        while (iQ < iDelimiterOffset) {
            int i9 = iQ + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i9, iDelimiterOffset);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i9, iDelimiterOffset2);
            l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iQ = iDelimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iQ = o.Q(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, '#', iQ, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iQ, iDelimiterOffset);
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iDelimiterOffset);
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && l.a(((HttpUrl) obj).url, this.url);
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        l.e(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        l.e(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        B8.a aVarL = h.l(h.m(0, list.size()), 2);
        int iD = aVarL.d();
        int iF = aVarL.f();
        int iG = aVarL.g();
        if (iG < 0 ? iD >= iF : iD <= iF) {
            while (!l.a(name, this.queryNamesAndValues.get(iD))) {
                if (iD != iF) {
                    iD += iG;
                }
            }
            return this.queryNamesAndValues.get(iD + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i9 * 2);
        l.b(str);
        return str;
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return E.b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        B8.a aVarL = h.l(h.m(0, this.queryNamesAndValues.size()), 2);
        int iD = aVarL.d();
        int iF = aVarL.f();
        int iG = aVarL.g();
        if (iG < 0 ? iD >= iF : iD <= iF) {
            while (true) {
                String str = this.queryNamesAndValues.get(iD);
                l.b(str);
                linkedHashSet.add(str);
                if (iD == iF) {
                    break;
                }
                iD += iG;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l.d(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i9 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        l.e(name, "name");
        if (this.queryNamesAndValues == null) {
            return k.f();
        }
        ArrayList arrayList = new ArrayList();
        B8.a aVarL = h.l(h.m(0, this.queryNamesAndValues.size()), 2);
        int iD = aVarL.d();
        int iF = aVarL.f();
        int iG = aVarL.g();
        if (iG < 0 ? iD >= iF : iD <= iF) {
            while (true) {
                if (l.a(name, this.queryNamesAndValues.get(iD))) {
                    arrayList.add(this.queryNamesAndValues.get(iD + 1));
                }
                if (iD == iF) {
                    break;
                }
                iD += iG;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        l.d(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        l.b(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        l.e(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e9) {
            try {
                URI uriCreate = URI.create(new e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                l.d(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e9);
            }
        }
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e9) {
            throw new RuntimeException(e9);
        }
    }

    @NotNull
    public final String username() {
        return this.username;
    }
}
