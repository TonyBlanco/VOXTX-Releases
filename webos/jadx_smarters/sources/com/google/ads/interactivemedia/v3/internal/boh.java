package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.message.TokenParser;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public class boh implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f21826b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f21835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f21836l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f21838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f21839o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21827c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f21828d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21829e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21830f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21831g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21832h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21825a = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21837m = 1;

    static {
        bla.f21641a = new bog();
    }

    public boh(Reader reader) {
        int[] iArr = new int[32];
        this.f21836l = iArr;
        iArr[0] = 6;
        this.f21838n = new String[32];
        this.f21839o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f21826b = reader;
    }

    private final void A() throws IOException {
        if (!this.f21827c) {
            throw w("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void B(int i9) {
        int i10 = this.f21837m;
        int[] iArr = this.f21836l;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.f21836l = Arrays.copyOf(iArr, i11);
            this.f21839o = Arrays.copyOf(this.f21839o, i11);
            this.f21838n = (String[]) Arrays.copyOf(this.f21838n, i11);
        }
        int[] iArr2 = this.f21836l;
        int i12 = this.f21837m;
        this.f21837m = i12 + 1;
        iArr2[i12] = i9;
    }

    private final void C(char c9) throws IOException {
        char[] cArr = this.f21828d;
        while (true) {
            int i9 = this.f21829e;
            int i10 = this.f21830f;
            while (true) {
                if (i9 < i10) {
                    int i11 = i9 + 1;
                    char c10 = cArr[i9];
                    if (c10 == c9) {
                        this.f21829e = i11;
                        return;
                    }
                    if (c10 == '\\') {
                        this.f21829e = i11;
                        d();
                        break;
                    } else {
                        if (c10 == '\n') {
                            this.f21831g++;
                            this.f21832h = i11;
                        }
                        i9 = i11;
                    }
                } else {
                    this.f21829e = i9;
                    if (!E(1)) {
                        throw w("Unterminated string");
                    }
                }
            }
        }
    }

    private final void D() throws IOException {
        char c9;
        do {
            if (this.f21829e >= this.f21830f && !E(1)) {
                return;
            }
            char[] cArr = this.f21828d;
            int i9 = this.f21829e;
            int i10 = i9 + 1;
            this.f21829e = i10;
            c9 = cArr[i9];
            if (c9 == '\n') {
                this.f21831g++;
                this.f21832h = i10;
                return;
            }
        } while (c9 != '\r');
    }

    private final boolean E(int i9) throws IOException {
        int i10;
        char[] cArr = this.f21828d;
        int i11 = this.f21832h;
        int i12 = this.f21829e;
        this.f21832h = i11 - i12;
        int i13 = this.f21830f;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f21830f = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f21830f = 0;
        }
        this.f21829e = 0;
        do {
            Reader reader = this.f21826b;
            int i15 = this.f21830f;
            int i16 = reader.read(cArr, i15, 1024 - i15);
            if (i16 == -1) {
                return false;
            }
            i10 = this.f21830f + i16;
            this.f21830f = i10;
            if (this.f21831g == 0 && this.f21832h == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f21829e++;
                this.f21832h = 1;
                i9++;
            }
        } while (i10 < i9);
        return true;
    }

    private final boolean F(char c9) throws IOException {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case ModuleDescriptor.MODULE_VERSION /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        return false;
    }

    private final char d() throws IOException {
        int i9;
        if (this.f21829e == this.f21830f && !E(1)) {
            throw w("Unterminated escape sequence");
        }
        char[] cArr = this.f21828d;
        int i10 = this.f21829e;
        int i11 = i10 + 1;
        this.f21829e = i11;
        char c9 = cArr[i10];
        if (c9 == '\n') {
            this.f21831g++;
            this.f21832h = i11;
        } else if (c9 != '\"' && c9 != '\'' && c9 != '/' && c9 != '\\') {
            if (c9 == 'b') {
                return '\b';
            }
            if (c9 == 'f') {
                return '\f';
            }
            if (c9 == 'n') {
                return '\n';
            }
            if (c9 == 'r') {
                return TokenParser.CR;
            }
            if (c9 == 't') {
                return '\t';
            }
            if (c9 != 'u') {
                throw w("Invalid escape sequence");
            }
            if (i10 + 5 > this.f21830f && !E(4)) {
                throw w("Unterminated escape sequence");
            }
            int i12 = this.f21829e;
            int i13 = i12 + 4;
            char c10 = 0;
            while (i12 < i13) {
                char[] cArr2 = this.f21828d;
                char c11 = cArr2[i12];
                char c12 = (char) (c10 << 4);
                if (c11 >= '0' && c11 <= '9') {
                    i9 = c11 - '0';
                } else if (c11 >= 'a' && c11 <= 'f') {
                    i9 = c11 - 'W';
                } else {
                    if (c11 < 'A' || c11 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr2, this.f21829e, 4)));
                    }
                    i9 = c11 - '7';
                }
                c10 = (char) (c12 + i9);
                i12++;
            }
            this.f21829e += 4;
            return c10;
        }
        return c9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r5 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r8.f21829e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r4 != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r8.f21829e = r1;
        r1 = E(2);
        r8.f21829e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        A();
        r1 = r8.f21829e;
        r2 = r0[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r2 == '*') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r2 == '/') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r8.f21829e = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r8.f21829e = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if ((r8.f21829e + 2) <= r8.f21830f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (E(2) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        throw w("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        r1 = r8.f21828d;
        r2 = r8.f21829e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r1[r2] != '\n') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r8.f21831g++;
        r8.f21832h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r1 >= 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (r8.f21828d[r8.f21829e + r1] != "*\/".charAt(r1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        r1 = r8.f21829e + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        r8.f21829e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
    
        if (r5 != '#') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(boolean r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boh.n(boolean):int");
    }

    private final IOException w(String str) throws IOException {
        throw new bok(str.concat(String.valueOf(t())));
    }

    private String x(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i9 = 0;
        while (true) {
            int i10 = this.f21837m;
            if (i9 >= i10) {
                return sb.toString();
            }
            int i11 = this.f21836l[i9];
            if (i11 == 1 || i11 == 2) {
                int i12 = this.f21839o[i9];
                if (z9 && i12 > 0 && i9 == i10 - 1) {
                    i12--;
                }
                sb.append('[');
                sb.append(i12);
                sb.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb.append('.');
                String str = this.f21838n[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
            i9++;
        }
    }

    private final String y(char c9) throws IOException {
        char[] cArr = this.f21828d;
        StringBuilder sb = null;
        while (true) {
            int i9 = this.f21829e;
            int i10 = this.f21830f;
            while (true) {
                if (i9 < i10) {
                    int i11 = i9 + 1;
                    char c10 = cArr[i9];
                    if (c10 == c9) {
                        this.f21829e = i11;
                        int i12 = (i11 - i9) - 1;
                        if (sb == null) {
                            return new String(cArr, i9, i12);
                        }
                        sb.append(cArr, i9, i12);
                        return sb.toString();
                    }
                    if (c10 == '\\') {
                        this.f21829e = i11;
                        int i13 = i11 - i9;
                        int i14 = i13 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i13 + i13, 16));
                        }
                        sb.append(cArr, i9, i14);
                        sb.append(d());
                    } else {
                        if (c10 == '\n') {
                            this.f21831g++;
                            this.f21832h = i11;
                        }
                        i9 = i11;
                    }
                } else {
                    if (sb == null) {
                        int i15 = i9 - i9;
                        sb = new StringBuilder(Math.max(i15 + i15, 16));
                    }
                    sb.append(cArr, i9, i9 - i9);
                    this.f21829e = i9;
                    if (!E(1)) {
                        throw w("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        A();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String z() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.f21829e
            int r3 = r3 + r2
            int r4 = r5.f21830f
            if (r3 >= r4) goto L4c
            char[] r4 = r5.f21828d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.A()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.E(r3)
            if (r3 != 0) goto L3
        L58:
            r1 = r2
            goto L7a
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            char[] r3 = r5.f21828d
            int r4 = r5.f21829e
            r0.append(r3, r4, r2)
            int r3 = r5.f21829e
            int r3 = r3 + r2
            r5.f21829e = r3
            r2 = 1
            boolean r2 = r5.E(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L86
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.f21828d
            int r3 = r5.f21829e
            r0.<init>(r2, r3, r1)
            goto L91
        L86:
            char[] r2 = r5.f21828d
            int r3 = r5.f21829e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L91:
            int r2 = r5.f21829e
            int r2 = r2 + r1
            r5.f21829e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boh.z():java.lang.String");
    }

    public double a() throws IOException {
        String strY;
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f21825a = 0;
            int[] iArr = this.f21839o;
            int i9 = this.f21837m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f21833i;
        }
        if (iS == 16) {
            char[] cArr = this.f21828d;
            int i10 = this.f21829e;
            int i11 = this.f21834j;
            this.f21835k = new String(cArr, i10, i11);
            this.f21829e = i10 + i11;
        } else {
            if (iS == 8 || iS == 9) {
                strY = y(iS == 8 ? '\'' : TokenParser.DQUOTE);
            } else if (iS == 10) {
                strY = z();
            } else if (iS != 11) {
                int iR = r();
                throw new IllegalStateException("Expected a double but was " + boi.a(iR) + t());
            }
            this.f21835k = strY;
        }
        this.f21825a = 11;
        double d9 = Double.parseDouble(this.f21835k);
        if (this.f21827c || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
            this.f21835k = null;
            this.f21825a = 0;
            int[] iArr2 = this.f21839o;
            int i12 = this.f21837m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return d9;
        }
        throw new bok("JSON forbids NaN and infinities: " + d9 + t());
    }

    public int b() throws IOException {
        String strY;
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            long j9 = this.f21833i;
            int i9 = (int) j9;
            if (j9 == i9) {
                this.f21825a = 0;
                int[] iArr = this.f21839o;
                int i10 = this.f21837m - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new NumberFormatException("Expected an int but was " + j9 + t());
        }
        if (iS == 16) {
            char[] cArr = this.f21828d;
            int i11 = this.f21829e;
            int i12 = this.f21834j;
            this.f21835k = new String(cArr, i11, i12);
            this.f21829e = i11 + i12;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                int iR = r();
                throw new IllegalStateException("Expected an int but was " + boi.a(iR) + t());
            }
            if (iS == 10) {
                strY = z();
            } else {
                strY = y(iS == 8 ? '\'' : TokenParser.DQUOTE);
            }
            this.f21835k = strY;
            try {
                int i13 = Integer.parseInt(this.f21835k);
                this.f21825a = 0;
                int[] iArr2 = this.f21839o;
                int i14 = this.f21837m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21825a = 11;
        double d9 = Double.parseDouble(this.f21835k);
        int i15 = (int) d9;
        if (i15 == d9) {
            this.f21835k = null;
            this.f21825a = 0;
            int[] iArr3 = this.f21839o;
            int i16 = this.f21837m - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        }
        throw new NumberFormatException("Expected an int but was " + this.f21835k + t());
    }

    public long c() throws IOException {
        String strY;
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f21825a = 0;
            int[] iArr = this.f21839o;
            int i9 = this.f21837m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f21833i;
        }
        if (iS == 16) {
            char[] cArr = this.f21828d;
            int i10 = this.f21829e;
            int i11 = this.f21834j;
            this.f21835k = new String(cArr, i10, i11);
            this.f21829e = i10 + i11;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                int iR = r();
                throw new IllegalStateException("Expected a long but was " + boi.a(iR) + t());
            }
            if (iS == 10) {
                strY = z();
            } else {
                strY = y(iS == 8 ? '\'' : TokenParser.DQUOTE);
            }
            this.f21835k = strY;
            try {
                long j9 = Long.parseLong(this.f21835k);
                this.f21825a = 0;
                int[] iArr2 = this.f21839o;
                int i12 = this.f21837m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j9;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21825a = 11;
        double d9 = Double.parseDouble(this.f21835k);
        long j10 = (long) d9;
        if (j10 == d9) {
            this.f21835k = null;
            this.f21825a = 0;
            int[] iArr3 = this.f21839o;
            int i13 = this.f21837m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f21835k + t());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21825a = 0;
        this.f21836l[0] = 8;
        this.f21837m = 1;
        this.f21826b.close();
    }

    public String e() {
        return x(false);
    }

    public String f() {
        return x(true);
    }

    public String g() throws IOException {
        char c9;
        String strY;
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strY = z();
        } else {
            if (iS == 12) {
                c9 = '\'';
            } else {
                if (iS != 13) {
                    int iR = r();
                    throw new IllegalStateException("Expected a name but was " + boi.a(iR) + t());
                }
                c9 = TokenParser.DQUOTE;
            }
            strY = y(c9);
        }
        this.f21825a = 0;
        this.f21838n[this.f21837m - 1] = strY;
        return strY;
    }

    public String h() throws IOException {
        String str;
        char c9;
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            str = z();
        } else {
            if (iS == 8) {
                c9 = '\'';
            } else if (iS == 9) {
                c9 = TokenParser.DQUOTE;
            } else if (iS == 11) {
                str = this.f21835k;
                this.f21835k = null;
            } else if (iS == 15) {
                str = Long.toString(this.f21833i);
            } else {
                if (iS != 16) {
                    int iR = r();
                    throw new IllegalStateException("Expected a string but was " + boi.a(iR) + t());
                }
                str = new String(this.f21828d, this.f21829e, this.f21834j);
                this.f21829e += this.f21834j;
            }
            str = y(c9);
        }
        this.f21825a = 0;
        int[] iArr = this.f21839o;
        int i9 = this.f21837m - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public void i() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 3) {
            B(1);
            this.f21839o[this.f21837m - 1] = 0;
            this.f21825a = 0;
        } else {
            int iR = r();
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + boi.a(iR) + t());
        }
    }

    public void j() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 1) {
            B(3);
            this.f21825a = 0;
            return;
        }
        int iR = r();
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + boi.a(iR) + t());
    }

    public void k() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 4) {
            int i9 = this.f21837m;
            this.f21837m = i9 - 1;
            int[] iArr = this.f21839o;
            int i10 = i9 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.f21825a = 0;
            return;
        }
        int iR = r();
        throw new IllegalStateException("Expected END_ARRAY but was " + boi.a(iR) + t());
    }

    public void l() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            int iR = r();
            throw new IllegalStateException("Expected END_OBJECT but was " + boi.a(iR) + t());
        }
        int i9 = this.f21837m;
        int i10 = i9 - 1;
        this.f21837m = i10;
        this.f21838n[i10] = null;
        int[] iArr = this.f21839o;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f21825a = 0;
    }

    public void m() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 7) {
            this.f21825a = 0;
            int[] iArr = this.f21839o;
            int i9 = this.f21837m - 1;
            iArr[i9] = iArr[i9] + 1;
            return;
        }
        int iR = r();
        throw new IllegalStateException("Expected null but was " + boi.a(iR) + t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x009a, code lost:
    
        A();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0094. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boh.o():void");
    }

    public boolean p() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 17) ? false : true;
    }

    public boolean q() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.f21825a = 0;
            int[] iArr = this.f21839o;
            int i9 = this.f21837m - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (iS == 6) {
            this.f21825a = 0;
            int[] iArr2 = this.f21839o;
            int i10 = this.f21837m - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        int iR = r();
        throw new IllegalStateException("Expected a boolean but was " + boi.a(iR) + t());
    }

    public int r() throws IOException {
        int iS = this.f21825a;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0212, code lost:
    
        if (F(r1) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0293 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boh.s():int");
    }

    public String t() {
        int i9 = this.f21831g;
        int i10 = this.f21829e;
        int i11 = this.f21832h;
        return " at line " + (i9 + 1) + " column " + ((i10 - i11) + 1) + " path " + e();
    }

    public String toString() {
        return getClass().getSimpleName().concat(String.valueOf(t()));
    }

    public final void u(boolean z9) {
        this.f21827c = z9;
    }

    public final boolean v() {
        return this.f21827c;
    }
}
