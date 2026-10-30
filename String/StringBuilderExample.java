public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Dnyaneshwari");

       // sb.append(" Chavan");
        //System.out.println(sb);

        // sb.insert(0, "Hello ");
        // System.out.println(sb);

        // sb.replace(6, 12, "Student");
        // System.out.println(sb);

        // sb.delete(0, 6);
        // System.out.println(sb);

        // System.out.println(sb.reverse());
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(4, 'A');
        // System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());
    
    }
}
    

