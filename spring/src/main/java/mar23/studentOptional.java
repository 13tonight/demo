package mar23;

import java.util.Optional;

public class studentOptional {
    //exceptionalClass exceptionalClass = new exceptionalClass("not found");
    public student studentDao() {

        Optional<student> optionalStudent = Optional.ofNullable(optionalEmp());
        //return optionalStudent.orElseGet(()-> new student("test", "test"));

        return optionalStudent.orElseThrow(()-> new RuntimeException("not found"));
    }
    public student optionalEmp(){

        if(Math.random()>0.5){
            return new student("haswanth", "gurram");
        }else {
            return null;
        }
    }
}
