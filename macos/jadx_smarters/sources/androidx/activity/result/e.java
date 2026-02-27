package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f13550a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f13551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13553e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i9) {
            return new e[i9];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IntentSender f13554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f13555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13557d;

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public b(IntentSender intentSender) {
            this.f13554a = intentSender;
        }

        public e a() {
            return new e(this.f13554a, this.f13555b, this.f13556c, this.f13557d);
        }

        public b b(Intent intent) {
            this.f13555b = intent;
            return this;
        }

        public b c(int i9, int i10) {
            this.f13557d = i9;
            this.f13556c = i10;
            return this;
        }
    }

    public e(IntentSender intentSender, Intent intent, int i9, int i10) {
        this.f13550a = intentSender;
        this.f13551c = intent;
        this.f13552d = i9;
        this.f13553e = i10;
    }

    public e(Parcel parcel) {
        this.f13550a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f13551c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f13552d = parcel.readInt();
        this.f13553e = parcel.readInt();
    }

    public Intent a() {
        return this.f13551c;
    }

    public int c() {
        return this.f13552d;
    }

    public int d() {
        return this.f13553e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f13550a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.f13550a, i9);
        parcel.writeParcelable(this.f13551c, i9);
        parcel.writeInt(this.f13552d);
        parcel.writeInt(this.f13553e);
    }
}
