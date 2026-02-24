package o1;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2305a implements Interceptor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f45746c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f45747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC0402a f45748b;

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    public enum EnumC0402a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: renamed from: o1.a$b */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45749a = new C0403a();

        /* JADX INFO: renamed from: o1.a$b$a, reason: collision with other inner class name */
        public class C0403a implements b {
            @Override // o1.C2305a.b
            public void log(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        }

        void log(String str);
    }

    public C2305a() {
        this(b.f45749a);
    }

    public C2305a(b bVar) {
        this.f45748b = EnumC0402a.NONE;
        this.f45747a = bVar;
    }

    public static boolean b(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i9 = 0; i9 < 16; i9++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final boolean a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase(HTTP.IDENTITY_CODING)) ? false : true;
    }

    public C2305a c(EnumC0402a enumC0402a) {
        if (enumC0402a == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.f45748b = enumC0402a;
        return this;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z9;
        b bVar;
        String str;
        b bVar2;
        StringBuilder sb;
        String strMethod;
        boolean z10;
        EnumC0402a enumC0402a = this.f45748b;
        Request request = chain.request();
        if (enumC0402a == EnumC0402a.NONE) {
            return chain.proceed(request);
        }
        boolean z11 = enumC0402a == EnumC0402a.BODY;
        boolean z12 = z11 || enumC0402a == EnumC0402a.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z13 = requestBodyBody != null;
        Connection connection = chain.connection();
        String str2 = "--> " + request.method() + TokenParser.SP + request.url() + TokenParser.SP + (connection != null ? connection.protocol() : Protocol.HTTP_1_1);
        if (!z12 && z13) {
            str2 = str2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.f45747a.log(str2);
        if (z12) {
            if (z13) {
                if (requestBodyBody.contentType() != null) {
                    this.f45747a.log("Content-Type: " + requestBodyBody.contentType());
                }
                if (requestBodyBody.contentLength() != -1) {
                    this.f45747a.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i9 = 0;
            while (i9 < size) {
                String strName = headers.name(i9);
                int i10 = size;
                if ("Content-Type".equalsIgnoreCase(strName) || "Content-Length".equalsIgnoreCase(strName)) {
                    z10 = z12;
                } else {
                    z10 = z12;
                    this.f45747a.log(strName + ": " + headers.value(i9));
                }
                i9++;
                size = i10;
                z12 = z10;
            }
            z9 = z12;
            if (!z11 || !z13) {
                bVar2 = this.f45747a;
                sb = new StringBuilder();
                sb.append("--> END ");
                strMethod = request.method();
            } else if (a(request.headers())) {
                bVar2 = this.f45747a;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                strMethod = " (encoded body omitted)";
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                Charset charset = f45746c;
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.charset(charset);
                }
                this.f45747a.log("");
                if (b(buffer)) {
                    this.f45747a.log(buffer.readString(charset));
                    bVar2 = this.f45747a;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    sb.append(" (");
                    sb.append(requestBodyBody.contentLength());
                    sb.append("-byte body)");
                } else {
                    bVar2 = this.f45747a;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    sb.append(" (binary ");
                    sb.append(requestBodyBody.contentLength());
                    sb.append("-byte body omitted)");
                }
                bVar2.log(sb.toString());
            }
            sb.append(strMethod);
            bVar2.log(sb.toString());
        } else {
            z9 = z12;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            String str3 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            b bVar3 = this.f45747a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            sb2.append(TokenParser.SP);
            sb2.append(responseProceed.message());
            sb2.append(TokenParser.SP);
            sb2.append(responseProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z9 ? "" : ", " + str3 + " body");
            sb2.append(')');
            bVar3.log(sb2.toString());
            if (z9) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    this.f45747a.log(headers2.name(i11) + ": " + headers2.value(i11));
                }
                if (!z11 || !HttpHeaders.hasBody(responseProceed)) {
                    bVar = this.f45747a;
                    str = "<-- END HTTP";
                } else if (a(responseProceed.headers())) {
                    bVar = this.f45747a;
                    str = "<-- END HTTP (encoded body omitted)";
                } else {
                    BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer2 = bufferedSourceSource.buffer();
                    Charset charset2 = f45746c;
                    MediaType mediaTypeContentType2 = responseBodyBody.contentType();
                    if (mediaTypeContentType2 != null) {
                        charset2 = mediaTypeContentType2.charset(charset2);
                    }
                    if (!b(buffer2)) {
                        this.f45747a.log("");
                        this.f45747a.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.f45747a.log("");
                        this.f45747a.log(buffer2.clone().readString(charset2));
                    }
                    this.f45747a.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                }
                bVar.log(str);
            }
            return responseProceed;
        } catch (Exception e9) {
            this.f45747a.log("<-- HTTP FAILED: " + e9);
            throw e9;
        }
    }
}
