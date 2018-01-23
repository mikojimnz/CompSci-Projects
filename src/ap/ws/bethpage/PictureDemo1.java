package ap.ws.bethpage;

import java.io.*;

import ap.picturelab.SimplePicture;

/**
 * This class demonstrates how we might use some of the functionality of the picturelab package from
 * outside of PictureLab. For instance, the method shown here reduces all images in a directory by a given factor.
 * 
 * 
 * @author LaSpina, Bethpage High School
 */
public class PictureDemo1 {
   
   /**
    * Scales all the images in a given directory down by the given factor.
    * All files in the directory will be opened and then saved into a sub-directory called smaller.
    * @param dir The directory we are searching through for files.
    * @param factor Is the scale factor to apply to all images 0 &lt; factor &lt; 1
    */
   public static void reducePictureSizes(File dir, double factor) {
      File[] list = dir.listFiles();
      File writeDir = new File(dir,"smaller");
      if(!writeDir.exists())
         writeDir.mkdir();
      SimplePicture photo;
      for(File picFile : list) {
         if(picFile.isDirectory())
            continue;
         int dotPos = picFile.toString().lastIndexOf(".");
         if(dotPos==-1)
            continue;
         String ext = picFile.toString().substring(dotPos+1).toLowerCase();
         if(ext.equals("jpg") || ext.equals("jpeg") || ext.equals("png") || ext.equals("gif")) {
            photo = new SimplePicture(picFile.getAbsolutePath());
            System.out.println("Writing file: " + photo.getFileName());
            photo = photo.scale(factor, factor);
            photo.write(new File(writeDir,picFile.getName()).getAbsolutePath());
            
         }
      }
   }
   
   public static void main(String[] args) {
      File f = new File("images/1Cat.JPG");
      SimplePicture p1 = new SimplePicture(f);
      p1.explore();
   }
}
