package com.amplifyframework.datastore;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.util.Immutable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataStoreQuerySnapshot<T extends Model> {
    private final boolean isSynced;
    private final List<T> items;

    public DataStoreQuerySnapshot(List<T> list, boolean z9) {
        this.items = list;
        this.isSynced = z9;
    }

    public boolean getIsSynced() {
        return this.isSynced;
    }

    public List<T> getItems() {
        return Immutable.of(this.items);
    }
}
