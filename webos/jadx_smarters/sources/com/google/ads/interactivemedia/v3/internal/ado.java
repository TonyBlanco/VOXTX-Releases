package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class ado implements aes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19150b;

    public ado() {
        this(null);
    }

    public ado(int i9, List list) {
        this.f19149a = i9;
        this.f19150b = list;
    }

    public ado(byte[] bArr) {
        this(0, avo.o());
    }

    private final List c(aer aerVar) {
        String str;
        int i9;
        List listSingletonList;
        if (d(32)) {
            return this.f19150b;
        }
        cj cjVar = new cj(aerVar.f19401d);
        List arrayList = this.f19150b;
        while (cjVar.a() > 0) {
            int i10 = cjVar.i();
            int iC = cjVar.c() + cjVar.i();
            if (i10 == 134) {
                arrayList = new ArrayList();
                int i11 = cjVar.i() & 31;
                for (int i12 = 0; i12 < i11; i12++) {
                    String strU = cjVar.u(3);
                    int i13 = cjVar.i();
                    boolean z9 = (i13 & 128) != 0;
                    if (z9) {
                        i9 = i13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i9 = 1;
                    }
                    byte bI = (byte) cjVar.i();
                    cjVar.G(1);
                    if (z9) {
                        int i14 = bo.f21809a;
                        listSingletonList = Collections.singletonList((bI & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    r rVar = new r();
                    rVar.ae(str);
                    rVar.V(strU);
                    rVar.F(i9);
                    rVar.T(listSingletonList);
                    arrayList.add(rVar.v());
                }
            }
            cjVar.F(iC);
        }
        return arrayList;
    }

    private final boolean d(int i9) {
        return (i9 & this.f19149a) != 0;
    }

    private final aeq e(aer aerVar) {
        return new aeq(c(aerVar));
    }

    private final bdy f(aer aerVar) {
        return new bdy(c(aerVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aes
    public final SparseArray a() {
        return new SparseArray();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aes
    public final aeu b(int i9, aer aerVar) {
        if (i9 != 2) {
            if (i9 == 3 || i9 == 4) {
                return new aeh(new aee(aerVar.f19399b));
            }
            if (i9 == 21) {
                return new aeh(new aec());
            }
            if (i9 == 27) {
                if (d(4)) {
                    return null;
                }
                return new aeh(new adz(f(aerVar), d(1), d(8), null, null));
            }
            if (i9 == 36) {
                return new aeh(new aeb(f(aerVar), null, null));
            }
            if (i9 == 89) {
                return new aeh(new adq(aerVar.f19400c));
            }
            if (i9 != 138) {
                if (i9 == 172) {
                    return new aeh(new adl(aerVar.f19399b));
                }
                if (i9 == 257) {
                    return new aej(new aeg("application/vnd.dvb.ait"));
                }
                if (i9 == 134) {
                    if (d(16)) {
                        return null;
                    }
                    return new aej(new aeg("application/x-scte35"));
                }
                if (i9 != 135) {
                    switch (i9) {
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            if (!d(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            if (!d(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i9) {
                                case 130:
                                    if (!d(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new aeh(new adi(aerVar.f19399b));
            }
            return new aeh(new adp(aerVar.f19399b));
        }
        return new aeh(new adt(e(aerVar), null));
    }
}
