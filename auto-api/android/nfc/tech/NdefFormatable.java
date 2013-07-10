package android.nfc.tech;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.nfc.ErrorCodes;
import android.nfc.FormatException;
import android.nfc.INfcTag;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

public final class NdefFormatable extends BasicTagTechnology {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.448 -0400", hash_original_method = "074BAD8FDA859E71D091A9807C3BD3AB", hash_generated_method = "25CA3327852ABB990C5F36B5B2E347B5")
    public  NdefFormatable(Tag tag) throws RemoteException {
        super(tag, TagTechnology.NDEF_FORMATABLE);
        addTaint(tag.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    public static NdefFormatable get(Tag tag) {
        if (!tag.hasTech(TagTechnology.NDEF_FORMATABLE)) return null;
        try {
            return new NdefFormatable(tag);
        } catch (RemoteException e) {
            return null;
        }
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.448 -0400", hash_original_method = "6CDCACAEC64FFB65AEDACBA4B44913A4", hash_generated_method = "6C502E51A0F06DA64CEF3D197F447571")
    public void format(NdefMessage firstMessage) throws IOException, FormatException {
        format(firstMessage, false);
        addTaint(firstMessage.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.449 -0400", hash_original_method = "2D5D7133932920FB3E992CFF7D090021", hash_generated_method = "FD04A17CA06CACB14F8E96E3D9CB9338")
    public void formatReadOnly(NdefMessage firstMessage) throws IOException, FormatException {
        format(firstMessage, true);
        addTaint(firstMessage.getTaint());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.449 -0400", hash_original_method = "E299B2177763F767A596EAE082378EB1", hash_generated_method = "845569441F24BC0A38AE988ECFEF11F4")
     void format(NdefMessage firstMessage, boolean makeReadOnly) throws IOException,
            FormatException {
        checkConnected();
        try 
        {
            int serviceHandle = mTag.getServiceHandle();
            INfcTag tagService = mTag.getTagService();
            int errorCode = tagService.formatNdef(serviceHandle, MifareClassic.KEY_DEFAULT);
            
            if (DroidSafeAndroidRuntime.control) throw new IOException();
            
            
            if (DroidSafeAndroidRuntime.control) throw new FormatException();
            
            
            if (DroidSafeAndroidRuntime.control) throw new IOException();
            
            {
                boolean var9E38A8733EA654A0B89FA7D8640BC718_23758378 = (tagService.isNdef(serviceHandle));
                {
                    errorCode = tagService.ndefWrite(serviceHandle, firstMessage);
                    
                    if (DroidSafeAndroidRuntime.control) throw new IOException();
                    
                    
                    if (DroidSafeAndroidRuntime.control) throw new FormatException();
                    
                    
                    if (DroidSafeAndroidRuntime.control) throw new IOException();
                    
                } 
                {
                    if (DroidSafeAndroidRuntime.control) throw new IOException();
                } 
            } 
            {
                errorCode = tagService.ndefMakeReadOnly(serviceHandle);
                
                if (DroidSafeAndroidRuntime.control) throw new IOException();
                
                
                if (DroidSafeAndroidRuntime.control) throw new IOException();
                
                
                if (DroidSafeAndroidRuntime.control) throw new IOException();
                
            } 
        } 
        catch (RemoteException e)
        { }
        addTaint(firstMessage.getTaint());
        addTaint(makeReadOnly);
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:41.450 -0400", hash_original_field = "839E89798F641D78E99C5732B39CA844", hash_generated_field = "BC8F11E4AEAD11E0412B7B53DF0CA6C8")

    private static final String TAG = "NFC";
}

