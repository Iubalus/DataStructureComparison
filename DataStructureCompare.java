
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jubal Rife
 */
public class DataStructureCompare {
    public static long timeOperation(List data, double drawFrom, int numberOfTests){
        int size = data.size();//This is because data.size() has different cost for LinkedList and ArrayList.
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfTests; i++){
            data.remove((drawFrom*(size)) - 1);
            size--;
        }
        long endTime = System.currentTimeMillis();
        
        //repopulate the test set
        for(int i = 0; i < numberOfTests;i++){
            data.add(new Object());
        }
        return endTime - startTime;
    }
    public static void main(String[] args){
        int dataSize = 10000000;//size of the test structures.
        int operations = 10000;//number of each type of operation performed.
        //create two test Lists of the same size
        ArrayList array = new ArrayList();
        LinkedList linked = new LinkedList();
        for(int i = 0; i < dataSize; i++){
            array.add(new Object());
            linked.add(new Object());
        }
        System.out.println("Lists created...begin time testing.");
        String[] drawLocations = {"the front of", "1/4 into", "the middle of", "3/4 into", "the end of"};
        long arrayTime;
        long linkTime;
        double mult = 0.0;
        //Iterate through different tests.
        for(int i = 0; i < 5; i++){
            arrayTime = timeOperation(array, mult, operations);
            linkTime = timeOperation(linked, mult, operations);
            System.out.println("Removing Elements from " + drawLocations[i] + " a list.");
            System.out.format("The ArrayList  took (%dmillis) to complete %d operations.\n", arrayTime, operations);
            System.out.format("\tAverage time per operation = %fmillis\n", ((double)arrayTime)/((double)operations));
            System.out.format("The LinkedList took (%dmillis) to complete %d operations.\n", linkTime, operations);
            System.out.format("\tAverage time per operation = %fmillis\n\n", ((double)linkTime)/((double)operations));
            mult += 0.25;
        }
    }
}
