package decorations;

import medias.Media;

public class HighQualityMediaDecorator extends MediaDecorator{

    public HighQualityMediaDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    public void play(){
        super.play();
        System.out.println("Enhancing play Quality");
    }
}
