package holloway.nate.initializationLab1;

/**
 * Created by nathanielholloway on 9/10/16.
 */
public class ColorfulThing {

    public enum Color{RED, BLUE, GREEN}

    Color color;


    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }
}
