package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1722e implements Parcelable {
    LEVEL_CONNECTED,
    LEVEL_VPNPAUSED,
    LEVEL_CONNECTING_SERVER_REPLIED,
    LEVEL_CONNECTING_NO_SERVER_REPLY_YET,
    LEVEL_NONETWORK,
    LEVEL_NOTCONNECTED,
    LEVEL_START,
    LEVEL_AUTH_FAILED,
    LEVEL_WAITING_FOR_USER_INPUT,
    UNKNOWN_LEVEL;

    public static final Parcelable.Creator<EnumC1722e> CREATOR = new Parcelable.Creator() { // from class: de.blinkt.openvpn.core.e.a
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC1722e createFromParcel(Parcel parcel) {
            return EnumC1722e.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC1722e[] newArray(int i9) {
            return new EnumC1722e[i9];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(ordinal());
    }
}
