package holloway.nate.initializationLab1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanielholloway on 9/10/16.
 */
public class InitializationLab1Test {

    @Test
    public void getColor(){
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        Assert.assertSame("The color is Blue",ColorfulThing.Color.BLUE,colorfulThing.getColor());

    }


}
