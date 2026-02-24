package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
public class ByteArrayEntity extends AbstractHttpEntity implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f46150b;

    @Deprecated
    protected final byte[] content;
    private final int len;
    private final int off;

    public ByteArrayEntity(byte[] bArr) {
        this(bArr, null);
    }

    public ByteArrayEntity(byte[] bArr, int i9, int i10) {
        this(bArr, i9, i10, null);
    }

    public ByteArrayEntity(byte[] bArr, int i9, int i10, ContentType contentType) {
        int i11;
        Args.notNull(bArr, "Source byte array");
        if (i9 < 0 || i9 > bArr.length || i10 < 0 || (i11 = i9 + i10) < 0 || i11 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i9 + " len: " + i10 + " b.length: " + bArr.length);
        }
        this.content = bArr;
        this.f46150b = bArr;
        this.off = i9;
        this.len = i10;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public ByteArrayEntity(byte[] bArr, ContentType contentType) {
        Args.notNull(bArr, "Source byte array");
        this.content = bArr;
        this.f46150b = bArr;
        this.off = 0;
        this.len = bArr.length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return new ByteArrayInputStream(this.f46150b, this.off, this.len);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.len;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        outputStream.write(this.f46150b, this.off, this.len);
        outputStream.flush();
    }
}
