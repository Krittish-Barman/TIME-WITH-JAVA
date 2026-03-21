class countch {
    public static void main(String args[]) {
        String str = "I Live in Krishnagar";
        int i, c = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                c++;
        }
        System.out.println("The total number of character is " + c);
    }
}