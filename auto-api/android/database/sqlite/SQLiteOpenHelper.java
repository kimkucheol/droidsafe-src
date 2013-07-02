package android.database.sqlite;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

public abstract class SQLiteOpenHelper {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "311C2C8498DF6A626CBDB8AA4193499C", hash_generated_field = "886C24C67739C97CF77B8DD239E412F9")

    private String mName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "06389DE86ED19AB1571A41645A1AFADC", hash_generated_field = "3B314DD3362D9759017A383358149E45")

    private CursorFactory mFactory;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "8B87C38A8EA38B485FFD08DF439AE2B0", hash_generated_field = "E37741801665C28F1D0231A69288300D")

    private int mNewVersion;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "961E4258F7E74A9EAA9E39B39D6F0A80", hash_generated_field = "949BF9C4D224A2E5EB02E79597DEC6F1")

    private SQLiteDatabase mDatabase = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "A8B92F87BF2A02DD09F9992E38529E01", hash_generated_field = "F70ACE423FC74AA75F488787A63DC7D9")

    private boolean mIsInitializing = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_field = "17F47A6FF3D481E01A6A82252EB7B064", hash_generated_field = "76DD5A0A5A09A890A2237FBF965CCF6C")

    private DatabaseErrorHandler mErrorHandler;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.731 -0400", hash_original_method = "FA08D03545E9DF881DE2A492BC7B90D5", hash_generated_method = "4D6E71BB8C5F6FA87C46FD59523ADA27")
    public  SQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
        this(context, name, factory, version, new DefaultDatabaseErrorHandler());
        addTaint(context.getTaint());
        addTaint(name.getTaint());
        addTaint(factory.getTaint());
        addTaint(version);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.732 -0400", hash_original_method = "31439111717724CD584CC4C37B277BA9", hash_generated_method = "BF852381B615E75C2DCD7DAB35B59E83")
    public  SQLiteOpenHelper(Context context, String name, CursorFactory factory, int version,
            DatabaseErrorHandler errorHandler) {
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Version must be >= 1, was " + version);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
        } 
        mContext = context;
        mName = name;
        mFactory = factory;
        mNewVersion = version;
        mErrorHandler = errorHandler;
        
        
        
            
        
        
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.733 -0400", hash_original_method = "68E7432F62212BC238811FF4144A34FC", hash_generated_method = "FEDDC2B8D8BD0F043782FDC6D922759D")
    public String getDatabaseName() {
        String varB4EAC82CA7396A68D541C85D26508E83_759227918 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_759227918 = mName;
        varB4EAC82CA7396A68D541C85D26508E83_759227918.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_759227918;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.735 -0400", hash_original_method = "907737C2FD1DDBAF11A72FCBC6C42218", hash_generated_method = "E267748B64A34BEA1AC888F40BD046FF")
    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase varB4EAC82CA7396A68D541C85D26508E83_657306219 = null; 
        SQLiteDatabase varB4EAC82CA7396A68D541C85D26508E83_561061333 = null; 
        {
            {
                boolean var7569BD827A079103D7665EC50E19706D_1044077055 = (!mDatabase.isOpen());
                {
                    mDatabase = null;
                } 
                {
                    boolean var5F8D535220438AC9802CC821F137F2C6_68404177 = (!mDatabase.isReadOnly());
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_657306219 = mDatabase;
                    } 
                } 
            } 
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("getWritableDatabase called recursively");
        } 
        boolean success = false;
        SQLiteDatabase db = null;
        mDatabase.lock();
        try 
        {
            mIsInitializing = true;
            {
                db = SQLiteDatabase.create(null);
            } 
            {
                db = mContext.openOrCreateDatabase(mName, 0, mFactory, mErrorHandler);
            } 
            int version = db.getVersion();
            {
                db.beginTransaction();
                try 
                {
                    {
                        onCreate(db);
                    } 
                    {
                        {
                            onDowngrade(db, version, mNewVersion);
                        } 
                        {
                            onUpgrade(db, version, mNewVersion);
                        } 
                    } 
                    db.setVersion(mNewVersion);
                    db.setTransactionSuccessful();
                } 
                finally 
                {
                    db.endTransaction();
                } 
            } 
            onOpen(db);
            success = true;
            varB4EAC82CA7396A68D541C85D26508E83_561061333 = db;
        } 
        finally 
        {
            mIsInitializing = false;
            {
                {
                    try 
                    {
                        mDatabase.close();
                    } 
                    catch (Exception e)
                    { }
                    mDatabase.unlock();
                } 
                mDatabase = db;
            } 
            {
                mDatabase.unlock();
                db.close();
            } 
        } 
        SQLiteDatabase varA7E53CE21691AB073D9660D615818899_1008854718; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1008854718 = varB4EAC82CA7396A68D541C85D26508E83_657306219;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1008854718 = varB4EAC82CA7396A68D541C85D26508E83_561061333;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1008854718.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1008854718;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.737 -0400", hash_original_method = "2895B1DC2B2D9F1953E668AA67DA7E81", hash_generated_method = "57C3B63FAD1E8B5F7D432DB7AA5438E8")
    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase varB4EAC82CA7396A68D541C85D26508E83_1452374717 = null; 
        SQLiteDatabase varB4EAC82CA7396A68D541C85D26508E83_1458138126 = null; 
        SQLiteDatabase varB4EAC82CA7396A68D541C85D26508E83_2100189276 = null; 
        {
            {
                boolean var7569BD827A079103D7665EC50E19706D_1419459538 = (!mDatabase.isOpen());
                {
                    mDatabase = null;
                } 
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1452374717 = mDatabase;
                } 
            } 
        } 
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("getReadableDatabase called recursively");
        } 
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1458138126 = getWritableDatabase();
        } 
        catch (SQLiteException e)
        {
            if (DroidSafeAndroidRuntime.control) throw e;
        } 
        SQLiteDatabase db = null;
        try 
        {
            mIsInitializing = true;
            String path = mContext.getDatabasePath(mName).getPath();
            db = SQLiteDatabase.openDatabase(path, mFactory, SQLiteDatabase.OPEN_READONLY,
                    mErrorHandler);
            {
                boolean var65DE63E4DC58A554ED5CEE2376BDDFDC_159022391 = (db.getVersion() != mNewVersion);
                {
                    if (DroidSafeAndroidRuntime.control) throw new SQLiteException("Can't upgrade read-only database from version " +
                        db.getVersion() + " to " + mNewVersion + ": " + path);
                } 
            } 
            onOpen(db);
            mDatabase = db;
            varB4EAC82CA7396A68D541C85D26508E83_2100189276 = mDatabase;
        } 
        finally 
        {
            mIsInitializing = false;
            db.close();
        } 
        SQLiteDatabase varA7E53CE21691AB073D9660D615818899_1108446820; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1108446820 = varB4EAC82CA7396A68D541C85D26508E83_1452374717;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_1108446820 = varB4EAC82CA7396A68D541C85D26508E83_1458138126;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1108446820 = varB4EAC82CA7396A68D541C85D26508E83_2100189276;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1108446820.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1108446820;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.738 -0400", hash_original_method = "C09EB7B9D42A5A795555D7C9A56D8370", hash_generated_method = "5ABB92D91CD8F11E8F101493E91A2E5E")
    public synchronized void close() {
        if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Closed during initialization");
        {
            boolean varCBBF24DAE768B3306F58D1F814F85B3C_1585074041 = (mDatabase != null && mDatabase.isOpen());
            {
                mDatabase.close();
                mDatabase = null;
            } 
        } 
        
        
        
            
            
        
    }

    
    public abstract void onCreate(SQLiteDatabase db);

    
    public abstract void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.739 -0400", hash_original_method = "E809F845DA52B26B37A0B95640D58A46", hash_generated_method = "543C85F44FA36F9854BA366EC29124EB")
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        
        if (DroidSafeAndroidRuntime.control) throw new SQLiteException("Can't downgrade database from version " +
                oldVersion + " to " + newVersion);
        addTaint(db.getTaint());
        addTaint(oldVersion);
        addTaint(newVersion);
        
        
                
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.739 -0400", hash_original_method = "4811C8ED58A3ECFEDC0621F514E7FFAC", hash_generated_method = "114D8028AAA729F2C8D5D48D03E2C088")
    public void onOpen(SQLiteDatabase db) {
        
        addTaint(db.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:30.739 -0400", hash_original_field = "238370C77E3E3E7DCA380B58BB0FF6CF", hash_generated_field = "073F4465324B7F9FFC720DD01EEA24AC")

    private static final String TAG = SQLiteOpenHelper.class.getSimpleName();
}

