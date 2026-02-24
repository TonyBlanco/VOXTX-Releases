package P8;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7377a = 1179403647;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileChannel f7378c;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f7378c = new FileInputStream(file).getChannel();
    }

    public final long a(d dVar, long j9, long j10) {
        for (long j11 = 0; j11 < j9; j11++) {
            e eVarB = dVar.b(j11);
            if (eVarB.f7370a == 1) {
                long j12 = eVarB.f7372c;
                if (j12 <= j10 && j10 <= eVarB.f7373d + j12) {
                    return (j10 - j12) + eVarB.f7371b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d c() throws IOException {
        this.f7378c.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (k(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sG = g(byteBufferAllocate, 4L);
        boolean z9 = g(byteBufferAllocate, 5L) == 2;
        if (sG == 1) {
            return new g(z9, this);
        }
        if (sG == 2) {
            return new h(z9, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7378c.close();
    }

    public List d() throws IOException {
        long j9;
        this.f7378c.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarC = c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarC.f7361a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = dVarC.f7366f;
        int i9 = 0;
        if (j10 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j10 = dVarC.c(0).f7374a;
        }
        long j11 = 0;
        while (true) {
            if (j11 >= j10) {
                j9 = 0;
                break;
            }
            e eVarB = dVarC.b(j11);
            if (eVarB.f7370a == 2) {
                j9 = eVarB.f7371b;
                break;
            }
            j11++;
        }
        if (j9 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j12 = 0;
        while (true) {
            c cVarA = dVarC.a(j9, i9);
            long j13 = j9;
            long j14 = cVarA.f7359a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(cVarA.f7360b));
            } else if (j14 == 5) {
                j12 = cVarA.f7360b;
            }
            i9++;
            if (cVarA.f7359a == 0) {
                break;
            }
            j9 = j13;
        }
        if (j12 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarC, j10, j12);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(j(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    public void e(ByteBuffer byteBuffer, long j9, int i9) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i9);
        long j10 = 0;
        while (j10 < i9) {
            int i10 = this.f7378c.read(byteBuffer, j9 + j10);
            if (i10 == -1) {
                throw new EOFException();
            }
            j10 += (long) i10;
        }
        byteBuffer.position(0);
    }

    public short g(ByteBuffer byteBuffer, long j9) throws IOException {
        e(byteBuffer, j9, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int h(ByteBuffer byteBuffer, long j9) throws IOException {
        e(byteBuffer, j9, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long i(ByteBuffer byteBuffer, long j9) throws IOException {
        e(byteBuffer, j9, 8);
        return byteBuffer.getLong();
    }

    public String j(ByteBuffer byteBuffer, long j9) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j10 = 1 + j9;
            short sG = g(byteBuffer, j9);
            if (sG == 0) {
                return sb.toString();
            }
            sb.append((char) sG);
            j9 = j10;
        }
    }

    public long k(ByteBuffer byteBuffer, long j9) throws IOException {
        e(byteBuffer, j9, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
