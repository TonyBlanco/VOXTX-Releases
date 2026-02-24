package k6;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n6.C2297b;
import n6.InterfaceC2296a;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f43624b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f43625c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f43626d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2296a f43627a;

    public p(InterfaceC2296a interfaceC2296a) {
        this.f43627a = interfaceC2296a;
    }

    public static p c() {
        return d(C2297b.b());
    }

    public static p d(InterfaceC2296a interfaceC2296a) {
        if (f43626d == null) {
            f43626d = new p(interfaceC2296a);
        }
        return f43626d;
    }

    public static boolean g(String str) {
        return f43625c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f43627a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(l6.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f43624b;
    }
}
