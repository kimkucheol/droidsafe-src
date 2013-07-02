package android.app;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Log;

public class UiModeManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.599 -0400", hash_original_field = "D96EB21FC1A83B484FAE33A12B05D9CB", hash_generated_field = "AC5296BC9334BAEB9DDA5E503BF7ECAF")

    private IUiModeManager mService;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.600 -0400", hash_original_method = "885E2DF97B9D4497B2AC3BA2EAEC628B", hash_generated_method = "056F639D47467015E4958DFADC7377FD")
      UiModeManager() {
        mService = IUiModeManager.Stub.asInterface(
                ServiceManager.getService(Context.UI_MODE_SERVICE));
        
        
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.600 -0400", hash_original_method = "A4DA8672EE11B64C720877911E862CCA", hash_generated_method = "DAFEC616CB6F3914928DC3374EADA885")
    public void enableCarMode(int flags) {
        {
            try 
            {
                mService.enableCarMode(flags);
            } 
            catch (RemoteException e)
            { }
        } 
        addTaint(flags);
        
        
            
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.601 -0400", hash_original_method = "3F662D74C7F5FA5E21AD89C24E03313D", hash_generated_method = "EC9C755E6BCC8979C43BEEE7470CB36F")
    public void disableCarMode(int flags) {
        {
            try 
            {
                mService.disableCarMode(flags);
            } 
            catch (RemoteException e)
            { }
        } 
        addTaint(flags);
        
        
            
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.601 -0400", hash_original_method = "0CD456741A85C32EF5CC7E71365FBB20", hash_generated_method = "ED5E480566432A1554212276FD7FAEA1")
    public int getCurrentModeType() {
        {
            try 
            {
                int var29ABCCF4A3C40C4AD9C9FABB6311381C_566107582 = (mService.getCurrentModeType());
            } 
            catch (RemoteException e)
            { }
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1247846174 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1247846174;
        
        
            
                
            
                
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.602 -0400", hash_original_method = "D2225F0EDD53710765C544C38EED4B1C", hash_generated_method = "8A673AC13D547016905B9B3D7C2050A4")
    public void setNightMode(int mode) {
        {
            try 
            {
                mService.setNightMode(mode);
            } 
            catch (RemoteException e)
            { }
        } 
        addTaint(mode);
        
        
            
                
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.602 -0400", hash_original_method = "9AFE4882A5DD35A0B7234D31EDC0BDFC", hash_generated_method = "39A3D9EA07575DB1086CF03416E8CE08")
    public int getNightMode() {
        {
            try 
            {
                int var3C287D9906731F02DF673BDD06743A15_1836746326 = (mService.getNightMode());
            } 
            catch (RemoteException e)
            { }
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1409098695 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1409098695;
        
        
            
                
            
                
            
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.602 -0400", hash_original_field = "DF9ADE9656BBECC1AE55D2E833605EF5", hash_generated_field = "42AEB3165E3850F68716AA3C8DD21F5E")

    private static final String TAG = "UiModeManager";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "47DAFC65C6B5A4E9E4DE5C92E6184028", hash_generated_field = "A618402524A4F62B1AEC90708DB85E4F")

    public static String ACTION_ENTER_CAR_MODE = "android.app.action.ENTER_CAR_MODE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "0D50F200031F7037930EF7B00C102DCD", hash_generated_field = "D1C75F61989ABB3CDE4B02448AB2AD42")

    public static String ACTION_EXIT_CAR_MODE = "android.app.action.EXIT_CAR_MODE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "37C77B8A742E1913197F1A3BCD0170CF", hash_generated_field = "E3F23ADBC25ACC014B784BBB3ED89735")

    public static String ACTION_ENTER_DESK_MODE = "android.app.action.ENTER_DESK_MODE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "4C5E384476032224FE4811314BCE583A", hash_generated_field = "E3165410905E198B86B1C6717699B49B")

    public static String ACTION_EXIT_DESK_MODE = "android.app.action.EXIT_DESK_MODE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "D1151118F91E4212473617024EED365F", hash_generated_field = "A1D9AB7CECA1407C5BE4EB516D55B5EC")

    public static final int MODE_NIGHT_AUTO = Configuration.UI_MODE_NIGHT_UNDEFINED >> 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "CE64F002459C0BA3117D27CCBB9135BA", hash_generated_field = "B75E7784F32F2033B89925385DE5345B")

    public static final int MODE_NIGHT_NO = Configuration.UI_MODE_NIGHT_NO >> 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "38792BEA1EDA8DE2684D70A2961FD27C", hash_generated_field = "3931D8B47FB51C2F74C8DDC6A19D3575")

    public static final int MODE_NIGHT_YES = Configuration.UI_MODE_NIGHT_YES >> 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "EE4397CE577B711245AF6EE9C736247B", hash_generated_field = "21526DD4B745D2A0684339F4E92B6778")

    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 0x0001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:20.603 -0400", hash_original_field = "2B66F4DC9990FE7494EE3D7DA554FC54", hash_generated_field = "3102F0ECF4ACF19F31C99EDCA6C607E8")

    public static final int DISABLE_CAR_MODE_GO_HOME = 0x0001;
}

