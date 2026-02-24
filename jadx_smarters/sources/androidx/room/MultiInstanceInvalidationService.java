package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17108a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17109c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RemoteCallbackList f17110d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b.a f17111e = new b();

    public class a extends RemoteCallbackList {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            HashMap map = MultiInstanceInvalidationService.this.f17109c;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    public class b extends b.a {
        public b() {
        }

        @Override // androidx.room.b
        public void V(int i9, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f17110d) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f17109c.get(Integer.valueOf(i9));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f17110d.beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f17110d.getBroadcastCookie(i10);
                            int iIntValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f17109c.get(num);
                            if (i9 != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.a) MultiInstanceInvalidationService.this.f17110d.getBroadcastItem(i10)).o(strArr);
                                } catch (RemoteException e9) {
                                    Log.w("ROOM", "Error invoking a remote callback", e9);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f17110d.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.b
        public void W0(androidx.room.a aVar, int i9) {
            synchronized (MultiInstanceInvalidationService.this.f17110d) {
                MultiInstanceInvalidationService.this.f17110d.unregister(aVar);
                MultiInstanceInvalidationService.this.f17109c.remove(Integer.valueOf(i9));
            }
        }

        @Override // androidx.room.b
        public int n0(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f17110d) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i9 = multiInstanceInvalidationService.f17108a + 1;
                    multiInstanceInvalidationService.f17108a = i9;
                    if (multiInstanceInvalidationService.f17110d.register(aVar, Integer.valueOf(i9))) {
                        MultiInstanceInvalidationService.this.f17109c.put(Integer.valueOf(i9), str);
                        return i9;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.f17108a--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f17111e;
    }
}
