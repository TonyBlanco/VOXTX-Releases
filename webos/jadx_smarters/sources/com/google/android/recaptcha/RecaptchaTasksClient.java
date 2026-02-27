package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface RecaptchaTasksClient {
    @NotNull
    Task<String> executeTask(RecaptchaAction recaptchaAction);
}
