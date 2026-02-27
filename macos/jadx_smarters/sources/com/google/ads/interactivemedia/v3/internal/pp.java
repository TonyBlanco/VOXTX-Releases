package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class pp implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f24117a = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f24118b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final co f24120d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zk f24122f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24124h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cj f24121e = new cj();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f24123g = new byte[1024];

    public pp(String str, co coVar) {
        this.f24119c = str;
        this.f24120d = coVar;
    }

    private final aae f(long j9) {
        aae aaeVarI = this.f24122f.i(0, 3);
        r rVar = new r();
        rVar.ae("text/vtt");
        rVar.V(this.f24119c);
        rVar.ai(j9);
        aaeVarI.b(rVar.v());
        this.f24122f.n();
        return aaeVarI;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        ziVar.k(this.f24123g, 0, 6, false);
        this.f24121e.D(this.f24123g, 6);
        if (adg.d(this.f24121e)) {
            return true;
        }
        ziVar.k(this.f24123g, 6, 3, false);
        this.f24121e.D(this.f24123g, 9);
        return adg.d(this.f24121e);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        int i9;
        af.s(this.f24122f);
        int iB = (int) ziVar.b();
        int i10 = this.f24124h;
        byte[] bArr = this.f24123g;
        int length = bArr.length;
        if (i10 == length) {
            if (iB != -1) {
                i9 = iB;
            } else {
                iB = length;
                i9 = -1;
            }
            this.f24123g = Arrays.copyOf(bArr, (iB * 3) / 2);
            iB = i9;
        }
        byte[] bArr2 = this.f24123g;
        int i11 = this.f24124h;
        int iA = ziVar.a(bArr2, i11, bArr2.length - i11);
        if (iA != -1) {
            int i12 = this.f24124h + iA;
            this.f24124h = i12;
            if (iB == -1 || i12 != iB) {
                return 0;
            }
        }
        cj cjVar = new cj(this.f24123g);
        adg.c(cjVar);
        long jF = 0;
        long jA = 0;
        for (String strR = cjVar.r(); !TextUtils.isEmpty(strR); strR = cjVar.r()) {
            if (strR.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f24117a.matcher(strR);
                if (!matcher.find()) {
                    throw as.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strR), null);
                }
                Matcher matcher2 = f24118b.matcher(strR);
                if (!matcher2.find()) {
                    throw as.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strR), null);
                }
                String strGroup = matcher.group(1);
                af.s(strGroup);
                jA = adg.a(strGroup);
                String strGroup2 = matcher2.group(1);
                af.s(strGroup2);
                jF = co.f(Long.parseLong(strGroup2));
            }
        }
        Matcher matcherB = adg.b(cjVar);
        if (matcherB == null) {
            f(0L);
        } else {
            String strGroup3 = matcherB.group(1);
            af.s(strGroup3);
            long jA2 = adg.a(strGroup3);
            long jB = this.f24120d.b(co.g((jF + jA2) - jA) % IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);
            aae aaeVarF = f(jB - jA2);
            this.f24121e.D(this.f24123g, this.f24124h);
            aaeVarF.e(this.f24121e, this.f24124h);
            aaeVarF.f(jB, 1, this.f24124h, 0, null);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f24122f = zkVar;
        zkVar.x(new aaa(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        throw new IllegalStateException();
    }
}
