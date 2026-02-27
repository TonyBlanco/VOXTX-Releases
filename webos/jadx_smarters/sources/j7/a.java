package J7;

import L7.b;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3385a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f3386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f3387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f3391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3393j;

    public a(Context context) {
        super(context, "vpndatabase.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.f3387d = null;
        this.f3388e = "CREATE TABLE IF NOT EXISTS vpntable(id INTEGER PRIMARY KEY,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,user_id TEXT,profilename TEXT,type TEXT)";
        this.f3389f = "CREATE TABLE IF NOT EXISTS vpntablelogin(id TEXT,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,profilename TEXT,type TEXT)";
        this.f3390g = "ALTER TABLE vpntable ADD COLUMN filename1 TEXT;";
        this.f3391h = "ALTER TABLE vpntablelogin ADD COLUMN filename1 TEXT;";
        this.f3392i = "ALTER TABLE vpnsmarterstable ADD COLUMN flag TEXT;";
        this.f3393j = "CREATE TABLE IF NOT EXISTS vpnsmarterstable(id INTEGER PRIMARY KEY,file_name TEXT,filepath TEXT,vpn_username TEXT,vpn_password TEXT,user_id TEXT,auth_user_pass TEXT,remember TEXT,server_name TEXT,server_type TEXT,flag TEXT)";
        this.f3385a = context;
    }

    public void a(ArrayList arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    contentValues.put("file_name", ((L7.a) arrayList.get(i9)).a());
                    contentValues.put("server_name", ((L7.a) arrayList.get(i9)).e());
                    contentValues.put("filepath", ((L7.a) arrayList.get(i9)).d());
                    contentValues.put("vpn_username", ((L7.a) arrayList.get(i9)).i());
                    contentValues.put("vpn_password", ((L7.a) arrayList.get(i9)).h());
                    contentValues.put("auth_user_pass", ((L7.a) arrayList.get(i9)).j());
                    contentValues.put("remember", ((L7.a) arrayList.get(i9)).k());
                    contentValues.put("user_id", ((L7.a) arrayList.get(i9)).g());
                    contentValues.put("flag", ((L7.a) arrayList.get(i9)).b());
                    contentValues.put("server_type", ((L7.a) arrayList.get(i9)).f());
                    writableDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    contentValues.put("file_name", ((L7.a) arrayList.get(i9)).a());
                    contentValues.put("server_name", ((L7.a) arrayList.get(i9)).e());
                    contentValues.put("filepath", ((L7.a) arrayList.get(i9)).d());
                    contentValues.put("vpn_username", ((L7.a) arrayList.get(i9)).i());
                    contentValues.put("vpn_password", ((L7.a) arrayList.get(i9)).h());
                    contentValues.put("auth_user_pass", ((L7.a) arrayList.get(i9)).j());
                    contentValues.put("remember", ((L7.a) arrayList.get(i9)).k());
                    contentValues.put("user_id", ((L7.a) arrayList.get(i9)).g());
                    sQLiteDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean d(String str, String str2, String str3) {
        String str4 = "SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f3386c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str4, null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return false;
        }
    }

    public boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return false;
        }
    }

    public void g() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f3386c = writableDatabase;
            writableDatabase.delete("vpnsmarterstable", "server_type='sbp'", null);
            this.f3386c.close();
        } catch (Exception unused) {
        }
    }

    public void h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    h(file2);
                }
            }
            file.delete();
        }
    }

    public void i(int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f3386c = writableDatabase;
            writableDatabase.delete("vpnsmarterstable", "id='" + i9 + "'", null);
            this.f3386c.close();
        } catch (Exception unused) {
        }
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f3386c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM vpnsmarterstable", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    L7.a aVar = new L7.a();
                    aVar.o(cursorRawQuery.getInt(0));
                    aVar.m(cursorRawQuery.getString(1));
                    aVar.q(cursorRawQuery.getString(2));
                    aVar.v(cursorRawQuery.getString(3));
                    aVar.u(cursorRawQuery.getString(4));
                    aVar.t(cursorRawQuery.getString(5));
                    aVar.l(cursorRawQuery.getString(6));
                    aVar.p(cursorRawQuery.getString(7));
                    aVar.r(cursorRawQuery.getString(8));
                    aVar.s(cursorRawQuery.getString(9));
                    aVar.n(cursorRawQuery.getString(10));
                    arrayList.add(aVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntablelogin", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    b bVar = new b();
                    bVar.g(cursorRawQuery.getInt(0));
                    bVar.d(cursorRawQuery.getString(1));
                    bVar.e(cursorRawQuery.getString(2));
                    bVar.f(cursorRawQuery.getString(3));
                    bVar.k(cursorRawQuery.getString(4));
                    bVar.h(cursorRawQuery.getString(5));
                    bVar.i(cursorRawQuery.getColumnName(6));
                    bVar.j("login");
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public final ArrayList l(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntable", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    b bVar = new b();
                    bVar.g(cursorRawQuery.getInt(0));
                    bVar.d(cursorRawQuery.getString(1));
                    bVar.e(cursorRawQuery.getString(2));
                    bVar.f(cursorRawQuery.getString(3));
                    bVar.k(cursorRawQuery.getString(4));
                    bVar.h(cursorRawQuery.getString(5));
                    bVar.i(cursorRawQuery.getColumnName(6));
                    bVar.j("settings");
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public final void m(SQLiteDatabase sQLiteDatabase) {
        File[] fileArrListFiles;
        int i9;
        int i10;
        File[] fileArr;
        try {
            String strValueOf = String.valueOf(new File(this.f3385a.getFilesDir() + "/VPNIPTVSmarters"));
            this.f3387d = new ArrayList();
            if (strValueOf.isEmpty()) {
                return;
            }
            File file = new File(strValueOf);
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                        int length = fileArrListFiles.length;
                        int i11 = 0;
                        while (i11 < length) {
                            File file3 = fileArrListFiles[i11];
                            if (file3 == null || !file3.getName().endsWith(".ovpn")) {
                                i9 = i11;
                                i10 = length;
                                fileArr = fileArrListFiles;
                                StringBuilder sb = new StringBuilder();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file3));
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                        sb.append('\n');
                                    }
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(MyApplication.m().getFilesDir() + "/VPNIPTVSmarters", file3.getName()));
                                    fileOutputStream.write(sb.toString().getBytes());
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            } else {
                                String strReplaceAll = file3.getName().replaceAll(".ovpn", "");
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file3));
                                    while (true) {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            break;
                                        }
                                        sb2.append(line2);
                                        sb2.append('\n');
                                    }
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    i9 = i11;
                                    try {
                                        sb3.append(MyApplication.m().getFilesDir());
                                        sb3.append("/");
                                        sb3.append("VPNIPTVSmarters");
                                        File file4 = new File(sb3.toString(), file3.getName());
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
                                        fileOutputStream2.write(sb2.toString().getBytes());
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                        if (e(sQLiteDatabase, file3.getName(), strReplaceAll, String.valueOf(file4))) {
                                            i10 = length;
                                            fileArr = fileArrListFiles;
                                        } else {
                                            i10 = length;
                                            fileArr = fileArrListFiles;
                                            try {
                                                n(sQLiteDatabase, file3.getName(), strReplaceAll, sb2.toString(), file4);
                                            } catch (Exception e9) {
                                                e = e9;
                                                e.printStackTrace();
                                            }
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        i10 = length;
                                        fileArr = fileArrListFiles;
                                        e.printStackTrace();
                                        i11 = i9 + 1;
                                        length = i10;
                                        fileArrListFiles = fileArr;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i9 = i11;
                                }
                            }
                            i11 = i9 + 1;
                            length = i10;
                            fileArrListFiles = fileArr;
                        }
                    }
                }
                if (this.f3387d.size() > 0) {
                    c(sQLiteDatabase, this.f3387d);
                }
                File file5 = (!new C2858a(this.f3385a).A().equals(AbstractC2237a.f44453K0) && Build.VERSION.SDK_INT >= 23) ? new File(this.f3385a.getFilesDir() + "/VPNIPTVSmarters") : new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters");
                try {
                    h(file5);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        } catch (Exception unused4) {
        }
    }

    public final void n(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, File file) {
        String strB;
        String strC;
        L7.a aVar = new L7.a();
        if (str3.contains("auth-user-pass")) {
            aVar.l("1");
        } else {
            aVar.l("0");
        }
        aVar.p("0");
        ArrayList arrayListK = k(sQLiteDatabase);
        ArrayList arrayListL = l(sQLiteDatabase);
        int i9 = 0;
        if (arrayListK == null || arrayListK.size() <= 0) {
            strB = "";
            strC = strB;
        } else {
            for (int i10 = 0; i10 < arrayListK.size(); i10++) {
                if (((b) arrayListK.get(i10)).a().equals(str)) {
                    strC = ((b) arrayListK.get(i10)).c();
                    strB = ((b) arrayListK.get(i10)).b();
                    break;
                }
            }
            strB = "";
            strC = strB;
        }
        if (strC.equals("") && strB.equals("") && arrayListL != null && arrayListL.size() > 0) {
            while (true) {
                if (i9 >= arrayListL.size()) {
                    break;
                }
                if (((b) arrayListL.get(i9)).a().equals(str)) {
                    strC = ((b) arrayListL.get(i9)).c();
                    strB = ((b) arrayListL.get(i9)).b();
                    break;
                }
                i9++;
            }
        }
        aVar.v(strC);
        aVar.u(strB);
        aVar.r(str2);
        aVar.m(str);
        aVar.t("0");
        aVar.q(String.valueOf(file));
        this.f3387d.add(aVar);
    }

    public int o(L7.a aVar) {
        int iC = aVar.c();
        int iUpdate = 0;
        try {
            this.f3386c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("vpn_username", aVar.i());
            contentValues.put("vpn_password", aVar.h());
            iUpdate = this.f3386c.update("vpnsmarterstable", contentValues, "id='" + iC + "'", null);
            this.f3386c.close();
            return iUpdate;
        } catch (Exception unused) {
            return iUpdate;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f3388e);
        sQLiteDatabase.execSQL(this.f3389f);
        sQLiteDatabase.execSQL(this.f3393j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (i9 < 4) {
            sQLiteDatabase.execSQL(this.f3390g);
            sQLiteDatabase.execSQL(this.f3391h);
        }
        if (i9 < 5) {
            sQLiteDatabase.execSQL(this.f3393j);
            m(sQLiteDatabase);
        }
        if (i9 < 6) {
            sQLiteDatabase.execSQL(this.f3392i);
        }
    }
}
