package module_3;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {

    public String getFullNumber(Phone phone) {
        return phone.getPrefix()+phone.getNumber();
    }
}
