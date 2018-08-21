package colletionDemo;

public class UpdateStu implements Comparable<Object>{
    String name;
    long id;
    public UpdateStu(String name,long id){
        this.name = name;
        this.id = id;
}

    public int compareTo(Object o ){
        UpdateStu upstu = (UpdateStu)o;
        //int result = id > upstu? 1 : (id==upstu.id ? 0:-1);
        //return result;
        return 1;
    }

    public String getName(){
        return name;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public void setId(long newid){
        this.id = newid;
    }


}