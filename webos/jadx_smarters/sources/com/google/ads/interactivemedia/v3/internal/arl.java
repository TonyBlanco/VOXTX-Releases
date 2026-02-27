package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import okio.Utf8;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
@Hide
@VisibleForTesting
public final class arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    protected static final byte[] f20575a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    protected static final byte[] f20576b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f20577c = f20576b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f20578d = f20575a;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrE = afe.e(file.getAbsolutePath());
            if (x509CertificateArrE.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(x509CertificateArrE[0][0].getEncoded());
            if (Arrays.equals(this.f20578d, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f20577c, bArrDigest);
        } catch (afb e9) {
            throw new GeneralSecurityException("Package is not signed", e9);
        } catch (IOException e10) {
            e = e10;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
