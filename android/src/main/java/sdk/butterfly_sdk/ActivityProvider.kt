package sdk.butterfly_sdk

import android.app.Activity
import android.app.Application
import android.app.Application.ActivityLifecycleCallbacks
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import java.lang.ref.WeakReference

class ActivityProvider : ContentProvider(), ActivityLifecycleCallbacks {

    companion object {
        private var topActivity: WeakReference<Activity>? = null
        val presentedActivity: Activity?
            get() = topActivity?.get()
    }

    override fun onCreate(): Boolean {
        val applicationContext = context?.applicationContext
        (applicationContext as? Application)?.registerActivityLifecycleCallbacks(this)
        return false
    }

    override fun onActivityStarted(activity: Activity) {}
    override fun onActivityResumed(activity: Activity) {
        topActivity = WeakReference<Activity>(activity)
    }

    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {
        topActivity = null
    }

    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}

    //ContentProvider
    override fun query(uri: Uri, strings: Array<String>?, s: String?, strings1: Array<String>?, s1: String?): Cursor? {
        return null
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun insert(uri: Uri, contentValues: ContentValues?): Uri? {
        return null
    }

    override fun delete(uri: Uri, s: String?, strings: Array<String>?): Int {
        return 0
    }

    override fun update(uri: Uri, contentValues: ContentValues?, s: String?, strings: Array<String>?): Int {
        return 0
    }

    //Application.ActivityLifecycleCallbacks
    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {}

}