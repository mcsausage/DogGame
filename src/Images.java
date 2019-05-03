import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Images {

    Image[] ears = {
            new Image(new FileInputStream("images/1_Ears.png")),
            new Image(new FileInputStream("images/2_Ears.png")),
            new Image(new FileInputStream("images/3_Ears.png")),
            new Image(new FileInputStream("images/4_Ears.png")),
            new Image(new FileInputStream("images/5_Ears.png")),
            new Image(new FileInputStream("images/6_Ears.png")),
            new Image(new FileInputStream("images/7_Ears.png")),
            new Image(new FileInputStream("images/8_Ears.png")),
            new Image(new FileInputStream("images/9_Ears.png"))
    };

    Image[] eyes = {
            new Image(new FileInputStream("images/1_Eyes.png")),
            new Image(new FileInputStream("images/2_Eyes.png")),
            new Image(new FileInputStream("images/3_Eyes.png")),
            new Image(new FileInputStream("images/4_Eyes.png")),
            new Image(new FileInputStream("images/5_Eyes.png")),
            new Image(new FileInputStream("images/6_Eyes.png")),
            new Image(new FileInputStream("images/7_Eyes.png")),
            new Image(new FileInputStream("images/8_Eyes.png")),
            new Image(new FileInputStream("images/9_Eyes.png"))

    };

    Image[] nose = {
            new Image(new FileInputStream("images/1_Nose.png")),
            new Image(new FileInputStream("images/2_Nose.png")),
            new Image(new FileInputStream("images/3_Nose.png")),
            new Image(new FileInputStream("images/4_Nose.png")),
            new Image(new FileInputStream("images/5_Nose.png")),
            new Image(new FileInputStream("images/6_Nose.png")),
            new Image(new FileInputStream("images/7_Nose.png")),
            new Image(new FileInputStream("images/8_Nose.png")),
            new Image(new FileInputStream("images/9_Nose.png"))

    };

    Image[] body = {
            new Image(new FileInputStream("images/1_Body.png")),
            new Image(new FileInputStream("images/2_Body.png")),
            new Image(new FileInputStream("images/3_Body.png")),
            new Image(new FileInputStream("images/4_Body.png")),
            new Image(new FileInputStream("images/5_Body.png")),
            new Image(new FileInputStream("images/6_Body.png")),
            new Image(new FileInputStream("images/7_Body.png")),
            new Image(new FileInputStream("images/8_Body.png")),
            new Image(new FileInputStream("images/9_Body.png"))

    };

    public Images() throws FileNotFoundException {
    }
}
