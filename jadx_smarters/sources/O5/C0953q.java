package O5;

import Q5.B;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: O5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0953q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f6653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f6654g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0937a f6657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W5.d f6658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V5.i f6659e;

    static {
        HashMap map = new HashMap();
        f6653f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f6654g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.4.1");
    }

    public C0953q(Context context, y yVar, C0937a c0937a, W5.d dVar, V5.i iVar) {
        this.f6655a = context;
        this.f6656b = yVar;
        this.f6657c = c0937a;
        this.f6658d = dVar;
        this.f6659e = iVar;
    }

    public static int f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f6653f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final B.a a(B.a aVar) {
        Q5.C cA;
        if (!this.f6659e.b().f10070b.f10079c || this.f6657c.f6551c.size() <= 0) {
            cA = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C0942f c0942f : this.f6657c.f6551c) {
                arrayList.add(B.a.AbstractC0093a.a().d(c0942f.c()).b(c0942f.a()).c(c0942f.b()).a());
            }
            cA = Q5.C.a(arrayList);
        }
        return B.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(cA).a();
    }

    public final B.b b() {
        return Q5.B.b().j("18.4.1").f(this.f6657c.f6549a).g(this.f6656b.a().c()).e(this.f6656b.a().d()).c(this.f6657c.f6554f).d(this.f6657c.f6555g).i(4);
    }

    public B.e.d c(B.a aVar) {
        int i9 = this.f6655a.getResources().getConfiguration().orientation;
        return B.e.d.a().f("anr").e(aVar.i()).b(i(i9, a(aVar))).c(k(i9)).a();
    }

    public B.e.d d(Throwable th, Thread thread, String str, long j9, int i9, int i10, boolean z9) {
        int i11 = this.f6655a.getResources().getConfiguration().orientation;
        return B.e.d.a().f(str).e(j9).b(j(i11, new W5.e(th, this.f6658d), thread, i9, i10, z9)).c(k(i11)).a();
    }

    public Q5.B e(String str, long j9) {
        return b().k(s(str, j9)).a();
    }

    public final B.e.d.a.b.AbstractC0097a g() {
        return B.e.d.a.b.AbstractC0097a.a().b(0L).d(0L).c(this.f6657c.f6553e).e(this.f6657c.f6550b).a();
    }

    public final Q5.C h() {
        return Q5.C.b(g());
    }

    public final B.e.d.a i(int i9, B.a aVar) {
        return B.e.d.a.a().b(Boolean.valueOf(aVar.c() != 100)).f(i9).d(n(aVar)).a();
    }

    public final B.e.d.a j(int i9, W5.e eVar, Thread thread, int i10, int i11, boolean z9) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoJ = AbstractC0945i.j(this.f6657c.f6553e, this.f6655a);
        if (runningAppProcessInfoJ != null) {
            boolValueOf = Boolean.valueOf(runningAppProcessInfoJ.importance != 100);
        } else {
            boolValueOf = null;
        }
        return B.e.d.a.a().b(boolValueOf).f(i9).d(o(eVar, thread, i10, i11, z9)).a();
    }

    public final B.e.d.c k(int i9) {
        C0941e c0941eA = C0941e.a(this.f6655a);
        Float fB = c0941eA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c0941eA.c();
        boolean zP = AbstractC0945i.p(this.f6655a);
        return B.e.d.c.a().b(dValueOf).c(iC).f(zP).e(i9).g(AbstractC0945i.t() - AbstractC0945i.a(this.f6655a)).d(AbstractC0945i.b(Environment.getDataDirectory().getPath())).a();
    }

    public final B.e.d.a.b.c l(W5.e eVar, int i9, int i10) {
        return m(eVar, i9, i10, 0);
    }

    public final B.e.d.a.b.c m(W5.e eVar, int i9, int i10, int i11) {
        String str = eVar.f10310b;
        String str2 = eVar.f10309a;
        StackTraceElement[] stackTraceElementArr = eVar.f10311c;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        W5.e eVar2 = eVar.f10312d;
        if (i11 >= i10) {
            W5.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f10312d;
                i12++;
            }
        }
        B.e.d.a.b.c.AbstractC0100a abstractC0100aD = B.e.d.a.b.c.a().f(str).e(str2).c(Q5.C.a(q(stackTraceElementArr, i9))).d(i12);
        if (eVar2 != null && i12 == 0) {
            abstractC0100aD.b(m(eVar2, i9, i10, i11 + 1));
        }
        return abstractC0100aD.a();
    }

    public final B.e.d.a.b n(B.a aVar) {
        return B.e.d.a.b.a().b(aVar).e(v()).c(h()).a();
    }

    public final B.e.d.a.b o(W5.e eVar, Thread thread, int i9, int i10, boolean z9) {
        return B.e.d.a.b.a().f(y(eVar, thread, i9, z9)).d(l(eVar, i9, i10)).e(v()).c(h()).a();
    }

    public final B.e.d.a.b.AbstractC0103e.AbstractC0105b p(StackTraceElement stackTraceElement, B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a abstractC0106a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + InstructionFileId.DOT + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0106a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    public final Q5.C q(StackTraceElement[] stackTraceElementArr, int i9) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(p(stackTraceElement, B.e.d.a.b.AbstractC0103e.AbstractC0105b.a().c(i9)));
        }
        return Q5.C.a(arrayList);
    }

    public final B.e.a r() {
        return B.e.a.a().e(this.f6656b.f()).g(this.f6657c.f6554f).d(this.f6657c.f6555g).f(this.f6656b.a().c()).b(this.f6657c.f6556h.d()).c(this.f6657c.f6556h.e()).a();
    }

    public final B.e s(String str, long j9) {
        return B.e.a().m(j9).j(str).h(f6654g).b(r()).l(u()).e(t()).i(3).a();
    }

    public final B.e.c t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iF = f();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jT = AbstractC0945i.t();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean z9 = AbstractC0945i.z();
        int iN = AbstractC0945i.n();
        String str = Build.MANUFACTURER;
        return B.e.c.a().b(iF).f(Build.MODEL).c(iAvailableProcessors).h(jT).d(blockCount).i(z9).j(iN).e(str).g(Build.PRODUCT).a();
    }

    public final B.e.AbstractC0108e u() {
        return B.e.AbstractC0108e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC0945i.A()).a();
    }

    public final B.e.d.a.b.AbstractC0101d v() {
        return B.e.d.a.b.AbstractC0101d.a().d("0").c("0").b(0L).a();
    }

    public final B.e.d.a.b.AbstractC0103e w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return x(thread, stackTraceElementArr, 0);
    }

    public final B.e.d.a.b.AbstractC0103e x(Thread thread, StackTraceElement[] stackTraceElementArr, int i9) {
        return B.e.d.a.b.AbstractC0103e.a().d(thread.getName()).c(i9).b(Q5.C.a(q(stackTraceElementArr, i9))).a();
    }

    public final Q5.C y(W5.e eVar, Thread thread, int i9, boolean z9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(thread, eVar.f10311c, i9));
        if (z9) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(w(key, this.f6658d.a(entry.getValue())));
                }
            }
        }
        return Q5.C.a(arrayList);
    }
}
