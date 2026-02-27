package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class cv extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f22663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f22664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f22665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileInputStream f22666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22668f;

    public cv(Context context) {
        super(false);
        this.f22663a = context.getContentResolver();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws cu {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f22667e;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new cu(e9, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.f22666d;
        int i11 = cq.f22640a;
        int i12 = fileInputStream.read(bArr, i9, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.f22667e;
        if (j10 != -1) {
            this.f22667e = j10 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws cu {
        int i9;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = dcVar.f22688a;
                this.f22664b = uri;
                i(dcVar);
                if ("content".equals(dcVar.f22688a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f22663a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f22663a.openAssetFileDescriptor(uri, "r");
                }
                this.f22665c = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(uri));
                    i9 = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new cu(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e9) {
                        e = e9;
                        if (true == (e instanceof FileNotFoundException)) {
                            i9 = 2005;
                        }
                        throw new cu(e, i9);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f22666d = fileInputStream;
                if (length != -1 && dcVar.f22692e > length) {
                    throw new cu(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(dcVar.f22692e + startOffset) - startOffset;
                if (jSkip != dcVar.f22692e) {
                    throw new cu(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f22667e = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f22667e = jPosition;
                        if (jPosition < 0) {
                            throw new cu(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f22667e = jPosition;
                    if (jPosition < 0) {
                        throw new cu(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long jMin = dcVar.f22693f;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f22667e = jMin;
                }
                this.f22668f = true;
                j(dcVar);
                long j9 = dcVar.f22693f;
                return j9 != -1 ? j9 : this.f22667e;
            } catch (cu e10) {
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            i9 = AdError.SERVER_ERROR_CODE;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22664b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws cu {
        this.f22664b = null;
        try {
            try {
                FileInputStream fileInputStream = this.f22666d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f22666d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f22665c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new cu(e9, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f22665c = null;
                    if (this.f22668f) {
                        this.f22668f = false;
                        h();
                    }
                }
            } catch (IOException e10) {
                throw new cu(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f22666d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f22665c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f22665c = null;
                    if (this.f22668f) {
                        this.f22668f = false;
                        h();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new cu(e11, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th2) {
                this.f22665c = null;
                if (this.f22668f) {
                    this.f22668f = false;
                    h();
                }
                throw th2;
            }
        }
    }
}
