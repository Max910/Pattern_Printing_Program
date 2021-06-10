import java.util.Scanner;

public class ppp {
    public static void main(String[] args) {


        //initialization
        int a, b = 1, n, Character_choice, Pattern_choice;
        String c;
        boolean t = true, t1 = true, t2 = true;
        Scanner S = new Scanner(System.in);
        // User choices and welcome messages
        System.out.println("\n\n***** Welcome To Pattern Printing Program *****");
        System.out.println("\n\nWhich character you want in pattern asterisk symbol(*) or Numbers or alphabets?\nPress 1 for asterisk symbol(*)\nPress 2 Numbers\nPress 3 Alphabets ");
        Character_choice = S.nextInt();
        //if user entered something greater than 3 this while loop will be triggered
        if (Character_choice > 3) {
            while (t2) {
                System.out.println("Not a valid option! Please Choose between above option\n then type number number in between 1 to 3   ");
                Character_choice = S.nextInt();
                if (Character_choice <= 3 && Character_choice != 0) {
                    t2 = false;
                }
            }
        }



            // asterisk symbol(*)
                if (Character_choice == 1) {
                    System.out.println("\n\nPlease Choose which type of pattern you want among these: ");
                    System.out.println("pattern1\tpattern2");
                    System.out.println("*****\t\t*****\n****\t\t ****\n***\t\t\t  ***\n**\t\t\t   **\n*\t\t\t\t*");
                    System.out.println("\npattern3\tpattern4");
                    System.out.println("*\t\t\t\t *\n**\t\t\t\t**\n***\t\t\t   ***\n****\t\t  ****\n*****\t\t *****");
                    System.out.println("\npattern5");
                    System.out.println("\t*\n   * *\t\n  * * *\n * * * *\n* * * * *");
                    System.out.println("\npattern6");
                    System.out.println("        *  *  *  *  *  *  *  *  *  *\n      *  *  *  *  *  *  *  *  *  *\n    *  *  *  *  *  *  *  *  *  *\n  *  *  *  *  *  *  *  *  *  *\n*  *  *  *  *  *  *  *  *  *\n  *  *  *  *  *  *  *  *  *  *\n    *  *  *  *  *  *  *  *  *  *\n      *  *  *  *  *  *  *  *  *  *\n        *  *  *  *  *  *  *  *  *  *\n          *  *  *  *  *  *  *  *  *  * ");
                    System.out.println("Please Choose in between 1 to 6 from above: ");
                    Pattern_choice = S.nextInt();
                    if (Pattern_choice > 6) {
                        while (t1) {
                            System.out.println("Not a valid option! Please Choose between above patterns 1 to 6\n then type number number in between 1 to 6   ");
                            Pattern_choice = S.nextInt();
                            if (Pattern_choice <= 6 && Pattern_choice != 0) {
                                t1 = false;
                            }
                        }
                    }

                System.out.println("Please Enter How many Rows You Want in pattern: ");
                n = S.nextInt();

                if (Pattern_choice == 1) {

                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                  /* Number Pattern 1
                                                                                         *****
                                                                                         ****
                                                                                         ***
                                                                                         **
                                                                                         *       */
                    while (b <= n) {

                        for (a = b; a <= n; a++)
                            System.out.print("*");

                        b++;
                        System.out.println(" ");
                    }
                }

                if (Pattern_choice == 2) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                /* Number Pattern 2
                                                                                        *****
                                                                                         ****
                                                                                          ***
                                                                                           **
                                                                                            *     */
                    while (b <= n) {
                        if (b > 1)
                            for (a = 2; a <= b; a++)
                                System.out.print(" ");

                        for (a = b; a <= n; a++)
                            System.out.print("*");

                        b++;
                        System.out.println(" ");
                    }
                }

                if (Pattern_choice == 3) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                /* pattern 3
                                                                                    *
                                                                                    **
                                                                                    ***
                                                                                    ****
                                                                                    *****    */
                    while (b <= n) {
                        for (a = 1; a <= b; a++)
                            System.out.print("*");
                        b++;
                        System.out.println(" ");
                    }
                }

