package G3;

import E3.b;
import E3.f;
import E3.g;
import E3.h;
import F3.c;
import F3.d;
import F3.i;
import F3.j;
import O2.H0;
import b4.I;
import b4.InterfaceC1224o;
import c4.C1257c;
import d4.Q;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import z3.AbstractC3027G;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC3027G {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f2172k;

    /* JADX INFO: renamed from: G3.a$a, reason: collision with other inner class name */
    public class C0038a extends Q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1224o f2173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f2174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j f2175k;

        public C0038a(InterfaceC1224o interfaceC1224o, int i9, j jVar) {
            this.f2173i = interfaceC1224o;
            this.f2174j = i9;
            this.f2175k = jVar;
        }

        @Override // d4.Q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.android.exoplayer2.extractor.b d() {
            return g.b(this.f2173i, this.f2174j, this.f2175k);
        }
    }

    public a(H0 h02, I.a aVar, C1257c.C0215c c0215c, Executor executor, long j9) {
        super(h02, aVar, c0215c, executor, j9);
        this.f2172k = new b();
    }

    public a(H0 h02, C1257c.C0215c c0215c, Executor executor) {
        this(h02, new d(), c0215c, executor, 20000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(b4.InterfaceC1224o r27, F3.a r28, long r29, long r31, boolean r33, java.util.ArrayList r34) throws java.io.IOException {
        /*
            r26 = this;
            r7 = r26
            r8 = r28
            r9 = r33
            r10 = r34
            r0 = 0
            r11 = 0
        La:
            java.util.List r0 = r8.f1925c
            int r0 = r0.size()
            if (r11 >= r0) goto Lbd
            java.util.List r0 = r8.f1925c
            java.lang.Object r0 = r0.get(r11)
            F3.j r0 = (F3.j) r0
            int r1 = r8.f1924b     // Catch: java.io.IOException -> Lb2
            r12 = r27
            E3.f r13 = r7.n(r12, r1, r0, r9)     // Catch: java.io.IOException -> Lae
            if (r13 == 0) goto La2
            r14 = r31
            long r16 = r13.i(r14)
            r1 = -1
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r3 == 0) goto L9a
            E3.b r1 = r7.f2172k
            s5.y r2 = r0.f1984c
            F3.b r1 = r1.j(r2)
            java.lang.Object r1 = d4.k0.j(r1)
            F3.b r1 = (F3.b) r1
            java.lang.String r6 = r1.f1929a
            F3.i r18 = r0.n()
            if (r18 == 0) goto L58
            r1 = r26
            r2 = r0
            r3 = r6
            r4 = r29
            r19 = r6
            r6 = r18
            z3.G$c r1 = r1.m(r2, r3, r4, r6)
            r10.add(r1)
            goto L5a
        L58:
            r19 = r6
        L5a:
            F3.i r6 = r0.m()
            if (r6 == 0) goto L6e
            r1 = r26
            r2 = r0
            r3 = r19
            r4 = r29
            z3.G$c r1 = r1.m(r2, r3, r4, r6)
            r10.add(r1)
        L6e:
            long r1 = r13.k()
            long r16 = r1 + r16
            r20 = 1
            long r16 = r16 - r20
            r4 = r1
        L79:
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 > 0) goto Lb8
            long r1 = r13.c(r4)
            long r22 = r29 + r1
            F3.i r6 = r13.g(r4)
            r1 = r26
            r2 = r0
            r3 = r19
            r24 = r4
            r4 = r22
            z3.G$c r1 = r1.m(r2, r3, r4, r6)
            r10.add(r1)
            long r4 = r24 + r20
            goto L79
        L9a:
            z3.f r0 = new z3.f
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        La2:
            r14 = r31
            z3.f r0 = new z3.f     // Catch: java.io.IOException -> Lac
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> Lac
            throw r0     // Catch: java.io.IOException -> Lac
        Lac:
            r0 = move-exception
            goto Lb6
        Lae:
            r0 = move-exception
        Laf:
            r14 = r31
            goto Lb6
        Lb2:
            r0 = move-exception
            r12 = r27
            goto Laf
        Lb6:
            if (r9 == 0) goto Lbc
        Lb8:
            int r11 = r11 + 1
            goto La
        Lbc:
            throw r0
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.a.l(b4.o, F3.a, long, long, boolean, java.util.ArrayList):void");
    }

    public final AbstractC3027G.c m(j jVar, String str, long j9, i iVar) {
        return new AbstractC3027G.c(j9, g.a(jVar, str, iVar, 0));
    }

    public final f n(InterfaceC1224o interfaceC1224o, int i9, j jVar, boolean z9) {
        f fVarB = jVar.b();
        if (fVarB != null) {
            return fVarB;
        }
        com.google.android.exoplayer2.extractor.b bVar = (com.google.android.exoplayer2.extractor.b) e(new C0038a(interfaceC1224o, i9, jVar), z9);
        if (bVar == null) {
            return null;
        }
        return new h(bVar, jVar.f1985d);
    }

    @Override // z3.AbstractC3027G
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List h(InterfaceC1224o interfaceC1224o, c cVar, boolean z9) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < cVar.e(); i9++) {
            F3.g gVarD = cVar.d(i9);
            long jP0 = k0.P0(gVarD.f1969b);
            long jG = cVar.g(i9);
            int i10 = 0;
            for (List list = gVarD.f1970c; i10 < list.size(); list = list) {
                l(interfaceC1224o, (F3.a) list.get(i10), jP0, jG, z9, arrayList);
                i10++;
            }
        }
        return arrayList;
    }
}
