package com.google.ads.interactivemedia.v3.api;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18607c;

    public VersionInfo(int i9, int i10, int i11) {
        this.f18605a = i9;
        this.f18606b = i10;
        this.f18607c = i11;
    }

    public int getMajorVersion() {
        return this.f18605a;
    }

    public int getMicroVersion() {
        return this.f18607c;
    }

    public int getMinorVersion() {
        return this.f18606b;
    }

    public String toString() {
        return this.f18605a + InstructionFileId.DOT + this.f18606b + InstructionFileId.DOT + this.f18607c;
    }
}
