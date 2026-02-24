package com.amplifyframework.core.category;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.InitializationResult;
import com.amplifyframework.core.InitializationStatus;
import com.amplifyframework.core.plugin.Plugin;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.util.Immutable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Category<P extends Plugin<?>> implements CategoryTypeable {
    private final Map<String, P> plugins = new ConcurrentHashMap();
    private final AtomicReference<State> state = new AtomicReference<>(State.NOT_CONFIGURED);
    private final AtomicReference<CategoryInitializationResult> categoryInitializationResult = new AtomicReference<>(null);

    public enum State {
        NOT_CONFIGURED,
        CONFIGURING,
        CONFIGURED,
        INITIALIZING,
        INITIALIZED,
        CONFIGURATION_FAILED,
        INITIALIZATION_FAILED
    }

    private P getPluginIfConfiguredOrThrow(P p9) throws IllegalStateException {
        if (p9 == null) {
            throw new IllegalStateException("Tried to get a plugin but that plugin was not present. Check if the plugin was added originally or perhaps was already removed.");
        }
        if (State.CONFIGURATION_FAILED.equals(this.state.get())) {
            throw new IllegalStateException("Failed to get plugin because configuration previously failed.  Check for failures by logging any exceptions thrown by Amplify.configure().");
        }
        if (State.INITIALIZATION_FAILED.equals(this.state.get())) {
            CategoryInitializationResult categoryInitializationResult = this.categoryInitializationResult.get();
            throw new IllegalStateException("Failed to get plugin because initialization previously failed.  See attached exception for details.", categoryInitializationResult != null ? categoryInitializationResult.getPluginInitializationFailures().get(p9.getPluginKey()) : null);
        }
        if (isConfigured()) {
            return p9;
        }
        throw new IllegalStateException("Tried to get a plugin before it was configured.  Make sure you call Amplify.configure() first.");
    }

    public final void addPlugin(P p9) throws AmplifyException {
        if (State.NOT_CONFIGURED.equals(this.state.get())) {
            this.plugins.put(p9.getPluginKey(), p9);
        } else {
            throw new AmplifyException("Category " + getCategoryType() + " has already been configured or is configuring.", "Make sure that you have added all plugins before attempting configuration.");
        }
    }

    public final synchronized void configure(CategoryConfiguration categoryConfiguration, Context context) throws AmplifyException {
        synchronized (this.state) {
            if (!State.NOT_CONFIGURED.equals(this.state.get())) {
                throw new AmplifyException("Category " + getCategoryType() + " has already been configured or is currently configuring.", "Ensure that you are only attempting configuration once.");
            }
            this.state.set(State.CONFIGURING);
            try {
                for (P p9 : getPlugins()) {
                    JSONObject pluginConfig = categoryConfiguration.getPluginConfig(p9.getPluginKey());
                    if (pluginConfig == null) {
                        pluginConfig = new JSONObject();
                    }
                    p9.configure(pluginConfig, context);
                }
                this.state.set(State.CONFIGURED);
            } catch (Throwable th) {
                this.state.set(State.CONFIGURATION_FAILED);
                throw th;
            }
        }
    }

    public final P getPlugin(String str) throws IllegalStateException {
        return (P) getPluginIfConfiguredOrThrow(this.plugins.get(str));
    }

    public final Set<P> getPlugins() {
        return Immutable.of(new HashSet(this.plugins.values()));
    }

    public P getSelectedPlugin() throws IllegalStateException {
        if (this.plugins.size() > 1) {
            throw new IllegalStateException("Tried to get a default plugin but there are more than one to choose from in this category. Call getPlugin(pluginKey) to choose the specific plugin you want to use in this case.");
        }
        Iterator<P> it = getPlugins().iterator();
        return (P) getPluginIfConfiguredOrThrow(it.hasNext() ? it.next() : null);
    }

    public final synchronized CategoryInitializationResult initialize(Context context) {
        InitializationResult initializationResultFailure;
        CategoryInitializationResult categoryInitializationResultWith;
        AtomicReference<State> atomicReference;
        State state;
        try {
            HashMap map = new HashMap();
            if (State.CONFIGURED.equals(this.state.get())) {
                this.state.set(State.CONFIGURING);
                for (P p9 : getPlugins()) {
                    try {
                        p9.initialize(context);
                        initializationResultFailure = InitializationResult.success();
                    } catch (AmplifyException e9) {
                        initializationResultFailure = InitializationResult.failure(e9);
                    }
                    map.put(p9.getPluginKey(), initializationResultFailure);
                }
            } else {
                Iterator<P> it = getPlugins().iterator();
                while (it.hasNext()) {
                    map.put(it.next().getPluginKey(), InitializationResult.failure(new AmplifyException("Tried to init before category was not configured.", "Call configure() on category, first.")));
                }
            }
            categoryInitializationResultWith = CategoryInitializationResult.with(map);
            this.categoryInitializationResult.set(categoryInitializationResultWith);
            if (categoryInitializationResultWith.isFailure()) {
                atomicReference = this.state;
                state = State.INITIALIZATION_FAILED;
            } else {
                atomicReference = this.state;
                state = State.INITIALIZED;
            }
            atomicReference.set(state);
            Amplify.Hub.publish(HubChannel.forCategoryType(getCategoryType()), HubEvent.create(categoryInitializationResultWith.isFailure() ? InitializationStatus.FAILED : InitializationStatus.SUCCEEDED, categoryInitializationResultWith));
        } catch (Throwable th) {
            throw th;
        }
        return categoryInitializationResultWith;
    }

    public synchronized boolean isConfigured() {
        return Arrays.asList(State.CONFIGURED, State.INITIALIZING, State.INITIALIZED).contains(this.state.get());
    }

    public synchronized boolean isInitialized() {
        return State.INITIALIZED.equals(this.state.get());
    }

    public final void removePlugin(P p9) {
        this.plugins.remove(p9.getPluginKey());
    }
}
