package java8.incollections;

import java.util.Arrays;
import java.util.List;

public class MoveTowardsPredicates {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");


        final long countOfFriends = friends.stream()
                .filter(AllPredicates.getN()).count();
        final long countOfComrades = comrades.stream()
                .filter(AllPredicates.getN()).count();
        final long countOfEditors = editors.stream()
                .filter(AllPredicates.getN()).count();

        System.out.println(countOfFriends + "  " + countOfComrades + " " + countOfEditors);

        // The lambda expression here has definitely made the code concise, however the line of code
        // where the filter logic is written is duplicate for all
        // we can fix that with predicates
    }


}
