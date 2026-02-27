package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ od f23911a = new od();

    private /* synthetic */ od() {
    }

    public final ob a(UUID uuid) {
        try {
            return og.o(uuid);
        } catch (ol unused) {
            cd.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + String.valueOf(uuid) + InstructionFileId.DOT);
            return new ny();
        }
    }
}
