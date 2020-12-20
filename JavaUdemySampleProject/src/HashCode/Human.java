package HashCode;

public class Human {
    public  int adharNumber;
    public String name;

    public Human(int adharNumber, String name)
    {
        this.adharNumber = adharNumber;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==this){
            return true;
        }
        if(obj ==null){
            return false;
        }
        //if its same type then only continue
        //if diffrent then return false
        if(obj.getClass() != this.getClass()){
            return  false;
        }
        Human anotherHuman = (Human)obj;
        if(this.adharNumber != anotherHuman.adharNumber){
            return  false;
        }
        if(this.name==null){
            if(anotherHuman.name != null)
            {
                return false;
            }
        }
        if(!this.name.equals(anotherHuman.name)){
            return false;
        }
        return true;
    }
}
