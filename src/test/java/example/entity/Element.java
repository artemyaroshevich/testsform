package example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data

public class Element {
    String fullName;
    String email;
    String currentAddress;
    String permananetAddress;
}
