package Q8;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f8454f;

    public g(Bundle bundle) {
        this.f8449a = bundle.getString("positiveButton");
        this.f8450b = bundle.getString("negativeButton");
        this.f8453e = bundle.getString("rationaleMsg");
        this.f8451c = bundle.getInt("theme");
        this.f8452d = bundle.getInt("requestCode");
        this.f8454f = bundle.getStringArray("permissions");
    }

    public g(String str, String str2, String str3, int i9, int i10, String[] strArr) {
        this.f8449a = str;
        this.f8450b = str2;
        this.f8453e = str3;
        this.f8451c = i9;
        this.f8452d = i10;
        this.f8454f = strArr;
    }

    public AlertDialog a(Context context, DialogInterface.OnClickListener onClickListener) {
        return (this.f8451c > 0 ? new AlertDialog.Builder(context, this.f8451c) : new AlertDialog.Builder(context)).setCancelable(false).setPositiveButton(this.f8449a, onClickListener).setNegativeButton(this.f8450b, onClickListener).setMessage(this.f8453e).create();
    }

    public androidx.appcompat.app.a b(Context context, DialogInterface.OnClickListener onClickListener) {
        int i9 = this.f8451c;
        return (i9 > 0 ? new a.C0158a(context, i9) : new a.C0158a(context)).b(false).j(this.f8449a, onClickListener).g(this.f8450b, onClickListener).f(this.f8453e).create();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f8449a);
        bundle.putString("negativeButton", this.f8450b);
        bundle.putString("rationaleMsg", this.f8453e);
        bundle.putInt("theme", this.f8451c);
        bundle.putInt("requestCode", this.f8452d);
        bundle.putStringArray("permissions", this.f8454f);
        return bundle;
    }
}
