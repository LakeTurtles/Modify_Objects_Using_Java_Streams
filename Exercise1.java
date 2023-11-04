import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> dailyChores = new ArrayList<>();

        dailyChores.add("Wash Dishes");
        dailyChores.add("Fold Laundry");
        dailyChores.add("Code For an Hour");
        dailyChores.add("Clean My Room");

        for(String chore: dailyChores){
            System.out.println(chore);
        }

        System.out.println("/////////////////////////////////////////////");

        dailyChores.remove("Wash Dishes");

        for(String chore: dailyChores){
            System.out.println(chore);
        }

        System.out.println("/////////////////////////////////////////////");


        for(int i = 0; i < dailyChores.size(); i ++){
            if (dailyChores.get(i) == "Code For an Hour"){
                dailyChores.remove(i);
                dailyChores.add(i, "Code For the Day");
            }
        }

        for(String chore: dailyChores){
            System.out.println(chore);
        }

        System.out.println("/////////////////////////////////////////////");



        List<String> updatedChores = dailyChores.stream()
                .map(chore -> chore.equals("Clean My Room") ? "Clean My Car" : chore)
                .collect(Collectors.toList());

        System.out.println(updatedChores);

    }
}
