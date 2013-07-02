package com.android.org.bouncycastle.crypto.util;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public abstract class Pack {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-01 14:49:44.025 -0400", hash_original_method = "7D61F0FDEC5E1A91AB83D504A09E89B5", hash_generated_method = "7D61F0FDEC5E1A91AB83D504A09E89B5")
    public Pack ()
    {
        
    }


    public static int bigEndianToInt(byte[] bs, int off) {
        int n = bs[  off] << 24;
        n |= (bs[++off] & 0xff) << 16;
        n |= (bs[++off] & 0xff) << 8;
        n |= (bs[++off] & 0xff);
        return n;
    }

    
    public static void intToBigEndian(int n, byte[] bs, int off) {
        bs[  off] = (byte)(n >>> 24);
        bs[++off] = (byte)(n >>> 16);
        bs[++off] = (byte)(n >>>  8);
        bs[++off] = (byte)(n       );
    }

    
    public static long bigEndianToLong(byte[] bs, int off) {
        int hi = bigEndianToInt(bs, off);
        int lo = bigEndianToInt(bs, off + 4);
        return ((long)(hi & 0xffffffffL) << 32) | (long)(lo & 0xffffffffL);
    }

    
    public static void longToBigEndian(long n, byte[] bs, int off) {
        intToBigEndian((int)(n >>> 32), bs, off);
        intToBigEndian((int)(n & 0xffffffffL), bs, off + 4);
    }

    
    public static int littleEndianToInt(byte[] bs, int off) {
        int n = bs[  off];
        n |= (bs[++off] & 0xff) << 8;
        n |= (bs[++off] & 0xff) << 16;
        n |= (bs[++off] & 0xff) << 24;
        return n;
    }

    
    public static void intToLittleEndian(int n, byte[] bs, int off) {
        bs[  off] = (byte)(n       );
        bs[++off] = (byte)(n >>>  8);
        bs[++off] = (byte)(n >>> 16);
        bs[++off] = (byte)(n >>> 24);
    }

    
    public static long littleEndianToLong(byte[] bs, int off) {
        int lo = littleEndianToInt(bs, off);
        int hi = littleEndianToInt(bs, off + 4);
        return ((long)(hi & 0xffffffffL) << 32) | (long)(lo & 0xffffffffL);
    }

    
    public static void longToLittleEndian(long n, byte[] bs, int off) {
        intToLittleEndian((int)(n & 0xffffffffL), bs, off);
        intToLittleEndian((int)(n >>> 32), bs, off + 4);
    }

    
}

