package sdk.butterfly_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.ref.WeakReference;

public class ContextProvider extends ContentProvider implements Application.ActivityLifecycleCallbacks {

    private static Activity topActivity;

    public ContextProvider(){

    }

    public Activity getActivity(){
        return topActivity;
    }


    @Override
    public boolean onCreate() {
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application)applicationContext).registerActivityLifecycleCallbacks(this);
            Log.e(this.getClass().getSimpleName(),"registerActivityLifecycleCallbackss");
        }
        Log.e(this.getClass().getSimpleName(),"in onCreate function");
        return false;
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        topActivity = activity;
        Log.e("topActivity",topActivity.getClass().getName());
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }

    //ContentProvider
    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    //Application.ActivityLifecycleCallbacks
    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }
}
