public class FindNum{
  public static void main(String[] args) {
      find(30);
  }

  public static void find(int i) {
    for(int j = 0; j <= i; j++){
        boolean isS = true;
        for(int k = 2; k <j; k++) {
            if(j % k == 0) {
	isS = false;
	break;
            }
        }
       if(isS){System.out.println(j);}
    }
  }
}