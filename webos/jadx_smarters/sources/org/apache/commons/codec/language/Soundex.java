package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class Soundex implements StringEncoder {

    @Deprecated
    private int maxLength;
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();

    public Soundex() {
        this.maxLength = 4;
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public Soundex(String str) {
        this.maxLength = 4;
        this.soundexMapping = str.toCharArray();
    }

    public Soundex(char[] cArr) {
        this.maxLength = 4;
        char[] cArr2 = new char[cArr.length];
        this.soundexMapping = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    private char getMappingCode(String str, int i9) {
        char cCharAt;
        char map = map(str.charAt(i9));
        if (i9 > 1 && map != '0' && ('H' == (cCharAt = str.charAt(i9 - 1)) || 'W' == cCharAt)) {
            char cCharAt2 = str.charAt(i9 - 2);
            if (map(cCharAt2) == map || 'H' == cCharAt2 || 'W' == cCharAt2) {
                return (char) 0;
            }
        }
        return map;
    }

    private char[] getSoundexMapping() {
        return this.soundexMapping;
    }

    private char map(char c9) {
        int i9 = c9 - 'A';
        if (i9 >= 0 && i9 < getSoundexMapping().length) {
            return getSoundexMapping()[i9];
        }
        throw new IllegalArgumentException("The character is not mapped: " + c9);
    }

    public int difference(String str, String str2) throws EncoderException {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    @Deprecated
    public int getMaxLength() {
        return this.maxLength;
    }

    @Deprecated
    public void setMaxLength(int i9) {
        this.maxLength = i9;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.length() == 0) {
            return strClean;
        }
        int i9 = 1;
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = strClean.charAt(0);
        char mappingCode = getMappingCode(strClean, 0);
        int i10 = 1;
        while (i9 < strClean.length() && i10 < 4) {
            int i11 = i9 + 1;
            char mappingCode2 = getMappingCode(strClean, i9);
            if (mappingCode2 != 0) {
                if (mappingCode2 != '0' && mappingCode2 != mappingCode) {
                    cArr[i10] = mappingCode2;
                    i10++;
                }
                mappingCode = mappingCode2;
            }
            i9 = i11;
        }
        return new String(cArr);
    }
}
