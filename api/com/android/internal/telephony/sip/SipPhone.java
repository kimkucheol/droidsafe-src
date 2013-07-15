package com.android.internal.telephony.sip;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.Context;
import android.media.AudioManager;
import android.net.rtp.AudioGroup;
import android.net.sip.SipAudioCall;
import android.net.sip.SipErrorCode;
import android.net.sip.SipException;
import android.net.sip.SipManager;
import android.net.sip.SipProfile;
import android.net.sip.SipSession;
import android.os.AsyncResult;
import android.os.Message;
import android.telephony.PhoneNumberUtils;
import android.telephony.ServiceState;
import android.text.TextUtils;
import android.util.Log;
import com.android.internal.telephony.Call;
import com.android.internal.telephony.CallStateException;
import com.android.internal.telephony.Connection;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneNotifier;
import java.text.ParseException;
import java.util.List;
import java.util.regex.Pattern;

public class SipPhone extends SipPhoneBase {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.281 -0400", hash_original_field = "43C9EE3B0858C8409700F8BE9A7CDE24", hash_generated_field = "06E85CBF753C72DF06700CA0D6B37C3F")

    private SipCall ringingCall = new SipCall();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.281 -0400", hash_original_field = "924189678017C6A548527B5A9F52A27F", hash_generated_field = "320FA68B59E86E885480BDC328D988A1")

    private SipCall foregroundCall = new SipCall();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.281 -0400", hash_original_field = "ACF2C40F82F49E1E79919E82F6B27E7B", hash_generated_field = "E67497BDFFD17E2A0DB124112854785A")

    private SipCall backgroundCall = new SipCall();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.281 -0400", hash_original_field = "80F32E3FB2E35C029C679D5FD2362781", hash_generated_field = "E80E46E58FFD30634B7E3BE2973B3395")

    private SipManager mSipManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.281 -0400", hash_original_field = "7DEA788680409024329A69AD3554F7DD", hash_generated_field = "7EAF540B0EC7BBB66B1BAC42709185BB")

