package b7;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f17717b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f17718c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17719a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f17720a = "http://api-android.whmcssmarters.com/";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f17721b = "?/Android";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f17722c = "response_api.php";
    }

    public g(Context context) {
        this.f17719a = context;
    }

    public static e a(String str, String str2) {
        return new e(str, str2);
    }

    public void b(InterfaceC1233c interfaceC1233c) {
        new AsyncTaskC1234d(this.f17719a, a.f17721b, 1, interfaceC1233c, "Form", f17717b, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void c(InterfaceC1233c interfaceC1233c) {
        new AsyncTaskC1234d(this.f17719a, a.f17722c, 1, interfaceC1233c, "Form", f17717b, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }
}
