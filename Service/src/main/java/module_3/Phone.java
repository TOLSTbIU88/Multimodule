package module_3;

import lombok.*;

@Data
@AllArgsConstructor
public class Phone {
    @NonNull
    private String prefix;
    @NonNull
    private String number;

    private String bonusCode;
}