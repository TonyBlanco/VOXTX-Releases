package r5;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2674c f49734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f49736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49737d;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2674c f49738a;

        /* JADX INFO: renamed from: r5.p$a$a, reason: collision with other inner class name */
        public class C0434a extends b {
            public C0434a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // r5.p.b
            public int f(int i9) {
                return i9 + 1;
            }

            @Override // r5.p.b
            public int g(int i9) {
                return a.this.f49738a.c(this.f49740d, i9);
            }
        }

        public a(AbstractC2674c abstractC2674c) {
            this.f49738a = abstractC2674c;
        }

        @Override // r5.p.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(p pVar, CharSequence charSequence) {
            return new C0434a(pVar, charSequence);
        }
    }

    public static abstract class b extends AbstractC2672a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f49740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC2674c f49741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f49742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f49743g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49744h;

        public b(p pVar, CharSequence charSequence) {
            this.f49741e = pVar.f49734a;
            this.f49742f = pVar.f49735b;
            this.f49744h = pVar.f49737d;
            this.f49740d = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r6.f49741e.e(r6.f49740d.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            if (r6.f49741e.e(r6.f49740d.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (r6.f49742f == false) goto L39;
         */
        @Override // r5.AbstractC2672a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f49743g
            L2:
                int r1 = r6.f49743g
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f49740d
                int r1 = r1.length()
                r6.f49743g = r2
                goto L1c
            L16:
                int r3 = r6.f(r1)
                r6.f49743g = r3
            L1c:
                int r3 = r6.f49743g
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f49743g = r3
                java.lang.CharSequence r1 = r6.f49740d
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f49743g = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                r5.c r3 = r6.f49741e
                java.lang.CharSequence r4 = r6.f49740d
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                r5.c r3 = r6.f49741e
                java.lang.CharSequence r4 = r6.f49740d
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f49742f
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f49744h
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f49740d
                int r1 = r1.length()
                r6.f49743g = r2
            L6b:
                if (r1 <= r0) goto L83
                r5.c r2 = r6.f49741e
                java.lang.CharSequence r3 = r6.f49740d
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f49744h = r3
            L83:
                java.lang.CharSequence r2 = r6.f49740d
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.p.b.b():java.lang.String");
        }

        public abstract int f(int i9);

        public abstract int g(int i9);
    }

    public interface c {
        Iterator a(p pVar, CharSequence charSequence);
    }

    public p(c cVar) {
        this(cVar, false, AbstractC2674c.f(), a.e.API_PRIORITY_OTHER);
    }

    public p(c cVar, boolean z9, AbstractC2674c abstractC2674c, int i9) {
        this.f49736c = cVar;
        this.f49735b = z9;
        this.f49734a = abstractC2674c;
        this.f49737d = i9;
    }

    public static p d(char c9) {
        return e(AbstractC2674c.d(c9));
    }

    public static p e(AbstractC2674c abstractC2674c) {
        m.k(abstractC2674c);
        return new p(new a(abstractC2674c));
    }

    public List f(CharSequence charSequence) {
        m.k(charSequence);
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.f49736c.a(this, charSequence);
    }
}
