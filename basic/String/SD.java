
class SD {

    public static void main(String args[]) {

        StringBuilder sd = new StringBuilder("Tony");
        System.out.println(sd);
        System.out.println("Count of Character : " + sd.length());
        //char at Index 0

        System.out.println("Rendem Char : " + sd.charAt(3));

        // 1.  StringBuilder Insert()
        sd.insert(2, 'n');
        System.out.println("Insert 'n' : " + sd);
        
        // 2. StringBuilder setCharAt()
        sd.setCharAt(2, 'N');
        System.out.println("change the 'N' : " + sd);

        // 3. StringBuilder 
        sd.delete( 2, 3);
        System.out.println("Delete the Index Value : " + sd );
    }
}
