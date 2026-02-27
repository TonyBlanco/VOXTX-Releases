package de.blinkt.openvpn.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.n;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1723f extends BroadcastReceiver implements G.b, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f40054a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f40056d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f40061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f40062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f40063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f40064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NetworkInfo f40065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList f40066n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40055c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40057e = 60;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40058f = 65536;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40059g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f40060h = c.DISCONNECTED;

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1723f c1723f = C1723f.this;
            c cVar = c1723f.f40060h;
            c cVar2 = c.PENDINGDISCONNECT;
            if (cVar != cVar2) {
                return;
            }
            c cVar3 = c.DISCONNECTED;
            c1723f.f40060h = cVar3;
            if (c1723f.f40061i == cVar2) {
                c1723f.f40061i = cVar3;
            }
            c1723f.f40056d.b(C1723f.this.g());
        }
    }

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.f$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f40068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40069b;

        public b(long j9, long j10) {
            this.f40068a = j9;
            this.f40069b = j10;
        }

        public /* synthetic */ b(long j9, long j10, a aVar) {
            this(j9, j10);
        }
    }

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.f$c */
    public enum c {
        SHOULDBECONNECTED,
        PENDINGDISCONNECT,
        DISCONNECTED
    }

    public C1723f(n nVar) {
        c cVar = c.SHOULDBECONNECTED;
        this.f40061i = cVar;
        this.f40062j = cVar;
        this.f40063k = null;
        this.f40064l = new a();
        this.f40066n = new LinkedList();
        this.f40056d = nVar;
        nVar.e(this);
        this.f40054a = new Handler();
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // de.blinkt.openvpn.core.G.b
    public void E(long j9, long j10, long j11, long j12) {
        LinkedList linkedList;
        if (this.f40061i != c.PENDINGDISCONNECT) {
            return;
        }
        this.f40066n.add(new b(System.currentTimeMillis(), j11 + j12, null));
        while (true) {
            long j13 = ((b) this.f40066n.getFirst()).f40068a;
            long jCurrentTimeMillis = System.currentTimeMillis() - 60000;
            linkedList = this.f40066n;
            if (j13 > jCurrentTimeMillis) {
                break;
            } else {
                linkedList.removeFirst();
            }
        }
        Iterator it = linkedList.iterator();
        long j14 = 0;
        while (it.hasNext()) {
            j14 += ((b) it.next()).f40069b;
        }
        if (j14 < 65536) {
            this.f40061i = c.DISCONNECTED;
            G.t(a7.j.f13433x6, "64 kB", 60);
            this.f40056d.b(g());
        }
    }

    @Override // de.blinkt.openvpn.core.n.a
    public boolean a() {
        return j();
    }

    public final void e() {
        this.f40066n.add(new b(System.currentTimeMillis(), 65536L, null));
    }

    public final NetworkInfo f(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public final n.b g() {
        c cVar = this.f40062j;
        c cVar2 = c.DISCONNECTED;
        return cVar == cVar2 ? n.b.userPause : this.f40061i == cVar2 ? n.b.screenOff : this.f40060h == cVar2 ? n.b.noNetwork : n.b.userPause;
    }

    public boolean h() {
        return this.f40062j == c.DISCONNECTED;
    }

    public void i(Context context) {
        String str;
        NetworkInfo networkInfoF = f(context);
        boolean z9 = B.a(context).getBoolean("netchangereconnect", true);
        if (networkInfoF == null) {
            str = "not connected";
        } else {
            String subtypeName = networkInfoF.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfoF.getExtraInfo();
            str = String.format("%2$s %4$s to %1$s %3$s", networkInfoF.getTypeName(), networkInfoF.getDetailedState(), extraInfo != null ? extraInfo : "", subtypeName);
        }
        if (networkInfoF != null && networkInfoF.getState() == NetworkInfo.State.CONNECTED) {
            int type = networkInfoF.getType();
            c cVar = this.f40060h;
            c cVar2 = c.PENDINGDISCONNECT;
            boolean z10 = cVar == cVar2;
            this.f40060h = c.SHOULDBECONNECTED;
            NetworkInfo networkInfo = this.f40065m;
            boolean z11 = networkInfo != null && networkInfo.getType() == networkInfoF.getType() && d(this.f40065m.getExtraInfo(), networkInfoF.getExtraInfo());
            if (z10 && z11) {
                this.f40054a.removeCallbacks(this.f40064l);
                this.f40056d.d(true);
            } else {
                if (this.f40061i == cVar2) {
                    this.f40061i = c.DISCONNECTED;
                }
                if (j()) {
                    this.f40054a.removeCallbacks(this.f40064l);
                    if (z10 || !z11) {
                        this.f40056d.d(z11);
                    } else {
                        this.f40056d.resume();
                    }
                }
                this.f40055c = type;
                this.f40065m = networkInfoF;
            }
        } else if (networkInfoF == null) {
            this.f40055c = -1;
            if (z9) {
                this.f40060h = c.PENDINGDISCONNECT;
                this.f40054a.postDelayed(this.f40064l, 20000L);
            }
        }
        if (!str.equals(this.f40063k)) {
            G.t(a7.j.f13173X3, str);
        }
        G.m(String.format("Debug state info: %s, pause: %s, shouldbeconnected: %s, network: %s ", str, g(), Boolean.valueOf(j()), this.f40060h));
        this.f40063k = str;
    }

    public final boolean j() {
        c cVar = this.f40061i;
        c cVar2 = c.SHOULDBECONNECTED;
        return cVar == cVar2 && this.f40062j == cVar2 && this.f40060h == cVar2;
    }

    public void k(boolean z9) {
        if (z9) {
            this.f40062j = c.DISCONNECTED;
        } else {
            boolean zJ = j();
            this.f40062j = c.SHOULDBECONNECTED;
            if (j() && !zJ) {
                this.f40056d.resume();
                return;
            }
        }
        this.f40056d.b(g());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferencesA = B.a(context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            i(context);
            return;
        }
        if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean zJ = j();
                this.f40061i = c.SHOULDBECONNECTED;
                this.f40054a.removeCallbacks(this.f40064l);
                if (j() != zJ) {
                    this.f40056d.resume();
                    return;
                } else {
                    if (j()) {
                        return;
                    }
                    this.f40056d.b(g());
                    return;
                }
            }
            return;
        }
        if (sharedPreferencesA.getBoolean("screenoff", false)) {
            if (C.i() != null && !C.i().f40876N) {
                G.n(a7.j.f13423w6);
            }
            this.f40061i = c.PENDINGDISCONNECT;
            e();
            c cVar = this.f40060h;
            c cVar2 = c.DISCONNECTED;
            if (cVar == cVar2 || this.f40062j == cVar2) {
                this.f40061i = cVar2;
            }
        }
    }
}
