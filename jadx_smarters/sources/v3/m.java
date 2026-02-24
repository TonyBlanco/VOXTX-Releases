package v3;

import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2743y f51329e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i9) {
            return new m[i9];
        }
    }

    public m(Parcel parcel) {
        this((String) AbstractC1684a.e(parcel.readString()), parcel.readString(), AbstractC2743y.s((String[]) AbstractC1684a.e(parcel.createStringArray())));
    }

    public /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    public m(String str, String str2, List list) {
        super(str);
        AbstractC1684a.a(!list.isEmpty());
        this.f51327c = str2;
        AbstractC2743y abstractC2743yR = AbstractC2743y.r(list);
        this.f51329e = abstractC2743yR;
        this.f51328d = (String) abstractC2743yR.get(0);
    }

    public static List a(String str) {
        int i9;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i9 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i9 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i9 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i9));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return k0.c(this.f51316a, mVar.f51316a) && k0.c(this.f51327c, mVar.f51327c) && this.f51329e.equals(mVar.f51329e);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f51316a.hashCode()) * 31;
        String str = this.f51327c;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f51329e.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // v3.i, q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        String str = this.f51316a;
        str.hashCode();
        byte b9 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b9 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b9 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b9 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b9 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b9 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b9 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b9 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b9 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b9 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b9 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b9 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b9 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b9 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b9 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b9 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b9 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b9 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b9 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b9 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b9 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b9 = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b9 = 21;
                }
                break;
        }
        try {
            switch (b9) {
                case 0:
                case 10:
                    bVar.N((CharSequence) this.f51329e.get(0));
                    break;
                case 1:
                case 11:
                    bVar.S((CharSequence) this.f51329e.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = (String) this.f51329e.get(0);
                    bVar.f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case LangUtils.HASH_SEED /* 17 */:
                    bVar.O((CharSequence) this.f51329e.get(0));
                    break;
                case 4:
                case 18:
                    bVar.M((CharSequence) this.f51329e.get(0));
                    break;
                case 5:
                case 19:
                    bVar.T((CharSequence) this.f51329e.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrI1 = k0.i1((String) this.f51329e.get(0), "/");
                    bVar.p0(Integer.valueOf(Integer.parseInt(strArrI1[0]))).o0(strArrI1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrI1[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.m0((CharSequence) this.f51329e.get(0));
                    break;
                case 8:
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    bVar.r0((CharSequence) this.f51329e.get(0));
                    break;
                case 9:
                case 21:
                    bVar.g0(Integer.valueOf(Integer.parseInt((String) this.f51329e.get(0))));
                    break;
                case 13:
                    List listA = a((String) this.f51329e.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.e0((Integer) listA.get(2));
                            }
                        }
                        bVar.f0((Integer) listA.get(1));
                    }
                    bVar.g0((Integer) listA.get(0));
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    List listA2 = a((String) this.f51329e.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.h0((Integer) listA2.get(2));
                            }
                        }
                        bVar.i0((Integer) listA2.get(1));
                    }
                    bVar.j0((Integer) listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": description=" + this.f51327c + ": values=" + this.f51329e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51316a);
        parcel.writeString(this.f51327c);
        parcel.writeStringArray((String[]) this.f51329e.toArray(new String[0]));
    }
}
