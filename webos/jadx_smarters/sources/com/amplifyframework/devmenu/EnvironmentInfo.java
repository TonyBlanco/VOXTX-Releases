package com.amplifyframework.devmenu;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Resources;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.plugin.Plugin;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentInfo {
    private static final String DEV_ENV_INFO_FILE_NAME = "localenvinfo";
    private final Map<String, String> devEnvironmentItems;

    public EnvironmentInfo() {
        HashMap map = new HashMap();
        this.devEnvironmentItems = map;
        map.put("nodejsVersion", "Node.js Version");
        map.put("npmVersion", "NPM Version");
        map.put("amplifyCliVersion", "Amplify CLI Version");
        map.put("androidStudioVersion", "Android Studio Version");
        map.put("osName", "OS");
        map.put("osVersion", "OS Version");
    }

    private String getCategoryPluginVersions(Category<?> category) {
        StringBuilder sb = new StringBuilder();
        for (P p9 : category.getPlugins()) {
            sb.append(p9.getPluginKey() + ": " + p9.getVersion() + "\n");
        }
        return sb.toString();
    }

    public String getDeveloperEnvironmentInfo(Context context) throws AmplifyException {
        Objects.requireNonNull(context);
        try {
            JSONObject jsonResource = Resources.readJsonResource(context.getApplicationContext(), DEV_ENV_INFO_FILE_NAME);
            StringBuilder sb = new StringBuilder();
            for (String str : this.devEnvironmentItems.keySet()) {
                if (jsonResource.has(str)) {
                    try {
                        sb.append(this.devEnvironmentItems.get(str) + ": " + jsonResource.getString(str) + "\n");
                    } catch (JSONException e9) {
                        throw new AmplifyException("Error reading the developer environment information.", e9, "Check that localenvinfo.json is properly formatted");
                    }
                }
            }
            return sb.toString();
        } catch (Resources.ResourceLoadingException e10) {
            throw new AmplifyException("Failed to find localenvinfo.", e10, "Please ensure it is present in your project.");
        }
    }

    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        Iterator<Category<? extends Plugin<?>>> it = Amplify.getCategoriesMap().values().iterator();
        while (it.hasNext()) {
            sb.append(getCategoryPluginVersions(it.next()));
        }
        String string = sb.toString();
        return string.isEmpty() ? "No plugins added." : string;
    }
}
