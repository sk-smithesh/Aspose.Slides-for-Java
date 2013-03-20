/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.convertpptxwithnotestotiff.java;

import com.aspose.slides.*;

public class ConvertPPTXWithNotesToTiff
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/convertpptxwithnotestotiff/data/";

        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "TestNotes.pptx");

        //Saving the presentation to TIFF notes
        pres.save(dataDir + "TestNotes.tiff", com.aspose.slides.SaveFormat.TiffNotes);

        // Status
        System.out.println("PPTX with notes to TIFF conversion has been performed successfully.");
    }
}




