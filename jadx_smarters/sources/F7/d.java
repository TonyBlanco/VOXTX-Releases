package F7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.C1720c;
import f8.l;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;

/* JADX INFO: loaded from: classes4.dex */
public class d extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f2062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileInputStream f2064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2067f;

    public interface a {
        void a();

        void b(String str);
    }

    public d(Context context, FileInputStream fileInputStream, String str, String str2, String str3, a aVar) {
        this.f2062a = new WeakReference(context);
        this.f2063b = aVar;
        this.f2064c = fileInputStream;
        this.f2065d = str;
        this.f2066e = str2;
        this.f2067f = str3;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        a aVar;
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f2064c));
            C1720c c1720c = new C1720c();
            c1720c.o(bufferedReader, this.f2066e, this.f2067f, (Context) this.f2062a.get());
            l lVarF = c1720c.f();
            C cG = C.g((Context) this.f2062a.get());
            lVarF.f40891d = this.f2065d;
            lVarF.f40901i0 = "com.nst.iptvsmarterstvbox";
            lVarF.f40864B = null;
            lVarF.f40863A = null;
            cG.a(lVarF);
            cG.o((Context) this.f2062a.get(), lVarF);
            cG.q((Context) this.f2062a.get());
            return Boolean.TRUE;
        } catch (C1720c.a unused) {
            cancel(true);
            aVar = this.f2063b;
            str = "ConfigParseError";
            aVar.b(str);
            return Boolean.FALSE;
        } catch (MalformedURLException unused2) {
            cancel(true);
            aVar = this.f2063b;
            str = "MalformedURLException";
            aVar.b(str);
            return Boolean.FALSE;
        } catch (IOException unused3) {
            cancel(true);
            aVar = this.f2063b;
            str = "IOException";
            aVar.b(str);
            return Boolean.FALSE;
        }
    }

    public final boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            this.f2063b.a();
        } else {
            this.f2063b.b("unknown error");
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        Context context = (Context) this.f2062a.get();
        if (context == null || this.f2063b == null) {
            cancel(true);
        } else {
            if (b(context)) {
                return;
            }
            cancel(true);
            this.f2063b.b("No Network");
        }
    }
}
