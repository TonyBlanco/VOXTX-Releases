package Q0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7457a = k.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e9) {
            k.c().b(f7457a, "Trouble instantiating + " + str, e9);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
