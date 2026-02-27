package com.amplifyframework.devmenu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.devmenu.ShakeDetector;
import com.amplifyframework.logging.LogLevel;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DeveloperMenu implements ShakeDetector.Listener {
    private static final Logger LOG = Amplify.Logging.forNamespace("amplify:devmenu");
    private static DeveloperMenu sInstance;
    private Context context;
    private HideAction hideAction;
    private PersistentLogStoragePlugin loggingPlugin;
    private boolean visible;

    public interface HideAction {
        void hideDeveloperMenu();
    }

    private DeveloperMenu(Context context) {
        this.context = context.getApplicationContext();
    }

    public static DeveloperMenu singletonInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DeveloperMenu(context);
        }
        return sInstance;
    }

    public void copyToClipboard(String str) {
        ((ClipboardManager) this.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
    }

    public String createIssueBody(String str, boolean z9) {
        String developerEnvironmentInfo;
        EnvironmentInfo environmentInfo = new EnvironmentInfo();
        String str2 = "*Amplify Plugins Information:*\n" + environmentInfo.getPluginVersions();
        String str3 = "";
        try {
            developerEnvironmentInfo = environmentInfo.getDeveloperEnvironmentInfo(this.context);
        } catch (AmplifyException unused) {
            LOG.warn("Error reading developer environment information.");
            developerEnvironmentInfo = "";
        }
        if (!developerEnvironmentInfo.isEmpty()) {
            str2 = str2 + "\n\n*Developer Environment Information:*\n" + developerEnvironmentInfo;
        }
        String string = new DeviceInfo().toString();
        if (z9 && !this.loggingPlugin.getLogs().isEmpty()) {
            str3 = "**Logs**\n```\n" + getLogs() + "```";
        }
        return String.format(Locale.US, "**Issue Description**\n%s\n\n**Environment Information**\n%s\n\n**Device Information**\n%s\n\n%s", str, str2, string, str3);
    }

    public void enableDeveloperMenu() throws AmplifyException {
        if ((this.context.getApplicationInfo().flags & 2) != 0) {
            PersistentLogStoragePlugin persistentLogStoragePlugin = new PersistentLogStoragePlugin();
            this.loggingPlugin = persistentLogStoragePlugin;
            Amplify.addPlugin(persistentLogStoragePlugin);
            startListening();
        }
    }

    public String getFilteredLogs(String str, LogLevel logLevel) {
        if (Empty.check(str) && logLevel == null) {
            return getLogs();
        }
        List<LogEntry> logs = this.loggingPlugin.getLogs();
        if (logs.isEmpty()) {
            return "No logs to display.";
        }
        StringBuilder sb = new StringBuilder();
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.US);
        for (LogEntry logEntry : logs) {
            String string = logEntry.toString();
            if (string.toLowerCase(Locale.US).contains(lowerCase) && (logLevel == null || logEntry.getLogLevel() == logLevel)) {
                sb.append(string);
            }
        }
        String string2 = sb.toString();
        return string2.isEmpty() ? "No logs match the search criteria." : string2;
    }

    public String getLogs() {
        List<LogEntry> logs = this.loggingPlugin.getLogs();
        return logs.isEmpty() ? "No logs to display." : TextUtils.join("", logs);
    }

    @Override // com.amplifyframework.devmenu.ShakeDetector.Listener
    public void onShakeDetected() {
        boolean z9;
        if (this.visible) {
            HideAction hideAction = this.hideAction;
            if (hideAction != null) {
                hideAction.hideDeveloperMenu();
            }
            z9 = false;
        } else {
            Intent intent = new Intent(this.context, (Class<?>) DeveloperMenuActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.setFlags(268435456);
            this.context.startActivity(intent);
            z9 = true;
        }
        this.visible = z9;
    }

    public void setOnHideAction(HideAction hideAction) {
        this.hideAction = hideAction;
    }

    public void setVisible(boolean z9) {
        this.visible = z9;
    }

    public void startListening() {
        new ShakeDetector(this.context, this).startDetecting();
    }
}
