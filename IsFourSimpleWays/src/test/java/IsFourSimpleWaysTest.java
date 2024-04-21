import com.mathsystem.api.graph.GraphFactory;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class IsFourSimpleWaysTest {

    @Test
    public void activateSimpleTest() throws FileNotFoundException {
        IsFourSimpleWays isFourSimpleWays = new IsFourSimpleWays();
        var trueGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/trueGraph.txt"));
        var falseGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/falseGraph.txt"));

        assertThat(isFourSimpleWays.execute(trueGraph)).isTrue();
        assertThat(isFourSimpleWays.execute(falseGraph)).isFalse();
    }
}