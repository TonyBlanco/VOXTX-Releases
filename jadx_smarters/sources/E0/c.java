package E0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(G0.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorU = bVar.U("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorU.moveToNext()) {
            try {
                arrayList.add(cursorU.getString(0));
            } catch (Throwable th) {
                cursorU.close();
                throw th;
            }
        }
        cursorU.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.C("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(C0.e eVar, G0.e eVar2, boolean z9, CancellationSignal cancellationSignal) {
        Cursor cursorQ = eVar.q(eVar2, cancellationSignal);
        if (!z9 || !(cursorQ instanceof AbstractWindowedCursor)) {
            return cursorQ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : cursorQ;
    }

    public static int c(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i9 = byteBufferAllocate.getInt();
            channel.close();
            return i9;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