    private SipProfile mProfile;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.282 -0400", hash_original_method = "6A0F0B835E49D28418FC90D67BF66C10", hash_generated_method = "D5DDDC0CF4C43278719548C57E908252")
      SipPhone(Context context, PhoneNotifier notifier, SipProfile profile) {
        super(context, notifier);
        addTaint(notifier.getTaint());
    if(DEBUG)        
        Log.d(LOG_TAG, "new SipPhone: " + profile.getUriString());
        ringingCall = new SipCall();
        foregroundCall = new SipCall();
        backgroundCall = new SipCall();
        mProfile = profile;
        mSipManager = SipManager.newInstance(context);
        // ---------- Original Method ----------
        //if (DEBUG) Log.d(LOG_TAG, "new SipPhone: " + profile.getUriString());
        //ringingCall = new SipCall();
        //foregroundCall = new SipCall();
        //backgroundCall = new SipCall();
        //mProfile = profile;
        //mSipManager = SipManager.newInstance(context);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.282 -0400", hash_original_method = "0022E344F588A86EC51D8DF12CB4CABD", hash_generated_method = "A36F0A5B53169A94D6ABA9258B1D141E")
    @Override
    public boolean equals(Object o) {
        addTaint(o.getTaint());
    if(o == this)        
        {
        boolean varB326B5062B2F0E69046810717534CB09_706763152 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2110282091 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2110282091;
        }
    if(!(o instanceof SipPhone))        
        {
        boolean var68934A3E9455FA72420237EB05902327_1576416803 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_492010060 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_492010060;
        }
        SipPhone that = (SipPhone) o;
        boolean varD10DADDA66717E900492D60F11028A2D_1841331916 = (mProfile.getUriString().equals(that.mProfile.getUriString()));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1475523386 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1475523386;
        // ---------- Original Method ----------
        //if (o == this) return true;
        //if (!(o instanceof SipPhone)) return false;
        //SipPhone that = (SipPhone) o;
        //return mProfile.getUriString().equals(that.mProfile.getUriString());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.282 -0400", hash_original_method = "87B6F28FD5B3DEC2F08CA48119477808", hash_generated_method = "34C06F3EB27394042110D2D1D06D902B")
    public String getPhoneName() {
String var6A5C9EEFE4826F4ED879E217DE789C50_720801966 =         "SIP:" + getUriString(mProfile);
        var6A5C9EEFE4826F4ED879E217DE789C50_720801966.addTaint(taint);
        return var6A5C9EEFE4826F4ED879E217DE789C50_720801966;
        // ---------- Original Method ----------
        //return "SIP:" + getUriString(mProfile);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.283 -0400", hash_original_method = "AD1E8A0332F840602A7373ACA5D5D1A0", hash_generated_method = "817B5603E939BDF13961C7F6656493D5")
    public String getSipUri() {
String var5B597DAB813570AFFE63525C92A1D842_6903049 =         mProfile.getUriString();
        var5B597DAB813570AFFE63525C92A1D842_6903049.addTaint(taint);
        return var5B597DAB813570AFFE63525C92A1D842_6903049;
        // ---------- Original Method ----------
        //return mProfile.getUriString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.283 -0400", hash_original_method = "D3C5F9763476A8D0E8037A369F8C496C", hash_generated_method = "1B2CCC5580D0D214F772B4987DD44B68")
    public boolean equals(SipPhone phone) {
        addTaint(phone.getTaint());
        boolean var42A2A04A7A485FBE5AA711D06FEE6E94_1852453578 = (getSipUri().equals(phone.getSipUri()));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1248831682 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1248831682;
        // ---------- Original Method ----------
        //return getSipUri().equals(phone.getSipUri());
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.283 -0400", hash_original_method = "520B082FC4D55C78B63B25D36AD6E406", hash_generated_method = "C05CACB539A48A78AC925C5812A75245")
    public boolean canTake(Object incomingCall) {
        addTaint(incomingCall.getTaint());
        synchronized
(SipPhone.class)        {
    if(!(incomingCall instanceof SipAudioCall))            
            {
            boolean var68934A3E9455FA72420237EB05902327_151815391 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1786798086 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1786798086;
            }
    if(ringingCall.getState().isAlive())            
            {
            boolean var68934A3E9455FA72420237EB05902327_29990529 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_264600493 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_264600493;
            }
    if(foregroundCall.getState().isAlive()
                    && backgroundCall.getState().isAlive())            
            {
                boolean var68934A3E9455FA72420237EB05902327_258875849 = (false);
                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1781826513 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_1781826513;
            } //End block
            try 
            {
                SipAudioCall sipAudioCall = (SipAudioCall) incomingCall;
    if(DEBUG)                
                Log.d(LOG_TAG, "+++ taking call from: "
                        + sipAudioCall.getPeerProfile().getUriString());
                String localUri = sipAudioCall.getLocalProfile().getUriString();
    if(localUri.equals(mProfile.getUriString()))                
                {
                    boolean makeCallWait = foregroundCall.getState().isAlive();
                    ringingCall.initIncomingCall(sipAudioCall, makeCallWait);
    if(sipAudioCall.getState()
                            != SipSession.State.INCOMING_CALL)                    
                    {
    if(DEBUG)                        
                        Log.d(LOG_TAG, "    call cancelled !!");
                        ringingCall.reset();
                    } //End block
                    boolean varB326B5062B2F0E69046810717534CB09_236186934 = (true);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_65068764 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_65068764;
                } //End block
            } //End block
            catch (Exception e)
            {
                ringingCall.reset();
            } //End block
            boolean var68934A3E9455FA72420237EB05902327_1715922071 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1776781959 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1776781959;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.284 -0400", hash_original_method = "4D3FC14BD1B17CB217053014BC4D74B6", hash_generated_method = "A4ED68E8744DCC8C0D80CE2D74241BCD")
    public void acceptCall() throws CallStateException {
        synchronized
(SipPhone.class)        {
    if((ringingCall.getState() == Call.State.INCOMING) ||
                    (ringingCall.getState() == Call.State.WAITING))            
            {
    if(DEBUG)                
                Log.d(LOG_TAG, "acceptCall");
                ringingCall.setMute(false);
                ringingCall.acceptCall();
            } //End block
            else
            {
                CallStateException var566A6D1258D88782F935EBCAFFB89CEC_1250233056 = new CallStateException("phone not ringing");
                var566A6D1258D88782F935EBCAFFB89CEC_1250233056.addTaint(taint);
                throw var566A6D1258D88782F935EBCAFFB89CEC_1250233056;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //if ((ringingCall.getState() == Call.State.INCOMING) ||
                    //(ringingCall.getState() == Call.State.WAITING)) {
                //if (DEBUG) Log.d(LOG_TAG, "acceptCall");
                //ringingCall.setMute(false);
                //ringingCall.acceptCall();
            //} else {
                //throw new CallStateException("phone not ringing");
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.284 -0400", hash_original_method = "F60D4B1A0C339762A597DB11EC122CEA", hash_generated_method = "ED96B8C75AC12EB2B25D9B1E31A370FB")
    public void rejectCall() throws CallStateException {
        synchronized
(SipPhone.class)        {
    if(ringingCall.getState().isRinging())            
            {
    if(DEBUG)                
                Log.d(LOG_TAG, "rejectCall");
                ringingCall.rejectCall();
            } //End block
            else
            {
                CallStateException var566A6D1258D88782F935EBCAFFB89CEC_707003913 = new CallStateException("phone not ringing");
                var566A6D1258D88782F935EBCAFFB89CEC_707003913.addTaint(taint);
                throw var566A6D1258D88782F935EBCAFFB89CEC_707003913;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //if (ringingCall.getState().isRinging()) {
                //if (DEBUG) Log.d(LOG_TAG, "rejectCall");
                //ringingCall.rejectCall();
            //} else {
                //throw new CallStateException("phone not ringing");
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.285 -0400", hash_original_method = "01C657A55270F6B259EE4CA2295CF206", hash_generated_method = "FB0661EEBEF9A1A25B640FCCAA458DE1")
    public Connection dial(String dialString) throws CallStateException {
        addTaint(dialString.getTaint());
        synchronized
(SipPhone.class)        {
Connection var694671D8817FC8AB97C4477003C1C73F_1212077997 =             dialInternal(dialString);
            var694671D8817FC8AB97C4477003C1C73F_1212077997.addTaint(taint);
            return var694671D8817FC8AB97C4477003C1C73F_1212077997;
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //return dialInternal(dialString);
        //}
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.285 -0400", hash_original_method = "E69019A31CF45F3F0FFB8952555ADD38", hash_generated_method = "48A905ECA0E946D08BDB9D61AEF44943")
    private Connection dialInternal(String dialString) throws CallStateException {
        addTaint(dialString.getTaint());
        clearDisconnected();
    if(!canDial())        
        {
            CallStateException var9E415163F1883D794EA7CDA9658E5AEC_661620331 = new CallStateException("cannot dial in current state");
            var9E415163F1883D794EA7CDA9658E5AEC_661620331.addTaint(taint);
            throw var9E415163F1883D794EA7CDA9658E5AEC_661620331;
        } //End block
    if(foregroundCall.getState() == SipCall.State.ACTIVE)        
        {
            switchHoldingAndActive();
        } //End block
    if(foregroundCall.getState() != SipCall.State.IDLE)        
        {
            CallStateException var9E415163F1883D794EA7CDA9658E5AEC_666851990 = new CallStateException("cannot dial in current state");
            var9E415163F1883D794EA7CDA9658E5AEC_666851990.addTaint(taint);
            throw var9E415163F1883D794EA7CDA9658E5AEC_666851990;
        } //End block
        foregroundCall.setMute(false);
        try 
        {
            Connection c = foregroundCall.dial(dialString);
Connection var807FB10045EE51C06BDB74744A6714DF_1895645199 =             c;
            var807FB10045EE51C06BDB74744A6714DF_1895645199.addTaint(taint);
            return var807FB10045EE51C06BDB74744A6714DF_1895645199;
        } //End block
        catch (SipException e)
        {
            CallStateException varF8FACE0C7C180EC960D10782CC2727FC_1367904698 = new CallStateException("dial error: " + e);
            varF8FACE0C7C180EC960D10782CC2727FC_1367904698.addTaint(taint);
            throw varF8FACE0C7C180EC960D10782CC2727FC_1367904698;
        } //End block
        // ---------- Original Method ----------
        //clearDisconnected();
        //if (!canDial()) {
            //throw new CallStateException("cannot dial in current state");
        //}
        //if (foregroundCall.getState() == SipCall.State.ACTIVE) {
            //switchHoldingAndActive();
        //}
        //if (foregroundCall.getState() != SipCall.State.IDLE) {
            //throw new CallStateException("cannot dial in current state");
        //}
        //foregroundCall.setMute(false);
        //try {
            //Connection c = foregroundCall.dial(dialString);
            //return c;
        //} catch (SipException e) {
            //Log.e(LOG_TAG, "dial()", e);
            //throw new CallStateException("dial error: " + e);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.286 -0400", hash_original_method = "04453A8FBCEE87A03C8D7EC224934C23", hash_generated_method = "5AD36E17C95655A8E657320FF91A1539")
    public void switchHoldingAndActive() throws CallStateException {
    if(DEBUG)        
        Log.d(LOG_TAG, " ~~~~~~  switch fg and bg");
        synchronized
(SipPhone.class)        {
            foregroundCall.switchWith(backgroundCall);
    if(backgroundCall.getState().isAlive())            
            backgroundCall.hold();
    if(foregroundCall.getState().isAlive())            
            foregroundCall.unhold();
        } //End block
        // ---------- Original Method ----------
        //if (DEBUG) Log.d(LOG_TAG, " ~~~~~~  switch fg and bg");
        //synchronized (SipPhone.class) {
            //foregroundCall.switchWith(backgroundCall);
            //if (backgroundCall.getState().isAlive()) backgroundCall.hold();
            //if (foregroundCall.getState().isAlive()) foregroundCall.unhold();
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.286 -0400", hash_original_method = "EF99002349D3FD6EFA7BC51A1FE3E619", hash_generated_method = "3E0C29BC00031BA0D90B4F4BBF3BE42A")
    public boolean canConference() {
        boolean varB326B5062B2F0E69046810717534CB09_1374162617 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_392592294 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_392592294;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.287 -0400", hash_original_method = "5DC11CA56E4A18B2CAABC2999FA181D0", hash_generated_method = "C11D30CB5A50D2A319A28BE27B1794AF")
    public void conference() throws CallStateException {
        synchronized
(SipPhone.class)        {
    if((foregroundCall.getState() != SipCall.State.ACTIVE)
                    || (foregroundCall.getState() != SipCall.State.ACTIVE))            
            {
                CallStateException var4E2AF81360572034B1BEF88A10D6E377_1758031356 = new CallStateException("wrong state to merge calls: fg="
                        + foregroundCall.getState() + ", bg="
                        + backgroundCall.getState());
                var4E2AF81360572034B1BEF88A10D6E377_1758031356.addTaint(taint);
                throw var4E2AF81360572034B1BEF88A10D6E377_1758031356;
            } //End block
            foregroundCall.merge(backgroundCall);
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //if ((foregroundCall.getState() != SipCall.State.ACTIVE)
                    //|| (foregroundCall.getState() != SipCall.State.ACTIVE)) {
                //throw new CallStateException("wrong state to merge calls: fg="
                        //+ foregroundCall.getState() + ", bg="
                        //+ backgroundCall.getState());
            //}
            //foregroundCall.merge(backgroundCall);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.287 -0400", hash_original_method = "0BA61BE71F93F0627212F9F9B5CF61C9", hash_generated_method = "328CF99C03C2D28AD1A549F07A78B6A1")
    public void conference(Call that) throws CallStateException {
        addTaint(that.getTaint());
        synchronized
(SipPhone.class)        {
    if(!(that instanceof SipCall))            
            {
                CallStateException var58EF94BDF8FB3FF670A7AD4AA19A034F_1971656466 = new CallStateException("expect " + SipCall.class
                        + ", cannot merge with " + that.getClass());
                var58EF94BDF8FB3FF670A7AD4AA19A034F_1971656466.addTaint(taint);
                throw var58EF94BDF8FB3FF670A7AD4AA19A034F_1971656466;
            } //End block
            foregroundCall.merge((SipCall) that);
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //if (!(that instanceof SipCall)) {
                //throw new CallStateException("expect " + SipCall.class
                        //+ ", cannot merge with " + that.getClass());
            //}
            //foregroundCall.merge((SipCall) that);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.287 -0400", hash_original_method = "FB85D9DE1C816CCA93C5FDAD3D9D0A31", hash_generated_method = "8394F6F5B5765C512284497D4A09E7A1")
    public boolean canTransfer() {
        boolean var68934A3E9455FA72420237EB05902327_1235062370 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1237323027 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1237323027;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.287 -0400", hash_original_method = "6F3E620B44779BFD9D290EDD6A721C13", hash_generated_method = "1802EA65B8D1F27F1F2A77F464C12952")
    public void explicitCallTransfer() throws CallStateException {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.288 -0400", hash_original_method = "D9CD8A34486E399CFA818246637B2970", hash_generated_method = "D579655C46B94D811B6E1ACFA1D2CE03")
    public void clearDisconnected() {
        synchronized
(SipPhone.class)        {
            ringingCall.clearDisconnected();
            foregroundCall.clearDisconnected();
            backgroundCall.clearDisconnected();
            updatePhoneState();
            notifyPreciseCallStateChanged();
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //ringingCall.clearDisconnected();
            //foregroundCall.clearDisconnected();
            //backgroundCall.clearDisconnected();
            //updatePhoneState();
            //notifyPreciseCallStateChanged();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.288 -0400", hash_original_method = "D682F8DE86633D8037AE8DB7A99E0997", hash_generated_method = "04FE0508B05A7FF3D00A5B009618A0B7")
    public void sendDtmf(char c) {
        addTaint(c);
    if(!PhoneNumberUtils.is12Key(c))        
        {
        } //End block
        else
    if(foregroundCall.getState().isAlive())        
        {
            synchronized
(SipPhone.class)            {
                foregroundCall.sendDtmf(c);
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (!PhoneNumberUtils.is12Key(c)) {
            //Log.e(LOG_TAG,
                    //"sendDtmf called with invalid character '" + c + "'");
        //} else if (foregroundCall.getState().isAlive()) {
            //synchronized (SipPhone.class) {
                //foregroundCall.sendDtmf(c);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.289 -0400", hash_original_method = "C805BAC519448AC91DEA3466C2A972EF", hash_generated_method = "A1B9931361E435C7C5E501910C19DE31")
    public void startDtmf(char c) {
        addTaint(c);
    if(!PhoneNumberUtils.is12Key(c))        
        {
        } //End block
        else
        {
            sendDtmf(c);
        } //End block
        // ---------- Original Method ----------
        //if (!PhoneNumberUtils.is12Key(c)) {
            //Log.e(LOG_TAG,
                //"startDtmf called with invalid character '" + c + "'");
        //} else {
            //sendDtmf(c);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.289 -0400", hash_original_method = "1D5D5FD426DB2358E4E86A174C44532E", hash_generated_method = "28A2AD6EB5F0534AB0CED744A3051E3F")
    public void stopDtmf() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.289 -0400", hash_original_method = "9189F1384120EC6E17589215617F3507", hash_generated_method = "FC98764535C47C26D37CAD332C70ED81")
    public void sendBurstDtmf(String dtmfString) {
        addTaint(dtmfString.getTaint());
        // ---------- Original Method ----------
        //Log.e(LOG_TAG, "[SipPhone] sendBurstDtmf() is a CDMA method");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.289 -0400", hash_original_method = "0D09CB6308056457AD1772B2CC5B82FC", hash_generated_method = "A36A3C126730691AFCF80FCF79707CB2")
    public void getOutgoingCallerIdDisplay(Message onComplete) {
        addTaint(onComplete.getTaint());
        AsyncResult.forMessage(onComplete, null, null);
        onComplete.sendToTarget();
        // ---------- Original Method ----------
        //AsyncResult.forMessage(onComplete, null, null);
        //onComplete.sendToTarget();
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.290 -0400", hash_original_method = "56612EF91DCB9A3808F62E57BF0F81E1", hash_generated_method = "0B5325FCB4DFB9A95BD43EF313C418F9")
    public void setOutgoingCallerIdDisplay(int commandInterfaceCLIRMode,
                                           Message onComplete) {
        addTaint(onComplete.getTaint());
        addTaint(commandInterfaceCLIRMode);
        AsyncResult.forMessage(onComplete, null, null);
        onComplete.sendToTarget();
        // ---------- Original Method ----------
        //AsyncResult.forMessage(onComplete, null, null);
        //onComplete.sendToTarget();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.290 -0400", hash_original_method = "14E36FB03F40D4635F36E46C38B086BD", hash_generated_method = "6ED5C276E9CEE48168724CCC607FBBB3")
    public void getCallWaiting(Message onComplete) {
        addTaint(onComplete.getTaint());
        AsyncResult.forMessage(onComplete, null, null);
        onComplete.sendToTarget();
        // ---------- Original Method ----------
        //AsyncResult.forMessage(onComplete, null, null);
        //onComplete.sendToTarget();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.290 -0400", hash_original_method = "80F9B6F2C3F4CA6200C97C4377273E17", hash_generated_method = "EFB13488907DFB7E9B7AC218EB76AF66")
    public void setCallWaiting(boolean enable, Message onComplete) {
        addTaint(onComplete.getTaint());
        addTaint(enable);
        // ---------- Original Method ----------
        //Log.e(LOG_TAG, "call waiting not supported");
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.290 -0400", hash_original_method = "6F81D9304F797B487FC34D43FAF41E44", hash_generated_method = "2BC0C3270970B7FF1361347BA4A8A3AD")
    @Override
    public void setEchoSuppressionEnabled(boolean enabled) {
        addTaint(enabled);
        synchronized
(SipPhone.class)        {
            foregroundCall.setAudioGroupMode();
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //foregroundCall.setAudioGroupMode();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.291 -0400", hash_original_method = "79AC444E8066EFF34D5F76D19E8CCACC", hash_generated_method = "217F67A8E830DD9FE3EA25863FC96703")
    public void setMute(boolean muted) {
        addTaint(muted);
        synchronized
(SipPhone.class)        {
            foregroundCall.setMute(muted);
        } //End block
        // ---------- Original Method ----------
        //synchronized (SipPhone.class) {
            //foregroundCall.setMute(muted);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.291 -0400", hash_original_method = "8292EC8FC0222DDB10381F21089BC299", hash_generated_method = "74D124E6884514A08409FDECE2C36FAF")
    public boolean getMute() {
        boolean var36607C5F1F9E9ECD6DBCFF87063FFB3E_1163389153 = ((foregroundCall.getState().isAlive()
                ? foregroundCall.getMute()
                : backgroundCall.getMute()));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2010966007 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2010966007;
        // ---------- Original Method ----------
        //return (foregroundCall.getState().isAlive()
                //? foregroundCall.getMute()
                //: backgroundCall.getMute());
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.291 -0400", hash_original_method = "9DE1B547D23B96DA44E5E5850535D15C", hash_generated_method = "23E7A7A962139BE009154C5C6A97C5AF")
    public Call getForegroundCall() {
Call var965AAA6C63B5593A04BC8CA8680802E9_1124493211 =         foregroundCall;
        var965AAA6C63B5593A04BC8CA8680802E9_1124493211.addTaint(taint);
        return var965AAA6C63B5593A04BC8CA8680802E9_1124493211;
        // ---------- Original Method ----------
        //return foregroundCall;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.291 -0400", hash_original_method = "EADE59B65D242AA2A5BCB126522780FD", hash_generated_method = "77C5161B9BB53441EA30B709762751AD")
    public Call getBackgroundCall() {
Call varE08AC601BED6464B9026E4A4A60006D8_1288147679 =         backgroundCall;
        varE08AC601BED6464B9026E4A4A60006D8_1288147679.addTaint(taint);
        return varE08AC601BED6464B9026E4A4A60006D8_1288147679;
        // ---------- Original Method ----------
        //return backgroundCall;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.291 -0400", hash_original_method = "3A1E9C8D795C10065E3EA9FCAA0EB60D", hash_generated_method = "7440CC3DD64233154BF38A35A51C2463")
    public Call getRingingCall() {
Call var9E58E5188580C8A6042FBB5C7C25ACA3_697179539 =         ringingCall;
        var9E58E5188580C8A6042FBB5C7C25ACA3_697179539.addTaint(taint);
        return var9E58E5188580C8A6042FBB5C7C25ACA3_697179539;
        // ---------- Original Method ----------
        //return ringingCall;
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.292 -0400", hash_original_method = "88DBA8231EA7F3BE9C495A0C37514173", hash_generated_method = "DBE32389BF8B0E4DDACE5A2DBAC2DF95")
    public ServiceState getServiceState() {
ServiceState varDCB27AB651CEEBCEFA739B0266B45076_1788946355 =         super.getServiceState();
        varDCB27AB651CEEBCEFA739B0266B45076_1788946355.addTaint(taint);
        return varDCB27AB651CEEBCEFA739B0266B45076_1788946355;
        // ---------- Original Method ----------
        //return super.getServiceState();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.292 -0400", hash_original_method = "AE09BA0335289F025B1DDE67D4558A7A", hash_generated_method = "183D1B018296C60F1B82B51591711809")
    private String getUriString(SipProfile p) {
        addTaint(p.getTaint());
String var91BE15758E86E5C0C84F2B903DE486EF_952282246 =         p.getUserName() + "@" + getSipDomain(p);
        var91BE15758E86E5C0C84F2B903DE486EF_952282246.addTaint(taint);
        return var91BE15758E86E5C0C84F2B903DE486EF_952282246;
        // ---------- Original Method ----------
        //return p.getUserName() + "@" + getSipDomain(p);
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.292 -0400", hash_original_method = "CF1C8708B65050BDE73A571BB1592129", hash_generated_method = "C714B0B1636E024976DA7E173D4D695B")
    private String getSipDomain(SipProfile p) {
        addTaint(p.getTaint());
        String domain = p.getSipDomain();
    if(domain.endsWith(":5060"))        
        {
String var13B408A4878BDFF2F59BC7F05CA0F5DA_1814624307 =             domain.substring(0, domain.length() - 5);
            var13B408A4878BDFF2F59BC7F05CA0F5DA_1814624307.addTaint(taint);
            return var13B408A4878BDFF2F59BC7F05CA0F5DA_1814624307;
        } //End block
        else
        {
String var8A4E963202E7AC4C580226B1D8FE2032_416974727 =             domain;
            var8A4E963202E7AC4C580226B1D8FE2032_416974727.addTaint(taint);
            return var8A4E963202E7AC4C580226B1D8FE2032_416974727;
        } //End block
        // ---------- Original Method ----------
        //String domain = p.getSipDomain();
        //if (domain.endsWith(":5060")) {
            //return domain.substring(0, domain.length() - 5);
        //} else {
            //return domain;
        //}
    }

    
        private static Call.State getCallStateFrom(SipAudioCall sipAudioCall) {
        if (sipAudioCall.isOnHold()) return Call.State.HOLDING;
        int sessionState = sipAudioCall.getState();
        switch (sessionState) {
            case SipSession.State.READY_TO_CALL:            return Call.State.IDLE;
            case SipSession.State.INCOMING_CALL:
            case SipSession.State.INCOMING_CALL_ANSWERING:  return Call.State.INCOMING;
            case SipSession.State.OUTGOING_CALL:            return Call.State.DIALING;
            case SipSession.State.OUTGOING_CALL_RING_BACK:  return Call.State.ALERTING;
            case SipSession.State.OUTGOING_CALL_CANCELING:  return Call.State.DISCONNECTING;
            case SipSession.State.IN_CALL:                  return Call.State.ACTIVE;
            default:
                Log.w(LOG_TAG, "illegal connection state: " + sessionState);
                return Call.State.DISCONNECTED;
        }
    }

    
    private class SipCall extends SipCallBase {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.293 -0400", hash_original_method = "00F055312A0CF21C4F0B5574B16ECF8F", hash_generated_method = "00F055312A0CF21C4F0B5574B16ECF8F")
        public SipCall ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.293 -0400", hash_original_method = "077C3D2ABFDDE04A697972D273B811AD", hash_generated_method = "AFC116FB336DFDAE16FA5C7A5CE7B964")
         void reset() {
            connections.clear();
            setState(Call.State.IDLE);
            // ---------- Original Method ----------
            //connections.clear();
            //setState(Call.State.IDLE);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.293 -0400", hash_original_method = "375D19E8671ADDF3312252661F52306D", hash_generated_method = "3976FBC0447E7DC777B51E94CA8F8D02")
         void switchWith(SipCall that) {
            addTaint(that.getTaint());
            synchronized
(SipPhone.class)            {
                SipCall tmp = new SipCall();
                tmp.takeOver(this);
                this.takeOver(that);
                that.takeOver(tmp);
            } //End block
            // ---------- Original Method ----------
            //synchronized (SipPhone.class) {
                //SipCall tmp = new SipCall();
                //tmp.takeOver(this);
                //this.takeOver(that);
                //that.takeOver(tmp);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.298 -0400", hash_original_method = "1E912254ED378DFE25D6B6FABA0CA461", hash_generated_method = "C08ECA8A2A0A6583DE323479E7C9F532")
        private void takeOver(SipCall that) {
            addTaint(that.getTaint());
            connections = that.connections;
            state = that.state;
for(Connection c : connections)
            {
                ((SipConnection) c).changeOwner(this);
            } //End block
            // ---------- Original Method ----------
            //connections = that.connections;
            //state = that.state;
            //for (Connection c : connections) {
                //((SipConnection) c).changeOwner(this);
            //}
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.299 -0400", hash_original_method = "BB25C6B7E2DC41EA59445495652EDD92", hash_generated_method = "F468AF4A49FBCEC2737AA2B7AD82FA70")
        @Override
        public Phone getPhone() {
Phone var09CC006EC348D98EBFB275C7D31607EA_1819856217 =             SipPhone.this;
            var09CC006EC348D98EBFB275C7D31607EA_1819856217.addTaint(taint);
            return var09CC006EC348D98EBFB275C7D31607EA_1819856217;
            // ---------- Original Method ----------
            //return SipPhone.this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.299 -0400", hash_original_method = "B38C364E01AF490301B03DAE11EB1509", hash_generated_method = "8CC4629F11D6F43C3676CC0C1EEBE074")
        @Override
        public List<Connection> getConnections() {
            synchronized
(SipPhone.class)            {
List<Connection> varD8B91E18CFFE05D77A84C03EDA812BE2_1866599065 =                 connections;
                varD8B91E18CFFE05D77A84C03EDA812BE2_1866599065.addTaint(taint);
                return varD8B91E18CFFE05D77A84C03EDA812BE2_1866599065;
            } //End block
            // ---------- Original Method ----------
            //synchronized (SipPhone.class) {
                //return connections;
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.300 -0400", hash_original_method = "B9E3A4EF80D99D71D1AE567F3438F945", hash_generated_method = "E693A31EA8CC7EEA5EC976C41CFEF07A")
         Connection dial(String originalNumber) throws SipException {
            addTaint(originalNumber.getTaint());
            String calleeSipUri = originalNumber;
    if(!calleeSipUri.contains("@"))            
            {
                String replaceStr = Pattern.quote(mProfile.getUserName() + "@");
                calleeSipUri = mProfile.getUriString().replaceFirst(replaceStr,
                        calleeSipUri + "@");
            } //End block
            try 
            {
                SipProfile callee = new SipProfile.Builder(calleeSipUri).build();
                SipConnection c = new SipConnection(this, callee,
                        originalNumber);
                c.dial();
                connections.add(c);
                setState(Call.State.DIALING);
Connection var807FB10045EE51C06BDB74744A6714DF_1762363046 =                 c;
                var807FB10045EE51C06BDB74744A6714DF_1762363046.addTaint(taint);
                return var807FB10045EE51C06BDB74744A6714DF_1762363046;
            } //End block
            catch (ParseException e)
            {
                SipException varE794DC4422C35EAFD64D7852049D6A86_783133688 = new SipException("dial", e);
                varE794DC4422C35EAFD64D7852049D6A86_783133688.addTaint(taint);
                throw varE794DC4422C35EAFD64D7852049D6A86_783133688;
            } //End block
            // ---------- Original Method ----------
            //String calleeSipUri = originalNumber;
            //if (!calleeSipUri.contains("@")) {
                //String replaceStr = Pattern.quote(mProfile.getUserName() + "@");
                //calleeSipUri = mProfile.getUriString().replaceFirst(replaceStr,
                        //calleeSipUri + "@");
            //}
            //try {
                //SipProfile callee =
                        //new SipProfile.Builder(calleeSipUri).build();
                //SipConnection c = new SipConnection(this, callee,
                        //originalNumber);
                //c.dial();
                //connections.add(c);
                //setState(Call.State.DIALING);
                //return c;
            //} catch (ParseException e) {
                //throw new SipException("dial", e);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.300 -0400", hash_original_method = "F3785C840BD99E8D755659453D00493E", hash_generated_method = "5591938EF6EED552571674A7B6BA2631")
        @Override
        public void hangup() throws CallStateException {
            synchronized
(SipPhone.class)            {
    if(state.isAlive())                
                {
    if(DEBUG)                    
                    Log.d(LOG_TAG, "hang up call: " + getState()
                            + ": " + this + " on phone " + getPhone());
                    setState(State.DISCONNECTING);
                    CallStateException excp = null;
for(Connection c : connections)
                    {
                        try 
                        {
                            c.hangup();
                        } //End block
                        catch (CallStateException e)
                        {
                            excp = e;
                        } //End block
                    } //End block
    if(excp != null)                    
                    {
                    excp.addTaint(taint);
                    throw excp;
                    }
                } //End block
                else
                {
    if(DEBUG)                    
                    Log.d(LOG_TAG, "hang up dead call: " + getState()
                            + ": " + this + " on phone " + getPhone());
                } //End block
            } //End block
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.301 -0400", hash_original_method = "03E5A9484BF2B2B8056B6450938A40D7", hash_generated_method = "53BB81786E39FBA768F51BC489D3E96F")
         void initIncomingCall(SipAudioCall sipAudioCall, boolean makeCallWait) {
            addTaint(makeCallWait);
            addTaint(sipAudioCall.getTaint());
            SipProfile callee = sipAudioCall.getPeerProfile();
            SipConnection c = new SipConnection(this, callee);
            connections.add(c);
            Call.State newState = makeCallWait ? State.WAITING : State.INCOMING;
            c.initIncomingCall(sipAudioCall, newState);
            setState(newState);
            notifyNewRingingConnectionP(c);
            // ---------- Original Method ----------
            //SipProfile callee = sipAudioCall.getPeerProfile();
            //SipConnection c = new SipConnection(this, callee);
            //connections.add(c);
            //Call.State newState = makeCallWait ? State.WAITING : State.INCOMING;
            //c.initIncomingCall(sipAudioCall, newState);
            //setState(newState);
            //notifyNewRingingConnectionP(c);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.301 -0400", hash_original_method = "F8072C3AD3C86AEC184FDD0C13B73AA0", hash_generated_method = "D7F0174B5C634AAAD4965899108AA01C")
         void rejectCall() throws CallStateException {
            hangup();
            // ---------- Original Method ----------
            //hangup();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.302 -0400", hash_original_method = "B2C3B5FE3154049893EC854E60F79D8F", hash_generated_method = "FCC5318ECC8B2F4AB81C0404E3B6930D")
         void acceptCall() throws CallStateException {
    if(this != ringingCall)            
            {
                CallStateException varB78527D07FAE791C6E3DA5978F4BF1B0_1188054717 = new CallStateException("acceptCall() in a non-ringing call");
                varB78527D07FAE791C6E3DA5978F4BF1B0_1188054717.addTaint(taint);
                throw varB78527D07FAE791C6E3DA5978F4BF1B0_1188054717;
            } //End block
    if(connections.size() != 1)            
            {
                CallStateException var383EF0AFF32F48F2256F098CADB35820_1091679215 = new CallStateException("acceptCall() in a conf call");
                var383EF0AFF32F48F2256F098CADB35820_1091679215.addTaint(taint);
                throw var383EF0AFF32F48F2256F098CADB35820_1091679215;
            } //End block
            ((SipConnection) connections.get(0)).acceptCall();
            // ---------- Original Method ----------
            //if (this != ringingCall) {
                //throw new CallStateException("acceptCall() in a non-ringing call");
            //}
            //if (connections.size() != 1) {
                //throw new CallStateException("acceptCall() in a conf call");
            //}
            //((SipConnection) connections.get(0)).acceptCall();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.302 -0400", hash_original_method = "1B6C9A8A7DE7A949D0CD2E188D6FBBDC", hash_generated_method = "33E650E305A906E22F1ADB987DDE8AAC")
        private boolean isSpeakerOn() {
            boolean var9BB50CD7BB4AB0FC000065D8352B984F_1035332104 = (((AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE))
                    .isSpeakerphoneOn());
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1690846007 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1690846007;
            // ---------- Original Method ----------
            //return ((AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE))
                    //.isSpeakerphoneOn();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.302 -0400", hash_original_method = "AEEC2C5B8263135991756BF729F3B501", hash_generated_method = "35F484CF0BE1B1E01DDB7A94FE2D6084")
         void setAudioGroupMode() {
            AudioGroup audioGroup = getAudioGroup();
    if(audioGroup == null)            
            return;
            int mode = audioGroup.getMode();
    if(state == State.HOLDING)            
            {
                audioGroup.setMode(AudioGroup.MODE_ON_HOLD);
            } //End block
            else
    if(getMute())            
            {
                audioGroup.setMode(AudioGroup.MODE_MUTED);
            } //End block
            else
    if(isSpeakerOn())            
            {
                audioGroup.setMode(AudioGroup.MODE_ECHO_SUPPRESSION);
            } //End block
            else
            {
                audioGroup.setMode(AudioGroup.MODE_NORMAL);
            } //End block
    if(DEBUG)            
            Log.d(LOG_TAG, String.format(
                    "audioGroup mode change: %d --> %d", mode,
                    audioGroup.getMode()));
            // ---------- Original Method ----------
            //AudioGroup audioGroup = getAudioGroup();
            //if (audioGroup == null) return;
            //int mode = audioGroup.getMode();
            //if (state == State.HOLDING) {
                //audioGroup.setMode(AudioGroup.MODE_ON_HOLD);
            //} else if (getMute()) {
                //audioGroup.setMode(AudioGroup.MODE_MUTED);
            //} else if (isSpeakerOn()) {
                //audioGroup.setMode(AudioGroup.MODE_ECHO_SUPPRESSION);
            //} else {
                //audioGroup.setMode(AudioGroup.MODE_NORMAL);
            //}
            //if (DEBUG) Log.d(LOG_TAG, String.format(
                    //"audioGroup mode change: %d --> %d", mode,
                    //audioGroup.getMode()));
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.303 -0400", hash_original_method = "A3EB25D5FFDA71466ECC0EEF32C97EE3", hash_generated_method = "2E677EB72D04E9D3ACA13FF67012686A")
         void hold() throws CallStateException {
            setState(State.HOLDING);
for(Connection c : connections)
            ((SipConnection) c).hold();
            setAudioGroupMode();
            // ---------- Original Method ----------
            //setState(State.HOLDING);
            //for (Connection c : connections) ((SipConnection) c).hold();
            //setAudioGroupMode();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.303 -0400", hash_original_method = "9A7CCBA25036980309C5282A2982C0B2", hash_generated_method = "040A69BFC28A7FEECD5AA6F6CCDD9370")
         void unhold() throws CallStateException {
            setState(State.ACTIVE);
            AudioGroup audioGroup = new AudioGroup();
for(Connection c : connections)
            {
                ((SipConnection) c).unhold(audioGroup);
            } //End block
            setAudioGroupMode();
            // ---------- Original Method ----------
            //setState(State.ACTIVE);
            //AudioGroup audioGroup = new AudioGroup();
            //for (Connection c : connections) {
                //((SipConnection) c).unhold(audioGroup);
            //}
            //setAudioGroupMode();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.303 -0400", hash_original_method = "7DDE83D6F9C645A60E86EBEFB92BE589", hash_generated_method = "3CDF1BBEA8028C5E65AAA198851160F9")
         void setMute(boolean muted) {
            addTaint(muted);
for(Connection c : connections)
            {
                ((SipConnection) c).setMute(muted);
            } //End block
            // ---------- Original Method ----------
            //for (Connection c : connections) {
                //((SipConnection) c).setMute(muted);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.304 -0400", hash_original_method = "B414CA4B3846B73054EF059A06E7BBBE", hash_generated_method = "2BE586C1DF6BF6AE3ED02626079D0EEA")
         boolean getMute() {
            boolean var1B126A20E4C413ED398D614909755699_1344214955 = (connections.isEmpty()
                    ? false
                    : ((SipConnection) connections.get(0)).getMute());
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_716170958 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_716170958;
            // ---------- Original Method ----------
            //return connections.isEmpty()
                    //? false
                    //: ((SipConnection) connections.get(0)).getMute();
        }

        
        @DSModeled(DSC.SPEC)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.304 -0400", hash_original_method = "C6685F4BB929C317D55EF29FDD744317", hash_generated_method = "CA60B12F80D8F2F7A53D1C666FA0D8D3")
         void merge(SipCall that) throws CallStateException {
            addTaint(that.getTaint());
            AudioGroup audioGroup = getAudioGroup();
            Connection[] cc = that.connections.toArray(
                    new Connection[that.connections.size()]);
for(Connection c : cc)
            {
                SipConnection conn = (SipConnection) c;
                add(conn);
    if(conn.getState() == Call.State.HOLDING)                
                {
                    conn.unhold(audioGroup);
                } //End block
            } //End block
            that.setState(Call.State.IDLE);
            // ---------- Original Method ----------
            //AudioGroup audioGroup = getAudioGroup();
            //Connection[] cc = that.connections.toArray(
                    //new Connection[that.connections.size()]);
            //for (Connection c : cc) {
                //SipConnection conn = (SipConnection) c;
                //add(conn);
                //if (conn.getState() == Call.State.HOLDING) {
                    //conn.unhold(audioGroup);
                //}
            //}
            //that.setState(Call.State.IDLE);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.304 -0400", hash_original_method = "C804E92B54898C48FBC0803D66022DE0", hash_generated_method = "E9A3AFC12DED37B2D8CD70F03CD14AA6")
        private void add(SipConnection conn) {
            addTaint(conn.getTaint());
            SipCall call = conn.getCall();
    if(call == this)            
            return;
    if(call != null)            
            call.connections.remove(conn);
            connections.add(conn);
            conn.changeOwner(this);
            // ---------- Original Method ----------
            //SipCall call = conn.getCall();
            //if (call == this) return;
            //if (call != null) call.connections.remove(conn);
            //connections.add(conn);
            //conn.changeOwner(this);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.305 -0400", hash_original_method = "994C45B8BD8978A705E69F1BE351A00B", hash_generated_method = "37BC23F045ADA0E9182C90EA960F6651")
         void sendDtmf(char c) {
            addTaint(c);
            AudioGroup audioGroup = getAudioGroup();
    if(audioGroup == null)            
            return;
            audioGroup.sendDtmf(convertDtmf(c));
            // ---------- Original Method ----------
            //AudioGroup audioGroup = getAudioGroup();
            //if (audioGroup == null) return;
            //audioGroup.sendDtmf(convertDtmf(c));
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.305 -0400", hash_original_method = "C4229E0DAB0B84D6720429F368FEF1C3", hash_generated_method = "945B1B6FF1C402C5F45EC4B231A4D6D6")
        private int convertDtmf(char c) {
            addTaint(c);
            int code = c - '0';
    if((code < 0) || (code > 9))            
            {
switch(c){
                case '*':
                int varD3D9446802A44259755D38E6D163E820_378610495 = (10);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1725858561 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1725858561;
                case '#':
                int var6512BD43D9CAA6E02C990B0A82652DCA_1857642247 = (11);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1550738361 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1550738361;
                case 'A':
                int varC20AD4D76FE97759AA27A0C99BFF6710_229396918 = (12);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1653465208 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1653465208;
                case 'B':
                int varC51CE410C124A10E0DB5E4B97FC2AF39_118153977 = (13);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_302237129 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_302237129;
                case 'C':
                int varAAB3238922BCC25A6F606EB525FFDC56_1394760131 = (14);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1572591672 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1572591672;
                case 'D':
                int var9BF31C7FF062936A96D3C8BD1F8F2FF3_1674474244 = (15);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1457161337 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1457161337;
                default:
                IllegalArgumentException var43C22D912DAE6E70226D0E341EE63407_720363181 = new IllegalArgumentException(
                                "invalid DTMF char: " + (int) c);
                var43C22D912DAE6E70226D0E341EE63407_720363181.addTaint(taint);
                throw var43C22D912DAE6E70226D0E341EE63407_720363181;
}
            } //End block
            int varC13367945D5D4C91047B3B50234AA7AB_1880191204 = (code);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1235436021 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1235436021;
            // ---------- Original Method ----------
            //int code = c - '0';
            //if ((code < 0) || (code > 9)) {
                //switch (c) {
                    //case '*': return 10;
                    //case '#': return 11;
                    //case 'A': return 12;
                    //case 'B': return 13;
                    //case 'C': return 14;
                    //case 'D': return 15;
                    //default:
                        //throw new IllegalArgumentException(
                                //"invalid DTMF char: " + (int) c);
                //}
            //}
            //return code;
        }

        
        @DSModeled(DSC.SPEC)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.306 -0400", hash_original_method = "A20E6ED570A38BE2669CFE3ED9219E0D", hash_generated_method = "59471BC888F2F4490882E8D15D02D88B")
        @Override
        protected void setState(State newState) {
            addTaint(newState.getTaint());
    if(state != newState)            
            {
    if(DEBUG){ }    if(newState == Call.State.ALERTING)                
                {
                    state = newState;
                    SipPhone.this.startRingbackTone();
                } //End block
                else
    if(state == Call.State.ALERTING)                
                {
                    SipPhone.this.stopRingbackTone();
                } //End block
                state = newState;
                updatePhoneState();
                notifyPreciseCallStateChanged();
            } //End block
            // ---------- Original Method ----------
            //if (state != newState) {
                //if (DEBUG) Log.v(LOG_TAG, "+***+ call state changed: " + state
                        //+ " --> " + newState + ": " + this + ": on phone "
                        //+ getPhone() + " " + connections.size());
                //if (newState == Call.State.ALERTING) {
                    //state = newState; 
                    //SipPhone.this.startRingbackTone();
                //} else if (state == Call.State.ALERTING) {
                    //SipPhone.this.stopRingbackTone();
                //}
                //state = newState;
                //updatePhoneState();
                //notifyPreciseCallStateChanged();
            //}
        }

        
        @DSModeled(DSC.SPEC)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.306 -0400", hash_original_method = "9B48819375B09AF6C57EC0D05234CB41", hash_generated_method = "D9476CCA7D4D7FE636F80EF52F888182")
         void onConnectionStateChanged(SipConnection conn) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(conn.getTaint());
    if(state != State.ACTIVE)            
            {
                setState(conn.getState());
            } //End block
            // ---------- Original Method ----------
            //if (state != State.ACTIVE) {
                //setState(conn.getState());
            //}
        }

        
        @DSModeled(DSC.SPEC)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.307 -0400", hash_original_method = "67A791C264A58046C696AC400E0B1106", hash_generated_method = "1DDBACFB99171D76844E361C2B39532A")
         void onConnectionEnded(SipConnection conn) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(conn.getTaint());
    if(state != State.DISCONNECTED)            
            {
                boolean allConnectionsDisconnected = true;
    if(DEBUG)                
                Log.d(LOG_TAG, "---check connections: "
                        + connections.size());
for(Connection c : connections)
                {
    if(DEBUG)                    
                    Log.d(LOG_TAG, "   state=" + c.getState() + ": "
                            + c);
    if(c.getState() != State.DISCONNECTED)                    
                    {
                        allConnectionsDisconnected = false;
                        break;
                    } //End block
                } //End block
    if(allConnectionsDisconnected)                
                setState(State.DISCONNECTED);
            } //End block
            notifyDisconnectP(conn);
            // ---------- Original Method ----------
            //if (state != State.DISCONNECTED) {
                //boolean allConnectionsDisconnected = true;
                //if (DEBUG) Log.d(LOG_TAG, "---check connections: "
                        //+ connections.size());
                //for (Connection c : connections) {
                    //if (DEBUG) Log.d(LOG_TAG, "   state=" + c.getState() + ": "
                            //+ c);
                    //if (c.getState() != State.DISCONNECTED) {
                        //allConnectionsDisconnected = false;
                        //break;
                    //}
                //}
                //if (allConnectionsDisconnected) setState(State.DISCONNECTED);
            //}
            //notifyDisconnectP(conn);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.307 -0400", hash_original_method = "3BDED5D4E6618481393AD33B1F728E6A", hash_generated_method = "33EC763649570E633B2C0C42EDAC1124")
        private AudioGroup getAudioGroup() {
    if(connections.isEmpty())            
            {
AudioGroup var540C13E9E156B687226421B24F2DF178_1114109954 =             null;
            var540C13E9E156B687226421B24F2DF178_1114109954.addTaint(taint);
            return var540C13E9E156B687226421B24F2DF178_1114109954;
            }
AudioGroup var569EB16657C1B5E9168B4C31CFEA6BA5_1295143848 =             ((SipConnection) connections.get(0)).getAudioGroup();
            var569EB16657C1B5E9168B4C31CFEA6BA5_1295143848.addTaint(taint);
            return var569EB16657C1B5E9168B4C31CFEA6BA5_1295143848;
            // ---------- Original Method ----------
            //if (connections.isEmpty()) return null;
            //return ((SipConnection) connections.get(0)).getAudioGroup();
        }

        
    }


    
    private class SipConnection extends SipConnectionBase {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "4AA3D5C224CE197897B9C6F17BF367CD", hash_generated_field = "D7165953848BB574FCA583AB16464D4F")

        private SipCall mOwner;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "DF701BED26C9A6E82B434D3ADA19F19A", hash_generated_field = "D1359B5A0587476130FC171DA764AC68")

        private SipAudioCall mSipAudioCall;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "9E8FCF5D95B61569BEBFA55673940468", hash_generated_field = "DFC050C51766232BD82C770760A2DF3D")

        private Call.State mState = Call.State.IDLE;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "6F401FEEE3A56ED571384DFAB76AA449", hash_generated_field = "06F960DE9AD1B3C2161E1D3DDDEEE930")

        private SipProfile mPeer;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "44366EF9F63882F1E47C480ECB6765BD", hash_generated_field = "EC5248A9D1818320AA647E3B388AFC57")

        private String mOriginalNumber;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.308 -0400", hash_original_field = "08E4E08A45FD9BD63A8B432D59B0CB98", hash_generated_field = "CEABB36F0D8DD49AB2FFAD188EF64025")

        private boolean mIncoming = false;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.299 -0400", hash_original_field = "AC67C5E32EF946C45E856E56B7F86834", hash_generated_field = "244547A11EB2D0F43D69ADE82125A7FA")

        private SipAudioCallAdapter mAdapter = new SipAudioCallAdapter() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.295 -0400", hash_original_method = "B8BAADEA0DE266294E2369B45E53A7F4", hash_generated_method = "44D1590CD550569A3F447EA35B336364")
            @Override
            protected void onCallEnded(DisconnectCause cause) {
                
                {
                    boolean var3317223ED0C152EA0F03D574707E1DAC_1172811185 = (getDisconnectCause() != DisconnectCause.LOCAL);
                    {
                        setDisconnectCause(cause);
                    } 
                } 
                {
                    setState(Call.State.DISCONNECTED);
                    SipAudioCall sipAudioCall = mSipAudioCall;
                    mSipAudioCall = null;
                    String sessionState;
                    sessionState = "";
                    sessionState = (sipAudioCall.getState() + ", ");
                    Log.d(LOG_TAG, "--- connection ended: "
                            + mPeer.getUriString() + ": " + sessionState
                            + "cause: " + getDisconnectCause() + ", on phone "
                            + getPhone());
                    {
                        sipAudioCall.setListener(null);
                        sipAudioCall.close();
                    } 
                    mOwner.onConnectionEnded(SipConnection.this);
                } 
                addTaint(cause.getTaint());
                
                
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.295 -0400", hash_original_method = "52733E1CC76DBF11A64B0250C617E7AC", hash_generated_method = "F34A5EF95CCC3389960527B60C4F7AE9")
            @Override
            public void onCallEstablished(SipAudioCall call) {
                
                onChanged(call);
                call.startAudio();
                addTaint(call.getTaint());
                
                
                
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.296 -0400", hash_original_method = "AC053A33592EEF445C9BE357836B4C16", hash_generated_method = "A5F097A8319E3CB02B505B72B427FB45")
            @Override
            public void onCallHeld(SipAudioCall call) {
                
                onChanged(call);
                call.startAudio();
                addTaint(call.getTaint());
                
                
                
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.298 -0400", hash_original_method = "9E9163C05D7336A6FE9DFAB379443860", hash_generated_method = "819342FBC5A8298A2BD476438672EE18")
            @Override
            public void onChanged(SipAudioCall call) {
                
                {
                    Call.State newState = getCallStateFrom(call);
                    {
                        setState(mOwner.getState());
                    } 
                    {
                        {
                            {
                                boolean varD8866BE17E7C5DE27AE1021BF41F371D_921518053 = (ringingCall.getState() == Call.State.WAITING);
                                {
                                    try 
                                    {
                                        switchHoldingAndActive();
                                    } 
                                    catch (CallStateException e)
                                    {
                                        onCallEnded(DisconnectCause.LOCAL);
                                    } 
                                } 
                            } 
                            foregroundCall.switchWith(ringingCall);
                        } 
                        setState(newState);
                    } 
                    mOwner.onConnectionStateChanged(SipConnection.this);
                } 
                addTaint(call.getTaint());
                
                
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.299 -0400", hash_original_method = "C52D3E5DC20D7F0420DDF7517152D94F", hash_generated_method = "22119F567079DA28DBBFC4AA0120E473")
            @Override
            protected void onError(DisconnectCause cause) {
                
                Log.d(LOG_TAG, "SIP error: " + cause);
                onCallEnded(cause);
                addTaint(cause.getTaint());
                
                
                
            }

            
};
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.309 -0400", hash_original_method = "EB041B636E30FA2F3190616100DC4B14", hash_generated_method = "D02AEE3D5DDE08332E361E5B938B30A9")
        public  SipConnection(SipCall owner, SipProfile callee,
                String originalNumber) {
            super(originalNumber);
            mOwner = owner;
            mPeer = callee;
            mOriginalNumber = originalNumber;
            // ---------- Original Method ----------
            //mOwner = owner;
            //mPeer = callee;
            //mOriginalNumber = originalNumber;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.309 -0400", hash_original_method = "0957F2328B233DD414C835AB48AD0504", hash_generated_method = "696093B1DB76D0BD50016FED94578C51")
        public  SipConnection(SipCall owner, SipProfile callee) {
            this(owner, callee, getUriString(callee));
            addTaint(callee.getTaint());
            addTaint(owner.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.310 -0400", hash_original_method = "57E4C10F499E8E36FDDCF5DF3794947E", hash_generated_method = "C5EDC9A98E06D346625A8524B7AF4DF4")
        @Override
        public String getCnapName() {
            String displayName = mPeer.getDisplayName();
String var9B76942A7E3DEF18EF2486FEB3AF2467_1753807253 =             TextUtils.isEmpty(displayName) ? null
                                                  : displayName;
            var9B76942A7E3DEF18EF2486FEB3AF2467_1753807253.addTaint(taint);
            return var9B76942A7E3DEF18EF2486FEB3AF2467_1753807253;
            // ---------- Original Method ----------
            //String displayName = mPeer.getDisplayName();
            //return TextUtils.isEmpty(displayName) ? null
                                                  //: displayName;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.310 -0400", hash_original_method = "6B6F8D6F29C0FEAF9C52CC30010D6FE2", hash_generated_method = "27E0E856EC5012B891CEAD95F09CADF5")
        @Override
        public int getNumberPresentation() {
            int var1CD3F9AC750C03CA9ABE084F6B1E42A4_774854777 = (Connection.PRESENTATION_ALLOWED);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_907517338 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_907517338;
            // ---------- Original Method ----------
            //return Connection.PRESENTATION_ALLOWED;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.311 -0400", hash_original_method = "14BDBA500BD81C7014F8447F04B9333E", hash_generated_method = "FD0CF1909D03A722AA386930596EC690")
         void initIncomingCall(SipAudioCall sipAudioCall, Call.State newState) {
            addTaint(newState.getTaint());
            setState(newState);
            mSipAudioCall = sipAudioCall;
            sipAudioCall.setListener(mAdapter);
            mIncoming = true;
            // ---------- Original Method ----------
            //setState(newState);
            //mSipAudioCall = sipAudioCall;
            //sipAudioCall.setListener(mAdapter);
            //mIncoming = true;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.311 -0400", hash_original_method = "62A265BABD2EF644B89898FE1DF3E037", hash_generated_method = "841A94178E7ED88D1D69159F4C048129")
         void acceptCall() throws CallStateException {
            try 
            {
                mSipAudioCall.answerCall(TIMEOUT_ANSWER_CALL);
            } //End block
            catch (SipException e)
            {
                CallStateException var19CD94C1237A3159C58D988BC9BD5B04_722654745 = new CallStateException("acceptCall(): " + e);
                var19CD94C1237A3159C58D988BC9BD5B04_722654745.addTaint(taint);
                throw var19CD94C1237A3159C58D988BC9BD5B04_722654745;
            } //End block
            // ---------- Original Method ----------
            //try {
                //mSipAudioCall.answerCall(TIMEOUT_ANSWER_CALL);
            //} catch (SipException e) {
                //throw new CallStateException("acceptCall(): " + e);
            //}
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.311 -0400", hash_original_method = "5D5AACCF3178F43A37FA6476F3FA2309", hash_generated_method = "F4F212B9E8EECDAFB8ECD3B21BCA89BD")
         void changeOwner(SipCall owner) {
            mOwner = owner;
            // ---------- Original Method ----------
            //mOwner = owner;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.312 -0400", hash_original_method = "81195A6CBC9B38EAFBB5618CD4E171CB", hash_generated_method = "955322E44E413AF156362B6BBF4E4149")
         AudioGroup getAudioGroup() {
    if(mSipAudioCall == null)            
            {
AudioGroup var540C13E9E156B687226421B24F2DF178_1562765884 =             null;
            var540C13E9E156B687226421B24F2DF178_1562765884.addTaint(taint);
            return var540C13E9E156B687226421B24F2DF178_1562765884;
            }
AudioGroup var1FE4B820CFFA4C8BEEF63D8B9C89691A_190944603 =             mSipAudioCall.getAudioGroup();
            var1FE4B820CFFA4C8BEEF63D8B9C89691A_190944603.addTaint(taint);
            return var1FE4B820CFFA4C8BEEF63D8B9C89691A_190944603;
            // ---------- Original Method ----------
            //if (mSipAudioCall == null) return null;
            //return mSipAudioCall.getAudioGroup();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.312 -0400", hash_original_method = "766A0FDDBD2B3A4E947C7E8FBAB0F165", hash_generated_method = "93C009E595843D9B5B39352F3D675F51")
         void dial() throws SipException {
            setState(Call.State.DIALING);
            mSipAudioCall = mSipManager.makeAudioCall(mProfile, mPeer, null,
                    TIMEOUT_MAKE_CALL);
            mSipAudioCall.setListener(mAdapter);
            // ---------- Original Method ----------
            //setState(Call.State.DIALING);
            //mSipAudioCall = mSipManager.makeAudioCall(mProfile, mPeer, null,
                    //TIMEOUT_MAKE_CALL);
            //mSipAudioCall.setListener(mAdapter);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.312 -0400", hash_original_method = "DDAA74ADB7976F32813665FE128238CD", hash_generated_method = "F9A0AB8CAA6080513DDBDFBF357F27CE")
         void hold() throws CallStateException {
            setState(Call.State.HOLDING);
            try 
            {
                mSipAudioCall.holdCall(TIMEOUT_HOLD_CALL);
            } //End block
            catch (SipException e)
            {
                CallStateException varCCE8626BA545950A2356D73D89CDA304_1543459245 = new CallStateException("hold(): " + e);
                varCCE8626BA545950A2356D73D89CDA304_1543459245.addTaint(taint);
                throw varCCE8626BA545950A2356D73D89CDA304_1543459245;
            } //End block
            // ---------- Original Method ----------
            //setState(Call.State.HOLDING);
            //try {
                //mSipAudioCall.holdCall(TIMEOUT_HOLD_CALL);
            //} catch (SipException e) {
                //throw new CallStateException("hold(): " + e);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.313 -0400", hash_original_method = "F77273A2CD584255814B6B238AF1477E", hash_generated_method = "BCAE6F9AEC0342858CE2F42A01CA1BF3")
         void unhold(AudioGroup audioGroup) throws CallStateException {
            addTaint(audioGroup.getTaint());
            mSipAudioCall.setAudioGroup(audioGroup);
            setState(Call.State.ACTIVE);
            try 
            {
                mSipAudioCall.continueCall(TIMEOUT_HOLD_CALL);
            } //End block
            catch (SipException e)
            {
                CallStateException var50E79495CAAE911B8D4AB1DD6B7E9BAF_692891745 = new CallStateException("unhold(): " + e);
                var50E79495CAAE911B8D4AB1DD6B7E9BAF_692891745.addTaint(taint);
                throw var50E79495CAAE911B8D4AB1DD6B7E9BAF_692891745;
            } //End block
            // ---------- Original Method ----------
            //mSipAudioCall.setAudioGroup(audioGroup);
            //setState(Call.State.ACTIVE);
            //try {
                //mSipAudioCall.continueCall(TIMEOUT_HOLD_CALL);
            //} catch (SipException e) {
                //throw new CallStateException("unhold(): " + e);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.313 -0400", hash_original_method = "91B9A79444A0C09E86ABE6F5C7C89706", hash_generated_method = "19884EF6EE7DA459AA719624FF7B89E1")
         void setMute(boolean muted) {
            addTaint(muted);
    if((mSipAudioCall != null) && (muted != mSipAudioCall.isMuted()))            
            {
                mSipAudioCall.toggleMute();
            } //End block
            // ---------- Original Method ----------
            //if ((mSipAudioCall != null) && (muted != mSipAudioCall.isMuted())) {
                //mSipAudioCall.toggleMute();
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.313 -0400", hash_original_method = "E20C6A660C2E35A5253ACCD901B5D855", hash_generated_method = "AB24B0E46D24157B88B225F4BDB451BA")
         boolean getMute() {
            boolean var40F637883FA2B4017624DB402A75784A_400279573 = ((mSipAudioCall == null) ? false
                                           : mSipAudioCall.isMuted());
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_471063400 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_471063400;
            // ---------- Original Method ----------
            //return (mSipAudioCall == null) ? false
                                           //: mSipAudioCall.isMuted();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.314 -0400", hash_original_method = "1833AE90ADB0C663418065E2EE17BAF0", hash_generated_method = "C99B8E34E9800DBE533B7BD5FBBDBBB5")
        @Override
        protected void setState(Call.State state) {
    if(state == mState)            
            return;
            super.setState(state);
            mState = state;
            // ---------- Original Method ----------
            //if (state == mState) return;
            //super.setState(state);
            //mState = state;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.314 -0400", hash_original_method = "0D6E90F055C537B49BE3263741E0D2AC", hash_generated_method = "F4995E99C6FA213C0F2A03D1110EE52F")
        @Override
        public Call.State getState() {
Call.State var8B975C85F13BECB9FD4D21A5F3C8A56D_176141525 =             mState;
            var8B975C85F13BECB9FD4D21A5F3C8A56D_176141525.addTaint(taint);
            return var8B975C85F13BECB9FD4D21A5F3C8A56D_176141525;
            // ---------- Original Method ----------
            //return mState;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.314 -0400", hash_original_method = "0C9900F417D1D38623450F6C44261C8A", hash_generated_method = "2628359BF89E9E112336D8B7C4B62A43")
        @Override
        public boolean isIncoming() {
            boolean var76831D29BD77DF0683F0AEC848545BC5_2049928035 = (mIncoming);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1382839339 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1382839339;
            // ---------- Original Method ----------
            //return mIncoming;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.314 -0400", hash_original_method = "FE0C81270397910192F7BF8C9CDDDAB6", hash_generated_method = "8E15091E1E7D2849A5E054712C605DF6")
        @Override
        public String getAddress() {
String var3D68393E4E627398E3A55D29CB063BFC_197725662 =             mOriginalNumber;
            var3D68393E4E627398E3A55D29CB063BFC_197725662.addTaint(taint);
            return var3D68393E4E627398E3A55D29CB063BFC_197725662;
            // ---------- Original Method ----------
            //return mOriginalNumber;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.315 -0400", hash_original_method = "710C86DFEBE06A4514867B4563DB846F", hash_generated_method = "339B46F07197DBFC0A9A3CF782D82B32")
        @Override
        public SipCall getCall() {
SipCall var5F2C684ADE383867ABA7E337213B9967_369909461 =             mOwner;
            var5F2C684ADE383867ABA7E337213B9967_369909461.addTaint(taint);
            return var5F2C684ADE383867ABA7E337213B9967_369909461;
            // ---------- Original Method ----------
            //return mOwner;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.315 -0400", hash_original_method = "925322092199D63FE2A7CC7A8AD6AC9C", hash_generated_method = "822B1A713A8EA946CCF9A11C75FFBD0C")
        @Override
        protected Phone getPhone() {
Phone var2410533D03C0DAB45909CE129323CB92_881113047 =             mOwner.getPhone();
            var2410533D03C0DAB45909CE129323CB92_881113047.addTaint(taint);
            return var2410533D03C0DAB45909CE129323CB92_881113047;
            // ---------- Original Method ----------
            //return mOwner.getPhone();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.315 -0400", hash_original_method = "B35A599F4014F0A4981FF871F70F4B98", hash_generated_method = "52873DDABB428EE4D0A14A37686748EB")
        @Override
        public void hangup() throws CallStateException {
            synchronized
(SipPhone.class)            {
    if(DEBUG)                
                Log.d(LOG_TAG, "hangup conn: " + mPeer.getUriString()
                        + ": " + mState + ": on phone "
                        + getPhone().getPhoneName());
    if(!mState.isAlive())                
                return;
                try 
                {
                    SipAudioCall sipAudioCall = mSipAudioCall;
    if(sipAudioCall != null)                    
                    {
                        sipAudioCall.setListener(null);
                        sipAudioCall.endCall();
                    } //End block
                } //End block
                catch (SipException e)
                {
                    CallStateException varE4CD7D4FC160893B5115E1DBD5FF56FA_2090690259 = new CallStateException("hangup(): " + e);
                    varE4CD7D4FC160893B5115E1DBD5FF56FA_2090690259.addTaint(taint);
                    throw varE4CD7D4FC160893B5115E1DBD5FF56FA_2090690259;
                } //End block
                finally 
                {
                    mAdapter.onCallEnded(((mState == Call.State.INCOMING)
                            || (mState == Call.State.WAITING))
                            ? DisconnectCause.INCOMING_REJECTED
                            : DisconnectCause.LOCAL);
                } //End block
            } //End block
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSModeled(DSC.SPEC)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.316 -0400", hash_original_method = "7B400982296D21B9968B9808849E5473", hash_generated_method = "1050D1AEB186C1D93D0105CE6BF6F73B")
        @Override
        public void separate() throws CallStateException {
            synchronized
(SipPhone.class)            {
                SipCall call = (getPhone() == SipPhone.this)
                        ? (SipCall) SipPhone.this.getBackgroundCall()
                        : (SipCall) SipPhone.this.getForegroundCall();
    if(call.getState() != Call.State.IDLE)                
                {
                    CallStateException varF03F62E8CE31C5EA99CC033D1DF514B3_1375408562 = new CallStateException(
                            "cannot put conn back to a call in non-idle state: "
                            + call.getState());
                    varF03F62E8CE31C5EA99CC033D1DF514B3_1375408562.addTaint(taint);
                    throw varF03F62E8CE31C5EA99CC033D1DF514B3_1375408562;
                } //End block
    if(DEBUG)                
                Log.d(LOG_TAG, "separate conn: "
                        + mPeer.getUriString() + " from " + mOwner + " back to "
                        + call);
                Phone originalPhone = getPhone();
                AudioGroup audioGroup = call.getAudioGroup();
                call.add(this);
                mSipAudioCall.setAudioGroup(audioGroup);
                originalPhone.switchHoldingAndActive();
                call = (SipCall) SipPhone.this.getForegroundCall();
                mSipAudioCall.startAudio();
                call.onConnectionStateChanged(this);
            } //End block
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    private abstract class SipAudioCallAdapter extends SipAudioCall.Listener {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.316 -0400", hash_original_method = "3AB54838416D4A721CFBD2C180A6FF7A", hash_generated_method = "3AB54838416D4A721CFBD2C180A6FF7A")
        public SipAudioCallAdapter ()
        {
            //Synthesized constructor
        }


        protected abstract void onCallEnded(Connection.DisconnectCause cause);

        
        protected abstract void onError(Connection.DisconnectCause cause);

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.317 -0400", hash_original_method = "FAC45A8F53047AFBBF88628CAD98E6D5", hash_generated_method = "27F08E98E5815DFE0F5F3A1BDCB043A2")
        @Override
        public void onCallEnded(SipAudioCall call) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(call.getTaint());
            onCallEnded(call.isInCall()
                    ? Connection.DisconnectCause.NORMAL
                    : Connection.DisconnectCause.INCOMING_MISSED);
            // ---------- Original Method ----------
            //onCallEnded(call.isInCall()
                    //? Connection.DisconnectCause.NORMAL
                    //: Connection.DisconnectCause.INCOMING_MISSED);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.317 -0400", hash_original_method = "5FEE35421FE68DCB9D837EF94FC0CC79", hash_generated_method = "1A1860307E0D67CA66336CF4A8309268")
        @Override
        public void onCallBusy(SipAudioCall call) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(call.getTaint());
            onCallEnded(Connection.DisconnectCause.BUSY);
            // ---------- Original Method ----------
            //onCallEnded(Connection.DisconnectCause.BUSY);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.317 -0400", hash_original_method = "7EFF641046EACBCFF45AD18624210100", hash_generated_method = "56B310FAB0847CCEF3A5E28652E14620")
        @Override
        public void onError(SipAudioCall call, int errorCode,
                String errorMessage) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(errorMessage.getTaint());
            addTaint(errorCode);
            addTaint(call.getTaint());
switch(errorCode){
            case SipErrorCode.SERVER_UNREACHABLE:
            onError(Connection.DisconnectCause.SERVER_UNREACHABLE);
            break;
            case SipErrorCode.PEER_NOT_REACHABLE:
            onError(Connection.DisconnectCause.NUMBER_UNREACHABLE);
            break;
            case SipErrorCode.INVALID_REMOTE_URI:
            onError(Connection.DisconnectCause.INVALID_NUMBER);
            break;
            case SipErrorCode.TIME_OUT:
            case SipErrorCode.TRANSACTION_TERMINTED:
            onError(Connection.DisconnectCause.TIMED_OUT);
            break;
            case SipErrorCode.DATA_CONNECTION_LOST:
            onError(Connection.DisconnectCause.LOST_SIGNAL);
            break;
            case SipErrorCode.INVALID_CREDENTIALS:
            onError(Connection.DisconnectCause.INVALID_CREDENTIALS);
            break;
            case SipErrorCode.CROSS_DOMAIN_AUTHENTICATION:
            onError(Connection.DisconnectCause.OUT_OF_NETWORK);
            break;
            case SipErrorCode.SERVER_ERROR:
            onError(Connection.DisconnectCause.SERVER_ERROR);
            break;
            case SipErrorCode.SOCKET_ERROR:
            case SipErrorCode.CLIENT_ERROR:
            default:
            onError(Connection.DisconnectCause.ERROR_UNSPECIFIED);
}
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.318 -0400", hash_original_field = "976523C589B0B5F84D4530AFB1044D93", hash_generated_field = "7A17420CA7320CD6991D9BB201E6C8AD")

    private static final String LOG_TAG = "SipPhone";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.318 -0400", hash_original_field = "BC4FF4C62A62F66D6D2E0A35B84DD24A", hash_generated_field = "0DA17BC1AEF6DBF011A4A750F5A71D57")

    private static final boolean DEBUG = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.318 -0400", hash_original_field = "E41B978FAF3B339183EF17F3067BF0E9", hash_generated_field = "EB405364424B606CEA103C767EA0ADA3")

    private static final int TIMEOUT_MAKE_CALL = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.318 -0400", hash_original_field = "F955123D19BAEE32317A2241EE79907C", hash_generated_field = "973EB4EC28EADF6B6F1C1FDB9D5440C9")

    private static final int TIMEOUT_ANSWER_CALL = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:29.318 -0400", hash_original_field = "B3BD5D4BD687697B138A2662DACEECFF", hash_generated_field = "2FA826CBF5F1C3318478B665E6C65585")

    private static final int TIMEOUT_HOLD_CALL = 15;
}

