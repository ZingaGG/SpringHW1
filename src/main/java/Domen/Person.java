package Domen;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;
@Getter
@Setter
public class Person {
    private String fName;
    private String sName;
    private int age;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(fName)
                .append(sName)
                .append(age)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Person person)) return false;

        return new EqualsBuilder().append(fName, person.fName)
                .append(sName, person.sName)
                .append(age, person.age)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(5,45)
                .append(fName)
                .append(sName)
                .append(age)
                .toHashCode();
    }
}
