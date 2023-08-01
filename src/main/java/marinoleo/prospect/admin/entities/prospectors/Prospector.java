package marinoleo.prospect.admin.entities.prospectors;

import jakarta.persistence.*;

@Entity
@Table (name="Prospector")
public class Prospector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mail")
    private String mail;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "linkedin")
    private String linkedin;
    @Column(name = "phone")
    private String phone;
    @Column(name = "country")
    private String country;
    //Examen aprobado:1,Examen no aprobado:0, por defecto 0.
    @Column(name = "exam")
    private Boolean exam;
    //Habilitado:1, Deshabilitado por admin:0, por defecto 1.
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "level")
    private Integer level;

    public Prospector(String mail, String name, String lastName, String linkedin, String phone, String country) {
        this.mail = mail;
        this.name = name;
        this.lastName = lastName;
        this.linkedin = linkedin;
        this.phone = phone;
        this.country = country;
    }

    public Prospector() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getExam() {
        return exam;
    }

    public void setExam(Boolean exam) {
        this.exam = exam;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Prospector{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                ", exam=" + exam +
                ", enabled=" + enabled +
                ", level=" + level +
                '}';
    }
}