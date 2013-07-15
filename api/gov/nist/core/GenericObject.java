package gov.nist.core;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.lang.reflect.*;
import java.io.Serializable;
import java.util.*;

public abstract class GenericObject implements Serializable, Cloneable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.175 -0400", hash_original_field = "449072E30B43D04B744F22522A880818", hash_generated_field = "3BB4EF50B1D217FA88F0841635612381")

    protected int indentation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.175 -0400", hash_original_field = "494C9560B4D085454F43F2CC050768A4", hash_generated_field = "9E5739E35654F3700B4DC02E1276C03E")

    protected String stringRepresentation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.175 -0400", hash_original_field = "8A586A72E3C2C66C051718676CE8506A", hash_generated_field = "1FBB25CEF289694DDD0EE719A8EBD93D")

    protected Match matchExpression;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.175 -0400", hash_original_method = "26BB6C9083355DA218DE35B50B1395A1", hash_generated_method = "A848942BE08E69D42E88C40CE7E5C52A")
    protected  GenericObject() {
        indentation = 0;
        stringRepresentation = "";
        // ---------- Original Method ----------
        //indentation = 0;
        //stringRepresentation = "";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.176 -0400", hash_original_method = "D09804B85BA352DF07D45D843F3B447E", hash_generated_method = "034F1D68F366341DE6953291B76E8A29")
    public void setMatcher(Match matchExpression) {
    if(matchExpression == null)        
        {
        IllegalArgumentException var053881D20B3B8151BB5016293D40B619_1465723545 = new IllegalArgumentException("null arg!");
        var053881D20B3B8151BB5016293D40B619_1465723545.addTaint(taint);
        throw var053881D20B3B8151BB5016293D40B619_1465723545;
        }
        this.matchExpression = matchExpression;
        // ---------- Original Method ----------
        //if (matchExpression == null)
            //throw new IllegalArgumentException("null arg!");
        //this.matchExpression = matchExpression;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.176 -0400", hash_original_method = "5F1EBA3A7EC51605C965562331E40E61", hash_generated_method = "B2181455E3C2CDB6B2B1382E94BDD7EB")
    public Match getMatcher() {
Match var07D3D711528CBAE19CEE0BCA651B1D5B_2113299828 =         matchExpression;
        var07D3D711528CBAE19CEE0BCA651B1D5B_2113299828.addTaint(taint);
        return var07D3D711528CBAE19CEE0BCA651B1D5B_2113299828;
        // ---------- Original Method ----------
        //return matchExpression;
    }

    
        @DSModeled(DSC.SAFE)
    public static Class<?> getClassFromName(String className) {
        try {
            return Class.forName(className);
        } catch (Exception ex) {
            InternalErrorHandler.handleException(ex);
            return null;
        }
    }

    
        @DSModeled(DSC.SAFE)
    public static boolean isMySubclass(Class<?> other) {
        return GenericObject.class.isAssignableFrom(other);
    }

    
        public static Object makeClone(Object obj) {
        if (obj == null)
            throw new NullPointerException("null obj!");
        Class<?> c = obj.getClass();
        Object clone_obj = obj;
        if (immutableClasses.contains (c))
            return obj;
        else if (c.isArray ()) {
            Class<?> ec = c.getComponentType();
            if (! ec.isPrimitive())
                clone_obj = ((Object []) obj).clone();
            else {
                if (ec == Character.TYPE)
                    clone_obj = ((char []) obj).clone();
                else if (ec == Boolean.TYPE)
                    clone_obj = ((boolean []) obj).clone();
                if (ec == Byte.TYPE)
                    clone_obj = ((byte []) obj).clone();
                else if (ec == Short.TYPE)
                    clone_obj = ((short []) obj).clone();
                else if (ec == Integer.TYPE)
                    clone_obj = ((int []) obj).clone();
                else if (ec == Long.TYPE)
                    clone_obj = ((long []) obj).clone();
                else if (ec == Float.TYPE)
                    clone_obj = ((float []) obj).clone();
                else if (ec == Double.TYPE)
                    clone_obj = ((double []) obj).clone();
            }
        } else if (GenericObject.class.isAssignableFrom (c))
            clone_obj = ((GenericObject) obj).clone();
        else if (GenericObjectList.class.isAssignableFrom (c))
            clone_obj = ((GenericObjectList) obj).clone();
        else if (Cloneable.class.isAssignableFrom (c)) {
            try {
                Method meth = c.getMethod("clone", (Class[]) null);
                clone_obj = meth.invoke(obj,(Object[]) null);
            } catch (SecurityException ex) {
            } catch (IllegalArgumentException ex) {
                InternalErrorHandler.handleException(ex);
            } catch (IllegalAccessException ex) {
            } catch (InvocationTargetException ex) {
            } catch (NoSuchMethodException ex) {
            }
        }
        return clone_obj;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.177 -0400", hash_original_method = "2321A1A51988B1008E8A21E8D40DF48D", hash_generated_method = "C461F1A49E8DFB6CD542592A8BBD31B7")
    public Object clone() {
        try 
        {
Object var46F3A0D86742C1D6E099C2B166941A33_1506122750 =             super.clone();
            var46F3A0D86742C1D6E099C2B166941A33_1506122750.addTaint(taint);
            return var46F3A0D86742C1D6E099C2B166941A33_1506122750;
        } //End block
        catch (CloneNotSupportedException e)
        {
            RuntimeException var1A3D561C49733FF4B8E39ED1A5C8FCCD_1216532663 = new RuntimeException("Internal error");
            var1A3D561C49733FF4B8E39ED1A5C8FCCD_1216532663.addTaint(taint);
            throw var1A3D561C49733FF4B8E39ED1A5C8FCCD_1216532663;
        } //End block
        // ---------- Original Method ----------
        //try {
            //return super.clone();
        //} catch (CloneNotSupportedException e) {
            //throw new RuntimeException("Internal error");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.179 -0400", hash_original_method = "1F4053FE4D1137EC6D445870C27D5323", hash_generated_method = "A3934C485D3AAE40CA181A272BD0E9E2")
    public void merge(Object mergeObject) {
        addTaint(mergeObject.getTaint());
    if(mergeObject == null)        
        return;
    if(!mergeObject.getClass().equals(this.getClass()))        
        {
        IllegalArgumentException var161E6816678ACACD1EE7A24B33F68583_196345628 = new IllegalArgumentException("Bad override object");
        var161E6816678ACACD1EE7A24B33F68583_196345628.addTaint(taint);
        throw var161E6816678ACACD1EE7A24B33F68583_196345628;
        }
        Class<?> myclass = this.getClass();
        while
(true)        
        {
            Field[] fields = myclass.getDeclaredFields();
for(int i = 0;i < fields.length;i++)
            {
                Field f = fields[i];
                int modifier = f.getModifiers();
    if(Modifier.isPrivate(modifier))                
                {
                    continue;
                } //End block
                else
    if(Modifier.isStatic(modifier))                
                {
                    continue;
                } //End block
                else
    if(Modifier.isInterface(modifier))                
                {
                    continue;
                } //End block
                Class<?> fieldType = f.getType();
                String fname = fieldType.toString();
                try 
                {
    if(fieldType.isPrimitive())                    
                    {
    if(fname.compareTo("int") == 0)                        
                        {
                            int intfield = f.getInt(mergeObject);
                            f.setInt(this, intfield);
                        } //End block
                        else
    if(fname.compareTo("short") == 0)                        
                        {
                            short shortField = f.getShort(mergeObject);
                            f.setShort(this, shortField);
                        } //End block
                        else
    if(fname.compareTo("char") == 0)                        
                        {
                            char charField = f.getChar(mergeObject);
                            f.setChar(this, charField);
                        } //End block
                        else
    if(fname.compareTo("long") == 0)                        
                        {
                            long longField = f.getLong(mergeObject);
                            f.setLong(this, longField);
                        } //End block
                        else
    if(fname.compareTo("boolean") == 0)                        
                        {
                            boolean booleanField = f.getBoolean(mergeObject);
                            f.setBoolean(this, booleanField);
                        } //End block
                        else
    if(fname.compareTo("double") == 0)                        
                        {
                            double doubleField = f.getDouble(mergeObject);
                            f.setDouble(this, doubleField);
                        } //End block
                        else
    if(fname.compareTo("float") == 0)                        
                        {
                            float floatField = f.getFloat(mergeObject);
                            f.setFloat(this, floatField);
                        } //End block
                    } //End block
                    else
                    {
                        Object obj = f.get(this);
                        Object mobj = f.get(mergeObject);
    if(mobj == null)                        
                        continue;
    if(obj == null)                        
                        {
                            f.set(this, mobj);
                            continue;
                        } //End block
    if(obj instanceof GenericObject)                        
                        {
                            GenericObject gobj = (GenericObject) obj;
                            gobj.merge(mobj);
                        } //End block
                        else
                        {
                            f.set(this, mobj);
                        } //End block
                    } //End block
                } //End block
                catch (IllegalAccessException ex1)
                {
                    ex1.printStackTrace();
                    continue;
                } //End block
            } //End block
            myclass = myclass.getSuperclass();
    if(myclass.equals(GenericObject.class))            
            break;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.181 -0400", hash_original_method = "F608522BE2D902628C253AAC05B9941D", hash_generated_method = "806ED529FA695F239C4158EA2B3D4195")
    protected String getIndentation() {
        char [] chars = new char [indentation];
        java.util.Arrays.fill (chars, ' ');
String var300818D7D4F603E5F4346D4E090224B6_1163000638 =         new String (chars);
        var300818D7D4F603E5F4346D4E090224B6_1163000638.addTaint(taint);
        return var300818D7D4F603E5F4346D4E090224B6_1163000638;
        // ---------- Original Method ----------
        //char [] chars = new char [indentation];
        //java.util.Arrays.fill (chars, ' ');
        //return new String (chars);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.182 -0400", hash_original_method = "81374D32EA999C5E19458011FA3994BB", hash_generated_method = "3B969F4AD69B24CD6387D27B5FD9EBE4")
    protected void sprint(String a) {
    if(a == null)        
        {
            stringRepresentation += getIndentation();
            stringRepresentation += "<null>\n";
            return;
        } //End block
    if(a.compareTo("}") == 0 || a.compareTo("]") == 0)        
        {
            indentation--;
        } //End block
        stringRepresentation += getIndentation();
        stringRepresentation += a;
        stringRepresentation += "\n";
    if(a.compareTo("{") == 0 || a.compareTo("[") == 0)        
        {
            indentation++;
        } //End block
        // ---------- Original Method ----------
        //if (a == null) {
            //stringRepresentation += getIndentation();
            //stringRepresentation += "<null>\n";
            //return;
        //}
        //if (a.compareTo("}") == 0 || a.compareTo("]") == 0) {
            //indentation--;
        //}
        //stringRepresentation += getIndentation();
        //stringRepresentation += a;
        //stringRepresentation += "\n";
        //if (a.compareTo("{") == 0 || a.compareTo("[") == 0) {
            //indentation++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.182 -0400", hash_original_method = "453FE126FB96D6280FF2B67B25D884AF", hash_generated_method = "06341DBEBC0D6629FECF2575E850896A")
    protected void sprint(Object o) {
        addTaint(o.getTaint());
        sprint(o.toString());
        // ---------- Original Method ----------
        //sprint(o.toString());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.182 -0400", hash_original_method = "EF724337BA21340D79134B1646FA7D50", hash_generated_method = "BC7FC853FF8588B45A11A1034385B98D")
    protected void sprint(int intField) {
        addTaint(intField);
        sprint(String.valueOf(intField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(intField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.183 -0400", hash_original_method = "8A8752611967BFFBE38D675256F01214", hash_generated_method = "4104706924DF1E70C8DBF1013A7F0630")
    protected void sprint(short shortField) {
        addTaint(shortField);
        sprint(String.valueOf(shortField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(shortField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.183 -0400", hash_original_method = "B9E7539CD6E988936CBC2F41DE2D2255", hash_generated_method = "D9F479BFF3B57A5A7BFD57802F7905B5")
    protected void sprint(char charField) {
        addTaint(charField);
        sprint(String.valueOf(charField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(charField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.183 -0400", hash_original_method = "CC6905368951D9D7C183C56D69A53B5E", hash_generated_method = "F4ED9CD6CADF6186D2769FB4F65FAB6D")
    protected void sprint(long longField) {
        addTaint(longField);
        sprint(String.valueOf(longField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(longField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.184 -0400", hash_original_method = "27E91C5243CD6D4BB691664DB4C3BC19", hash_generated_method = "9F7D24B2A77CAF13081398C8320E3F2E")
    protected void sprint(boolean booleanField) {
        addTaint(booleanField);
        sprint(String.valueOf(booleanField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(booleanField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.184 -0400", hash_original_method = "A8149AFA8BAA8D148E9A9CE1C6489F0C", hash_generated_method = "BC120763B7CB24B86251205E260AE92F")
    protected void sprint(double doubleField) {
        addTaint(doubleField);
        sprint(String.valueOf(doubleField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(doubleField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.184 -0400", hash_original_method = "96C3F949D4FB0E545745C5388D6DC08E", hash_generated_method = "0239E35134B29E8AF1A3CFEDC8C3EA80")
    protected void sprint(float floatField) {
        addTaint(floatField);
        sprint(String.valueOf(floatField));
        // ---------- Original Method ----------
        //sprint(String.valueOf(floatField));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.184 -0400", hash_original_method = "C3665E5B2DC148B3D9AC2D1614738627", hash_generated_method = "CC9960C463BA8ADB2C2953D0609F3E40")
    protected void dbgPrint() {
        Debug.println(debugDump());
        // ---------- Original Method ----------
        //Debug.println(debugDump());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.185 -0400", hash_original_method = "F3C9E7E4BCD0D7ECC989FFC8CBCF37DF", hash_generated_method = "CCBC14C6B0E34F3773483F3DFEB683B2")
    protected void dbgPrint(String s) {
        addTaint(s.getTaint());
        Debug.println(s);
        // ---------- Original Method ----------
        //Debug.println(s);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.186 -0400", hash_original_method = "B5B25EA3AF1891601BFD267279427EFB", hash_generated_method = "87FFEF90B92F1CE7838288698E03683A")
    public boolean equals(Object that) {
        addTaint(that.getTaint());
    if(that == null)        
        {
        boolean var68934A3E9455FA72420237EB05902327_2089886832 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1625441436 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1625441436;
        }
    if(!this.getClass().equals(that.getClass()))        
        {
        boolean var68934A3E9455FA72420237EB05902327_1087245248 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_273934601 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_273934601;
        }
        Class<?> myclass = this.getClass();
        Class<?> hisclass = that.getClass();
        while
(true)        
        {
            Field[] fields = myclass.getDeclaredFields();
            Field[] hisfields = hisclass.getDeclaredFields();
for(int i = 0;i < fields.length;i++)
            {
                Field f = fields[i];
                Field g = hisfields[i];
                int modifier = f.getModifiers();
    if((modifier & Modifier.PRIVATE) == Modifier.PRIVATE)                
                continue;
                Class<?> fieldType = f.getType();
                String fieldName = f.getName();
    if(fieldName.compareTo("stringRepresentation") == 0)                
                {
                    continue;
                } //End block
    if(fieldName.compareTo("indentation") == 0)                
                {
                    continue;
                } //End block
                try 
                {
    if(fieldType.isPrimitive())                    
                    {
                        String fname = fieldType.toString();
    if(fname.compareTo("int") == 0)                        
                        {
    if(f.getInt(this) != g.getInt(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_791502860 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1732275996 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1732275996;
                            }
                        } //End block
                        else
    if(fname.compareTo("short") == 0)                        
                        {
    if(f.getShort(this) != g.getShort(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_527830831 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_659316374 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_659316374;
                            }
                        } //End block
                        else
    if(fname.compareTo("char") == 0)                        
                        {
    if(f.getChar(this) != g.getChar(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_1444929154 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_335558914 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_335558914;
                            }
                        } //End block
                        else
    if(fname.compareTo("long") == 0)                        
                        {
    if(f.getLong(this) != g.getLong(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_1707003847 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1116415923 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1116415923;
                            }
                        } //End block
                        else
    if(fname.compareTo("boolean") == 0)                        
                        {
    if(f.getBoolean(this) != g.getBoolean(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_413972797 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_318321298 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_318321298;
                            }
                        } //End block
                        else
    if(fname.compareTo("double") == 0)                        
                        {
    if(f.getDouble(this) != g.getDouble(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_181271219 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_625637021 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_625637021;
                            }
                        } //End block
                        else
    if(fname.compareTo("float") == 0)                        
                        {
    if(f.getFloat(this) != g.getFloat(that))                            
                            {
                            boolean var68934A3E9455FA72420237EB05902327_1844971494 = (false);
                                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_637541331 = getTaintBoolean();
                            return var84E2C64F38F78BA3EA5C905AB5A2DA27_637541331;
                            }
                        } //End block
                    } //End block
                    else
    if(g.get(that) == f.get(this))                    
                    {
                    boolean varB326B5062B2F0E69046810717534CB09_1240080010 = (true);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2028924997 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_2028924997;
                    }
                    else
    if(f.get(this) == null)                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1889069900 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1649065129 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1649065129;
                    }
                    else
    if(g.get(that) == null)                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_477651145 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1401246793 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1401246793;
                    }
                    else
    if(g.get(that) == null && f.get(this) != null)                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1615870946 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2001100634 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_2001100634;
                    }
                    else
    if(!f.get(this).equals(g.get(that)))                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1243294130 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2113798592 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_2113798592;
                    }
                } //End block
                catch (IllegalAccessException ex1)
                {
                    InternalErrorHandler.handleException(ex1);
                } //End block
            } //End block
    if(myclass.equals(GenericObject.class))            
            break;
            else
            {
                myclass = myclass.getSuperclass();
                hisclass = hisclass.getSuperclass();
            } //End block
        } //End block
        boolean varB326B5062B2F0E69046810717534CB09_1800139173 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1023944693 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1023944693;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.188 -0400", hash_original_method = "EA6AD5335EE18CA3C2D0278C0E091AE5", hash_generated_method = "E941A3E14EE2DF87351368EB3C23C2A0")
    public boolean match(Object other) {
        addTaint(other.getTaint());
    if(other == null)        
        {
        boolean varB326B5062B2F0E69046810717534CB09_342607214 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1705944005 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1705944005;
        }
    if(!this.getClass().equals(other.getClass()))        
        {
        boolean var68934A3E9455FA72420237EB05902327_1412981109 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_622629563 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_622629563;
        }
        GenericObject that = (GenericObject) other;
        Class<?> myclass = this.getClass();
        Field[] fields = myclass.getDeclaredFields();
        Class<?> hisclass = other.getClass();
        Field[] hisfields = hisclass.getDeclaredFields();
for(int i = 0;i < fields.length;i++)
        {
            Field f = fields[i];
            Field g = hisfields[i];
            int modifier = f.getModifiers();
    if((modifier & Modifier.PRIVATE) == Modifier.PRIVATE)            
            continue;
            Class<?> fieldType = f.getType();
            String fieldName = f.getName();
    if(fieldName.compareTo("stringRepresentation") == 0)            
            {
                continue;
            } //End block
    if(fieldName.compareTo("indentation") == 0)            
            {
                continue;
            } //End block
            try 
            {
    if(fieldType.isPrimitive())                
                {
                    String fname = fieldType.toString();
    if(fname.compareTo("int") == 0)                    
                    {
    if(f.getInt(this) != g.getInt(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_421590112 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_283172212 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_283172212;
                        }
                    } //End block
                    else
    if(fname.compareTo("short") == 0)                    
                    {
    if(f.getShort(this) != g.getShort(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_23562121 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1367905048 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1367905048;
                        }
                    } //End block
                    else
    if(fname.compareTo("char") == 0)                    
                    {
    if(f.getChar(this) != g.getChar(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_1803659371 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_387983389 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_387983389;
                        }
                    } //End block
                    else
    if(fname.compareTo("long") == 0)                    
                    {
    if(f.getLong(this) != g.getLong(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_1578541904 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2018453436 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2018453436;
                        }
                    } //End block
                    else
    if(fname.compareTo("boolean") == 0)                    
                    {
    if(f.getBoolean(this) != g.getBoolean(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_365211719 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_145215352 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_145215352;
                        }
                    } //End block
                    else
    if(fname.compareTo("double") == 0)                    
                    {
    if(f.getDouble(this) != g.getDouble(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_1806561507 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1028265258 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1028265258;
                        }
                    } //End block
                    else
    if(fname.compareTo("float") == 0)                    
                    {
    if(f.getFloat(this) != g.getFloat(that))                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_1317785524 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_608933642 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_608933642;
                        }
                    } //End block
                } //End block
                else
                {
                    Object myObj = f.get(this);
                    Object hisObj = g.get(that);
    if(hisObj != null && myObj == null)                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1386357613 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_665389946 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_665389946;
                    }
                    else
    if(hisObj == null && myObj != null)                    
                    continue;
                    else
    if(hisObj == null && myObj == null)                    
                    continue;
                    else
    if(hisObj instanceof java.lang.String
                            && myObj instanceof java.lang.String)                    
                    {
    if((((String) hisObj).trim()).equals(""))                        
                        continue;
    if(((String) myObj)
                            .compareToIgnoreCase((String) hisObj)
                            != 0)                        
                        {
                        boolean var68934A3E9455FA72420237EB05902327_1969589590 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_865428680 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_865428680;
                        }
                    } //End block
                    else
    if(GenericObject.isMySubclass(myObj.getClass())
                            && !((GenericObject) myObj).match(hisObj))                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1925166927 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1411235304 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1411235304;
                    }
                    else
    if(GenericObjectList.isMySubclass(myObj.getClass())
                            && !((GenericObjectList) myObj).match(hisObj))                    
                    {
                    boolean var68934A3E9455FA72420237EB05902327_1734230056 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1511192230 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1511192230;
                    }
                } //End block
            } //End block
            catch (IllegalAccessException ex1)
            {
                InternalErrorHandler.handleException(ex1);
            } //End block
        } //End block
        boolean varB326B5062B2F0E69046810717534CB09_1592444025 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2926721 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2926721;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.192 -0400", hash_original_method = "9A2585B996B0A77325ECBDA944C7F6EB", hash_generated_method = "A0C3EBE6A5DE94131E522F4F1E7C2CD5")
    public String debugDump() {
        stringRepresentation = "";
        Class<?> myclass = getClass();
        sprint(myclass.getName());
        sprint("{");
        Field[] fields = myclass.getDeclaredFields();
for(int i = 0;i < fields.length;i++)
        {
            Field f = fields[i];
            int modifier = f.getModifiers();
    if((modifier & Modifier.PRIVATE) == Modifier.PRIVATE)            
            continue;
            Class<?> fieldType = f.getType();
            String fieldName = f.getName();
    if(fieldName.compareTo("stringRepresentation") == 0)            
            {
                continue;
            } //End block
    if(fieldName.compareTo("indentation") == 0)            
            {
                continue;
            } //End block
            sprint(fieldName + ":");
            try 
            {
    if(fieldType.isPrimitive())                
                {
                    String fname = fieldType.toString();
                    sprint(fname + ":");
    if(fname.compareTo("int") == 0)                    
                    {
                        int intfield = f.getInt(this);
                        sprint(intfield);
                    } //End block
                    else
    if(fname.compareTo("short") == 0)                    
                    {
                        short shortField = f.getShort(this);
                        sprint(shortField);
                    } //End block
                    else
    if(fname.compareTo("char") == 0)                    
                    {
                        char charField = f.getChar(this);
                        sprint(charField);
                    } //End block
                    else
    if(fname.compareTo("long") == 0)                    
                    {
                        long longField = f.getLong(this);
                        sprint(longField);
                    } //End block
                    else
    if(fname.compareTo("boolean") == 0)                    
                    {
                        boolean booleanField = f.getBoolean(this);
                        sprint(booleanField);
                    } //End block
                    else
    if(fname.compareTo("double") == 0)                    
                    {
                        double doubleField = f.getDouble(this);
                        sprint(doubleField);
                    } //End block
                    else
    if(fname.compareTo("float") == 0)                    
                    {
                        float floatField = f.getFloat(this);
                        sprint(floatField);
                    } //End block
                } //End block
                else
    if(GenericObject.class.isAssignableFrom(fieldType))                
                {
    if(f.get(this) != null)                    
                    {
                        sprint(
                            ((GenericObject) f.get(this)).debugDump(
                                indentation + 1));
                    } //End block
                    else
                    {
                        sprint("<null>");
                    } //End block
                } //End block
                else
    if(GenericObjectList.class.isAssignableFrom(fieldType))                
                {
    if(f.get(this) != null)                    
                    {
                        sprint(
                            ((GenericObjectList) f.get(this)).debugDump(
                                indentation + 1));
                    } //End block
                    else
                    {
                        sprint("<null>");
                    } //End block
                } //End block
                else
                {
    if(f.get(this) != null)                    
                    {
                        sprint(f.get(this).getClass().getName() + ":");
                    } //End block
                    else
                    {
                        sprint(fieldType.getName() + ":");
                    } //End block
                    sprint("{");
    if(f.get(this) != null)                    
                    {
                        sprint(f.get(this).toString());
                    } //End block
                    else
                    {
                        sprint("<null>");
                    } //End block
                    sprint("}");
                } //End block
            } //End block
            catch (IllegalAccessException ex1)
            {
                continue;
            } //End block
            catch (Exception ex)
            {
                InternalErrorHandler.handleException(ex);
            } //End block
        } //End block
        sprint("}");
String var8D11C2D110975896438D6F91C60E6D6F_74805827 =         stringRepresentation;
        var8D11C2D110975896438D6F91C60E6D6F_74805827.addTaint(taint);
        return var8D11C2D110975896438D6F91C60E6D6F_74805827;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.194 -0400", hash_original_method = "C8764A7C07CF0ED92D22CFD53801BCA7", hash_generated_method = "4BD8CF7CDAE0EED79908762B116C5948")
    public String debugDump(int indent) {
        indentation = indent;
        String retval = this.debugDump();
        indentation = 0;
String varF9E19AD6135C970F387F77C6F3DE4477_2034758981 =         retval;
        varF9E19AD6135C970F387F77C6F3DE4477_2034758981.addTaint(taint);
        return varF9E19AD6135C970F387F77C6F3DE4477_2034758981;
        // ---------- Original Method ----------
        //indentation = indent;
        //String retval = this.debugDump();
        //indentation = 0;
        //return retval;
    }

    
    public abstract String encode();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.194 -0400", hash_original_method = "23BD5BF1494AAB1936A4882B6C7896EB", hash_generated_method = "F38FA5CF4AFCD8F273C1FC46DAE63BF3")
    public StringBuffer encode(StringBuffer buffer) {
        addTaint(buffer.getTaint());
StringBuffer var7758A6E5CA5A3C31A1AD4D3B1CB2BC22_161930758 =         buffer.append(encode());
        var7758A6E5CA5A3C31A1AD4D3B1CB2BC22_161930758.addTaint(taint);
        return var7758A6E5CA5A3C31A1AD4D3B1CB2BC22_161930758;
        // ---------- Original Method ----------
        //return buffer.append(encode());
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.194 -0400", hash_original_field = "D1190824E35A683C05589F1C776EEB98", hash_generated_field = "02EC968BA435084EE7ADC81279AB56D8")

    protected static final String SEMICOLON = Separators.SEMICOLON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "02A534AF21A6F783F08D86D26579E890", hash_generated_field = "6B6A3C0E5AAA12BC4230EF790A3C2476")

    protected static final String COLON = Separators.COLON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "6C852D8F8039F1F9747489612DAC3C3C", hash_generated_field = "2C4A8D03DDB954D51E978CD8F8E2DEA4")

    protected static final String COMMA = Separators.COMMA;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "04C5392343613D1101130F746A81D0F3", hash_generated_field = "8A50D691E37AC9254B7ED2ABCE4AC6D2")

    protected static final String SLASH = Separators.SLASH;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "D8EE4E7D0F1EAB2E2745753B5AD2FE8D", hash_generated_field = "0CF03E9FD9212362B2D202A36124051A")

    protected static final String SP = Separators.SP;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "3C7C6B82B012EBDA39975B1F72983C28", hash_generated_field = "AD22F298E6FF482BE0BD697358901610")

    protected static final String EQUALS = Separators.EQUALS;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "B9D394806A580E8DE8984E11AC02BDE2", hash_generated_field = "2A5C8D44567A1C68D53F48B0CD1AF72E")

    protected static final String STAR = Separators.STAR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "4B65D6BACAFDD7AB302810256C42CCB9", hash_generated_field = "99D8C532EFD2EC03350A98B152CEDB7F")

    protected static final String NEWLINE = Separators.NEWLINE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "4E25B108371C30F889E1B6E8C1046FAB", hash_generated_field = "5E44FE20A9580182CC4CE4836B87D2F2")

    protected static final String RETURN = Separators.RETURN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "7E16A38DE053150CC3BF00FEBC32CBB3", hash_generated_field = "03472463E2EA98D819ECAC54647D9EEB")

    protected static final String LESS_THAN = Separators.LESS_THAN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "CBC3FB6A2E3BC245B189168F8F698149", hash_generated_field = "EADC9D4C7F8A41AC9253B4399DD9CC22")

    protected static final String GREATER_THAN = Separators.GREATER_THAN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "72EE65D27F762C3B2FB94C3FA334B5E4", hash_generated_field = "94E22BF70767B9E5F90C8BEFB48DFB31")

    protected static final String AT = Separators.AT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "3ACE38B8B42CCCDC519BBD9065EB1D1A", hash_generated_field = "C68E946646D329E00948C391567E8245")

    protected static final String DOT = Separators.DOT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "B2A15792014FB9077E86DD721A8EFBA4", hash_generated_field = "C6F6498E0BEB8E9B929D5FF0691C60C5")

    protected static final String QUESTION = Separators.QUESTION;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.195 -0400", hash_original_field = "096D0F7D4D4C7B4283D714ECD7F549C3", hash_generated_field = "3931FF01A0452F4B915432DFE1D8342B")

    protected static final String POUND = Separators.POUND;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "705C7DB0DE742246702AC85CCAA66A2B", hash_generated_field = "A7C8E60A9ACCF4FC95E42A6FE3CBE98A")

    protected static final String AND = Separators.AND;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "B7554C14B11FFE96B375109E44C62935", hash_generated_field = "96B1BA6A04896DF507DBF5F6007D53FF")

    protected static final String LPAREN = Separators.LPAREN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "ED8913C274C5CDFEFC62F7A7FE2688CB", hash_generated_field = "04E1EDA33DBBA7B9CD0B5320DA6E2B15")

    protected static final String RPAREN = Separators.RPAREN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "CD4D1E68FDC871F3D1A212D438F276AF", hash_generated_field = "60970C4DF02E2922FFB2BB3FCBF1CC4C")

    protected static final String DOUBLE_QUOTE = Separators.DOUBLE_QUOTE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "1084586CDB13332FA26836F7CE2B3817", hash_generated_field = "36D2B8942300A11E9A202D488BEEC708")

    protected static final String QUOTE = Separators.QUOTE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "58E3D5E258B17E5D6D1BDF83FE976FD6", hash_generated_field = "EE0F746E0ADCCF78C293F0BC27A024C1")

    protected static final String HT = Separators.HT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "4AEF06B345694E240504FA11CF16C815", hash_generated_field = "E525B1F947054DAAB71F0D7018A0312F")

    protected static final String PERCENT = Separators.PERCENT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "6796B59570731F7B6F84E1F281186777", hash_generated_field = "23DD3DB933D01AADE0B2C40AA464AC9C")

    protected static final Set<Class<?>> immutableClasses = new HashSet<Class<?>> (10);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:33.196 -0400", hash_original_field = "0903587AC197526F6DF5345E92DCF834", hash_generated_field = "06A0F0FA7C3AA2D1A0C9419E5DAE1A94")

    static final String[] immutableClassNames = {
        "String", "Character",
        "Boolean", "Byte", "Short", "Integer", "Long",
        "Float", "Double"
        };
    static {
        try {
            for (int i = 0; i < immutableClassNames.length; i++)
                immutableClasses.add(Class.forName("java.lang." + immutableClassNames [i]));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException ("Internal error", e);
        }
    }
    
}

