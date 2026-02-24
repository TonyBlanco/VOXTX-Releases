package org.jsoup.parser;

import java.util.Arrays;
import java.util.Locale;
import org.jsoup.helper.Validate;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
final class CharacterReader {
    static final char EOF = 65535;
    private static final int maxCacheLen = 12;
    private final char[] input;
    private final int length;
    private int pos = 0;
    private int mark = 0;
    private final String[] stringCache = new String[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];

    public CharacterReader(String str) {
        Validate.notNull(str);
        char[] charArray = str.toCharArray();
        this.input = charArray;
        this.length = charArray.length;
    }

    private String cacheString(int i9, int i10) {
        char[] cArr = this.input;
        String[] strArr = this.stringCache;
        if (i10 > 12) {
            return new String(cArr, i9, i10);
        }
        int i11 = 0;
        int i12 = i9;
        int i13 = 0;
        while (i11 < i10) {
            i13 = (i13 * 31) + cArr[i12];
            i11++;
            i12++;
        }
        int length = (strArr.length - 1) & i13;
        String str = strArr[length];
        if (str != null) {
            return rangeEquals(i9, i10, str) ? str : new String(cArr, i9, i10);
        }
        String str2 = new String(cArr, i9, i10);
        strArr[length] = str2;
        return str2;
    }

    public void advance() {
        this.pos++;
    }

    public char consume() {
        int i9 = this.pos;
        char c9 = i9 >= this.length ? EOF : this.input[i9];
        this.pos = i9 + 1;
        return c9;
    }

    public String consumeAsString() {
        char[] cArr = this.input;
        int i9 = this.pos;
        this.pos = i9 + 1;
        return new String(cArr, i9, 1);
    }

    public String consumeData() {
        int i9;
        char c9;
        int i10 = this.pos;
        int i11 = this.length;
        char[] cArr = this.input;
        while (true) {
            i9 = this.pos;
            if (i9 >= i11 || (c9 = cArr[i9]) == '&' || c9 == '<' || c9 == 0) {
                break;
            }
            this.pos = i9 + 1;
        }
        return i9 > i10 ? cacheString(i10, i9 - i10) : "";
    }

    public String consumeDigitSequence() {
        int i9;
        char c9;
        int i10 = this.pos;
        while (true) {
            i9 = this.pos;
            if (i9 >= this.length || (c9 = this.input[i9]) < '0' || c9 > '9') {
                break;
            }
            this.pos = i9 + 1;
        }
        return cacheString(i10, i9 - i10);
    }

    public String consumeHexSequence() {
        int i9;
        char c9;
        int i10 = this.pos;
        while (true) {
            i9 = this.pos;
            if (i9 >= this.length || (((c9 = this.input[i9]) < '0' || c9 > '9') && ((c9 < 'A' || c9 > 'F') && (c9 < 'a' || c9 > 'f')))) {
                break;
            }
            this.pos = i9 + 1;
        }
        return cacheString(i10, i9 - i10);
    }

    public String consumeLetterSequence() {
        int i9;
        char c9;
        int i10 = this.pos;
        while (true) {
            i9 = this.pos;
            if (i9 >= this.length || (((c9 = this.input[i9]) < 'A' || c9 > 'Z') && (c9 < 'a' || c9 > 'z'))) {
                break;
            }
            this.pos = i9 + 1;
        }
        return cacheString(i10, i9 - i10);
    }

    public String consumeLetterThenDigitSequence() {
        char c9;
        int i9 = this.pos;
        while (true) {
            int i10 = this.pos;
            if (i10 >= this.length || (((c9 = this.input[i10]) < 'A' || c9 > 'Z') && (c9 < 'a' || c9 > 'z'))) {
                break;
            }
            this.pos = i10 + 1;
        }
        while (!isEmpty()) {
            char[] cArr = this.input;
            int i11 = this.pos;
            char c10 = cArr[i11];
            if (c10 < '0' || c10 > '9') {
                break;
            }
            this.pos = i11 + 1;
        }
        return cacheString(i9, this.pos - i9);
    }

    public String consumeTagName() {
        int i9;
        char c9;
        int i10 = this.pos;
        int i11 = this.length;
        char[] cArr = this.input;
        while (true) {
            i9 = this.pos;
            if (i9 >= i11 || (c9 = cArr[i9]) == '\t' || c9 == '\n' || c9 == '\r' || c9 == '\f' || c9 == ' ' || c9 == '/' || c9 == '>' || c9 == 0) {
                break;
            }
            this.pos = i9 + 1;
        }
        return i9 > i10 ? cacheString(i10, i9 - i10) : "";
    }

