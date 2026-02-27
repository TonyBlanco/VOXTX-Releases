package q6;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47007a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f47011e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f47010d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47012f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47008b = "topic_operation_queue";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47009c = ",";

    public Y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f47007a = sharedPreferences;
        this.f47011e = executor;
    }

    public static Y d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Y y9 = new Y(sharedPreferences, "topic_operation_queue", ",", executor);
        y9.e();
        return y9;
    }

    public boolean b(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(this.f47009c)) {
            return false;
        }
        synchronized (this.f47010d) {
            zAdd = this.f47010d.add(str);
            c(zAdd);
        }
        return zAdd;
    }

    public final boolean c(boolean z9) {
        if (!z9 || this.f47012f) {
            return z9;
        }
        j();
        return true;
    }

    public final void e() {
        synchronized (this.f47010d) {
            try {
                this.f47010d.clear();
                String string = this.f47007a.getString(this.f47008b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f47009c)) {
                    String[] strArrSplit = string.split(this.f47009c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f47010d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.f47010d) {
            str = (String) this.f47010d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zRemove;
        synchronized (this.f47010d) {
            zRemove = this.f47010d.remove(obj);
            c(zRemove);
        }
        return zRemove;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f47010d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f47009c);
        }
        return sb.toString();
    }

    public final void i() {
        synchronized (this.f47010d) {
            this.f47007a.edit().putString(this.f47008b, h()).commit();
        }
    }

    public final void j() {
        this.f47011e.execute(new Runnable() { // from class: q6.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f47006a.i();
            }
        });
    }
}
