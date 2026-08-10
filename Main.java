import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {


    public static void main(String[] args){
        Optional<String> name = getName(1);
        if(name.isPresent()){
            System.out.println(name.get());
        }

        name.ifPresent(System.out::println);
//        String defaultName = name.orElse("Asad");
//        String defaultName = name.orElseGet(() -> "Asad");
         name.orElseThrow(NoSuchElementException::new);

         Optional<String> optional =  getName(2);
         Optional<String> optional2 = optional.map(x -> x.toUpperCase());
         optional2.ifPresent(System.out::println);

//        System.out.println(defaultName);
    }


    private static Optional<String> getName(int id){
        String name = null;
        return Optional.ofNullable(name);
    }
}
