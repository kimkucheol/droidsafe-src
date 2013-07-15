package com.android.internal.telephony.cdma;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.os.*;
import android.util.Log;
import com.android.internal.telephony.IccConstants;
import com.android.internal.telephony.IccException;
import com.android.internal.telephony.IccFileHandler;
import com.android.internal.telephony.IccFileTypeMismatch;
import com.android.internal.telephony.IccIoResult;
import com.android.internal.telephony.IccUtils;
import com.android.internal.telephony.PhoneProxy;
import java.util.ArrayList;

public final class RuimFileHandler extends IccFileHandler {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.050 -0400", hash_original_method = "CF453B27C96776BB45DA5C39513E79B9", hash_generated_method = "5FD7ADC0DD4EB4164DE52029EA7F7906")
      RuimFileHandler(CDMAPhone phone) {
        super(phone);
        addTaint(phone.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.050 -0400", hash_original_method = "090E1F04EFD80CF69ADD306ED1D79AE5", hash_generated_method = "614D737B8CBDA53A99A22331B445C19D")
    public void dispose() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.051 -0400", hash_original_method = "CF724477DA2C2A9786B4BE9A808F0A43", hash_generated_method = "306A6DED831E1F700C7DE363599E8A4A")
    protected void finalize() {
        Log.d(LOG_TAG, "RuimFileHandler finalized");
        // ---------- Original Method ----------
        //Log.d(LOG_TAG, "RuimFileHandler finalized");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.051 -0400", hash_original_method = "7CD46C2339603E91E870121ED1EC8F59", hash_generated_method = "05E4B928F14BEC77F8949371494400C8")
    @Override
    public void loadEFImgTransparent(int fileid, int highOffset, int lowOffset,
            int length, Message onLoaded) {
        addTaint(onLoaded.getTaint());
        addTaint(length);
        addTaint(lowOffset);
        addTaint(highOffset);
        addTaint(fileid);
        Message response = obtainMessage(EVENT_READ_ICON_DONE, fileid, 0,
                onLoaded);
        phone.mCM.iccIO(COMMAND_GET_RESPONSE, fileid, "img", 0, 0,
                GET_RESPONSE_EF_IMG_SIZE_BYTES, null, null, response);
        // ---------- Original Method ----------
        //Message response = obtainMessage(EVENT_READ_ICON_DONE, fileid, 0,
                //onLoaded);
        //phone.mCM.iccIO(COMMAND_GET_RESPONSE, fileid, "img", 0, 0,
                //GET_RESPONSE_EF_IMG_SIZE_BYTES, null, null, response);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.052 -0400", hash_original_method = "D06C959A971F705A496791A8170E55B9", hash_generated_method = "77C805872CA69F6467EFC5D284BEB40A")
    @Override
    public void handleMessage(Message msg) {
        addTaint(msg.getTaint());
        super.handleMessage(msg);
        // ---------- Original Method ----------
        //super.handleMessage(msg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.052 -0400", hash_original_method = "607B460DC742A6DBDB6C6AB4B03B96A2", hash_generated_method = "5C96137B428013A64AB2571B4635505B")
    protected String getEFPath(int efid) {
        addTaint(efid);
switch(efid){
        case EF_SMS:
        case EF_CST:
        case EF_RUIM_SPN:
String varA39241C94F461998BF062D2228896F50_2042500509 =         MF_SIM + DF_CDMA;
        varA39241C94F461998BF062D2228896F50_2042500509.addTaint(taint);
        return varA39241C94F461998BF062D2228896F50_2042500509;
}String var1CB5B6A61B4429889211CCB6597A0DD8_1011065445 =         getCommonIccEFPath(efid);
        var1CB5B6A61B4429889211CCB6597A0DD8_1011065445.addTaint(taint);
        return var1CB5B6A61B4429889211CCB6597A0DD8_1011065445;
        // ---------- Original Method ----------
        //switch(efid) {
        //case EF_SMS:
        //case EF_CST:
        //case EF_RUIM_SPN:
            //return MF_SIM + DF_CDMA;
        //}
        //return getCommonIccEFPath(efid);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.052 -0400", hash_original_method = "14F2EAD0BAAC0C4A3E4A3932F0B0B9F3", hash_generated_method = "DAEDB3595FD5F4AEECC83808FCFFDA18")
    protected void logd(String msg) {
        addTaint(msg.getTaint());
        Log.d(LOG_TAG, "[RuimFileHandler] " + msg);
        // ---------- Original Method ----------
        //Log.d(LOG_TAG, "[RuimFileHandler] " + msg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.052 -0400", hash_original_method = "6458B63A49DDA09CACB99172BE6F4B0B", hash_generated_method = "225A20AF544E5C4E447675F604DA0459")
    protected void loge(String msg) {
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        //Log.e(LOG_TAG, "[RuimFileHandler] " + msg);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:26.053 -0400", hash_original_field = "951C150E6D062E6AED2C45BB9B756185", hash_generated_field = "37C2AB96DD7CCDC96FF809DAC1A6D712")

    static final String LOG_TAG = "CDMA";
}

