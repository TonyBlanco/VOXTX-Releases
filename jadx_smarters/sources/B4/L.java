package b4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.k0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f17526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f17528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f17529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f17530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17532k;

    public static class a extends C1225p {
        public a(String str, Throwable th, int i9) {
            super(str, th, i9);
        }
    }

    public L(Context context) {
        super(false);
        this.f17526e = context.getResources();
        this.f17527f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i9) {
        return Uri.parse("rawresource:///" + i9);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws a {
        int identifier;
        String str;
        Uri uriNormalizeScheme = c1227s.f17598a.normalizeScheme();
        this.f17528g = uriNormalizeScheme;
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) AbstractC1684a.e(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) AbstractC1684a.e(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) AbstractC1684a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(strSubstring);
            identifier = this.f17526e.getIdentifier(sb.toString(), "raw", this.f17527f);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        v(c1227s);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f17526e.openRawResourceFd(identifier);
            this.f17529h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a("Resource is compressed: " + uriNormalizeScheme, null, AdError.SERVER_ERROR_CODE);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f17530i = fileInputStream;
            if (length != -1) {
                try {
                    if (c1227s.f17604g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e9) {
                    throw e9;
                } catch (IOException e10) {
                    throw new a(null, e10, AdError.SERVER_ERROR_CODE);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(c1227s.f17604g + startOffset) - startOffset;
            if (jSkip != c1227s.f17604g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f17531j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f17531j = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j9 = length - jSkip;
                this.f17531j = j9;
                if (j9 < 0) {
                    throw new C1225p(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = c1227s.f17605h;
            if (jMin != -1) {
                long j10 = this.f17531j;
                if (j10 != -1) {
                    jMin = Math.min(j10, jMin);
                }
                this.f17531j = jMin;
            }
            this.f17532k = true;
            w(c1227s);
            long j11 = c1227s.f17605h;
            return j11 != -1 ? j11 : this.f17531j;
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17528g = null;
        try {
            try {
                InputStream inputStream = this.f17530i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f17530i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f17529h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(null, e9, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f17529h = null;
                    if (this.f17532k) {
                        this.f17532k = false;
                        u();
                    }
                }
            } catch (IOException e10) {
                throw new a(null, e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f17530i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f17529h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f17529h = null;
                    if (this.f17532k) {
                        this.f17532k = false;
                        u();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(null, e11, AdError.SERVER_ERROR_CODE);
                }
            } finally {
                this.f17529h = null;
                if (this.f17532k) {
                    this.f17532k = false;
                    u();
                }
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17528g;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws a {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f17531j;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new a(null, e9, AdError.SERVER_ERROR_CODE);
            }
        }
        int i11 = ((InputStream) k0.j(this.f17530i)).read(bArr, i9, i10);
        if (i11 == -1) {
            if (this.f17531j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j10 = this.f17531j;
        if (j10 != -1) {
            this.f17531j = j10 - ((long) i11);
        }
        t(i11);
        return i11;
    }
}
