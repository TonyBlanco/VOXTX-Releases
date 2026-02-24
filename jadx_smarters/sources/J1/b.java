package J1;

import J1.e;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.TokenParser;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ByteString f2994n = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ByteString f2995o = ByteString.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ByteString f2996p = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ByteString f2997q = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f3000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f3001e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f3006j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f3008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f3009m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2998a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2999c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3002f = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3007k = 1;

    public b(BufferedSource bufferedSource) {
        int[] iArr = new int[32];
        this.f3006j = iArr;
        iArr[0] = 6;
        this.f3008l = new String[32];
        this.f3009m = new int[32];
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f3000d = bufferedSource;
        this.f3001e = bufferedSource.buffer();
    }

    public final void T(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f3000d.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw c0("Unterminated string");
            }
            if (this.f3001e.getByte(jIndexOfElement) != 92) {
                this.f3001e.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f3001e.skip(jIndexOfElement + 1);
                w();
            }
        }
    }

    public final boolean V(String str) throws EOFException {
        while (true) {
            if (!this.f3000d.request(str.length())) {
                return false;
            }
            for (int i9 = 0; i9 < str.length(); i9++) {
                if (this.f3001e.getByte(i9) != str.charAt(i9)) {
                    break;
                }
            }
            return true;
            this.f3001e.readByte();
        }
    }

    public final void Y() throws IOException {
        long jIndexOfElement = this.f3000d.indexOfElement(f2997q);
        Buffer buffer = this.f3001e;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    @Override // J1.e
    public void a() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 3) {
            v(1);
            this.f3009m[this.f3007k - 1] = 0;
            this.f3002f = 0;
        } else {
            throw new N1.a("Expected BEGIN_ARRAY but was " + k() + " at path " + getPath());
        }
    }

    public final void b0() throws IOException {
        long jIndexOfElement = this.f3000d.indexOfElement(f2996p);
        Buffer buffer = this.f3001e;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // J1.e
    public void c() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 1) {
            v(3);
            this.f3002f = 0;
            return;
        }
        throw new N1.a("Expected BEGIN_OBJECT but was " + k() + " at path " + getPath());
    }

    public final N1.b c0(String str) throws N1.b {
        throw new N1.b(str + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3002f = 0;
        this.f3006j[0] = 8;
        this.f3007k = 1;
        this.f3001e.clear();
        this.f3000d.close();
    }

    @Override // J1.e
    public void d() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            throw new N1.a("Expected END_ARRAY but was " + k() + " at path " + getPath());
        }
        int i9 = this.f3007k;
        this.f3007k = i9 - 1;
        int[] iArr = this.f3009m;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f3002f = 0;
    }

    @Override // J1.e
    public void e() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            throw new N1.a("Expected END_OBJECT but was " + k() + " at path " + getPath());
        }
        int i9 = this.f3007k;
        int i10 = i9 - 1;
        this.f3007k = i10;
        this.f3008l[i10] = null;
        int[] iArr = this.f3009m;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f3002f = 0;
    }

    @Override // J1.e
    public boolean g() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4) ? false : true;
    }

    public String getPath() {
        return f.a(this.f3007k, this.f3006j, this.f3008l, this.f3009m);
    }

    @Override // J1.e
    public boolean h() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.f3002f = 0;
            int[] iArr = this.f3009m;
            int i9 = this.f3007k - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (iN == 6) {
            this.f3002f = 0;
            int[] iArr2 = this.f3009m;
            int i10 = this.f3007k - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new N1.a("Expected a boolean but was " + k() + " at path " + getPath());
    }

    @Override // J1.e
    public String i() throws IOException {
        ByteString byteString;
        String strQ;
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strQ = r();
        } else {
            if (iN == 13) {
                byteString = f2995o;
            } else {
                if (iN != 12) {
                    throw new N1.a("Expected a name but was " + k() + " at path " + getPath());
                }
                byteString = f2994n;
            }
            strQ = q(byteString);
        }
        this.f3002f = 0;
        this.f3008l[this.f3007k - 1] = strQ;
        return strQ;
    }

    @Override // J1.e
    public String j() throws IOException {
        String utf8;
        ByteString byteString;
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            utf8 = r();
        } else {
            if (iN == 9) {
                byteString = f2995o;
            } else if (iN == 8) {
                byteString = f2994n;
            } else if (iN == 11) {
                utf8 = this.f3005i;
                this.f3005i = null;
            } else if (iN == 15) {
                utf8 = Long.toString(this.f3003g);
            } else {
                if (iN != 16) {
                    throw new N1.a("Expected a string but was " + k() + " at path " + getPath());
                }
                utf8 = this.f3001e.readUtf8(this.f3004h);
            }
            utf8 = q(byteString);
        }
        this.f3002f = 0;
        int[] iArr = this.f3009m;
        int i9 = this.f3007k - 1;
        iArr[i9] = iArr[i9] + 1;
        return utf8;
    }

    @Override // J1.e
    public e.a k() throws IOException {
        int iN = this.f3002f;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
            case 1:
                return e.a.BEGIN_OBJECT;
            case 2:
                return e.a.END_OBJECT;
            case 3:
                return e.a.BEGIN_ARRAY;
            case 4:
                return e.a.END_ARRAY;
            case 5:
            case 6:
                return e.a.BOOLEAN;
            case 7:
                return e.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return e.a.STRING;
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return e.a.NAME;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case 16:
                return e.a.NUMBER;
            case LangUtils.HASH_SEED /* 17 */:
                return e.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // J1.e
    public void l() throws IOException {
        ByteString byteString;
        if (this.f2999c) {
            throw new N1.a("Cannot skip unexpected " + k() + " at " + getPath());
        }
        int i9 = 0;
        do {
            int iN = this.f3002f;
            if (iN == 0) {
                iN = n();
            }
            if (iN == 3) {
                v(1);
            } else if (iN == 1) {
                v(3);
            } else {
                if (iN == 4 || iN == 2) {
                    this.f3007k--;
                    i9--;
                } else if (iN == 14 || iN == 10) {
                    b0();
                } else {
                    if (iN == 9 || iN == 13) {
                        byteString = f2995o;
                    } else if (iN == 8 || iN == 12) {
                        byteString = f2994n;
                    } else if (iN == 16) {
                        this.f3001e.skip(this.f3004h);
                    }
                    T(byteString);
                }
                this.f3002f = 0;
            }
            i9++;
            this.f3002f = 0;
        } while (i9 != 0);
        int[] iArr = this.f3009m;
        int i10 = this.f3007k;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f3008l[i10 - 1] = Constants.NULL_VERSION_ID;
    }

    public final void m() throws N1.b {
        if (!this.f2998a) {
            throw c0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.b.n():int");
    }

    public final boolean o(int i9) throws N1.b {
        if (i9 == 9 || i9 == 10 || i9 == 12 || i9 == 13 || i9 == 32) {
            return false;
        }
        if (i9 != 35) {
            if (i9 == 44) {
                return false;
            }
            if (i9 != 47 && i9 != 61) {
                if (i9 == 123 || i9 == 125 || i9 == 58) {
                    return false;
                }
                if (i9 != 59) {
                    switch (i9) {
                        case 91:
                        case 93:
                            return false;
                        case ModuleDescriptor.MODULE_VERSION /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f3001e.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f3000d.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        m();
        r3 = r6.f3001e.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f3001e.readByte();
        r6.f3001e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r6.f3001e.readByte();
        r6.f3001e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (V("*\/") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r6.f3001e.readByte();
        r6.f3001e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        throw c0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r2 != 35) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.f3000d
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L8a
            okio.Buffer r2 = r6.f3001e
            long r4 = (long) r1
            byte r2 = r2.getByte(r4)
            r4 = 10
            if (r2 == r4) goto L87
            r4 = 32
            if (r2 == r4) goto L87
            r4 = 13
            if (r2 == r4) goto L87
            r4 = 9
            if (r2 != r4) goto L25
            goto L87
        L25:
            okio.Buffer r3 = r6.f3001e
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L7e
            okio.BufferedSource r3 = r6.f3000d
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.m()
            okio.Buffer r3 = r6.f3001e
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
        L56:
            r6.Y()
            goto L1
        L5a:
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r6.V(r1)
            if (r1 == 0) goto L77
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
            okio.Buffer r1 = r6.f3001e
            r1.readByte()
            goto L1
        L77:
            java.lang.String r7 = "Unterminated comment"
            N1.b r7 = r6.c0(r7)
            throw r7
        L7e:
            r1 = 35
            if (r2 != r1) goto L86
            r6.m()
            goto L56
        L86:
            return r2
        L87:
            r1 = r3
            goto L2
        L8a:
            if (r7 != 0) goto L8e
            r7 = -1
            return r7
        L8e:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.b.p(boolean):int");
    }

    public final String q(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.f3000d.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw c0("Unterminated string");
            }
            if (this.f3001e.getByte(jIndexOfElement) != 92) {
                String utf8 = this.f3001e.readUtf8(jIndexOfElement);
                if (sb == null) {
                    this.f3001e.readByte();
                    return utf8;
                }
                sb.append(utf8);
                this.f3001e.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f3001e.readUtf8(jIndexOfElement));
            this.f3001e.readByte();
            sb.append(w());
        }
    }

    public final String r() throws IOException {
        long jIndexOfElement = this.f3000d.indexOfElement(f2996p);
        return jIndexOfElement != -1 ? this.f3001e.readUtf8(jIndexOfElement) : this.f3001e.readUtf8();
    }

    public final int s() throws EOFException {
        String str;
        String str2;
        int i9;
        byte b9 = this.f3001e.getByte(0L);
        if (b9 == 116 || b9 == 84) {
            str = "true";
            str2 = "TRUE";
            i9 = 5;
        } else if (b9 == 102 || b9 == 70) {
            str = "false";
            str2 = "FALSE";
            i9 = 6;
        } else {
            if (b9 != 110 && b9 != 78) {
                return 0;
            }
            str = Constants.NULL_VERSION_ID;
            str2 = "NULL";
            i9 = 7;
        }
        int length = str.length();
        int i10 = 1;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (!this.f3000d.request(i11)) {
                return 0;
            }
            byte b10 = this.f3001e.getByte(i10);
            if (b10 != str.charAt(i10) && b10 != str2.charAt(i10)) {
                return 0;
            }
            i10 = i11;
        }
        if (this.f3000d.request(length + 1) && o(this.f3001e.getByte(length))) {
            return 0;
        }
        this.f3001e.skip(length);
        this.f3002f = i9;
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (o(r11) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r10 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        r16.f3003g = r8;
        r16.f3001e.skip(r5);
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        r16.f3002f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009f, code lost:
    
        if (r6 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a2, code lost:
    
        if (r6 == 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r6 != 7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a8, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        r16.f3004h = r5;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.b.t():int");
    }

    public String toString() {
        return "JsonReader(" + this.f3000d + ")";
    }

    public final void v(int i9) {
        int i10 = this.f3007k;
        int[] iArr = this.f3006j;
        if (i10 != iArr.length) {
            this.f3007k = i10 + 1;
            iArr[i10] = i9;
        } else {
            throw new N1.a("Nesting too deep at " + getPath());
        }
    }

    public final char w() throws N1.b, EOFException {
        int i9;
        if (!this.f3000d.request(1L)) {
            throw c0("Unterminated escape sequence");
        }
        byte b9 = this.f3001e.readByte();
        if (b9 == 10 || b9 == 34 || b9 == 39 || b9 == 47 || b9 == 92) {
            return (char) b9;
        }
        if (b9 == 98) {
            return '\b';
        }
        if (b9 == 102) {
            return '\f';
        }
        if (b9 == 110) {
            return '\n';
        }
        if (b9 == 114) {
            return TokenParser.CR;
        }
        if (b9 == 116) {
            return '\t';
        }
        if (b9 != 117) {
            if (this.f2998a) {
                return (char) b9;
            }
            throw c0("Invalid escape sequence: \\" + ((char) b9));
        }
        if (!this.f3000d.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte b10 = this.f3001e.getByte(i10);
            char c10 = (char) (c9 << 4);
            if (b10 >= 48 && b10 <= 57) {
                i9 = b10 - 48;
            } else if (b10 >= 97 && b10 <= 102) {
                i9 = b10 - 87;
            } else {
                if (b10 < 65 || b10 > 70) {
                    throw c0("\\u" + this.f3001e.readUtf8(4L));
                }
                i9 = b10 - 55;
            }
            c9 = (char) (c10 + i9);
        }
        this.f3001e.skip(4L);
        return c9;
    }
}
