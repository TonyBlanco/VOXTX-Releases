package org.apache.http.message;

import java.util.BitSet;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class TokenParser {
    public static final char CR = '\r';
    public static final char DQUOTE = '\"';
    public static final char ESCAPE = '\\';
    public static final char HT = '\t';
    public static final TokenParser INSTANCE = new TokenParser();
    public static final char LF = '\n';
    public static final char SP = ' ';

    public static BitSet INIT_BITSET(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i9 : iArr) {
            bitSet.set(i9);
        }
        return bitSet;
    }

    public static boolean isWhitespace(char c9) {
        return c9 == ' ' || c9 == '\t' || c9 == '\r' || c9 == '\n';
    }

    public void copyContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char cCharAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(cCharAt)) || isWhitespace(cCharAt)) {
                break;
            }
            pos++;
            sb.append(cCharAt);
        }
        parserCursor.updatePos(pos);
    }

    public void copyQuotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, StringBuilder sb) {
        if (parserCursor.atEnd()) {
            return;
        }
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        if (charArrayBuffer.charAt(pos) != '\"') {
            return;
        }
        int i9 = pos + 1;
        int i10 = pos2 + 1;
        boolean z9 = false;
        while (true) {
            if (i10 >= upperBound) {
                break;
            }
            char cCharAt = charArrayBuffer.charAt(i10);
            if (z9) {
                if (cCharAt != '\"' && cCharAt != '\\') {
                    sb.append(ESCAPE);
                }
                sb.append(cCharAt);
                z9 = false;
            } else if (cCharAt == '\"') {
                i9++;
                break;
            } else if (cCharAt == '\\') {
                z9 = true;
            } else if (cCharAt != '\r' && cCharAt != '\n') {
                sb.append(cCharAt);
            }
            i10++;
            i9++;
        }
        parserCursor.updatePos(i9);
    }

    public void copyUnquotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char cCharAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(cCharAt)) || isWhitespace(cCharAt) || cCharAt == '\"') {
                break;
            }
            pos++;
            sb.append(cCharAt);
        }
        parserCursor.updatePos(pos);
    }

    public String parseToken(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z9 = false;
            while (!parserCursor.atEnd()) {
                char cCharAt = charArrayBuffer.charAt(parserCursor.getPos());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (isWhitespace(cCharAt)) {
                    skipWhiteSpace(charArrayBuffer, parserCursor);
                    z9 = true;
                } else {
                    if (z9 && sb.length() > 0) {
                        sb.append(SP);
                    }
                    copyContent(charArrayBuffer, parserCursor, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public String parseValue(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z9 = false;
            while (!parserCursor.atEnd()) {
                char cCharAt = charArrayBuffer.charAt(parserCursor.getPos());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (isWhitespace(cCharAt)) {
                    skipWhiteSpace(charArrayBuffer, parserCursor);
                    z9 = true;
                } else if (cCharAt == '\"') {
                    if (z9 && sb.length() > 0) {
                        sb.append(SP);
                    }
                    copyQuotedContent(charArrayBuffer, parserCursor, sb);
                } else {
                    if (z9 && sb.length() > 0) {
                        sb.append(SP);
                    }
                    copyUnquotedContent(charArrayBuffer, parserCursor, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void skipWhiteSpace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound && isWhitespace(charArrayBuffer.charAt(pos2)); pos2++) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}
