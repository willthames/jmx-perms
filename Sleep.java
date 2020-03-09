import java.lang.Integer;
import java.lang.Thread;

public class Sleep {
  public static void main(String[] args) {
    int duration = Integer.parseInt(args[0], 10);
    try {
      Thread.sleep(duration * 1000);
    }
    catch(Exception e) {
    }
  }
}
