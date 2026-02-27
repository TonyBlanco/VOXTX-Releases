package l8;

import java.util.Iterator;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F {

    public static final class a extends q8.k implements w8.p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f44236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f44237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f44240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f44241h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f44242i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Iterator f44243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f44244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f44245l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i9, int i10, Iterator it, boolean z9, boolean z10, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f44241h = i9;
            this.f44242i = i10;
            this.f44243j = it;
            this.f44244k = z9;
            this.f44245l = z10;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D8.f fVar, InterfaceC2372d interfaceC2372d) {
            return ((a) create(fVar, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            a aVar = new a(this.f44241h, this.f44242i, this.f44243j, this.f44244k, this.f44245l, interfaceC2372d);
            aVar.f44240g = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0118 -> B:59:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0146 -> B:72:0x0149). Please report as a decompilation issue!!! */
        @Override // q8.AbstractC2642a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.F.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i9, int i10) {
        String str;
        if (i9 <= 0 || i10 <= 0) {
            if (i9 != i10) {
                str = "Both size " + i9 + " and step " + i10 + " must be greater than zero.";
            } else {
                str = "size " + i9 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator iterator, int i9, int i10, boolean z9, boolean z10) {
        kotlin.jvm.internal.l.e(iterator, "iterator");
        return !iterator.hasNext() ? t.f44259a : D8.g.a(new a(i9, i10, iterator, z10, z9, null));
    }
}
