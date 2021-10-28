package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    public abstract double getPrice();
    public abstract String getDescription();
}
