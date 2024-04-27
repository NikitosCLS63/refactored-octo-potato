package org.example;

import java.util.Locale;
import java.util.Scanner;

abstract public class Main {

    public static void main(String[] args) {
        Cemetry cemetery = new Cemetry();
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        int choice;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Показать могилы");
            System.out.println("2. Похоронить обычного человека");
            System.out.println("3. Похоронить крестьянина");
            System.out.println("4. Похоронить короля");
            System.out.println("5. Обновить информацию о могиле");
            System.out.println("6. Удалить могилу");
            System.out.println("7. Получить информацию о местоположении могилы");
            System.out.println("8. Рассчитать стоимость похорон");
            System.out.println("9. Принести подарок для обычного человека");
            System.out.println("10. Принести подарок для крестьянина");
            System.out.println("11. Принести подарок для короля");
            System.out.println("0. Выход");

            choice = in.nextInt();
            switch (choice) {
                case 1: Cemetry.print_grave(); break;
                case 2: cemetery.bury("Колян", "Коленовский", "22.03.123", "22.03.222"); break;
                case 3: cemetery.bury_the_peasant("Толян", "Коленовский", "22.03.123", "22.03.222"); break;
                case 4: cemetery.bury_the_king("Колян", "Королевский", "22.03.123", "22.03.222"); break;
                case 5: cemetery.update_grave(1, "Васек", "Коленовский", "22.03.123", "22.03.222"); break;
                case 6: cemetery.del_grave(1); break;
                case 7: System.out.println(Cemetry.get_grave_location_info("Коленовский", "Новгород", "место 243")); break;
                case 8: System.out.println(Cemetry.calculate_burial_cost("Стандарт", true, true) + " - цена."); break;
                case 9: System.out.println(GiftPrin.to_bring_gifts("Коленовский", "арбуз")); break;
                case 10: System.out.println(GiftPrin.to_bring_gifts_peasant("Коленовский", "дыня")); break;
                case 11: System.out.println(GiftPrin.to_bring_gifts_king("Коленовский", "картошка")); break;
                default:
                    if (choice != 0) {
                        System.out.println("Неверный выбор, попробуйте снова.");
                    }
                    break;
            }
        } while (choice != 0);

        in.close();
    }
}

