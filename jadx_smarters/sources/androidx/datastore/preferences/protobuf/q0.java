package androidx.datastore.preferences.protobuf;

import okio.Utf8;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14748a;

    public static class a {
        public static void h(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i9) throws C1140z {
            if (m(b10) || (((b9 << 28) + (b10 + 112)) >> 30) != 0 || m(b11) || m(b12)) {
                throw C1140z.c();
            }
            int iR = ((b9 & 7) << 18) | (r(b10) << 12) | (r(b11) << 6) | r(b12);
            cArr[i9] = l(iR);
            cArr[i9 + 1] = q(iR);
        }

        public static void i(byte b9, char[] cArr, int i9) {
            cArr[i9] = (char) b9;
        }

        public static void j(byte b9, byte b10, byte b11, char[] cArr, int i9) throws C1140z {
            if (m(b10) || ((b9 == -32 && b10 < -96) || ((b9 == -19 && b10 >= -96) || m(b11)))) {
                throw C1140z.c();
            }
            cArr[i9] = (char) (((b9 & 15) << 12) | (r(b10) << 6) | r(b11));
        }

        public static void k(byte b9, byte b10, char[] cArr, int i9) throws C1140z {
            if (b9 < -62 || m(b10)) {
                throw C1140z.c();
            }
            cArr[i9] = (char) (((b9 & 31) << 6) | r(b10));
        }

        public static char l(int i9) {
            return (char) ((i9 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        }

        public static boolean m(byte b9) {
            return b9 > -65;
        }

        public static boolean n(byte b9) {
            return b9 >= 0;
        }

        public static boolean o(byte b9) {
            return b9 < -16;
        }

        public static boolean p(byte b9) {
            return b9 < -32;
        }

        public static char q(int i9) {
            return (char) ((i9 & 1023) + Utf8.LOG_SURROGATE_HEADER);
        }

        public static int r(byte b9) {
            return b9 & Utf8.REPLACEMENT_BYTE;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i9, int i10);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i9, int i10);

        public final boolean c(byte[] bArr, int i9, int i10) {
            return d(0, bArr, i9, i10) == 0;
        }

        public abstract int d(int i9, byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        public static int e(byte[] bArr, int i9, int i10) {
            while (i9 < i10 && bArr[i9] >= 0) {
                i9++;
            }
            if (i9 >= i10) {
                return 0;
            }
            return f(bArr, i9, i10);
        }

        public static int f(byte[] bArr, int i9, int i10) {
            while (i9 < i10) {
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 < 0) {
                    if (b9 < -32) {
                        if (i11 >= i10) {
                            return b9;
                        }
                        if (b9 >= -62) {
                            i9 += 2;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b9 >= -16) {
                        if (i11 >= i10 - 2) {
                            return q0.l(bArr, i11, i10);
                        }
                        int i12 = i9 + 2;
                        byte b10 = bArr[i11];
                        if (b10 <= -65 && (((b9 << 28) + (b10 + 112)) >> 30) == 0) {
                            int i13 = i9 + 3;
                            if (bArr[i12] <= -65) {
                                i9 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 1) {
                        return q0.l(bArr, i11, i10);
                    }
                    int i14 = i9 + 2;
                    byte b11 = bArr[i11];
                    if (b11 <= -65 && ((b9 != -32 || b11 >= -96) && (b9 != -19 || b11 < -96))) {
                        i9 += 3;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                i9 = i11;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public String a(byte[] bArr, int i9, int i10) throws C1140z {
            if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b9 = bArr[i9];
                if (!a.n(b9)) {
                    break;
                }
                i9++;
                a.i(b9, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte b10 = bArr[i9];
                if (a.n(b10)) {
                    int i15 = i13 + 1;
                    a.i(b10, cArr, i13);
                    while (i14 < i11) {
                        byte b11 = bArr[i14];
                        if (!a.n(b11)) {
                            break;
                        }
                        i14++;
                        a.i(b11, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i9 = i14;
                } else if (a.p(b10)) {
                    if (i14 >= i11) {
                        throw C1140z.c();
                    }
                    i9 += 2;
                    a.k(b10, bArr[i14], cArr, i13);
                    i13++;
                } else if (a.o(b10)) {
                    if (i14 >= i11 - 1) {
                        throw C1140z.c();
                    }
                    int i16 = i9 + 2;
                    i9 += 3;
                    a.j(b10, bArr[i14], bArr[i16], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw C1140z.c();
                    }
                    byte b12 = bArr[i14];
                    int i17 = i9 + 3;
                    byte b13 = bArr[i9 + 2];
                    i9 += 4;
                    a.h(b10, b12, b13, bArr[i17], cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public int b(CharSequence charSequence, byte[] bArr, int i9, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int length = charSequence.length();
            int i13 = i10 + i9;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i9) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
                bArr[i12] = (byte) cCharAt;
                i14++;
            }
            if (i14 == length) {
                return i9 + length;
            }
            int i15 = i9 + i14;
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && i15 < i13) {
                    bArr[i15] = (byte) cCharAt2;
                    i15++;
                } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                    i15 += 2;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                        if (i15 > i13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i18 = i15 + 3;
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        throw new d(i14 - 1, length);
                    }
                    bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i19 = i15 + 2;
                    bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i15 += 3;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                }
                i14++;
            }
            return i15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.q0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.c.d(int, byte[], int, int):int");
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i9, int i10) {
            super("Unpaired surrogate at index " + i9 + " of " + i10);
        }
    }

    public static final class e extends b {
        public static boolean e() {
            return p0.C() && p0.D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.p0.s(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.p0.s(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.s(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.p0.s(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.s(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.s(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.p0.s(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.f(byte[], long, int):int");
        }

        public static int g(byte[] bArr, long j9, int i9) {
            int i10 = 0;
            if (i9 < 16) {
                return 0;
            }
            while (i10 < i9) {
                long j10 = 1 + j9;
                if (p0.s(bArr, j9) < 0) {
                    return i10;
                }
                i10++;
                j9 = j10;
            }
            return i9;
        }

        public static int h(byte[] bArr, int i9, long j9, int i10) {
            if (i10 == 0) {
                return q0.i(i9);
            }
            if (i10 == 1) {
                return q0.j(i9, p0.s(bArr, j9));
            }
            if (i10 == 2) {
                return q0.k(i9, p0.s(bArr, j9), p0.s(bArr, j9 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public String a(byte[] bArr, int i9, int i10) throws C1140z {
            if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte bS = p0.s(bArr, i9);
                if (!a.n(bS)) {
                    break;
                }
                i9++;
                a.i(bS, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte bS2 = p0.s(bArr, i9);
                if (a.n(bS2)) {
                    int i15 = i13 + 1;
                    a.i(bS2, cArr, i13);
                    while (i14 < i11) {
                        byte bS3 = p0.s(bArr, i14);
                        if (!a.n(bS3)) {
                            break;
                        }
                        i14++;
                        a.i(bS3, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i9 = i14;
                } else if (a.p(bS2)) {
                    if (i14 >= i11) {
                        throw C1140z.c();
                    }
                    i9 += 2;
                    a.k(bS2, p0.s(bArr, i14), cArr, i13);
                    i13++;
                } else if (a.o(bS2)) {
                    if (i14 >= i11 - 1) {
                        throw C1140z.c();
                    }
                    int i16 = i9 + 2;
                    i9 += 3;
                    a.j(bS2, p0.s(bArr, i14), p0.s(bArr, i16), cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw C1140z.c();
                    }
                    byte bS4 = p0.s(bArr, i14);
                    int i17 = i9 + 3;
                    byte bS5 = p0.s(bArr, i9 + 2);
                    i9 += 4;
                    a.h(bS2, bS4, bS5, p0.s(bArr, i17), cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public int b(CharSequence charSequence, byte[] bArr, int i9, int i10) {
            long j9;
            String str;
            String str2;
            int i11;
            long j10;
            long j11;
            char cCharAt;
            long j12 = i9;
            long j13 = ((long) i10) + j12;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i10 || bArr.length - i10 < i9) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i9 + i10));
            }
            int i12 = 0;
            while (true) {
                j9 = 1;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                p0.H(bArr, j12, (byte) cCharAt);
                i12++;
                j12 = 1 + j12;
            }
            if (i12 == length) {
                return (int) j12;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 >= 128 || j12 >= j13) {
                    if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                            if (j12 > j13 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                    throw new d(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j12);
                            }
                            int i13 = i12 + 1;
                            if (i13 != length) {
                                char cCharAt3 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j10 = 1;
                                    p0.H(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                    j11 = j13;
                                    p0.H(bArr, j12 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = j12 + 3;
                                    p0.H(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j12 += 4;
                                    p0.H(bArr, j14, (byte) ((codePoint & 63) | 128));
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            throw new d(i12 - 1, length);
                        }
                        p0.H(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j15 = j12 + 2;
                        p0.H(bArr, j12 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j12 += 3;
                        p0.H(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j16 = j12 + j9;
                        p0.H(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                        j12 += 2;
                        p0.H(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j11 = j13;
                    j10 = 1;
                } else {
                    p0.H(bArr, j12, (byte) cCharAt2);
                    j11 = j13;
                    str2 = str4;
                    j10 = j9;
                    j12 += j9;
                    str = str3;
                }
                i12++;
                str3 = str;
                str4 = str2;
                j9 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.s(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.s(r13, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f14748a = (!e.e() || AbstractC1119d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i9, int i10) {
        return f14748a.a(bArr, i9, i10);
    }

    public static int f(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        return f14748a.b(charSequence, bArr, i9, i10);
    }

    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int iH = length;
        while (true) {
            if (i9 < length) {
                char cCharAt = charSequence.charAt(i9);
                if (cCharAt >= 2048) {
                    iH += h(charSequence, i9);
                    break;
                }
                iH += (127 - cCharAt) >>> 31;
                i9++;
            } else {
                break;
            }
        }
        if (iH >= length) {
            return iH;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static int h(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        int i10 = 0;
        while (i9 < length) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i9) < 65536) {
                        throw new d(i9, length);
                    }
                    i9++;
                }
            }
            i9++;
        }
        return i10;
    }

    public static int i(int i9) {
        if (i9 > -12) {
            return -1;
        }
        return i9;
    }

    public static int j(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    public static int k(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static int l(byte[] bArr, int i9, int i10) {
        byte b9 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            return i(b9);
        }
        if (i11 == 1) {
            return j(b9, bArr[i9]);
        }
        if (i11 == 2) {
            return k(b9, bArr[i9], bArr[i9 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f14748a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i9, int i10) {
        return f14748a.c(bArr, i9, i10);
    }
}
