package m7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import org.apache.http.protocol.HttpRequestExecutor;
import org.jsoup.Jsoup;

/* JADX INFO: loaded from: classes.dex */
public class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44553b;

    public b(Context context) {
        this.f44553b = "";
        this.f44552a = context;
        try {
            this.f44553b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public String a(String str) {
        return str.replaceAll("[\\-\\+\\.\\^:,]", "");
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        try {
            return Jsoup.connect("https://play.google.com/store/apps/details?id=com.nst.iptvsmarterstvbox&hl=en").timeout(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        int i9;
        int i10;
        super.onPostExecute(str);
        if (str == null || str.isEmpty()) {
            SharepreferenceDBHandler.setIsupdate(false, this.f44552a);
            SharepreferenceDBHandler.setIsAppExistOnPlayStore(false, this.f44552a);
            return;
        }
        SharepreferenceDBHandler.setIsAppExistOnPlayStore(true, this.f44552a);
        if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
            String strA = a(str);
            String strA2 = a(this.f44553b);
            if (strA.length() > strA2.length()) {
                int length = strA.length() - strA2.length();
                StringBuffer stringBuffer = new StringBuffer(strA2);
                for (int i11 = 0; i11 < length; i11++) {
                    stringBuffer.append(0);
                }
                strA2 = stringBuffer.toString();
            } else if (strA.length() < strA2.length()) {
                int length2 = strA2.length() - strA.length();
                StringBuffer stringBuffer2 = new StringBuffer(strA);
                for (int i12 = 0; i12 < length2; i12++) {
                    stringBuffer2.append(0);
                }
                strA = stringBuffer2.toString();
            }
            try {
                i9 = Integer.parseInt(strA);
                i10 = Integer.parseInt(strA2);
            } catch (NumberFormatException unused) {
                i9 = 1;
                i10 = 1;
            }
            if (i9 > i10) {
                SharepreferenceDBHandler.setIsupdate(true, this.f44552a);
                return;
            }
        }
        SharepreferenceDBHandler.setIsupdate(false, this.f44552a);
    }
}
