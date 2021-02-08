package observer;

public class JPGconverter implements  Observer{
    @Override
    public void notifyMe(String filepath) {
          System.out.println("Coverting to jpg format"+filepath);
    }
}
