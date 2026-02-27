package p0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2386a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f46207f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C2386a f46208g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46210b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46211c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46212d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f46213e;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    public class HandlerC0410a extends Handler {
        public HandlerC0410a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C2386a.this.a();
            }
        }
    }

    /* JADX INFO: renamed from: p0.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f46215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f46216b;

        public b(Intent intent, ArrayList arrayList) {
            this.f46215a = intent;
            this.f46216b = arrayList;
        }
    }

    /* JADX INFO: renamed from: p0.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f46217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f46218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46220d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f46217a = intentFilter;
            this.f46218b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f46218b);
            sb.append(" filter=");
            sb.append(this.f46217a);
            if (this.f46220d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C2386a(Context context) {
        this.f46209a = context;
        this.f46213e = new HandlerC0410a(context.getMainLooper());
    }

    public static C2386a b(Context context) {
        C2386a c2386a;
        synchronized (f46207f) {
            try {
                if (f46208g == null) {
                    f46208g = new C2386a(context.getApplicationContext());
                }
                c2386a = f46208g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2386a;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f46210b) {
                try {
                    size = this.f46212d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f46212d.toArray(bVarArr);
                    this.f46212d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i9 = 0; i9 < size; i9++) {
                b bVar = bVarArr[i9];
                int size2 = bVar.f46216b.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    c cVar = (c) bVar.f46216b.get(i10);
                    if (!cVar.f46220d) {
                        cVar.f46218b.onReceive(this.f46209a, bVar.f46215a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f46210b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f46210b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f46210b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i9 = 0; i9 < intentFilter.countActions(); i9++) {
                    String action = intentFilter.getAction(i9);
                    ArrayList arrayList2 = (ArrayList) this.f46211c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f46211c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        int i9;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f46210b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f46209a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z9 = (intent.getFlags() & 8) != 0;
                if (z9) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f46211c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z9) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i10 = 0;
                    while (i10 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i10);
                        if (z9) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f46217a);
                        }
                        if (cVar.f46219c) {
                            if (z9) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i9 = i10;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i9 = i10;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            int iMatch = cVar.f46217a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z9) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f46219c = true;
                                i10 = i9 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z9) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i10 = i9 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            ((c) arrayList5.get(i11)).f46219c = false;
                        }
                        this.f46212d.add(new b(intent, arrayList5));
                        if (!this.f46213e.hasMessages(1)) {
                            this.f46213e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f46210b) {
            try {
                ArrayList arrayList = (ArrayList) this.f46210b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f46220d = true;
                    for (int i9 = 0; i9 < cVar.f46217a.countActions(); i9++) {
                        String action = cVar.f46217a.getAction(i9);
                        ArrayList arrayList2 = (ArrayList) this.f46211c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f46218b == broadcastReceiver) {
                                    cVar2.f46220d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f46211c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
