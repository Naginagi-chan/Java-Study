class Exe{
    void main()
    {
        Student s =new Student();
        s.name="Gill Dong";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("name:"+s.name);
        System.out.println("total:"+s.getTotal());
        System.out.println("average:"+s.getAverage());
    }
}


class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}