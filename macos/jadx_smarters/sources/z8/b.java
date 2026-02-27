package z8;

import java.util.Random;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends z8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f52854d = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // z8.a
    public Random e() {
        Object obj = this.f52854d.get();
        l.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
