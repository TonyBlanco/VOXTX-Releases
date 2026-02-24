package O6;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static D6.a a(List list) {
        int size = list.size() << 1;
        int i9 = size - 1;
        if (((b) list.get(list.size() - 1)).c() == null) {
            i9 = size - 2;
        }
        D6.a aVar = new D6.a(i9 * 12);
        int i10 = 0;
        int iB = ((b) list.get(0)).c().b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & iB) != 0) {
                aVar.q(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            int iB2 = bVar.b().b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & iB2) != 0) {
                    aVar.q(i10);
                }
                i10++;
            }
            if (bVar.c() != null) {
                int iB3 = bVar.c().b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & iB3) != 0) {
                        aVar.q(i10);
                    }
                    i10++;
                }
            }
        }
        return aVar;
    }
}
