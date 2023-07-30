public class Main {
    public   int size = 0;

    public   Emp[] emps = new Emp[10];

    public  void main(String[] args) {

        emps[0] = new Emp("Сергеев", "Сергей", "Сергеевич", 2, 2000, size);
        System.out.println(emps[0].toString());
        size++;

        emps[1] = new Emp("Петров", "Петр", "Петрович", 3, 3000, size);
        System.out.println(emps[1].toString());
        size++;

        emps[2] = new Emp("Сидоров ", "Сидор", "Сидорович", 4, 4000, size);
        System.out.println(emps[2].toString());
        size++;

        emps[3] = new Emp("Кириллов", "Кирилл", "Кириллович", 5, 5000, size);
        System.out.println(emps[3].toString());
        size++;

        emps[4] = new Emp("Матвеев", "Матвей", "Матвеевич", 1, 1000, size);
        System.out.println(emps[4].toString());
        size++;

        emps[5] = new Emp("Юрьев", "Юрий", "Юрьевич", 2, 2000, size);
        System.out.println(emps[5].toString());
        size++;

        emps[6] = new Emp("Романов", "Роман", "Романович", 3, 3000, size);
        System.out.println(emps[6].toString());
        size++;

        emps[7] = new Emp("Кондратьев", "Кондратий", "Кондратьевич", 4, 4000, size);
        System.out.println(emps[7].toString());
        size++;

        emps[8] = new Emp("Алексеев", "Алексей", "Алексеевич", 5, 5000, size);
        System.out.println(emps[8].toString());
        size++;

        emps[9] = new Emp("Евсеев", "Евсей", "Евсеевич", 5, 5000, size);
        System.out.println(emps[9].toString());


        for (int i = 0; i < size; i++) {
            System.out.println("i   =" + i);
            System.out.println(emps[i].toString());
        }



    }



}



