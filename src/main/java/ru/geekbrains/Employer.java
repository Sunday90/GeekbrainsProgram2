package ru.geekbrains;

public class Employer {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private short age;


    public String getInfo () {
        String info = String.format("ФИО: %s \nДолжность: %s, \nEmail: %s, \nТелефон: %s, \nЗарплата: %f, \nВозраст: %d", getFio(), getPosition(), getEmail(), getPhone(), getSalary(), getAge());
        return info;
    }


    public Employer (String fio, String  position, String email, String phone, double salary, short age) {
        try {
            setFio(fio);
            setPosition(position);
            setEmail(email);
            setPhone(phone);
            setSalary(salary);
            setAge(age);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getFio() {
        return fio;
    }

    private void setFio (String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary (double salary) throws Exception {

        if (salary > 0) {
            this.salary = salary;
        }
        else  {throw new Exception("Зарплата не может быть меньше или равна нулю.");}

    }


    public short getAge() {
        return age;
    }

    private void setAge (short age) throws Exception {
        if (age > 0) {
            this.age = age;
        }
        else {throw new Exception("Возраст не может быть меньше или равен нулю.");}
    }

}
