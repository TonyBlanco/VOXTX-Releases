package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;
import okio.InflaterSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
class NameValueBlockReader {
    private int compressedLimit;
    private final InflaterSource inflaterSource;
    private final BufferedSource source;

    public NameValueBlockReader(BufferedSource bufferedSource) {
        InflaterSource inflaterSource = new InflaterSource(new ForwardingSource(bufferedSource) { // from class: com.squareup.okhttp.internal.framed.NameValueBlockReader.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j9) throws IOException {
                if (NameValueBlockReader.this.compressedLimit == 0) {
                    return -1L;
                }
                long j10 = super.read(buffer, Math.min(j9, NameValueBlockReader.this.compressedLimit));
                if (j10 == -1) {
                    return -1L;
                }
                NameValueBlockReader nameValueBlockReader = NameValueBlockReader.this;
                nameValueBlockReader.compressedLimit = (int) (((long) nameValueBlockReader.compressedLimit) - j10);
                return j10;
            }
        }, new Inflater() { // from class: com.squareup.okhttp.internal.framed.NameValueBlockReader.2
            @Override // java.util.zip.Inflater
            public int inflate(byte[] bArr, int i9, int i10) throws DataFormatException {
                int iInflate = super.inflate(bArr, i9, i10);
                if (iInflate != 0 || !needsDictionary()) {
                    return iInflate;
                }
                setDictionary(Spdy3.DICTIONARY);
                return super.inflate(bArr, i9, i10);
            }
        });
        this.inflaterSource = inflaterSource;
        this.source = Okio.buffer(inflaterSource);
    }

    private void doneReading() throws IOException {
        if (this.compressedLimit > 0) {
            this.inflaterSource.refill();
            if (this.compressedLimit == 0) {
                return;
            }
            throw new IOException("compressedLimit > 0: " + this.compressedLimit);
        }
    }

    private ByteString readByteString() throws IOException {
        return this.source.readByteString(this.source.readInt());
    }

    public void close() throws IOException {
        this.source.close();
    }

    public List<Header> readNameValueBlock(int i9) throws IOException {
        this.compressedLimit += i9;
        int i10 = this.source.readInt();
        if (i10 < 0) {
            throw new IOException("numberOfPairs < 0: " + i10);
        }
        if (i10 > 1024) {
            throw new IOException("numberOfPairs > 1024: " + i10);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            ByteString asciiLowercase = readByteString().toAsciiLowercase();
            ByteString byteString = readByteString();
            if (asciiLowercase.size() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new Header(asciiLowercase, byteString));
        }
        doneReading();
        return arrayList;
    }
}
