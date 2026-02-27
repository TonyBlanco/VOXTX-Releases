package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class acz {
    public static int a(byte[] bArr) {
        acy acyVarG = g(bArr);
        if (acyVarG == null) {
            return -1;
        }
        return acyVarG.f19025b;
    }

    public static UUID b(byte[] bArr) {
        acy acyVarG = g(bArr);
        if (acyVarG == null) {
            return null;
        }
        return acyVarG.f19024a;
    }

    public static boolean c(byte[] bArr) {
        return g(bArr) != null;
    }

    public static byte[] d(UUID uuid, byte[] bArr) {
        return e(uuid, null, bArr);
    }

    public static byte[] e(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && (length = bArr.length) != 0) {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        acy acyVarG = g(bArr);
        if (acyVarG == null) {
            return null;
        }
        if (uuid.equals(acyVarG.f19024a)) {
            return acyVarG.f19026c;
        }
        cd.e("PsshAtomUtil", "UUID mismatch. Expected: " + String.valueOf(uuid) + ", got: " + acyVarG.f19024a.toString() + InstructionFileId.DOT);
        return null;
    }

    private static acy g(byte[] bArr) {
        cj cjVar = new cj(bArr);
        if (cjVar.d() < 32) {
            return null;
        }
        cjVar.F(0);
        if (cjVar.e() != cjVar.a() + 4 || cjVar.e() != 1886614376) {
            return null;
        }
        int iF = ace.f(cjVar.e());
        if (iF > 1) {
            cd.e("PsshAtomUtil", "Unsupported pssh version: " + iF);
            return null;
        }
        UUID uuid = new UUID(cjVar.o(), cjVar.o());
        if (iF == 1) {
            cjVar.G(cjVar.l() * 16);
        }
        int iL = cjVar.l();
        if (iL != cjVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iL];
        cjVar.A(bArr2, 0, iL);
        return new acy(uuid, iF, bArr2);
    }
}
