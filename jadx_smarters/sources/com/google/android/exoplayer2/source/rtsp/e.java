package com.google.android.exoplayer2.source.rtsp;

import d4.k0;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import r5.AbstractC2673b;
import s5.AbstractC2743y;
import s5.C2744z;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f25665b = new b().e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2744z f25666a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2744z.a f25667a;

        public b() {
            this.f25667a = new C2744z.a();
        }

        public b(String str, String str2, int i9) {
            this();
            b("User-Agent", str);
            b("CSeq", String.valueOf(i9));
            if (str2 != null) {
                b("Session", str2);
            }
        }

        public b b(String str, String str2) {
            this.f25667a.e(e.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List list) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                String[] strArrJ1 = k0.j1((String) list.get(i9), ":\\s?");
                if (strArrJ1.length == 2) {
                    b(strArrJ1[0], strArrJ1[1]);
                }
            }
            return this;
        }

        public b d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public e e() {
            return new e(this);
        }
    }

    public e(b bVar) {
        this.f25666a = bVar.f25667a.d();
    }

    public static String c(String str) {
        return AbstractC2673b.a(str, "Accept") ? "Accept" : AbstractC2673b.a(str, "Allow") ? "Allow" : AbstractC2673b.a(str, "Authorization") ? "Authorization" : AbstractC2673b.a(str, "Bandwidth") ? "Bandwidth" : AbstractC2673b.a(str, "Blocksize") ? "Blocksize" : AbstractC2673b.a(str, "Cache-Control") ? "Cache-Control" : AbstractC2673b.a(str, "Connection") ? "Connection" : AbstractC2673b.a(str, "Content-Base") ? "Content-Base" : AbstractC2673b.a(str, "Content-Encoding") ? "Content-Encoding" : AbstractC2673b.a(str, "Content-Language") ? "Content-Language" : AbstractC2673b.a(str, "Content-Length") ? "Content-Length" : AbstractC2673b.a(str, HttpHeaders.CONTENT_LOCATION) ? HttpHeaders.CONTENT_LOCATION : AbstractC2673b.a(str, "Content-Type") ? "Content-Type" : AbstractC2673b.a(str, "CSeq") ? "CSeq" : AbstractC2673b.a(str, "Date") ? "Date" : AbstractC2673b.a(str, "Expires") ? "Expires" : AbstractC2673b.a(str, "Location") ? "Location" : AbstractC2673b.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : AbstractC2673b.a(str, "Proxy-Require") ? "Proxy-Require" : AbstractC2673b.a(str, "Public") ? "Public" : AbstractC2673b.a(str, "Range") ? "Range" : AbstractC2673b.a(str, "RTP-Info") ? "RTP-Info" : AbstractC2673b.a(str, "RTCP-Interval") ? "RTCP-Interval" : AbstractC2673b.a(str, "Scale") ? "Scale" : AbstractC2673b.a(str, "Session") ? "Session" : AbstractC2673b.a(str, "Speed") ? "Speed" : AbstractC2673b.a(str, "Supported") ? "Supported" : AbstractC2673b.a(str, "Timestamp") ? "Timestamp" : AbstractC2673b.a(str, "Transport") ? "Transport" : AbstractC2673b.a(str, "User-Agent") ? "User-Agent" : AbstractC2673b.a(str, HttpHeaders.VIA) ? HttpHeaders.VIA : AbstractC2673b.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public C2744z b() {
        return this.f25666a;
    }

    public String d(String str) {
        AbstractC2743y abstractC2743yE = e(str);
        if (abstractC2743yE.isEmpty()) {
            return null;
        }
        return (String) D.d(abstractC2743yE);
    }

    public AbstractC2743y e(String str) {
        return this.f25666a.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f25666a.equals(((e) obj).f25666a);
        }
        return false;
    }

    public int hashCode() {
        return this.f25666a.hashCode();
    }
}
