/*
 * Copyright (C) 2015,  Massachusetts Institute of Technology
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please email droidsafe@lists.csail.mit.edu if you need additional
 * information or have any questions.
 * 
 * 
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/***** THIS FILE HAS BEEN MODIFIED FROM THE ORIGINAL BY THE DROIDSAFE PROJECT. *****/


package android.graphics;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.InputStream;
import java.io.OutputStream;

import droidsafe.helpers.DSUtils;

public class Picture {

    /**
     * Create a new picture (already recorded) from the data in the stream. This
     * data was generated by a previous call to writeToStream().
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.332 -0500", hash_original_method = "088B6D36E7315E28AFCE4F1DFAAB72D3", hash_generated_method = "0B4BAF19FBE4483E75DF5B1663D766EE")
    
public static Picture createFromStream(InputStream stream) {
        return new Picture(
            nativeCreateFromStream(stream, new byte[WORKING_STREAM_STORAGE]));
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static int nativeConstructor(int nativeSrcOr0) {
        return nativeSrcOr0;
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static int nativeCreateFromStream(InputStream stream,
                                                byte[] storage) {
        storage.addTaint(stream.getTaint());
        return storage.getTaintInt();
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static int nativeBeginRecording(int nativeCanvas,
                                                    int w, int h) {
        return (nativeCanvas + w + h);
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static void nativeEndRecording(int nativeCanvas) {
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static void nativeDraw(int nativeCanvas, int nativePicture) {
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static boolean nativeWriteToStream(int nativePicture,
                                           OutputStream stream, byte[] storage) {
        stream.addTaint(nativePicture);
        stream.addTaint(storage[0]);
        stream.addTaint(storage.getTaint());
        return stream.getTaintBoolean();
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static void nativeDestructor(int nativePicture) {
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.310 -0500", hash_original_field = "93DB6FF890F60901303B2AEAD85141C3", hash_generated_field = "16A3D3E1F1A46232673D292E95776672")

    private static final int WORKING_STREAM_STORAGE = 16 * 1024;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.306 -0500", hash_original_field = "BF90C31505C3DADC28E32235FEACDF52", hash_generated_field = "A1B5C5158D5DEB28A2820BEDFBA48246")

    private Canvas mRecordingCanvas;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.308 -0500", hash_original_field = "0B745186D9B4E8CE91B33D56953BDEB8", hash_generated_field = "08C3B2ACCECB8572107176C70CDC69B3")

    private  int mNativePicture;

    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.312 -0500", hash_original_method = "2489F1714C6AB52D2B9965C8B69500DD", hash_generated_method = "360AE2114FD70BE19076AFC8712FC708")
    
public Picture() {
        this(nativeConstructor(0));
    }

    /**
     * Create a picture by making a copy of what has already been recorded in
     * src. The contents of src are unchanged, and if src changes later, those
     * changes will not be reflected in this picture.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.316 -0500", hash_original_method = "0B8FC63E2385743B0CD030A74D7237E0", hash_generated_method = "E4AD0EEA9BC532D70FB4390F0FDD4FED")
    
public Picture(Picture src) {
        addTaint(src.getTaint());
        //this(nativeConstructor(src != null ? src.mNativePicture : 0));
    }
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.341 -0500", hash_original_method = "4720BFD5C543F65C552F0739FF1DD2E7", hash_generated_method = "DDE864049B4B42F60AD8962958A85009")
    
private Picture(int nativePicture) {
        if (nativePicture == 0) {
            throw new RuntimeException();
        }
        mNativePicture = nativePicture;
    }
    
    /**
     * To record a picture, call beginRecording() and then draw into the Canvas
     * that is returned. Nothing we appear on screen, but all of the draw
     * commands (e.g. drawRect(...)) will be recorded. To stop recording, call
     * endRecording(). At this point the Canvas that was returned must no longer
     * be referenced, and nothing should be drawn into it.
     */
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.318 -0500", hash_original_method = "20E22D7D195E3391E43BD9FB13A423DE", hash_generated_method = "8C3B3B505356E2C21BC55C3D8E1AC0C3")
    
public Canvas beginRecording(int width, int height) {
        //int ni = nativeBeginRecording(mNativePicture, width, height);
        addTaint(width + height);
        mRecordingCanvas = new RecordingCanvas(this, getTaintInt());
        return mRecordingCanvas;
    }
    
