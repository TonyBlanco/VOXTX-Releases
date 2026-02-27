package q6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzl;
import com.google.android.gms.internal.firebase_messaging.zzm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class F implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f46956a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f46957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile InputStream f46958d;

    public F(URL url) {
        this.f46956a = url;
    }

    public static F d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public Bitmap a() throws IOException {
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(this.f46956a)));
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: ".concat(String.valueOf(this.f46956a)));
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(this.f46956a)));
        }
        return bitmapDecodeByteArray;
    }

    public final byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f46956a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.f46958d = inputStream;
            byte[] bArrZzb = zzl.zzb(zzl.zza(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String strValueOf = String.valueOf(this.f46956a);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(bArrZzb.length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrZzb.length <= 1048576) {
                return bArrZzb;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            zzm.zza(this.f46958d);
        } catch (NullPointerException e9) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e9);
        }
    }

    public Task e() {
        return (Task) com.google.android.gms.common.internal.r.m(this.f46957c);
    }

    public void g(Executor executor) {
        this.f46957c = Tasks.call(executor, new Callable() { // from class: q6.E
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f46955a.a();
            }
        });
    }
}
