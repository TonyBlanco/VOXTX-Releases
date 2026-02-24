package com.amazonaws.mobileconnectors.appsync;

import android.util.Log;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import v1.InterfaceC2867e;

/* JADX INFO: loaded from: classes.dex */
public class InMemoryOfflineMutationManager {
    private static final String TAG = "InMemoryOfflineMutationManager";
    List<InMemoryOfflineMutationObject> inMemoryOfflineMutationObjects = new LinkedList();
    Set<InterfaceC2867e> cancelledMutations = new HashSet();
    Object lock = new Object();

    private InMemoryOfflineMutationObject getFirstInQueue() {
        synchronized (this.lock) {
            try {
                if (this.inMemoryOfflineMutationObjects.isEmpty()) {
                    return null;
                }
                return this.inMemoryOfflineMutationObjects.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addCancelledMutation(InterfaceC2867e interfaceC2867e) {
        synchronized (this.lock) {
            this.cancelledMutations.add(interfaceC2867e);
        }
    }

    public void addMutationObjectInQueue(InMemoryOfflineMutationObject inMemoryOfflineMutationObject) {
        synchronized (this.lock) {
            this.inMemoryOfflineMutationObjects.add(inMemoryOfflineMutationObject);
        }
    }

    public void clearMutationQueue() {
        synchronized (this.lock) {
            this.inMemoryOfflineMutationObjects.clear();
            this.cancelledMutations.clear();
        }
    }

    public Set<InterfaceC2867e> getCancelledMutations() {
        Set<InterfaceC2867e> set;
        synchronized (this.lock) {
            set = this.cancelledMutations;
        }
        return set;
    }

    public InMemoryOfflineMutationObject getMutationObject(InterfaceC2867e interfaceC2867e) {
        for (InMemoryOfflineMutationObject inMemoryOfflineMutationObject : this.inMemoryOfflineMutationObjects) {
            if (inMemoryOfflineMutationObject.equals(interfaceC2867e)) {
                return inMemoryOfflineMutationObject;
            }
        }
        return null;
    }

    public boolean isQueueEmpty() {
        boolean zIsEmpty;
        synchronized (this.lock) {
            zIsEmpty = this.inMemoryOfflineMutationObjects.isEmpty();
        }
        return zIsEmpty;
    }

    public InMemoryOfflineMutationObject processNextMutation() {
        InMemoryOfflineMutationObject firstInQueue = getFirstInQueue();
        if (firstInQueue != null && !getCancelledMutations().contains(firstInQueue.request.f1314b)) {
            Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]:Executing mutation [" + firstInQueue.recordIdentifier + "]");
            firstInQueue.execute();
        }
        return firstInQueue;
    }

    public void removeCancelledMutation(InterfaceC2867e interfaceC2867e) {
        synchronized (this.lock) {
            this.cancelledMutations.remove(interfaceC2867e);
        }
    }

    public InMemoryOfflineMutationObject removeFromQueue(String str) {
        InMemoryOfflineMutationObject inMemoryOfflineMutationObject;
        synchronized (this.lock) {
            try {
                if (this.inMemoryOfflineMutationObjects.isEmpty() || (inMemoryOfflineMutationObject = this.inMemoryOfflineMutationObjects.get(0)) == null || !str.equals(inMemoryOfflineMutationObject.recordIdentifier)) {
                    return null;
                }
                return this.inMemoryOfflineMutationObjects.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
