package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class po extends IOException {
    public po(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + InstructionFileId.DOT);
    }
}
