package module_3;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Phone {

    private String prefix;
    private String number;
    private String bonusCode;
}