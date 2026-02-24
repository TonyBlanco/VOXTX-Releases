package com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.castserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import j7.AbstractC2103a;
import j7.b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CastServerService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2103a f28677a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("HTTPSERVICE", "Destroying httpService");
        this.f28677a.p();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        Log.i("HTTPSERVICE", "Creating and starting httpService");
        super.onCreate();
        b bVar = new b(intent.getStringExtra("127.0.0.1"), 8080, new File(intent.getStringExtra(InstructionFileId.DOT)), false);
        this.f28677a = bVar;
        try {
            bVar.o();
            return 2;
        } catch (IOException e9) {
            Log.i("HTTPSERVICE", "IOException: " + e9.getMessage());
            return 2;
        }
    }
}
