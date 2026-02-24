package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1176f f15852a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1184n f15853c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15854a;

        static {
            int[] iArr = new int[AbstractC1180j.b.values().length];
            f15854a = iArr;
            try {
                iArr[AbstractC1180j.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15854a[AbstractC1180j.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(InterfaceC1176f interfaceC1176f, InterfaceC1184n interfaceC1184n) {
        this.f15852a = interfaceC1176f;
        this.f15853c = interfaceC1184n;
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        switch (a.f15854a[bVar.ordinal()]) {
            case 1:
                this.f15852a.a(interfaceC1186p);
                break;
            case 2:
                this.f15852a.i(interfaceC1186p);
                break;
            case 3:
                this.f15852a.d(interfaceC1186p);
                break;
            case 4:
                this.f15852a.f(interfaceC1186p);
                break;
            case 5:
                this.f15852a.g(interfaceC1186p);
                break;
            case 6:
                this.f15852a.h(interfaceC1186p);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1184n interfaceC1184n = this.f15853c;
        if (interfaceC1184n != null) {
            interfaceC1184n.b(interfaceC1186p, bVar);
        }
    }
}
