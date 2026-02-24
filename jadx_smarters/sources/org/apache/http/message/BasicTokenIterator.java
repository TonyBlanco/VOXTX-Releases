package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    public String createToken(String str, int i9, int i10) {
        return str.substring(i9, i10);
    }

    public int findNext(int i9) throws ParseException {
        int iFindTokenSeparator;
        String strCreateToken;
        int iFindTokenEnd = -1;
        if (i9 >= 0) {
            iFindTokenSeparator = findTokenSeparator(i9);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            iFindTokenSeparator = 0;
        }
        int iFindTokenStart = findTokenStart(iFindTokenSeparator);
        if (iFindTokenStart < 0) {
            strCreateToken = null;
        } else {
            iFindTokenEnd = findTokenEnd(iFindTokenStart);
            strCreateToken = createToken(this.currentHeader, iFindTokenStart, iFindTokenEnd);
        }
        this.currentToken = strCreateToken;
        return iFindTokenEnd;
    }

    public int findTokenEnd(int i9) {
        Args.notNegative(i9, "Search position");
        int length = this.currentHeader.length();
        do {
            i9++;
            if (i9 >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i9)));
        return i9;
    }

    public int findTokenSeparator(int i9) {
        int iNotNegative = Args.notNegative(i9, "Search position");
        int length = this.currentHeader.length();
        boolean z9 = false;
        while (!z9 && iNotNegative < length) {
            char cCharAt = this.currentHeader.charAt(iNotNegative);
            if (isTokenSeparator(cCharAt)) {
                z9 = true;
            } else {
                if (!isWhitespace(cCharAt)) {
                    if (isTokenChar(cCharAt)) {
                        throw new ParseException("Tokens without separator (pos " + iNotNegative + "): " + this.currentHeader);
                    }
                    throw new ParseException("Invalid character after token (pos " + iNotNegative + "): " + this.currentHeader);
                }
                iNotNegative++;
            }
        }
        return iNotNegative;
    }

    public int findTokenStart(int i9) {
        int iNotNegative = Args.notNegative(i9, "Search position");
        boolean z9 = false;
        while (!z9) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z9 && iNotNegative < length) {
                char cCharAt = this.currentHeader.charAt(iNotNegative);
                if (isTokenSeparator(cCharAt) || isWhitespace(cCharAt)) {
                    iNotNegative++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(iNotNegative))) {
                        throw new ParseException("Invalid character before token (pos " + iNotNegative + "): " + this.currentHeader);
                    }
                    z9 = true;
                }
            }
            if (!z9) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    iNotNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z9) {
            return iNotNegative;
        }
        return -1;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c9) {
        return HTTP_SEPARATORS.indexOf(c9) >= 0;
    }

    public boolean isTokenChar(char c9) {
        if (Character.isLetterOrDigit(c9)) {
            return true;
        }
        return (Character.isISOControl(c9) || isHttpSeparator(c9)) ? false : true;
    }

    public boolean isTokenSeparator(char c9) {
        return c9 == ',';
    }

    public boolean isWhitespace(char c9) {
        return c9 == '\t' || Character.isSpaceChar(c9);
    }

    @Override // java.util.Iterator
    public final Object next() throws ParseException, NoSuchElementException {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() throws ParseException, NoSuchElementException {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
