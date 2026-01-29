public class PersonObject {

    private String name;
    private int age;

    public PersonObject(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
        this.name = name;
        } else{
            System.out.println("Error nombre invalido!");
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >0 && age < 150){
            this.age = age;
        }else{
            System.out.println("Error, edad invalida!");
        }
    }

}
