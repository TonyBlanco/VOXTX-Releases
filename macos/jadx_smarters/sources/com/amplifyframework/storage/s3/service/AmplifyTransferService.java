package com.amplifyframework.storage.s3.service;

import D.AbstractC0529l;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdaterAccessor;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.s3.R;
import com.amplifyframework.storage.s3.service.AmplifyTransferService;
import k8.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AmplifyTransferService extends Service {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int NOTIFICATION_ID = 9382;
    private static final long SHUTDOWN_CHECK_INTERVAL_MILLIS = 8000;
    private static AmplifyTransferService boundService;
    private static ServiceConnection boundServiceConnection;
    private static Notification notification;
    private final LocalBinder binder;
    private boolean isReceiverRegistered;
    private final Logger log;
    private TransferNetworkLossHandler transferNetworkLossHandler;
    private Handler unbindCheckHandler;
    private Runnable unbindCheckRunnable;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void createChannel(Context context) {
            Object systemService = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            c.a();
            ((NotificationManager) systemService).createNotificationChannel(b.a(context.getString(R.string.amplify_storage_notification_channel_id), context.getString(R.string.amplify_storage_notification_channel_name), 2));
        }

        private final Notification createDefaultNotification(Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                createChannel(context);
            }
            return new AbstractC0529l.e(context, context.getString(R.string.amplify_storage_notification_channel_id)).D(R.drawable.amplify_storage_transfer_notification_icon).n(context.getString(R.string.amplify_storage_notification_title)).A(-1).c();
        }

        public final void bind(@NotNull final Context context) {
            l.e(context, "context");
            if (AmplifyTransferService.boundServiceConnection == null) {
                AmplifyTransferService.boundServiceConnection = new ServiceConnection() { // from class: com.amplifyframework.storage.s3.service.AmplifyTransferService$Companion$bind$1
                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(@NotNull ComponentName name, @Nullable IBinder iBinder) {
                        l.e(name, "name");
                        if (iBinder == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.amplifyframework.storage.s3.service.AmplifyTransferService.LocalBinder");
                        }
                        AmplifyTransferService.boundService = ((AmplifyTransferService.LocalBinder) iBinder).getService();
                        AmplifyTransferService.Companion.startForeground(context);
                        AmplifyTransferService amplifyTransferService = AmplifyTransferService.boundService;
                        if (amplifyTransferService != null) {
                            amplifyTransferService.startUnbindCheck();
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(@Nullable ComponentName componentName) {
                        AmplifyTransferService.Companion.stopForegroundAndUnbind(context);
                        AmplifyTransferService.boundService = null;
                    }
                };
            }
            ServiceConnection serviceConnection = AmplifyTransferService.boundServiceConnection;
            if (serviceConnection != null) {
                context.bindService(new Intent(context, (Class<?>) AmplifyTransferService.class), serviceConnection, 1);
            }
            AmplifyTransferService amplifyTransferService = AmplifyTransferService.boundService;
            if (amplifyTransferService != null) {
                amplifyTransferService.startUnbindCheck();
            }
        }

        public final boolean isNotificationShowing() {
            return AmplifyTransferService.notification != null;
        }

        public final void startForeground(@NotNull Context context) {
            l.e(context, "context");
            if (isNotificationShowing()) {
                return;
            }
            Notification notificationCreateDefaultNotification = createDefaultNotification(context);
            AmplifyTransferService amplifyTransferService = AmplifyTransferService.boundService;
            if (amplifyTransferService != null) {
                amplifyTransferService.startForeground(AmplifyTransferService.NOTIFICATION_ID, notificationCreateDefaultNotification);
            }
            AmplifyTransferService.notification = notificationCreateDefaultNotification;
        }

        public final void stopForegroundAndUnbind(@NotNull Context context) {
            l.e(context, "context");
            AmplifyTransferService amplifyTransferService = AmplifyTransferService.boundService;
            if (amplifyTransferService != null) {
                amplifyTransferService.stopForeground(true);
            }
            ServiceConnection serviceConnection = AmplifyTransferService.boundServiceConnection;
            if (serviceConnection != null) {
                context.unbindService(serviceConnection);
            }
            AmplifyTransferService.boundServiceConnection = null;
            AmplifyTransferService.notification = null;
        }
    }

    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        @NotNull
        public final AmplifyTransferService getService() {
            return AmplifyTransferService.this;
        }
    }

    public AmplifyTransferService() {
        Logger loggerForNamespace = Amplify.Logging.forNamespace("amplify:aws-s3");
        l.d(loggerForNamespace, "Amplify.Logging.forNamespace(\"amplify:aws-s3\")");
        this.log = loggerForNamespace;
        this.binder = new LocalBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUnbindCheck() {
        Handler handler = this.unbindCheckHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.unbindCheckRunnable = new Runnable() { // from class: com.amplifyframework.storage.s3.service.AmplifyTransferService.startUnbindCheck.1
            @Override // java.lang.Runnable
            public final void run() {
                Handler handler2;
                AmplifyTransferService.this.log.verbose("AmplifyTransferService unbind check running");
                TransferStatusUpdaterAccessor transferStatusUpdaterAccessor = TransferStatusUpdaterAccessor.INSTANCE;
                Context applicationContext = AmplifyTransferService.this.getApplicationContext();
                l.d(applicationContext, "applicationContext");
                if (transferStatusUpdaterAccessor.hasActiveTransfer(applicationContext)) {
                    AmplifyTransferService.this.log.verbose("Transfers in progress, rescheduling unbind check");
                    Runnable runnable = AmplifyTransferService.this.unbindCheckRunnable;
                    if (runnable == null || (handler2 = AmplifyTransferService.this.unbindCheckHandler) == null) {
                        return;
                    }
                    handler2.postDelayed(runnable, AmplifyTransferService.SHUTDOWN_CHECK_INTERVAL_MILLIS);
                    return;
                }
                try {
                    AmplifyTransferService.this.log.verbose("Removing AmplifyTransferService from foreground and unbinding");
                    Companion companion = AmplifyTransferService.Companion;
                    Context applicationContext2 = AmplifyTransferService.this.getApplicationContext();
                    l.d(applicationContext2, "applicationContext");
                    companion.stopForegroundAndUnbind(applicationContext2);
                } catch (Exception e9) {
                    AmplifyTransferService.this.log.error("Error in moving the service out of the foreground state: " + e9);
                }
            }
        };
        Handler handler2 = new Handler(Looper.getMainLooper());
        Runnable runnable = this.unbindCheckRunnable;
        if (runnable != null) {
            handler2.postDelayed(runnable, SHUTDOWN_CHECK_INTERVAL_MILLIS);
        }
        q qVar = q.f43674a;
        this.unbindCheckHandler = handler2;
    }

    public static final void stopForegroundAndUnbind(@NotNull Context context) {
        Companion.stopForegroundAndUnbind(context);
    }

    private final void stopUnbindCheck() {
        this.log.info("Stopping AmplifyTransferService unbind check");
        Handler handler = this.unbindCheckHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.unbindCheckRunnable = null;
        this.unbindCheckHandler = null;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger logger;
        String str;
        super.onCreate();
        this.transferNetworkLossHandler = TransferNetworkLossHandler.getInstance(getApplicationContext());
        synchronized (this) {
            if (this.isReceiverRegistered) {
                q qVar = q.f43674a;
            } else {
                try {
                    this.log.info("Registering the network receiver");
                    registerReceiver(this.transferNetworkLossHandler, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.isReceiverRegistered = true;
                } catch (IllegalArgumentException unused) {
                    logger = this.log;
                    str = "Ignoring the exception trying to register the receiver for connectivity change.";
                    logger.warn(str);
                } catch (IllegalStateException unused2) {
                    logger = this.log;
                    str = "Ignoring the leak in registering the receiver.";
                    logger.warn(str);
                }
                q qVar2 = q.f43674a;
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            stopUnbindCheck();
            this.log.info("De-registering the network receiver.");
            synchronized (this) {
                try {
                    if (this.isReceiverRegistered) {
                        unregisterReceiver(this.transferNetworkLossHandler);
                        this.isReceiverRegistered = false;
                        this.transferNetworkLossHandler = null;
                    }
                    q qVar = q.f43674a;
                } finally {
                }
            }
        } catch (IllegalArgumentException unused) {
            this.log.warn("Exception trying to de-register the network receiver");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i9, int i10) {
        return 1;
    }
}
