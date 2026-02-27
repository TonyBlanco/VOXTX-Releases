package com.amplifyframework.api.graphql;

import O.c;
import j$.lang.Iterable;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class PaginatedResult<T> implements Iterable<T>, Iterable {
    private final Iterable<T> items;
    private final GraphQLRequest<PaginatedResult<T>> requestForNextResult;

    public PaginatedResult(Iterable<T> iterable, GraphQLRequest<PaginatedResult<T>> graphQLRequest) {
        this.requestForNextResult = graphQLRequest;
        this.items = iterable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaginatedResult.class != obj.getClass()) {
            return false;
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        return c.a(this.requestForNextResult, paginatedResult.requestForNextResult) && c.a(this.items, paginatedResult.items);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public void forEach(Consumer<? super T> consumer) {
        Iterable.EL.forEach(this.items, consumer);
    }

    public Iterable<T> getItems() {
        return this.items;
    }

    public GraphQLRequest<PaginatedResult<T>> getRequestForNextResult() {
        return this.requestForNextResult;
    }

    public boolean hasNextResult() {
        return this.requestForNextResult != null;
    }

    public int hashCode() {
        return c.b(this.requestForNextResult, this.items);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Spliterator<T> spliterator() {
        return Iterable.EL.spliterator(this.items);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public String toString() {
        return "PaginatedResult{requestForNextResult=" + this.requestForNextResult + ", items=" + this.items + '}';
    }
}
