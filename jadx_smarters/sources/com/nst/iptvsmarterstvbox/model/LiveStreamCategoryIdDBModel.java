package com.nst.iptvsmarterstvbox.model;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class LiveStreamCategoryIdDBModel implements Serializable {
    private String alias;
    private String censored;
    private int id;
    private String liveStreamCategoryID;
    private String liveStreamCategoryName;
    private int liveStreamCounter;
    private int parentId;

    public LiveStreamCategoryIdDBModel() {
    }

    public LiveStreamCategoryIdDBModel(String str, String str2, int i9) {
        this.liveStreamCategoryID = str;
        this.liveStreamCategoryName = str2;
        this.parentId = i9;
    }

    public static ArrayList<LiveStreamCategoryIdDBModel> listOfChannels(ArrayList<LiveStreamCategoryIdDBModel> arrayList, Context context, LiveStreamDBHandler liveStreamDBHandler) {
        if (context == null) {
            return null;
        }
        LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(context);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = new ArrayList<>();
        for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : arrayList) {
            String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler2.getAllLiveStreasWithCategoryId(liveStreamCategoryID, "live");
            Iterator<LiveStreamCategoryIdDBModel> it = liveStreamDBHandler2.getAllMovieCategoriesHavingParentIdNotZero(liveStreamCategoryID).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (liveStreamDBHandler2.getAllLiveStreasWithCategoryId(String.valueOf(it.next().getLiveStreamCategoryID()), "live").size() > 0) {
                    arrayList2.add(liveStreamCategoryIdDBModel);
                    break;
                }
            }
            if (allLiveStreasWithCategoryId.size() > 0) {
                arrayList2.add(liveStreamCategoryIdDBModel);
            }
        }
        return arrayList2;
    }

    public static ArrayList<LiveStreamCategoryIdDBModel> listOfMOview(ArrayList<LiveStreamCategoryIdDBModel> arrayList, Context context, LiveStreamDBHandler liveStreamDBHandler) {
        if (context == null) {
            return null;
        }
        LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(context);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = new ArrayList<>();
        for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : arrayList) {
            String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler2.getAllLiveStreasWithCategoryId(liveStreamCategoryID, "movie");
            Iterator<LiveStreamCategoryIdDBModel> it = liveStreamDBHandler2.getAllMovieCategoriesHavingParentIdNotZero(liveStreamCategoryID).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (liveStreamDBHandler2.getAllLiveStreasWithCategoryId(String.valueOf(it.next().getLiveStreamCategoryID()), "movie").size() > 0) {
                    arrayList2.add(liveStreamCategoryIdDBModel);
                    break;
                }
            }
            if (allLiveStreasWithCategoryId.size() > 0) {
                arrayList2.add(liveStreamCategoryIdDBModel);
            }
        }
        return arrayList2;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getCensored() {
        return this.censored;
    }

    public int getId() {
        return this.id;
    }

    public String getLiveStreamCategoryID() {
        return this.liveStreamCategoryID;
    }

    public String getLiveStreamCategoryName() {
        return this.liveStreamCategoryName;
    }

    public int getLiveStreamCounter() {
        return this.liveStreamCounter;
    }

    public int getParentId() {
        return this.parentId;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setCensored(String str) {
        this.censored = str;
    }

    public void setId(int i9) {
        this.id = i9;
    }

    public void setLiveStreamCategoryID(String str) {
        this.liveStreamCategoryID = str;
    }

    public void setLiveStreamCategoryName(String str) {
        this.liveStreamCategoryName = str;
    }

    public void setLiveStreamCounter(int i9) {
        this.liveStreamCounter = i9;
    }

    public void setParentId(int i9) {
        this.parentId = i9;
    }
}
