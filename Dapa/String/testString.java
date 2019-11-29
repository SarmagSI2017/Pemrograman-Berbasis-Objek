class testString{
    public static void main(String[] args) {
        String teks = "Belajar Java Itu Mudah";
        String teks_a = "Java";
        System.out.println("Teks                        = "+teks);
        System.out.println("Teks_a                      = "+teks_a);
        System.out.println("Substring(0,3)              = "+teks.substring(0,3));
        System.out.println("CharAt(6)                   = "+teks.charAt(6));
        System.out.println("length()                    = "+teks.length());
        System.out.println("concat(, Setuju?)           = "+teks.concat(", Setuju?"));
        System.out.println("replace('a','A')            = "+teks.replace('a','A'));
        System.out.println("toLowerCase()               = "+teks.toLowerCase());
        System.out.println("toUpperCase()               = "+teks.toUpperCase());
        System.out.println("trim()                      = "+teks.trim());
        System.out.println("equals('Java')              = "+teks_a.equals("Java"));
        System.out.println("equalsIgnoreCase('Java')    = "+teks_a.equalsIgnoreCase("Java"));

        System.out.print("charAt dengan perulangan    = ");
        for(int i=0; i<teks.length(); i++){
            System.out.print(teks.charAt(i) + " ");
        }
        System.out.println();

        String teks_b = teks_a;
        if(teks_a.equals(teks_b))
            System.out.println("teks_a == teks_b");
        else
            System.out.println("teks_a != teks_b");

        int result = teks.compareTo(teks_a);
        if(result == 0)
            System.out.println("teks and teks_a are equal");
        else if(result > 0)
            System.out.println("teks is less than teks_a");
        else
            System.out.println("teks is greater than teks_a");

        String str2 = "One Two Three One";
        int idx = str2.indexOf("One");
        System.out.println("Index of first occurence of One : "+idx);

        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurence of One : "+idx);
    }
}