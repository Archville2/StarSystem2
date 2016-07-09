import org.junit.*;
import org.my.test.stars.NameNotFoundException;
import org.my.test.stars.StarSystem;

public class IncorrectNamesTest {
    StarSystem starSystem;

    @Before
    public void init(){
        starSystem=new StarSystem("SolSystem");
        starSystem.addStar("Sol");
    }

    @After
    public void destroy(){
        starSystem=null;
    }

    @Test(expected = NameNotFoundException.class)
    public void incorrectStarNameTest() throws NameNotFoundException {
            starSystem.getStar("Sool").addPlanet("Earth");
    }

    @Test(expected = NameNotFoundException.class)
    public void incorrectPlanetNameTest() throws NameNotFoundException {
        starSystem.getStar("Sol").addPlanet("Earth");
        starSystem.getStar("Sol").getPlanet("Earthh").addMoon("Moon");
    }
}
