package de.blinkt.openvpn.core;

import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet f40084a = new TreeSet();

    public static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f40085a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f40087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public BigInteger f40089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public BigInteger f40090g;

        public a(C1718a c1718a, boolean z9) {
            this.f40087d = z9;
            this.f40085a = BigInteger.valueOf(c1718a.b());
            this.f40086c = c1718a.f40031b;
            this.f40088e = true;
        }

        public a(BigInteger bigInteger, int i9, boolean z9, boolean z10) {
            this.f40085a = bigInteger;
            this.f40086c = i9;
            this.f40087d = z9;
            this.f40088e = z10;
        }

        public a(Inet6Address inet6Address, int i9, boolean z9) {
            this.f40086c = i9;
            this.f40087d = z9;
            this.f40085a = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i10 = 128;
            for (int i11 = 0; i11 < length; i11++) {
                i10 -= 8;
                this.f40085a = this.f40085a.add(BigInteger.valueOf(r6[i11] & 255).shiftLeft(i10));
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = h().compareTo(aVar.h());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i9 = this.f40086c;
            int i10 = aVar.f40086c;
            if (i9 > i10) {
                return -1;
            }
            return i10 == i9 ? 0 : 1;
        }

        public boolean c(a aVar) {
            BigInteger bigIntegerH = h();
            BigInteger bigIntegerL = l();
            return (bigIntegerH.compareTo(aVar.h()) != 1) && (bigIntegerL.compareTo(aVar.l()) != -1);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            return this.f40086c == aVar.f40086c && aVar.h().equals(h());
        }

        public BigInteger h() {
            if (this.f40089f == null) {
                this.f40089f = n(false);
            }
            return this.f40089f;
        }

        public String i() {
            long jLongValue = this.f40085a.longValue();
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((jLongValue >> 24) % 256), Long.valueOf((jLongValue >> 16) % 256), Long.valueOf((jLongValue >> 8) % 256), Long.valueOf(jLongValue % 256));
        }

        public String j() {
            BigInteger bigIntegerShiftRight = this.f40085a;
            String str = null;
            boolean z9 = true;
            while (bigIntegerShiftRight.compareTo(BigInteger.ZERO) == 1) {
                long jLongValue = bigIntegerShiftRight.mod(BigInteger.valueOf(65536L)).longValue();
                if (str != null || jLongValue != 0) {
                    if (str == null && !z9) {
                        str = ":";
                    }
                    str = z9 ? String.format(Locale.US, "%x", Long.valueOf(jLongValue), str) : String.format(Locale.US, "%x:%s", Long.valueOf(jLongValue), str);
                }
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(16);
                z9 = false;
            }
            return str == null ? "::" : str;
        }

        public BigInteger l() {
            if (this.f40090g == null) {
                this.f40090g = n(true);
            }
            return this.f40090g;
        }

        public final BigInteger n(boolean z9) {
            BigInteger bit = this.f40085a;
            int i9 = this.f40088e ? 32 - this.f40086c : 128 - this.f40086c;
            for (int i10 = 0; i10 < i9; i10++) {
                bit = z9 ? bit.setBit(i10) : bit.clearBit(i10);
            }
            return bit;
        }

        public a[] o() {
            a aVar = new a(h(), this.f40086c + 1, this.f40087d, this.f40088e);
            return new a[]{aVar, new a(aVar.l().add(BigInteger.ONE), this.f40086c + 1, this.f40087d, this.f40088e)};
        }

        public String toString() {
            return this.f40088e ? String.format(Locale.US, "%s/%d", i(), Integer.valueOf(this.f40086c)) : String.format(Locale.US, "%s/%d", j(), Integer.valueOf(this.f40086c));
        }
    }

    public void a(C1718a c1718a, boolean z9) {
        this.f40084a.add(new a(c1718a, z9));
    }

    public void b(Inet6Address inet6Address, int i9, boolean z9) {
        this.f40084a.add(new a(inet6Address, i9, z9));
    }

    public void c() {
        this.f40084a.clear();
    }

    public TreeSet d() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.f40084a);
        TreeSet treeSet = new TreeSet();
        a aVar = (a) priorityQueue.poll();
        if (aVar == null) {
            return treeSet;
        }
        while (aVar != null) {
            a aVar2 = (a) priorityQueue.poll();
            if (aVar2 == null || aVar.l().compareTo(aVar2.h()) == -1) {
                treeSet.add(aVar);
                aVar = aVar2;
            } else if (!aVar.h().equals(aVar2.h()) || aVar.f40086c < aVar2.f40086c) {
                if (aVar.f40087d != aVar2.f40087d) {
                    a[] aVarArrO = aVar.o();
                    a aVar3 = aVarArrO[1];
                    if (aVar3.f40086c != aVar2.f40086c) {
                        priorityQueue.add(aVar3);
                    }
                    priorityQueue.add(aVar2);
                    aVar = aVarArrO[0];
                }
            } else if (aVar.f40087d == aVar2.f40087d) {
                aVar = aVar2;
            } else {
                a[] aVarArrO2 = aVar2.o();
                if (!priorityQueue.contains(aVarArrO2[1])) {
                    priorityQueue.add(aVarArrO2[1]);
                }
                if (!aVarArrO2[0].l().equals(aVar.l()) && !priorityQueue.contains(aVarArrO2[0])) {
                    priorityQueue.add(aVarArrO2[0]);
                }
            }
        }
        return treeSet;
    }

    public Collection e(boolean z9) {
        Vector vector = new Vector();
        for (a aVar : this.f40084a) {
            if (aVar.f40087d == z9) {
                vector.add(aVar);
            }
        }
        return vector;
    }

    public Collection f() {
        TreeSet<a> treeSetD = d();
        Vector vector = new Vector();
        for (a aVar : treeSetD) {
            if (aVar.f40087d) {
                vector.add(aVar);
            }
        }
        return vector;
    }
}
