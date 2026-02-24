package o4;

import n4.C2286s;

/* JADX INFO: renamed from: o4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2318A {
    public static final int TRANSFER_FAILED_REASON_STORE_SESSION_STATE = 100;
    public static final int TRANSFER_FAILED_REASON_TRANSFER_TIMEOUT = 101;
    public static final int TRANSFER_TYPE_FROM_REMOTE_TO_LOCAL = 1;
    public static final int TRANSFER_TYPE_UNKNOWN = 0;

    public abstract void onTransferFailed(int i9, int i10);

    public abstract void onTransferred(int i9, C2286s c2286s);

    public abstract void onTransferring(int i9);
}
