package com.nst.iptvsmarterstvbox.model;

import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeasonsDetailCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EpisodesUsingSinglton {
    private static EpisodesUsingSinglton myObj;
    private boolean RecenlyTimeSaved = true;
    private List<GetEpisdoeDetailsCallback> currentSeasonEpisodeList;
    private List<GetEpisdoeDetailsCallback> episodeList;
    private ArrayList<SeasonsDetailCallback> seasonsList;

    private EpisodesUsingSinglton() {
    }

    public static EpisodesUsingSinglton getInstance() {
        if (myObj == null) {
            myObj = new EpisodesUsingSinglton();
        }
        return myObj;
    }

    public List<GetEpisdoeDetailsCallback> getCurrentSeasonEpisodeList() {
        return this.currentSeasonEpisodeList;
    }

    public List<GetEpisdoeDetailsCallback> getEpisodeList() {
        return this.episodeList;
    }

    public boolean getRecenlyTimeSaved() {
        return this.RecenlyTimeSaved;
    }

    public ArrayList<SeasonsDetailCallback> getSeasonsList() {
        return this.seasonsList;
    }

    public void setCurrentSeasonEpisodeList(List<GetEpisdoeDetailsCallback> list) {
        this.currentSeasonEpisodeList = list;
    }

    public void setEpisodeList(List<GetEpisdoeDetailsCallback> list) {
        this.episodeList = list;
    }

    public void setRecenlyTimeSaved(boolean z9) {
        this.RecenlyTimeSaved = z9;
    }

    public void setSeasonsList(ArrayList<SeasonsDetailCallback> arrayList) {
        this.seasonsList = arrayList;
    }
}
