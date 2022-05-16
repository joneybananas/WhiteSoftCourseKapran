package Models;

import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@ToString
@Builder
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    @NotNull
    String firstName;
    @NotNull
    String lastName;

    String description;

    @NotNull
    List<String> characteristics;
    @NotNull
    Post post;
}
