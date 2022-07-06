package register_Teacher;



public abstract class CommonFun implements Function{
    public String toString(){
        return "("+this.getCode()+")"+this.getFunStr();
    }

    public boolean isBlank(String str){
        return str==null || "".equals(str);
    }
}
