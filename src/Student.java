import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {

    private String surname;
    private String name;
    private String patronymic;
    private Calendar birthday = new GregorianCalendar();
    private String phone;
    private String mail;

    public Student(String surname,String name,String patronymic,Calendar birthday,String phone,String mail){
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setBirthday(birthday);
        setPhone(phone);
        setMail(mail);
    }

    public Student(){

    }

    public Student(String иванов, String иван, String иванович, String s, String number, String mail) {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}