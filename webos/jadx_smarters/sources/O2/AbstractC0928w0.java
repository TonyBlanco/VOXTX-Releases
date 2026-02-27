package O2;

import java.util.HashSet;

/* JADX INFO: renamed from: O2.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0928w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f6358a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6359b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f6358a.add(str)) {
            f6359b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f6359b;
    }
}
