package l3;

import com.amazonaws.services.s3.model.InstructionFileId;
import d4.AbstractC1681B;
import d4.M;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: l3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2187l {

    /* JADX INFO: renamed from: l3.l$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f44019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f44021c;

        public a(UUID uuid, int i9, byte[] bArr) {
            this.f44019a = uuid;
            this.f44020b = i9;
            this.f44021c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
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
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        M m9 = new M(bArr);
        if (m9.g() < 32) {
            return null;
        }
        m9.U(0);
        if (m9.q() != m9.a() + 4 || m9.q() != 1886614376) {
            return null;
        }
        int iC = AbstractC2176a.c(m9.q());
        if (iC > 1) {
            AbstractC1681B.j("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(m9.A(), m9.A());
        if (iC == 1) {
            m9.V(m9.L() * 16);
        }
        int iL = m9.L();
        if (iL != m9.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iL];
        m9.l(bArr2, 0, iL);
        return new a(uuid, iC, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f44019a)) {
            return aVarD.f44021c;
        }
        AbstractC1681B.j("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f44019a + InstructionFileId.DOT);
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f44019a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f44020b;
    }
}
