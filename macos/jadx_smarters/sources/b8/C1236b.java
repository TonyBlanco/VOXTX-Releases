package b8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: b8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1236b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f17723a;

    /* JADX INFO: renamed from: b8.b$a */
    public interface a {
        void c();

        void e();
    }

    public C1236b(a aVar) {
        this.f17723a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (AbstractC1237c.b(context)) {
            this.f17723a.e();
        } else {
            this.f17723a.c();
        }
    }
}
