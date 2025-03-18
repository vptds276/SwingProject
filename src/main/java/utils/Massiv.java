/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author директор
 */
public class Massiv {

    private static int[] mas_1 = null;
    private static int[][] mas_2 = null;
    private static int count_i;
    private static int count_j;
    

    public static int[] generate1(int count_elem, int beg_diap, int end_diap) {
        mas_1 = new int[count_elem];
        for (int i = 0; i < mas_1.length; i++) {
            mas_1[i] = (int) (Math.random() * (end_diap - beg_diap + 1) + beg_diap);
        }
        return mas_1;
    }

    public static int[][] generate2(int count_i, int count_j, int beg_diap, int end_diap) {
        Massiv.count_i = count_i;
        Massiv.count_j = count_j;
        
        mas_2 = new int[count_i][count_j];
        for (int i = 0; i < count_i; i++) {
            
            for (int j = 0; j < count_j; j++) {
                mas_2[i][j] = (int) (Math.random() * (end_diap - beg_diap + 1) + beg_diap);
            }
            
        }
        return mas_2;
    }

    public static void outputMassiv(int razm) {
        switch (razm) {
            case 1:
                for (int i = 0; i < mas_1.length; i++) {
                    System.out.print(mas_1[i] + " ");
                }
                System.out.println();
                break;
            case 2:
                for (int i = 0; i < Massiv.count_i; i++) {
                    for (int j = 0; j < Massiv.count_j; j++) {
                        System.out.print(mas_2[i][j]+"\t");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("не верный выбор. либо 1 либо 2");
                break;
        }
    }
    

    
    
    
    
}

