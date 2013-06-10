package droidsafe.analyses.attr.models.android.app;

import droidsafe.analyses.attr.models.android.content.Intent;
import droidsafe.analyses.attr.models.android.view.ContextThemeWrapper;
import droidsafe.analyses.attr.models.android.view.Window;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.jimple.spark.pag.AllocNode;

/**
 * @author dpetters
 */
public class Activity extends ContextThemeWrapper {

    private Application mApplication;
    private Window mWindow;
    boolean mCalled;

    public Activity(AllocNode allocNode) {
        super(allocNode);
    }

    public void _init_(){
    
    }

    // stub so that we walk through the method
    public void startActivityForResult(Intent intent, Integer requestCode) {
    }

    /**
     * Retrieve the current {@link android.view.Window} for the activity.
     * This can be used to directly access parts of the Window API that
     * are not available through Activity/Screen.
     * 
     * @return Window The current window, or null if the activity is not
     *         visual.
     */
    public Window getWindow() {
        return mWindow;
    }

    /** Return the application that owns this activity. */
    public final Application getApplication() {
        return mApplication;
    }

    /**
     * Called when you are no longer visible to the user.  You will next
     * receive either {@link #onRestart}, {@link #onDestroy}, or nothing,
     * depending on later user activity.
     * 
     * <p>Note that this method may never be called, in low memory situations
     * where the system does not have enough memory to keep your activity's
     * process running after its {@link #onPause} method is called.
     * 
     * <p><em>Derived classes must call through to the super class's
     * implementation of this method.  If they do not, an exception will be
     * thrown.</em></p>
     * 
     * @see #onRestart
     * @see #onResume
     * @see #onSaveInstanceState
     * @see #onDestroy
     */
    public void onStop() {
        mCalled = true;
    }
}
