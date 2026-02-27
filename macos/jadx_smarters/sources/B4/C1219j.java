package b4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import d4.k0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: b4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1219j extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f17581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f17583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f17584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17586j;

    /* JADX INFO: renamed from: b4.j$a */
    public static class a extends C1225p {
        public a(IOException iOException, int i9) {
            super(iOException, i9);
        }
    }

    public C1219j(Context context) {
        super(false);
        this.f17581e = context.getContentResolver();
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        int i9 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uriNormalizeScheme = c1227s.f17598a.normalizeScheme();
            this.f17582f = uriNormalizeScheme;
            v(c1227s);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f17581e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f17581e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f17583g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), AdError.SERVER_ERROR_CODE);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f17584h = fileInputStream;
            if (length != -1 && c1227s.f17604g > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(c1227s.f17604g + startOffset) - startOffset;
            if (jSkip != c1227s.f17604g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f17585i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f17585i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j9 = length - jSkip;
                this.f17585i = j9;
                if (j9 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = c1227s.f17605h;
            if (jMin != -1) {
                long j10 = this.f17585i;
                if (j10 != -1) {
                    jMin = Math.min(j10, jMin);
                }
                this.f17585i = jMin;
            }
            this.f17586j = true;
            w(c1227s);
            long j11 = c1227s.f17605h;
            return j11 != -1 ? j11 : this.f17585i;
        } catch (a e9) {
            throw e9;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i9 = 2005;
            }
            throw new a(e10, i9);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17582f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f17584h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f17584h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f17583g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(e9, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f17583g = null;
                    if (this.f17586j) {
                        this.f17586j = false;
                        u();
                    }
                }
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f17584h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f17583g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f17583g = null;
                    if (this.f17586j) {
                        this.f17586j = false;
                        u();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11, AdError.SERVER_ERROR_CODE);
                }
            } finally {
                this.f17583g = null;
                if (this.f17586j) {
                    this.f17586j = false;
                    u();
                }
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17582f;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws a {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f17585i;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new a(e9, AdError.SERVER_ERROR_CODE);
            }
        }
        int i11 = ((FileInputStream) k0.j(this.f17584h)).read(bArr, i9, i10);
        if (i11 == -1) {
            return -1;
        }
        long j10 = this.f17585i;
        if (j10 != -1) {
            this.f17585i = j10 - ((long) i11);
        }
        t(i11);
        return i11;
    }
}
