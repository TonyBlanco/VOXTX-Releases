package com.squareup.okhttp.internal.framed;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Settings {
    static final int CLIENT_CERTIFICATE_VECTOR_SIZE = 8;
    static final int COUNT = 10;
    static final int CURRENT_CWND = 5;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65536;
    static final int DOWNLOAD_BANDWIDTH = 2;
    static final int DOWNLOAD_RETRANS_RATE = 6;
    static final int ENABLE_PUSH = 2;
    static final int FLAG_CLEAR_PREVIOUSLY_PERSISTED_SETTINGS = 1;
    static final int FLOW_CONTROL_OPTIONS = 10;
    static final int FLOW_CONTROL_OPTIONS_DISABLED = 1;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    static final int PERSISTED = 2;
    static final int PERSIST_VALUE = 1;
    static final int ROUND_TRIP_TIME = 3;
    static final int UPLOAD_BANDWIDTH = 1;
    private int persistValue;
    private int persisted;
    private int set;
    private final int[] values = new int[10];

    public void clear() {
        this.persisted = 0;
        this.persistValue = 0;
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    public int flags(int i9) {
        int i10 = isPersisted(i9) ? 2 : 0;
        return persistValue(i9) ? i10 | 1 : i10;
    }

    public int get(int i9) {
        return this.values[i9];
    }

    public int getClientCertificateVectorSize(int i9) {
        return (this.set & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? this.values[8] : i9;
    }

    public int getCurrentCwnd(int i9) {
        return (this.set & 32) != 0 ? this.values[5] : i9;
    }

    public int getDownloadBandwidth(int i9) {
        return (this.set & 4) != 0 ? this.values[2] : i9;
    }

    public int getDownloadRetransRate(int i9) {
        return (this.set & 64) != 0 ? this.values[6] : i9;
    }

    public boolean getEnablePush(boolean z9) {
        return ((this.set & 4) != 0 ? this.values[2] : z9 ? 1 : 0) == 1;
    }

    public int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public int getInitialWindowSize(int i9) {
        return (this.set & 128) != 0 ? this.values[7] : i9;
    }

    public int getMaxConcurrentStreams(int i9) {
        return (this.set & 16) != 0 ? this.values[4] : i9;
    }

    public int getMaxFrameSize(int i9) {
        return (this.set & 32) != 0 ? this.values[5] : i9;
    }

    public int getMaxHeaderListSize(int i9) {
        return (this.set & 64) != 0 ? this.values[6] : i9;
    }

    public int getRoundTripTime(int i9) {
        return (this.set & 8) != 0 ? this.values[3] : i9;
    }

    public int getUploadBandwidth(int i9) {
        return (this.set & 2) != 0 ? this.values[1] : i9;
    }

    public boolean isFlowControlDisabled() {
        return (((this.set & 1024) != 0 ? this.values[10] : 0) & 1) != 0;
    }

    public boolean isPersisted(int i9) {
        return ((1 << i9) & this.persisted) != 0;
    }

    public boolean isSet(int i9) {
        return ((1 << i9) & this.set) != 0;
    }

    public void merge(Settings settings) {
        for (int i9 = 0; i9 < 10; i9++) {
            if (settings.isSet(i9)) {
                set(i9, settings.flags(i9), settings.get(i9));
            }
        }
    }

    public boolean persistValue(int i9) {
        return ((1 << i9) & this.persistValue) != 0;
    }

    public Settings set(int i9, int i10, int i11) {
        int[] iArr = this.values;
        if (i9 >= iArr.length) {
            return this;
        }
        int i12 = 1 << i9;
        this.set |= i12;
        this.persistValue = (i10 & 1) != 0 ? this.persistValue | i12 : this.persistValue & (~i12);
        this.persisted = (i10 & 2) != 0 ? this.persisted | i12 : this.persisted & (~i12);
        iArr[i9] = i11;
        return this;
    }

    public int size() {
        return Integer.bitCount(this.set);
    }
}
