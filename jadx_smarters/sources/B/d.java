package b;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1191a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17421a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, e input) {
        l.e(context, "context");
        l.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        l.d(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i9, Intent intent) {
        return new androidx.activity.result.a(i9, intent);
    }
}
