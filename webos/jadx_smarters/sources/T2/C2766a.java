package t2;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2766a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f50635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f50636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f50637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f50638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray f50639e = new SparseArray();

    public C2766a(Activity activity) {
        this.f50635a = activity;
        this.f50638d = activity.getApplicationContext();
    }

    public C2766a a() {
        View view = this.f50637c;
        if (view != null) {
            view.setVisibility(8);
        }
        return this;
    }

    public C2766a b(int i9) {
        View view = (View) this.f50639e.get(i9);
        this.f50637c = view;
        if (view == null) {
            View view2 = this.f50636b;
            this.f50637c = view2 != null ? view2.findViewById(i9) : this.f50635a.findViewById(i9);
            this.f50639e.put(i9, this.f50637c);
        }
        return this;
    }

    public C2766a c(CharSequence charSequence) {
        View view = this.f50637c;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(charSequence);
        }
        return this;
    }

    public View d() {
        return this.f50637c;
    }

    public C2766a e() {
        View view = this.f50637c;
        if (view != null) {
            view.setVisibility(0);
        }
        return this;
    }
}
