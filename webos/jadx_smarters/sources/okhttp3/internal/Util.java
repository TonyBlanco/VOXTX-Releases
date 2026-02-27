package okhttp3.internal;

import E8.c;
import E8.e;
import E8.n;
import E8.o;
import com.google.android.gms.common.api.a;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k8.AbstractC2152a;
import k8.q;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.l;
import l8.AbstractC2205B;
import l8.h;
import l8.k;
import l8.s;
import l8.x;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.apache.http.cookie.SM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Util {

    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;

    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);

    @NotNull
    public static final RequestBody EMPTY_REQUEST;

    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;

    @NotNull
    public static final TimeZone UTC;
    private static final e VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;

    @NotNull
    public static final String okHttpName;

    @NotNull
    public static final String userAgent = "okhttp/4.9.3";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        l.b(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        l.d(name, "OkHttpClient::class.java.name");
        okHttpName = o.l0(o.k0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> addIfAbsent, E e9) {
        l.e(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e9)) {
            return;
        }
        addIfAbsent.add(e9);
    }

    public static final int and(byte b9, int i9) {
        return b9 & i9;
    }

    public static final int and(short s9, int i9) {
        return s9 & i9;
    }

    public static final long and(int i9, long j9) {
        return ((long) i9) & j9;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull final EventListener asFactory) {
        l.e(asFactory, "$this$asFactory");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util.asFactory.1
            @Override // okhttp3.EventListener.Factory
            @NotNull
            public final EventListener create(@NotNull Call it) {
                l.e(it, "it");
                return asFactory;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object assertThreadDoesntHoldLock) {
        l.e(assertThreadDoesntHoldLock, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(assertThreadDoesntHoldLock)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            l.d(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(assertThreadDoesntHoldLock);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object assertThreadHoldsLock) {
        l.e(assertThreadHoldsLock, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(assertThreadHoldsLock)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        l.d(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(assertThreadHoldsLock);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(@NotNull String canParseAsIpAddress) {
        l.e(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.a(canParseAsIpAddress);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl canReuseConnectionFor, @NotNull HttpUrl other) {
        l.e(canReuseConnectionFor, "$this$canReuseConnectionFor");
        l.e(other, "other");
        return l.a(canReuseConnectionFor.host(), other.host()) && canReuseConnectionFor.port() == other.port() && l.a(canReuseConnectionFor.scheme(), other.scheme());
    }

    public static final int checkDuration(@NotNull String name, long j9, @Nullable TimeUnit timeUnit) {
        l.e(name, "name");
        if (!(j9 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j9);
        if (!(millis <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j9 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeQuietly) {
        l.e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket closeQuietly) {
        l.e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull Socket closeQuietly) {
        l.e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e9) {
            throw e9;
        } catch (RuntimeException e10) {
            if (!l.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] concat, @NotNull String value) {
        l.e(concat, "$this$concat");
        l.e(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        l.d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[h.r(strArr)] = value;
        return strArr;
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, char c9, int i9, int i10) {
        l.e(delimiterOffset, "$this$delimiterOffset");
        while (i9 < i10) {
            if (delimiterOffset.charAt(i9) == c9) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, @NotNull String delimiters, int i9, int i10) {
        l.e(delimiterOffset, "$this$delimiterOffset");
        l.e(delimiters, "delimiters");
        while (i9 < i10) {
            if (o.F(delimiters, delimiterOffset.charAt(i9), false, 2, null)) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c9, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, c9, i9, i10);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, str2, i9, i10);
    }

    public static final boolean discard(@NotNull Source discard, int i9, @NotNull TimeUnit timeUnit) {
        l.e(discard, "$this$discard");
        l.e(timeUnit, "timeUnit");
        try {
            return skipAll(discard, i9, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> filterList, @NotNull w8.l predicate) {
        l.e(filterList, "$this$filterList");
        l.e(predicate, "predicate");
        List<T> listF = k.f();
        for (T t9 : filterList) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                if (listF.isEmpty()) {
                    listF = new ArrayList<>();
                }
                F.a(listF).add(t9);
            }
        }
        return listF;
    }

    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        l.e(format, "format");
        l.e(args, "args");
        E e9 = E.f43679a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        l.d(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(@NotNull String[] hasIntersection, @Nullable String[] strArr, @NotNull Comparator<? super String> comparator) {
        l.e(hasIntersection, "$this$hasIntersection");
        l.e(comparator, "comparator");
        if (hasIntersection.length != 0 && strArr != null && strArr.length != 0) {
            for (String str : hasIntersection) {
                for (String str2 : strArr) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response headersContentLength) {
        l.e(headersContentLength, "$this$headersContentLength");
        String str = headersContentLength.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@NotNull w8.a block) {
        l.e(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... elements) {
        l.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(k.h(Arrays.copyOf(objArr, objArr.length)));
        l.d(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(@NotNull String[] indexOf, @NotNull String value, @NotNull Comparator<String> comparator) {
        l.e(indexOf, "$this$indexOf");
        l.e(value, "value");
        l.e(comparator, "comparator");
        int length = indexOf.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (comparator.compare(indexOf[i9], value) == 0) {
                return i9;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String indexOfControlOrNonAscii) {
        l.e(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i9);
            if (l.f(cCharAt, 31) <= 0 || l.f(cCharAt, 127) >= 0) {
                return i9;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String indexOfFirstNonAsciiWhitespace, int i9, int i10) {
        l.e(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i9 < i10) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i9);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i9, i10);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String indexOfLastNonAsciiWhitespace, int i9, int i10) {
        l.e(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i11 = i10 - 1;
        if (i11 >= i9) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i9) {
                    break;
                }
                i11--;
            }
        }
        return i9;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i9, i10);
    }

    public static final int indexOfNonWhitespace(@NotNull String indexOfNonWhitespace, int i9) {
        l.e(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i9 < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i9);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i9;
            }
            i9++;
        }
        return indexOfNonWhitespace.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        return indexOfNonWhitespace(str, i9);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        l.e(intersect, "$this$intersect");
        l.e(other, "other");
        l.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i9]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i9++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean isCivilized(@NotNull FileSystem isCivilized, @NotNull File file) throws IllegalAccessException, IOException, InvocationTargetException {
        l.e(isCivilized, "$this$isCivilized");
        l.e(file, "file");
        Sink sink = isCivilized.sink(file);
        try {
            try {
                isCivilized.delete(file);
                u8.a.a(sink, null);
                return true;
            } catch (IOException unused) {
                q qVar = q.f43674a;
                u8.a.a(sink, null);
                isCivilized.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(@NotNull Socket isHealthy, @NotNull BufferedSource source) {
        l.e(isHealthy, "$this$isHealthy");
        l.e(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z9 = !source.exhausted();
                isHealthy.setSoTimeout(soTimeout);
                return z9;
            } catch (Throwable th) {
                isHealthy.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@NotNull String name) {
        l.e(name, "name");
        return n.o(name, "Authorization", true) || n.o(name, SM.COOKIE, true) || n.o(name, "Proxy-Authorization", true) || n.o(name, SM.SET_COOKIE, true);
    }

    public static final void notify(@NotNull Object notify) {
        l.e(notify, "$this$notify");
        notify.notify();
    }

    public static final void notifyAll(@NotNull Object notifyAll) {
        l.e(notifyAll, "$this$notifyAll");
        notifyAll.notifyAll();
    }

    public static final int parseHexDigit(char c9) {
        if ('0' <= c9 && '9' >= c9) {
            return c9 - '0';
        }
        if ('a' <= c9 && 'f' >= c9) {
            return c9 - 'W';
        }
        if ('A' <= c9 && 'F' >= c9) {
            return c9 - '7';
        }
        return -1;
    }

    @NotNull
    public static final String peerName(@NotNull Socket peerName) {
        l.e(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        l.d(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource readBomAsCharset, @NotNull Charset charset) throws IOException {
        Charset charset2;
        String str;
        l.e(readBomAsCharset, "$this$readBomAsCharset");
        l.e(charset, "default");
        int iSelect = readBomAsCharset.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iSelect == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iSelect != 2) {
                if (iSelect == 3) {
                    return c.f1713a.a();
                }
                if (iSelect == 4) {
                    return c.f1713a.b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        l.d(charset2, str);
        return charset2;
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException {
        T tCast;
        Object fieldOrNull;
        l.e(instance, "instance");
        l.e(fieldType, "fieldType");
        l.e(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (!(!l.a(superclass, Object.class))) {
                if (!(!l.a(fieldName, "delegate")) || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field field = superclass.getDeclaredField(fieldName);
                l.d(field, "field");
                field.setAccessible(true);
                Object obj = field.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                l.d(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int readMedium(@NotNull BufferedSource readMedium) throws IOException {
        l.e(readMedium, "$this$readMedium");
        return and(readMedium.readByte(), 255) | (and(readMedium.readByte(), 255) << 16) | (and(readMedium.readByte(), 255) << 8);
    }

    public static final int skipAll(@NotNull Buffer skipAll, byte b9) throws EOFException {
        l.e(skipAll, "$this$skipAll");
        int i9 = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b9) {
            i9++;
            skipAll.readByte();
        }
        return i9;
    }

    public static final boolean skipAll(@NotNull Source skipAll, int i9, @NotNull TimeUnit timeUnit) throws IOException {
        l.e(skipAll, "$this$skipAll");
        l.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = skipAll.timeout().hasDeadline() ? skipAll.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i9)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            Timeout timeout = skipAll.timeout();
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                timeout.clearDeadline();
            } else {
                timeout.deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            Timeout timeout2 = skipAll.timeout();
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                timeout2.clearDeadline();
            } else {
                timeout2.deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            Timeout timeout3 = skipAll.timeout();
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                timeout3.clearDeadline();
            } else {
                timeout3.deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String name, final boolean z9) {
        l.e(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util.threadFactory.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z9);
                return thread;
            }
        };
    }

    public static final void threadName(@NotNull String name, @NotNull w8.a block) {
        l.e(name, "name");
        l.e(block, "block");
        Thread currentThread = Thread.currentThread();
        l.d(currentThread, "currentThread");
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            kotlin.jvm.internal.k.b(1);
            currentThread.setName(name2);
            kotlin.jvm.internal.k.a(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers toHeaderList) {
        l.e(toHeaderList, "$this$toHeaderList");
        B8.c cVarM = B8.h.m(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(l8.l.o(cVarM, 10));
        Iterator it = cVarM.iterator();
        while (it.hasNext()) {
            int iB = ((x) it).b();
            arrayList.add(new Header(toHeaderList.name(iB), toHeaderList.value(iB)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> toHeaders) {
        l.e(toHeaders, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : toHeaders) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(int i9) {
        String hexString = Integer.toHexString(i9);
        l.d(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHexString(long j9) {
        String hexString = Long.toHexString(j9);
        l.d(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl toHostHeader, boolean z9) {
        String strHost;
        l.e(toHostHeader, "$this$toHostHeader");
        if (o.G(toHostHeader.host(), ":", false, 2, null)) {
            strHost = '[' + toHostHeader.host() + ']';
        } else {
            strHost = toHostHeader.host();
        }
        if (!z9 && toHostHeader.port() == HttpUrl.Companion.defaultPort(toHostHeader.scheme())) {
            return strHost;
        }
        return strHost + ':' + toHostHeader.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        return toHostHeader(httpUrl, z9);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> toImmutableList) {
        l.e(toImmutableList, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(s.N(toImmutableList));
        l.d(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> toImmutableMap) {
        l.e(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return AbstractC2205B.d();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        l.d(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String toLongOrDefault, long j9) {
        l.e(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j9;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i9) {
        if (str != null) {
            try {
                long j9 = Long.parseLong(str);
                if (j9 > a.e.API_PRIORITY_OTHER) {
                    return a.e.API_PRIORITY_OTHER;
                }
                if (j9 < 0) {
                    return 0;
                }
                return (int) j9;
            } catch (NumberFormatException unused) {
            }
        }
        return i9;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String trimSubstring, int i9, int i10) {
        l.e(trimSubstring, "$this$trimSubstring");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(trimSubstring, i9, i10);
        String strSubstring = trimSubstring.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(trimSubstring, iIndexOfFirstNonAsciiWhitespace, i10));
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return trimSubstring(str, i9, i10);
    }

    public static final void wait(@NotNull Object wait) throws InterruptedException {
        l.e(wait, "$this$wait");
        wait.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception withSuppressed, @NotNull List<? extends Exception> suppressed) throws IllegalAccessException, InvocationTargetException {
        l.e(withSuppressed, "$this$withSuppressed");
        l.e(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC2152a.a(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    public static final void writeMedium(@NotNull BufferedSink writeMedium, int i9) throws IOException {
        l.e(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i9 >>> 16) & 255);
        writeMedium.writeByte((i9 >>> 8) & 255);
        writeMedium.writeByte(i9 & 255);
    }
}
