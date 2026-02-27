package androidx.emoji2.text;

import c0.C1243b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f14853a;

        public a(ByteBuffer byteBuffer) {
            this.f14853a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void b(int i9) {
            ByteBuffer byteBuffer = this.f14853a;
            byteBuffer.position(byteBuffer.position() + i9);
        }

        @Override // androidx.emoji2.text.l.c
        public int c() {
            return this.f14853a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public int d() {
            return l.d(this.f14853a.getShort());
        }

        @Override // androidx.emoji2.text.l.c
        public long e() {
            return l.c(this.f14853a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f14853a.position();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14855b;

        public b(long j9, long j10) {
            this.f14854a = j9;
            this.f14855b = j10;
        }

        public long a() {
            return this.f14854a;
        }
    }

    public interface c {
        void b(int i9);

        int c();

        int d();

        long e();

        long getPosition();
    }

    public static b a(c cVar) throws IOException {
        long jE;
        cVar.b(4);
        int iD = cVar.d();
        if (iD > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i9 = 0;
        while (true) {
            if (i9 >= iD) {
                jE = -1;
                break;
            }
            int iC = cVar.c();
            cVar.b(4);
            jE = cVar.e();
            cVar.b(4);
            if (1835365473 == iC) {
                break;
            }
            i9++;
        }
        if (jE != -1) {
            cVar.b((int) (jE - cVar.getPosition()));
            cVar.b(12);
            long jE2 = cVar.e();
            for (int i10 = 0; i10 < jE2; i10++) {
                int iC2 = cVar.c();
                long jE3 = cVar.e();
                long jE4 = cVar.e();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jE3 + jE, jE4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static C1243b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return C1243b.h(byteBufferDuplicate);
    }

    public static long c(int i9) {
        return ((long) i9) & 4294967295L;
    }

    public static int d(short s9) {
        return s9 & 65535;
    }
}
