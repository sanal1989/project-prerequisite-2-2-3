package web.dto;

public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String carModel;
    private int carYear;
    private String carColor;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String email, String carModel, int carYear, String carColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
