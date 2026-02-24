package u6;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.d;
import o8.InterfaceC2372d;
import q8.AbstractC2645d;
import u6.InterfaceC2857b;

/* JADX INFO: renamed from: u6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2856a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2856a f51213a = new C2856a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f51214b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: u6.a$a, reason: collision with other inner class name */
    public static final class C0468a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.coroutines.sync.b f51215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC2857b f51216b;

        public C0468a(kotlinx.coroutines.sync.b mutex, InterfaceC2857b interfaceC2857b) {
            l.e(mutex, "mutex");
            this.f51215a = mutex;
            this.f51216b = interfaceC2857b;
        }

        public /* synthetic */ C0468a(kotlinx.coroutines.sync.b bVar, InterfaceC2857b interfaceC2857b, int i9, g gVar) {
            this(bVar, (i9 & 2) != 0 ? null : interfaceC2857b);
        }

        public final kotlinx.coroutines.sync.b a() {
            return this.f51215a;
        }

        public final InterfaceC2857b b() {
            return this.f51216b;
        }

        public final void c(InterfaceC2857b interfaceC2857b) {
            this.f51216b = interfaceC2857b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0468a)) {
                return false;
            }
            C0468a c0468a = (C0468a) obj;
            return l.a(this.f51215a, c0468a.f51215a) && l.a(this.f51216b, c0468a.f51216b);
        }

        public int hashCode() {
            int iHashCode = this.f51215a.hashCode() * 31;
            InterfaceC2857b interfaceC2857b = this.f51216b;
            return iHashCode + (interfaceC2857b == null ? 0 : interfaceC2857b.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f51215a + ", subscriber=" + this.f51216b + ')';
        }
    }

    /* JADX INFO: renamed from: u6.a$b */
    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f51217a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f51218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f51219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f51220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f51221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f51222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f51223h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f51225j;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f51223h = obj;
            this.f51225j |= Integer.MIN_VALUE;
            return C2856a.this.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC2857b.a subscriberName) {
        l.e(subscriberName, "subscriberName");
        Map dependencies = f51214b;
        if (!dependencies.containsKey(subscriberName)) {
            l.d(dependencies, "dependencies");
            dependencies.put(subscriberName, new C0468a(d.a(true), null, 2, 0 == true ? 1 : 0));
        } else {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
        }
    }

    public final C0468a b(InterfaceC2857b.a aVar) {
        Map dependencies = f51214b;
        l.d(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            l.d(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0468a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(o8.InterfaceC2372d r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof u6.C2856a.b
            if (r0 == 0) goto L13
            r0 = r11
            u6.a$b r0 = (u6.C2856a.b) r0
            int r1 = r0.f51225j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51225j = r1
            goto L18
        L13:
            u6.a$b r0 = new u6.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f51223h
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f51225j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f51222g
            java.lang.Object r5 = r0.f51221f
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f51220e
            kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.b) r6
            java.lang.Object r7 = r0.f51219d
            u6.b$a r7 = (u6.InterfaceC2857b.a) r7
            java.lang.Object r8 = r0.f51218c
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f51217a
            java.util.Map r9 = (java.util.Map) r9
            k8.k.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            k8.k.b(r11)
            java.util.Map r11 = u6.C2856a.f51214b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.l.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = l8.AbstractC2204A.a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            u6.b$a r7 = (u6.InterfaceC2857b.a) r7
            java.lang.Object r11 = r11.getValue()
            u6.a$a r11 = (u6.C2856a.C0468a) r11
            kotlinx.coroutines.sync.b r6 = r11.a()
            r0.f51217a = r5
            r0.f51218c = r8
            r0.f51219d = r7
            r0.f51220e = r6
            r0.f51221f = r5
            r0.f51222g = r2
            r0.f51225j = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            u6.a r11 = u6.C2856a.f51213a     // Catch: java.lang.Throwable -> Lb0
            u6.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.c(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.c(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C2856a.c(o8.d):java.lang.Object");
    }

    public final InterfaceC2857b d(InterfaceC2857b.a subscriberName) {
        l.e(subscriberName, "subscriberName");
        InterfaceC2857b interfaceC2857bB = b(subscriberName).b();
        if (interfaceC2857bB != null) {
            return interfaceC2857bB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void e(InterfaceC2857b subscriber) {
        l.e(subscriber, "subscriber");
        InterfaceC2857b.a aVarC = subscriber.c();
        C0468a c0468aB = b(aVarC);
        if (c0468aB.b() == null) {
            c0468aB.c(subscriber);
            b.a.a(c0468aB.a(), null, 1, null);
            return;
        }
        Log.d("SessionsDependencies", "Subscriber " + aVarC + " already registered.");
    }
}
