package android.webkit;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.webkit.HTML5VideoViewProxy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class HTML5VideoView implements MediaPlayer.OnPreparedListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "6C7797A425EBA1D07F236FF9B39AA429", hash_generated_field = "D427CDF1FC427D67E4945D1E0E231D42")

    protected int mCurrentState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "7D88DE9DD0EF018B770128257B4D159F", hash_generated_field = "A9417E42DC0EBFA2CF2015D2CB329A68")

    protected HTML5VideoViewProxy mProxy;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "D04CD0659FBA036CA8826150F1F1E62A", hash_generated_field = "B8C51FE12DAEADA10B46180012D4E013")

    protected int mSaveSeekTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "984724E54A3D174511409B8A76927E34", hash_generated_field = "0752FEDDB1622AE4DFBC1A284DB7079B")

    protected int mVideoLayerId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "01AE51C88036C324EFB5646FEE9EB109", hash_generated_field = "C795F3B69D878B3EB8FFD62D53BE5467")

    protected MediaPlayer mPlayer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "31825AE6E4F03F79884718C65CDD49D5", hash_generated_field = "82B2974D11DC8EF00D6DE680FC278C81")

    protected boolean mAutostart;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "5FBE3730DCFF234F97B15868D5CE649D", hash_generated_field = "4309285A2AF5294EC8D8A6725673F542")

    protected Uri mUri;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "9DA6583E4F64A78649E80D72BFE1DBCC", hash_generated_field = "DE0CB0B3CC8CF9FE0713E37CB69C3430")

    protected Map<String, String> mHeaders;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "F31379AC693AFD32806C2F8AFF4FB2B1", hash_generated_field = "4B797C0AD5CBAEABB54B83FEF8D06E8A")

    protected boolean mPauseDuringPreparing;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_field = "D8A44452255315582684719CBEAE3A2C", hash_generated_field = "3C382F7E45E0380C589CD364462525D1")

    public boolean mPlayerBuffering = false;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.818 -0400", hash_original_method = "28D653DD01D92986A2B4676333E22F44", hash_generated_method = "E877102CF44EDBE37327EE0B3614BDF9")
    protected  HTML5VideoView() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.819 -0400", hash_original_method = "3012844A52D4FF8D08A8750FA45AE671", hash_generated_method = "1396C9E4303ED6E8F83C63E801BAF34A")
    public void start() {
        {
            {
                mTimer = new Timer();
                mTimer.schedule(new TimeupdateTask(mProxy), TIMEUPDATE_PERIOD,
                        TIMEUPDATE_PERIOD);
            } 
            mPlayer.start();
            setPlayerBuffering(false);
        } 
        
        
            
            
                
                
                        
            
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.819 -0400", hash_original_method = "53F6A4797DD5828003875392A3AF17CE", hash_generated_method = "F13EA9B86AD10D7C91CA68A9D0154F45")
    public void pause() {
        {
            boolean varF201D1289221CC8E3849EC18FF46A02A_891253212 = (isPlaying());
            {
                mPlayer.pause();
            } 
            {
                mPauseDuringPreparing = true;
            } 
        } 
        {
            mTimer.purge();
            mTimer.cancel();
            mTimer = null;
        } 
        
        
            
        
            
        
        
            
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.819 -0400", hash_original_method = "439630F284E895C4A0EC26592582E769", hash_generated_method = "B25A4A7841AC0964F5F563CEA9BE5BBD")
    public int getDuration() {
        {
            int var5FEFC5FCA84B13AB9FEADC62B6A961FC_1877089298 = (mPlayer.getDuration());
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2122430242 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2122430242;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.820 -0400", hash_original_method = "5E9270330E1DC98C2EF1834461EFA6AE", hash_generated_method = "B962C001AE6D2F7AD6157009B6D8043B")
    public int getCurrentPosition() {
        {
            int var8634387E01C283C5F7FA944275E46C0C_1348282476 = (mPlayer.getCurrentPosition());
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_997839897 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_997839897;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.820 -0400", hash_original_method = "29179F4E6F5DEF8BE6DF61D7C781E0A2", hash_generated_method = "B4DD9690076B8F59CCFE291D4B1CB31D")
    public void seekTo(int pos) {
        mPlayer.seekTo(pos);
        mSaveSeekTime = pos;
        
        
            
        
            
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.820 -0400", hash_original_method = "FFF63CE630758A2DC8461EEC2B2493E2", hash_generated_method = "6245B71FC8251B58F991D2ACE031B3ED")
    public boolean isPlaying() {
        {
            boolean var39B4349F3FF67B6FA000A266CC9AF48C_2116350387 = (mPlayer.isPlaying());
        } 
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_840319566 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_840319566;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.821 -0400", hash_original_method = "0FBE82A8FF8F42AB54B25C4455F7DE4C", hash_generated_method = "39686718BE926761D41941F442CF5B1D")
    public void release() {
        {
            mPlayer.release();
        } 
        mCurrentState = STATE_RELEASED;
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.821 -0400", hash_original_method = "59D4F83219BBDE4F48B39B417FC8C6D3", hash_generated_method = "064D6A57BA1A5112703637AACC1A024C")
    public void stopPlayback() {
        {
            mPlayer.stop();
        } 
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.821 -0400", hash_original_method = "FE87C901FEC48725BE9A00E5A7A6B389", hash_generated_method = "65DAA8A5EE46BC1D8654515C5A086EBA")
    public boolean getAutostart() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_735263658 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_735263658;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.821 -0400", hash_original_method = "83FF2150FEBE6917B81E8E4D5EFDEDB8", hash_generated_method = "688B8DDFE3ACB15FBB5655787E9B88BF")
    public boolean getPauseDuringPreparing() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1080390284 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1080390284;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.822 -0400", hash_original_method = "25A3A58F4D699286035B0F84C85D6FDC", hash_generated_method = "8D5F2A249F2CD08E0E39617378FD04E1")
    public void init(int videoLayerId, int position, boolean autoStart) {
        mPlayer = new MediaPlayer();
        mCurrentState = STATE_INITIALIZED;
        mProxy = null;
        mVideoLayerId = videoLayerId;
        mSaveSeekTime = position;
        mAutostart = autoStart;
        mTimer = null;
        mPauseDuringPreparing = false;
        
        
        
        
        
        
        
        
        
    }

    
    protected static Map<String, String> generateHeaders(String url,
            HTML5VideoViewProxy proxy) {
        boolean isPrivate = proxy.getWebView().isPrivateBrowsingEnabled();
        String cookieValue = CookieManager.getInstance().getCookie(url, isPrivate);
        Map<String, String> headers = new HashMap<String, String>();
        if (cookieValue != null) {
            headers.put(COOKIE, cookieValue);
        }
        if (isPrivate) {
            headers.put(HIDE_URL_LOGS, "true");
        }
        return headers;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.823 -0400", hash_original_method = "4A72F313DB07B237CDCFE2148C78F1A8", hash_generated_method = "EAB59583A6ABB2F017872447AEE18A8E")
    public void setVideoURI(String uri, HTML5VideoViewProxy proxy) {
        mUri = Uri.parse(uri);
        mHeaders = generateHeaders(uri, proxy);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.823 -0400", hash_original_method = "7F2C5845AC97F9E01BF6739081098AFA", hash_generated_method = "6D7136EE6FB0E5A6F8DBA09CBC477EDA")
    public void setOnCompletionListener(HTML5VideoViewProxy proxy) {
        mPlayer.setOnCompletionListener(proxy);
        addTaint(proxy.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.823 -0400", hash_original_method = "B3DA09063B346725FC2FACD292CDBF3D", hash_generated_method = "02459DD86FF4F28A605BEA72C55F7815")
    public void setOnErrorListener(HTML5VideoViewProxy proxy) {
        mPlayer.setOnErrorListener(proxy);
        addTaint(proxy.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.823 -0400", hash_original_method = "88BA8808B84DAD90592F4339F231D5ED", hash_generated_method = "4D6AF3753C8541AA77B64DFD77C61EFB")
    public void setOnPreparedListener(HTML5VideoViewProxy proxy) {
        mProxy = proxy;
        mPlayer.setOnPreparedListener(this);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.824 -0400", hash_original_method = "9B3DE5A2AE36BDD54043208A8ECFD89C", hash_generated_method = "805DBD98DBCF3131A0DE214EA6FAC6E7")
    public void setOnInfoListener(HTML5VideoViewProxy proxy) {
        mPlayer.setOnInfoListener(proxy);
        addTaint(proxy.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.824 -0400", hash_original_method = "F9607B1B919A7A6BBECF31855FC93C59", hash_generated_method = "CC37FDE682A13E7BA3BDE28FEB8EA797")
    public void prepareDataAndDisplayMode(HTML5VideoViewProxy proxy) {
        decideDisplayMode();
        setOnCompletionListener(proxy);
        setOnPreparedListener(proxy);
        setOnErrorListener(proxy);
        setOnInfoListener(proxy);
        try 
        {
            mPlayer.setDataSource(mProxy.getContext(), mUri, mHeaders);
            mPlayer.prepareAsync();
        } 
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        } 
        catch (IllegalStateException e)
        {
            e.printStackTrace();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        mCurrentState = STATE_NOTPREPARED;
        addTaint(proxy.getTaint());
        
        
        
        
        
        
        
            
            
        
            
        
            
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.824 -0400", hash_original_method = "4F2E24A50F82208E59877C3E2625C348", hash_generated_method = "E0DD67D73CA30EA690453E45563D3779")
    public int getVideoLayerId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_314399285 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_314399285;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.825 -0400", hash_original_method = "90E098B5ED1DEFDE8C60551334D6CBD4", hash_generated_method = "C1BAF66DE658D27EF026EE7EFAA91440")
    public int getCurrentState() {
        {
            boolean varF201D1289221CC8E3849EC18FF46A02A_2017702107 = (isPlaying());
        } 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2033910397 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2033910397;
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.825 -0400", hash_original_method = "023FEEEA138ACC710F3FC682E3FCF8D2", hash_generated_method = "3BD2E894EF3F8B78F331F80688D24AAC")
    @Override
    public void onPrepared(MediaPlayer mp) {
        
        mCurrentState = STATE_PREPARED;
        seekTo(mSaveSeekTime);
        {
            mProxy.onPrepared(mp);
        } 
        {
            pauseAndDispatch(mProxy);
            mPauseDuringPreparing = false;
        } 
        addTaint(mp.getTaint());
        
        
        
        
            
        
        
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.825 -0400", hash_original_method = "61063445AE0708B1C305C74A0C0CFD4D", hash_generated_method = "40B1778C4912BE2FE103335407522BB4")
    public void pauseAndDispatch(HTML5VideoViewProxy proxy) {
        pause();
        {
            proxy.dispatchOnPaused();
        } 
        addTaint(proxy.getTaint());
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.826 -0400", hash_original_method = "9BC7893A1A30D65DD41983AD520ABA24", hash_generated_method = "7C0719220EB3C998D5CEFEC1C7EAFAFC")
    public void enterFullScreenVideoState(int layerId,
            HTML5VideoViewProxy proxy, WebView webView) {
        addTaint(layerId);
        addTaint(proxy.getTaint());
        addTaint(webView.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.826 -0400", hash_original_method = "040F96FADC077BA4992C03214586310A", hash_generated_method = "2F95FAC613D0893AAFDAE27FD536DFDE")
    public boolean isFullScreenMode() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_266915888 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_266915888;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.826 -0400", hash_original_method = "576D7BAAE83D7D96FC7F76762AF5D519", hash_generated_method = "72B0C98E60E0E0F576CB0E078AC7C55A")
    public void decideDisplayMode() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.826 -0400", hash_original_method = "C9A7CF84D371C51EADC63585245E2DF8", hash_generated_method = "A69B612FA6466A7F9D1DF9A8CC76244F")
    public boolean getReadyToUseSurfTex() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1669448545 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1669448545;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.827 -0400", hash_original_method = "EB4C543379CBB61A7D197317729D4B81", hash_generated_method = "0430CCEF009B5D4BB2F802DD6CDC3ED5")
    public SurfaceTexture getSurfaceTexture(int videoLayerId) {
        SurfaceTexture varB4EAC82CA7396A68D541C85D26508E83_2100117504 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2100117504 = null;
        addTaint(videoLayerId);
        varB4EAC82CA7396A68D541C85D26508E83_2100117504.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2100117504;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.827 -0400", hash_original_method = "F878AB9D8B307F7725C7D90E69C96D89", hash_generated_method = "07BFA0BF77B7C18AD06224A1226A429A")
    public void deleteSurfaceTexture() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.827 -0400", hash_original_method = "4BDE667A00FC91D9C95E5191E09A54C3", hash_generated_method = "9B31C412CC064822FE49579B94BCEDAE")
    public int getTextureName() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_544171868 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_544171868;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.827 -0400", hash_original_method = "BA6BA92F877820EFB4A7324F8FF815C7", hash_generated_method = "A7F6BF0C27E45FA3C29B004EA3DCD883")
    public boolean getPlayerBuffering() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_11212410 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_11212410;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.827 -0400", hash_original_method = "90D4C50A046C8B21871A46FE1FDA531C", hash_generated_method = "453F7193DA9035441C449E361090501E")
    public void setPlayerBuffering(boolean playerBuffering) {
        mPlayerBuffering = playerBuffering;
        switchProgressView(playerBuffering);
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.828 -0400", hash_original_method = "D1649F9781058EFE73B80767CB5DBB7F", hash_generated_method = "78654B15F1DDD1BB483C8E3622ECF5B9")
    protected void switchProgressView(boolean playerBuffering) {
        addTaint(playerBuffering);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.828 -0400", hash_original_method = "620458B5B8BB9506BFC901A9D3B27999", hash_generated_method = "F8FD31B02228AA4455DF5199F099DB47")
    public boolean surfaceTextureDeleted() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1275947276 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1275947276;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.828 -0400", hash_original_method = "8A279E58756D4B031794A7C12A636619", hash_generated_method = "9FC91A60BFB63DBD412637DC9AE0E632")
    public boolean fullScreenExited() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1482386285 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1482386285;
        
        
    }

    
    private static final class TimeupdateTask extends TimerTask {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.828 -0400", hash_original_field = "7D88DE9DD0EF018B770128257B4D159F", hash_generated_field = "701E8A5CEFF22C717E0E1190038ED0C2")

        private HTML5VideoViewProxy mProxy;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.828 -0400", hash_original_method = "3C26C895A00D8A9565624E1D679282AA", hash_generated_method = "0F41425E63DDD706022823AA445EA086")
        public  TimeupdateTask(HTML5VideoViewProxy proxy) {
            mProxy = proxy;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_method = "BCE01212467B54ADF40E3CF16EDCE71A", hash_generated_method = "720F4FE730506E910812AE5C0641C63B")
        @Override
        public void run() {
            mProxy.onTimeupdate();
            
            
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "23A1AFCA8BE06FFFB26446468AA15EE5", hash_generated_field = "F28BD250BE49F871DBD48569862C0B31")

    protected static final String LOGTAG = "HTML5VideoView";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "9A71485BAE34D870CB99A56794E33727", hash_generated_field = "DA39A01DF5AB155F9CB6B9FF9001FE68")

    protected static final String COOKIE = "Cookie";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "27A993EDFD63555E2CA2047D198F916F", hash_generated_field = "9881974001B645494AB5FC175DFA6D3E")

    protected static final String HIDE_URL_LOGS = "x-hide-urls-from-log";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "5D51BBD586E32FF369C39A1432B1D1FE", hash_generated_field = "F87702CD8372B94E855116553EA5A2CA")

    static final int STATE_INITIALIZED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "306E5AD3AF067CF0A2BD527C24682116", hash_generated_field = "5FB03EFA27A8E29EFAB8448370D21C6E")

    static final int STATE_NOTPREPARED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "95BFE9F657F45E05E13CA2B88A7E534C", hash_generated_field = "ED6A5A72E4407D351D0E711B5368AB37")

    static final int STATE_PREPARED = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "F8E97D8069CEFFD6F193B01736254DA5", hash_generated_field = "980EFA6A2B53D27841C185532A5FD596")

    static final int STATE_PLAYING = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "3EA9E6AECB20C4694288BB1A98264609", hash_generated_field = "7597F5A47281EA761032DDC95EFD8646")

    static final int STATE_RELEASED = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "18CC450E4B3A37C32021860E8C8343C3", hash_generated_field = "D3C1D0BC931E22CE6A6DFBB2150EFF9F")

    protected static Timer mTimer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.829 -0400", hash_original_field = "D553B3E2F0768723E9DB1BA83F91694F", hash_generated_field = "803E0BB34E42CE66FDB6CAF172B04845")

    private static final int TIMEUPDATE_PERIOD = 250;
}

