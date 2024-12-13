package pkg;
import java.util.Scanner;
import java.util.Random;

public class Spiderman {
    private String actor;
    private int age;
    private String villain;

    public Spiderman() {
        this.actor = "Unknown";
        this.age = 0;
        this.villain = "Unknown";
    }

    public Spiderman(String actor) {
        this.actor = actor;
        this.age = 0;
        this.villain = "Unknown";
    }

    public Spiderman(int age) {
        this.actor = "Unknown";
        this.age = age;
        this.villain = "Unknown";
    }

    public Spiderman(String actor, int age) {
        this.actor = actor;
        this.age = age;
        this.villain = "Unknown";
    }

    public Spiderman(String actor, int age, String villain) {
        this.actor = actor;
        this.age = age;
        this.villain = villain;
    }

    public String getActor() {
        return actor;
    }

    public int getAge() {
        return age;
    }

    public String getVillain() {
        return villain;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVillain(String villain) {
        this.villain = villain;
    }

    public void fight() {
        System.out.println(actor + ", aged " + age + ", fights " + villain + "!");
    }

    public void printArt() {
        System.out.println("           :              ");
        System.out.println("           ;              ");
        System.out.println("          :               ");
        System.out.println("          ;               ");
        System.out.println("         /                ");
        System.out.println("       o/                 ");
        System.out.println("     ._/\\___,             ");
        System.out.println("         \\                ");
        System.out.println("         /                ");
    }
}
