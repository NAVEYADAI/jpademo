import Entity.EmployeeEntity;
import Entity.NameEntity;

public class tmp {
    /*
        get: last name and first name
        set: NameEntity for insert to EmployeeTable
        use him them
        entityManager.persist(tmp.insertNameTable(fName,lName));
     */
    public static NameEntity insertNameTable(String FName , String LName){
        NameEntity dataEntity=new NameEntity();
        dataEntity.setfName(FName);
        dataEntity.setlName(LName);
        return dataEntity;
    }
    /*
        get: last name and first name
        set: EmployeeEntity for insert to EmployeeTable
        use him them
        entityManager.persist(tmp.insertEmployeeTable(fName,lName));
     */
    public static EmployeeEntity insertEmployeeTable(String FName , String LName){
        EmployeeEntity dataEntity=new EmployeeEntity();
        dataEntity.setfName(FName);
        dataEntity.setlName(LName);
        return dataEntity;
    }


}
