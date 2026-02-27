package org.apache.http.util;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.nio.CharBuffer;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes4.dex */
public final class CharArrayBuffer implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i9) {
        Args.notNegative(i9, "Buffer capacity");
        this.buffer = new char[i9];
    }

    private void expand(int i9) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i9)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public void append(char c9) {
        int i9 = this.len + 1;
        if (i9 > this.buffer.length) {
            expand(i9);
        }
        this.buffer[this.len] = c9;
        this.len = i9;
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }

    public void append(String str) {
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        int length = str.length();
        int i9 = this.len + length;
        if (i9 > this.buffer.length) {
            expand(i9);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i9;
    }

    public void append(ByteArrayBuffer byteArrayBuffer, int i9, int i10) {
        if (byteArrayBuffer == null) {
            return;
        }
        append(byteArrayBuffer.buffer(), i9, i10);
    }

    public void append(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, 0, charArrayBuffer.len);
    }

    public void append(CharArrayBuffer charArrayBuffer, int i9, int i10) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, i9, i10);
    }

    public void append(byte[] bArr, int i9, int i10) {
        int i11;
        if (bArr == null) {
            return;
        }
        if (i9 < 0 || i9 > bArr.length || i10 < 0 || (i11 = i9 + i10) < 0 || i11 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i9 + " len: " + i10 + " b.length: " + bArr.length);
        }
        if (i10 == 0) {
            return;
        }
        int i12 = this.len;
        int i13 = i10 + i12;
        if (i13 > this.buffer.length) {
            expand(i13);
        }
        while (i12 < i13) {
            this.buffer[i12] = (char) (bArr[i9] & 255);
            i9++;
            i12++;
        }
        this.len = i13;
    }

    public void append(char[] cArr, int i9, int i10) {
        int i11;
        if (cArr == null) {
            return;
        }
        if (i9 < 0 || i9 > cArr.length || i10 < 0 || (i11 = i9 + i10) < 0 || i11 > cArr.length) {
            throw new IndexOutOfBoundsException("off: " + i9 + " len: " + i10 + " b.length: " + cArr.length);
        }
        if (i10 == 0) {
            return;
        }
        int i12 = this.len + i10;
        if (i12 > this.buffer.length) {
            expand(i12);
        }
        System.arraycopy(cArr, i9, this.buffer, this.len, i10);
        this.len = i12;
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i9) {
        return this.buffer[i9];
    }

    public void clear() {
        this.len = 0;
    }

    public void ensureCapacity(int i9) {
        if (i9 <= 0) {
            return;
        }
        int length = this.buffer.length;
        int i10 = this.len;
        if (i9 > length - i10) {
            expand(i10 + i9);
        }
    }

    public int indexOf(int i9) {
        return indexOf(i9, 0, this.len);
    }

    public int indexOf(int i9, int i10, int i11) {
        if (i10 < 0) {
            i10 = 0;
        }
        int i12 = this.len;
        if (i11 > i12) {
            i11 = i12;
        }
        if (i10 > i11) {
            return -1;
        }
        while (i10 < i11) {
            if (this.buffer[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.len;
    }

    public void setLength(int i9) {
        if (i9 >= 0 && i9 <= this.buffer.length) {
            this.len = i9;
            return;
        }
        throw new IndexOutOfBoundsException("len: " + i9 + " < 0 or > buffer len: " + this.buffer.length);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i9, int i10) {
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i9);
        }
        if (i10 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i10 + " > length: " + this.len);
        }
        if (i9 <= i10) {
            return CharBuffer.wrap(this.buffer, i9, i10);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i9 + " > endIndex: " + i10);
    }

    public String substring(int i9, int i10) {
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i9);
        }
        if (i10 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i10 + " > length: " + this.len);
        }
        if (i9 <= i10) {
            return new String(this.buffer, i9, i10 - i9);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i9 + " > endIndex: " + i10);
    }

    public String substringTrimmed(int i9, int i10) {
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i9);
        }
        if (i10 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i10 + " > length: " + this.len);
        }
        if (i9 > i10) {
            throw new IndexOutOfBoundsException("beginIndex: " + i9 + " > endIndex: " + i10);
        }
        while (i9 < i10 && HTTP.isWhitespace(this.buffer[i9])) {
            i9++;
        }
        while (i10 > i9 && HTTP.isWhitespace(this.buffer[i10 - 1])) {
            i10--;
        }
        return new String(this.buffer, i9, i10 - i9);
    }

    public char[] toCharArray() {
        int i9 = this.len;
        char[] cArr = new char[i9];
        if (i9 > 0) {
            System.arraycopy(this.buffer, 0, cArr, 0, i9);
        }
        return cArr;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.len);
    }
}
