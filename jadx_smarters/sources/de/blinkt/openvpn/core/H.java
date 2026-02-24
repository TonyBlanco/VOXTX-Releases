package de.blinkt.openvpn.core;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H {
    public static Certificate[] a(String str) throws CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Vector vector = new Vector();
        if (!f8.l.E(str)) {
            return new Certificate[]{certificateFactory.generateCertificate(new FileInputStream(str))};
        }
        int iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----");
        do {
            int iMax = Math.max(0, iIndexOf);
            vector.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.substring(iMax).getBytes())));
            iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----", iMax + 1);
        } while (iIndexOf > 0);
        return (Certificate[]) vector.toArray(new Certificate[vector.size()]);
    }
}
