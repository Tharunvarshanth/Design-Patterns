package singleton;

public class ClipBoard {

   private Object data;
   private static ClipBoard instance = null;

  private ClipBoard(){}


  public static ClipBoard getInstance (){
      if(instance == null){
          instance = new ClipBoard();
      }
          return instance;


  }

   public void copy(Object data){
        this.data = data;
   }

   public Object paste(){
       return data;
   }
}
