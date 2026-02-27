package b;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: b.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1193c extends AbstractC1191a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17420a = new a(null);

    /* JADX INFO: renamed from: b.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        l.e(context, "context");
        l.e(input, "input");
        return input;
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i9, Intent intent) {
        return new androidx.activity.result.a(i9, intent);
    }
}
