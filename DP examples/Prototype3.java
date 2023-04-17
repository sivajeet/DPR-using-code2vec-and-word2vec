
import java.util.ArrayList;
import java.util.List;
public class Users implements Cloneable{
    private List<String> empList;

    public Users(){

      empList = new ArrayList<>();
      }

public Users(List<String> list){
this.empList=list;
}

//read some data from the database.
public void loadData(){
    empList.add("japak");
    empList.add("King");
    empList.add("David");
    empList.add("Romeo");
}

public List<String> getEmpList() {
    return empList;
}

  @Override
  public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
          temp.add(s);
          }
          return new Users(temp);
}
}

 //Notice that the clone method is overridden to provide a deep copy of the users list.