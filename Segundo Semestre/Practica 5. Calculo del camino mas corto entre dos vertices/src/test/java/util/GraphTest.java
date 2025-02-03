package pr2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class GraphTest{

    /*
     * This test checks that the method `shortestPath(V v1, V v2)` finds the 
     * best path between `v1` and `v2` when it exists.
     *
     */
    @Test
    public void shortestPathFindsAPath(){
        System.out.println("\nTest shortestPathFindsAPath"); 
        System.out.println("----------------------------"); 
        // We build the graph
        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(5, 4);

        // We build the expected path
        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(4);
        //We check if the returned path is equal to the expected one.
        assertEquals(expectedPath, g.shortestPath(1, 4));
    }
}
