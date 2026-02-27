package E7;

import a7.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.C;
import com.squareup.picasso.s;
import com.squareup.picasso.t;
import java.text.SimpleDateFormat;
import java.util.Locale;
import m7.AbstractC2237a;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SimpleDateFormat f1709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t f1710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f1711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f1712d;

    public class a implements t.d {
        @Override // com.squareup.picasso.t.d
        public void a(t tVar, Uri uri, Exception exc) {
            Log.e("EPGUtil", exc.getMessage());
        }
    }

    public static String a(long j9) {
        LocalDate localDate = new LocalDate(j9);
        return localDate.dayOfWeek().getAsShortText() + " " + localDate.getDayOfMonth() + "/" + localDate.getMonthOfYear();
    }

    public static String b(Context context, long j9) {
        f1712d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f1711c = sharedPreferences;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0), Locale.US);
        f1709a = simpleDateFormat;
        return simpleDateFormat.format(Long.valueOf(j9));
    }

    public static void c(Context context) {
        if (f1710b == null) {
            f1710b = new t.b(context).b(new s(new OkHttpClient())).c(new a()).a();
        }
    }

    public static void d(Context context, String str, int i9, int i10, C c9) {
        c(context);
        ((str == null || str.equals("")) ? f1710b.j(e.f12016i1) : f1710b.l(str).k(i9, i10).b()).i(c9);
    }
}
