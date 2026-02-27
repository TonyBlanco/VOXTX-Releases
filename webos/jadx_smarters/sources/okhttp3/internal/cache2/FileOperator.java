package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.l;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        l.e(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j9, @NotNull Buffer sink, long j10) throws IOException {
        l.e(sink, "sink");
        if (j10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j10 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j9, j10, sink);
            j9 += jTransferTo;
            j10 -= jTransferTo;
        }
    }

    public final void write(long j9, @NotNull Buffer source, long j10) throws IOException {
        l.e(source, "source");
        if (j10 < 0 || j10 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = j9;
        long j12 = j10;
        while (j12 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j11, j12);
            j11 += jTransferFrom;
            j12 -= jTransferFrom;
        }
    }
}
