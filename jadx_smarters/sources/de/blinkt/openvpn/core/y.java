package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.Intent;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import de.blinkt.openvpn.core.C1721d;
import de.blinkt.openvpn.core.n;
import de.blinkt.openvpn.core.z;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import org.apache.http.HttpVersion;

/* JADX INFO: loaded from: classes4.dex */
public class y implements Runnable, n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Vector f40101r = new Vector();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f40102a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalSocket f40103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f8.l f40104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OpenVPNService f40105e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalServerSocket f40107g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LocalSocket f40110j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n.a f40112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f40113m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient C1721d f40117q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedList f40106f = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40108h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40109i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n.b f40111k = n.b.noNetwork;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f40114n = new Runnable() { // from class: de.blinkt.openvpn.core.x
        @Override // java.lang.Runnable
        public final void run() {
            this.f40100a.n();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f40115o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z.b f40116p = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.E(C1721d.a.SOCKS5, "127.0.0.1", Integer.toString(9050), false);
            z.d(y.this.f40105e).f(y.this.f40116p);
        }
    }

    public class b implements z.b {
        public b() {
        }

        @Override // de.blinkt.openvpn.core.z.b
        public void a() {
            G.m("Orbot not yet installed");
        }

        @Override // de.blinkt.openvpn.core.z.b
        public void b(Intent intent) {
            StringBuilder sb = new StringBuilder();
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                sb.append(String.format(Locale.ENGLISH, "%s - '%s'", str, obj == null ? Constants.NULL_VERSION_ID : obj.toString()));
            }
            G.m("Got Orbot status: " + ((Object) sb));
        }

        @Override // de.blinkt.openvpn.core.z.b
        public void c(Intent intent, String str, int i9) {
            y.this.f40102a.removeCallbacks(y.this.f40115o);
            y.this.E(C1721d.a.SOCKS5, str, Integer.toString(i9), false);
            z.d(y.this.f40105e).f(this);
        }

        @Override // de.blinkt.openvpn.core.z.b
        public void d(Intent intent) {
            G.z("Orbot integration for external applications is disabled. Waiting %ds before connecting to the default port. Enable external app integration in Orbot or use Socks v5 config instead of Orbot to avoid this delay.");
        }
    }

    public y(f8.l lVar, OpenVPNService openVPNService) {
        this.f40104d = lVar;
        this.f40105e = openVPNService;
        this.f40102a = new Handler(openVPNService.getMainLooper());
    }

    public static boolean I() {
        boolean z9;
        Vector<y> vector = f40101r;
        synchronized (vector) {
            z9 = false;
            for (y yVar : vector) {
                boolean zO = yVar.o("signal SIGINT\n");
                try {
                    LocalSocket localSocket = yVar.f40103c;
                    if (localSocket != null) {
                        localSocket.close();
                    }
                } catch (IOException unused) {
                }
                z9 = zO;
            }
        }
        return z9;
    }

    public final void A(String str) {
        String[] strArrSplit = str.split(",", 3);
        G.I(strArrSplit[1], strArrSplit[2].equals(",,") ? "" : strArrSplit[2]);
    }

    public final void B(FileDescriptor fileDescriptor) {
        try {
            if (!this.f40105e.protect(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileDescriptor, null)).intValue())) {
                G.z("Could not protect VPN socket");
            }
            l(fileDescriptor);
        } catch (IllegalAccessException e9) {
            e = e9;
            G.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e);
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve fd from socket: ");
            sb.append(fileDescriptor);
            Log.d("Openvpn", sb.toString());
        } catch (IllegalArgumentException e10) {
            e = e10;
            G.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to retrieve fd from socket: ");
            sb2.append(fileDescriptor);
            Log.d("Openvpn", sb2.toString());
        } catch (NoSuchMethodException e11) {
            e = e11;
            G.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e);
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Failed to retrieve fd from socket: ");
            sb22.append(fileDescriptor);
            Log.d("Openvpn", sb22.toString());
        } catch (NullPointerException e12) {
            e = e12;
            G.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e);
            StringBuilder sb222 = new StringBuilder();
            sb222.append("Failed to retrieve fd from socket: ");
            sb222.append(fileDescriptor);
            Log.d("Openvpn", sb222.toString());
        } catch (InvocationTargetException e13) {
            e = e13;
            G.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e);
            StringBuilder sb2222 = new StringBuilder();
            sb2222.append("Failed to retrieve fd from socket: ");
            sb2222.append(fileDescriptor);
            Log.d("Openvpn", sb2222.toString());
        }
    }

    public void C() {
        if (this.f40108h) {
            D();
        }
    }

    public final void D() {
        this.f40102a.removeCallbacks(this.f40114n);
        if (System.currentTimeMillis() - this.f40109i < 5000) {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
        }
        this.f40108h = false;
        this.f40109i = System.currentTimeMillis();
        o("hold release\n");
        o("bytecount 2\n");
        o("state on\n");
    }

    public final void E(C1721d.a aVar, String str, String str2, boolean z9) {
        String str3;
        if (aVar == C1721d.a.NONE || str == null) {
            str3 = "proxy NONE\n";
        } else {
            G.t(a7.j.f13415v8, str, str);
            str3 = String.format(Locale.ENGLISH, "proxy %s %s %s%s\n", aVar == C1721d.a.HTTP ? HttpVersion.HTTP : "SOCKS", str, str2, z9 ? " auto" : "");
        }
        o(str3);
    }

    public final boolean F(String str, String str2) {
        if (!str2.equals("tun")) {
            G.p(String.format("Device type %s requested, but only tun is possible with the Android API, sorry!", str2));
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptorE1 = this.f40105e.E1();
        if (parcelFileDescriptorE1 == null) {
            return false;
        }
        int fd = parcelFileDescriptorE1.getFd();
        try {
            Method declaredMethod = FileDescriptor.class.getDeclaredMethod("setInt$", Integer.TYPE);
            FileDescriptor fileDescriptor = new FileDescriptor();
            declaredMethod.invoke(fileDescriptor, Integer.valueOf(fd));
            this.f40103c.setFileDescriptorsForSend(new FileDescriptor[]{fileDescriptor});
            o(String.format("needok '%s' %s\n", str, "ok"));
            this.f40103c.setFileDescriptorsForSend(null);
            parcelFileDescriptorE1.close();
            return true;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e9) {
            G.s("Could not send fd over socket", e9);
            return false;
        }
    }

    public boolean G() {
        n.a aVar = this.f40112l;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    public void H() {
        this.f40102a.removeCallbacks(this.f40114n);
        if (this.f40108h) {
            G.H(this.f40111k);
        } else {
            o("signal SIGUSR1\n");
        }
    }

    @Override // de.blinkt.openvpn.core.n
    public boolean a(boolean z9) {
        boolean zI = I();
        if (zI) {
            this.f40113m = true;
        }
        return zI;
    }

    @Override // de.blinkt.openvpn.core.n
    public void b(n.b bVar) {
        this.f40111k = bVar;
        H();
    }

    @Override // de.blinkt.openvpn.core.n
    public void c(String str) {
        o("cr-response " + str + "\n");
    }

    @Override // de.blinkt.openvpn.core.n
    public void d(boolean z9) {
        if (this.f40108h) {
            C();
        } else {
            o(z9 ? "network-change samenetwork\n" : "network-change\n");
        }
    }

    @Override // de.blinkt.openvpn.core.n
    public void e(n.a aVar) {
        this.f40112l = aVar;
    }

    public final void l(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception e9) {
            G.s("Failed to close fd (" + fileDescriptor + ")", e9);
        }
    }

    public final void m(String str) {
        this.f40108h = true;
        int i9 = Integer.parseInt(str.split(":")[1]);
        if (!G()) {
            G.H(this.f40111k);
            return;
        }
        if (i9 > 1) {
            G.J("CONNECTRETRY", String.valueOf(i9), a7.j.f13051K7, EnumC1722e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET);
        }
        this.f40102a.postDelayed(this.f40114n, i9 * 1000);
        if (i9 > 5) {
            G.t(a7.j.f13051K7, String.valueOf(i9));
        } else {
            G.l(a7.j.f13051K7, String.valueOf(i9));
        }
    }

    public final /* synthetic */ void n() {
        if (G()) {
            D();
        }
    }

    public boolean o(String str) {
        try {
            LocalSocket localSocket = this.f40103c;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return false;
            }
            this.f40103c.getOutputStream().write(str.getBytes());
            this.f40103c.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean p(Context context) {
        String str = context.getCacheDir().getAbsolutePath() + "/mgmtsocket";
        this.f40110j = new LocalSocket();
        for (int i9 = 8; i9 > 0 && !this.f40110j.isBound(); i9--) {
            try {
                this.f40110j.bind(new LocalSocketAddress(str, LocalSocketAddress.Namespace.FILESYSTEM));
            } catch (IOException unused) {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        try {
            this.f40107g = new LocalServerSocket(this.f40110j.getFileDescriptor());
            return true;
        } catch (IOException e9) {
            G.r(e9);
            return false;
        }
    }

    public final void q(String str, String str2) {
        G.J("AUTH_FAILED", str + str2, a7.j.f13374r7, EnumC1722e.LEVEL_AUTH_FAILED);
    }

    public final void r(String str) {
        int iIndexOf = str.indexOf(44);
        G.G(Long.parseLong(str.substring(0, iIndexOf)), Long.parseLong(str.substring(iIndexOf + 1)));
    }

    @Override // de.blinkt.openvpn.core.n
    public void resume() {
        C();
        this.f40111k = n.b.noNetwork;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            java.lang.String r1 = ""
            java.util.Vector r2 = de.blinkt.openvpn.core.y.f40101r
            monitor-enter(r2)
            r2.add(r7)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            android.net.LocalServerSocket r2 = r7.f40107g     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            android.net.LocalSocket r2 = r2.accept()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r7.f40103c = r2     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            android.net.LocalServerSocket r3 = r7.f40107g     // Catch: java.lang.Exception -> L1f java.io.IOException -> L21
            r3.close()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L21
            goto L25
        L1f:
            r0 = move-exception
            goto L66
        L21:
            r3 = move-exception
            de.blinkt.openvpn.core.G.r(r3)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
        L25:
            java.lang.String r3 = "version 3\n"
            r7.o(r3)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
        L2a:
            int r3 = r2.read(r0)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r4 = -1
            if (r3 != r4) goto L32
            return
        L32:
            android.net.LocalSocket r4 = r7.f40103c     // Catch: java.lang.Exception -> L1f java.io.IOException -> L39
            java.io.FileDescriptor[] r4 = r4.getAncillaryFileDescriptors()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L39
            goto L40
        L39:
            r4 = move-exception
            java.lang.String r5 = "Error reading fds from socket"
            de.blinkt.openvpn.core.G.s(r5, r4)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r4 = 0
        L40:
            if (r4 == 0) goto L4a
            java.util.LinkedList r5 = r7.f40106f     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.util.Collections.addAll(r5, r4)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            goto L4a
        L48:
            r0 = move-exception
            goto L81
        L4a:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r4.<init>(r0, r6, r3, r5)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r3.<init>()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r3.append(r1)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            r3.append(r4)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            java.lang.String r1 = r7.u(r1)     // Catch: java.lang.Exception -> L1f java.io.IOException -> L48
            goto L2a
        L66:
            java.lang.String r1 = "openvpn"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "exception:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
            goto L9c
        L81:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "socket closed"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9c
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Connection reset by peer"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9c
            de.blinkt.openvpn.core.G.r(r0)
        L9c:
            java.util.Vector r0 = de.blinkt.openvpn.core.y.f40101r
            monitor-enter(r0)
            r0.remove(r7)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            return
        La4:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r1
        La7:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.y.run():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.y.s(java.lang.String):void");
    }

    public final void t(String str) {
        if (str.startsWith("OPEN_URL:") || str.startsWith("CR_TEXT:") || str.startsWith("WEB_AUTH:")) {
            this.f40105e.S1(str);
            return;
        }
        G.m("Info message from server:" + str);
    }

    public final String u(String str) {
        while (str.contains("\n")) {
            String[] strArrSplit = str.split("\\r?\\n", 2);
            s(strArrSplit[0]);
            str = strArrSplit.length == 1 ? "" : strArrSplit[1];
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            java.lang.String r2 = ","
            r3 = 4
            java.lang.String[] r2 = r8.split(r2, r3)
            java.lang.String r4 = "OpenVPN"
            android.util.Log.d(r4, r8)
            r8 = 1
            r4 = r2[r8]
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case 68: goto L3d;
                case 70: goto L34;
                case 73: goto L29;
                case 87: goto L1e;
                default: goto L1c;
            }
        L1c:
            r8 = -1
            goto L47
        L1e:
            java.lang.String r8 = "W"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L27
            goto L1c
        L27:
            r8 = 3
            goto L47
        L29:
            java.lang.String r8 = "I"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L32
            goto L1c
        L32:
            r8 = 2
            goto L47
        L34:
            java.lang.String r6 = "F"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L47
            goto L1c
        L3d:
            java.lang.String r8 = "D"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L46
            goto L1c
        L46:
            r8 = 0
        L47:
            switch(r8) {
                case 0: goto L53;
                case 1: goto L50;
                case 2: goto L4a;
                case 3: goto L4d;
                default: goto L4a;
            }
        L4a:
            de.blinkt.openvpn.core.G$c r8 = de.blinkt.openvpn.core.G.c.INFO
            goto L55
        L4d:
            de.blinkt.openvpn.core.G$c r8 = de.blinkt.openvpn.core.G.c.WARNING
            goto L55
        L50:
            de.blinkt.openvpn.core.G$c r8 = de.blinkt.openvpn.core.G.c.ERROR
            goto L55
        L53:
            de.blinkt.openvpn.core.G$c r8 = de.blinkt.openvpn.core.G.c.VERBOSE
        L55:
            r1 = r2[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            r1 = r1 & 15
            r0 = r2[r0]
            java.lang.String r2 = "MANAGEMENT: CMD"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L6b
            int r1 = java.lang.Math.max(r3, r1)
        L6b:
            de.blinkt.openvpn.core.G.x(r8, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.y.v(java.lang.String):void");
    }

    public final void w(String str) {
        String strSubstring;
        String str2;
        String str3;
        String strX1;
        int iIndexOf = str.indexOf(39) + 1;
        strSubstring = str.substring(iIndexOf, str.indexOf(39, iIndexOf));
        str2 = str.split(":", 2)[1];
        strSubstring.hashCode();
        switch (strSubstring) {
            case "PROTECTFD":
                B((FileDescriptor) this.f40106f.pollFirst());
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "IFCONFIG":
                String[] strArrSplit = str2.split(" ");
                this.f40105e.M1(strArrSplit[0], strArrSplit[1], Integer.parseInt(strArrSplit[2]), strArrSplit[3]);
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "ROUTE6":
                String[] strArrSplit2 = str2.split(" ");
                this.f40105e.m1(strArrSplit2[0], strArrSplit2[1]);
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "DNSDOMAIN":
                this.f40105e.K1(str2);
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "HTTPPROXY":
                String[] strArrSplit3 = str2.split(" ");
                if (strArrSplit3.length != 2) {
                    str3 = "Unrecognized HTTPPROXY cmd: " + Arrays.toString(strArrSplit3) + " | " + str;
                    G.p(str3);
                    strX1 = "ok";
                    o(String.format("needok '%s' %s\n", strSubstring, strX1));
                    break;
                } else {
                    this.f40105e.i1(strArrSplit3[0], Integer.parseInt(strArrSplit3[1]));
                    strX1 = "ok";
                    o(String.format("needok '%s' %s\n", strSubstring, strX1));
                    break;
                }
                break;
            case "DNSSERVER":
            case "DNS6SERVER":
                this.f40105e.h1(str2);
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "OPENTUN":
                if (!F(strSubstring, str2)) {
                    strX1 = "cancel";
                    o(String.format("needok '%s' %s\n", strSubstring, strX1));
                    break;
                }
                break;
            case "ROUTE":
                String[] strArrSplit4 = str2.split(" ");
                if (strArrSplit4.length == 5) {
                    this.f40105e.l1(strArrSplit4[0], strArrSplit4[1], strArrSplit4[2], strArrSplit4[4]);
                } else if (strArrSplit4.length >= 3) {
                    this.f40105e.l1(strArrSplit4[0], strArrSplit4[1], strArrSplit4[2], null);
                } else {
                    str3 = "Unrecognized ROUTE cmd:" + Arrays.toString(strArrSplit4) + " | " + str;
                    G.p(str3);
                }
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "IFCONFIG6":
                String[] strArrSplit5 = str2.split(" ");
                this.f40105e.O1(Integer.parseInt(strArrSplit5[1]));
                this.f40105e.N1(strArrSplit5[0]);
                strX1 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            case "PERSIST_TUN_ACTION":
                strX1 = this.f40105e.x1();
                o(String.format("needok '%s' %s\n", strSubstring, strX1));
                break;
            default:
                Log.e("openvpn", "Unknown needok command " + str);
                break;
        }
    }

    public final void x(String str) {
        String str2;
        C1721d c1721d;
        try {
            if (str.startsWith("Auth-Token:")) {
                return;
            }
            int iIndexOf = str.indexOf(39) + 1;
            int iIndexOf2 = str.indexOf(39, iIndexOf);
            String strSubstring = str.substring(iIndexOf, iIndexOf2);
            if (str.startsWith("Verification Failed")) {
                q(strSubstring, str.substring(iIndexOf2 + 1));
                return;
            }
            String strV = null;
            if (strSubstring.equals("Private Key")) {
                strV = this.f40104d.w();
                str2 = null;
            } else if (strSubstring.equals("Auth")) {
                strV = this.f40104d.v();
                str2 = this.f40104d.f40864B;
            } else if (!strSubstring.equals("HTTP Proxy") || (c1721d = this.f40117q) == null) {
                str2 = null;
            } else {
                strV = c1721d.f40053n;
                str2 = c1721d.f40052m;
            }
            if (strV == null) {
                this.f40105e.H1(a7.j.f13174X4, strSubstring);
                G.p(String.format("Openvpn requires Authentication type '%s' but no password/key information available", strSubstring));
            } else {
                if (str2 != null) {
                    o(String.format("username '%s' %s\n", strSubstring, f8.l.I(str2)));
                }
                o(String.format("password '%s' %s\n", strSubstring, f8.l.I(strV)));
            }
        } catch (StringIndexOutOfBoundsException unused) {
            G.p("Could not parse management Password command: " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ","
            r1 = 3
            java.lang.String[] r10 = r10.split(r0, r1)
            de.blinkt.openvpn.core.d$a r0 = de.blinkt.openvpn.core.C1721d.a.NONE
            r1 = 0
            r2 = r10[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 1
            int r2 = r2 - r3
            f8.l r4 = r9.f40104d
            de.blinkt.openvpn.core.d[] r4 = r4.f40887Y
            int r5 = r4.length
            r6 = 0
            if (r5 <= r2) goto L27
            r2 = r4[r2]
            de.blinkt.openvpn.core.d$a r4 = r2.f40048i
            java.lang.String r5 = r2.f40049j
            java.lang.String r7 = r2.f40050k
            boolean r8 = r2.f40051l
            r9.f40117q = r2
            goto L3e
        L27:
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r2
            java.lang.String r2 = "OpenVPN is asking for a proxy of an unknown connection entry (%d)"
            java.lang.String r2 = java.lang.String.format(r4, r2, r5)
            de.blinkt.openvpn.core.G.p(r2)
            r4 = r0
            r5 = r6
            r7 = r5
            r8 = 0
        L3e:
            if (r4 != r0) goto L5b
            f8.l r0 = r9.f40104d
            java.net.SocketAddress r0 = de.blinkt.openvpn.core.D.a(r0)
            boolean r2 = r0 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L5b
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            de.blinkt.openvpn.core.d$a r4 = de.blinkt.openvpn.core.C1721d.a.HTTP
            java.lang.String r5 = r0.getHostName()
            int r0 = r0.getPort()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            goto L5c
        L5b:
            r1 = r8
        L5c:
            int r0 = r10.length
            r2 = 2
            if (r0 < r2) goto L74
            de.blinkt.openvpn.core.d$a r0 = de.blinkt.openvpn.core.C1721d.a.HTTP
            if (r4 != r0) goto L74
            r10 = r10[r3]
            java.lang.String r0 = "UDP"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L74
            java.lang.String r10 = "Not using an HTTP proxy since the connection uses UDP"
            de.blinkt.openvpn.core.G.u(r10)
            goto L75
        L74:
            r6 = r5
        L75:
            de.blinkt.openvpn.core.d$a r10 = de.blinkt.openvpn.core.C1721d.a.ORBOT
            if (r4 != r10) goto Lab
            int r10 = a7.j.f13061L7
            de.blinkt.openvpn.core.e r0 = de.blinkt.openvpn.core.EnumC1722e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET
            java.lang.String r1 = "WAIT_ORBOT"
            java.lang.String r2 = "Waiting for Orbot to start"
            de.blinkt.openvpn.core.G.J(r1, r2, r10, r0)
            de.blinkt.openvpn.core.OpenVPNService r10 = r9.f40105e
            de.blinkt.openvpn.core.z r10 = de.blinkt.openvpn.core.z.d(r10)
            de.blinkt.openvpn.core.OpenVPNService r0 = r9.f40105e
            boolean r0 = de.blinkt.openvpn.core.z.c(r0)
            if (r0 != 0) goto L97
            java.lang.String r0 = "Orbot does not seem to be installed!"
            de.blinkt.openvpn.core.G.p(r0)
        L97:
            android.os.Handler r0 = r9.f40102a
            java.lang.Runnable r1 = r9.f40115o
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)
            de.blinkt.openvpn.core.OpenVPNService r0 = r9.f40105e
            de.blinkt.openvpn.core.z$b r1 = r9.f40116p
            r10.b(r0, r1)
            r10.g()
            goto Lae
        Lab:
            r9.E(r4, r6, r7, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.y.y(java.lang.String):void");
    }

    public final void z(String str) {
        String[] strArrSplit = str.split(",");
        String strY = this.f40104d.y(this.f40105e, strArrSplit[0], strArrSplit[1].equals("RSA_PKCS1_PADDING"));
        o("pk-sig\n");
        if (strY == null) {
            o("\nEND\n");
            I();
        } else {
            o(strY);
            o("\nEND\n");
        }
    }
}
