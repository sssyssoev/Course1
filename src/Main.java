public class Main {
    public static int size = 0;

    public static Emp[] emps = new Emp[10];

    public static void main(String[] args) {

        int totalSalary = 0;
        int minSalary = 0;
        int maxSalary = 0;
        float meanSalary = 0.0f;


        empInput();
        employeeDataPrint();
        totalSalary=salary();
        meanSalaryCount(totalSalary);
        minSalaryCount();
        maxSalaryCount();
    }

    public static int empInput() {

        emps[0] = new Emp("Сергеев", "Сергей", "Сергеевич", 2, 2005, size);

        size++;

        emps[1] = new Emp("Петров", "Петр", "Петрович", 3, 3004, size);

        size++;

        emps[2] = new Emp("Сидоров ", "Сидор", "Сидорович", 4, 4010, size);

        size++;

        emps[3] = new Emp("Кириллов", "Кирилл", "Кириллович", 5, 4090, size);

        size++;

        emps[4] = new Emp("Матвеев", "Матвей", "Матвеевич", 1, 1001, size);

        size++;

        emps[5] = new Emp("Юрьев", "Юрий", "Юрьевич", 2, 2300, size);

        size++;

        emps[6] = new Emp("Романов", "Роман", "Романович", 3, 3700, size);

        size++;

        emps[7] = new Emp("Кондратьев", "Кондратий", "Кондратьевич", 4, 4015, size);

        size++;

        emps[8] = new Emp("Алексеев", "Алексей", "Алексеевич", 5, 5700, size);

        size++;

        emps[9] = new Emp("Евсеев", "Евсей", "Евсеевич", 5, 5050, size);

        return size;
    }

    public static void employeeDataPrint() {
        // Печать всех сотрудников с данными

        for (int i = 0; i <= size; i++) {
            System.out.println("i   =" + i);
            System.out.println(emps[i].toString());
        }
    }

    public static int salary() {
        // Вычисление суммы затрат на зарплаты
        int totalSalary = 0;


        for (int i = 0; i <= size; i++) {
            totalSalary = totalSalary + emps[i].salary;

        } return totalSalary;
    }
        public static float meanSalaryCount (int totalSalary) {

        float meanSalary;
        meanSalary = totalSalary / (size + 1);
        System.out.println(" Сумма затрат на зарплату: " + totalSalary + "  руб.");
        System.out.println(" Средняя зарплата: " + meanSalary + "  руб.");
        return meanSalary;
    }
        public static void minSalaryCount(){
        // поиск минимальной зарплаты
        int minSalary = emps[0].salary;
        for (int i = 1; i <= size; i++) {
            if (emps[i].salary < minSalary) {
                minSalary = emps[i].salary;
            }

        }
        System.out.println(" Минимальная зарплата: " + minSalary + "  руб.");
    }
        public static void maxSalaryCount () {
            // поиск максимальной зарплаты
            int maxSalary = emps[0].salary;
            for (int i = 1; i <= size; i++) {
                if (emps[i].salary > maxSalary) {
                    maxSalary = emps[i].salary;
                }
                ;
            }
            System.out.println(" Максимальная зарплата: " + maxSalary + "  руб.");
        }
    }






