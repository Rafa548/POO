package Aula4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] input = readin();
        int limitdays = maxdaysinmonth(input);
        printCalendar(input, limitdays);
    }

    public static int[] readin() {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        do {
            System.out.println(
                    "Introduza o dia da semana em que começa o mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo).");
            data[0] = sc.nextInt();
        } while (data[0] < 1 || data[0] > 7);
        if (data[0] == 7) {
            data[0] = 0;
        }
        do {
            System.out.println("Introduza o mês (1-12)");
            data[1] = sc.nextInt();
        } while (data[1] < 1 || data[1] > 12);
        do {
            System.out.println("Introduza o ano");
            data[2] = sc.nextInt();
        } while (data[2] < 1);
        sc.close();
        return data;
    }

    public static int maxdaysinmonth(int[] data) {
        int limitdays;
        switch (data[1]) {
            case 2:
                if (data[2] % 100 == 0) {
                    if (data[2] % 400 == 0) {
                        limitdays = 29;
                    } else {
                        limitdays = 28;
                    }
                } else {
                    if (data[2] % 4 == 0) {
                        limitdays = 29;
                    } else {
                        limitdays = 28;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                limitdays = 30;
                break;

            default:
                limitdays = 31;
                break;
        }
        return limitdays;
    }

    public static String centerString(int[] data, int spacereserve) {
        String[] month = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        String centeredString = "", words = month[data[1] - 1] + " " + String.valueOf(data[2]);
        int spacesbyside, sizeofwords = words.length();
        spacesbyside = (spacereserve - sizeofwords) / 2;
        for (int i = 0; i <= spacesbyside; i++) {
            centeredString += " ";
        }
        centeredString += words;
        return centeredString;
    }

    public static void printCalendar(int[] data, int limit) {
        System.out.println(limit);
        System.out.printf("%s\n", centerString(data, 20));
        ;

        System.out.println(" Su Mo Tu We Th Fr Sa");

        for (int i = 0; i <= limit + data[0] - 1; i++) {
            if (i >= data[0]) {
                if ((i + 1) % 7 == 0) {
                    System.out.printf("%3s\n", i - data[0] + 1);
                } else {
                    System.out.printf("%3s", i - data[0] + 1);
                }
            } else {
                System.out.printf("%3s", "");
            }
        }
    }
}

/*
 * Este codigo é o antigo, o para avaliar é o de cima:
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
 * int[] input = readin();
 * int[][] testpurposes = dataproccess(input);
 * for(int i = 0; i<testpurposes.length; i++){
 * for(int j = 0; j<testpurposes[i].length; j++){
 * System.out.printf("%s e %s : ", i, j);
 * System.out.println(testpurposes[i][j]);
 * }
 * }
 * showcalendar(testpurposes);
 * }
 * public static int[] readin(){
 * Scanner sc = new Scanner(System.in);
 * int[] data = new int[3];
 * do {
 * System.out.
 * println("Introduza o dia da semana em que começa o mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)."
 * );
 * data[0] = sc.nextInt();
 * } while (data[0] < 1 || data[0] > 7);
 * do {
 * System.out.println("Introduza o mês (1-12)" );
 * data[1] = sc.nextInt();
 * } while (data[1] < 1 || data[1] > 12);
 * do {
 * System.out.println("Introduza o ano" );
 * data[2] = sc.nextInt();
 * } while (data[2] < 1 );
 * sc.close();
 * return data;
 * }
 * public static int[][] dataproccess(int[] data) {
 * int[][] finaldata = new int[7][];
 * finaldata[0] = new int[]{data[1], data[2]};
 * for(int i = 1; i<finaldata.length; i++){
 * finaldata[i] = new int[7];
 * if (data[0] != 7){
 * for(int j = 0; j<finaldata[i].length; j++){
 * finaldata[i][j] = 1 - data[0] + j;
 * }
 * } else {
 * for(int j = 0; j<finaldata[i].length; j++){
 * finaldata[i][j] = 8 - data[0] + j;
 * }
 * }
 * }
 * return finaldata;
 * }
 * public static void showcalendar(int[][] data) {
 * String[] month = new
 * String[]{"January","February","March","April","May","June","July","August",
 * "September","October","November","December"};
 * int limitdays;
 * switch (data[0][0]) {
 * case 2:
 * if (data[0][1] % 100 == 0) {
 * if(data[0][1] % 400 == 0){
 * limitdays = 29;
 * } else {
 * limitdays = 28;
 * }
 * } else {
 * if(data[0][1] % 4 == 0){
 * limitdays = 29;
 * } else {
 * limitdays = 28;
 * }
 * }
 * break;
 * case 4:
 * case 6:
 * case 9:
 * case 11:
 * limitdays = 30;
 * break;
 * 
 * default:
 * limitdays = 31;
 * break;
 * }
 * System.out.println(limitdays);
 * System.out.printf("%14s %2s\n", month[data[0][0]-1], data[0][1]);
 * System.out.println(" Su Mo Tu We Th Fr Sa");
 * for (int i = 1; i < data.length; i++) {
 * for (int j = 0; j < data[i].length; j++) {
 * if(data[i][j]+(7*(i-1)) > 0 && data[i][j]+(7*(i-1)) <= limitdays){
 * if(j == 6){
 * System.out.printf("%3s\n", data[i][j]+(7*(i-1)));
 * } else {
 * System.out.printf("%3s", data[i][j]+(7*(i-1)));
 * }
 * } else {
 * if(j == 6){
 * System.out.printf("%3s\n", "");
 * } else {
 * System.out.printf("%3s", "");
 * }
 * }
 * }
 * }
 * }
 * }
 */