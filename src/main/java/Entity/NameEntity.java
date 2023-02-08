package Entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "NameEntity.byDept",query = "select e from NameEntity e")
@Table(name = "name", schema = "public", catalog = "testing")
public class NameEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "f_name", nullable = false, length = -1)
    private String fName;
    @Basic
    @Column(name = "l_name", nullable = false, length = -1)
    private String lName;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "f_name", nullable = false, length = -1)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "l_name", nullable = false, length = -1)
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameEntity that = (NameEntity) o;

        if (id != that.id) return false;
        if (fName != null ? !fName.equals(that.fName) : that.fName != null) return false;
        if (lName != null ? !lName.equals(that.lName) : that.lName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "NameEntity{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

}
