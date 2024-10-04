package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Search_in_sortedarrayTest {
@Test
public void testSearch_in_sortedarray(){
    Search_in_sortedarray search_array=new Search_in_sortedarray();
    int[] array={1,2,3,4,5,6};
    int target=3;
    int expected=2;
    Assertions.assertEquals(expected, search_array.search(array, target));

}    
}
