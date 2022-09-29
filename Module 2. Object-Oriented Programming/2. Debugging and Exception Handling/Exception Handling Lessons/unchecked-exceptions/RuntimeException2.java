public class RuntimeException2 {
    public static void main(String[] args) {
        String word = null;
        
        if(word==null){
            System.out.println("The word is null.");
        }else{
            word.toLowerCase();
        }
    }
}
