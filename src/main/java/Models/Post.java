package Models;

import com.sun.istack.internal.NotNull;
import lombok.*;

import java.util.UUID;


@ToString
@Builder
@Setter
@Getter
@AllArgsConstructor
public class Post {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

}
