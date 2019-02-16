import exception.CustomException;
import tools.Converter;

public class Main {
    public static void main(String[] args) {
        String[][] correct= {
                {"1", "2", "3", "4"},
                {"3", "6", "1", "1"},
                {"0", "2", "7", "2"},
                {"1", "2", "4", "2"}
        };
        String[][] wrongSize= {
                {"1", "2", "3", "4"},
                {"3", "6",},
                {"0", "2", "7", "2"},
                {"1", "2",}
        };
        String[][] wrongChar= {
                {"1", "2", "3", "4"},
                {"3", "6", "", "1"},
                {"0", "", "7", "2"},
                {"1", "2", "4", "2"}
        };
        try {
            System.out.println(Converter.strConverter(correct));
        } catch (CustomException e){
            e.getMessage();
        }
        try {
            System.out.println(Converter.strConverter(wrongSize));
        } catch (CustomException e){
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
