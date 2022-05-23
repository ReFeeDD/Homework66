package Homework6;

class Dog extends Animal {


    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + "\n Run: " + run+ "  meters" + " \n Sweem:" + sweem + "  \n Jump: " +jump+ " meters");
    }
}
