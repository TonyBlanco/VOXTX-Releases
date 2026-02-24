package de.blinkt.openvpn.core;

import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1718a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40031b;

    public C1718a(String str, int i9) {
        this.f40031b = i9;
        this.f40030a = str;
    }

    public C1718a(String str, String str2) {
        this.f40030a = str;
        this.f40031b = a(str2);
    }

    public static int a(String str) {
        long jC = c(str) + IjkMediaMeta.AV_CH_WIDE_RIGHT;
        int i9 = 0;
        while ((1 & jC) == 0) {
            i9++;
            jC >>= 1;
        }
        if (jC != (8589934591 >> i9)) {
            return 32;
        }
        return 32 - i9;
    }

    public static long c(String str) {
        String[] strArrSplit = str.split("\\.");
        return (Long.parseLong(strArrSplit[0]) << 24) + ((long) (Integer.parseInt(strArrSplit[1]) << 16)) + ((long) (Integer.parseInt(strArrSplit[2]) << 8)) + ((long) Integer.parseInt(strArrSplit[3]));
    }

    public long b() {
        return c(this.f40030a);
    }

    public boolean d() {
        long jC = c(this.f40030a);
        long j9 = (4294967295 << (32 - this.f40031b)) & jC;
        if (j9 == jC) {
            return false;
        }
        this.f40030a = String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j9) >> 24), Long.valueOf((16711680 & j9) >> 16), Long.valueOf((65280 & j9) >> 8), Long.valueOf(j9 & 255));
        return true;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%s/%d", this.f40030a, Integer.valueOf(this.f40031b));
    }
}
