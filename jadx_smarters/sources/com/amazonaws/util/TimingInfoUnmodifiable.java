package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
final class TimingInfoUnmodifiable extends TimingInfo {
    public TimingInfoUnmodifiable(Long l9, long j9, Long l10) {
        super(l9, j9, l10);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTime(long j9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTimeNano(long j9) {
        throw new UnsupportedOperationException();
    }
}
