package org.kustom.kodersample;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class SampleProvider extends ContentProvider {

    @Override
    public int delete(
            @NonNull Uri uri,
            String selection,
            String[] selectionArgs) {
        return 0;
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(
            @NonNull Uri uri,
            String[] projection,
            String selection,
            String[] selectionArgs,
            String sortOrder) {
        MatrixCursor c = new MatrixCursor(new String[]{"Kode", "Description"});
        c.addRow(new String[]{"$df(S)$", "Seconds since epoch"});
        c.addRow(new String[]{"$df(yyyy)$", "Current year"});
        return c;
    }

    @Nullable
    @Override
    public String getType(
            @NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(
            @NonNull Uri uri,
            ContentValues values) {
        return null;
    }

    @Override
    public int update(
            @NonNull Uri uri,
            ContentValues values,
            String selection,
            String[] selectionArgs) {
        return 0;
    }
}
