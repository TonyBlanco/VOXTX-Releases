package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f38338i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f38339j = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CompatJobEngine f38340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkEnqueuer f38341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CommandProcessor f38342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38343e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38344f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38345g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f38346h = new ArrayList();

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem genericWorkItemA = JobIntentService.this.a();
                if (genericWorkItemA == null) {
                    return null;
                }
                JobIntentService.this.g(genericWorkItemA.getIntent());
                genericWorkItemA.complete();
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Void r12) {
            JobIntentService.this.i();
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Void r12) {
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Void r12) {
            JobIntentService.this.i();
        }
    }

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                try {
                    if (this.mServiceProcessing) {
                        if (this.mLaunchingService) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                        this.mServiceProcessing = false;
                        this.mRunWakeLock.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                try {
                    if (!this.mServiceProcessing) {
                        this.mServiceProcessing = true;
                        this.mRunWakeLock.acquire(600000L);
                        this.mLaunchWakeLock.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        public CompatWorkItem(Intent intent, int i9) {
            this.mIntent = intent;
            this.mStartId = i9;
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName, boolean z9) {
            this.componentName = componentName;
            this.useWakefulService = z9;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        public final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public void complete() {
                String str;
                String str2;
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        } catch (SecurityException e10) {
                            e = e10;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        }
                    }
                }
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                    return new WrapperWorkItem(jobWorkItemDequeueWork);
                } catch (SecurityException e9) {
                    Log.e(TAG, "Failed to run mParams.dequeueWork()!", e9);
                    return null;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.mService.b();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return zB;
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i9) {
            super(componentName);
            ensureJobId(i9);
            this.mJobInfo = new JobInfo.Builder(i9, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, N.a(intent));
        }
    }

    public static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i9) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i9;
            } else {
                if (this.mJobId == i9) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i9 + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i9, Intent intent, boolean z9) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f38338i) {
            WorkEnqueuer workEnqueuerF = f(context, componentName, true, i9, z9);
            workEnqueuerF.ensureJobId(i9);
            try {
                workEnqueuerF.enqueueWork(intent);
            } catch (IllegalStateException e9) {
                if (!z9) {
                    throw e9;
                }
                f(context, componentName, true, i9, false).enqueueWork(intent);
            }
        }
    }

    public static void d(Context context, Class cls, int i9, Intent intent, boolean z9) {
        c(context, new ComponentName(context, (Class<?>) cls), i9, intent, z9);
    }

    public static WorkEnqueuer f(Context context, ComponentName componentName, boolean z9, int i9, boolean z10) {
        WorkEnqueuer compatWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z10);
        HashMap map = f38339j;
        WorkEnqueuer workEnqueuer = (WorkEnqueuer) map.get(componentNameWithWakeful);
        if (workEnqueuer == null) {
            if (Build.VERSION.SDK_INT < 26 || z10) {
                compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
            } else {
                if (!z9) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i9);
            }
            workEnqueuer = compatWorkEnqueuer;
            map.put(componentNameWithWakeful, workEnqueuer);
        }
        return workEnqueuer;
    }

    public GenericWorkItem a() {
        GenericWorkItem genericWorkItemDequeueWork;
        CompatJobEngine compatJobEngine = this.f38340a;
        if (compatJobEngine != null && (genericWorkItemDequeueWork = compatJobEngine.dequeueWork()) != null) {
            return genericWorkItemDequeueWork;
        }
        synchronized (this.f38346h) {
            try {
                if (this.f38346h.size() > 0) {
                    return (GenericWorkItem) this.f38346h.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        CommandProcessor commandProcessor = this.f38342d;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.f38343e);
        }
        this.f38344f = true;
        return h();
    }

    public void e(boolean z9) {
        if (this.f38342d == null) {
            this.f38342d = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f38341c;
            if (workEnqueuer != null && z9) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f38342d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    public void i() {
        ArrayList arrayList = this.f38346h;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f38342d = null;
                    ArrayList arrayList2 = this.f38346h;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f38345g) {
                        this.f38341c.serviceProcessingFinished();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f38340a;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f38340a = new JobServiceEngineImpl(this);
            this.f38341c = null;
        }
        this.f38341c = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f38346h) {
            this.f38345g = true;
            this.f38341c.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        this.f38341c.serviceStartReceived();
        synchronized (this.f38346h) {
            ArrayList arrayList = this.f38346h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i10));
            e(true);
        }
        return 3;
    }
}
