package observer;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Subject {

   private List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAll(String filepath){

        for (Observer observer:observerList){
            observer.notifyMe(filepath);
        }
    }

    public void start() throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("E:\\UNIVERSITY NOTES\\SENG 2020-sem-2\\SENG 22212 - Software Architecture and Design\\Design patterens\\fileconverter");

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);
        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
              /*  System.out.println(
                        "Event kind:" + event.kind()
                                + ". File affected: " + event.context() + ".");*/
                this.notifyAll(event.context().toString());

            }
            key.reset();
        }
    }

}
