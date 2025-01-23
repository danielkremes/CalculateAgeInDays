import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
         * - PT-BR
         * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
         * dias
         * e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês
         * com 30.
         * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         *
         * - EN-US
         * Make an algorithm that reads a person's age expressed in years, months, and
         * days and show it expressed in days. Take into account the year with 365 days
         * and the month with 30. (Ex: 3 years, 2 months and 15 days = 1170 days.)
         */

        String name = JOptionPane.showInputDialog(null, "Enter your name please");
        String age = JOptionPane.showInputDialog(null, "Enter your age");
        String monthsCurrent = JOptionPane.showInputDialog(null, "Enter your month");
        String days = JOptionPane.showInputDialog(null, "Enter your days");

        /* Conversion for adjust type variables */
        int ageUserSystem = Integer.parseInt(age);
        int monthsCurrentUserSystem = Integer.parseInt(monthsCurrent);
        int daysUserSystem = Integer.parseInt(days);

        /* Transformations */
        int quantityTimeLife = (ageUserSystem * 365);
        quantityTimeLife = quantityTimeLife + (monthsCurrentUserSystem * 30);
        quantityTimeLife = quantityTimeLife + daysUserSystem;

        JOptionPane.showMessageDialog(null, name + " you have " + quantityTimeLife + " days");
    }
}