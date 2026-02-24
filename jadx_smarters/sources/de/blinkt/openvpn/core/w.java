package de.blinkt.openvpn.core;

import de.blinkt.openvpn.core.G;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class w implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f40091j = Pattern.compile("(\\d+).(\\d+) ([0-9a-f])+ (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f40092a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Process f40093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OpenVPNService f40096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40098h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40099i = false;

    public w(OpenVPNService openVPNService, String[] strArr, String str, String str2) {
        this.f40092a = strArr;
        this.f40094d = str;
        this.f40095e = str2;
        this.f40096f = openVPNService;
    }

    public final String a(String[] strArr, ProcessBuilder processBuilder) {
        String str;
        String strReplaceFirst = strArr[0].replaceFirst("/cache/.*$", "/lib");
        String str2 = processBuilder.environment().get("LD_LIBRARY_PATH");
        if (str2 == null) {
            str = strReplaceFirst;
        } else {
            str = strReplaceFirst + ":" + str2;
        }
        if (strReplaceFirst.equals(this.f40094d)) {
            return str;
        }
        return this.f40094d + ":" + str;
    }

    public void b() {
        this.f40099i = true;
    }

    public final void c(String[] strArr) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, strArr);
        ProcessBuilder processBuilder = new ProcessBuilder(linkedList);
        processBuilder.environment().put("LD_LIBRARY_PATH", a(strArr, processBuilder));
        processBuilder.environment().put("TMPDIR", this.f40095e);
        processBuilder.redirectErrorStream(true);
        try {
            Process processStart = processBuilder.start();
            this.f40093c = processStart;
            processStart.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f40093c.getInputStream()));
            do {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("Dump path: ")) {
                    this.f40097g = line.substring(11);
                }
                if (line.startsWith("/data/data/de.blinkt.openvpn/cache/pievpn") || line.contains("syntax error")) {
                    this.f40098h = true;
                }
                Matcher matcher = f40091j.matcher(line);
                if (matcher.matches()) {
                    int i9 = Integer.parseInt(matcher.group(3), 16);
                    String strGroup = matcher.group(4);
                    int iMax = i9 & 15;
                    G.c cVar = G.c.INFO;
                    if ((i9 & 16) != 0) {
                        cVar = G.c.ERROR;
                    } else if ((i9 & 32) != 0 || (i9 & 64) != 0) {
                        cVar = G.c.WARNING;
                    } else if ((i9 & 128) != 0) {
                        cVar = G.c.VERBOSE;
                    }
                    if (strGroup.startsWith("MANAGEMENT: CMD")) {
                        iMax = Math.max(4, iMax);
                    }
                    boolean z9 = (strGroup.endsWith("md too weak") && strGroup.startsWith("OpenSSL: error")) || strGroup.contains("error:140AB18E");
                    G.x(cVar, iMax, strGroup);
                    if (z9) {
                        G.p("OpenSSL reported a certificate with a weak hash, please the in app FAQ about weak hashes");
                    }
                } else {
                    G.u("P:" + line);
                }
            } while (!Thread.interrupted());
            throw new InterruptedException("OpenVpn process was killed form java code");
        } catch (IOException e9) {
            e = e9;
            G.s("Error reading from output of OpenVPN process", e);
            d();
        } catch (InterruptedException e10) {
            e = e10;
            G.s("Error reading from output of OpenVPN process", e);
            d();
        }
    }

    public void d() {
        this.f40093c.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024b A[Catch: InterruptedException -> 0x0250, IllegalThreadStateException -> 0x0252, TRY_LEAVE, TryCatch #10 {IllegalThreadStateException -> 0x0252, InterruptedException -> 0x0250, blocks: (B:83:0x0247, B:85:0x024b), top: B:134:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.w.run():void");
    }
}
