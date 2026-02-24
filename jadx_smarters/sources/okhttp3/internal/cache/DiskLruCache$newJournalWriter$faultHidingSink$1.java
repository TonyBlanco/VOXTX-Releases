package okhttp3.internal.cache;

import java.io.IOException;
import k8.q;
import kotlin.jvm.internal.m;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends m implements l {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return q.f43674a;
    }

    public final void invoke(@NotNull IOException it) {
        kotlin.jvm.internal.l.e(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.jvm.internal.l.d(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(diskLruCache);
        throw new AssertionError(sb.toString());
    }
}
