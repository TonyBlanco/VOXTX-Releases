package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import de.blinkt.openvpn.core.G;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import okhttp3.internal.http2.Http2;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes4.dex */
public class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f40078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G.c f40081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40083g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i9) {
            return new k[i9];
        }
    }

    public k(Parcel parcel) {
        this.f40078a = null;
        this.f40079c = null;
        this.f40081e = G.c.INFO;
        this.f40082f = System.currentTimeMillis();
        this.f40083g = -1;
        this.f40078a = parcel.readArray(Object.class.getClassLoader());
        this.f40079c = parcel.readString();
        this.f40080d = parcel.readInt();
        this.f40081e = G.c.getEnumByValue(parcel.readInt());
        this.f40083g = parcel.readInt();
        this.f40082f = parcel.readLong();
    }

    public k(G.c cVar, int i9) {
        this.f40078a = null;
        this.f40079c = null;
        this.f40081e = G.c.INFO;
        this.f40082f = System.currentTimeMillis();
        this.f40083g = -1;
        this.f40080d = i9;
        this.f40081e = cVar;
    }

    public k(G.c cVar, int i9, String str) {
        this.f40078a = null;
        this.f40079c = null;
        this.f40081e = G.c.INFO;
        this.f40082f = System.currentTimeMillis();
        this.f40079c = str;
        this.f40081e = cVar;
        this.f40083g = i9;
    }

    public k(G.c cVar, int i9, Object... objArr) {
        this.f40078a = null;
        this.f40079c = null;
        this.f40081e = G.c.INFO;
        this.f40082f = System.currentTimeMillis();
        this.f40083g = -1;
        this.f40080d = i9;
        this.f40078a = objArr;
        this.f40081e = cVar;
    }

    public k(G.c cVar, String str) {
        this.f40078a = null;
        this.f40079c = null;
        this.f40081e = G.c.INFO;
        this.f40082f = System.currentTimeMillis();
        this.f40083g = -1;
        this.f40081e = cVar;
        this.f40079c = str;
    }

    public static String g(CharSequence charSequence, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (Object obj : objArr) {
            if (z9) {
                z9 = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public long a() {
        return this.f40082f;
    }

    public byte[] c() throws UnsupportedEncodingException {
        String string;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putLong(this.f40082f);
        byteBufferAllocate.putInt(this.f40083g);
        byteBufferAllocate.putInt(this.f40081e.getInt());
        byteBufferAllocate.putInt(this.f40080d);
        String str = this.f40079c;
        if (str == null || str.length() == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            h(this.f40079c, byteBufferAllocate);
        }
        Object[] objArr = this.f40078a;
        if (objArr == null || objArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(objArr.length);
            for (Object obj : this.f40078a) {
                if (obj instanceof String) {
                    byteBufferAllocate.putChar('s');
                    string = (String) obj;
                } else {
                    if (obj instanceof Integer) {
                        byteBufferAllocate.putChar('i');
                        byteBufferAllocate.putInt(((Integer) obj).intValue());
                    } else if (obj instanceof Float) {
                        byteBufferAllocate.putChar('f');
                        byteBufferAllocate.putFloat(((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        byteBufferAllocate.putChar('d');
                        byteBufferAllocate.putDouble(((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        byteBufferAllocate.putChar('l');
                        byteBufferAllocate.putLong(((Long) obj).longValue());
                    } else if (obj == null) {
                        byteBufferAllocate.putChar('0');
                    } else {
                        G.m("Unknown object for LogItem marschaling " + obj);
                        byteBufferAllocate.putChar('s');
                        string = obj.toString();
                    }
                }
                h(string, byteBufferAllocate);
            }
        }
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.rewind();
        return Arrays.copyOf(byteBufferAllocate.array(), iPosition);
    }

    public final String d(Context context) {
        String str;
        X509Certificate x509Certificate;
        byte[] bArrDigest;
        int i9;
        context.getPackageManager();
        String string = "error getting package signature";
        try {
            x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(x509Certificate.getEncoded());
            bArrDigest = messageDigest.digest();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            str = "error getting version";
        }
        if (Arrays.equals(bArrDigest, G.f39979m)) {
            i9 = a7.j.f13088O4;
        } else {
            if (!Arrays.equals(bArrDigest, G.f39980n)) {
                string = Arrays.equals(bArrDigest, G.f39981o) ? "amazon version" : Arrays.equals(bArrDigest, G.f39982p) ? "F-Droid built and signed version" : context.getString(a7.j.f13178Y, x509Certificate.getSubjectX500Principal().getName());
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                Object[] objArr = this.f40078a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[objArrCopyOf.length - 1] = string;
                objArrCopyOf[objArrCopyOf.length - 2] = str;
                return context.getString(a7.j.f13027I3, objArrCopyOf);
            }
            i9 = a7.j.f12994F0;
        }
        string = context.getString(i9);
        str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Object[] objArr2 = this.f40078a;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
        objArrCopyOf2[objArrCopyOf2.length - 1] = string;
        objArrCopyOf2[objArrCopyOf2.length - 2] = str;
        return context.getString(a7.j.f13027I3, objArrCopyOf2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e(Context context) {
        try {
            String str = this.f40079c;
            if (str != null) {
                return str;
            }
            if (context != null) {
                int i9 = this.f40080d;
                if (i9 == a7.j.f13027I3) {
                    return d(context);
                }
                Object[] objArr = this.f40078a;
                return objArr == null ? context.getString(i9) : context.getString(i9, objArr);
            }
            String str2 = String.format(Locale.ENGLISH, "Log (no context) resid %d", Integer.valueOf(this.f40080d));
            if (this.f40078a == null) {
                return str2;
            }
            return str2 + g("|", this.f40078a);
        } catch (FormatFlagsConversionMismatchException e9) {
            if (context == null) {
                throw e9;
            }
            throw new FormatFlagsConversionMismatchException(e9.getLocalizedMessage() + e(null), e9.getConversion());
        } catch (UnknownFormatConversionException e10) {
            if (context == null) {
                throw e10;
            }
            throw new UnknownFormatConversionException(e10.getLocalizedMessage() + e(null));
        }
    }

    public boolean equals(Object obj) {
        String str;
        G.c cVar;
        if (!(obj instanceof k)) {
            return obj.equals(this);
        }
        k kVar = (k) obj;
        return Arrays.equals(this.f40078a, kVar.f40078a) && (((str = kVar.f40079c) == null && this.f40079c == str) || this.f40079c.equals(str)) && this.f40080d == kVar.f40080d && ((((cVar = this.f40081e) == null && kVar.f40081e == cVar) || kVar.f40081e.equals(cVar)) && this.f40083g == kVar.f40083g && this.f40082f == kVar.f40082f);
    }

    public int f() {
        int i9 = this.f40083g;
        return i9 == -1 ? this.f40081e.getInt() : i9;
    }

    public final void h(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        byteBuffer.putInt(bytes.length);
        byteBuffer.put(bytes);
    }

    public String toString() {
        return e(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeArray(this.f40078a);
        parcel.writeString(this.f40079c);
        parcel.writeInt(this.f40080d);
        parcel.writeInt(this.f40081e.getInt());
        parcel.writeInt(this.f40083g);
        parcel.writeLong(this.f40082f);
    }
}
