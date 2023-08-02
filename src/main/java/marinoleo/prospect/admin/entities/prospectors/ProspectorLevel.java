package marinoleo.prospect.admin.entities.prospectors;

import jakarta.persistence.*;

@Entity
@Table(name="ProspectorLevel")
public class ProspectorLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="name")
    private String name;
    @Column (name="meetAmount")
    private Integer meetAmount;
    @Column (name="commission")
    private Double commission;

    public ProspectorLevel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMeetAmount() {
        return meetAmount;
    }

    public void setMeetAmount(Integer meetAmount) {
        this.meetAmount = meetAmount;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ProspectorLevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meetAmount=" + meetAmount +
                ", commission=" + commission +
                '}';
    }
}
