package okhttp3;

import kotlin.jvm.internal.l;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i9, @NotNull String reason) {
        l.e(webSocket, "webSocket");
        l.e(reason, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i9, @NotNull String reason) {
        l.e(webSocket, "webSocket");
        l.e(reason, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t9, @Nullable Response response) {
        l.e(webSocket, "webSocket");
        l.e(t9, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        l.e(webSocket, "webSocket");
        l.e(text, "text");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        l.e(webSocket, "webSocket");
        l.e(bytes, "bytes");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        l.e(webSocket, "webSocket");
        l.e(response, "response");
    }
}
