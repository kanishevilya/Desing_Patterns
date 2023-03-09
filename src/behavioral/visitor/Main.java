package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IPlace> places = new ArrayList<>();

        places.add(new Cinema());
        places.add(new Circus());
        places.add(new Zoo());

        for(IPlace place:places){
            Vacation visitor=new Vacation();
            place.accept(visitor);
            System.out.println(visitor.place);
        }


    }
}
