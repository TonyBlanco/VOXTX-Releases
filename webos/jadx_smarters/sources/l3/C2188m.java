package l3;

import O2.C0897l1;
import d3.InterfaceC1673j;
import d3.t;
import d4.M;
import java.util.ArrayList;
import java.util.List;
import w3.C2909c;

/* JADX INFO: renamed from: l3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2188m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r5.p f44022d = r5.p.d(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r5.p f44023e = r5.p.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44024a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44025b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44026c;

    /* JADX INFO: renamed from: l3.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44029c;

        public a(int i9, long j9, int i10) {
            this.f44027a = i9;
            this.f44028b = j9;
            this.f44029c = i10;
        }
    }

    public static int b(String str) throws C0897l1 {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C0897l1.a("Invalid SEF name", null);
        }
    }

    public static C2909c f(M m9, int i9) throws C0897l1 {
        ArrayList arrayList = new ArrayList();
        List listF = f44023e.f(m9.E(i9));
        for (int i10 = 0; i10 < listF.size(); i10++) {
            List listF2 = f44022d.f((CharSequence) listF.get(i10));
            if (listF2.size() != 3) {
                throw C0897l1.a(null, null);
            }
            try {
                arrayList.add(new C2909c.b(Long.parseLong((String) listF2.get(0)), Long.parseLong((String) listF2.get(1)), 1 << (Integer.parseInt((String) listF2.get(2)) - 1)));
            } catch (NumberFormatException e9) {
                throw C0897l1.a(null, e9);
            }
        }
        return new C2909c(arrayList);
    }

    public final void a(InterfaceC1673j interfaceC1673j, t tVar) {
        M m9 = new M(8);
        interfaceC1673j.m(m9.e(), 0, 8);
        this.f44026c = m9.u() + 8;
        if (m9.q() != 1397048916) {
            tVar.f39608a = 0L;
        } else {
            tVar.f39608a = interfaceC1673j.getPosition() - ((long) (this.f44026c - 12));
            this.f44025b = 2;
        }
    }

    public int c(InterfaceC1673j interfaceC1673j, t tVar, List list) throws C0897l1 {
        int i9 = this.f44025b;
        long j9 = 0;
        if (i9 == 0) {
            long length = interfaceC1673j.getLength();
            if (length != -1 && length >= 8) {
                j9 = length - 8;
            }
            tVar.f39608a = j9;
            this.f44025b = 1;
        } else if (i9 == 1) {
            a(interfaceC1673j, tVar);
        } else if (i9 == 2) {
            d(interfaceC1673j, tVar);
        } else {
            if (i9 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC1673j, list);
            tVar.f39608a = 0L;
        }
        return 1;
    }

    public final void d(InterfaceC1673j interfaceC1673j, t tVar) {
        long j9;
        long length = interfaceC1673j.getLength();
        int i9 = this.f44026c - 20;
        M m9 = new M(i9);
        interfaceC1673j.m(m9.e(), 0, i9);
        for (int i10 = 0; i10 < i9 / 12; i10++) {
            m9.V(2);
            short sW = m9.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f44024a.add(new a(sW, (length - ((long) this.f44026c)) - ((long) m9.u()), m9.u()));
            } else {
                m9.V(8);
            }
        }
        if (this.f44024a.isEmpty()) {
            j9 = 0;
        } else {
            this.f44025b = 3;
            j9 = ((a) this.f44024a.get(0)).f44028b;
        }
        tVar.f39608a = j9;
    }

    public final void e(InterfaceC1673j interfaceC1673j, List list) throws C0897l1 {
        long position = interfaceC1673j.getPosition();
        int length = (int) ((interfaceC1673j.getLength() - interfaceC1673j.getPosition()) - ((long) this.f44026c));
        M m9 = new M(length);
        interfaceC1673j.m(m9.e(), 0, length);
        for (int i9 = 0; i9 < this.f44024a.size(); i9++) {
            a aVar = (a) this.f44024a.get(i9);
            m9.U((int) (aVar.f44028b - position));
            m9.V(4);
            int iU = m9.u();
            int iB = b(m9.E(iU));
            int i10 = aVar.f44029c - (iU + 8);
            if (iB == 2192) {
                list.add(f(m9, i10));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f44024a.clear();
        this.f44025b = 0;
    }
}
