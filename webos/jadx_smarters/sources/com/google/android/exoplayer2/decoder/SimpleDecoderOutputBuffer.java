package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SimpleDecoderOutputBuffer extends a {
    public ByteBuffer data;
    private final a.InterfaceC0238a owner;

    public SimpleDecoderOutputBuffer(a.InterfaceC0238a interfaceC0238a) {
        this.owner = interfaceC0238a;
    }

    @Override // U2.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j9, int i9) {
        this.timeUs = j9;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            this.data = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i9);
        return this.data;
    }

    @Override // com.google.android.exoplayer2.decoder.a
    public void release() {
        this.owner.a(this);
    }
}
