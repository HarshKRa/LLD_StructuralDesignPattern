package medias;

/**
 * This is Adapter Design pattern to make display method of image into play method
 * */
public class ImageAdapter implements Media{

    private  Image image;

    public  ImageAdapter(Image image){
        this.image = image;
    }
    @Override
    public void play() {
        this.image.display();
    }
}
