package de.blinkt.openvpn.core;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ProxyInfo;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import de.blinkt.openvpn.core.C1721d;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.l;
import g8.AbstractActivityC1843a;
import h8.C1869b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class OpenVPNService extends VpnService implements G.e, Handler.Callback, G.b, InterfaceC1725h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f39987y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39992f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f8.l f39994h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39997k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1723f f39999m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f40002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n f40003q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f40005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f40006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f40007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Toast f40008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Runnable f40009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProxyInfo f40010x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f39988a = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f39989c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f39990d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39991e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f39993g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39995i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1718a f39996j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39998l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40000n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40001o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final IBinder f40004r = new a();

    public class a extends InterfaceC1725h.a {
        public a() {
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public void H0(String str) {
            OpenVPNService.this.H0(str);
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public void L0(String str) {
            OpenVPNService.this.L0(str);
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public void T(boolean z9) {
            OpenVPNService.this.T(z9);
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public boolean a(boolean z9) {
            return OpenVPNService.this.a(z9);
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public boolean protect(int i9) {
            return OpenVPNService.this.protect(i9);
        }

        @Override // de.blinkt.openvpn.core.InterfaceC1725h
        public boolean s(String str) {
            return OpenVPNService.this.s(str);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f40012a;

        public b(String str) {
            this.f40012a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenVPNService.this.f40008v != null) {
                OpenVPNService.this.f40008v.cancel();
            }
            String str = String.format(Locale.getDefault(), "%s - %s", OpenVPNService.this.f39994h.f40891d, this.f40012a);
            OpenVPNService openVPNService = OpenVPNService.this;
            openVPNService.f40008v = Toast.makeText(openVPNService.getBaseContext(), str, 0);
            OpenVPNService.this.f40008v.show();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenVPNService.this.Q1();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenVPNService.this.f39999m != null) {
                OpenVPNService.this.T1();
            }
            OpenVPNService openVPNService = OpenVPNService.this;
            openVPNService.G1(openVPNService.f40003q);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40016a = new int[EnumC1722e.values().length];
    }

    public static String y1(long j9, boolean z9, Resources resources) {
        if (z9) {
            j9 *= 8;
        }
        double d9 = j9;
        double d10 = z9 ? 1000 : 1024;
        int iMax = Math.max(0, Math.min((int) (Math.log(d9) / Math.log(d10)), 3));
        float fPow = (float) (d9 / Math.pow(d10, iMax));
        return z9 ? iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(a7.j.f13319m2, Float.valueOf(fPow)) : resources.getString(a7.j.f13300k3, Float.valueOf(fPow)) : resources.getString(a7.j.f13076N2, Float.valueOf(fPow)) : resources.getString(a7.j.f13151V, Float.valueOf(fPow)) : iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(a7.j.f12952A8, Float.valueOf(fPow)) : resources.getString(a7.j.f12972C8, Float.valueOf(fPow)) : resources.getString(a7.j.f12962B8, Float.valueOf(fPow)) : resources.getString(a7.j.f13455z8, Float.valueOf(fPow));
    }

    public final boolean A1(String str) {
        return str != null && (str.startsWith("tun") || "(null)".equals(str) || "vpnservice-tun".equals(str));
    }

    public final boolean B1() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isLockdownEnabled();
        }
        return false;
    }

    public final void C1(int i9, Notification.Builder builder) {
        if (i9 != 0) {
            try {
                builder.getClass().getMethod("setPriority", Integer.TYPE).invoke(builder, Integer.valueOf(i9));
                builder.getClass().getMethod("setUsesChronometer", Boolean.TYPE).invoke(builder, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e9) {
                G.r(e9);
            }
        }
    }

    public final void D1(Notification.Builder builder, String str) {
        builder.setCategory(str);
        builder.setLocalOnly(true);
    }

    @Override // de.blinkt.openvpn.core.G.b
    public void E(long j9, long j10, long j11, long j12) {
        if (this.f40000n) {
            P1(String.format(getString(a7.j.f13081N7), y1(j9, false, getResources()), y1(j11 / 2, true, getResources()), y1(j10, false, getResources()), y1(j12 / 2, true, getResources())), null, "openvpn_bg", this.f40002p, EnumC1722e.LEVEL_CONNECTED, null);
        }
    }

    public ParcelFileDescriptor E1() {
        int i9;
        String string;
        String str;
        VpnService.Builder builder = new VpnService.Builder(this);
        G.t(a7.j.f13116R2, new Object[0]);
        boolean z9 = !this.f39994h.f40931x0;
        if (z9) {
            p1(builder);
        }
        C1718a c1718a = this.f39996j;
        if (c1718a == null && this.f39998l == null) {
            G.p(getString(a7.j.f13098P4));
            return null;
        }
        if (c1718a != null) {
            if (!f8.l.h(this)) {
                j1();
            }
            try {
                C1718a c1718a2 = this.f39996j;
                builder.addAddress(c1718a2.f40030a, c1718a2.f40031b);
            } catch (IllegalArgumentException e9) {
                G.o(a7.j.f13114R0, this.f39996j, e9.getLocalizedMessage());
                return null;
            }
        }
        String str2 = this.f39998l;
        if (str2 != null) {
            String[] strArrSplit = str2.split("/");
            try {
                builder.addAddress(strArrSplit[0], Integer.parseInt(strArrSplit[1]));
            } catch (IllegalArgumentException e10) {
                G.o(a7.j.f13026I2, this.f39998l, e10.getLocalizedMessage());
                return null;
            }
        }
        for (String str3 : this.f39988a) {
            try {
                builder.addDnsServer(str3);
            } catch (IllegalArgumentException e11) {
                G.o(a7.j.f13114R0, str3, e11.getLocalizedMessage());
            }
        }
        String str4 = Build.VERSION.RELEASE;
        builder.setMtu(this.f39997k);
        Collection<l.a> collectionF = this.f39989c.f();
        Collection<l.a> collectionF2 = this.f39990d.f();
        if ("samsung".equals(Build.BRAND) && this.f39988a.size() >= 1) {
            try {
                l.a aVar = new l.a(new C1718a((String) this.f39988a.get(0), 32), true);
                Iterator it = collectionF.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (((l.a) it.next()).c(aVar)) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    G.z(String.format("Warning Samsung Android 5.0+ devices ignore DNS servers outside the VPN range. To enable DNS resolution a route to your DNS Server (%s) has been added.", this.f39988a.get(0)));
                    collectionF.add(aVar);
                }
            } catch (Exception unused) {
                if (!((String) this.f39988a.get(0)).contains(":")) {
                    G.p("Error parsing DNS Server IP: " + ((String) this.f39988a.get(0)));
                }
            }
        }
        l.a aVar2 = new l.a(new C1718a("224.0.0.0", 3), true);
        for (l.a aVar3 : collectionF) {
            try {
                if (aVar2.c(aVar3)) {
                    G.l(a7.j.f13379s2, aVar3.toString());
                } else {
                    builder.addRoute(aVar3.i(), aVar3.f40086c);
                }
            } catch (IllegalArgumentException e12) {
                G.p(getString(a7.j.f13373r6) + aVar3 + " " + e12.getLocalizedMessage());
            }
        }
        for (l.a aVar4 : collectionF2) {
            try {
                builder.addRoute(aVar4.j(), aVar4.f40086c);
            } catch (IllegalArgumentException e13) {
                G.p(getString(a7.j.f13373r6) + aVar4 + " " + e13.getLocalizedMessage());
            }
        }
        String str5 = this.f39995i;
        if (str5 != null) {
            builder.addSearchDomain(str5);
        }
        String str6 = z9 ? "(not set, allowed)" : "(not set)";
        String str7 = str6;
        C1718a c1718a3 = this.f39996j;
        if (c1718a3 != null) {
            int i10 = c1718a3.f40031b;
            String str8 = c1718a3.f40030a;
            i9 = i10;
            str6 = str8;
        } else {
            i9 = -1;
        }
        String str9 = this.f39998l;
        if (str9 != null) {
            str7 = str9;
        }
        if ((!this.f39989c.e(false).isEmpty() || !this.f39990d.e(false).isEmpty()) && B1()) {
            G.u("VPN lockdown enabled (do not allow apps to bypass VPN) enabled. Route exclusion will not allow apps to bypass VPN (e.g. bypass VPN for local networks)");
        }
        G.t(a7.j.f13190Z2, str6, Integer.valueOf(i9), str7, Integer.valueOf(this.f39997k));
        G.t(a7.j.f13124S0, TextUtils.join(", ", this.f39988a), this.f39995i);
        G.t(a7.j.f13403u6, TextUtils.join(", ", this.f39989c.e(true)), TextUtils.join(", ", this.f39990d.e(true)));
        G.t(a7.j.f13393t6, TextUtils.join(", ", this.f39989c.e(false)), TextUtils.join(", ", this.f39990d.e(false)));
        ProxyInfo proxyInfo = this.f40010x;
        if (proxyInfo != null) {
            G.t(a7.j.f13049K5, proxyInfo.getHost(), Integer.valueOf(this.f40010x.getPort()));
        }
        G.l(a7.j.f13383s6, TextUtils.join(", ", collectionF), TextUtils.join(", ", collectionF2));
        int i11 = Build.VERSION.SDK_INT;
        J1(builder);
        if (i11 >= 22) {
            builder.setUnderlyingNetworks(null);
        }
        if (i11 >= 29) {
            builder.setMetered(false);
        }
        String str10 = this.f39994h.f40891d;
        C1718a c1718a4 = this.f39996j;
        if (c1718a4 == null || (str = this.f39998l) == null) {
            int i12 = a7.j.f13120R6;
            string = c1718a4 != null ? getString(i12, str10, c1718a4) : getString(i12, str10, this.f39998l);
        } else {
            string = getString(a7.j.f13130S6, str10, c1718a4, str);
        }
        builder.setSession(string);
        if (this.f39988a.size() == 0) {
            G.t(a7.j.f13082N8, new Object[0]);
        }
        L1(builder);
        this.f40005s = w1();
        this.f39988a.clear();
        this.f39989c.c();
        this.f39990d.c();
        this.f39996j = null;
        this.f39998l = null;
        this.f39995i = null;
        this.f40010x = null;
        builder.setConfigureIntent(t1());
        try {
            ParcelFileDescriptor parcelFileDescriptorEstablish = builder.establish();
            if (parcelFileDescriptorEstablish != null) {
                return parcelFileDescriptorEstablish;
            }
            throw new NullPointerException("Android establish() method returned null (Really broken network configuration?)");
        } catch (Exception e14) {
            G.n(a7.j.f13186Y7);
            G.p(getString(a7.j.f13015H1) + e14.getLocalizedMessage());
            return null;
        }
    }

    public void F1() {
        r1();
    }

    public synchronized void G1(n nVar) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        C1723f c1723f = new C1723f(nVar);
        this.f39999m = c1723f;
        c1723f.i(this);
        registerReceiver(this.f39999m, intentFilter);
        G.a(this.f39999m);
    }

    @Override // de.blinkt.openvpn.core.InterfaceC1725h
    public void H0(String str) {
        new C1869b(this).a(str);
    }

    public void H1(int i9, String str) {
        EnumC1722e enumC1722e = EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT;
        G.J("NEED", "need " + str, i9, enumC1722e);
        P1(getString(i9), getString(i9), "openvpn_newstat", 0L, enumC1722e, null);
    }

    public final boolean I1() {
        return ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4;
    }

    public final void J1(VpnService.Builder builder) {
        boolean z9 = false;
        for (C1721d c1721d : this.f39994h.f40887Y) {
            if (c1721d.f40048i == C1721d.a.ORBOT) {
                z9 = true;
            }
        }
        if (z9) {
            G.m("VPN Profile uses at least one server entry with Orbot. Setting up VPN so that OrBot is not redirected over VPN.");
        }
        if (this.f39994h.f40895f0 && z9) {
            try {
                builder.addDisallowedApplication("org.torproject.android");
            } catch (PackageManager.NameNotFoundException unused) {
                G.m("Orbot not installed?");
            }
        }
        try {
            builder.addAllowedApplication(getPackageName());
        } catch (PackageManager.NameNotFoundException e9) {
            G.p("This should not happen: " + e9.getLocalizedMessage());
        }
        f8.l lVar = this.f39994h;
        if (lVar.f40895f0) {
            G.l(a7.j.f13104Q0, TextUtils.join(", ", lVar.f40893e0));
        } else {
            G.l(a7.j.f12963C, TextUtils.join(", ", lVar.f40893e0));
        }
        if (this.f39994h.f40897g0) {
            builder.allowBypass();
            G.m("Apps may bypass VPN");
        }
    }

    public void K1(String str) {
        if (this.f39995i == null) {
            this.f39995i = str;
        }
    }

    @Override // de.blinkt.openvpn.core.InterfaceC1725h
    public void L0(String str) {
        if (this.f40003q != null) {
            this.f40003q.c(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 0));
        }
    }

    public final void L1(VpnService.Builder builder) {
        ProxyInfo proxyInfo = this.f40010x;
        if (proxyInfo != null && Build.VERSION.SDK_INT >= 29) {
            builder.setHttpProxy(proxyInfo);
        } else if (proxyInfo != null) {
            G.z("HTTP Proxy needs Android 10 or later.");
        }
    }

    public void M1(String str, String str2, int i9, String str3) {
        long j9;
        int i10;
        this.f39996j = new C1718a(str, str2);
        this.f39997k = i9;
        this.f40006t = null;
        long jC = C1718a.c(str2);
        if (this.f39996j.f40031b == 32 && !str2.equals("255.255.255.255")) {
            if ("net30".equals(str3)) {
                j9 = -4;
                i10 = 30;
            } else {
                j9 = -2;
                i10 = 31;
            }
            long j10 = jC & j9;
            long jB = this.f39996j.b() & j9;
            C1718a c1718a = this.f39996j;
            if (j10 == jB) {
                c1718a.f40031b = i10;
            } else {
                c1718a.f40031b = 32;
                if (!"p2p".equals(str3)) {
                    G.y(a7.j.f13046K2, str, str2, str3);
                }
            }
        }
        if (("p2p".equals(str3) && this.f39996j.f40031b < 32) || ("net30".equals(str3) && this.f39996j.f40031b < 30)) {
            G.y(a7.j.f13036J2, str, str2, str3);
        }
        C1718a c1718a2 = this.f39996j;
        int i11 = c1718a2.f40031b;
        if (i11 <= 31) {
            C1718a c1718a3 = new C1718a(c1718a2.f40030a, i11);
            c1718a3.d();
            k1(c1718a3, true);
        }
        this.f40006t = str2;
    }

    public void N1(String str) {
        this.f39998l = str;
    }

    public void O1(int i9) {
        this.f39997k = i9;
    }

    public final void P1(String str, String str2, String str3, long j9, EnumC1722e enumC1722e, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        int iU1 = u1(enumC1722e);
        Notification.Builder builder = new Notification.Builder(this);
        int i9 = str3.equals("openvpn_bg") ? -2 : str3.equals("openvpn_userreq") ? 2 : 0;
        f8.l lVar = this.f39994h;
        builder.setContentTitle(lVar != null ? getString(a7.j.f13018H4, lVar.f40891d) : getString(a7.j.f13028I4));
        builder.setContentText(str);
        builder.setOnlyAlertOnce(true);
        builder.setOngoing(true);
        builder.setSmallIcon(iU1);
        builder.setContentIntent(enumC1722e == EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT ? PendingIntent.getActivity(this, 0, intent, 67108864) : t1());
        if (j9 != 0) {
            builder.setWhen(j9);
        }
        int i10 = Build.VERSION.SDK_INT;
        C1(i9, builder);
        o1(builder);
        D1(builder, "service");
        if (i10 >= 26) {
            notificationManager.createNotificationChannel(com.amplifyframework.storage.s3.service.b.a(str3, str3, 3));
            builder.setChannelId(str3);
            f8.l lVar2 = this.f39994h;
            if (lVar2 != null) {
                builder.setShortcutId(lVar2.B());
            }
        }
        if (str2 != null && !str2.equals("")) {
            builder.setTicker(str2);
        }
        Notification notification = builder.getNotification();
        int iHashCode = str3.hashCode();
        notificationManager.notify(iHashCode, notification);
        startForeground(iHashCode, notification);
        String str4 = this.f39992f;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.f39992f.hashCode());
        }
        if (!I1() || i9 < 0) {
            return;
        }
        this.f40007u.post(new b(str));
    }

    public final void Q1() {
        String canonicalPath;
        Runnable runnable;
        try {
            this.f39994h.N(this);
            String str = getApplicationInfo().nativeLibraryDir;
            try {
                canonicalPath = getApplication().getCacheDir().getCanonicalPath();
            } catch (IOException e9) {
                e9.printStackTrace();
                canonicalPath = "/tmp";
            }
            String[] strArrA = F.a(this);
            this.f40001o = true;
            R1();
            this.f40001o = false;
            boolean zH = f8.l.h(this);
            if (!zH) {
                y yVar = new y(this.f39994h, this);
                if (!yVar.p(this)) {
                    r1();
                    return;
                } else {
                    new Thread(yVar, "OpenVPNManagementThread").start();
                    this.f40003q = yVar;
                    G.u("started Socket Thread");
                }
            }
            if (zH) {
                n nVarZ1 = z1();
                runnable = (Runnable) nVarZ1;
                this.f40003q = nVarZ1;
            } else {
                w wVar = new w(this, strArrA, str, canonicalPath);
                this.f40009w = wVar;
                runnable = wVar;
            }
            synchronized (this.f39991e) {
                Thread thread = new Thread(runnable, "OpenVPNProcessThread");
                this.f39993g = thread;
                thread.start();
            }
            new Handler(getMainLooper()).post(new d());
        } catch (IOException e10) {
            G.s("Error writing config file", e10);
            r1();
        }
    }

    public final void R1() {
        if (this.f40003q != null) {
            Runnable runnable = this.f40009w;
            if (runnable != null) {
                ((w) runnable).b();
            }
            if (this.f40003q.a(true)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        s1();
    }

    public void S1(String str) {
        String str2 = str.split(":", 2)[0];
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setAutoCancel(true);
        builder.setSmallIcon(R.drawable.ic_dialog_info);
        str2.hashCode();
        if (!str2.equals("CR_TEXT")) {
            G.p("Unknown SSO method found: " + str2);
            return;
        }
        String str3 = str.split(":", 2)[1];
        int i9 = a7.j.f12964C0;
        builder.setContentTitle(getString(i9));
        builder.setContentText(str3);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.CredentialsPopup"));
        intent.putExtra("de.blinkt.openvpn.core.CR_TEXT_CHALLENGE", str3);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        G.K("USER_INPUT", "waiting for user input", i9, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT, intent);
        builder.setContentIntent(activity);
        int i10 = Build.VERSION.SDK_INT;
        C1(2, builder);
        D1(builder, "status");
        if (i10 >= 26) {
            builder.setChannelId("openvpn_userreq");
        }
        notificationManager.notify(-370124770, builder.getNotification());
    }

    @Override // de.blinkt.openvpn.core.InterfaceC1725h
    public void T(boolean z9) {
        C1723f c1723f = this.f39999m;
        if (c1723f != null) {
            c1723f.k(z9);
        }
    }

    public synchronized void T1() {
        C1723f c1723f = this.f39999m;
        if (c1723f != null) {
            try {
                G.C(c1723f);
                unregisterReceiver(this.f39999m);
            } catch (IllegalArgumentException e9) {
                e9.printStackTrace();
            }
            this.f39999m = null;
        } else {
            this.f39999m = null;
        }
    }

    public final void U1(f8.l lVar) {
        if (lVar == null) {
            return;
        }
        q.a(getSystemService(o.a())).reportShortcutUsed(lVar.B());
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
    }

    @Override // de.blinkt.openvpn.core.InterfaceC1725h
    public boolean a(boolean z9) {
        if (v1() != null) {
            return v1().a(z9);
        }
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f40004r;
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        q1(str, enumC1722e);
        if (this.f39993g != null || f39987y) {
            if (enumC1722e == EnumC1722e.LEVEL_CONNECTED) {
                this.f40000n = true;
                this.f40002p = System.currentTimeMillis();
                String str3 = I1() ? "openvpn_newstat" : "openvpn_bg";
                P1(G.f(this), G.f(this), str3, 0L, enumC1722e, intent);
            }
            this.f40000n = false;
            P1(G.f(this), G.f(this), str3, 0L, enumC1722e, intent);
        }
    }

    public void h1(String str) {
        this.f39988a.add(str);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback == null) {
            return false;
        }
        callback.run();
        return true;
    }

    public boolean i1(String str, int i9) {
        try {
            this.f40010x = ProxyInfo.buildDirectProxy(str, i9);
            return true;
        } catch (Exception e9) {
            G.p("Could not set proxy" + e9.getLocalizedMessage());
            return false;
        }
    }

    public final void j1() {
        Iterator it = m.a(this, false).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = ((String) it.next()).split("/");
            String str = strArrSplit[0];
            int i9 = Integer.parseInt(strArrSplit[1]);
            if (!str.equals(this.f39996j.f40030a) && this.f39994h.f40884V) {
                this.f39989c.a(new C1718a(str, i9), false);
            }
        }
        if (this.f39994h.f40884V) {
            Iterator it2 = m.a(this, true).iterator();
            while (it2.hasNext()) {
                n1((String) it2.next(), false);
            }
        }
    }

    public void k1(C1718a c1718a, boolean z9) {
        this.f39989c.a(c1718a, z9);
    }

    public void l1(String str, String str2, String str3, String str4) {
        C1718a c1718a = new C1718a(str, str2);
        boolean zA1 = A1(str4);
        l.a aVar = new l.a(new C1718a(str3, 32), false);
        C1718a c1718a2 = this.f39996j;
        if (c1718a2 == null) {
            G.p("Local IP address unset and received. Neither pushed server config nor local config specifies an IP addresses. Opening tun device is most likely going to fail.");
            return;
        }
        if (new l.a(c1718a2, true).c(aVar)) {
            zA1 = true;
        }
        if (str3 != null && (str3.equals("255.255.255.255") || str3.equals(this.f40006t))) {
            zA1 = true;
        }
        if (c1718a.f40031b == 32 && !str2.equals("255.255.255.255")) {
            G.y(a7.j.f13353p6, str, str2);
        }
        if (c1718a.d()) {
            G.y(a7.j.f13363q6, str, Integer.valueOf(c1718a.f40031b), c1718a.f40030a);
        }
        this.f39989c.a(c1718a, zA1);
    }

    public void m1(String str, String str2) {
        n1(str, A1(str2));
    }

    public void n1(String str, boolean z9) {
        String[] strArrSplit = str.split("/");
        try {
            this.f39990d.b((Inet6Address) InetAddress.getAllByName(strArrSplit[0])[0], Integer.parseInt(strArrSplit[1]), z9);
        } catch (UnknownHostException e9) {
            G.r(e9);
        }
    }

    public final void o1(Notification.Builder builder) {
        PendingIntent service;
        int i9;
        int i10;
        Intent intent = new Intent(this, (Class<?>) AbstractActivityC1843a.class);
        intent.setAction("de.blinkt.openvpn.DISCONNECT_VPN");
        builder.addAction(a7.e.f11894B0, getString(a7.j.f13227d0), PendingIntent.getActivity(this, 0, intent, 67108864));
        Intent intent2 = new Intent(this, (Class<?>) OpenVPNService.class);
        C1723f c1723f = this.f39999m;
        if (c1723f == null || !c1723f.h()) {
            intent2.setAction("de.blinkt.openvpn.PAUSE_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i9 = a7.e.f11965U0;
            i10 = a7.j.f13202a5;
        } else {
            intent2.setAction("de.blinkt.openvpn.RESUME_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i9 = a7.e.f11968V0;
            i10 = a7.j.f13333n6;
        }
        builder.addAction(i9, getString(i10), service);
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals("de.blinkt.openvpn.START_SERVICE")) ? super.onBind(intent) : this.f40004r;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.f39991e) {
            try {
                if (this.f39993g != null) {
                    this.f40003q.a(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1723f c1723f = this.f39999m;
        if (c1723f != null) {
            unregisterReceiver(c1723f);
        }
        G.E(this);
        G.e();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        G.n(a7.j.f13232d5);
        this.f40003q.a(false);
        r1();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final void p1(VpnService.Builder builder) {
        builder.allowFamily(OsConstants.AF_INET);
        builder.allowFamily(OsConstants.AF_INET6);
    }

    public final void q1(String str, EnumC1722e enumC1722e) {
        Intent intent = new Intent();
        intent.setAction("de.blinkt.openvpn.VPN_STATUS");
        intent.putExtra("status", enumC1722e.toString());
        intent.putExtra("detailstatus", str);
        sendBroadcast(intent, "android.permission.ACCESS_NETWORK_STATE");
    }

    public final void r1() {
        synchronized (this.f39991e) {
            this.f39993g = null;
        }
        G.C(this);
        T1();
        C.s(this);
        this.f40009w = null;
        if (this.f40001o) {
            return;
        }
        stopForeground(!f39987y);
        if (f39987y) {
            return;
        }
        stopSelf();
        G.E(this);
    }

    @Override // de.blinkt.openvpn.core.InterfaceC1725h
    public boolean s(String str) {
        return new C1869b(this).c(this, str);
    }

    public void s1() {
        synchronized (this.f39991e) {
            Thread thread = this.f39993g;
            if (thread != null) {
                thread.interrupt();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public PendingIntent t1() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.MainActivity"));
        intent.putExtra("PAGE", "graph");
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        intent.addFlags(131072);
        return activity;
    }

    public final int u1(EnumC1722e enumC1722e) {
        int i9 = e.f40016a[enumC1722e.ordinal()];
        return a7.i.f12942a;
    }

    public n v1() {
        return this.f40003q;
    }

    public final String w1() {
        String str = "TUNCFG UNQIUE STRING ips:";
        if (this.f39996j != null) {
            str = "TUNCFG UNQIUE STRING ips:" + this.f39996j.toString();
        }
        if (this.f39998l != null) {
            str = str + this.f39998l;
        }
        return (((((str + "routes: " + TextUtils.join("|", this.f39989c.e(true)) + TextUtils.join("|", this.f39990d.e(true))) + "excl. routes:" + TextUtils.join("|", this.f39989c.e(false)) + TextUtils.join("|", this.f39990d.e(false))) + "dns: " + TextUtils.join("|", this.f39988a)) + "domain: " + this.f39995i) + "mtu: " + this.f39997k) + "proxyInfo: " + this.f40010x;
    }

    public String x1() {
        if (w1().equals(this.f40005s)) {
            return "NOACTION";
        }
        String str = Build.VERSION.RELEASE;
        return "OPEN_BEFORE_CLOSE";
    }

    public final n z1() {
        try {
            return (n) Class.forName("de.blinkt.openvpn.core.OpenVPNThreadv3").getConstructor(OpenVPNService.class, f8.l.class).newInstance(this, this.f39994h);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
