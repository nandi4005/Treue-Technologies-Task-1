import java.util.Scanner;

class MovieRecomendationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("WELCOME TO MOVIE RECOMENDATION SYSTEM");
        System.out.println("=============================================");
        System.out.println("Select the language");
        System.out.println("1.TELUGU");
        System.out.println("2.HINDI");
        System.out.println("3.TAMIL");
        System.out.println("4.ENGLISH");
        System.out.println("5.KANADA");
        int language = input.nextInt();
        if (language == 1) {
            System.out.println("Your selected language is TELUGU");
            System.out.println("Select the Genres");
            System.out.println("1.COMEDY");
            System.out.println("2.SCIENCE-FICTION");
            System.out.println("3.THRILLER");
            System.out.println("4.ACTION");
            System.out.println("5.ROMANCE");
            int genre1 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (genre1 == 1) {
                System.out.println("1.DOOKUDU");
                System.out.println("2.KHALEJA");
                System.out.println("3.POKIRI");
                System.out.println("4.AAGADU");
            } else if (genre1 == 2) {
                System.out.println("1.NAANI");
                System.out.println("2.TIK TIK TIK");
                System.out.println("3.24");
                System.out.println("4.7TH SENSE");

            } else if (genre1 == 3) {
                System.out.println("1.ATHADU");
                System.out.println("2.1 NENOKKADINE");
                System.out.println("3.HIT THE MOVIE");
                System.out.println("4.VEERUPAKSHA");
            } else if (genre1 == 4) {
                System.out.println("1.GUNTUR KAARAM");
                System.out.println("2.POKIRI");
                System.out.println("3.OKKADU");
                System.out.println("4.SARILERU NEEKEVVARU");
                

            } else if (genre1 == 5) {
                System.out.println("1.RAJAKUMARUDU");
                System.out.println("2.BOBBY");
                System.out.println("3.YUVARAJU");
                System.out.println("4.MURARI");

            }
        }
        if (language == 2) {
            System.out.println("Your selected language is HINDI");
            System.out.println("Select the Geners");
            System.out.println("1.COMEDY");
            System.out.println("2.SCIENCE-FICTION");
            System.out.println("3.THRILLER");
            System.out.println("4.ACTION");
            System.out.println("5.ROMANCE");
            int genre2 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (genre2 == 1) {
                System.out.println("1.BHOOL BHOOLAIYAA");
                System.out.println("2.CHICHORE");
                System.out.println("3.DHAMAAL");
                System.out.println("4.CHUP CHUP KE");
            } else if (genre2 == 2) {
                System.out.println("1.KOI MIL GAYA");
                System.out.println("2.RA ONE");
                System.out.println("3.KRISHH 3");
                System.out.println("4.PK");

            } else if (genre2 == 3) {
                System.out.println("1.UGLY");
                System.out.println("2.DRISHYAM");
                System.out.println("3.BATLA HOUSE");
                System.out.println("4.GUILTY");
            } else if (genre2 == 4) {
                System.out.println("1.PATHAAN");
                System.out.println("2.JAWAN");
                System.out.println("3.GAJINI");
                System.out.println("4.SOORYAVANSHI");

            } else if (genre2 == 5) {
                System.out.println("1.Kabhi Khushi Kabhie Gham");
                System.out.println("2.Ae Dil Hai Mushkil");
                System.out.println("Satyaprem Ki Katha");
                System.out.println("4.Tu Jhoothi Main Makkaar");

            }
        }
        if (language == 3) {
  
            System.out.println("Your selected language is TAMIL");
            System.out.println("Select the Geners");
            System.out.println("1.COMEDY");
            System.out.println("2.SCIENCE-FICTION");
            System.out.println("3.THRILLER");
            System.out.println("4.ACTION");
            System.out.println("5.ROMANCE");
            int genre3 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (genre3 == 1) {
                System.out.println("1.DOCTOR");
                System.out.println("2.COMALI");
                System.out.println("3.BEAST");
                System.out.println("4.JEANS");
            } else if (genre3 == 2) {
                System.out.println("1.TIK TIK TIK");
                System.out.println("2.ROBO 2.O");
                System.out.println("3.MAANADU");
                System.out.println("4.24");

            } else if (genre3 == 3) {
                System.out.println("1.GAME OVER");
                System.out.println("2.KHAITHI");
                System.out.println("3.VIKRAM");
                System.out.println("4.KOLAI");
            } else if (genre3 == 4) {
                System.out.println("1.JAILER");
                System.out.println("2.MERSAL");
                System.out.println("3.VALIMAI");
                System.out.println("4.VIKRAM");

            } else if (genre3 == 5) {
                System.out.println("1.96");
                System.out.println("2.RAJA RANI");
                System.out.println("3.ROJA");
                System.out.println("4.3");

            }
        }
        if (language == 4) {
            System.out.println("Your selected language is ENGLISH");
            System.out.println("Select the Geners");
            System.out.println("1.COMEDY");
            System.out.println("2.SCIENCE-FICTION");
            System.out.println("3.THRILLER");
            System.out.println("4.ACTION");
            System.out.println("5.ROMANCE");
            int genre4 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (genre4 == 1) {
                System.out.println("1.SUPERBAD");
                System.out.println("2.LOGAN LUCKY");
                System.out.println("3.OLD SCHOOL");
                System.out.println("4.LOST CITY");
            } else if (genre4 == 2) {
                System.out.println("1.DUNE");
                System.out.println("2.INCEPTION");
                System.out.println("3.THE MATRIK");
                System.out.println("4.ALIEN");

            } else if (genre4 == 3) {
                System.out.println("1.PRISONERS");
                System.out.println("2.OLD BOY");
                System.out.println("3.ZODIAC");
                System.out.println("4.65");
            } else if (genre4 == 4) {
                System.out.println("1.TENET");
                System.out.println("2.FAST X");
                System.out.println("3.EXTRACTION 2");
                System.out.println("4.AVATAR");

            } else if (genre4 == 5) {
                System.out.println("1.TITANIC");
                System.out.println("2.THE LOVE");
                System.out.println("3.GHOST");
                System.out.println("4.LA LA LAND");

            }
        }
        if (language == 5) {
            System.out.println("Your selected language is KANADA");
            System.out.println("Select the Geners");
            System.out.println("1.COMEDY");
            System.out.println("2.SCIENCE-FICTION");
            System.out.println("3.THRILLER");
            System.out.println("4.ACTION");
            System.out.println("5.ROMANCE");
            int genre5 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (genre5 == 1) {
                System.out.println("1.Avane Srimannarayana");
                System.out.println("2.Hostel Hudugaru Bekagiddare");
                System.out.println("3.LUCKY");
                System.out.println("4.ROBERT");
            } else if (genre5 == 2) {
                System.out.println("1.TORA TORA");
                System.out.println("2.HOLLYWOOD");
                System.out.println("3.DARPANA");
                System.out.println("4.DR.56");

            } else if (genre5 == 3) {
                System.out.println("1.KANTARA");
                System.out.println("2.VIKRANT RONA");
                System.out.println("3.U TURN");
                System.out.println("4.VEDHA");
            } else if (genre5 == 4) {
                System.out.println("1.KGF");
                System.out.println("2.KGF 2");
                System.out.println("3.KABZAA");
                System.out.println("4.KRANTI");

            } else if (genre5 == 5) {
                System.out.println("1.LIA");
                System.out.println("2.LOVE MOCKTAIL");
                System.out.println("3.ORU ADAAR LOVE");
                System.out.println("4.GOOGLY");

            }
        }
    }
}