package Homework6;

class Cat extends Animal {

    protected boolean sweem;


//konstruktor Cat

    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + "\n Run: " + run+ " meters" + "\n Sweem:" + sweem + "\n Jump: " +jump+ " meters");
    }
}
