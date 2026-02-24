package h7;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: h7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1867a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41679a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41680c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41681d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f41682e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41683f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41684g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41685h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f41686i = 0.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41687j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpURLConnection f41688k = null;

    public C1867a(String str) {
        this.f41679a = str;
    }

    public double a() {
        return d(this.f41684g, 2);
    }

    public double b() {
        return this.f41686i;
    }

    public boolean c() {
        return this.f41685h;
    }

    public final double d(double d9, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        try {
            return new BigDecimal(d9).setScale(i9, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public void e(int i9, double d9) {
        this.f41686i = i9 >= 0 ? d(((double) ((i9 * 8) / 1000000)) / d9, 2) : 0.0d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int responseCode = 0;
        this.f41683f = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f41679a + "random4000x4000.jpg");
        arrayList.add(this.f41679a + "random3000x3000.jpg");
        this.f41680c = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        loop0: while (it.hasNext()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) it.next()).openConnection();
                this.f41688k = httpURLConnection;
                responseCode = httpURLConnection.getResponseCode();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (responseCode == 200) {
                try {
                    byte[] bArr = new byte[10240];
                    InputStream inputStream = this.f41688k.getInputStream();
                    do {
                        int i9 = inputStream.read(bArr);
                        if (i9 != -1) {
                            this.f41683f += i9;
                            this.f41681d = System.currentTimeMillis();
                            double d9 = (r6 - this.f41680c) / 1000.0d;
                            this.f41682e = d9;
                            e(this.f41683f, d9);
                        } else {
                            inputStream.close();
                            this.f41688k.disconnect();
                        }
                    } while (this.f41682e < this.f41687j);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                System.out.println("Link not found...");
            }
        }
        this.f41681d = System.currentTimeMillis();
        double d10 = (r0 - this.f41680c) / 1000.0d;
        this.f41682e = d10;
        this.f41684g = (((double) (this.f41683f * 8)) / 1000000.0d) / d10;
        this.f41685h = true;
    }
}
