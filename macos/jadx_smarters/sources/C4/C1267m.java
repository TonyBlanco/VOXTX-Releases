package c4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.AbstractC1684a;
import d4.C1685b;
import d4.k0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.simpleframework.xml.strategy.Name;
import s5.AbstractC2719C;
import s5.c0;

/* JADX INFO: renamed from: c4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1267m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f18269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f18270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f18271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f18272f;

    /* JADX INFO: renamed from: c4.m$a */
    public static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f18273e = {Name.MARK, "key", "metadata"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T2.b f18274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f18275b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18277d;

        public a(T2.b bVar) {
            this.f18274a = bVar;
        }

        public static void j(T2.b bVar, String str) throws T2.a {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    T2.e.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e9) {
                throw new T2.a(e9);
            }
        }

        public static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // c4.C1267m.c
        public boolean a() throws T2.a {
            try {
                return T2.e.b(this.f18274a.getReadableDatabase(), 1, (String) AbstractC1684a.e(this.f18276c)) != -1;
            } catch (SQLException e9) {
                throw new T2.a(e9);
            }
        }

        @Override // c4.C1267m.c
        public void b(HashMap map) throws T2.a {
            if (this.f18275b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f18274a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i9 = 0; i9 < this.f18275b.size(); i9++) {
                    try {
                        C1266l c1266l = (C1266l) this.f18275b.valueAt(i9);
                        if (c1266l == null) {
                            k(writableDatabase, this.f18275b.keyAt(i9));
                        } else {
                            i(writableDatabase, c1266l);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f18275b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e9) {
                throw new T2.a(e9);
            }
        }

        @Override // c4.C1267m.c
        public void c(long j9) {
            String hexString = Long.toHexString(j9);
            this.f18276c = hexString;
            this.f18277d = n(hexString);
        }

        @Override // c4.C1267m.c
        public void d(HashMap map) throws T2.a {
            try {
                SQLiteDatabase writableDatabase = this.f18274a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, (C1266l) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f18275b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e9) {
                throw new T2.a(e9);
            }
        }

        @Override // c4.C1267m.c
        public void e(C1266l c1266l) {
            this.f18275b.put(c1266l.f18260a, c1266l);
        }

        @Override // c4.C1267m.c
        public void f(C1266l c1266l, boolean z9) {
            if (z9) {
                this.f18275b.delete(c1266l.f18260a);
            } else {
                this.f18275b.put(c1266l.f18260a, null);
            }
        }

        @Override // c4.C1267m.c
        public void g(HashMap map, SparseArray sparseArray) throws T2.a {
            AbstractC1684a.g(this.f18275b.size() == 0);
            try {
                if (T2.e.b(this.f18274a.getReadableDatabase(), 1, (String) AbstractC1684a.e(this.f18276c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f18274a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        C1266l c1266l = new C1266l(cursorM.getInt(0), (String) AbstractC1684a.e(cursorM.getString(1)), C1267m.q(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(c1266l.f18261b, c1266l);
                        sparseArray.put(c1266l.f18260a, c1266l.f18261b);
                    } finally {
                    }
                }
                cursorM.close();
            } catch (SQLiteException e9) {
                map.clear();
                sparseArray.clear();
                throw new T2.a(e9);
            }
        }

        @Override // c4.C1267m.c
        public void h() throws T2.a {
            j(this.f18274a, (String) AbstractC1684a.e(this.f18276c));
        }

        public final void i(SQLiteDatabase sQLiteDatabase, C1266l c1266l) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1267m.t(c1266l.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Name.MARK, Integer.valueOf(c1266l.f18260a));
            contentValues.put("key", c1266l.f18261b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) AbstractC1684a.e(this.f18277d), null, contentValues);
        }

        public final void k(SQLiteDatabase sQLiteDatabase, int i9) {
            sQLiteDatabase.delete((String) AbstractC1684a.e(this.f18277d), "id = ?", new String[]{Integer.toString(i9)});
        }

        public final Cursor m() {
            return this.f18274a.getReadableDatabase().query((String) AbstractC1684a.e(this.f18277d), f18273e, null, null, null, null, null);
        }

        public final void o(SQLiteDatabase sQLiteDatabase) throws T2.a {
            T2.e.d(sQLiteDatabase, 1, (String) AbstractC1684a.e(this.f18276c), 1);
            l(sQLiteDatabase, (String) AbstractC1684a.e(this.f18277d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f18277d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* JADX INFO: renamed from: c4.m$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f18278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f18279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SecretKeySpec f18280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SecureRandom f18281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1685b f18282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C1273s f18284g;

        public b(File file, byte[] bArr, boolean z9) {
            Cipher cipherI;
            SecretKeySpec secretKeySpec;
            AbstractC1684a.g((bArr == null && z9) ? false : true);
            if (bArr != null) {
                AbstractC1684a.a(bArr.length == 16);
                try {
                    cipherI = C1267m.i();
                    secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e9) {
                    throw new IllegalStateException(e9);
                }
            } else {
                AbstractC1684a.a(!z9);
                cipherI = null;
                secretKeySpec = null;
            }
            this.f18278a = z9;
            this.f18279b = cipherI;
            this.f18280c = secretKeySpec;
            this.f18281d = z9 ? new SecureRandom() : null;
            this.f18282e = new C1685b(file);
        }

        @Override // c4.C1267m.c
        public boolean a() {
            return this.f18282e.c();
        }

        @Override // c4.C1267m.c
        public void b(HashMap map) throws Throwable {
            if (this.f18283f) {
                d(map);
            }
        }

        @Override // c4.C1267m.c
        public void c(long j9) {
        }

        @Override // c4.C1267m.c
        public void d(HashMap map) throws Throwable {
            m(map);
            this.f18283f = false;
        }

        @Override // c4.C1267m.c
        public void e(C1266l c1266l) {
            this.f18283f = true;
        }

        @Override // c4.C1267m.c
        public void f(C1266l c1266l, boolean z9) {
            this.f18283f = true;
        }

        @Override // c4.C1267m.c
        public void g(HashMap map, SparseArray sparseArray) {
            AbstractC1684a.g(!this.f18283f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f18282e.a();
        }

        @Override // c4.C1267m.c
        public void h() {
            this.f18282e.a();
        }

        public final int i(C1266l c1266l, int i9) {
            int iHashCode = (c1266l.f18260a * 31) + c1266l.f18261b.hashCode();
            if (i9 >= 2) {
                return (iHashCode * 31) + c1266l.d().hashCode();
            }
            long jA = AbstractC1268n.a(c1266l.d());
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }

        public final C1266l j(int i9, DataInputStream dataInputStream) throws IOException {
            C1271q c1271qQ;
            int i10 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i9 < 2) {
                long j9 = dataInputStream.readLong();
                C1270p c1270p = new C1270p();
                C1270p.g(c1270p, j9);
                c1271qQ = C1271q.f18287c.e(c1270p);
            } else {
                c1271qQ = C1267m.q(dataInputStream);
            }
            return new C1266l(i10, utf, c1271qQ);
        }

        public final boolean k(HashMap map, SparseArray sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f18282e.c()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f18282e.d());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i9 = dataInputStream.readInt();
                if (i9 >= 0 && i9 <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f18279b == null) {
                            k0.o(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.f18279b.init(2, (Key) k0.j(this.f18280c), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f18279b));
                        } catch (InvalidAlgorithmParameterException e9) {
                            e = e9;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f18278a) {
                        this.f18283f = true;
                    }
                    int i10 = dataInputStream.readInt();
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        C1266l c1266lJ = j(i9, dataInputStream);
                        map.put(c1266lJ.f18261b, c1266lJ);
                        sparseArray.put(c1266lJ.f18260a, c1266lJ.f18261b);
                        i11 += i(c1266lJ, i9);
                    }
                    int i13 = dataInputStream.readInt();
                    boolean z9 = dataInputStream.read() == -1;
                    if (i13 == i11 && z9) {
                        k0.o(dataInputStream);
                        return true;
                    }
                    k0.o(dataInputStream);
                    return false;
                }
                k0.o(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    k0.o(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    k0.o(dataInputStream2);
                }
                throw th;
            }
        }

        public final void l(C1266l c1266l, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(c1266l.f18260a);
            dataOutputStream.writeUTF(c1266l.f18261b);
            C1267m.t(c1266l.d(), dataOutputStream);
        }

        public final void m(HashMap map) throws Throwable {
            C1273s c1273s;
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamF = this.f18282e.f();
                C1273s c1273s2 = this.f18284g;
                if (c1273s2 == null) {
                    this.f18284g = new C1273s(outputStreamF);
                } else {
                    c1273s2.a(outputStreamF);
                }
                c1273s = this.f18284g;
                dataOutputStream = new DataOutputStream(c1273s);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                int i9 = 0;
                dataOutputStream.writeInt(this.f18278a ? 1 : 0);
                if (this.f18278a) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) k0.j(this.f18281d)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) k0.j(this.f18279b)).init(1, (Key) k0.j(this.f18280c), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(c1273s, this.f18279b));
                    } catch (InvalidAlgorithmParameterException e9) {
                        e = e9;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(map.size());
                for (C1266l c1266l : map.values()) {
                    l(c1266l, dataOutputStream);
                    i9 += i(c1266l, 2);
                }
                dataOutputStream.writeInt(i9);
                this.f18282e.b(dataOutputStream);
                k0.o(null);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                k0.o(dataOutputStream2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c4.m$c */
    public interface c {
        boolean a();

        void b(HashMap map);

        void c(long j9);

        void d(HashMap map);

        void e(C1266l c1266l);

        void f(C1266l c1266l, boolean z9);

        void g(HashMap map, SparseArray sparseArray);

        void h();
    }

    public C1267m(T2.b bVar, File file, byte[] bArr, boolean z9, boolean z10) {
        AbstractC1684a.g((bVar == null && file == null) ? false : true);
        this.f18267a = new HashMap();
        this.f18268b = new SparseArray();
        this.f18269c = new SparseBooleanArray();
        this.f18270d = new SparseBooleanArray();
        a aVar = bVar != null ? new a(bVar) : null;
        b bVar2 = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z9) : null;
        if (aVar == null || (bVar2 != null && z10)) {
            this.f18271e = (c) k0.j(bVar2);
            this.f18272f = aVar;
        } else {
            this.f18271e = aVar;
            this.f18272f = bVar2;
        }
    }

    public static Cipher i() {
        if (k0.f39777a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static int l(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i9 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i9 < size && i9 == sparseArray.keyAt(i9)) {
            i9++;
        }
        return i9;
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static C1271q q(DataInputStream dataInputStream) throws IOException {
        int i9 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i9; i10++) {
            String utf = dataInputStream.readUTF();
            int i11 = dataInputStream.readInt();
            if (i11 < 0) {
                throw new IOException("Invalid value size: " + i11);
            }
            int iMin = Math.min(i11, 10485760);
            byte[] bArrCopyOf = k0.f39782f;
            int i12 = 0;
            while (i12 != i11) {
                int i13 = i12 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                dataInputStream.readFully(bArrCopyOf, i12, iMin);
                iMin = Math.min(i11 - i13, 10485760);
                i12 = i13;
            }
            map.put(utf, bArrCopyOf);
        }
        return new C1271q(map);
    }

    public static void t(C1271q c1271q, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setF = c1271q.f();
        dataOutputStream.writeInt(setF.size());
        for (Map.Entry entry : setF) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final C1266l d(String str) {
        int iL = l(this.f18268b);
        C1266l c1266l = new C1266l(iL, str);
        this.f18267a.put(str, c1266l);
        this.f18268b.put(iL, str);
        this.f18270d.put(iL, true);
        this.f18271e.e(c1266l);
        return c1266l;
    }

    public void e(String str, C1270p c1270p) {
        C1266l c1266lM = m(str);
        if (c1266lM.b(c1270p)) {
            this.f18271e.e(c1266lM);
        }
    }

    public int f(String str) {
        return m(str).f18260a;
    }

    public C1266l g(String str) {
        return (C1266l) this.f18267a.get(str);
    }

    public Collection h() {
        return Collections.unmodifiableCollection(this.f18267a.values());
    }

    public InterfaceC1269o j(String str) {
        C1266l c1266lG = g(str);
        return c1266lG != null ? c1266lG.d() : C1271q.f18287c;
    }

    public String k(int i9) {
        return (String) this.f18268b.get(i9);
    }

    public C1266l m(String str) {
        C1266l c1266l = (C1266l) this.f18267a.get(str);
        return c1266l == null ? d(str) : c1266l;
    }

    public void n(long j9) {
        c cVar;
        this.f18271e.c(j9);
        c cVar2 = this.f18272f;
        if (cVar2 != null) {
            cVar2.c(j9);
        }
        if (this.f18271e.a() || (cVar = this.f18272f) == null || !cVar.a()) {
            this.f18271e.g(this.f18267a, this.f18268b);
        } else {
            this.f18272f.g(this.f18267a, this.f18268b);
            this.f18271e.d(this.f18267a);
        }
        c cVar3 = this.f18272f;
        if (cVar3 != null) {
            cVar3.h();
            this.f18272f = null;
        }
    }

    public void p(String str) {
        C1266l c1266l = (C1266l) this.f18267a.get(str);
        if (c1266l != null && c1266l.g() && c1266l.i()) {
            this.f18267a.remove(str);
            int i9 = c1266l.f18260a;
            boolean z9 = this.f18270d.get(i9);
            this.f18271e.f(c1266l, z9);
            SparseArray sparseArray = this.f18268b;
            if (z9) {
                sparseArray.remove(i9);
                this.f18270d.delete(i9);
            } else {
                sparseArray.put(i9, null);
                this.f18269c.put(i9, true);
            }
        }
    }

    public void r() {
        c0 it = AbstractC2719C.r(this.f18267a.keySet()).iterator();
        while (it.hasNext()) {
            p((String) it.next());
        }
    }

    public void s() {
        this.f18271e.b(this.f18267a);
        int size = this.f18269c.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f18268b.remove(this.f18269c.keyAt(i9));
        }
        this.f18269c.clear();
        this.f18270d.clear();
    }
}
