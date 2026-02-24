package h7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d extends Thread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41699d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f41697a = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f41700e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41701f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41702g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41703h = false;

    public d(String str, int i9) {
        this.f41698c = str;
        this.f41699d = i9;
    }

    public double a() {
        return this.f41701f;
    }

    public double b() {
        return this.f41700e;
    }

    public boolean c() {
        return this.f41702g;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c" + this.f41699d, this.f41698c);
            processBuilder.redirectErrorStream(true);
            Process processStart = processBuilder.start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("icmp_seq")) {
                    this.f41700e = Double.parseDouble(line.split(" ")[line.split(" ").length - 2].replace("time=", ""));
                }
                if (line.startsWith("rtt ")) {
                    this.f41701f = Double.parseDouble(line.split("/")[4]);
                    break;
                }
            }
            processStart.waitFor();
            bufferedReader.close();
        } catch (IOException e9) {
            e = e9;
            e.printStackTrace();
        } catch (InterruptedException e10) {
            e = e10;
            e.printStackTrace();
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
        }
        this.f41702g = true;
    }
}
