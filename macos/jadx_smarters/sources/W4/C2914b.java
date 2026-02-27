package w4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: w4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914b extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f51649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f51650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2914b f51646j = new C2914b(0);
    public static final Parcelable.Creator<C2914b> CREATOR = new s();

    public C2914b(int i9) {
        this(i9, null, null);
    }

    public C2914b(int i9, int i10, PendingIntent pendingIntent, String str) {
        this.f51647f = i9;
        this.f51648g = i10;
        this.f51649h = pendingIntent;
        this.f51650i = str;
    }

    public C2914b(int i9, PendingIntent pendingIntent) {
        this(i9, pendingIntent, null);
    }

    public C2914b(int i9, PendingIntent pendingIntent, String str) {
        this(1, i9, pendingIntent, str);
    }

    public static String M(int i9) {
        if (i9 == 99) {
            return "UNFINISHED";
        }
        if (i9 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i9) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i9) {
                    case 13:
                        return "CANCELED";
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        return "TIMEOUT";
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case LangUtils.HASH_SEED /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i9 + ")";
                }
        }
    }

    public int H() {
        return this.f51648g;
    }

    public String I() {
        return this.f51650i;
    }

    public PendingIntent J() {
        return this.f51649h;
    }

    public boolean K() {
        return (this.f51648g == 0 || this.f51649h == null) ? false : true;
    }

    public boolean L() {
        return this.f51648g == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2914b)) {
            return false;
        }
        C2914b c2914b = (C2914b) obj;
        return this.f51648g == c2914b.f51648g && AbstractC1418q.b(this.f51649h, c2914b.f51649h) && AbstractC1418q.b(this.f51650i, c2914b.f51650i);
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f51648g), this.f51649h, this.f51650i);
    }

    public String toString() {
        AbstractC1418q.a aVarD = AbstractC1418q.d(this);
        aVarD.a("statusCode", M(this.f51648g));
        aVarD.a("resolution", this.f51649h);
        aVarD.a("message", this.f51650i);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f51647f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.l(parcel, 2, H());
        y4.c.r(parcel, 3, J(), i9, false);
        y4.c.t(parcel, 4, I(), false);
        y4.c.b(parcel, iA);
    }
}
