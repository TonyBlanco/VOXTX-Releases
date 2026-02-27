package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface PushObserver {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i9, @NotNull BufferedSource source, int i10, boolean z9) throws IOException {
                l.e(source, "source");
                source.skip(i10);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i9, @NotNull List<Header> responseHeaders, boolean z9) {
                l.e(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i9, @NotNull List<Header> requestHeaders) {
                l.e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i9, @NotNull ErrorCode errorCode) {
                l.e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    boolean onData(int i9, @NotNull BufferedSource bufferedSource, int i10, boolean z9) throws IOException;

    boolean onHeaders(int i9, @NotNull List<Header> list, boolean z9);

    boolean onRequest(int i9, @NotNull List<Header> list);

    void onReset(int i9, @NotNull ErrorCode errorCode);
}
