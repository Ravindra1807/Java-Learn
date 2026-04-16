class ad{
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("HELLO");
        // sd.append("e"); //str  = str + "e";
        // sd.append("l");
        // sd.append("l");
        // sd.append("o");
        

        System.out.println("Normal String : " + sd);

        // 4. Reverse the StringBuilder

        for (int i = 0; i < sd.length()/2; i++) {
            int front = i;
            int back = sd.length()-1-i;

            System.out.println(front);


            char frontChar = sd.charAt( front);
            char backChar =  sd.charAt( back);

            sd.setCharAt( front, backChar);
            sd.setCharAt( back, frontChar);
            
            
        }
         System.out.println("Reverse The String  : " + sd);

    }
}