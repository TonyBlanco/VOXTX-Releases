package com.amplifyframework.core;

import android.content.Context;
import android.content.res.Resources;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Resources {

    public static final class ResourceLoadingException extends Exception {
        private static final long serialVersionUID = 1;

        public ResourceLoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    private Resources() {
    }

    public static int getRawResourceId(Context context, String str) throws ResourceLoadingException {
        try {
            return context.getResources().getIdentifier(str, "raw", context.getPackageName());
        } catch (Exception e9) {
            throw new ResourceLoadingException("No such resource with identifier " + str, e9);
        }
    }

    public static JSONObject readJsonResource(Context context, String str) throws ResourceLoadingException {
        return readJsonResourceFromId(context, getRawResourceId(context, str));
    }

    public static JSONObject readJsonResourceFromId(Context context, int i9) throws ResourceLoadingException {
        try {
            Scanner scanner = new Scanner(context.getResources().openRawResource(i9));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            try {
                return new JSONObject(sb.toString());
            } catch (JSONException e9) {
                throw new ResourceLoadingException("Failed to read the resource with ID " + i9 + InstructionFileId.DOT, e9);
            }
        } catch (Resources.NotFoundException e10) {
            throw new ResourceLoadingException("No such resource with ID = " + i9, e10);
        }
    }
}
