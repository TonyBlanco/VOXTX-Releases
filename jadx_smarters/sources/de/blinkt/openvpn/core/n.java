package de.blinkt.openvpn.core;

/* JADX INFO: loaded from: classes4.dex */
public interface n {

    public interface a {
        boolean a();
    }

    public enum b {
        noNetwork,
        userPause,
        screenOff
    }

    boolean a(boolean z9);

    void b(b bVar);

    void c(String str);

    void d(boolean z9);

    void e(a aVar);

    void resume();
}
