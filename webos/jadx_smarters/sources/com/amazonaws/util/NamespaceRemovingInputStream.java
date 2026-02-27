package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace;
    private final byte[] lookAheadData;

    public static final class StringPrefixSlicer {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f18388s;

        public StringPrefixSlicer(String str) {
            this.f18388s = str;
        }

        public String getString() {
            return this.f18388s;
        }

        public boolean removePrefix(String str) {
            if (!this.f18388s.startsWith(str)) {
                return false;
            }
            this.f18388s = this.f18388s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int iIndexOf = this.f18388s.indexOf(str);
            if (iIndexOf < 0) {
                return false;
            }
            this.f18388s = this.f18388s.substring(iIndexOf + str.length());
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.f18388s.startsWith(str)) {
                return false;
            }
            while (this.f18388s.startsWith(str)) {
                this.f18388s = this.f18388s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.lookAheadData = new byte[200];
        this.hasRemovedNamespace = false;
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (stringPrefixSlicer.removePrefix(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) && stringPrefixSlicer.removePrefixEndingWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            return str.length() - stringPrefixSlicer.getString().length();
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i9 = ((FilterInputStream) this).in.read();
        if (i9 != 120 || this.hasRemovedNamespace) {
            return i9;
        }
        this.lookAheadData[0] = (byte) i9;
        ((FilterInputStream) this).in.mark(this.lookAheadData.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.lookAheadData;
        int i10 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int iMatchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, i10 + 1, StringUtils.UTF8));
        if (iMatchXmlNamespaceAttribute <= 0) {
            return i9;
        }
        for (int i11 = 0; i11 < iMatchXmlNamespaceAttribute - 1; i11++) {
            ((FilterInputStream) this).in.read();
        }
        int i12 = ((FilterInputStream) this).in.read();
        this.hasRemovedNamespace = true;
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = read();
            if (i12 == -1) {
                if (i11 == 0) {
                    return -1;
                }
                return i11;
            }
            bArr[i11 + i9] = (byte) i12;
        }
        return i10;
    }
}
