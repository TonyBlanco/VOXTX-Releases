package U5;

import C2.u;
import O5.D;
import O5.r;
import Q5.B;
import R5.h;
import V5.i;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f9808c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9809d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9810e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC3017e f9811f = new InterfaceC3017e() { // from class: U5.a
        @Override // z2.InterfaceC3017e
        public final Object apply(Object obj) {
            return b.d((B) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3017e f9813b;

    public b(e eVar, InterfaceC3017e interfaceC3017e) {
        this.f9812a = eVar;
        this.f9813b = interfaceC3017e;
    }

    public static b b(Context context, i iVar, D d9) {
        u.f(context);
        InterfaceC3019g interfaceC3019gG = u.c().g(new A2.a(f9809d, f9810e));
        C3014b c3014bB = C3014b.b("json");
        InterfaceC3017e interfaceC3017e = f9811f;
        return new b(new e(interfaceC3019gG.a("FIREBASE_CRASHLYTICS_REPORT", B.class, c3014bB, interfaceC3017e), iVar.b(), d9), interfaceC3017e);
    }

    public static /* synthetic */ byte[] d(B b9) {
        return f9808c.G(b9).getBytes(Charset.forName("UTF-8"));
    }

    public static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i9 = 0; i9 < str.length(); i9++) {
            sb.append(str.charAt(i9));
            if (str2.length() > i9) {
                sb.append(str2.charAt(i9));
            }
        }
        return sb.toString();
    }

    public Task c(r rVar, boolean z9) {
        return this.f9812a.i(rVar, z9).getTask();
    }
}
