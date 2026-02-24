package androidx.fragment.app;

import D.AbstractC0519b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f15031a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f15033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f15035f;

    public j(Activity activity, Context context, Handler handler, int i9) {
        this.f15035f = new n();
        this.f15031a = activity;
        this.f15032c = (Context) O.h.g(context, "context == null");
        this.f15033d = (Handler) O.h.g(handler, "handler == null");
        this.f15034e = i9;
    }

    public j(AbstractActivityC1145e abstractActivityC1145e) {
        this(abstractActivityC1145e, abstractActivityC1145e, new Handler(), 0);
    }

    public Activity e() {
        return this.f15031a;
    }

    public Context f() {
        return this.f15032c;
    }

    public Handler g() {
        return this.f15033d;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(Fragment fragment, String[] strArr, int i9) {
    }

    public abstract boolean l(Fragment fragment);

    public abstract boolean m(String str);

    public void n(Fragment fragment, Intent intent, int i9, Bundle bundle) {
        if (i9 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        E.b.startActivity(this.f15032c, intent, bundle);
    }

    public void o(Fragment fragment, IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (i9 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC0519b.n(this.f15031a, intentSender, i9, intent, i10, i11, i12, bundle);
    }

    public abstract void p();
}
