package F7;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class c extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileDescriptor f2059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f2060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2061e;

    public interface a {
        void a(File file);
    }

    public c(String str, Context context, a aVar) {
        this.f2058b = context;
        this.f2057a = aVar;
        this.f2061e = str;
    }

    public void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        boolean z9;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.connect();
            do {
                if (httpURLConnection.getResponseCode() == 301 || httpURLConnection.getResponseCode() == 302) {
                    httpURLConnection = (HttpURLConnection) new URL(httpURLConnection.getHeaderField("Location")).openConnection();
                    httpURLConnection.connect();
                    z9 = true;
                } else {
                    z9 = false;
                }
            } while (z9);
            int contentLength = httpURLConnection.getContentLength();
            Log.d("DOWNLOADFILE", "Length of the file: " + contentLength);
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f2061e);
            this.f2060d = file;
            a(file.getParent());
            FileOutputStream fileOutputStream = new FileOutputStream(this.f2060d);
            Log.d("DOWNLOADFILE", "file saved at " + this.f2060d.getAbsolutePath());
            this.f2059c = fileOutputStream.getFD();
            byte[] bArr = new byte[1024];
            long j9 = 0;
            while (true) {
                int i9 = inputStream.read(bArr);
                if (i9 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return null;
                }
                j9 += (long) i9;
                publishProgress("" + ((int) ((100 * j9) / ((long) contentLength))));
                fileOutputStream.write(bArr, 0, i9);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f2057a;
        if (aVar != null) {
            aVar.a(this.f2060d);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(String... strArr) {
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }
}
