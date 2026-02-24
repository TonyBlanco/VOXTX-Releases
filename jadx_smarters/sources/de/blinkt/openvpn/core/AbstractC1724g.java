package de.blinkt.openvpn.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.security.KeyChainException;
import h8.InterfaceC1870c;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1724g {

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.g$a */
    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f40070a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f40071c;

        public a(BlockingQueue blockingQueue) {
            this.f40071c = blockingQueue;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (this.f40070a) {
                return;
            }
            this.f40070a = true;
            try {
                this.f40071c.put(InterfaceC1870c.a.A(iBinder));
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.g$b */
    public static class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f40072a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ServiceConnection f40073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC1870c f40074d;

        public b(Context context, ServiceConnection serviceConnection, InterfaceC1870c interfaceC1870c) {
            this.f40072a = context;
            this.f40073c = serviceConnection;
            this.f40074d = interfaceC1870c;
        }

        public InterfaceC1870c a() {
            return this.f40074d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40072a.unbindService(this.f40073c);
        }
    }

    public static b a(Context context, String str) throws KeyChainException {
        b(context);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        a aVar = new a(linkedBlockingQueue);
        Intent intent = new Intent("de.blinkt.openvpn.api.ExternalCertificateProvider");
        intent.setPackage(str);
        if (context.bindService(intent, aVar, 1)) {
            return new b(context, aVar, (InterfaceC1870c) linkedBlockingQueue.take());
        }
        throw new KeyChainException("could not bind to external authticator app: " + str);
    }

    public static void b(Context context) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper == context.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
    }

    public static X509Certificate[] c(Context context, String str, String str2) throws KeyChainException {
        try {
            b bVarA = a(context.getApplicationContext(), str);
            try {
                byte[] certificateChain = bVarA.a().getCertificateChain(str2);
                if (certificateChain == null) {
                    bVarA.close();
                    return null;
                }
                Collection collectionE = e(certificateChain);
                X509Certificate[] x509CertificateArr = (X509Certificate[]) collectionE.toArray(new X509Certificate[collectionE.size()]);
                bVarA.close();
                return x509CertificateArr;
            } catch (Throwable th) {
                if (bVarA != null) {
                    try {
                        bVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException | InterruptedException | RuntimeException e9) {
            throw new KeyChainException(e9);
        }
    }

    public static byte[] d(Context context, String str, String str2, byte[] bArr, Bundle bundle) throws KeyChainException {
        try {
            b bVarA = a(context.getApplicationContext(), str);
            try {
                InterfaceC1870c interfaceC1870cA = bVarA.a();
                byte[] bArrI0 = interfaceC1870cA.I0(str2, bArr, bundle);
                if (bArrI0 == null) {
                    bArrI0 = interfaceC1870cA.x(str2, bArr);
                }
                bVarA.close();
                return bArrI0;
            } finally {
            }
        } catch (RemoteException e9) {
            throw new KeyChainException(e9);
        }
    }

    public static Collection e(byte[] bArr) {
        try {
            Vector vector = new Vector();
            for (String str : new String(bArr, "iso8859-1").split("-----BEGIN CERTIFICATE-----")) {
                vector.addAll(CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(("-----BEGIN CERTIFICATE-----" + str).getBytes("iso8859-1"))));
            }
            return vector;
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        } catch (CertificateException e10) {
            throw new AssertionError(e10);
        }
    }
}
