package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class Nysiis implements StringEncoder {
    private static final char SPACE = ' ';
    private static final int TRUE_LENGTH = 6;
    private final boolean strict;
    private static final char[] CHARS_A = {'A'};
    private static final char[] CHARS_AF = {'A', 'F'};
    private static final char[] CHARS_C = {'C'};
    private static final char[] CHARS_FF = {'F', 'F'};
    private static final char[] CHARS_G = {'G'};
    private static final char[] CHARS_N = {'N'};
    private static final char[] CHARS_NN = {'N', 'N'};
    private static final char[] CHARS_S = {'S'};
    private static final char[] CHARS_SSS = {'S', 'S', 'S'};
    private static final Pattern PAT_MAC = Pattern.compile("^MAC");
    private static final Pattern PAT_KN = Pattern.compile("^KN");
    private static final Pattern PAT_K = Pattern.compile("^K");
    private static final Pattern PAT_PH_PF = Pattern.compile("^(PH|PF)");
    private static final Pattern PAT_SCH = Pattern.compile("^SCH");
    private static final Pattern PAT_EE_IE = Pattern.compile("(EE|IE)$");
    private static final Pattern PAT_DT_ETC = Pattern.compile("(DT|RT|RD|NT|ND)$");

    public Nysiis() {
        this(true);
    }

    public Nysiis(boolean z9) {
        this.strict = z9;
    }

    private static boolean isVowel(char c9) {
        return c9 == 'A' || c9 == 'E' || c9 == 'I' || c9 == 'O' || c9 == 'U';
    }

    private static char[] transcodeRemaining(char c9, char c10, char c11, char c12) {
        return (c10 == 'E' && c11 == 'V') ? CHARS_AF : isVowel(c10) ? CHARS_A : c10 == 'Q' ? CHARS_G : c10 == 'Z' ? CHARS_S : c10 == 'M' ? CHARS_N : c10 == 'K' ? c11 == 'N' ? CHARS_NN : CHARS_C : (c10 == 'S' && c11 == 'C' && c12 == 'H') ? CHARS_SSS : (c10 == 'P' && c11 == 'H') ? CHARS_FF : (c10 != 'H' || (isVowel(c9) && isVowel(c11))) ? (c10 == 'W' && isVowel(c9)) ? new char[]{c9} : new char[]{c10} : new char[]{c9};
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return nysiis((String) obj);
        }
        throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }

    public boolean isStrict() {
        return this.strict;
    }

    public String nysiis(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.length() == 0) {
            return strClean;
        }
        String strReplaceFirst = PAT_DT_ETC.matcher(PAT_EE_IE.matcher(PAT_SCH.matcher(PAT_PH_PF.matcher(PAT_K.matcher(PAT_KN.matcher(PAT_MAC.matcher(strClean).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb = new StringBuilder(strReplaceFirst.length());
        sb.append(strReplaceFirst.charAt(0));
        char[] charArray = strReplaceFirst.toCharArray();
        int length = charArray.length;
        int i9 = 1;
        while (i9 < length) {
            int i10 = i9 - 1;
            char[] cArrTranscodeRemaining = transcodeRemaining(charArray[i10], charArray[i9], i9 < length + (-1) ? charArray[i9 + 1] : ' ', i9 < length + (-2) ? charArray[i9 + 2] : ' ');
            System.arraycopy(cArrTranscodeRemaining, 0, charArray, i9, cArrTranscodeRemaining.length);
            char c9 = charArray[i9];
            if (c9 != charArray[i10]) {
                sb.append(c9);
            }
            i9++;
        }
        if (sb.length() > 1) {
            char cCharAt = sb.charAt(sb.length() - 1);
            if (cCharAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                cCharAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && cCharAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (cCharAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String string = sb.toString();
        return isStrict() ? string.substring(0, Math.min(6, string.length())) : string;
    }
}
