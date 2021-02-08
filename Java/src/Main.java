import adapter.ImageAdapter;
import adapter.MP3File;
import adapter.MP4File;
import adapter.Media;
import builder.AuditLog;
import observer.JPGconverter;
import observer.Observer;
import observer.Subject;
import observer.TIFFconverter;
import singleton.ClipBoard;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        Observer jpgconverter = new JPGconverter();
        Observer tiffconverter = new TIFFconverter();

        Subject subject = new Subject();

        subject.add(jpgconverter);
        subject.add(tiffconverter);

       // subject.notifyAll("E:\\UNIVERSITY NOTES\\SENG 2020-sem-2\\SENG 22212 - Software Architecture and Design\\Design patterens\\fileconverter");

        subject.start();;
       /* String fileType = "mp3";

        Media media = null;

        if(fileType.equals("mp3")){
            media = new MP3File();
            media.play();
        }
        else if(fileType.equals("mp4")){
            media = new MP4File();
            media.play();
        }
        else if(fileType.equals("image")){
            media = new ImageAdapter();
             media.play();
        }
       /* AuditLog auditLog = new AuditLog.AuditLogBuilder("1234")
                .by("user")
                .on("r")
                .withAction("c")
                .build();
        System.out.println(auditLog.getUserId());*/





    }
}
