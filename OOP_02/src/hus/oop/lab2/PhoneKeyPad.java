package hus.oop.lab2;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.toLowerCase();
        char ip = input.charAt(0);

        switch (ip) {
            case 'a':
                case 'b':
                    case 'c':
                        System.out.println("2");
                        break;
                        case 'd':
                            case 'e':
                                case 'f':
                                    System.out.println("3");
                                    break;
                                    case 'g':
                                        case 'h':
                                            case 'i':
                                                System.out.println("4");
                                                break;
                                                case 'j':
                                                    case 'k':
                                                        case 'l':
                                                            case 'm':
                                                                System.out.println("5");
                                                                break;
                                                                case 'n':
                                                                    case 'o':
                                                                        case 'p':
                                                                            System.out.println("6");
                                                                            break;
                                                                            case 'q':
                                                                                case 'r':
                                                                                    case 's':
                                                                                        System.out.println("7");
                                                                                        break;
                                                                                        case 't':
                                                                                            case 'u':
                                                                                                case 'v':
                                                                                                System.out.println("8");
                                                                                                break;

                                                                                                    case 'w':
                                                                                                        case 'x':
                                                                                                            case 'y':
                                                                                                                case 'z':
                                                                                                                    System.out.println("9");



        }
    }
}
