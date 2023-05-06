package advance.dev;

class Student {

    private String name;
    private int age;
    private String address;
    private String phone;
    private float gpa;

    public Student(String name, int age, String address, String phone, float gpa) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public float getGpa() {
        return gpa;
    }
}
