public class WisielecRysunek {
   private static final String[] GRAFIKA = {
         """
                  ------
                  |    |
                  |
                  |
                  |
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |
                  |
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |    |
                  |
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |   /|
                  |
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |   /|\\
                  |
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |   /|\\
                  |   /
                  |
                  |
                  |
               """,
         """
                  ------
                  |    |
                  |    O
                  |   /|\\
                  |   / \\
                  |
                  |
                  +=========
               """
   };

   public static void rysujWisielca(int proby) {
      System.out.println(GRAFIKA[6 - proby]);
   }
}