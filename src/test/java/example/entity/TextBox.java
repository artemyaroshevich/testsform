package example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class TextBox {
    String fullName;
    String email;
    String currentAddress;
    String permananetAddress;
}
