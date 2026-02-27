package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

/* JADX INFO: loaded from: classes4.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i9 = 0;
        char c9 = 0;
        while (i9 < length) {
            char c10 = charArray[i9];
            if (c10 != '\\' || (c9 != 0 && c9 == '\\')) {
                sb.append(c10);
            }
            i9++;
            c9 = c10;
        }
        return sb.toString();
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    public String chompBalanced(char c9, char c10) {
        char c11 = 0;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (!isEmpty()) {
            char cConsume = consume();
            Character chValueOf = Character.valueOf(cConsume);
            if (c11 == 0 || c11 != '\\') {
                if (chValueOf.equals(Character.valueOf(c9))) {
                    i9++;
                    if (i10 == -1) {
                        i10 = this.pos;
                    }
                } else if (chValueOf.equals(Character.valueOf(c10))) {
                    i9--;
                }
            }
            if (i9 > 0 && c11 != 0) {
                i11 = this.pos;
            }
            if (i9 <= 0) {
                break;
            }
            c11 = cConsume;
        }
        return i11 >= 0 ? this.queue.substring(i10, i11) : "";
    }

    public String chompTo(String str) {
        String strConsumeTo = consumeTo(str);
        matchChomp(str);
        return strConsumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String strConsumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return strConsumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i9 = this.pos;
        this.pos = i9 + 1;
        return str.charAt(i9);
    }

    public void consume(String str) {
        if (!matches(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > remainingLength()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.pos += length;
    }

    public String consumeAttributeKey() {
        int i9 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public String consumeCssIdentifier() {
        int i9 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public String consumeElementSelector() {
        int i9 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('|', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public String consumeTagName() {
        int i9 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public String consumeTo(String str) {
        int iIndexOf = this.queue.indexOf(str, this.pos);
        if (iIndexOf == -1) {
            return remainder();
        }
        String strSubstring = this.queue.substring(this.pos, iIndexOf);
        this.pos += strSubstring.length();
        return strSubstring;
    }

    public String consumeToAny(String... strArr) {
        int i9 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int length;
        int i9;
        int i10 = this.pos;
        String strSubstring = str.substring(0, 1);
        boolean zEquals = strSubstring.toLowerCase().equals(strSubstring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (zEquals) {
                int iIndexOf = this.queue.indexOf(strSubstring, this.pos);
                int i11 = this.pos;
                int i12 = iIndexOf - i11;
                if (i12 == 0) {
                    i9 = i11 + 1;
                } else if (i12 < 0) {
                    length = this.queue.length();
                } else {
                    i9 = i11 + i12;
                }
                this.pos = i9;
            } else {
                length = this.pos + 1;
            }
            this.pos = length;
        }
        return this.queue.substring(i10, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z9 = false;
        while (matchesWhitespace()) {
            this.pos++;
            z9 = true;
        }
        return z9;
    }

    public String consumeWord() {
        int i9 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i9, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c9 : cArr) {
            if (this.queue.charAt(this.pos) == c9) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.queue.startsWith(str, this.pos);
    }

    public boolean matchesStartTag() {
        return remainingLength() >= 2 && this.queue.charAt(this.pos) == '<' && Character.isLetter(this.queue.charAt(this.pos + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public char peek() {
        if (isEmpty()) {
            return (char) 0;
        }
        return this.queue.charAt(this.pos);
    }

    public String remainder() {
        String str = this.queue;
        String strSubstring = str.substring(this.pos, str.length());
        this.pos = this.queue.length();
        return strSubstring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }
}
