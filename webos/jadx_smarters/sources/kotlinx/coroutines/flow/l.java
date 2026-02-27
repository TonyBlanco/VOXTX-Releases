package kotlinx.coroutines.flow;

import k8.q;
import kotlinx.coroutines.internal.y;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends J8.b implements j, b {

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43717e;

    public static final class a extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f43718a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f43719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f43720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f43721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f43722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f43723g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f43725i;

        public a(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f43723g = obj;
            this.f43725i |= Integer.MIN_VALUE;
            return l.this.b(null, this);
        }
    }

    public l(Object obj) {
        this._state = obj;
    }

    @Override // kotlinx.coroutines.flow.c
    public Object a(Object obj, InterfaceC2372d interfaceC2372d) {
        setValue(obj);
        return q.f43674a;
    }

    /* JADX WARN: Path cross not found for [B:33:0x0098, B:35:0x009e], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x009e, B:33:0x0098], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0093, B:33:0x0098, B:43:0x00b9, B:45:0x00bf, B:35:0x009e, B:39:0x00a5, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0093, B:33:0x0098, B:43:0x00b9, B:45:0x00bf, B:35:0x009e, B:39:0x00a5, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0093, B:33:0x0098, B:43:0x00b9, B:45:0x00bf, B:35:0x009e, B:39:0x00a5, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bd -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cf -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlinx.coroutines.flow.c r11, o8.InterfaceC2372d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.b(kotlinx.coroutines.flow.c, o8.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    public Object getValue() {
        y yVar = J8.h.f3403a;
        Object obj = this._state;
        if (obj == yVar) {
            return null;
        }
        return obj;
    }

    @Override // J8.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n d() {
        return new n();
    }

    @Override // J8.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n[] e(int i9) {
        return new n[i9];
    }

    public final boolean j(Object obj, Object obj2) {
        int i9;
        J8.d[] dVarArrG;
        g();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !kotlin.jvm.internal.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.a(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i10 = this.f43717e;
            if ((i10 & 1) != 0) {
                this.f43717e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f43717e = i11;
            J8.d[] dVarArrG2 = g();
            q qVar = q.f43674a;
            while (true) {
                n[] nVarArr = (n[]) dVarArrG2;
                if (nVarArr != null) {
                    for (n nVar : nVarArr) {
                        if (nVar != null) {
                            nVar.f();
                        }
                    }
                }
                synchronized (this) {
                    i9 = this.f43717e;
                    if (i9 == i11) {
                        this.f43717e = i11 + 1;
                        return true;
                    }
                    dVarArrG = g();
                    q qVar2 = q.f43674a;
                }
                dVarArrG2 = dVarArrG;
                i11 = i9;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.j
    public void setValue(Object obj) {
        if (obj == null) {
            obj = J8.h.f3403a;
        }
        j(null, obj);
    }
}
