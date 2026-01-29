public class BookObject{
    
    private String title;

    public BookObject(String title){
        setTitle(title);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title == null || title.trim().isEmpty()){
            System.out.println("Error!");
        }else{
            this.title = title;
        }
    }
}