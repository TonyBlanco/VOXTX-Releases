package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bmc extends boh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Reader f21688b = new bmb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21689c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f21690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f21692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f21693g;

    public bmc(bjy bjyVar) {
        super(f21688b);
        this.f21690d = new Object[32];
        this.f21691e = 0;
        this.f21692f = new String[32];
        this.f21693g = new int[32];
        A(bjyVar);
    }

    private final void A(Object obj) {
        int i9 = this.f21691e;
        Object[] objArr = this.f21690d;
        if (i9 == objArr.length) {
            int i10 = i9 + i9;
            this.f21690d = Arrays.copyOf(objArr, i10);
            this.f21693g = Arrays.copyOf(this.f21693g, i10);
            this.f21692f = (String[]) Arrays.copyOf(this.f21692f, i10);
        }
        Object[] objArr2 = this.f21690d;
        int i11 = this.f21691e;
        this.f21691e = i11 + 1;
        objArr2[i11] = obj;
    }

    private final void B(int i9) throws IOException {
        if (r() == i9) {
            return;
        }
        int iR = r();
        throw new IllegalStateException("Expected " + boi.a(i9) + " but was " + boi.a(iR) + z());
    }

    private final Object w() {
        return this.f21690d[this.f21691e - 1];
    }

    private final Object x() {
        Object[] objArr = this.f21690d;
        int i9 = this.f21691e - 1;
        this.f21691e = i9;
        Object obj = objArr[i9];
        objArr[i9] = null;
        return obj;
    }

    private final String y(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i9 = 0;
        while (true) {
            int i10 = this.f21691e;
            if (i9 >= i10) {
                return sb.toString();
            }
            Object[] objArr = this.f21690d;
            Object obj = objArr[i9];
            if (obj instanceof bjw) {
                i9++;
                if (i9 < i10 && (objArr[i9] instanceof Iterator)) {
                    int i11 = this.f21693g[i9];
                    if (z9 && i11 > 0 && (i9 == i10 - 1 || i9 == i10 - 2)) {
                        i11--;
                    }
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                }
            } else if ((obj instanceof bkb) && (i9 = i9 + 1) < i10 && (objArr[i9] instanceof Iterator)) {
                sb.append('.');
                String str = this.f21692f[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
            i9++;
        }
    }

    private final String z() {
        return " at path ".concat(String.valueOf(e()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final double a() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + boi.a(iR) + z());
        }
        bkd bkdVar = (bkd) w();
        double dDoubleValue = bkdVar.e() ? bkdVar.a().doubleValue() : Double.parseDouble(bkdVar.b());
        if (!v() && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new bok("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return dDoubleValue;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final int b() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + boi.a(iR) + z());
        }
        bkd bkdVar = (bkd) w();
        int iIntValue = bkdVar.e() ? bkdVar.a().intValue() : Integer.parseInt(bkdVar.b());
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return iIntValue;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final long c() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + boi.a(iR) + z());
        }
        bkd bkdVar = (bkd) w();
        long jLongValue = bkdVar.e() ? bkdVar.a().longValue() : Long.parseLong(bkdVar.b());
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21690d = new Object[]{f21689c};
        this.f21691e = 1;
    }

    public final bjy d() throws IOException {
        int iR = r();
        if (iR != 5 && iR != 2 && iR != 4 && iR != 10) {
            bjy bjyVar = (bjy) w();
            o();
            return bjyVar;
        }
        throw new IllegalStateException("Unexpected " + boi.a(iR) + " when reading a JsonElement.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final String e() {
        return y(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final String f() {
        return y(true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final String g() throws IOException {
        B(5);
        Map.Entry entry = (Map.Entry) ((Iterator) w()).next();
        String str = (String) entry.getKey();
        this.f21692f[this.f21691e - 1] = str;
        A(entry.getValue());
        return str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final String h() throws IOException {
        int iR = r();
        if (iR == 6 || iR == 7) {
            String strB = ((bkd) x()).b();
            int i9 = this.f21691e;
            if (i9 > 0) {
                int[] iArr = this.f21693g;
                int i10 = i9 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return strB;
        }
        throw new IllegalStateException("Expected STRING but was " + boi.a(iR) + z());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void i() throws IOException {
        B(1);
        A(((bjw) w()).iterator());
        this.f21693g[this.f21691e - 1] = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void j() throws IOException {
        B(3);
        A(((bkb) w()).a().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void k() throws IOException {
        B(2);
        x();
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void l() throws IOException {
        B(4);
        x();
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void m() throws IOException {
        B(9);
        x();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final void n() throws IOException {
        B(5);
        Map.Entry entry = (Map.Entry) ((Iterator) w()).next();
        A(entry.getValue());
        A(new bkd((String) entry.getKey()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final void o() throws IOException {
        if (r() == 5) {
            g();
            this.f21692f[this.f21691e - 2] = Constants.NULL_VERSION_ID;
        } else {
            x();
            int i9 = this.f21691e;
            if (i9 > 0) {
                this.f21692f[i9 - 1] = Constants.NULL_VERSION_ID;
            }
        }
        int i10 = this.f21691e;
        if (i10 > 0) {
            int[] iArr = this.f21693g;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final boolean p() throws IOException {
        int iR = r();
        return (iR == 4 || iR == 2 || iR == 10) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final boolean q() throws IOException {
        B(8);
        boolean zC = ((bkd) x()).c();
        int i9 = this.f21691e;
        if (i9 > 0) {
            int[] iArr = this.f21693g;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return zC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final int r() throws IOException {
        if (this.f21691e == 0) {
            return 10;
        }
        Object objW = w();
        if (objW instanceof Iterator) {
            boolean z9 = this.f21690d[this.f21691e - 2] instanceof bkb;
            Iterator it = (Iterator) objW;
            if (!it.hasNext()) {
                return z9 ? 4 : 2;
            }
            if (z9) {
                return 5;
            }
            A(it.next());
            return r();
        }
        if (objW instanceof bkb) {
            return 3;
        }
        if (objW instanceof bjw) {
            return 1;
        }
        if (objW instanceof bkd) {
            bkd bkdVar = (bkd) objW;
            if (bkdVar.f()) {
                return 6;
            }
            if (bkdVar.d()) {
                return 8;
            }
            if (bkdVar.e()) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objW instanceof bka) {
            return 9;
        }
        if (objW == f21689c) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new bok("Custom JsonElement subclass " + objW.getClass().getName() + " is not supported");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boh
    public final String toString() {
        return bmc.class.getSimpleName().concat(String.valueOf(z()));
    }
}
