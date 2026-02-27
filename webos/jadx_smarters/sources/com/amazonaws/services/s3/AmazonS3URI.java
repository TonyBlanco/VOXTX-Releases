package com.amazonaws.services.s3;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3URI {
    private static final Pattern ENDPOINT_PATTERN = Pattern.compile("^(.+\\.)?s3[.-]([a-z0-9-]+)\\.");
    private static final Pattern VERSION_ID_PATTERN = Pattern.compile("[&;]");
    private final String bucket;
    private final boolean isPathStyle;
    private final String key;
    private final String region;
    private final URI uri;
    private final String versionId;

    public AmazonS3URI(String str) {
        this(str, true);
    }

    public AmazonS3URI(String str, boolean z9) {
        this(URI.create(preprocessUrlStr(str, z9)), z9);
    }

    public AmazonS3URI(URI uri) {
        this(uri, false);
    }

    private AmazonS3URI(URI uri, boolean z9) {
        String strDecode;
        String strSubstring;
        if (uri == null) {
            throw new IllegalArgumentException("uri cannot be null");
        }
        this.uri = uri;
        if ("s3".equalsIgnoreCase(uri.getScheme())) {
            this.region = null;
            this.versionId = null;
            this.isPathStyle = false;
            String authority = uri.getAuthority();
            this.bucket = authority;
            if (authority == null) {
                throw new IllegalArgumentException("Invalid S3 URI: no bucket: " + uri);
            }
            if (uri.getPath().length() <= 1) {
                this.key = null;
                return;
            } else {
                this.key = uri.getPath().substring(1);
                return;
            }
        }
        String host = uri.getHost();
        if (host == null) {
            throw new IllegalArgumentException("Invalid S3 URI: no hostname: " + uri);
        }
        Matcher matcher = ENDPOINT_PATTERN.matcher(host);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Invalid S3 URI: hostname does not appear to be a valid S3 endpoint: " + uri);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null || strGroup.isEmpty()) {
            this.isPathStyle = true;
            String path = z9 ? uri.getPath() : uri.getRawPath();
            if ("/".equals(path)) {
                this.bucket = null;
            } else {
                int iIndexOf = path.indexOf(47, 1);
                if (iIndexOf == -1) {
                    strSubstring = path.substring(1);
                } else if (iIndexOf == path.length() - 1) {
                    strSubstring = path.substring(1, iIndexOf);
                } else {
                    this.bucket = decode(path.substring(1, iIndexOf));
                    strDecode = decode(path.substring(iIndexOf + 1));
                    this.key = strDecode;
                }
                this.bucket = decode(strSubstring);
            }
            this.key = null;
        } else {
            this.isPathStyle = false;
            this.bucket = strGroup.substring(0, strGroup.length() - 1);
            String path2 = uri.getPath();
            if (path2 != null && !path2.isEmpty() && !"/".equals(uri.getPath())) {
                strDecode = uri.getPath().substring(1);
                this.key = strDecode;
            }
            this.key = null;
        }
        this.versionId = parseVersionId(uri.getRawQuery());
        if ("amazonaws".equals(matcher.group(2))) {
            this.region = null;
        } else {
            this.region = matcher.group(2);
        }
    }

    private static void appendDecoded(StringBuilder sb, String str, int i9) {
        if (i9 <= str.length() - 3) {
            char cCharAt = str.charAt(i9 + 1);
            sb.append((char) (fromHex(str.charAt(i9 + 2)) | (fromHex(cCharAt) << 4)));
            return;
        }
        throw new IllegalStateException("Invalid percent-encoded string:\"" + str + "\".");
    }

    private static String decode(String str) {
        if (str == null) {
            return null;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) == '%') {
                return decode(str, i9);
            }
        }
        return str;
    }

    private static String decode(String str, int i9) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i9));
        appendDecoded(sb, str, i9);
        int i10 = i9 + 3;
        while (i10 < str.length()) {
            if (str.charAt(i10) == '%') {
                appendDecoded(sb, str, i10);
                i10 += 2;
            } else {
                sb.append(str.charAt(i10));
            }
            i10++;
        }
        return sb.toString();
    }

    private static int fromHex(char c9) {
        if (c9 < '0') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c9 + "' in escape sequence.");
        }
        if (c9 <= '9') {
            return c9 - '0';
        }
        if (c9 < 'A') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c9 + "' in escape sequence.");
        }
        if (c9 <= 'F') {
            return c9 - '7';
        }
        if (c9 < 'a') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c9 + "' in escape sequence.");
        }
        if (c9 <= 'f') {
            return c9 - 'W';
        }
        throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c9 + "' in escape sequence.");
    }

    private static String parseVersionId(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : VERSION_ID_PATTERN.split(str)) {
            if (str2.startsWith("versionId=")) {
                return decode(str2.substring(10));
            }
        }
        return null;
    }

    private static String preprocessUrlStr(String str, boolean z9) {
        if (!z9) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("%3A", ":").replace("%2F", "/").replace("+", " ");
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException(e9);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmazonS3URI amazonS3URI = (AmazonS3URI) obj;
        if (this.isPathStyle != amazonS3URI.isPathStyle || !this.uri.equals(amazonS3URI.uri)) {
            return false;
        }
        String str = this.bucket;
        if (str == null ? amazonS3URI.bucket != null : !str.equals(amazonS3URI.bucket)) {
            return false;
        }
        String str2 = this.key;
        if (str2 == null ? amazonS3URI.key != null : !str2.equals(amazonS3URI.key)) {
            return false;
        }
        String str3 = this.versionId;
        if (str3 == null ? amazonS3URI.versionId != null : !str3.equals(amazonS3URI.versionId)) {
            return false;
        }
        String str4 = this.region;
        String str5 = amazonS3URI.region;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKey() {
        return this.key;
    }

    public String getRegion() {
        return this.region;
    }

    public URI getURI() {
        return this.uri;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        int iHashCode = ((this.uri.hashCode() * 31) + (this.isPathStyle ? 1 : 0)) * 31;
        String str = this.bucket;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.key;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.versionId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.region;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean isPathStyle() {
        return this.isPathStyle;
    }

    public String toString() {
        return this.uri.toString();
    }
}
