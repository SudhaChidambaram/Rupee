import java.util.Objects;

public class Rupee {
    private final int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if(o ==null) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }



}
