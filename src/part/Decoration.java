package part;

import java.util.Random;

public class Decoration extends Parts {
    private final String imageName;

    public Decoration() {
        super();
        Random random = new Random();
        String chosenDecoration;
        if(random.nextBoolean()){
            chosenDecoration = "Flaming decoration";
            imageName = "flame.png";
        } else {
            chosenDecoration = "Icy decoration";
            imageName = "ice.png";
        }
        description.append("Final touch: ").append(chosenDecoration).append(".\n");
    }

    public String getImageName() {
        return imageName;
    }
}