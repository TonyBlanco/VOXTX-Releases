package com.amplifyframework.geo.result;

import com.amplifyframework.geo.models.Place;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GeoSearchResult {
    private final List<Place> places;

    private GeoSearchResult(List<Place> list) {
        this.places = list;
    }

    public static GeoSearchResult withPlaces(List<Place> list) {
        Objects.requireNonNull(list);
        return new GeoSearchResult(list);
    }

    public List<Place> getPlaces() {
        return Immutable.of(this.places);
    }
}
