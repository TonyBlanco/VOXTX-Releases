package m7;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f44554a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f44555c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f44556d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f44557e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44558f = false;

    public HashMap a() {
        return this.f44554a;
    }

    public double b() {
        return this.f44556d;
    }

    public double c() {
        return this.f44557e;
    }

    public HashMap d() {
        return this.f44555c;
    }

    public boolean e() {
        return this.f44558f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-config.php").openConnection();
            httpURLConnection.getContentLength();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (line.contains("isp=")) {
                            this.f44556d = Double.parseDouble(line.split("lat=\"")[1].split(" ")[0].replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ""));
                            this.f44557e = Double.parseDouble(line.split("lon=\"")[1].split(" ")[0].replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ""));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            }
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-servers-static.php").openConnection();
                if (httpURLConnection2.getResponseCode() == 200) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    int i9 = 0;
                    while (true) {
                        String line2 = bufferedReader2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        if (line2.contains("<server url")) {
                            String str = line2.split("server url=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0];
                            List listAsList = Arrays.asList(line2.split("lat=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("lon=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("name=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("country=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("cc=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("sponsor=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], line2.split("host=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0]);
                            this.f44554a.put(Integer.valueOf(i9), str);
                            this.f44555c.put(Integer.valueOf(i9), listAsList);
                            i9++;
                        }
                    }
                    bufferedReader2.close();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            this.f44558f = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
