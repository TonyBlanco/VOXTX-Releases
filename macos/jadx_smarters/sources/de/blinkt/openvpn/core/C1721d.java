package de.blinkt.openvpn.core;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1721d implements Serializable, Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40051l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40041a = "openvpn.example.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40042c = "1194";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40043d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40044e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40045f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40046g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40047h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f40048i = a.NONE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f40049j = "proxy.example.com";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f40050k = "8080";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f40052m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f40053n = null;

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.d$a */
    public enum a {
        NONE,
        HTTP,
        SOCKS5,
        ORBOT
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1721d clone() {
        return (C1721d) super.clone();
    }

    public String c(boolean z9) {
        StringBuilder sb;
        String str;
        String str2 = ((("remote ") + this.f40041a) + " ") + this.f40042c;
        if (this.f40043d) {
            sb = new StringBuilder();
            sb.append(str2);
            str = " udp\n";
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = " tcp-client\n";
        }
        sb.append(str);
        String string = sb.toString();
        if (this.f40047h != 0) {
            string = string + String.format(Locale.US, " connect-timeout  %d\n", Integer.valueOf(this.f40047h));
        }
        if ((z9 || e()) && this.f40048i == a.HTTP) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            Locale locale = Locale.US;
            sb2.append(String.format(locale, "http-proxy %s %s\n", this.f40049j, this.f40050k));
            String string2 = sb2.toString();
            if (this.f40051l) {
                string = string2 + String.format(locale, "<http-proxy-user-pass>\n%s\n%s\n</http-proxy-user-pass>\n", this.f40052m, this.f40053n);
            } else {
                string = string2;
            }
        }
        if (e() && this.f40048i == a.SOCKS5) {
            string = string + String.format(Locale.US, "socks-proxy %s %s\n", this.f40049j, this.f40050k);
        }
        if (TextUtils.isEmpty(this.f40044e) || !this.f40045f) {
            return string;
        }
        return (string + this.f40044e) + "\n";
    }

    public boolean d() {
        return TextUtils.isEmpty(this.f40044e) || !this.f40045f;
    }

    public boolean e() {
        return this.f40045f && this.f40044e.contains("http-proxy-option ");
    }
}
