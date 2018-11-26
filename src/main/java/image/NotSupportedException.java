package image;
import image.RasterUniformImageFactory;
public class NotSupportedException extends RuntimeException {
    private String msg;

    public NotSupportedException(String msg){
        this.msg=msg;
    }
}
