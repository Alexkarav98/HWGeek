import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[]words ={"dog","cat","frog","dog","elephant","frog","rabbit","hare",};

        Map<String,Integer> map= new HashMap<>();
        for (String word : words){
           map.put(word,map.getOrDefault(word,0) + 1);
        }
        System.out.println(map);
      /* for (int i = 0;i<words.length;i++){
            for (int k = 0;k<words.length;k++){
               if (words[i].equals(words[k]))
                    System.out.println(words[i]+ " " + "Кол-во повторов:");
           }
        }*/


        Set<String> unique=new HashSet<>(Arrays.asList(words));
        System.out.println(unique);


        Phonebook pb = new Phonebook();
        pb.add("Runov","812321");
        pb.add("Duck","81123");
        pb.add("Runov","812321");

        System.out.println(pb.get("Runov"));
    }
}
