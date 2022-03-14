import java.util.Objects;

public class Rupee {
    private final int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
