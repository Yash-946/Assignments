
    import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regular_Expression {
        public static void main(String[] args) {
            String target ="yash102@gmail.com";
            Pattern P = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|reddif)[.]com");
            Matcher m = P.matcher(target);
            int count = 0;
            while(m.find())
            {
                System.out.println(m.start()+"----"+m.end()+"----"+m.group());
                count++;
            }
            System.out.println(count);
        }
    }

