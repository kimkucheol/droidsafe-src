package android.preference;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;

public class EditTextPreference extends DialogPreference {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.816 -0400", hash_original_field = "2AB1BE4B6823B3E4EBFA67B16F6DBB6D", hash_generated_field = "586B4299BBF875661CEB2131396A9E01")

    private EditText mEditText;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.816 -0400", hash_original_field = "39624508B9E3028D8A5DDA741D3E3DDE", hash_generated_field = "2EBA23F479A3FA4159B4CC40D57E4F25")

    private String mText;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.817 -0400", hash_original_method = "1B48EB5F8CF3DC4D984298B6B0C90D10", hash_generated_method = "9C8ACC8DA4F9DB29C5C780D2AE6D59EE")
    public  EditTextPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mEditText = new EditText(context, attrs);
        mEditText.setId(com.android.internal.R.id.edit);
        mEditText.setEnabled(true);
        addTaint(defStyle);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.817 -0400", hash_original_method = "494CFEDBEF358096AFA1B35C2A3DFF6C", hash_generated_method = "B5B502155FD74A28D5C31CE262A63AFD")
    public  EditTextPreference(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.editTextPreferenceStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.817 -0400", hash_original_method = "204E2C5BC38780F40E54ECF3FAD0BB5A", hash_generated_method = "A6110716D094C1A6EEAE9E3257EA862E")
    public  EditTextPreference(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.818 -0400", hash_original_method = "CEF16EBC31082C193A3B95CCEE8E6067", hash_generated_method = "8BAEA5ED317996EFC0416235F8A9FFFC")
    public void setText(String text) {
        final boolean wasBlocking = shouldDisableDependents();
        mText = text;
        persistString(text);
        final boolean isBlocking = shouldDisableDependents();
        {
            notifyDependencyChange(isBlocking);
        } 
        
        
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.818 -0400", hash_original_method = "2FFFCC59A442EF1196B854805331F3A7", hash_generated_method = "7093B3269E9726F5A291B942DC0CDE00")
    public String getText() {
        String varB4EAC82CA7396A68D541C85D26508E83_344767649 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_344767649 = mText;
        varB4EAC82CA7396A68D541C85D26508E83_344767649.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_344767649;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.819 -0400", hash_original_method = "D07B0890C399F21AD31B9014C9722593", hash_generated_method = "4037425B7ECBCFD5080744C15605167E")
    @Override
    protected void onBindDialogView(View view) {
        
        super.onBindDialogView(view);
        EditText editText = mEditText;
        editText.setText(getText());
        ViewParent oldParent = editText.getParent();
        {
            {
                ((ViewGroup) oldParent).removeView(editText);
            } 
            onAddEditTextToDialogView(view, editText);
        } 
        addTaint(view.getTaint());
        
        
        
        
        
        
            
                
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.820 -0400", hash_original_method = "F11E8CFFE1E2D808987B2E38C68D609A", hash_generated_method = "2F38FB0AD41E5AAA7D7E1FEB54441319")
    protected void onAddEditTextToDialogView(View dialogView, EditText editText) {
        
        ViewGroup container = (ViewGroup) dialogView
                .findViewById(com.android.internal.R.id.edittext_container);
        {
            container.addView(editText, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        } 
        addTaint(dialogView.getTaint());
        addTaint(editText.getTaint());
        
        
                
        
            
                    
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.820 -0400", hash_original_method = "72D88295ED5747003A75C3EC7A0816A7", hash_generated_method = "4731F06471BF9E906896288A08FD8AEB")
    @Override
    protected void onDialogClosed(boolean positiveResult) {
        
        super.onDialogClosed(positiveResult);
        {
            String value = mEditText.getText().toString();
            {
                boolean var48E48921DA53707F97C7F6D085D7ADDB_1974577472 = (callChangeListener(value));
                {
                    setText(value);
                } 
            } 
        } 
        addTaint(positiveResult);
        
        
        
            
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.821 -0400", hash_original_method = "617E38A3300A64CD810B1ADC15B8238E", hash_generated_method = "8CC0CE4E6D0640E837656AF6F46BF544")
    @Override
    protected Object onGetDefaultValue(TypedArray a, int index) {
        
        Object varB4EAC82CA7396A68D541C85D26508E83_1255559132 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1255559132 = a.getString(index);
        addTaint(a.getTaint());
        addTaint(index);
        varB4EAC82CA7396A68D541C85D26508E83_1255559132.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1255559132;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.821 -0400", hash_original_method = "5BF4BAC56AB2C13ADD22317FD43163DE", hash_generated_method = "36C43A0C50DD9D5074DC15C6ADF2FFD8")
    @Override
    protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
        
        setText(restoreValue ? getPersistedString(mText) : (String) defaultValue);
        addTaint(restoreValue);
        addTaint(defaultValue.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.822 -0400", hash_original_method = "F5D013C02C2861F04CB4C321BCA17B16", hash_generated_method = "5B0698A7C50AFF5A3B31FD7231FBDE6C")
    @Override
    public boolean shouldDisableDependents() {
        boolean varCB5373E5EBBD696F207E1076E22918F0_1550578459 = (TextUtils.isEmpty(mText) || super.shouldDisableDependents());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1302927902 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1302927902;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.822 -0400", hash_original_method = "25F3ADCBABEE77EF933107206F4A63FB", hash_generated_method = "0C3AF98A31A069BCAE541B58159F7AF7")
    public EditText getEditText() {
        EditText varB4EAC82CA7396A68D541C85D26508E83_1433811636 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1433811636 = mEditText;
        varB4EAC82CA7396A68D541C85D26508E83_1433811636.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1433811636;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.823 -0400", hash_original_method = "7FAD769054190EA8D5B257F9884DACB8", hash_generated_method = "3CE674F69E1F44A323480F0E88CC7BA4")
    @Override
    protected boolean needInputMethod() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1203473068 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1203473068;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.823 -0400", hash_original_method = "D74BC4DC00378E9BF3AD83FB4C28C295", hash_generated_method = "B23D2D8C42D53A2346D2CED977AB5F82")
    @Override
    protected Parcelable onSaveInstanceState() {
        
        Parcelable varB4EAC82CA7396A68D541C85D26508E83_1313495474 = null; 
        Parcelable varB4EAC82CA7396A68D541C85D26508E83_440396164 = null; 
        final Parcelable superState = super.onSaveInstanceState();
        {
            boolean varA5BC476CED9D472D4630C0C0B6120523_2014292582 = (isPersistent());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1313495474 = superState;
            } 
        } 
        final SavedState myState = new SavedState(superState);
        myState.text = getText();
        varB4EAC82CA7396A68D541C85D26508E83_440396164 = myState;
        Parcelable varA7E53CE21691AB073D9660D615818899_1500375876; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1500375876 = varB4EAC82CA7396A68D541C85D26508E83_1313495474;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1500375876 = varB4EAC82CA7396A68D541C85D26508E83_440396164;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1500375876.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1500375876;
        
        
        
            
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.824 -0400", hash_original_method = "FDF67462F1789AF80412C105807187A6", hash_generated_method = "07C1EB23FF0677219DD6D59985A3336F")
    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        
        {
            boolean var9146082C23BCEB2285F1054C3B9F84EE_490702425 = (state == null || !state.getClass().equals(SavedState.class));
            {
                super.onRestoreInstanceState(state);
            } 
        } 
        SavedState myState = (SavedState) state;
        super.onRestoreInstanceState(myState.getSuperState());
        setText(myState.text);
        addTaint(state.getTaint());
        
        
            
            
        
        
        
        
    }

    
    private static class SavedState extends BaseSavedState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.824 -0400", hash_original_field = "1CB251EC0D568DE6A929B520C4AED8D1", hash_generated_field = "9EF4B8A5DE4B8BD37EE465C3BB62CC6C")

        String text;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.824 -0400", hash_original_method = "9235B16AEF1C4BC8E8C8B3CF552C8FA1", hash_generated_method = "638A08099505311B0010823A10F7B50D")
        public  SavedState(Parcel source) {
            super(source);
            text = source.readString();
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.825 -0400", hash_original_method = "89EB4EC154F05BF905ECA8E02BBD14BC", hash_generated_method = "AB11810075E98F66089A29D0DD89C4B4")
        public  SavedState(Parcelable superState) {
            super(superState);
            addTaint(superState.getTaint());
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.825 -0400", hash_original_method = "A36EF7056AEE816C6C1E1134145BD2DB", hash_generated_method = "97623166751F91E9CA64580982E11C63")
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeString(text);
            addTaint(dest.getTaint());
            addTaint(flags);
            
            
            
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:43.825 -0400", hash_original_field = "7DF6FB2587CB67E9544A859A8F6E8FF3", hash_generated_field = "263FCDD65C2156B1D1E1B4D9AE8D7FFA")

        public static final Parcelable.Creator<SavedState> CREATOR =
                new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        
        public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }
        
        
        public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        
    }


    
}

