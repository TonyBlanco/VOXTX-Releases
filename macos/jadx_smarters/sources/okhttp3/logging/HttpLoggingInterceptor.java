package okhttp3.logging;

import E8.n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.E;
import l8.p;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import u8.a;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;

    @NotNull
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@NotNull String message) {
                    l.e(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        void log(@NotNull String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(@NotNull Logger logger) {
        l.e(logger, "logger");
        this.logger = logger;
        this.headersToRedact = E.b();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i9, g gVar) {
        this((i9 & 1) != 0 ? Logger.DEFAULT : logger);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || n.o(str, HTTP.IDENTITY_CODING, true) || n.o(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i9) {
        String strValue = this.headersToRedact.contains(headers.name(i9)) ? "██" : headers.value(i9);
        this.logger.log(headers.name(i9) + ": " + strValue);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name */
    public final Level m161deprecated_level() {
        return this.level;
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
        String str;
        String string;
        Logger logger;
        String str2;
        Charset UTF_8;
        Logger logger2;
        StringBuilder sb;
        String strMethod;
        String string2;
        Charset UTF_82;
        StringBuilder sb2;
        l.e(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z9 = level == Level.BODY;
        boolean z10 = z9 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(request.method());
        sb3.append(TokenParser.SP);
        sb3.append(request.url());
        sb3.append(connection != null ? " " + connection.protocol() : "");
        String string3 = sb3.toString();
        if (!z10 && requestBodyBody != null) {
            string3 = string3 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(string3);
        if (z10) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + mediaTypeContentType);
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                logHeader(headers, i9);
            }
            if (!z9 || requestBodyBody == null) {
                logger2 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                strMethod = request.method();
            } else if (bodyHasUnknownEncoding(request.headers())) {
                logger2 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                strMethod = " (encoded body omitted)";
            } else if (requestBodyBody.isDuplex()) {
                logger2 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                strMethod = " (duplex request body omitted)";
            } else if (requestBodyBody.isOneShot()) {
                logger2 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                strMethod = " (one-shot body omitted)";
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                MediaType mediaTypeContentType2 = requestBodyBody.contentType();
                if (mediaTypeContentType2 == null || (UTF_82 = mediaTypeContentType2.charset(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    l.d(UTF_82, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(buffer)) {
                    this.logger.log(buffer.readString(UTF_82));
                    logger2 = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(request.method());
                    sb2.append(" (");
                    sb2.append(requestBodyBody.contentLength());
                    sb2.append("-byte body)");
                } else {
                    logger2 = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(request.method());
                    sb2.append(" (binary ");
                    sb2.append(requestBodyBody.contentLength());
                    sb2.append("-byte body omitted)");
                }
                string2 = sb2.toString();
                logger2.log(string2);
            }
            sb.append(strMethod);
            string2 = sb.toString();
            logger2.log(string2);
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            l.b(responseBodyBody);
            long jContentLength = responseBodyBody.contentLength();
            String str3 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            Logger logger3 = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(responseProceed.code());
            if (responseProceed.message().length() == 0) {
                str = "-byte body omitted)";
                string = "";
            } else {
                String strMessage = responseProceed.message();
                StringBuilder sb5 = new StringBuilder();
                str = "-byte body omitted)";
                sb5.append(String.valueOf(TokenParser.SP));
                sb5.append(strMessage);
                string = sb5.toString();
            }
            sb4.append(string);
            sb4.append(TokenParser.SP);
            sb4.append(responseProceed.request().url());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z10 ? "" : ", " + str3 + " body");
            sb4.append(')');
            logger3.log(sb4.toString());
            if (z10) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    logHeader(headers2, i10);
                }
                if (!z9 || !HttpHeaders.promisesBody(responseProceed)) {
                    logger = this.logger;
                    str2 = "<-- END HTTP";
                } else if (bodyHasUnknownEncoding(responseProceed.headers())) {
                    logger = this.logger;
                    str2 = "<-- END HTTP (encoded body omitted)";
                } else {
                    BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer2 = bufferedSourceSource.getBuffer();
                    Long l9 = null;
                    if (n.o("gzip", headers2.get("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(buffer2.size());
                        GzipSource gzipSource = new GzipSource(buffer2.clone());
                        try {
                            buffer2 = new Buffer();
                            buffer2.writeAll(gzipSource);
                            a.a(gzipSource, null);
                            l9 = lValueOf;
                        } finally {
                        }
                    }
                    MediaType mediaTypeContentType3 = responseBodyBody.contentType();
                    if (mediaTypeContentType3 == null || (UTF_8 = mediaTypeContentType3.charset(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        l.d(UTF_8, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(buffer2)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + buffer2.size() + str);
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.logger.log("");
                        this.logger.log(buffer2.clone().readString(UTF_8));
                    }
                    this.logger.log(l9 != null ? "<-- END HTTP (" + buffer2.size() + "-byte, " + l9 + "-gzipped-byte body)" : "<-- END HTTP (" + buffer2.size() + "-byte body)");
                }
                logger.log(str2);
            }
            return responseProceed;
        } catch (Exception e9) {
            this.logger.log("<-- HTTP FAILED: " + e9);
            throw e9;
        }
    }

    public final void level(@NotNull Level level) {
        l.e(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        l.e(name, "name");
        TreeSet treeSet = new TreeSet(n.p(kotlin.jvm.internal.E.f43679a));
        p.q(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        l.e(level, "level");
        this.level = level;
        return this;
    }
}
