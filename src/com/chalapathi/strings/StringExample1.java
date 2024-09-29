package com.chalapathi.strings;

public class StringExample1 {
    String fieldString;
    public static void main(String...args) {
        String localVarString;
        // System.out.println(localVarString); -> compilation error
       // System.out.println(fieldString);
        //Let’s now create two Strings using the same literal:

        String literalOne = "Baeldung";
        String literalTwo = "Baeldung";
        String another = "another";

        System.out.println(literalOne.hashCode());
//        System.out.println(literalTwo.hashCode());
//        System.out.println(another.hashCode());

        String usingNew = new String("Baeldung");
        System.out.println(usingNew.hashCode()); // hash code might be same

        System.out.println(literalOne == usingNew);
        System.out.println(literalOne == literalTwo); //references same.
        System.out.println(literalOne.equals(usingNew));

        System.out.println();
        String emptyLiteral = "";
        String emptyNewString = new String("");
        String emptyNewStringTwo = new String();
        System.out.println(emptyLiteral == emptyNewString);
        System.out.println(emptyLiteral.equals(emptyNewString));

        String nullValue = null;
        System.out.println(nullValue);

        System.out.println();

        String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung");
        newString= newString.intern();
        System.out.println(constantString==newString);


      //Text blocks
        String str= """
            <html>

                <body>
                    <span>example text</span>
                </body>
            </html>""";
        System.out.println(str);
    }
}
