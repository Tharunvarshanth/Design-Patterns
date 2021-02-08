package observer;

public class TIFFconverter  implements  Observer{
    @Override
    public void notifyMe(String filepath) {
        System.out.println("Coverting to tiff format");
    }
}
