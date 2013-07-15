package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.webkit.DeviceMotionAndOrientationManager;
import java.lang.Runnable;
import java.util.List;

final class DeviceMotionService implements SensorEventListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.869 -0400", hash_original_field = "1D4FD4FBF6080AF66D4D90562FE06036", hash_generated_field = "66D108DFC043A6E0A2844E4843186070")

    private DeviceMotionAndOrientationManager mManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.869 -0400", hash_original_field = "130D713CAF236B328B5223DFA18F1488", hash_generated_field = "B2DDC5809B05187D32A84097DC68019C")

    private boolean mIsRunning;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.869 -0400", hash_original_field = "C78BEDFC523DB73DF63EFB071AF1C35B", hash_generated_field = "03E47BA0CE42772601F0A13D178B12B5")

    private Handler mHandler;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.869 -0400", hash_original_field = "8CDFC97B128FB94D2A2F11FDAFFE50EA", hash_generated_field = "D8CC5B9F3DF5D78484C533BB7CDDA85C")

    private SensorManager mSensorManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.870 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.870 -0400", hash_original_field = "2C3606D875A88A4154C18923EE3485CF", hash_generated_field = "16AAE3611879142DAF4D4972E6DBF92E")

    private boolean mHaveSentErrorEvent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.870 -0400", hash_original_field = "084498CA6FFD1B3976129A78E779839D", hash_generated_field = "16C911A75559FF3FC455929D8833F7AD")

    private Runnable mUpdateRunnable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.870 -0400", hash_original_field = "B521B76CAC58E2A585AF8E91991B773E", hash_generated_field = "D4A570CD23CCC3472A74A9385901C82C")

    private float mLastAcceleration[];
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.871 -0400", hash_original_method = "F55301D24998230F1C8CCBC205AE8660", hash_generated_method = "91D9E15C868D33484D657357AE6A6D5A")
    public  DeviceMotionService(DeviceMotionAndOrientationManager manager, Context context) {
        mManager = manager;
        mContext = context;
        // ---------- Original Method ----------
        //mManager = manager;
        //assert(mManager != null);
        //mContext = context;
        //assert(mContext != null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.872 -0400", hash_original_method = "98B4404819C6BBBB3597C623BA4BB028", hash_generated_method = "B7F692BDF799E4ACD08DFAD15C4EC7B0")
    public void start() {
        mIsRunning = true;
        registerForSensor();
        // ---------- Original Method ----------
        //mIsRunning = true;
        //registerForSensor();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.872 -0400", hash_original_method = "01C2E2F2F39858D9C160CE6783C7D17B", hash_generated_method = "D2F2FBC703239730100BC77A7A87E537")
    public void stop() {
        mIsRunning = false;
        stopSendingUpdates();
        unregisterFromSensor();
        // ---------- Original Method ----------
        //mIsRunning = false;
        //stopSendingUpdates();
        //unregisterFromSensor();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.872 -0400", hash_original_method = "7537A7F7CC7F152580C5E8AB37332B9F", hash_generated_method = "19E173E1DF63FB312E69DD416003C6FB")
    public void suspend() {
    if(mIsRunning)        
        {
            stopSendingUpdates();
            unregisterFromSensor();
        } //End block
        // ---------- Original Method ----------
        //if (mIsRunning) {
            //stopSendingUpdates();
            //unregisterFromSensor();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.873 -0400", hash_original_method = "06D001413EE6654679884BE0B710A988", hash_generated_method = "30FDFFEAD75010B4AE6CA64DD1C07C63")
    public void resume() {
    if(mIsRunning)        
        {
            registerForSensor();
        } //End block
        // ---------- Original Method ----------
        //if (mIsRunning) {
            //registerForSensor();
        //}
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.874 -0400", hash_original_method = "CDFAD74C98E46044259B3BCC3613C4C6", hash_generated_method = "B9E0563BAE7A353CA42311754FDB9912")
    private void sendErrorEvent() {
    if(mHaveSentErrorEvent)        
        return;
        mHaveSentErrorEvent = true;
        createHandler();
        mHandler.post(new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.874 -0400", hash_original_method = "7A626774FEDB8F7ED99A6D9AA618F581", hash_generated_method = "8A0A7750E2BE58C6DCC69D6702B474EC")
        @Override
        public void run() {
    if(mIsRunning)            
            {
                mManager.onMotionChange(null, null, null, 0.0);
            } //End block
            // ---------- Original Method ----------
            //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
            //if (mIsRunning) {
                    //mManager.onMotionChange(null, null, null, 0.0);
                //}
        }
});
        // ---------- Original Method ----------
        //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
        //if (mHaveSentErrorEvent)
            //return;
        //mHaveSentErrorEvent = true;
        //createHandler();
        //mHandler.post(new Runnable() {
            //@Override
            //public void run() {
                //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
                //if (mIsRunning) {
                    //mManager.onMotionChange(null, null, null, 0.0);
                //}
            //}
        //});
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.875 -0400", hash_original_method = "9B63FE7EDAA2DFAC9F6DE1381BA682EF", hash_generated_method = "4C846DBA652883F8D365FCF45693C10C")
    private void createHandler() {
    if(mHandler != null)        
        {
            return;
        } //End block
        mHandler = new Handler();
        mUpdateRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.875 -0400", hash_original_method = "BF4DF07DFA0B7EFFD5AC0E28D1CE9285", hash_generated_method = "9058959D11C31754F9029A679BB2DC7A")
        @Override
        public void run() {
            mManager.onMotionChange(new Double(mLastAcceleration[0]),
                        new Double(mLastAcceleration[1]), new Double(mLastAcceleration[2]),
                        INTERVAL_MILLIS);
            mHandler.postDelayed(mUpdateRunnable, INTERVAL_MILLIS);
            mHaveSentErrorEvent = false;
            // ---------- Original Method ----------
            //assert mIsRunning;
            //mManager.onMotionChange(new Double(mLastAcceleration[0]),
                        //new Double(mLastAcceleration[1]), new Double(mLastAcceleration[2]),
                        //INTERVAL_MILLIS);
            //mHandler.postDelayed(mUpdateRunnable, INTERVAL_MILLIS);
            //mHaveSentErrorEvent = false;
        }
};
        // ---------- Original Method ----------
        //if (mHandler != null) {
            //return;
        //}
        //mHandler = new Handler();
        //mUpdateRunnable = new Runnable() {
            //@Override
            //public void run() {
                //assert mIsRunning;
                //mManager.onMotionChange(new Double(mLastAcceleration[0]),
                        //new Double(mLastAcceleration[1]), new Double(mLastAcceleration[2]),
                        //INTERVAL_MILLIS);
                //mHandler.postDelayed(mUpdateRunnable, INTERVAL_MILLIS);
                //mHaveSentErrorEvent = false;
            //}
        //};
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.876 -0400", hash_original_method = "A3A2E2444DD47EDD24E157A7D990CD47", hash_generated_method = "9D2E6C8D82D655D950CB0FEE1EEC48AE")
    private void startSendingUpdates() {
        createHandler();
        mUpdateRunnable.run();
        // ---------- Original Method ----------
        //createHandler();
        //mUpdateRunnable.run();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.876 -0400", hash_original_method = "C91FFFB25BA3A01D4AF61CC044FBC20A", hash_generated_method = "BCE08908D6D1E37280656543AC394DA7")
    private void stopSendingUpdates() {
        mHandler.removeCallbacks(mUpdateRunnable);
        mLastAcceleration = null;
        // ---------- Original Method ----------
        //mHandler.removeCallbacks(mUpdateRunnable);
        //mLastAcceleration = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.876 -0400", hash_original_method = "8EA92813CD5F00D63229FB53D6348E72", hash_generated_method = "DD806532E32A7FC7B7B8BDCBE57C9E83")
    private void registerForSensor() {
    if(!registerForAccelerometerSensor())        
        {
            sendErrorEvent();
        } //End block
        // ---------- Original Method ----------
        //if (!registerForAccelerometerSensor()) {
            //sendErrorEvent();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.877 -0400", hash_original_method = "D09B23AC902B5D9C0E49BB52A156F918", hash_generated_method = "82F22B2AAD442FFFA0FF07D97E7ED361")
    private SensorManager getSensorManager() {
    if(mSensorManager == null)        
        {
            mSensorManager = (SensorManager) mContext.getSystemService(Context.SENSOR_SERVICE);
        } //End block
SensorManager varAF949C78846D4F076444FE5DD86DE06F_725769314 =         mSensorManager;
        varAF949C78846D4F076444FE5DD86DE06F_725769314.addTaint(taint);
        return varAF949C78846D4F076444FE5DD86DE06F_725769314;
        // ---------- Original Method ----------
        //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
        //if (mSensorManager == null) {
            //mSensorManager = (SensorManager) mContext.getSystemService(Context.SENSOR_SERVICE);
        //}
        //return mSensorManager;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.877 -0400", hash_original_method = "132C72132CB3FECC364192FB60290F0C", hash_generated_method = "5586C3761FCBA81D3FA2DF9B11AC2CC6")
    private boolean registerForAccelerometerSensor() {
        List<Sensor> sensors = getSensorManager().getSensorList(Sensor.TYPE_ACCELEROMETER);
    if(sensors.isEmpty())        
        {
            boolean var68934A3E9455FA72420237EB05902327_1480665864 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1028216531 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1028216531;
        } //End block
        createHandler();
        boolean var1012909057F82439AA263E7AC8ACCAD6_1245606889 = (getSensorManager().registerListener(
                this, sensors.get(0), SensorManager.SENSOR_DELAY_UI, mHandler));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1045175231 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1045175231;
        // ---------- Original Method ----------
        //List<Sensor> sensors = getSensorManager().getSensorList(Sensor.TYPE_ACCELEROMETER);
        //if (sensors.isEmpty()) {
            //return false;
        //}
        //createHandler();
        //return getSensorManager().registerListener(
                //this, sensors.get(0), SensorManager.SENSOR_DELAY_UI, mHandler);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.877 -0400", hash_original_method = "8F0ED17D95B5480F975ECDA7EDF68357", hash_generated_method = "9047F07B49AB7461A60D1DD86FDABEAE")
    private void unregisterFromSensor() {
        getSensorManager().unregisterListener(this);
        // ---------- Original Method ----------
        //getSensorManager().unregisterListener(this);
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.878 -0400", hash_original_method = "7AFE6EE6D4C15EE2C452A64798BB4D96", hash_generated_method = "BDAE4616D6B845250A585D6884DDBB0D")
    public void onSensorChanged(SensorEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
    if(!mIsRunning)        
        {
            return;
        } //End block
        boolean firstData = mLastAcceleration == null;
        mLastAcceleration = event.values;
    if(firstData)        
        {
            startSendingUpdates();
        } //End block
        // ---------- Original Method ----------
        //assert(event.values.length == 3);
        //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
        //assert(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER);
        //if (!mIsRunning) {
            //return;
        //}
        //boolean firstData = mLastAcceleration == null;
        //mLastAcceleration = event.values;
        //if (firstData) {
            //startSendingUpdates();
        //}
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.878 -0400", hash_original_method = "4C77A6863BACF480F39B2826F5CA663C", hash_generated_method = "3B735DACA44A7088C201CD04E68BCC26")
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(accuracy);
        addTaint(sensor.getTaint());
        // ---------- Original Method ----------
        //assert WebViewCore.THREAD_NAME.equals(Thread.currentThread().getName());
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:57.878 -0400", hash_original_field = "6F01D460799E7BF514D22B06957DBD6A", hash_generated_field = "9BEB3C1E993D7EFC95522BDB3A8CC69D")

    private static final int INTERVAL_MILLIS = 100;
}

