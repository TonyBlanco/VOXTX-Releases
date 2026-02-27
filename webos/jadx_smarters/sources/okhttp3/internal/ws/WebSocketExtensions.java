package okhttp3.internal.ws;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @Nullable
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;

    @Nullable
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[PHI: r7 r9
          0x008b: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v7 java.lang.Integer) binds: [B:47:0x00ba, B:44:0x00b1, B:27:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x008b: PHI (r9v7 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v5 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:47:0x00ba, B:44:0x00b1, B:27:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.internal.ws.WebSocketExtensions parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r21) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketExtensions.Companion.parse(okhttp3.Headers):okhttp3.internal.ws.WebSocketExtensions");
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z9, @Nullable Integer num, boolean z10, @Nullable Integer num2, boolean z11, boolean z12) {
        this.perMessageDeflate = z9;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z10;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z11;
        this.unknownValues = z12;
    }

    public /* synthetic */ WebSocketExtensions(boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i9, g gVar) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? false : z10, (i9 & 8) == 0 ? num2 : null, (i9 & 16) != 0 ? false : z11, (i9 & 32) != 0 ? false : z12);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = webSocketExtensions.perMessageDeflate;
        }
        if ((i9 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i9 & 4) != 0) {
            z10 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z13 = z10;
        if ((i9 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i9 & 16) != 0) {
            z11 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z14 = z11;
        if ((i9 & 32) != 0) {
            z12 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z9, num3, z13, num4, z14, z12);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @Nullable
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean z9, @Nullable Integer num, boolean z10, @Nullable Integer num2, boolean z11, boolean z12) {
        return new WebSocketExtensions(z9, num, z10, num2, z11, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && l.a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && l.a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z9 = this.perMessageDeflate;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i9 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i9 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z10 = this.clientNoContextTakeover;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode + r22) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.serverNoContextTakeover;
        ?? r23 = z11;
        if (z11) {
            r23 = 1;
        }
        int i11 = (iHashCode2 + r23) * 31;
        boolean z12 = this.unknownValues;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean noContextTakeover(boolean z9) {
        return z9 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ")";
    }
}
