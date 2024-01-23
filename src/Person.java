public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int cpf;

    public Person(){

    }
    public Person(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    /**
     *  Return a String of the firsName
     * @returns firstName
     */
    public  String getFirstName(){
        return firstName;
    }
    /**
     * Returs a String of the middleName
     * @return middleName
     */
    public String getMiddleName(){
        return middleName;
    }
    /**
     * Returns a String of the lastName
     * @return astName
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * Returns a concatenated string of the Person's name
     * @return the Person's first, middle, ans last name.
     */
    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
