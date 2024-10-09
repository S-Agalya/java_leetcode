package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SearchInSortedarrayTest {
@Test
public void testSearch_in_sortedarray(){
    SearchInSortedarray search_array=new SearchInSortedarray();
    int[] array={1,2,3,4,5,6};
    int target=3;
    int expected=2;
    Assertions.assertEquals(expected, search_array.search(array, target));

}    
}
