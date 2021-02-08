package adapter;

import lib.Image;

public class ImageAdapter implements  Media{

   private Image image = new Image();

    @Override
    public void play() {
        image.show();
    }
}
