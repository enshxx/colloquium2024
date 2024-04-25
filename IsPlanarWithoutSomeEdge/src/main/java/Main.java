import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.oldmodel.directed.DirectedGraph;
import com.mathsystem.api.graph.oldmodel.undirected.UndirectedEdge;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        IsPlanarWithoutSomeEdge isPlanarWithoutSomeEdge = new IsPlanarWithoutSomeEdge();
        var testGraph = GraphFactory.loadGraphFromFile(new File("src/main/resources/almost_k5.txt"));
        boolean result = isPlanarWithoutSomeEdge.execute(testGraph);
        System.out.println(result);
    }
}