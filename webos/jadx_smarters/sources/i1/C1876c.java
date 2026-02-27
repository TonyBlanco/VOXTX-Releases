package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: i1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1876c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f41790e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41791a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41792b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41793c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41794d;

    /* JADX INFO: renamed from: i1.c$a */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C1876c(int i9) {
        this.f41794d = i9;
    }

    public synchronized byte[] a(int i9) {
        for (int i10 = 0; i10 < this.f41792b.size(); i10++) {
            byte[] bArr = (byte[]) this.f41792b.get(i10);
            if (bArr.length >= i9) {
                this.f41793c -= bArr.length;
                this.f41792b.remove(i10);
                this.f41791a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i9];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f41794d) {
                this.f41791a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f41792b, bArr, f41790e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f41792b.add(iBinarySearch, bArr);
                this.f41793c += bArr.length;
                c();
            }
        }
    }

    public final synchronized void c() {
        while (this.f41793c > this.f41794d) {
            byte[] bArr = (byte[]) this.f41791a.remove(0);
            this.f41792b.remove(bArr);
            this.f41793c -= bArr.length;
        }
    }
}
