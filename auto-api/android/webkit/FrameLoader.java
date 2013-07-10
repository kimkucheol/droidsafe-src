package android.webkit;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.net.http.ErrorStrings;
import android.net.http.EventHandler;
import android.net.http.RequestHandle;
import android.os.Build;
import android.util.Log;
import android.webkit.CacheManager.CacheResult;
import android.webkit.JniUtil;
import java.util.HashMap;
import java.util.Map;

class FrameLoader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "9B3DD33B99719CE65C53FA6749E2AD69", hash_generated_field = "D7FBD6A4D07A65117411BC8C01652773")

    private LoadListener mListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "411D2DFDB93368C46AFADBEC76A54162", hash_generated_field = "46D356CEC2B798E53528C0BD5F09C873")

    private String mMethod;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "A5E11DE354AE2FBFC3E5565E23F4F865", hash_generated_field = "D4F7B9B886C1ADC785C82D3DD8AF3DFF")

    private WebSettings mSettings;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "9DA6583E4F64A78649E80D72BFE1DBCC", hash_generated_field = "A366B1C8ECA0EA3E5C2DAE5F1AFFA05D")

    private Map<String, String> mHeaders;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "AF86FBE15EC2C25B16B35C7E4DD756CA", hash_generated_field = "C5200C1F2575A09491B18B8CE6E6A375")

    private byte[] mPostData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "92BCA70246F96A0F4366A7F1448D9E16", hash_generated_field = "E0FAA2A6C497494B58133B8740B95CC3")

    private Network mNetwork;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "F54BA5590C446F577AE73077661515C5", hash_generated_field = "8C07F09E694B2A8054749812D7A11348")

    private int mCacheMode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "D0ACC05D6104FCC6E4DE0F3D0FCDE093", hash_generated_field = "D80C103FF159A690060174B576F408C0")

    private String mReferrer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "24B8797543549EFE4715ED8CFEFE95BC", hash_generated_field = "1F620CC4F21CDF80833E6AB697F4F4F7")

    private String mContentType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "0012BC49BA59EBAB5E247FD510C71F97", hash_generated_field = "DC5ABF50AC0DEDF84B387D0BCB7F8F31")

    private String mUaprofHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_field = "2976D7B4B78ED29D3465A8FCEB8A8BEB", hash_generated_field = "1E5C1AADABD2F96959CCC93C619B3FFF")

    private WebResourceResponse mInterceptResponse;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.657 -0400", hash_original_method = "E604BA5F97EB5A21051EE698F8A56155", hash_generated_method = "A206A49D0F67A967CEB547485E0E8F49")
      FrameLoader(LoadListener listener, WebSettings settings,
            String method, WebResourceResponse interceptResponse) {
        mListener = listener;
        mHeaders = null;
        mMethod = method;
        mCacheMode = WebSettings.LOAD_NORMAL;
        mSettings = settings;
        mInterceptResponse = interceptResponse;
        mUaprofHeader = mListener.getContext().getResources().getString(
                com.android.internal.R.string.config_useragentprofile_url, Build.MODEL);
        
        
        
        
        
        
        
        
        
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.658 -0400", hash_original_method = "DAE08684530294543D6392896259C957", hash_generated_method = "C37FA8544A01C6B3DB706BEFC3A18A67")
    public void setReferrer(String ref) {
        {
            boolean var922AE2E711C836132B2F09AEA7CED413_1007247246 = (URLUtil.isNetworkUrl(ref));
            mReferrer = ref;
        } 
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.658 -0400", hash_original_method = "D2C8C4DED03F288D6E8AB32DB5451075", hash_generated_method = "AFA899BAAE4627D629483619DC707622")
    public void setPostData(byte[] postData) {
        mPostData = postData;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.658 -0400", hash_original_method = "E910F46151D172102331975C2568BBCE", hash_generated_method = "FA7AB8F86BB414F666064016C84E824E")
    public void setContentTypeForPost(String postContentType) {
        mContentType = postContentType;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.658 -0400", hash_original_method = "4FD1C5F2E68FCD3B6425DADD4042F496", hash_generated_method = "07CDE86C3243F89B692735454AED33C1")
    public void setCacheMode(int cacheMode) {
        mCacheMode = cacheMode;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.659 -0400", hash_original_method = "E0E34456BA61E1D94659FB0013B44B13", hash_generated_method = "E4CBCEFCEF3480884B759040661DF0A4")
    public void setHeaders(HashMap headers) {
        mHeaders = headers;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.659 -0400", hash_original_method = "C430EEAE75F5C9BA4DF5580B50F4FE67", hash_generated_method = "2A694849A7E940804A3621185415FC20")
    public LoadListener getLoadListener() {
        LoadListener varB4EAC82CA7396A68D541C85D26508E83_1225903357 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1225903357 = mListener;
        varB4EAC82CA7396A68D541C85D26508E83_1225903357.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1225903357;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.660 -0400", hash_original_method = "C44DBC63D87836D797664A5A599046E9", hash_generated_method = "B44BD9F4796390071ADB76DEB2D349B0")
    public boolean executeLoad() {
        String url = mListener.url();
        {
            {
                boolean varDC12B1CE651184F7487BC2CD3AF93BC4_2126470894 = (mListener.isSynchronous());
                {
                    mInterceptResponse.loader(mListener).load();
                } 
                {
                    WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_ADD_STREAMLOADER,
                        mInterceptResponse.loader(mListener)).sendToTarget();
                } 
            } 
        } 
        {
            boolean var4F95E4BDE23CE2774CDB1234D95999CA_619635935 = (URLUtil.isNetworkUrl(url));
            {
                {
                    boolean var293388128A8B804CF07E61838E699C6F_1630801284 = (mSettings.getBlockNetworkLoads());
                    {
                        mListener.error(EventHandler.ERROR_BAD_URL,
                        mListener.getContext().getString(
                                com.android.internal.R.string.httpErrorBadUrl));
                    } 
                } 
                {
                    boolean var4D7320D083FD883A3E69D199AAE6E271_2037938813 = (!URLUtil.verifyURLEncoding(mListener.host()));
                    {
                        mListener.error(EventHandler.ERROR_BAD_URL,
                        mListener.getContext().getString(
                        com.android.internal.R.string.httpErrorBadUrl));
                    } 
                } 
                mNetwork = Network.getInstance(mListener.getContext());
                {
                    boolean var8E4B83D5369E9679F86F05C0F7F7EDBD_979342280 = (mListener.isSynchronous());
                    {
                        boolean var519A1E3519349B18390578A9A8AAE9C6_286217394 = (handleHTTPLoad());
                    } 
                } 
                WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_ADD_HTTPLOADER, this).sendToTarget();
            } 
            {
                boolean var972F9ADE02003E2BF81443517B71BC8F_1361783766 = (handleLocalFile(url, mListener, mSettings));
            } 
        } 
        mListener.error(EventHandler.ERROR_UNSUPPORTED_SCHEME,
                mListener.getContext().getText(
                        com.android.internal.R.string.httpErrorUnsupportedScheme).toString());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_187374131 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_187374131;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean handleLocalFile(String url, LoadListener loadListener,
            WebSettings settings) {
        assert !JniUtil.useChromiumHttpStack();
        try {
            url = new String(URLUtil.decode(url.getBytes()));
        } catch (IllegalArgumentException e) {
            loadListener.error(EventHandler.ERROR_BAD_URL,
                    loadListener.getContext().getString(
                            com.android.internal.R.string.httpErrorBadUrl));
            return true;
        }
        if (URLUtil.isAssetUrl(url)) {
            if (loadListener.isSynchronous()) {
                new FileLoader(url, loadListener, FileLoader.TYPE_ASSET,
                        true).load();
            } else {
                WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_ADD_STREAMLOADER,
                        new FileLoader(url, loadListener, FileLoader.TYPE_ASSET,
                                true)).sendToTarget();
            }
            return true;
        } else if (URLUtil.isResourceUrl(url)) {
            if (loadListener.isSynchronous()) {
                new FileLoader(url, loadListener, FileLoader.TYPE_RES,
                        true).load();
            } else {
                WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_ADD_STREAMLOADER,
                        new FileLoader(url, loadListener, FileLoader.TYPE_RES,
                                true)).sendToTarget();
            }
            return true;
        } else if (URLUtil.isFileUrl(url)) {
            if (loadListener.isSynchronous()) {
                new FileLoader(url, loadListener, FileLoader.TYPE_FILE,
                        settings.getAllowFileAccess()).load();
            } else {
                WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_ADD_STREAMLOADER,
                        new FileLoader(url, loadListener, FileLoader.TYPE_FILE,
                                settings.getAllowFileAccess())).sendToTarget();
            }
            return true;
        } else if (settings.getAllowContentAccess() &&
                   URLUtil.isContentUrl(url)) {
            if (loadListener.isSynchronous()) {
                new ContentLoader(loadListener.url(), loadListener).load();
            } else {
                WebViewWorker.getHandler().obtainMessage(
                        WebViewWorker.MSG_ADD_STREAMLOADER,
                        new ContentLoader(loadListener.url(), loadListener))
                        .sendToTarget();
            }
            return true;
        } else if (URLUtil.isDataUrl(url)) {
            new DataLoader(url, loadListener).load();
            return true;
        } else if (URLUtil.isAboutUrl(url)) {
            loadListener.data(mAboutBlank.getBytes(), mAboutBlank.length());
            loadListener.endData();
            return true;
        }
        return false;
    }

    
    @DSModeled(DSC.SPEC)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.662 -0400", hash_original_method = "24B8F725DD0D2F171F529FAFE2897245", hash_generated_method = "1B6F4FD03343E93149F0A7BB5ED52804")
     boolean handleHTTPLoad() {
        {
            mHeaders = new HashMap<String, String>();
        } 
        populateStaticHeaders();
        populateHeaders();
        {
            boolean var9199F4C173F71DEA77808833A6EB5244_1314049959 = (handleCache());
            {
                mListener.setRequestData(mMethod, mHeaders, mPostData);
            } 
        } 
        boolean ret = false;
        int error = EventHandler.ERROR_UNSUPPORTED_SCHEME;
        try 
        {
            ret = mNetwork.requestURL(mMethod, mHeaders,
                    mPostData, mListener);
        } 
        catch (android.net.ParseException ex)
        {
            error = EventHandler.ERROR_BAD_URL;
        } 
        catch (java.lang.RuntimeException ex)
        {
            error = EventHandler.ERROR_BAD_URL;
        } 
        {
            mListener.error(error, ErrorStrings.getString(error, mListener.getContext()));
        } 
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_61453051 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_61453051;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.662 -0400", hash_original_method = "D628211A63EBF198D6007A9671F95672", hash_generated_method = "E4A940D663908C051688414F7A1AC087")
    private void startCacheLoad(CacheResult result) {
        CacheLoader cacheLoader = new CacheLoader(mListener, result);
        mListener.setCacheLoader(cacheLoader);
        {
            boolean var421DBB609B44F2D84DDA3573FCA0EFE3_1796652352 = (mListener.isSynchronous());
            {
                cacheLoader.load();
            } 
            {
                WebViewWorker.getHandler().obtainMessage(
                    WebViewWorker.MSG_ADD_STREAMLOADER, cacheLoader).sendToTarget();
            } 
        } 
        addTaint(result.getTaint());
        
        
            
                  
        
        
                
        
        
            
        
            
                    
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.663 -0400", hash_original_method = "ED6284595A2927F289F312ED71C4BF2D", hash_generated_method = "E0C8E5B35D95DCBEFAF6C2BC2A8B1157")
    private boolean handleCache() {
        
        {
            CacheResult result = CacheManager.getCacheFile(mListener.url(),
                        mListener.postIdentifier(), null);
            {
                startCacheLoad(result);
            } 
            {
                int err = EventHandler.FILE_NOT_FOUND_ERROR;
                mListener.error(err,
                            ErrorStrings.getString(err, mListener.getContext()));
            } 
        } 
        
        
        {
            CacheResult result = CacheManager.getCacheFile(mListener.url(),
                        mListener.postIdentifier(), null);
            {
                startCacheLoad(result);
            } 
        } 
        
        
        boolean var362521B747867FCBBD590C55C27ADA13_764343465 = (mListener.checkCache(mHeaders));
        
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2045199272 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2045199272;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.663 -0400", hash_original_method = "2D0BB20A4C7261DEBC8826658FC12230", hash_generated_method = "A9697EDB603AEECBE72DF93898AA1663")
    private void populateStaticHeaders() {
        String accept = mHeaders.get("Accept");
        {
            boolean var353782AD537F075DB95ABEC34D405E80_959532859 = (accept == null || accept.length() == 0);
            {
                mHeaders.put("Accept", HEADER_STR);
            } 
        } 
        mHeaders.put("Accept-Charset", "utf-8, iso-8859-1, utf-16, *;q=0.7");
        String acceptLanguage = mSettings.getAcceptLanguage();
        {
            boolean var7E59D9D12F1F68F2FDA010D34D39C4BF_1760911936 = (acceptLanguage.length() > 0);
            {
                mHeaders.put("Accept-Language", acceptLanguage);
            } 
        } 
        mHeaders.put("User-Agent", mSettings.getUserAgentString());
        {
            boolean varDE1D6E5B2446D52EDEE8BF319F19138D_1786234853 = (mUaprofHeader != null && mUaprofHeader.length() > 0);
            {
                mHeaders.put("x-wap-profile", mUaprofHeader);
            } 
        } 
        
        
        
            
        
        
        
        
            
        
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_method = "FC5DAD276D63BF9B93BD19919189EAE8", hash_generated_method = "0875DD7503FA6A977B8A8A03365FC1CD")
    private void populateHeaders() {
        mHeaders.put("Referer", mReferrer);
        mHeaders.put(CONTENT_TYPE, mContentType);
        {
            boolean varFB7727304C578C78AD2EA70B6435E572_1558602274 = (mNetwork.isValidProxySet());
            {
                String username;
                String password;
                {
                    username = mNetwork.getProxyUsername();
                    password = mNetwork.getProxyPassword();
                } 
                {
                    String proxyHeader = RequestHandle.authorizationHeader(true);
                    mHeaders.put(proxyHeader,
                        "Basic " + RequestHandle.computeBasicAuthResponse(
                                username, password));
                } 
            } 
        } 
        String cookie = CookieManager.getInstance().getCookie(
                mListener.getWebAddress());
        {
            boolean var6E2855FE1453DF0044F1B1E343DD13F2_459100939 = (cookie != null && cookie.length() > 0);
            {
                mHeaders.put("Cookie", cookie);
            } 
        } 
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_field = "9C7D7F9ADBEF14BF8D36BF8372641839", hash_generated_field = "EB2ACDA5CCC677A93D03B81217EE2CA1")

    private static final int URI_PROTOCOL = 0x100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_field = "3A558F5CAC0A7C913876ED4BEB31EAFC", hash_generated_field = "E9E9985B4D9BEACB3E20B77FBDAC6013")

    private static final String CONTENT_TYPE = "content-type";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_field = "740BA245928812A52724E4131E81A743", hash_generated_field = "36FEC7407939A642CEE5B978BA5EE272")

    private static final String mAboutBlank = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EB\">" +
            "<html><head><title>about:blank</title></head><body></body></html>";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_field = "50162879797A1E7821CDF8CDC1EE9986", hash_generated_field = "0A81A03C8AD82EEC7F102EB79209347D")

    static final String HEADER_STR = "text/xml, text/html, " +
            "application/xhtml+xml, image/png, text/plain, */*;q=0.8";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.664 -0400", hash_original_field = "9722F24E24D81405093C0E61AAF58518", hash_generated_field = "061362C112C980EB4954480FBAFBE378")

    private static final String LOGTAG = "webkit";
}

