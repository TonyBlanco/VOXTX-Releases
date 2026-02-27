package b4;

import b4.InterfaceC1224o;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r5.AbstractC2673b;

/* JADX INFO: loaded from: classes3.dex */
public interface C extends InterfaceC1224o {

    public static final class a extends c {
        public a(IOException iOException, C1227s c1227s) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, c1227s, 2007, 1);
        }
    }

    public interface b extends InterfaceC1224o.a {
        @Override // b4.InterfaceC1224o.a
        C a();
    }

    public static class c extends C1225p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1227s f17477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17478d;

        public c(C1227s c1227s, int i9, int i10) {
            super(b(i9, i10));
            this.f17477c = c1227s;
            this.f17478d = i10;
        }

        public c(IOException iOException, C1227s c1227s, int i9, int i10) {
            super(iOException, b(i9, i10));
            this.f17477c = c1227s;
            this.f17478d = i10;
        }

        public c(String str, C1227s c1227s, int i9, int i10) {
            super(str, b(i9, i10));
            this.f17477c = c1227s;
            this.f17478d = i10;
        }

        public c(String str, IOException iOException, C1227s c1227s, int i9, int i10) {
            super(str, iOException, b(i9, i10));
            this.f17477c = c1227s;
            this.f17478d = i10;
        }

        public static int b(int i9, int i10) {
            return (i9 == 2000 && i10 == 1) ? AdError.INTERNAL_ERROR_CODE : i9;
        }

        public static c c(IOException iOException, C1227s c1227s, int i9) {
            String message = iOException.getMessage();
            int i10 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC2673b.e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            return i10 == 2007 ? new a(iOException, c1227s) : new c(iOException, c1227s, i10, i9);
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f17479e;

        public d(String str, C1227s c1227s) {
            super("Invalid content type: " + str, c1227s, AdError.INTERNAL_ERROR_2003, 1);
            this.f17479e = str;
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f17481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map f17482g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f17483h;

        public e(int i9, String str, IOException iOException, Map map, C1227s c1227s, byte[] bArr) {
            super("Response code: " + i9, iOException, c1227s, AdError.INTERNAL_ERROR_2004, 1);
            this.f17480e = i9;
            this.f17481f = str;
            this.f17482g = map;
            this.f17483h = bArr;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17484a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f17485b;

        public synchronized Map a() {
            try {
                if (this.f17485b == null) {
                    this.f17485b = Collections.unmodifiableMap(new HashMap(this.f17484a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f17485b;
        }
    }
}
