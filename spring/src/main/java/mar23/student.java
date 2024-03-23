package mar23;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class student {
    String firstName;
    String lastName;

    public student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
