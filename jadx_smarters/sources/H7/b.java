package h7;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f41689a;

    public b(URL url) {
        this.f41689a = url;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        byte[] bArr = new byte[153600];
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                httpURLConnection = (HttpURLConnection) this.f41689a.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr, 0, 153600);
                dataOutputStream.flush();
                httpURLConnection.getResponseCode();
                c.f41690h = (int) (((double) c.f41690h) + (((double) 153600) / 1024.0d));
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d >= 10) {
                return;
            }
            dataOutputStream.close();
            httpURLConnection.disconnect();
        }
    }
}