                if (Pattern_choice == 4) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                     /* pattern 4
                                                                                         *
                                                                                        **
                                                                                       ***
                                                                                      ****
                                                                                     *****     */
                    while (b <= n) {

                            for (a = b; a <= n-1; a++)
                                System.out.print(" ");

                        for (a = 1; a <= b; a++)
                            System.out.print("*");
                        b++;
                        System.out.println(" ");
                    }

                }

                if (Pattern_choice == 5) {

                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                 /* pattern 5
                                                                                     *
                                                                                    * *
                                                                                   * * *
                                                                                  * * * *
                                                                                 * * * * *  */
                    while (b <= n) {
                        if (b <= n-1) {
                            for (a = b; a <= n-1; a++)

                                System.out.print(" ");
                        }

                        for (a = 1; a <= b; a++)
                            System.out.print("*" + " ");
                        b++;
                        System.out.println(" ");
                    }

                }

                if (Pattern_choice == 6) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                  /*pattern6
                                                                          *  *  *  *  *  *  *  *  *  *
                                                                         *  *  *  *  *  *  *  *  *  *
                                                                       *  *  *  *  *  *  *  *  *  *
                                                                      *  *  *  *  *  *  *  *  *  *
                                                                    *  *  *  *  *  *  *  *  *  *
                                                                     *  *  *  *  *  *  *  *  *  *
                                                                      *  *  *  *  *  *  *  *  *  *
                                                                       *  *  *  *  *  *  *  *  *  *
                                                                        *  *  *  *  *  *  *  *  *  *
                                                                         *  *  *  *  *  *  *  *  *  *
                                                                   */

                    while (b <= n) {
                        if (b <= n - 1) {
                            for (a = b; a <= n - 1; a++)

                                System.out.print("  ");
                        }

                        for (a = 1; a <= n; a++)
                            System.out.print("*" + "  ");
                        for (a = 1; a <= n; a++)
                            System.out.print("*" + "  ");

                        b++;
                        System.out.println(" ");
                    }

                    b = 1;
                    while (b <= n) {
                            for (a = b; a >= 1; a--)

                                System.out.print("  ");



                        for (a = 1; a <= n; a++)
                            System.out.print("*" + "  ");
                        for (a = 1; a <= n; a++)
                            System.out.print("*" + "  ");
                        b++;
                        System.out.println(" ");
                    }
                    System.out.println("\n\n");
                }


            }

            //number
            if (Character_choice == 2) {
                System.out.println("\n\nPlease Choose which type of pattern you want among these: ");
                System.out.println("pattern1\tpattern2");
                System.out.println("12345\t\t12345\n2345\t\t 2345\n345\t\t\t  345\n45\t\t\t   45\n5\t\t\t\t5");
                System.out.println("\npattern3\tpattern4");
                System.out.println("1\t\t\t\t 1\n12\t\t\t\t12\n123\t\t\t   123\n1234\t\t  1234\n12345\t\t 12345");
                System.out.println("\npattern5");
                System.out.println("\t1\n   1 2\t\n  1 2 3\n 1 2 3 4\n1 2 3 4 5");
                System.out.println("\npattern6");
                System.out.println("        1  2  3  4  5  1  2  3  4  5\n      1  2  3  4  5  1  2  3  4  5\n    1  2  3  4  5  1  2  3  4  5\n  1  2  3  4  5  1  2  3  4  5\n1  2  3  4  5  1  2  3  4  5\n  1  2  3  4  5  1  2  3  4  5\n    1  2  3  4  5  1  2  3  4  5\n      1  2  3  4  5  1  2  3  4  5\n        1  2  3  4  5  1  2  3  4  5\n          1  2  3  4  5  1  2  3  4  5 ");
                System.out.println("Please Choose in between 1 to 6 from above: ");
                Pattern_choice = S.nextInt();

                if (Pattern_choice > 6) {
                    while (t1) {
                        System.out.println("Not a valid option! Please Choose between above patterns 1 to 6\n then type number number in between 1 to 6   ");
                        Pattern_choice = S.nextInt();
                        if (Pattern_choice <= 6 && Pattern_choice != 0) {
                            t1 = false;
                        }
                    }
                }

                System.out.println("Please Enter How many Rows You Want in pattern: ");
                n = S.nextInt();
                if (Pattern_choice == 1) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                        /* Number Pattern 1
                                                                                                12345
                                                                                                2345
                                                                                                345
                                                                                                45
                                                                                                5   */
                    while (b <= n) {

                        for (a = b; a <= n; a++)
                            System.out.print(a);

                        b++;
                        System.out.println(" ");
                    }

                }


                if (Pattern_choice == 2) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                     /* Number Pattern 2
                                                                                             12345
                                                                                              2345
                                                                                               345
                                                                                                45
                                                                                                 5    */
                    while (b <= n) {
                        if (b > 1)
                            for (a = 2; a <= b; a++)
                                System.out.print(" ");

                        for (a = b; a <= n; a++)
                            System.out.print(a);

                        b++;
                        System.out.println(" ");
                    }
                }

                if (Pattern_choice == 3) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                          /* pattern 3
                                                                                            1
                                                                                            12
                                                                                            123
                                                                                            1234
                                                                                            12345 */
                    while (b <= n) {
                        for (a = 1; a <= b; a++)
                            System.out.print(a);
                        b++;
                        System.out.println(" ");
                    }

                }

                if (Pattern_choice == 4) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                        /* pattern 4
                                                                                            1
                                                                                           12
                                                                                          123
                                                                                         1234
                                                                                        12345 */
                    while (b <= n) {
                            for (a = b; a <= n-1; a++)
                                System.out.print(" ");

                        for (a = 1; a <= b; a++)
                            System.out.print(a);
                        b++;
                        System.out.println(" ");
                    }

                }

                if (Pattern_choice == 5) {

                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                      /* pattern 5
                                                                                          1
                                                                                         1 2
                                                                                        1 2 3
                                                                                       1 2 3 4
                                                                                      1 2 3 4 5  */
                    while (b <= n) {
                        if (b <= n-1) {
                            for (a = b; a <= n-1; a++)

                                System.out.print(" ");
                        }

                        for (a = 1; a <= b; a++)
                            System.out.print(a + " ");
                        b++;
                        System.out.println(" ");
                    }

                }

                if (Pattern_choice == 6) {
                    System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                                /*pattern6
                                                                                          1  2  3  4  5  1  2  3  4  5
                                                                                        1  2  3  4  5  1  2  3  4  5
                                                                                      1  2  3  4  5  1  2  3  4  5
                                                                                    1  2  3  4  5  1  2  3  4  5
                                                                                  1  2  3  4  5  1  2  3  4  5
                                                                                    1  2  3  4  5  1  2  3  4  5
                                                                                      1  2  3  4  5  1  2  3  4  5
                                                                                        1  2  3  4  5  1  2  3  4  5
                                                                                          1  2  3  4  5  1  2  3  4  5
                                                                                            1  2  3  4  5  1  2  3  4  5   */

                    while (b <= n) {
                        if (b <= n - 1) {
                            for (a = b; a <= n - 1; a++)

                                System.out.print("  ");
                        }

                        for (a = 1; a <= n; a++)
                            System.out.print(a + "  ");
                        for (a = 1; a <= n; a++)
                            System.out.print(a + "  ");

                        b++;
                        System.out.println(" ");
                    }

                    b = 1;
                    while (b <= n) {
                            for (a = b; a >= 1; a--)
                                System.out.print("  ");


                        for (a = 1; a <= n; a++)
                            System.out.print(a + "  ");
                        for (a = 1; a <= n; a++)
                            System.out.print(a + "  ");
                        b++;
                        System.out.println(" ");
                    }
                    System.out.println("\n\n");
                }

            }


            //Alphabets
            if (Character_choice == 3) {
                System.out.println(" you want small letter or CAPITAL LETTER?\n for small letter press ' a ' || for CAPITAL LETTER press ' A '");

                c = S.next();
                // Checking if user entered A || a
                if (c.equals("A") || c.equals("a")) {
                    if (c.equals("A"))
                        System.out.println("you Chosen CAPITAL LETTER\n ");
                    if (c.equals("a"))
                        System.out.println("you Chosen small letter\n");
                } else {
                    // if user entered something rater than a || A this while loop will be triggered
                    while (t) {
                        System.out.println("Not a valid option! Please Choose a or A");
                        c = S.next();
                        if (c.equals("A") || c.equals("a")) {
                            t = false;
                        }
                    }
                }

                //Capital A
                if (c.equals("A")) {
                    System.out.println("\n\nPlease Choose which type of pattern you want among these: ");
                    System.out.println("pattern1\tpattern2");
                    System.out.println("ABCDE\t\tABCEF\nBCDE\t\t BCDE\nCDE\t\t\t  CEE\nDE\t\t\t   DF\nE\t\t\t\tE");
                    System.out.println("\npattern3\tpattern4");
                    System.out.println("A\t\t\t\t A\nAB\t\t\t\tAB\nABC\t\t\t   ABC\nABCD\t\t  ABCD\nABCDE\t\t ABCDE");
                    System.out.println("\npattern5");
                    System.out.println("\tA\n   A B\t\n  A B C\n A B C D\nA B C D E");
                    System.out.println("\npattern6");
                    System.out.println("        A  B  C  D  F  A  B  C  D  E\n      A  B  C  D  F  A  B  C  D  E\n    A  B  C  D  F  A  B  C  D  E\n  A  B  C  D  F  A  B  C  D  E\nA  B  C  D  F  A  B  C  D  E\n  A  B  C  D  F  A  B  C  D  E\n    A  B  C  D  F  A  B  C  D  E\n      A  B  C  D  E  A  B  C  D  E\n       A  B  C  D  E  A  B  C  D  E\n          A  B  C  D  E  A  B  C  D  E ");
                    System.out.println("Please Choose in between 1 to 6 from above: ");
                    Pattern_choice = S.nextInt();
                    if (Pattern_choice > 6) {
                        while (t1) {
                            System.out.println("Not a valid option! Please Choose between above patterns 1 to 6\n then type number number in between 1 to 6   ");
                            Pattern_choice = S.nextInt();
                            if (Pattern_choice <= 6 && Pattern_choice != 0) {
                                t1 = false;

                            }
                        }
                    }

                        System.out.println("Please Enter How many Rows You Want in pattern: ");
                        n = S.nextInt();
                        if (Pattern_choice == 1) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");
                                                                                     /* Number Pattern 1
                                                                                             ABCDE
                                                                                             BCDE
                                                                                             CDE
                                                                                             DE
                                                                                             E  */
                            while (b <= n) {

                                for (a = b; a <= n; a++)
                                    System.out.print((char) (a + 64));

                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 2) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                  /* Number Pattern 2
                                                                                          ABCDE
                                                                                           BCDE
                                                                                            CDE
                                                                                             DE
                                                                                              E    */
                            while (b <= n) {
                                if (b > 1)
                                    for (a = 2; a <= b; a++)
                                        System.out.print(" ");

                                for (a = b; a <= n; a++)
                                    System.out.print((char) (a + 64));

                                b++;
                                System.out.println(" ");
                            }
                        }

                        if (Pattern_choice == 3) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                       /* pattern 3
                                                                                         A
                                                                                         BC
                                                                                         BCD
                                                                                         BCDE
                                                                                         ABCDE */
                            while (b <= n) {
                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 64));
                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 4) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                           /* pattern 4
                                                                                                A
                                                                                               AB
                                                                                              ABC
                                                                                             ABCD
                                                                                            ABCDE*/
                            while (b <= n) {

                                    for (a = b; a <= n-1; a++)
                                        System.out.print(" ");


                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 64));
                                b++;
                                System.out.println(" ");
                            }
                        }

                        if (Pattern_choice == 5) {

                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                   /* pattern 5
                                                                                       A
                                                                                      A B
                                                                                     A B C
                                                                                    A B C D
                                                                                   A B C D E  */
                            while (b <= n) {
                                if (b <= n - 1) {
                                    for (a = b; a <= n - 1; a++)

                                        System.out.print(" ");
                                }

                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 64) + " ");
                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 6) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                             /*pattern6
                                                                                       1  2  3  4  5  1  2  3  4  5
                                                                                     1  2  3  4  5  1  2  3  4  5
                                                                                   1  2  3  4  5  1  2  3  4  5
                                                                                 1  2  3  4  5  1  2  3  4  5
                                                                               1  2  3  4  5  1  2  3  4  5
                                                                                 1  2  3  4  5  1  2  3  4  5
                                                                                   1  2  3  4  5  1  2  3  4  5
                                                                                     1  2  3  4  5  1  2  3  4  5
                                                                                       1  2  3  4  5  1  2  3  4  5
                                                                                         1  2  3  4  5  1  2  3  4  5  */

                            while (b <= n) {
                                if (b <= n - 1) {
                                    for (a = b; a <= n - 1; a++)

                                        System.out.print("  ");
                                }

                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 64) + " ");
                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 64) + " ");

                                b++;
                                System.out.println(" ");
                            }

                            b = 1;
                            while (b <= n) {
                                for (a = b; a >= 1; a--)

                                    System.out.print("  ");


                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 64) + " ");
                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 64) + " ");
                                b++;
                                System.out.println(" ");
                            }
                            System.out.println("\n\n");
                        }

                }
                    // if small a
                    if (c.equals("a")) {
                        System.out.println("\n\nPlease Choose which type of pattern you want among these: ");
                        System.out.println("pattern1\tpattern2");
                        System.out.println("abcde\t\tabcde\nbcde\t\t bcde\ncde\t\t\t  cde\nde\t\t\t   df\ne\t\t\t\te");
                        System.out.println("\npattern3\tpattern4");
                        System.out.println("a\t\t\t\t a\nab\t\t\t\tab\nabc\t\t\t   abc\nabcd\t\t  abcd\nabcde\t\t abcde");
                        System.out.println("\npattern5");
                        System.out.println("\ta\n   a b\t\n  a b c\n a b c d\na b c d e");
                        System.out.println("\npattern6");
                        System.out.println("        a  b  c  d  f  a  b  c  d  e\n      a  b  c  d  e  a  b  c  d  e\n    a  b  c  d  e  a  b  c  d  e\n  a  b  c  d  e  a  b  c  d  e\na  b  c  d  e  a  b  c  d  e\n  a  b  c  d  e  a  b  c  d  e\n    a  b  c  d  e  a  b  c  d  e\n      a  b  c  d  e  a  b  c  d  e\n        a  b  c  d  e  a  b  c  d  e\n          a  b  c  d  e  a  b  c  d  e ");
                        System.out.println("Please Choose in between 1 to 6 from above: ");
                        Pattern_choice = S.nextInt();
                        if (Pattern_choice > 6) {
                            while (t1) {
                                System.out.println("Not a valid option! Please Choose between above patterns 1 to 6\n then type number number in between 1 to 6   ");
                                Pattern_choice = S.nextInt();
                                if (Pattern_choice <= 6 && Pattern_choice != 0) {
                                    t1 = false;
                                }
                            }
                        }
                        System.out.println("Please Enter How many Rows You Want in pattern: ");
                        n = S.nextInt();
                        if (Pattern_choice == 1) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");
                                                                                     /* Number Pattern 1
                                                                                             ABCDF
                                                                                             BCDF
                                                                                             CDF
                                                                                             DF
                                                                                             F   */
                            while (b <= n) {

                                for (a = b; a <= n; a++)
                                    System.out.print((char) (a + 96));

                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 2) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                  /* Number Pattern 2
                                                                                          abcde
                                                                                           bcde
                                                                                            cde
                                                                                             de
                                                                                              e    */
                            while (b <= n) {
                                if (b > 1)
                                    for (a = 2; a <= b; a++)
                                        System.out.print(" ");

                                for (a = b; a <= n; a++)
                                    System.out.print((char) (a + 96));

                                b++;
                                System.out.println(" ");
                            }
                        }

                        if (Pattern_choice == 3) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                       /* pattern 3
                                                                                         a
                                                                                         ab
                                                                                         abc
                                                                                         abcd
                                                                                         abcde */
                            while (b <= n) {
                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 96));
                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 4) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                        /* pattern 4
                                                                                              a
                                                                                             ab
                                                                                            abc
                                                                                           abcd
                                                                                          abcde     */
                            while (b <= n) {

                                    for (a = b; a <= n-1; a++)
                                        System.out.print(" ");


                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 96));
                                b++;
                                System.out.println(" ");
                            }
                        }

                        if (Pattern_choice == 5) {

                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + " number of rows.\n");

                                                                                   /* pattern 5
                                                                                       a
                                                                                      a b
                                                                                     a b c
                                                                                    a b c d
                                                                                   a b c d e  */
                            while (b <= n) {
                                if (b <= n - 1) {
                                    for (a = b; a <= n - 1; a++)

                                        System.out.print(" ");
                                }

                                for (a = 1; a <= b; a++)
                                    System.out.print((char) (a + 96) + " ");
                                b++;
                                System.out.println(" ");
                            }

                        }
                        if (Pattern_choice == 6) {
                            System.out.println("you selected Pattern Type " + Pattern_choice + "\nand " + n + "number of rows.\n");

                                                                                             /*pattern6
                                                                                       a   b  c  d  f  a   b  c  d  f
                                                                                     a   b  c  d  f  a   b  c  d  f
                                                                                   a   b  c  d  f  a   b  c  d  f
                                                                                 a   b  c  d  f  a   b  c  d  f
                                                                               a   b  c  d  f  a   b  c  d  f
                                                                                 a   b  c  d  f  a   b  c  d  f
                                                                                   a   b  c  d  f  a   b  c  d  f
                                                                                     a   b  c  d  f  a   b  c  d  f
                                                                                       a   b  c  d  f  a   b  c  d  f
                                                                                         a   b  c  d  f  a   b  c  d  f  */

                            while (b <= n) {
                                if (b <= n - 1) {
                                    for (a = b; a <= n - 1; a++)

                                        System.out.print("  ");
                                }

                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 96) + " ");
                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 96) + " ");

                                b++;
                                System.out.println(" ");
                            }

                            b = 1;
                            while (b <= n) {

                                for (a = b; a >= 1; a--)
                                    System.out.print("  ");


                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 96) + " ");
                                for (a = 1; a <= n; a++)
                                    System.out.print((char) (a + 96) + " ");
                                b++;
                                System.out.println(" ");
                            }
                            System.out.println("\n\n");
                        }
                    }

            }

    }
}


// -_-Phew! End of the code



//https://replit.com/@Max122/PatternPrintingProgram?embed=|&output=|#Main.java