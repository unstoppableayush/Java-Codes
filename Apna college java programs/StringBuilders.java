
public class StringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert char at index 0
        sb.insert(2,'n');
        System.out.println(sb);

        //Delete extra 'n'
        sb.delete(2,3);
        System.out.println(sb);

        //append-add in last
        sb.append("k");
        sb.append("a");
        sb.append("k");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);
        System.out.println(sb.length());
        

    }
}