    /**
     * Call endRecording when the picture is built. After this call, the picture
     * may be drawn, but the canvas that was returned by beginRecording must not
     * be referenced anymore. This is automatically called if Picture.draw() or
     * Canvas.drawPicture() is called.
     */
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.320 -0500", hash_original_method = "4B70DEBF1EF0DC56C3D034BE86F32949", hash_generated_method = "AB5001A157CFF8A5A20525D29A48DDF9")
    
public void endRecording() {
        if (mRecordingCanvas != null) {
            mRecordingCanvas = null;
            nativeEndRecording(mNativePicture);
        }
    }

    /**
     * Get the width of the picture as passed to beginRecording. This
     * does not reflect (per se) the content of the picture.
     */
    @DSComment("not sensitive/not an action")
    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.323 -0500", hash_original_method = "D4E7715F32876041521BE16EC8E1C0AC", hash_generated_method = "119E6F88A6022FFF8C0BCF10E5D283FB")
    
    public int getWidth(){
    	//Formerly a native method
    	return getTaintInt();
    }

    /**
     * Get the height of the picture as passed to beginRecording. This
     * does not reflect (per se) the content of the picture.
     */
    @DSComment("not sensitive/not an action")
    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.327 -0500", hash_original_method = "E09BF3A531DEFF54888EDA3B98EB9CFF", hash_generated_method = "A50AB7B99158205015AA04248040D6D3")
    
    public int getHeight(){
    	//Formerly a native method
    	return getTaintInt();
    }
    
    /**
     * Draw this picture on the canvas. The picture may have the side effect
     * of changing the matrix and clip of the canvas.
     * 
     * @param canvas  The picture is drawn to this canvas 
     */
    @DSComment("Unintended picture could be put here")
    @DSSpec(DSCat.SECURITY)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.329 -0500", hash_original_method = "DC7CFB067EE80684132B2B92372F3B79", hash_generated_method = "5B34C796B6326931CE918675C2735673")
    
public void draw(Canvas canvas) {
        if (mRecordingCanvas != null) {
            endRecording();
        }
        nativeDraw(canvas.mNativeCanvas, mNativePicture);
        canvas.addTaint(getTaint());
    }

    /**
     * Write the picture contents to a stream. The data can be used to recreate
     * the picture in this or another process by calling createFromStream.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.334 -0500", hash_original_method = "5D2FA2739AFC080B35312B93ED4EB821", hash_generated_method = "C9445E6D2DF0BA53A84414A6BE854628")
    
public void writeToStream(OutputStream stream) {
        // do explicit check before calling the native method
        if (stream == null) {
            throw new NullPointerException();
        }
        stream.addTaint(getTaint());
      /*  
        if (!nativeWriteToStream(mNativePicture, stream,
                             new byte[WORKING_STREAM_STORAGE])) {
            throw new RuntimeException();
        }
       */
    }

    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.336 -0500", hash_original_method = "A9ACB715DF1E16C6B20EA656F0034A3C", hash_generated_method = "24872D74DDE1566A22D3FC719A5F95C5")
    
protected void finalize() throws Throwable {
        nativeDestructor(mNativePicture);
    }
    
    private static class RecordingCanvas extends Canvas {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.370 -0500", hash_original_field = "52B3607D63396A9BD84D7C31E75E8159", hash_generated_field = "C3E778DE5EE29E2C4788703FE56860BD")

        private  Picture mPicture;

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.372 -0500", hash_original_method = "2A456EE78DB6B79255D736BC2BE0949A", hash_generated_method = "3EE9D573074405FA03C04793C1112B20")
        
public RecordingCanvas(Picture pict, int nativeCanvas) {
            super(nativeCanvas);
            mPicture = pict;
        }
        
        @DSSafe(DSCat.SAFE_LIST)
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.375 -0500", hash_original_method = "6CF0BDC754DD98C47DAA94E49A23367D", hash_generated_method = "AFB1E851686B7B4C837A7226FC3C7F45")
        
@Override
        public void setBitmap(Bitmap bitmap) {
            throw new RuntimeException(
                                "Cannot call setBitmap on a picture canvas");
        }

        @DSSafe(DSCat.SAFE_LIST)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.377 -0500", hash_original_method = "37BF59928A286475E8AAF8FA82084BAA", hash_generated_method = "F45267C78DC72D5C72A76F4F1FFC4004")
        
@Override
        public void drawPicture(Picture picture) {
            if (mPicture == picture) {
                throw new RuntimeException(
                            "Cannot draw a picture into its recording canvas");
            }
            super.drawPicture(picture);
        }
        
    }
    
    /*package*/ @DSComment("Package priviledge")
    @DSBan(DSCat.DEFAULT_MODIFIER)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:26.338 -0500", hash_original_method = "C2445D1D52466847173519B3E77D61F5", hash_generated_method = "591C02832903310A3955790FA88EEB58")
    
final int ni() {
        return mNativePicture;
    }
}

