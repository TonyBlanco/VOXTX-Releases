package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C extends GoogleApiClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26465b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public C(String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.f26465b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f26465b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.f26465b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean j() {
        throw new UnsupportedOperationException(this.f26465b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f26465b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void l(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f26465b);
    }
}
