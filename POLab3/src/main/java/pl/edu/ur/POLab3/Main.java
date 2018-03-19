/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Tomasz
 */
import java.lang.String;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        
        Scanner s=new Scanner(System.in);
        int z,l,p,m;
        while(true){
        System.out.println("Podaj numer zadania :");
        System.out.println("1 -1.4,2 -1.7,3 -2.2,4 -3.3,5 -3.4");
        z =s.nextInt();
        //1.4
        if (z==1){
            System.out.println("Podaj liczbe:");
            l=s.nextInt();
            System.out.println("Podaj o ile miejsc chcesz przesunąć:");
            m=s.nextInt();
            System.out.println("Które przesunięcie chcesz wykonać:");
            System.out.println("W prawo: 1- ze znakiem >>, 2-bez znaku >>>");
            System.out.println("W lewo: 3- ze znakiem << ");
            p=s.nextInt();
            switch(p){
                default:
                    System.out.println("Błędny wybór");
                    break;
                case 1:
                    l=l>>m;
                    System.out.println("Wynik: " +l);
                    break;
                case 2:
                    l=l>>>m;
                    System.out.println("Wynik: " +l);
                    break;
                case 3:
                    l=l<<m;
                    System.out.println("Wynik: " +l);
                    break;        
            }      
        } 
        //1.7
        if(z==2){
            System.out.println("Podaj wartość logiczną X: (true/false) ");
            boolean x=s.nextBoolean();
            System.out.println("Podaj wartość logiczną Y: (true/false) ");
            boolean y=s.nextBoolean();
            
             System.out.println("NOT  !X= "+(!x));
             System.out.println("NOT  !Y= "+(!y));
             System.out.println("XOR   X^Y= "+(x^y));
             System.out.println("XOR   Y^X= "+(y^x));
            }
        //2.2
        if(z==3){
            //char[] toCharArray()-wyświetla ciąg znaków jako tablice znaków.
            String tekst = "Laboratorium numer 3 ,punkt 1 ";
            char[] tablica = new char[tekst.length()];
            tablica=tekst.toCharArray();
            System.out.println(" 1- " +tekst);
            //byte[] getBytes()-koduje ciąg bajtów przechowując go w tablicy.
            String tekst2 = "Punkt 2 ";
            byte[] tablica2 = new byte[tekst2.length()];
            tablica2=tekst2.getBytes(); 
            System.out.println(" 2- " +tekst2);
            //boolean equals(String str)-porównuje ciąg do danego obiektu.
            String tekst31 = "Punkt 3 ";
            String tekst32 = "Punkt 3 ";
            boolean retVal;
            retVal = tekst31.equals( tekst32 );
            System.out.println("3- Returned Value = " + retVal );
            //boolean equalsIgnoreCase(String str)-porównuje dwa ciągi ignorując 
            //podobne ciągi znaków.
            String tekst4 = "PUNKT 4 ";
            retVal = tekst31.equals( tekst4 );
            System.out.println("4- Returned Value = " + retVal );
            //int campareTo(String str)-porównuje ciąg do obiektu typu String
            String tekst51 = "PUNKT 5 ";
            String tekst52 = "Punkt 5,laboratorium numer 3 ";
            int wynik = tekst51.compareTo( tekst52 );
            System.out.println("5- " +wynik);
            //int campareToIgnoreCase(String str)-porównuje dwa łańcuchy, 
            //ignorując wielkości liter.
            String tekst6 = "punkt 5";
            int wynik2 = tekst51.compareToIgnoreCase( tekst6 );
            System.out.println("6- " +wynik2);
            /*int indexOf(int i)-zwraca  indeks,podanej, ostatniej występującej liczby */
            String tekst7 = "Punkt,punkt,punkt 7";
            System.out.print("7- Znaleziony index:" );
            System.out.println(tekst7.indexOf( 'u', 5 ));
            //int indexOf(String str)-zwraca indeks liczby ostatnio występującej.
            System.out.print("8- Znaleziony index:" );
            System.out.println( tekst7.indexOf( 'n' , 15 ));
            //int lastIndexOf(int i)- zwraca kiedy po raz ostatni występuje podana liczba
            String tekst9 = "Punkt 9";
            System.out.println("ostatnia  9 od lewej to: " +tekst9.lastIndexOf( '9' ));
            /*int lastIndexOf(String str)-zwraca kiedy po raz ostatni występuje 
            podany znak lub ciąg znaków*/
            String tekst10 = "Tomasz Skiba";
            System.out.println("10- " +tekst9.lastIndexOf(tekst10,5));
            //String substring(int startString)-zwraca zawartość od podanego indeksu.
            System.out.println("11- Od 5-tego znaku: "+tekst10.substring(4));
            //String substring(int startString, int stopString)-zwraca wartość 
            //od podanego indeksu do podanego indeksu.
            System.out.println("12- Wyswietlanie od 5-tego znaku do 7-ego: "+tekst10.substring(4,6));
            //String replace(char orginal, char zamiennik)-zamienia podany znak na inny
            System.out.println("13- Zamiana a na i: "+tekst10.replace("a","i"));
            //String trim()-zwraca tekst z usunięciem początkowej i końcowej spacji
            System.out.println("14-" +tekst10.trim());
            //String toLowerCase()-zwraca wszystkie znaki jako małe.
            System.out.println("15-" +tekst10.toLowerCase());
            //String toUpperCase()-zwraca wszystkie znaki jako duże.
            System.out.println("16-" +tekst10.toUpperCase());
            //String[] split(String regex, int limit)-zwraca tekst w postaci tablic
            String tekst16="Tomasz Tomas Toma Tom To T";
            for(String w:tekst16.split("\\s",3)){  
            System.out.println(w);  
            }
            //String[] split(String regex)-zwraca tekst w postaci tablicy.
            for(String w:tekst16.split("\\s")){  
            System.out.println(w);  
            }
            }
        //3.3
        //NIE DOKOŃCZONE
        /*
        if(z==4){
            double pod;
            int wyk;
           public double zadanie41(double pod,int wyk){
        double wynik=1;
        for(int i=0;i<wyk;i++){
            wynik=wynik*podstawa;
        }
        return wynik;


            Scanner b = new Scanner(System.in);
            int c = b.nextInt();
            
            System.out.println("Podaj podstawe potegi:");
            pod=b.nextDouble();
            System.out.println("Podaj wykladnik potegi:");
            wyk=b.nextInt();
            System.out.println("Wybierz metodę: 1-rekurencyjna, 2-iteracyjna");
            switch(c){
                default:
                    System.out.println("Błędny wybór");
                    break;
                case 1:
                    for() 
                        */
            }
        }
        }
