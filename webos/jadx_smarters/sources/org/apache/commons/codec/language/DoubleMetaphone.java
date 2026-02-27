package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.StringUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class DoubleMetaphone implements StringEncoder {
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen = 4;
    private static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", "R", "N", "M", "B", "H", "F", "V", "W", " "};
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] L_T_K_S_N_M_B_Z = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;

        public DoubleMetaphoneResult(int i9) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i9;
        }

        public void append(char c9) {
            appendPrimary(c9);
            appendAlternate(c9);
        }

        public void append(char c9, char c10) {
            appendPrimary(c9);
            appendAlternate(c10);
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendAlternate(char c9) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c9);
            }
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append(str.substring(0, length));
            }
        }

        public void appendPrimary(char c9) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c9);
            }
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append(str.substring(0, length));
            }
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }
    }

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    private boolean conditionC0(String str, int i9) {
        if (contains(str, i9, 4, "CHIA")) {
            return true;
        }
        if (i9 <= 1) {
            return false;
        }
        int i10 = i9 - 2;
        if (isVowel(charAt(str, i10)) || !contains(str, i9 - 1, 3, "ACH")) {
            return false;
        }
        char cCharAt = charAt(str, i9 + 2);
        return !(cCharAt == 'I' || cCharAt == 'E') || contains(str, i10, 6, "BACHER", "MACHER");
    }

    private boolean conditionCH0(String str, int i9) {
        if (i9 != 0) {
            return false;
        }
        int i10 = i9 + 1;
        return (contains(str, i10, 5, "HARAC", "HARIS") || contains(str, i10, 3, "HOR", "HYM", "HIA", "HEM")) && !contains(str, 0, 5, "CHORE");
    }

    private boolean conditionCH1(String str, int i9) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i9 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i10 = i9 + 2;
            if (!contains(str, i10, 1, "T", "S")) {
                if (!contains(str, i9 - 1, 1, "A", "O", "U", "E") && i9 != 0) {
                    return false;
                }
                if (!contains(str, i10, 1, L_R_N_M_B_H_F_V_W_SPACE) && i9 + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean conditionL0(String str, int i9) {
        if (i9 == str.length() - 3 && contains(str, i9 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, "A", "O")) && contains(str, i9 - 1, 4, "ALLE");
    }

    private boolean conditionM0(String str, int i9) {
        int i10 = i9 + 1;
        if (charAt(str, i10) == 'M') {
            return true;
        }
        return contains(str, i9 + (-1), 3, "UMB") && (i10 == str.length() - 1 || contains(str, i9 + 2, 2, "ER"));
    }

    public static boolean contains(String str, int i9, int i10, String... strArr) {
        int i11;
        if (i9 < 0 || (i11 = i10 + i9) > str.length()) {
            return false;
        }
        String strSubstring = str.substring(i9, i11);
        for (String str2 : strArr) {
            if (strSubstring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if (i9 == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i9 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleC(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        int i10 = i9 + 2;
        if (!contains(str, i10, 1, "I", "E", "H") || contains(str, i10, 2, "HU")) {
            doubleMetaphoneResult.append('K');
            return i10;
        }
        if ((i9 == 1 && charAt(str, i9 - 1) == 'A') || contains(str, i9 - 1, 5, "UCCEE", "UCCES")) {
            doubleMetaphoneResult.append("KS");
        } else {
            doubleMetaphoneResult.append('X');
        }
        return i9 + 3;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if (i9 > 0 && contains(str, i9, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else {
            if (!conditionCH0(str, i9) && !conditionCH1(str, i9)) {
                if (i9 <= 0) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
                return i9 + 2;
            }
            doubleMetaphoneResult.append('K');
        }
        return i9 + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if (!contains(str, i9, 2, "DG")) {
            boolean zContains = contains(str, i9, 2, "DT", "DD");
            doubleMetaphoneResult.append('T');
            return zContains ? i9 + 2 : i9 + 1;
        }
        int i10 = i9 + 2;
        if (contains(str, i10, 1, "I", "E", "Y")) {
            doubleMetaphoneResult.append('J');
            return i9 + 3;
        }
        doubleMetaphoneResult.append("TK");
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleG(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleGH(java.lang.String r11, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r12, int r13) {
        /*
            r10 = this;
            r0 = 75
            r1 = 2
            if (r13 <= 0) goto L17
            int r2 = r13 + (-1)
            char r2 = r10.charAt(r11, r2)
            boolean r2 = r10.isVowel(r2)
            if (r2 != 0) goto L17
        L11:
            r12.append(r0)
        L14:
            int r13 = r13 + r1
            goto L94
        L17:
            r2 = 73
            if (r13 != 0) goto L2d
            int r13 = r13 + r1
            char r11 = r10.charAt(r11, r13)
            if (r11 != r2) goto L29
            r11 = 74
            r12.append(r11)
            goto L94
        L29:
            r12.append(r0)
            goto L94
        L2d:
            java.lang.String r3 = "D"
            java.lang.String r4 = "H"
            java.lang.String r5 = "B"
            r6 = 1
            if (r13 <= r6) goto L42
            int r7 = r13 + (-2)
            java.lang.String[] r8 = new java.lang.String[]{r5, r4, r3}
            boolean r7 = contains(r11, r7, r6, r8)
            if (r7 != 0) goto L14
        L42:
            if (r13 <= r1) goto L50
            int r7 = r13 + (-3)
            java.lang.String[] r3 = new java.lang.String[]{r5, r4, r3}
            boolean r3 = contains(r11, r7, r6, r3)
            if (r3 != 0) goto L14
        L50:
            r3 = 3
            if (r13 <= r3) goto L60
            int r3 = r13 + (-4)
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            boolean r3 = contains(r11, r3, r6, r4)
            if (r3 == 0) goto L60
            goto L14
        L60:
            if (r13 <= r1) goto L88
            int r3 = r13 + (-1)
            char r3 = r10.charAt(r11, r3)
            r4 = 85
            if (r3 != r4) goto L88
            int r3 = r13 + (-3)
            java.lang.String r4 = "R"
            java.lang.String r5 = "T"
            java.lang.String r7 = "C"
            java.lang.String r8 = "G"
            java.lang.String r9 = "L"
            java.lang.String[] r4 = new java.lang.String[]{r7, r8, r9, r4, r5}
            boolean r3 = contains(r11, r3, r6, r4)
            if (r3 == 0) goto L88
            r11 = 70
            r12.append(r11)
            goto L14
        L88:
            if (r13 <= 0) goto L14
            int r3 = r13 + (-1)
            char r11 = r10.charAt(r11, r3)
            if (r11 == r2) goto L14
            goto L11
        L94:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if ((i9 != 0 && !isVowel(charAt(str, i9 - 1))) || !isVowel(charAt(str, i9 + 1))) {
            return i9 + 1;
        }
        doubleMetaphoneResult.append('H');
        return i9 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleJ(java.lang.String r10, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r11, int r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "JOSE"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r2 = 4
            boolean r1 = contains(r10, r12, r2, r1)
            r3 = 32
            java.lang.String r4 = "SAN "
            r5 = 0
            r6 = 72
            r7 = 74
            r8 = 1
            if (r1 != 0) goto L89
            java.lang.String[] r1 = new java.lang.String[]{r4}
            boolean r1 = contains(r10, r5, r2, r1)
            if (r1 == 0) goto L22
            goto L89
        L22:
            r1 = 65
            if (r12 != 0) goto L34
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = contains(r10, r12, r2, r0)
            if (r0 != 0) goto L34
            r11.append(r7, r1)
            goto L7e
        L34:
            int r0 = r12 + (-1)
            char r2 = r9.charAt(r10, r0)
            boolean r2 = r9.isVowel(r2)
            if (r2 == 0) goto L56
            if (r13 != 0) goto L56
            int r13 = r12 + 1
            char r2 = r9.charAt(r10, r13)
            if (r2 == r1) goto L52
            char r13 = r9.charAt(r10, r13)
            r1 = 79
            if (r13 != r1) goto L56
        L52:
            r11.append(r7, r6)
            goto L7e
        L56:
            int r13 = r10.length()
            int r13 = r13 - r8
            if (r12 != r13) goto L61
            r11.append(r7, r3)
            goto L7e
        L61:
            int r13 = r12 + 1
            java.lang.String[] r1 = org.apache.commons.codec.language.DoubleMetaphone.L_T_K_S_N_M_B_Z
            boolean r13 = contains(r10, r13, r8, r1)
            if (r13 != 0) goto L7e
            java.lang.String r13 = "K"
            java.lang.String r1 = "L"
            java.lang.String r2 = "S"
            java.lang.String[] r13 = new java.lang.String[]{r2, r13, r1}
            boolean r13 = contains(r10, r0, r8, r13)
            if (r13 != 0) goto L7e
            r11.append(r7)
        L7e:
            int r11 = r12 + 1
            char r10 = r9.charAt(r10, r11)
            if (r10 != r7) goto Lad
            int r11 = r12 + 2
            goto Lad
        L89:
            if (r12 != 0) goto L93
            int r13 = r12 + 4
            char r13 = r9.charAt(r10, r13)
            if (r13 == r3) goto La8
        L93:
            int r13 = r10.length()
            if (r13 == r2) goto La8
            java.lang.String[] r13 = new java.lang.String[]{r4}
            boolean r10 = contains(r10, r5, r2, r13)
            if (r10 == 0) goto La4
            goto La8
        La4:
            r11.append(r7, r6)
            goto Lab
        La8:
            r11.append(r6)
        Lab:
            int r11 = r12 + 1
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        int i10 = i9 + 1;
        if (charAt(str, i10) != 'L') {
            doubleMetaphoneResult.append('L');
            return i10;
        }
        if (conditionL0(str, i9)) {
            doubleMetaphoneResult.appendPrimary('L');
        } else {
            doubleMetaphoneResult.append('L');
        }
        return i9 + 2;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        int i10 = i9 + 1;
        if (charAt(str, i10) == 'H') {
            doubleMetaphoneResult.append('F');
            return i9 + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i10, 1, "P", "B")) {
            i10 = i9 + 2;
        }
        return i10;
    }

    private int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9, boolean z9) {
        if (i9 != str.length() - 1 || z9 || !contains(str, i9 - 2, 2, "IE") || contains(str, i9 - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.append('R');
        } else {
            doubleMetaphoneResult.appendAlternate('R');
        }
        int i10 = i9 + 1;
        return charAt(str, i10) == 'R' ? i9 + 2 : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleS(java.lang.String r10, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r11, int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleSC(java.lang.String r13, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r14, int r15) {
        /*
            r12 = this;
            int r0 = r15 + 2
            char r1 = r12.charAt(r13, r0)
            r2 = 72
            r3 = 83
            java.lang.String r4 = "SK"
            r5 = 3
            if (r1 != r2) goto L5e
            int r0 = r15 + 3
            java.lang.String r10 = "ED"
            java.lang.String r11 = "EM"
            java.lang.String r6 = "OO"
            java.lang.String r7 = "ER"
            java.lang.String r8 = "EN"
            java.lang.String r9 = "UY"
            java.lang.String[] r1 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
            r2 = 2
            boolean r1 = contains(r13, r0, r2, r1)
            if (r1 == 0) goto L40
            java.lang.String r1 = "ER"
            java.lang.String r3 = "EN"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            boolean r13 = contains(r13, r0, r2, r1)
            if (r13 == 0) goto L3c
            java.lang.String r13 = "X"
            r14.append(r13, r4)
            goto L72
        L3c:
            r14.append(r4)
            goto L72
        L40:
            r0 = 88
            if (r15 != 0) goto L5a
            char r1 = r12.charAt(r13, r5)
            boolean r1 = r12.isVowel(r1)
            if (r1 != 0) goto L5a
            char r13 = r12.charAt(r13, r5)
            r1 = 87
            if (r13 == r1) goto L5a
            r14.append(r0, r3)
            goto L72
        L5a:
            r14.append(r0)
            goto L72
        L5e:
            java.lang.String r1 = "E"
            java.lang.String r2 = "Y"
            java.lang.String r6 = "I"
            java.lang.String[] r1 = new java.lang.String[]{r6, r1, r2}
            r2 = 1
            boolean r13 = contains(r13, r0, r2, r1)
            if (r13 == 0) goto L3c
            r14.append(r3)
        L72:
            int r15 = r15 + r5
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if (contains(str, i9, 4, "TION") || contains(str, i9, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
            return i9 + 3;
        }
        if (!contains(str, i9, 2, "TH") && !contains(str, i9, 3, "TTH")) {
            doubleMetaphoneResult.append('T');
            int i10 = i9 + 1;
            return contains(str, i10, 1, "T", "D") ? i9 + 2 : i10;
        }
        int i11 = i9 + 2;
        if (contains(str, i11, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
            doubleMetaphoneResult.append('T');
            return i11;
        }
        doubleMetaphoneResult.append('0', 'T');
        return i11;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        int i10 = 2;
        if (!contains(str, i9, 2, "WR")) {
            if (i9 == 0) {
                int i11 = i9 + 1;
                if (isVowel(charAt(str, i11)) || contains(str, i9, 2, "WH")) {
                    if (isVowel(charAt(str, i11))) {
                        doubleMetaphoneResult.append('A', 'F');
                    } else {
                        doubleMetaphoneResult.append('A');
                    }
                    return i11;
                }
            }
            if ((i9 == str.length() - 1 && isVowel(charAt(str, i9 - 1))) || contains(str, i9 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.appendAlternate('F');
            } else {
                i10 = 4;
                if (contains(str, i9, 4, "WICZ", "WITZ")) {
                    doubleMetaphoneResult.append("TS", "FX");
                }
            }
            return i9 + 1;
        }
        doubleMetaphoneResult.append('R');
        return i9 + i10;
    }

    private int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9) {
        if (i9 == 0) {
            doubleMetaphoneResult.append('S');
            return i9 + 1;
        }
        if (i9 != str.length() - 1 || (!contains(str, i9 - 3, 3, "IAU", "EAU") && !contains(str, i9 - 2, 2, "AU", "OU"))) {
            doubleMetaphoneResult.append("KS");
        }
        int i10 = i9 + 1;
        return contains(str, i10, 1, "C", "X") ? i9 + 2 : i10;
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i9, boolean z9) {
        int i10 = i9 + 1;
        if (charAt(str, i10) == 'H') {
            doubleMetaphoneResult.append('J');
            return i9 + 2;
        }
        if (contains(str, i10, 2, "ZO", "ZI", "ZA") || (z9 && i9 > 0 && charAt(str, i9 - 1) != 'T')) {
            doubleMetaphoneResult.append("S", "TS");
        } else {
            doubleMetaphoneResult.append('S');
        }
        if (charAt(str, i10) == 'Z') {
            i10 = i9 + 2;
        }
        return i10;
    }

    private boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    private boolean isVowel(char c9) {
        return VOWELS.indexOf(c9) != -1;
    }

    public char charAt(String str, int i9) {
        if (i9 < 0 || i9 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i9);
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z9) {
        int i9;
        ?? CleanInput = cleanInput(str);
        if (CleanInput == 0) {
            return null;
        }
        boolean zIsSlavoGermanic = isSlavoGermanic(CleanInput);
        ?? IsSilentStart = isSilentStart(CleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && IsSilentStart <= CleanInput.length() - 1) {
            char cCharAt = CleanInput.charAt(IsSilentStart);
            if (cCharAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        IsSilentStart = handleAEIOUY(doubleMetaphoneResult, IsSilentStart);
                        break;
                    case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                        doubleMetaphoneResult.append('P');
                        i9 = IsSilentStart + 1;
                        IsSilentStart = charAt(CleanInput, i9) != 'B' ? i9 : IsSilentStart + 2;
                        break;
                    case 'C':
                        IsSilentStart = handleC(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'D':
                        IsSilentStart = handleD(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i9 = IsSilentStart + 1;
                        if (charAt(CleanInput, i9) != 'F') {
                        }
                        break;
                    case 'G':
                        IsSilentStart = handleG(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'H':
                        IsSilentStart = handleH(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'J':
                        IsSilentStart = handleJ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i9 = IsSilentStart + 1;
                        if (charAt(CleanInput, i9) != 'K') {
                        }
                        break;
                    case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                        IsSilentStart = handleL(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(CleanInput, IsSilentStart)) {
                        }
                        break;
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i9 = IsSilentStart + 1;
                        if (charAt(CleanInput, i9) != 'N') {
                        }
                        break;
                    case 'P':
                        IsSilentStart = handleP(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i9 = IsSilentStart + 1;
                        if (charAt(CleanInput, i9) != 'Q') {
                        }
                        break;
                    case 'R':
                        IsSilentStart = handleR(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'S':
                        IsSilentStart = handleS(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'T':
                        IsSilentStart = handleT(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i9 = IsSilentStart + 1;
                        if (charAt(CleanInput, i9) != 'V') {
                        }
                        break;
                    case 'W':
                        IsSilentStart = handleW(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                        IsSilentStart = handleX(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Z':
                        IsSilentStart = handleZ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            IsSilentStart++;
        }
        return z9 ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z9) {
        return StringUtils.equals(doubleMetaphone(str, z9), doubleMetaphone(str2, z9));
    }

    public void setMaxCodeLen(int i9) {
        this.maxCodeLen = i9;
    }
}
