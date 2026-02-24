package com.squareup.okhttp.internal.tls;

import javax.security.auth.x500.X500Principal;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    public DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r2 = r8.beg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return new java.lang.String(r1, r2, r8.end - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String escapedAV() {
        /*
            r8 = this;
            int r0 = r8.pos
            r8.beg = r0
            r8.end = r0
        L6:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L58
            if (r2 == r5) goto L4d
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L4d
            if (r2 == r3) goto L4d
            int r3 = r8.end
            int r4 = r3 + 1
            r8.end = r4
            r1[r3] = r2
        L39:
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L3e:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.pos
            goto L39
        L4d:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L58:
            int r2 = r8.end
            r8.cur = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L66:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L7f
            char[] r2 = r8.chars
            char r7 = r2[r0]
            if (r7 != r6) goto L7f
            int r1 = r8.end
            int r7 = r1 + 1
            r8.end = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L66
        L7f:
            if (r0 == r1) goto L8b
            char[] r1 = r8.chars
            char r0 = r1[r0]
            if (r0 == r3) goto L8b
            if (r0 == r4) goto L8b
            if (r0 != r5) goto L6
        L8b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.cur
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private int getByte(int i9) {
        int i10;
        int i11;
        int i12 = i9 + 1;
        if (i12 >= this.length) {
            throw new IllegalStateException("Malformed DN: " + this.dn);
        }
        char[] cArr = this.chars;
        char c9 = cArr[i9];
        if (c9 >= '0' && c9 <= '9') {
            i10 = c9 - '0';
        } else if (c9 >= 'a' && c9 <= 'f') {
            i10 = c9 - 'W';
        } else {
            if (c9 < 'A' || c9 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i10 = c9 - '7';
        }
        char c10 = cArr[i12];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i11 = c10 - '7';
        }
        return (i10 << 4) + i11;
    }

    private char getEscaped() {
        int i9 = this.pos + 1;
        this.pos = i9;
        if (i9 == this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        char c9 = this.chars[i9];
        if (c9 == ' ' || c9 == '%' || c9 == '\\' || c9 == '_' || c9 == '\"' || c9 == '#') {
            return c9;
        }
        switch (c9) {
            case '*':
            case '+':
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                return c9;
            default:
                switch (c9) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c9;
                    default:
                        return getUTF8();
                }
        }
    }

    private char getUTF8() {
        int i9;
        int i10;
        int i11 = getByte(this.pos);
        this.pos++;
        if (i11 < 128) {
            return (char) i11;
        }
        if (i11 < 192 || i11 > 247) {
            return '?';
        }
        if (i11 <= 223) {
            i9 = i11 & 31;
            i10 = 1;
        } else if (i11 <= 239) {
            i9 = i11 & 15;
            i10 = 2;
        } else {
            i9 = i11 & 7;
            i10 = 3;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.pos;
            int i14 = i13 + 1;
            this.pos = i14;
            if (i14 == this.length || this.chars[i14] != '\\') {
                return '?';
            }
            int i15 = i13 + 2;
            this.pos = i15;
            int i16 = getByte(i15);
            this.pos++;
            if ((i16 & 192) != 128) {
                return '?';
            }
            i9 = (i9 << 6) + (i16 & 63);
        }
        return (char) i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        r6.end = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String hexAV() {
        /*
            r6 = this;
            int r0 = r6.pos
            int r1 = r0 + 4
            int r2 = r6.length
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L90
            r6.beg = r0
        Lc:
            int r0 = r0 + 1
            r6.pos = r0
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 == r1) goto L4c
            char[] r1 = r6.chars
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L4c
            r4 = 44
            if (r2 == r4) goto L4c
            r4 = 59
            if (r2 != r4) goto L27
            goto L4c
        L27:
            r4 = 32
            if (r2 != r4) goto L3e
            r6.end = r0
        L2d:
            int r0 = r0 + 1
            r6.pos = r0
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 >= r1) goto L4e
            char[] r1 = r6.chars
            char r1 = r1[r0]
            if (r1 != r4) goto L4e
            goto L2d
        L3e:
            r4 = 65
            if (r2 < r4) goto Lc
            r4 = 70
            if (r2 > r4) goto Lc
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
            goto Lc
        L4c:
            r6.end = r0
        L4e:
            int r0 = r6.end
            int r1 = r6.beg
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L79
            r2 = r0 & 1
            if (r2 == 0) goto L79
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L61:
            if (r4 >= r2) goto L6f
            int r5 = r6.getByte(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L61
        L6f:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.chars
            int r3 = r6.beg
            r1.<init>(r2, r3, r0)
            return r1
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.dn
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.dn
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.tls.DistinguishedNameParser.hexAV():java.lang.String");
    }

    private String nextAT() {
        int i9;
        int i10;
        int i11;
        char c9;
        int i12;
        int i13;
        char c10;
        char c11;
        while (true) {
            i9 = this.pos;
            i10 = this.length;
            if (i9 >= i10 || this.chars[i9] != ' ') {
                break;
            }
            this.pos = i9 + 1;
        }
        if (i9 == i10) {
            return null;
        }
        this.beg = i9;
        do {
            this.pos = i9 + 1;
            i9 = this.pos;
            i11 = this.length;
            if (i9 >= i11 || (c11 = this.chars[i9]) == '=') {
                break;
            }
        } while (c11 != ' ');
        if (i9 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        this.end = i9;
        if (this.chars[i9] == ' ') {
            while (true) {
                i12 = this.pos;
                i13 = this.length;
                if (i12 >= i13 || (c10 = this.chars[i12]) == '=' || c10 != ' ') {
                    break;
                }
                this.pos = i12 + 1;
            }
            if (this.chars[i12] != '=' || i12 == i13) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
        int i14 = this.pos;
        do {
            this.pos = i14 + 1;
            i14 = this.pos;
            if (i14 >= this.length) {
                break;
            }
        } while (this.chars[i14] == ' ');
        int i15 = this.end;
        int i16 = this.beg;
        if (i15 - i16 > 4) {
            char[] cArr = this.chars;
            if (cArr[i16 + 3] == '.' && (((c9 = cArr[i16]) == 'O' || c9 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.beg = i16 + 4;
            }
        }
        char[] cArr2 = this.chars;
        int i17 = this.beg;
        return new String(cArr2, i17, i15 - i17);
    }

    private String quotedAV() {
        int i9 = this.pos + 1;
        this.pos = i9;
        this.beg = i9;
        while (true) {
            this.end = i9;
            int i10 = this.pos;
            if (i10 == this.length) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
            char[] cArr = this.chars;
            char c9 = cArr[i10];
            if (c9 == '\"') {
                do {
                    this.pos = i10 + 1;
                    i10 = this.pos;
                    if (i10 >= this.length) {
                        break;
                    }
                } while (this.chars[i10] == ' ');
                char[] cArr2 = this.chars;
                int i11 = this.beg;
                return new String(cArr2, i11, this.end - i11);
            }
            if (c9 == '\\') {
                cArr[this.end] = getEscaped();
            } else {
                cArr[this.end] = c9;
            }
            this.pos++;
            i9 = this.end + 1;
        }
    }

    public String findMostSpecific(String str) {
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String strNextAT = nextAT();
        if (strNextAT == null) {
            return null;
        }
        do {
            int i9 = this.pos;
            if (i9 == this.length) {
                return null;
            }
            char c9 = this.chars[i9];
            String strEscapedAV = c9 != '\"' ? c9 != '#' ? (c9 == '+' || c9 == ',' || c9 == ';') ? "" : escapedAV() : hexAV() : quotedAV();
            if (str.equalsIgnoreCase(strNextAT)) {
                return strEscapedAV;
            }
            int i10 = this.pos;
            if (i10 >= this.length) {
                return null;
            }
            char c10 = this.chars[i10];
            if (c10 != ',' && c10 != ';' && c10 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            this.pos = i10 + 1;
            strNextAT = nextAT();
        } while (strNextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}
