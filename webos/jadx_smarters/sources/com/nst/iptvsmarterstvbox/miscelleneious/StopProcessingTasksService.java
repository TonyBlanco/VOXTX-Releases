package com.nst.iptvsmarterstvbox.miscelleneious;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.util.ArrayList;
import m7.AbstractC2237a;
import p0.C2386a;

/* JADX INFO: loaded from: classes.dex */
public class StopProcessingTasksService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        MyApplication.E("StopProcessingTasksService Service Destroyed ");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        MyApplication.E("StopProcessingTasksService Service Started ");
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        MyApplication.E("onTaskRemoved AppConst.PIP_MODE: " + AbstractC2237a.f44531p1);
        if (AbstractC2237a.f44531p1) {
            AbstractC2237a.f44531p1 = false;
            return;
        }
        try {
            if (AbstractC2237a.f44475V0.booleanValue() && MyApplication.p().f28663c != null) {
                C2386a.b(this).e(MyApplication.p().f28663c);
            }
            MyApplication.p().I();
            if (Build.VERSION.SDK_INT >= 33) {
                SharedPreferences.Editor editorEdit = getSharedPreferences("downloadStatus", 0).edit();
                editorEdit.putString("downloadStatus", "stopped");
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
                if (notificationManager != null) {
                    notificationManager.cancelAll();
                }
            }
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(getApplicationContext());
            if (AbstractC2237a.f44449I0) {
                String strValueOf = "0";
                ArrayList<EPGSourcesModel> activeEPGSource = liveStreamDBHandler.getActiveEPGSource();
                if (activeEPGSource != null && activeEPGSource.size() > 0) {
                    strValueOf = String.valueOf(activeEPGSource.get(0).getIdAuto());
                }
                try {
                    if (liveStreamDBHandler.getEPGCountWithSourceRef(strValueOf) != 0) {
                        liveStreamDBHandler.updateImportStatus("epg", "1", strValueOf);
                    } else {
                        liveStreamDBHandler.updateImportStatus("epg", "2", strValueOf);
                    }
                } catch (Exception unused) {
                }
            }
            ArrayList<ImportStatusModel> arrayList = liveStreamDBHandler.getdateDBStatus();
            if (arrayList != null && arrayList.size() > 0) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (arrayList.get(i9).getType() == null || !arrayList.get(i9).getType().equals("live")) {
                        if (arrayList.get(i9).getType() == null || !arrayList.get(i9).getType().equals("movies")) {
                            if (arrayList.get(i9).getType() != null && arrayList.get(i9).getType().equals("series") && arrayList.get(i9).getStatus().equals("3")) {
                                liveStreamDBHandler.updateImportStatus("series", "2");
                            }
                        } else if (arrayList.get(i9).getStatus().equals("3")) {
                            liveStreamDBHandler.updateImportStatus("movies", "2");
                        }
                    } else if (arrayList.get(i9).getStatus().equals("3")) {
                        try {
                            liveStreamDBHandler.updateImportStatus("live", "2");
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
        stopSelf();
    }
}
