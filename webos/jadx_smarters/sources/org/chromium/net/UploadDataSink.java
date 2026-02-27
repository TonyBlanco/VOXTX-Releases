package org.chromium.net;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z9);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
