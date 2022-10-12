package module_3;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Phone {
    @NonNull
    private String prefix;
    @NonNull
    private String number;
    private String bonusCode;
}