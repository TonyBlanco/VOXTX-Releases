package org.apache.http.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteArrayBuffer implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i9) {
        Args.notNegative(i9, "Buffer capacity");
        this.buffer = new byte[i9];
    }

    private void expand(int i9) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i9)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public void append(int i9) {
        int i10 = this.len + 1;
        if (i10 > this.buffer.length) {
            expand(i10);
        }
        this.buffer[this.len] = (byte) i9;
        this.len = i10;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i9, int i10) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer(), i9, i10);
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
        int i12 = this.len + i10;
        if (i12 > this.buffer.length) {
            expand(i12);
        }
        System.arraycopy(bArr, i9, this.buffer, this.len, i10);
        this.len = i12;
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
        int i12 = this.len;
        int i13 = i10 + i12;
        if (i13 > this.buffer.length) {
            expand(i13);
        }
        while (i12 < i13) {
            this.buffer[i12] = (byte) cArr[i9];
            i9++;
            i12++;
        }
        this.len = i13;
    }

    public byte[] buffer() {
        return this.buffer;
    }

    public int byteAt(int i9) {
        return this.buffer[i9];
    }

    public int capacity() {
        return this.buffer.length;
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

    public int indexOf(byte b9) {
        return indexOf(b9, 0, this.len);
    }

    public int indexOf(byte b9, int i9, int i10) {
        if (i9 < 0) {
            i9 = 0;
        }
        int i11 = this.len;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i9 > i10) {
            return -1;
        }
        while (i9 < i10) {
            if (this.buffer[i9] == b9) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

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

    public byte[] toByteArray() {
        int i9 = this.len;
        byte[] bArr = new byte[i9];
        if (i9 > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i9);
        }
        return bArr;
    }
}
