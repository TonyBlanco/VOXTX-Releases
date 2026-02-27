package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17078a;

    public interface a {
        a.b a(int i9, int i10, int i11, Object obj);

        void b(a.b bVar);
    }

    public i(a aVar) {
        this.f17078a = aVar;
    }

    public final int a(List list) {
        boolean z9 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f16892a != 8) {
                z9 = true;
            } else if (z9) {
                return size;
            }
        }
        return -1;
    }

    public void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    public final void c(List list, int i9, a.b bVar, int i10, a.b bVar2) {
        int i11 = bVar.f16895d;
        int i12 = bVar2.f16893b;
        int i13 = i11 < i12 ? -1 : 0;
        int i14 = bVar.f16893b;
        if (i14 < i12) {
            i13++;
        }
        if (i12 <= i14) {
            bVar.f16893b = i14 + bVar2.f16895d;
        }
        int i15 = bVar2.f16893b;
        if (i15 <= i11) {
            bVar.f16895d = i11 + bVar2.f16895d;
        }
        bVar2.f16893b = i15 + i13;
        list.set(i9, bVar2);
        list.set(i10, bVar);
    }

    public final void d(List list, int i9, int i10) {
        a.b bVar = (a.b) list.get(i9);
        a.b bVar2 = (a.b) list.get(i10);
        int i11 = bVar2.f16892a;
        if (i11 == 1) {
            c(list, i9, bVar, i10, bVar2);
        } else if (i11 == 2) {
            e(list, i9, bVar, i10, bVar2);
        } else {
            if (i11 != 4) {
                return;
            }
            f(list, i9, bVar, i10, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[PHI: r0
      0x009f: PHI (r0v13 int) = (r0v6 int), (r0v16 int) binds: [B:59:0x00cc, B:46:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.List r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f16895d
            int r1 = r13.f16893b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f16893b = r1
            goto L20
        Ld:
            int r5 = r13.f16895d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f16895d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f17078a
            int r1 = r11.f16893b
            java.lang.Object r5 = r13.f16894c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f16893b
            int r5 = r13.f16893b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f16893b = r5
            goto L41
        L2b:
            int r6 = r13.f16895d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r4 = r8.f17078a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f16894c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.f16895d
            int r1 = r1 - r5
            r13.f16895d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f16895d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f17078a
            r11.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
