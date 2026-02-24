package org.apache.commons.codec.language;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class ColognePhonetic implements StringEncoder {
    private static final char[] AEIJOUY = {'A', 'E', 'I', 'J', 'O', 'U', 'Y'};
    private static final char[] SCZ = {'S', 'C', 'Z'};
    private static final char[] WFPV = {'W', 'F', 'P', 'V'};
    private static final char[] GKQ = {'G', 'K', 'Q'};
    private static final char[] CKQ = {'C', 'K', 'Q'};
    private static final char[] AHKLOQRUX = {'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};
    private static final char[] SZ = {'S', 'Z'};
    private static final char[] AHOUKQX = {'A', 'H', 'O', 'U', 'K', 'Q', 'X'};
    private static final char[] TDX = {'T', 'D', 'X'};
    private static final char[][] PREPROCESS_MAP = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    public abstract class CologneBuffer {
        protected final char[] data;
        protected int length;

        public CologneBuffer(int i9) {
            this.length = 0;
            this.data = new char[i9];
            this.length = 0;
        }

        public CologneBuffer(char[] cArr) {
            this.length = 0;
            this.data = cArr;
            this.length = cArr.length;
        }

        public abstract char[] copyData(int i9, int i10);

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }
    }

    public class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        public void addLeft(char c9) {
            this.length++;
            this.data[getNextPos()] = c9;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i9, int i10) {
            char[] cArr = new char[i10];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i9, cArr, 0, i10);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            this.length--;
            return getNextChar();
        }
    }

    public class CologneOutputBuffer extends CologneBuffer {
        public CologneOutputBuffer(int i9) {
            super(i9);
        }

        public void addRight(char c9) {
            char[] cArr = this.data;
            int i9 = this.length;
            cArr[i9] = c9;
            this.length = i9 + 1;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i9, int i10) {
            char[] cArr = new char[i10];
            System.arraycopy(this.data, i9, cArr, 0, i10);
            return cArr;
        }
    }

    private static boolean arrayContains(char[] cArr, char c9) {
        for (char c10 : cArr) {
            if (c10 == c9) {
                return true;
            }
        }
        return false;
    }

    private String preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i9 = 0; i9 < charArray.length; i9++) {
            if (charArray[i9] > 'Z') {
                char[][] cArr = PREPROCESS_MAP;
                int length = cArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        char[] cArr2 = cArr[i10];
                        if (charArray[i9] == cArr2[0]) {
                            charArray[i9] = cArr2[1];
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return new String(charArray);
    }

    public String colognePhonetic(String str) {
        char c9;
        if (str == null) {
            return null;
        }
        String strPreprocess = preprocess(str);
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(strPreprocess.length() * 2);
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(strPreprocess.toCharArray());
        int length = cologneInputBuffer.length();
        char c10 = '/';
        char c11 = '-';
        while (length > 0) {
            char cRemoveNext = cologneInputBuffer.removeNext();
            int length2 = cologneInputBuffer.length();
            char nextChar = length2 > 0 ? cologneInputBuffer.getNextChar() : '-';
            if (arrayContains(AEIJOUY, cRemoveNext)) {
                c9 = '0';
            } else if (cRemoveNext == 'H' || cRemoveNext < 'A' || cRemoveNext > 'Z') {
                if (c10 == '/') {
                    length = length2;
                } else {
                    c9 = '-';
                }
            } else if (cRemoveNext == 'B' || (cRemoveNext == 'P' && nextChar != 'H')) {
                c9 = '1';
            } else if ((cRemoveNext == 'D' || cRemoveNext == 'T') && !arrayContains(SCZ, nextChar)) {
                c9 = '2';
            } else if (arrayContains(WFPV, cRemoveNext)) {
                c9 = '3';
            } else {
                if (arrayContains(GKQ, cRemoveNext)) {
                    c9 = '4';
                } else {
                    if (cRemoveNext == 'X' && !arrayContains(CKQ, c11)) {
                        cologneInputBuffer.addLeft('S');
                        length2++;
                    } else if (cRemoveNext == 'S' || cRemoveNext == 'Z') {
                        c9 = '8';
                    } else {
                        if (cRemoveNext == 'C') {
                            if (c10 != '/' ? arrayContains(SZ, c11) || !arrayContains(AHOUKQX, nextChar) : !arrayContains(AHKLOQRUX, nextChar)) {
                            }
                        } else if (!arrayContains(TDX, cRemoveNext)) {
                            c9 = cRemoveNext == 'R' ? '7' : cRemoveNext == 'L' ? '5' : (cRemoveNext == 'M' || cRemoveNext == 'N') ? '6' : cRemoveNext;
                        }
                        c9 = '8';
                    }
                    c9 = '4';
                }
                length = length2;
            }
            if (c9 != '-' && ((c10 != c9 && (c9 != '0' || c10 == '/')) || c9 < '0' || c9 > '8')) {
                cologneOutputBuffer.addRight(c9);
            }
            c10 = c9;
            c11 = cRemoveNext;
            length = length2;
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + InstructionFileId.DOT);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }
}