    public String consumeTo(char c9) {
        int iNextIndexOf = nextIndexOf(c9);
        if (iNextIndexOf == -1) {
            return consumeToEnd();
        }
        String strCacheString = cacheString(this.pos, iNextIndexOf);
        this.pos += iNextIndexOf;
        return strCacheString;
    }

    public String consumeTo(String str) {
        int iNextIndexOf = nextIndexOf(str);
        if (iNextIndexOf == -1) {
            return consumeToEnd();
        }
        String strCacheString = cacheString(this.pos, iNextIndexOf);
        this.pos += iNextIndexOf;
        return strCacheString;
    }

    public String consumeToAny(char... cArr) {
        int i9 = this.pos;
        int i10 = this.length;
        loop0: while (this.pos < i10) {
            for (char c9 : cArr) {
                if (this.input[this.pos] == c9) {
                    break loop0;
                }
            }
            this.pos++;
        }
        int i11 = this.pos;
        return i11 > i9 ? cacheString(i9, i11 - i9) : "";
    }

    public String consumeToAnySorted(char... cArr) {
        int i9 = this.pos;
        int i10 = this.length;
        char[] cArr2 = this.input;
        while (true) {
            int i11 = this.pos;
            if (i11 >= i10 || Arrays.binarySearch(cArr, cArr2[i11]) >= 0) {
                break;
            }
            this.pos++;
        }
        int i12 = this.pos;
        return i12 > i9 ? cacheString(i9, i12 - i9) : "";
    }

    public String consumeToEnd() {
        int i9 = this.pos;
        String strCacheString = cacheString(i9, this.length - i9);
        this.pos = this.length;
        return strCacheString;
    }

    public boolean containsIgnoreCase(String str) {
        Locale locale = Locale.ENGLISH;
        return nextIndexOf(str.toLowerCase(locale)) > -1 || nextIndexOf(str.toUpperCase(locale)) > -1;
    }

    public char current() {
        int i9 = this.pos;
        return i9 >= this.length ? EOF : this.input[i9];
    }

    public boolean isEmpty() {
        return this.pos >= this.length;
    }

    public void mark() {
        this.mark = this.pos;
    }

    public boolean matchConsume(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (!matchesIgnoreCase(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(char c9) {
        return !isEmpty() && this.input[this.pos] == c9;
    }

    public boolean matches(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != this.input[this.pos + i9]) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c9 = this.input[this.pos];
        for (char c10 : cArr) {
            if (c10 == c9) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        return !isEmpty() && Arrays.binarySearch(cArr, this.input[this.pos]) >= 0;
    }

    public boolean matchesDigit() {
        char c9;
        return !isEmpty() && (c9 = this.input[this.pos]) >= '0' && c9 <= '9';
    }

    public boolean matchesIgnoreCase(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            if (Character.toUpperCase(str.charAt(i9)) != Character.toUpperCase(this.input[this.pos + i9])) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c9 = this.input[this.pos];
        return (c9 >= 'A' && c9 <= 'Z') || (c9 >= 'a' && c9 <= 'z');
    }

    public int nextIndexOf(char c9) {
        for (int i9 = this.pos; i9 < this.length; i9++) {
            if (c9 == this.input[i9]) {
                return i9 - this.pos;
            }
        }
        return -1;
    }

    public int nextIndexOf(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        int i9 = this.pos;
        while (i9 < this.length) {
            if (cCharAt != this.input[i9]) {
                do {
                    i9++;
                    if (i9 >= this.length) {
                        break;
                    }
                } while (cCharAt != this.input[i9]);
            }
            int i10 = i9 + 1;
            int length = (charSequence.length() + i10) - 1;
            int i11 = this.length;
            if (i9 < i11 && length <= i11) {
                int i12 = i10;
                for (int i13 = 1; i12 < length && charSequence.charAt(i13) == this.input[i12]; i13++) {
                    i12++;
                }
                if (i12 == length) {
                    return i9 - this.pos;
                }
            }
            i9 = i10;
        }
        return -1;
    }

    public int pos() {
        return this.pos;
    }

    public boolean rangeEquals(int i9, int i10, String str) {
        if (i10 != str.length()) {
            return false;
        }
        char[] cArr = this.input;
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 == 0) {
                return true;
            }
            int i13 = i9 + 1;
            int i14 = i11 + 1;
            if (cArr[i9] != str.charAt(i11)) {
                return false;
            }
            i9 = i13;
            i10 = i12;
            i11 = i14;
        }
    }

    public void rewindToMark() {
        this.pos = this.mark;
    }

    public String toString() {
        char[] cArr = this.input;
        int i9 = this.pos;
        return new String(cArr, i9, this.length - i9);
    }

    public void unconsume() {
        this.pos--;
    }
}
