package android.preference;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;

public abstract class TwoStatePreference extends Preference {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.814 -0400", hash_original_field = "16D20186D5AA4CF4BF1132594D02BA75", hash_generated_field = "0A63C4508093BBBDC63A916183312B21")

    private CharSequence mSummaryOn;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.814 -0400", hash_original_field = "B78FF240CB74BC7C7CDDCEB5DC4DDDFF", hash_generated_field = "7936F2388E5FECE5D26263562952AF1C")

    private CharSequence mSummaryOff;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.814 -0400", hash_original_field = "B7985199D35C1155A55567C458443B15", hash_generated_field = "2095822BEB25A977611B30C48AE7794D")

    boolean mChecked;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.814 -0400", hash_original_field = "BA02A487DDDF80B1BCEFB080B47DA49C", hash_generated_field = "35334A485195E89BB569733AA9D3EF56")

    private boolean mSendClickAccessibilityEvent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.814 -0400", hash_original_field = "B485C56B2E2F60A8579BB8CCE5F5F8B6", hash_generated_field = "A45150049825FDCDA3DE269C67272345")

    private boolean mDisableDependentsState;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.815 -0400", hash_original_method = "9308B3B15F4DE8F7508C8EA50D56D8AD", hash_generated_method = "25DBA64900E9B3AE70991F314184257B")
    public  TwoStatePreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(defStyle);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.815 -0400", hash_original_method = "069F398059373859493FBC4CB93F22AA", hash_generated_method = "5D1A159E1EDD41237E37B3284CA56407")
    public  TwoStatePreference(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.815 -0400", hash_original_method = "DE7459DE73702557DE26E7B158A3632F", hash_generated_method = "1C73A2C1F02E9B56C524EA06321EA376")
    public  TwoStatePreference(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.816 -0400", hash_original_method = "41BF424D5DCED4AFC88BB1561E7758B1", hash_generated_method = "F85F5ACE579E4237BAE1A8EEC96CAA96")
    @Override
    protected void onClick() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onClick();
        boolean newValue = !isChecked();
        mSendClickAccessibilityEvent = true;
    if(!callChangeListener(newValue))        
        {
            return;
        } //End block
        setChecked(newValue);
        // ---------- Original Method ----------
        //super.onClick();
        //boolean newValue = !isChecked();
        //mSendClickAccessibilityEvent = true;
        //if (!callChangeListener(newValue)) {
            //return;
        //}
        //setChecked(newValue);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.816 -0400", hash_original_method = "12D9CEBA0208655576D33A98ED54981A", hash_generated_method = "FCB722B53DB1EFADEF31625EE7EE4BCE")
    public void setChecked(boolean checked) {
    if(mChecked != checked)        
        {
            mChecked = checked;
            persistBoolean(checked);
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        } //End block
        // ---------- Original Method ----------
        //if (mChecked != checked) {
            //mChecked = checked;
            //persistBoolean(checked);
            //notifyDependencyChange(shouldDisableDependents());
            //notifyChanged();
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.816 -0400", hash_original_method = "1057BD246BBC96B40BF6B862055C5AB8", hash_generated_method = "EDF50AE1C6B6036FF283C24C1D9FE156")
    public boolean isChecked() {
        boolean varB7985199D35C1155A55567C458443B15_141955919 = (mChecked);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1273745512 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1273745512;
        // ---------- Original Method ----------
        //return mChecked;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.817 -0400", hash_original_method = "4E403BDF8313BB473693F04068F62649", hash_generated_method = "576BF00A99A7914608FF791F7A07F573")
    @Override
    public boolean shouldDisableDependents() {
        boolean shouldDisable = mDisableDependentsState ? mChecked : !mChecked;
        boolean var9293DB48DDC70F24637FC9558F6C4405_1463906454 = (shouldDisable || super.shouldDisableDependents());
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1087309603 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1087309603;
        // ---------- Original Method ----------
        //boolean shouldDisable = mDisableDependentsState ? mChecked : !mChecked;
        //return shouldDisable || super.shouldDisableDependents();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.817 -0400", hash_original_method = "ABD6122B04EABCC29A2D57307245871E", hash_generated_method = "8C5E1C28B09728942892A3304640D660")
    public void setSummaryOn(CharSequence summary) {
        mSummaryOn = summary;
    if(isChecked())        
        {
            notifyChanged();
        } //End block
        // ---------- Original Method ----------
        //mSummaryOn = summary;
        //if (isChecked()) {
            //notifyChanged();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.818 -0400", hash_original_method = "840A2DF332BCD4D47FC113ECD5767E5E", hash_generated_method = "63364D1BFCEBB03223B66404D3DEE4D4")
    public void setSummaryOn(int summaryResId) {
        addTaint(summaryResId);
        setSummaryOn(getContext().getString(summaryResId));
        // ---------- Original Method ----------
        //setSummaryOn(getContext().getString(summaryResId));
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.818 -0400", hash_original_method = "53022197E36EDF9F1FD4F6F19ADFC277", hash_generated_method = "C7A228DFDBEFA8AA82A35352BE16447B")
    public CharSequence getSummaryOn() {
CharSequence varD1E749C94F9B28E16C4A47C78F19D8A5_830371426 =         mSummaryOn;
        varD1E749C94F9B28E16C4A47C78F19D8A5_830371426.addTaint(taint);
        return varD1E749C94F9B28E16C4A47C78F19D8A5_830371426;
        // ---------- Original Method ----------
        //return mSummaryOn;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.818 -0400", hash_original_method = "D2C60679B7A2716D92F9A6A90EE31D5E", hash_generated_method = "F161A57C5FFA118076F8F82DB07C7BA0")
    public void setSummaryOff(CharSequence summary) {
        mSummaryOff = summary;
    if(!isChecked())        
        {
            notifyChanged();
        } //End block
        // ---------- Original Method ----------
        //mSummaryOff = summary;
        //if (!isChecked()) {
            //notifyChanged();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.819 -0400", hash_original_method = "A777E36B9565634072F09AB599AD44D9", hash_generated_method = "1E81C7B3FC3B0BA36BC120C5EA9A61D9")
    public void setSummaryOff(int summaryResId) {
        addTaint(summaryResId);
        setSummaryOff(getContext().getString(summaryResId));
        // ---------- Original Method ----------
        //setSummaryOff(getContext().getString(summaryResId));
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.819 -0400", hash_original_method = "71CAEB9E0C109885D80E1240FC68BC2D", hash_generated_method = "4826EE37B0EA60AE25A6CF352873E112")
    public CharSequence getSummaryOff() {
CharSequence var2641568191E73DF01E4F2B182167672C_983144272 =         mSummaryOff;
        var2641568191E73DF01E4F2B182167672C_983144272.addTaint(taint);
        return var2641568191E73DF01E4F2B182167672C_983144272;
        // ---------- Original Method ----------
        //return mSummaryOff;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.819 -0400", hash_original_method = "3884E74D45C3003321F5E57E22265849", hash_generated_method = "B797877B36ABA1FEA810E904897DDA1A")
    public boolean getDisableDependentsState() {
        boolean varB485C56B2E2F60A8579BB8CCE5F5F8B6_415400612 = (mDisableDependentsState);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_250334521 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_250334521;
        // ---------- Original Method ----------
        //return mDisableDependentsState;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.820 -0400", hash_original_method = "DD37671E97B19E2FAA5E6DF537625889", hash_generated_method = "74CF59A9D65521DE993E4BF0B8B81534")
    public void setDisableDependentsState(boolean disableDependentsState) {
        mDisableDependentsState = disableDependentsState;
        // ---------- Original Method ----------
        //mDisableDependentsState = disableDependentsState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.820 -0400", hash_original_method = "CD855B5FF5EBE7A616F45EDA9F1DAEC1", hash_generated_method = "24393DB6F60619158D294F48E7ACFED4")
    @Override
    protected Object onGetDefaultValue(TypedArray a, int index) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(index);
        addTaint(a.getTaint());
Object varB9D762988BDD10E681231DA7DDF58A47_217004030 =         a.getBoolean(index, false);
        varB9D762988BDD10E681231DA7DDF58A47_217004030.addTaint(taint);
        return varB9D762988BDD10E681231DA7DDF58A47_217004030;
        // ---------- Original Method ----------
        //return a.getBoolean(index, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.820 -0400", hash_original_method = "EEED4140B5DC5D316316DEC318D41EA8", hash_generated_method = "33CFD44B8D8C5A7E246299C2CFF88B20")
    @Override
    protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(defaultValue.getTaint());
        addTaint(restoreValue);
        setChecked(restoreValue ? getPersistedBoolean(mChecked)
                : (Boolean) defaultValue);
        // ---------- Original Method ----------
        //setChecked(restoreValue ? getPersistedBoolean(mChecked)
                //: (Boolean) defaultValue);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.821 -0400", hash_original_method = "6184398C925EDFB35C067E47CDB9F78F", hash_generated_method = "1AB232AA6D212D4C771A6F9B34F900BB")
     void sendAccessibilityEvent(View view) {
        addTaint(view.getTaint());
        AccessibilityManager accessibilityManager = AccessibilityManager.getInstance(getContext());
    if(mSendClickAccessibilityEvent && accessibilityManager.isEnabled())        
        {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(AccessibilityEvent.TYPE_VIEW_CLICKED);
            view.onInitializeAccessibilityEvent(event);
            view.dispatchPopulateAccessibilityEvent(event);
            accessibilityManager.sendAccessibilityEvent(event);
        } //End block
        mSendClickAccessibilityEvent = false;
        // ---------- Original Method ----------
        //AccessibilityManager accessibilityManager = AccessibilityManager.getInstance(getContext());
        //if (mSendClickAccessibilityEvent && accessibilityManager.isEnabled()) {
            //AccessibilityEvent event = AccessibilityEvent.obtain();
            //event.setEventType(AccessibilityEvent.TYPE_VIEW_CLICKED);
            //view.onInitializeAccessibilityEvent(event);
            //view.dispatchPopulateAccessibilityEvent(event);
            //accessibilityManager.sendAccessibilityEvent(event);
        //}
        //mSendClickAccessibilityEvent = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.821 -0400", hash_original_method = "901B0F4CA28424233D996D3F63CA3D29", hash_generated_method = "9C8EC085D03E52E48D7FA262BECD9E5C")
     void syncSummaryView(View view) {
        addTaint(view.getTaint());
        TextView summaryView = (TextView) view.findViewById(com.android.internal.R.id.summary);
    if(summaryView != null)        
        {
            boolean useDefaultSummary = true;
    if(mChecked && mSummaryOn != null)            
            {
                summaryView.setText(mSummaryOn);
                useDefaultSummary = false;
            } //End block
            else
    if(!mChecked && mSummaryOff != null)            
            {
                summaryView.setText(mSummaryOff);
                useDefaultSummary = false;
            } //End block
    if(useDefaultSummary)            
            {
                final CharSequence summary = getSummary();
    if(summary != null)                
                {
                    summaryView.setText(summary);
                    useDefaultSummary = false;
                } //End block
            } //End block
            int newVisibility = View.GONE;
    if(!useDefaultSummary)            
            {
                newVisibility = View.VISIBLE;
            } //End block
    if(newVisibility != summaryView.getVisibility())            
            {
                summaryView.setVisibility(newVisibility);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.822 -0400", hash_original_method = "128E228DA264F73B8973AB4629CC5B53", hash_generated_method = "BA658BBFBF6888DEA91AAFF7C75779A1")
    @Override
    protected Parcelable onSaveInstanceState() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        final Parcelable superState = super.onSaveInstanceState();
    if(isPersistent())        
        {
Parcelable varBA7A3E641095ABD11C9DBE16D47F122C_120267207 =             superState;
            varBA7A3E641095ABD11C9DBE16D47F122C_120267207.addTaint(taint);
            return varBA7A3E641095ABD11C9DBE16D47F122C_120267207;
        } //End block
        final SavedState myState = new SavedState(superState);
        myState.checked = isChecked();
Parcelable varA730247CC64767D7A83D25979CFF71FB_1820847150 =         myState;
        varA730247CC64767D7A83D25979CFF71FB_1820847150.addTaint(taint);
        return varA730247CC64767D7A83D25979CFF71FB_1820847150;
        // ---------- Original Method ----------
        //final Parcelable superState = super.onSaveInstanceState();
        //if (isPersistent()) {
            //return superState;
        //}
        //final SavedState myState = new SavedState(superState);
        //myState.checked = isChecked();
        //return myState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.822 -0400", hash_original_method = "391D589FD70A1E2CE27C524E3DFC61F4", hash_generated_method = "0A2478405B9808E6AFE1A6511FF6B2F6")
    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(state.getTaint());
    if(state == null || !state.getClass().equals(SavedState.class))        
        {
            super.onRestoreInstanceState(state);
            return;
        } //End block
        SavedState myState = (SavedState) state;
        super.onRestoreInstanceState(myState.getSuperState());
        setChecked(myState.checked);
        // ---------- Original Method ----------
        //if (state == null || !state.getClass().equals(SavedState.class)) {
            //super.onRestoreInstanceState(state);
            //return;
        //}
        //SavedState myState = (SavedState) state;
        //super.onRestoreInstanceState(myState.getSuperState());
        //setChecked(myState.checked);
    }

    
    static class SavedState extends BaseSavedState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.823 -0400", hash_original_field = "3793EA52A7BE2D7DEAFD858FDA50775C", hash_generated_field = "6F0D05495423C9405B09D32CCA18EA7F")

        boolean checked;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.823 -0400", hash_original_method = "BB6B7FCEDF34CA74F36D6258486FF337", hash_generated_method = "49AC5E3B0A809768E3B5980304872239")
        public  SavedState(Parcel source) {
            super(source);
            checked = source.readInt() == 1;
            // ---------- Original Method ----------
            //checked = source.readInt() == 1;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.823 -0400", hash_original_method = "89EB4EC154F05BF905ECA8E02BBD14BC", hash_generated_method = "AB11810075E98F66089A29D0DD89C4B4")
        public  SavedState(Parcelable superState) {
            super(superState);
            addTaint(superState.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.824 -0400", hash_original_method = "5F0C2D7310332C4BBDEFEA2518DC2D5F", hash_generated_method = "980ACDE293416983A34F34555E490FA3")
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            addTaint(flags);
            addTaint(dest.getTaint());
            super.writeToParcel(dest, flags);
            dest.writeInt(checked ? 1 : 0);
            // ---------- Original Method ----------
            //super.writeToParcel(dest, flags);
            //dest.writeInt(checked ? 1 : 0);
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:34.824 -0400", hash_original_field = "7DF6FB2587CB67E9544A859A8F6E8FF3", hash_generated_field = "263FCDD65C2156B1D1E1B4D9AE8D7FFA")

        public static final Parcelable.Creator<SavedState> CREATOR =
                new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        // orphaned legacy method
        public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }
        
        // orphaned legacy method
        public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        
    }


    
}

