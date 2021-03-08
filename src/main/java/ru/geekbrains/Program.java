package ru.geekbrains;

public class Program {

    public static void main(String[] args) {
        Employer[] employers = new Employer[]{
                new Employer("Иванов Сергей Олегович", "Консультант", "test1@test.ru", "89552221122", 100000.00F, (short) 23),
                new Employer("Васильев Олег Сергеевич", "Менеджер", "test2@test.ru", "89553421122", 150000.00F, (short) 42),
                new Employer("Атнонов Виталий Олегович", "Продавец", "test3@test.ru", "89234221122", 120000.00F, (short) 40),
                new Employer("Витальев Сергей Антонович", "Лаборант", "test4@test.ru", "89552261122", 110000.00F, (short) 18),
                new Employer("Олегов Сергей Витальевич", "Генеральный директор", "test5@test.ru", "89552331122", 200000.00F, (short) 65)
        };

        for (Employer employer : employers) {
            if (employer.getAge() > 40) {
                System.out.println(employer.getInfo() + "\n\n");
            }
        }
    }
}

