package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

/* JADX INFO: renamed from: com.squareup.picasso.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1612f extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UriMatcher f39076b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39077a;

    /* JADX INFO: renamed from: com.squareup.picasso.f$a */
    public static class a {
        public static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f39076b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C1612f(Context context) {
        this.f39077a = context;
    }

    private InputStream j(w wVar) {
        ContentResolver contentResolver = this.f39077a.getContentResolver();
        Uri uriLookupContact = wVar.f39170d;
        int iMatch = f39076b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return a.a(contentResolver, uriLookupContact);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f39170d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f39076b.match(wVar.f39170d) != -1;
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i9) {
        InputStream inputStreamJ = j(wVar);
        if (inputStreamJ != null) {
            return new y.a(inputStreamJ, t.e.DISK);
        }
        return null;
    }
}
