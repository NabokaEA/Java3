package Lesson5;

public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " закончил этап: " + description);
            if (this.length==40 & c.getRace().getWinner()==null){
                c.getRace().setWinner(c);
                System.out.println(c.getName() + " ПО-БЕ-ДИЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛ !!!!!!!!!!!!!!!!!!!!!!!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
