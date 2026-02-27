package b;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1191a {

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    public static final class C0206a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17418a;

        public C0206a(Object obj) {
            this.f17418a = obj;
        }

        public final Object a() {
            return this.f17418a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0206a b(Context context, Object obj) {
        l.e(context, "context");
        return null;
    }

    public abstract Object c(int i9, Intent intent);
}
