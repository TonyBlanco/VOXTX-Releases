package h7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f41690h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41691a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f41692c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41693d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f41694e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41695f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41696g;

    public c(String str) {
        this.f41691a = str;
    }

    public double a() {
        return d(this.f41695f, 2);
    }

    public double b() {
        try {
            new BigDecimal(f41690h);
            if (f41690h < 0) {
                return 0.0d;
            }
            double dCurrentTimeMillis = (System.currentTimeMillis() - this.f41696g) / 1000.0d;
            this.f41694e = dCurrentTimeMillis;
            return d(((((double) f41690h) / 1000.0d) * 8.0d) / dCurrentTimeMillis, 2);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public boolean c() {
        return this.f41693d;
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

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            URL url = new URL(this.f41691a);
            f41690h = 0;
            this.f41696g = System.currentTimeMillis();
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
            for (int i9 = 0; i9 < 4; i9++) {
                executorServiceNewFixedThreadPool.execute(new b(url));
            }
            executorServiceNewFixedThreadPool.shutdown();
            while (!executorServiceNewFixedThreadPool.isTerminated()) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
            double dCurrentTimeMillis = (System.currentTimeMillis() - this.f41696g) / 1000.0d;
            this.f41692c = dCurrentTimeMillis;
            this.f41695f = ((((double) f41690h) / 1000.0d) * 8.0d) / dCurrentTimeMillis;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        this.f41693d = true;
    }
}
