package H3;

import O2.C0897l1;
import O2.C0936z0;
import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.Z;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements InterfaceC1672i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f2596g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f2597h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f2599b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1674k f2601d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2603f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f2600c = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f2602e = new byte[1024];

    public u(String str, Z z9) {
        this.f2598a = str;
        this.f2599b = z9;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        throw new IllegalStateException();
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f2601d = interfaceC1674k;
        interfaceC1674k.n(new g.b(-9223372036854775807L));
    }

    public final w c(long j9) {
        w wVarE = this.f2601d.e(0, 3);
        wVarE.d(new C0936z0.b().g0("text/vtt").X(this.f2598a).k0(j9).G());
        this.f2601d.q();
        return wVarE;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) throws C0897l1 {
        AbstractC1684a.e(this.f2601d);
        int length = (int) interfaceC1673j.getLength();
        int i9 = this.f2603f;
        byte[] bArr = this.f2602e;
        if (i9 == bArr.length) {
            this.f2602e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f2602e;
        int i10 = this.f2603f;
        int i11 = interfaceC1673j.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            int i12 = this.f2603f + i11;
            this.f2603f = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    public final void e() throws C0897l1 {
        M m9 = new M(this.f2602e);
        Y3.i.e(m9);
        long jG = 0;
        long jD = 0;
        for (String strS = m9.s(); !TextUtils.isEmpty(strS); strS = m9.s()) {
            if (strS.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f2596g.matcher(strS);
                if (!matcher.find()) {
                    throw C0897l1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strS, null);
                }
                Matcher matcher2 = f2597h.matcher(strS);
                if (!matcher2.find()) {
                    throw C0897l1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strS, null);
                }
                jD = Y3.i.d((String) AbstractC1684a.e(matcher.group(1)));
                jG = Z.g(Long.parseLong((String) AbstractC1684a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = Y3.i.a(m9);
        if (matcherA == null) {
            c(0L);
            return;
        }
        long jD2 = Y3.i.d((String) AbstractC1684a.e(matcherA.group(1)));
        long jB = this.f2599b.b(Z.k((jG + jD2) - jD));
        w wVarC = c(jB - jD2);
        this.f2600c.S(this.f2602e, this.f2603f);
        wVarC.b(this.f2600c, this.f2603f);
        wVarC.f(jB, 1, this.f2603f, 0, null);
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.d(this.f2602e, 0, 6, false);
        this.f2600c.S(this.f2602e, 6);
        if (Y3.i.b(this.f2600c)) {
            return true;
        }
        interfaceC1673j.d(this.f2602e, 6, 3, false);
        this.f2600c.S(this.f2602e, 9);
        return Y3.i.b(this.f2600c);
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
