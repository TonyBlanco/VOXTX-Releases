package com.google.ads.interactivemedia.v3.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class nc extends Exception {
    public /* synthetic */ nc(UUID uuid) {
        super("Media does not support uuid: ".concat(String.valueOf(uuid)));
    }
}
