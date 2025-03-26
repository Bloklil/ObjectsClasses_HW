import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object auth) {
        if (this == auth) return true;
        if (auth == null || getClass() != auth.getClass()) return false;
        Author author = (Author) auth;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
