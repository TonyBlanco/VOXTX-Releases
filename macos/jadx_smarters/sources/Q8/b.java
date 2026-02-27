package Q8;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import pub.devrel.easypermissions.AppSettingsDialogHolderActivity;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8411a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f8419j;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i9) {
            return new b[i9];
        }
    }

    /* JADX INFO: renamed from: Q8.b$b, reason: collision with other inner class name */
    public static class C0111b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f8421b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f8426g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8422c = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8427h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f8428i = false;

        public C0111b(Activity activity) {
            this.f8420a = activity;
            this.f8421b = activity;
        }

        public b a() {
            this.f8423d = TextUtils.isEmpty(this.f8423d) ? this.f8421b.getString(e.f8444b) : this.f8423d;
            this.f8424e = TextUtils.isEmpty(this.f8424e) ? this.f8421b.getString(e.f8445c) : this.f8424e;
            this.f8425f = TextUtils.isEmpty(this.f8425f) ? this.f8421b.getString(R.string.ok) : this.f8425f;
            this.f8426g = TextUtils.isEmpty(this.f8426g) ? this.f8421b.getString(R.string.cancel) : this.f8426g;
            int i9 = this.f8427h;
            if (i9 <= 0) {
                i9 = 16061;
            }
            this.f8427h = i9;
            return new b(this.f8420a, this.f8422c, this.f8423d, this.f8424e, this.f8425f, this.f8426g, this.f8427h, this.f8428i ? 268435456 : 0, null);
        }
    }

    public b(Parcel parcel) {
        this.f8411a = parcel.readInt();
        this.f8412c = parcel.readString();
        this.f8413d = parcel.readString();
        this.f8414e = parcel.readString();
        this.f8415f = parcel.readString();
        this.f8416g = parcel.readInt();
        this.f8417h = parcel.readInt();
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public b(Object obj, int i9, String str, String str2, String str3, String str4, int i10, int i11) {
        d(obj);
        this.f8411a = i9;
        this.f8412c = str;
        this.f8413d = str2;
        this.f8414e = str3;
        this.f8415f = str4;
        this.f8416g = i10;
        this.f8417h = i11;
    }

    public /* synthetic */ b(Object obj, int i9, String str, String str2, String str3, String str4, int i10, int i11, a aVar) {
        this(obj, i9, str, str2, str3, str4, i10, i11);
    }

    public static b a(Intent intent, Activity activity) {
        b bVarA = (b) intent.getParcelableExtra("extra_app_settings");
        if (bVarA == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            bVarA = new C0111b(activity).a();
        }
        bVarA.d(activity);
        return bVarA;
    }

    public int c() {
        return this.f8417h;
    }

    public final void d(Object obj) {
        Context context;
        this.f8418i = obj;
        if (obj instanceof Activity) {
            context = (Activity) obj;
        } else {
            if (!(obj instanceof Fragment)) {
                throw new IllegalStateException("Unknown object: " + obj);
            }
            context = ((Fragment) obj).getContext();
        }
        this.f8419j = context;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        g(AppSettingsDialogHolderActivity.u1(this.f8419j, this));
    }

    public androidx.appcompat.app.a f(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i9 = this.f8411a;
        return (i9 != -1 ? new a.C0158a(this.f8419j, i9) : new a.C0158a(this.f8419j)).b(false).setTitle(this.f8413d).f(this.f8412c).j(this.f8414e, onClickListener).g(this.f8415f, onClickListener2).n();
    }

    public final void g(Intent intent) {
        Object obj = this.f8418i;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.f8416g);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.f8416g);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f8411a);
        parcel.writeString(this.f8412c);
        parcel.writeString(this.f8413d);
        parcel.writeString(this.f8414e);
        parcel.writeString(this.f8415f);
        parcel.writeInt(this.f8416g);
        parcel.writeInt(this.f8417h);
    }
}
